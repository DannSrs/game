public class Main {
    public static void main(String[] args) {
        
        // O jogador vai para a Amazônia
        Localizacao fase1 = new Amazonia();
        fase1.iniciarFase();

        // O jogador viaja para o Sertão
        Localizacao fase2 = new Sertao();
        fase2.iniciarFase();

        //O jogador viaja para o Rio de Janeiro
        Localizacao fase3 = new RioDeJaneiro();
        fase3.iniciarFase();
    }
}
