package Modelando_Iphone_DIO;

public class Ligacoes {
    protected boolean telefoneTocando; // Indica se o telefone esta tocando
    protected boolean emLigacao; // Indica se a uma ligação ativa

    public Ligacoes(boolean telefoneTocando, boolean emLigacao) {
        this.telefoneTocando = false;
        this.emLigacao = false;
    }

    // Metodo para iniciar um correio de voz
    public void iniciarCorreioVoz(){
        if(telefoneTocando) {
            System.out.println("Iniciando correio de voz");
            telefoneTocando = false;
        }else {
            System.out.println("Não a chamadas para iniciar o correio de voz.");
        }
    }

    // Metodo para simular o telefone tocando
    public void simularTelefoneTocando(){
        if(!telefoneTocando) {
            System.out.println("Telefone tocando...");
            telefoneTocando = true;
        }else {
            System.out.println("Telefone já está tocando!");
        }
    }

    // Metodo para encerrar a ligação
    public void encerrarLigacao() {
        if(emLigacao) {
            System.out.println("Ligação encerrada.");
            emLigacao = false;
        }else {
            System.out.println("Não há ligação ativa para encerrar.");
        }
    }


}
