package com.sartorelli.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ConfigGUI extends JFrame implements ActionListener, WindowListener {

    protected GameGUI gameGUI;
    protected Button btnBegin, btnSair;
    protected Label lblSubTitle, lblDifficult, lblNome;
    protected Dimension dButton;
    protected JRadioButton jrbEasy, jrbMedium, jrbHard;
    protected ButtonGroup btgDifficult;
    protected JPanel panelDifficult;
    protected TextField txtNome;

    public ConfigGUI() {

        setTitle("Jogo da Velha");
        setLayout(null);
        setResizable(false);
        setSize(400, 425);
        setLocation(400, 200);

        lblSubTitle = new Label("CONFIGURAÇÕES");
        lblSubTitle.setSize(300,50);
        lblSubTitle.setLocation(70, 0);
        lblSubTitle.setForeground(Color.BLACK);
        lblSubTitle.setFont(new Font("Arial", 1, 30));
        add(lblSubTitle);

        lblNome = new Label("Nome o Jogador:");
        lblNome.setSize(300,30);
        lblNome.setLocation(70, 80);
        lblNome.setForeground(Color.BLACK);
        lblNome.setFont(new Font("Arial", 1, 18));
        add(lblNome);

        txtNome = new TextField(null);
        txtNome.setSize(260,20);
        txtNome.setLocation(74,120);
        add(txtNome);

        lblDifficult = new Label("Dificuldade:");
        lblDifficult.setSize(300,50);
        lblDifficult.setLocation(70, 150);
        lblDifficult.setForeground(Color.BLACK);
        lblDifficult.setFont(new Font("Arial", 1, 18));
        add(lblDifficult);

        jrbEasy = new JRadioButton ("Fácil");
        jrbEasy.setSize(50,30);
        jrbMedium = new JRadioButton ("Médio");
        jrbEasy.setSize(50,30);
        jrbHard = new JRadioButton ("Dificil");
        jrbEasy.setSize(50,30);

        btgDifficult = new ButtonGroup();
        btgDifficult.add(jrbEasy);
        btgDifficult.add(jrbMedium);
        btgDifficult.add(jrbHard);

        panelDifficult = new JPanel();
        panelDifficult.setLayout(new GridLayout(3,1));
        panelDifficult.add(jrbEasy);
        panelDifficult.add(jrbMedium);
        panelDifficult.add(jrbHard);
        panelDifficult.setBounds(70,200,200,90);
        add(panelDifficult);

        dButton = new Dimension(101, 30);

        btnBegin = new Button("Começar");
        btnBegin.setSize(dButton);
        btnBegin.setLocation(230, 320);
        btnBegin.setFont(new Font("Arial", 1, 18));
        btnBegin.setBackground(new Color(10, 10, 10));
        btnBegin.setForeground(new Color(237, 237, 237));
        //btnJogar.setIcon(new ImageIcon(getClass().getResource(img)));
        btnBegin.addActionListener(this);
        add(btnBegin);

        btnSair = new Button("Sair");
        btnSair.setSize(dButton);
        btnSair.setLocation(70, 320);
        btnSair.setFont(new Font("Arial", 1, 18));
        btnSair.setBackground(new Color(10, 10, 10));
        btnSair.setForeground(new Color(237, 237, 237));
        //btnJogar.setIcon(new ImageIcon(getClass().getResource(img)));
        btnSair.addActionListener(this);
        add(btnSair);

        addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnBegin) {
            char difficult = '\0';
            if(txtNome.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Digite um nome antes de continuar!");
                return;
            }else if(jrbEasy.isSelected()){
                difficult = 'F';
            }else if(jrbMedium.isSelected()){
                difficult = 'M';
            }else if(jrbHard.isSelected()){
                difficult = 'D';
            }else{
                JOptionPane.showMessageDialog(null, "Escolha um nível de dificuldade!");
                return;
            }
            gameGUI = new GameGUI(difficult, String.valueOf(txtNome.getText()));
            gameGUI.setVisible(true);
            this.setVisible(false);

        }
        if(e.getSource() == btnSair) {
            System.exit(0);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}


