package com.aparelho;


public class Iphone {
    public static void main(String[] args) {
        Modelo proMax = new Modelo();

        proMax.ligar();
        proMax.exibirPagina("www.DIO.me");
        proMax.adicionarNovaAba();
        proMax.atualizarPagina();
        proMax.atender();
        proMax.iniciarCorreioVoz();
        proMax.selecionarMusica("Thousand Milles");
        proMax.tocar();
        proMax.pausar();
        proMax.tocar();
        
        
    }
    
}
