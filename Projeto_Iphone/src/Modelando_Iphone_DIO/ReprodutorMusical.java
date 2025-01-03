package Modelando_Iphone_DIO;

import java.util.List;

public class ReprodutorMusical{
    protected List<String> playList; // Aqui vai ser gerada uma lista de músicas
    protected int musicaAtual; // Índice da música atual
    protected boolean pausado; // Estado do reprodutor

    public ReprodutorMusical(List<String> playList, int musicaAtual, boolean pausado) {
        this.playList = playList;
        this.musicaAtual = 0;
        this.pausado = false;
    }

    // Metodo para trocar para a próxima música
    public void trocarProxima() {
        if(playList.isEmpty()) {
            System.out.println("A lista de músicas esta vazia");
            return;
        }
        // * O operador '%' é usado para reiniciar a lista quando o índice for maior que o tamanho da lista.
        musicaAtual = (musicaAtual + 1) % playList.size();
        pausado = false;
        System.out.println("Trocando: " + playList.get(musicaAtual));

    }
    // Trocando a música anterior
    public void trocarAnterior() {
        if(playList.isEmpty()) {
            System.out.println("A lista de músicas esta vazia");
            return;
        }
        musicaAtual = (musicaAtual - 1) % playList.size();
        pausado = false;
        System.out.println("Trocando: " + playList.get(musicaAtual));

    }
    // Metodo para pausar ou retomar música atual
    public void pausarOuRetomar() {
        if(playList.isEmpty()) {
            System.out.println("A lista de músicas está vazia.");
            return;
        }
        pausado = !pausado;
        System.out.println(pausado ?"A música está pausada." : "Retomando: " + playList.get(musicaAtual));
    }
    // Metodo para selecionar uma música específica
    public void musicaEspecifica(int indice) {
        if(playList.isEmpty()) {
            System.out.println("A lista de músicas está vazia.");
            return;
        }
        if(indice < 0 || indice >= playList.size()) {
            System.out.println("Índice inválido!");
            return;
        }
        musicaAtual = indice;
        pausado = false;
        System.out.println("Tocando: " + playList.get(musicaAtual));
    }
}
