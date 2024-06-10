package com.aparelho;

import com.metodos.internet.Navegador;
import com.metodos.ligacao.Telefone;
import com.metodos.musica.Reprodutor;

public class Modelo implements Navegador, Telefone, Reprodutor{

    public void adicionarNovaAba() {
        System.out.println("Abrindo nova Aba...");
        
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina. Aguarde...");        
    }

    public String exibirPagina(String url) {
        System.out.println(url);
        return url;
    }

    public void atender() {
        System.out.println("Atendido!");        
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");        
    }

    public void ligar() {
        System.out.println("Ligando... Chamando...");        
    }

    public void pausar() {
        System.out.println("Pausado");        
    }

    public String selecionarMusica(String musica) {
        System.out.println(musica);
        return musica;
    }

    public void tocar() {
        System.out.println("Está sendo reproduzido...");        
    }
    
}
