public class Main {

    public static void main(String[] args) {

        Dealer dealer = new Dealer(1, "John");

        Game game = new Game(1001, dealer);

        Player player1 = new Player(1, "Juli", 1000);
        Player player2 = new Player(2, "Cami", 1500);

        game.addPlayer(player1);
        game.addPlayer(player2);

        GameRound round = game.createRound();

        Player playerInGame1 = game.getPlayer(1);
        Player playerInGame2 = game.getPlayer(2);

        round.addPlayer(playerInGame1);
        round.addPlayer(playerInGame2);

        // El dealer abre las apuestas
        dealer.openBetting(round);
        System.out.println("Estado: " + round.getStatus());

        // Los jugadores apuestan mientras las apuestas están abiertas
        System.out.println("Apuesta Juli: " + round.placeBet(player1, 100));
        System.out.println("Apuesta Cami: " + round.placeBet(player2, 200));

        System.out.println("Apuestas: " + round.getBets());

        // El dealer cierra las apuestas
        dealer.closeBetting(round);
        System.out.println("Estado: " + round.getStatus());

        // Intentamos apostar después de cerrar
        System.out.println("Apuesta Juli después del cierre: " + round.placeBet(player1, 100));

        // Comienza el juego
        round.startPlaying();
        System.out.println("Estado: " + round.getStatus());

        // Intentamos cerrar apuestas durante el juego
        round.closeBetting();
        System.out.println("Estado después de intentar cerrar: " + round.getStatus());
    }
}
