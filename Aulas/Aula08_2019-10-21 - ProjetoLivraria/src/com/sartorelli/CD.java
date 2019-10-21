package com.sartorelli;

public class CD extends Produto {

    private String artista;
    private String gravadora;
    private String paisOrigem;

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    @Override
    public String toString() {
        StringBuilder tx = new StringBuilder();
        tx.append(super.toString());
        tx.append("Artista: " + artista + "\n");
        tx.append("Gravadora: " + gravadora + "\n");
        tx.append("País de Origem: " + paisOrigem + "\n");
        return tx.toString();
    }

    @Override
    public double getPrecoVenda() {
        return getPrecoCusto() * 1.3;
    }
}
