import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class GameRound { // clase ronda
    private int roundId; 
    private RoundStatus status;
    private ArrayList<Player> players;
    private ArrayList<Bet> bets;

    public GameRound (){
    this.players = new ArrayList<>(); //lista para guardar los jugadores de la ronda
    this.bets = new ArrayList<>(); //lista para guardar las apuestas de la ronda
    this.status = RoundStatus.WAITING;


    }
}