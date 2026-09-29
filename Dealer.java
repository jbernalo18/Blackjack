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
}
