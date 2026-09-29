public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player player = new Player(1, "Juli", 100);

        Card card1 = deck.drawCard();
        player.addCard(card1);

        Card card2 = deck.drawCard();
        player.addCard(card2);

        System.out.println("Mano del jugador: " + player.getHand());
        System.out.println("Cartas restantes: " + deck.getCardsCount());
    }
}