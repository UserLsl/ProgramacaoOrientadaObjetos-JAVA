package com.empresa.projetogerenciarcaixa.view;

import com.empresa.projetogerenciarcaixa.model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CaixaGUI extends JFrame implements ActionListener, WindowListener {

    private Caixa caixa;

    //Atributos (Elementos da Tela)
    protected Dimension dFrame, dLabel, dTextField, dTextArea, dButton;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSaida;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected TextArea txtMsg;

    //Método Construtor
    public CaixaGUI() {

        //Acrescer a instanciação da classe caixa
        caixa = new Caixa();

        //Definindo dimensões dos Elementos
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(300, 240);

        //Definindo aparência da Janela
        setTitle("Controle de Caixa");
        setSize(dFrame);
        setResizable(false);
        setLocation(200, 200);
        setLayout(null);

        //Definindo aparência dos Elementos
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(25,185);
        cmdRetirada.addActionListener(this);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(180,150);
        cmdConsulta.addActionListener(this);

        cmdSaida = new Button("Saida");
        cmdSaida.setSize(dButton);
        cmdSaida.setLocation(180,185);
        cmdSaida.addActionListener(this);
        cmdSaida.addActionListener(this);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);

        //Defindo
        add(lblValor);
        add(lblSaldo);
        add(txtValor);
        add(txtSaldo);
        add(cmdEntrada);
        add(cmdRetirada);
        add(cmdConsulta);
        add(cmdSaida);
        add(txtMsg);

        addWindowListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cmdSaida) {
            System.exit(0);
        }

        if(e.getSource() == cmdEntrada) {
            //Fazer um depósito
            double valor = Double.parseDouble(txtValor.getText());
            boolean deuCerto = caixa.depositar(valor);
            if(deuCerto) {
                txtMsg.append("Depósito efetuado com sucesso! \n");
            }else{
                txtMsg.append("Valor inválido para depósito! \n");
            }
            txtValor.setText(null);
            txtValor.requestFocus(); //Coloca o foco no controle
        }

        if(e.getSource() == cmdRetirada) {
            //Fazer um saque
            double valor = Double.parseDouble(txtValor.getText());
            boolean deuCerto = caixa.sacar(valor);
            if(deuCerto) {
                txtMsg.append("Saque efetuado com sucesso! \n");
            }else{
                txtMsg.append("Não há saldo sufuciente! \n");
            }
            txtValor.setText(null);
            txtValor.requestFocus(); //Coloca o foco no controle
        }

        if(e.getSource() == cmdConsulta) {
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
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
