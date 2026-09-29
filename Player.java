import java.util.ArrayList;

public class Player { //clase Jugador
    private int id;
    private String name;
    private double balance;
    private ArrayList<Card> hand; // Creamos arreglo tipo Carta para guardar la mano 
    private PlayerStatus status;

    //Constructor
    public Player(int id, String name, double balance){ 
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.hand = new ArrayList<>();
        this.status = PlayerStatus.WATTING;

    }
    @Override //Metodo para convertir ojbect en String (Player@... a Texto)
    public String toString() {
      return "Player: " + id + " - " + name + " - " + balance;
    }

    public String getName(){ //getter nombre Jugador
        return name;
    }

    public int getId(){ // getter Id Jugador
        return id;
    }

    public double getBalance(){
     //getter Balance Jugador
        return balance;

     }

     public void setBalance(double balance){
        this.balance = balance;
     }

     public void addCard(Card card){ //metodo sin return para agregar carta a mano
        hand.add(card);
     }

     public ArrayList<Card> getHand() { //getter de mano
        return hand;
     }


 }  
