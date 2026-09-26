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
 public String getCode(){
   return this.code;

  }
 public char getSuit() {
    return this.suit;
 }

 public int getValue() {
    return this.value;
 }

}