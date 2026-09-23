public abstract class Localizacao {
    
    // Este é o FACTORY METHOD (Método Fábrica)! 
    // É abstrato pois as subclasses (Amazonia, Sertao) é que vão decidir qual inimigo construir.
    protected abstract Inimigo criarInimigo();

    // Lógica principal do jogo que independe de qual inimigo é.
    public void iniciarFase() {
        System.out.println("\n--- Jogador entrou em uma nova regiao... ---");
        
        // Chamamos o Método Fábrica para obter o inimigo daquela região específica
        Inimigo inimigoDaFase = criarInimigo();
        
        System.out.println("Um inimigo se aproxima!");
        
        // O jogador sofre o ataque. Para o jogador (neste código), pouco importa qual é o inimigo.
        inimigoDaFase.atacar();
    }
}
