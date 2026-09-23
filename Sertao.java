public class Sertao extends Localizacao {
    @Override
    protected Inimigo criarInimigo() {
        // A fábrica do Sertão constrói Cangaceiros
        return new Cangaceiro();
    }
}
