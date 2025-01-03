package Modelando_Iphone_DIO;

import java.util.ArrayList;
import java.util.List;

public class Navegador {
    protected List<String> abas; // Lista de abas abertas (URLs)
    protected int abaAtual; // Índice da aba atual

    public Navegador(List<String> abas, int abaAtual) {
        this.abas = new ArrayList<>();
        this.abas.add("Página Inicial"); // Abre uma aba padrão
        this.abaAtual = 0;
    }

    // Metodo para exibir a página atual
    public void exibirPagina(){
        if(abas.isEmpty()) {
            System.out.println("Nenhuma aba aberta!");
        }else {
            System.out.println("Exibindo: " + abas.get(abaAtual));
        }
    }

    // Metodo para adicionar uma nova aba
    public void adicionarNovaAba(String url) {
        abas.add(url);
        abaAtual = abas.size() - 1; // Altera para nova aba
        System.out.println("Nova aba adicionada: " + url);
        exibirPagina();
    }

    // Metodo para atualizar a página atual
    public void atualizarPagina() {
        if(abas.isEmpty()){
            System.out.println("Nenhuma aba aberta para atualizar");
        }else{
            System.out.println("Atualizando: " + abas.get(abaAtual));
            // Simulando atualização de aba
        }
    }

    // Metodo para alterar para uma aba especifica
    public void alterarAba(int indice) {
        if(indice < 0 || indice >= abas.size()) {
            System.out.println("Índice invalido");
            return;
        }
        abaAtual = indice;
        System.out.println("Alterando para aba: " + abas.get(abaAtual));
        exibirPagina();
    }
}
