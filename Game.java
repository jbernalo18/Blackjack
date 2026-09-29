import java.util.ArrayList;

public class Game {
    private int gameId; //id de game (30min de juego)
    private ArrayList<Player> players; //lista que guarda los jugadores de la sesion
    private ArrayList<GameRound> rounds; // lista que guarda las rondas de la sesion
    private Dealer dealer;
    private Deck deck;

    public Game (int gameId, Dealer dealer){
        this.players = new ArrayList<>();
        this.rounds = new ArrayList<>();
        this.deck = new Deck();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public int getPlayerCount(){
        return players.size();
    }

 public Player getPlayer(int id) {

    for (Player player : players) {

        if (player.getId() == id) {
            return player;
        }
    }
    return null;
 }
}
