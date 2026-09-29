//Declaramos clase
public class Card {
 private String code;
 private char suit;
 private int value;

 //Declaramos constructos
 public Card(String code, char suit, int value){
    this.code = code;
    this.suit = suit;
    this.value = value;
  }
 public String getCode(){ //getter código
   return this.code;

  }
 public char getSuit() { //getter palo
    return this.suit;
 }

 public int getValue() { //getter valor
    return this.value;
 }

   @Override
    public String toString() { //Metodo para convertir ojbect en String (Player@... a Texto)
        return this.code;
    }


}