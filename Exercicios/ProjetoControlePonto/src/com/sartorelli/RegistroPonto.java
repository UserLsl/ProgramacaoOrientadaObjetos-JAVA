package com.sartorelli;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class RegistroPonto {

    //Atributos
    private int idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;

    //Getters and Setters
    public int getIdRegPonto() { return idRegPonto; }
    public void setIdRegPonto(int idRegPonto) { this.idRegPonto = idRegPonto; }
    public Funcionario getFunc() { return func; }
    public void setFunc(Funcionario func) { this.func = func; }
    public LocalDate getDataRegistro() { return dataRegistro; }
    public void setDataRegistro(LocalDate dataRegistro) { this.dataRegistro = dataRegistro; }
    public LocalDateTime getHoraEntrada() { return horaEntrada; }
    public void setHoraEntrada(LocalDateTime horaEntrada) { this.horaEntrada = horaEntrada; }
    public LocalDateTime getHoraSaida() { return horaSaida; }
    public void setHoraSaida(LocalDateTime horaSaida) { this.horaSaida = horaSaida; }

    //Método Construtor
    public RegistroPonto(int idRegPonto, Funcionario func, LocalDate dataRegistro, LocalDateTime horaEntrada, LocalDateTime horaSaida){
        this.idRegPonto = idRegPonto;
        this.func = func;
        this.dataRegistro = dataRegistro;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    //Métodos Específicos
    public String apresentarRegistroPonto() {
        StringBuffer text = new StringBuffer();
        text.append("=============================\n");
        text.append("Nome: " + func.getNome() + "\n");
        text.append("Data: " + dataRegistro + "\n");
        text.append("Hora Entrada: " + horaEntrada + "\n");
        text.append("Hora Saída: " + horaSaida);
        return text.toString();
    }
}
