package com.sartorelli;

public class Funcionario {

    //Atributos
    private int idFunc;
    private String nome;
    private String email;
    private String documento;

    //Getters and Setters
    public int getIdFunc() { return idFunc; }
    public void setIdFunc(int idFunc) { this.idFunc = idFunc; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    //Métodos
    public String apresentarFuncionario() {
        StringBuffer text = new StringBuffer();
        text.append("Id: " + idFunc + " | ");
        text.append("Nome: " + nome);
        return text.toString();
    }
}
