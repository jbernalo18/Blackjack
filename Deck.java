import java.util.ArrayList;
import java.util.Collections;

public class Deck { // Se crea clase

    private ArrayList<Card> cards; // Creamos arreglo de cartas
    private char suits[] = {'H', 'D', 'C', 'S'}; // Creamos lista de palos

    public Deck() { // Constructor
        this.cards = new ArrayList<>(); // Inicializamos la lista de cartas

        for (char suit : suits) { // Recorremos palos
            for (int value = 1; value <= 13; value++) { // Recorremos valores
                String code = value + "" + suit; // Concatenamos valor y palo
                Card card = new Card(code, suit, value); // Creamos una carta
                cards.add(card); // Guardamos la carta en cards
            }
        }

        Collections.shuffle(cards); // Barajamos el mazo
    }

    public Card drawCard() { //creamos metodo para sacar la primer carta del mazo
        Card card = cards.removeFirst();
        return card;
    }
    public int getCardsCount(){
        return cards.size();
    }
}