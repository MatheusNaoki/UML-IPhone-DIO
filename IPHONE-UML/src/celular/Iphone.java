package celular;

import aplicativos.AparelhoTelefonico;
import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical
{
    //Telefone
    public void ligar(String numero)
    {
        System.out.println("LIGANDO PARA: " + numero);
    }    
    public void atender()
    {
        System.out.println("LIGAÇÃO ATENDIDA");
    }
    public void iniciarCorreioVoz()
    {
        System.out.println("CORREIO DE VOZ ACIONADO");
    }
        
    //Navegador de Internet
        public void exibirPagina(String url)
    {
        System.out.println("ENTRANDO EM: " + url + "\nEXIBINDO PAGINA");
    }    
    public void adicionarNovaAba()
    {
        System.out.println("NOVA ABA ADICIONADA");
    }
    public void atualizarPagina()
    {
        System.out.println("PÁGINA ATUALIZADA");
    }

    //Reprodutor Musical

    public void tocar()
    {
        System.out.println("TOCANDO MUSICA...");
    }    
    public void pausar()
    {
        System.out.println("MUSICA PAUSDA");
    }
    public void selecionarMusica(String musica)
    {
        System.out.println("MÚSICA SELECIONADA, TOCANDO: " + musica);
    }
}

