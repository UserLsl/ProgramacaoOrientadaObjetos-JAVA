package com.company;

import java.util.Random;

public class Aluno {
    private int ra;
    private String nome;
    private String email;
    private String login;
    private String senha;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    //Método contrutor padrão.
    public Aluno(){
        Random r = new Random();
        ra = r.nextInt(1000);
    }

    public Aluno(String nome, String email, String login, String senha){
        this();
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public Aluno(String usuario, String senha){
        if(usuario.equalsIgnoreCase("adm") && senha.equalsIgnoreCase("123")){
                System.out.println("Acesso permitido !");
        }else{
            System.out.println("Acesso negado !");
        }
    }

    public void imprimir(){
        System.out.println("Nome = " + nome);
        System.out.println("RA = " + ra);
        System.out.println("E-mail = " + email);
        System.out.println("Login = " + login);
        System.out.println("Senha = " + senha);
    }

}
