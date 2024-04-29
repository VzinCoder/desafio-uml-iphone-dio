package model;

import interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina...");
    }
    
}
