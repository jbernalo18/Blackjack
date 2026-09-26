public class Main {
    public static void main(String[] args) {
        
     Deck deck = new Deck();
     System.out.println(deck.getCardsCount());
     Card card = deck.drawCard();
     deck.drawCard();
     System.out.println(deck.getCardsCount());
     System.out.println(card.getCode());


    }
}
