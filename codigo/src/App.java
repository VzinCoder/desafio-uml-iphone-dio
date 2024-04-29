import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone celular = new Iphone();
        celular.ligar();
        celular.getReprodutorMusica().tocar();
        celular.getNavegador().exibirPagina();
    }
}
