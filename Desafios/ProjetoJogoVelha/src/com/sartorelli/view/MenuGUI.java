package com.sartorelli.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MenuGUI extends JFrame implements ActionListener, WindowListener {

    protected ConfigGUI config;
    protected Button btnJogar, btnSair, btnScore;
    protected Label lblSubTitle;
    protected Dimension dButton;

    public MenuGUI() {

        setTitle("Jogo da Velha");
        setLayout(null);
        setResizable(false);
        setSize(400, 425);
        setLocation(400, 200);

        lblSubTitle = new Label("MENU PRINCIPAL");
        lblSubTitle.setSize(300,50);
        lblSubTitle.setLocation(70, 0);
        lblSubTitle.setForeground(Color.BLACK);
        lblSubTitle.setFont(new Font("Arial", 1, 30));
        add(lblSubTitle);

        dButton = new Dimension(101, 30);

        btnJogar = new Button("Jogar");
        btnJogar.setSize(dButton);
        btnJogar.setLocation(150, 150);
        btnJogar.setFont(new Font("Arial", 1, 18));
        btnJogar.setBackground(new Color(10, 10, 10));
        btnJogar.setForeground(new Color(237, 237, 237));
        //btnJogar.setIcon(new ImageIcon(getClass().getResource(img)));
        btnJogar.addActionListener(this);
        add(btnJogar);

        btnScore = new Button("Score");
        btnScore.setSize(dButton);
        btnScore.setLocation(150, 200);
        btnScore.setFont(new Font("Arial", 1, 18));
        btnScore.setBackground(new Color(10, 10, 10));
        btnScore.setForeground(new Color(237, 237, 237));
        //btnJogar.setIcon(new ImageIcon(getClass().getResource(img)));
        btnScore.addActionListener(this);
        add(btnScore);

        btnSair = new Button("Sair");
        btnSair.setSize(dButton);
        btnSair.setLocation(150, 250);
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
        if(e.getSource() == btnJogar) {
            config = new ConfigGUI();
            config.setVisible(true);
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

