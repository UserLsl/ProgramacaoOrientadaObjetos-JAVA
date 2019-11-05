package com.sartorelli.view;

import com.sartorelli.ManageGame;
import com.sartorelli.model.Computer;
import com.sartorelli.model.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GameGUI extends JFrame implements ActionListener, WindowListener {
    protected Game game;
    protected Computer ia;
    protected JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    protected Button btnVoltar;
    protected Label lblSubTitle, lblPlayer, lblRound, lblMsg;
    protected Dimension dButton;
    protected String name;
    protected char difficult;

    public GameGUI(char difficult,String name) {
        game = new Game();
        ia = new Computer();
        setTitle("Jogo da Velha");
        setLayout(null);
        setResizable(false);
        setSize(400, 425);
        setLocation(400, 200);
        this.difficult = difficult;
        this.name = name;

        lblSubTitle = new Label("JOGO DA VELHA");
        lblSubTitle.setSize(250,50);
        lblSubTitle.setLocation(75, 0);
        lblSubTitle.setForeground(Color.BLACK);
        lblSubTitle.setFont(new Font("Arial", 1, 30));
        add(lblSubTitle);

        lblPlayer = new Label("Vez de: " + this.name);
        lblPlayer.setSize(150,50);
        lblPlayer.setLocation(50, 350);
        add(lblPlayer);

        lblRound = new Label("Rodada " + game.getRound());
        lblRound.setSize(100,50);
        lblRound.setLocation(290, 350);
        add(lblRound);

        lblMsg = new Label("");
        lblMsg.setSize(198,50);
        lblMsg.setLocation(48, 350);
        lblMsg.setVisible(false);
        lblMsg.setFont(new Font("Arial", 1, 15));
        add(lblMsg);

        btnVoltar = new Button("Voltar");
        btnVoltar.setSize(101, 30);
        btnVoltar.setLocation(250, 360);
        btnVoltar.setFont(new Font("Arial", 1, 18));
        btnVoltar.setBackground(new Color(10, 10, 10));
        btnVoltar.setForeground(new Color(237, 237, 237));
        btnVoltar.setVisible(false);
        btnVoltar.addActionListener(this);
        add(btnVoltar);

        dButton = new Dimension(101, 100);
        this.buttonsManage(button1,50,50,"btn3.png");
        this.buttonsManage(button2,150,50,"btn2.png");
        this.buttonsManage(button3,250,50,"btn3.png");
        this.buttonsManage(button4,50,150,"btn4.png");
        this.buttonsManage(button5,150,150,"btn1.png");
        this.buttonsManage(button6,250,150,"btn4.png");
        this.buttonsManage(button7,50,250,"btn3.png");
        this.buttonsManage(button8,150,250,"btn2.png");
        this.buttonsManage(button9,250,250,"btn3.png");

        addWindowListener(this);
    }

    public void endGame(String symbolWin) {
        if(this.game.getStatus() == 'F'){
            if(symbolWin == "o"){
                lblMsg.setForeground(Color.BLUE);
                lblMsg.setText("COMPUTADOR GANHOU!");
            }else{
                lblMsg.setForeground(Color.red);
                lblMsg.setText(this.name.toUpperCase() + " GANHOU!");
            }
        }else{
            lblMsg.setForeground(Color.GREEN);
            lblMsg.setText("EMPATOU!");
        }
        lblPlayer.setText("");
        lblMsg.setVisible(true);
        lblPlayer.setVisible(false);
        lblRound.setVisible(false);
        btnVoltar.setVisible(true);
    }

    public void buttonsManage(JButton btn, int x, int y, String img) {
        btn.setSize(dButton);
        btn.setLocation(x,y);
        btn.setIcon(new ImageIcon(getClass().getResource(img)));
        btn.addActionListener(this);
        add(btn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(lblPlayer.getText().equalsIgnoreCase("Vez de: " + this.name)) {
            if(e.getSource() == button1) { this.buttonsAction(button1,1,1,"btnx3.png","x"); }
            if(e.getSource() == button2) { this.buttonsAction(button2,1,2,"btnx2.png","x"); }
            if(e.getSource() == button3) { this.buttonsAction(button3,1,3,"btnx3.png","x"); }
            if(e.getSource() == button4) { this.buttonsAction(button4,2,1,"btnx4.png","x"); }
            if(e.getSource() == button5) { this.buttonsAction(button5,2,2,"btnx1.png","x"); }
            if(e.getSource() == button6) { this.buttonsAction(button6,2,3,"btnx4.png","x"); }
            if(e.getSource() == button7) { this.buttonsAction(button7,3,1,"btnx3.png","x"); }
            if(e.getSource() == button8) { this.buttonsAction(button8,3,2,"btnx2.png","x"); }
            if(e.getSource() == button9) { this.buttonsAction(button9,3,3,"btnx3.png","x"); }
        }
        if(e.getSource() == btnVoltar) {
            this.setVisible(false);
            MenuGUI menu = new MenuGUI();
            menu.setVisible(true);
        }
    }

    public void buttonsAction(JButton btn, int row, int column, String img, String playerSymbol) {
        if(game.checkPosition(row,column)){
            btn.setIcon(new ImageIcon(getClass().getResource(img)));
            game.addToTable(playerSymbol, row,column);

            game.printPositions(); //Conferência

            if(game.getStatus() == 'F' || game.getStatus() == 'E') {
                this.endGame(playerSymbol);
            }else{
                lblRound.setText("Rodada " + game.getRound());
                if(playerSymbol == "x") {
                    lblPlayer.setText("Vez de: Computador");
                    this.computerAction();
                }else{
                    lblPlayer.setText("Vez de: " + this.name);
                }
            }
        }
    }

    public void computerAction() {
        System.out.println("opa");
        ia.takeDecision(this.game, this.difficult);

        switch (ia.getxPosition()) {
            case 1:
                switch (ia.getyPosition()) {
                    case 1: buttonsAction(button1, 1,1,"btno3.png", "o");
                        break;
                    case 2: buttonsAction(button2, 1,2,"btno2.png", "o");
                        break;
                    case 3: buttonsAction(button3, 1,3,"btno3.png", "o");
                        break;
                }
                break;
            case 2:
                switch (ia.getyPosition()) {
                    case 1: buttonsAction(button4, 2,1,"btno4.png", "o");
                        break;
                    case 2: buttonsAction(button5, 2,2,"btno1.png", "o");
                        break;
                    case 3: buttonsAction(button6, 2,3,"btno4.png", "o");
                        break;
                }
                break;
            case 3:
                switch (ia.getyPosition()) {
                    case 1: buttonsAction(button7, 3,1,"btno3.png", "o");
                        break;
                    case 2: buttonsAction(button8, 3,2,"btno2.png", "o");
                        break;
                    case 3: buttonsAction(button9, 3,3,"btno3.png", "o");
                        break;
                }
                break;
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
