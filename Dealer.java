import java.util.ArrayList;

public class Dealer { //clase dealer
    private int id;
    private String name;
    private ArrayList<Card> hand;

    public Dealer (int id, String name){ //constructor
        this.hand = new ArrayList<>();
    }

    public int getId() { //getter id dealer
        return id;
    }

    public String getName() { //getter nombre dealer
        return name;
    }

    public ArrayList<Card> getHand() {  //getter mano dealer
        return hand;
    }

    public void addCard(Card card) { //metodo para añadir carta a mano de dealer
        hand.add(card);
    }

    public void openBetting(GameRound round) {  // Abre las apuestas de una ronda
        round.openBetting();
    }    

    public void closeBetting(GameRound round) { // Cierra las apuestas de una ronda
        round.closeBetting();
    }

}
