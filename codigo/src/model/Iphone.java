package model;

import interfaces.AparelhoEletronico;

public class Iphone implements AparelhoEletronico {

    private Safari navegador;
    private Ipod reprodutorMusica;

    public Iphone(){
        this.navegador = new Safari();
        this.reprodutorMusica = new Ipod();
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public Safari getNavegador() {
        return navegador;
    }

    public Ipod getReprodutorMusica() {
        return reprodutorMusica;
    }
    
}
