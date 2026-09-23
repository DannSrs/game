public class RioDeJaneiro extends Localizacao {
    @Override
    protected Inimigo criarInimigo() {
        return new CriaBangu();
    }
}
