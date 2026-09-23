public class Amazonia extends Localizacao {
    @Override
    protected Inimigo criarInimigo() {
        // A fábrica da Amazônia constrói Animais Mutantes
        return new AnimalMutante();
    }
}
