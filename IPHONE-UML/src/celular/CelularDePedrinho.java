package celular;

public class CelularDePedrinho 
{
    public static void main(String[] args) {
        Iphone IphoneX = new Iphone();

        IphoneX.tocar();
        IphoneX.exibirPagina("youtube.com");
        IphoneX.pausar();
        IphoneX.atender();
    }    
}
