public class Bet { //clase apuesta
    private double amount; //monto de la apuesta
    private Player player;
    private GameRound round;

    //constructor
    public Bet(Player player, double amount, GameRound round) {
        this.player = player;
        this.amount = amount;
        this.round = round; 
    }
    public String toString() {
        return "Bet: " + "Name: "+ player.getName() + " - " +"Amount: " + amount; 
    }
}
