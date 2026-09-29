import java.util.ArrayList;

public class GameRound { // clase ronda
    private int roundId; 
    private RoundStatus status;
    private ArrayList<Player> players;
    private ArrayList<Bet> bets;

    public GameRound (int roundId){ //constructor
        this.players = new ArrayList<>(); //lista para guardar los jugadores de la ronda
        this.bets = new ArrayList<>(); //lista para guardar las apuestas de la ronda
        this.status = RoundStatus.WAITING;
        this.roundId = roundId;
    }
    public void addPlayer(Player player) { //agregar jugadores a lista de jugadores de la ronda
        players.add(player);
    }

    public ArrayList<Player> getPlayers() { //getter para prueba
        return players;
    }
        public Player getPlayer(int id) { //buscar y obtener un jugador que ya está registrado en Game
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }

    public int getPlayerCount() { //metodo para conocer numero de jugadores de la ronda
        return players.size();
    }

    public void setStatus (RoundStatus status){  //metodo para cambiar estado a la ronda
        this.status = status;
    }
    
    public void addBet(Bet bet) { //agregar apuesta a lista de apuestas
        bets.add(bet);
    }

    public RoundStatus getStatus() { //getter para prueba
        return status;
    }

    public ArrayList<Bet> getBets() { //getter para prueba
        return bets;
    }   

    public boolean placeBet(Player player, double amount){ //metodo que crea y guarda una apuesta 
        if(player.canBet(amount) && status == RoundStatus.BETTING_OPEN) {  
            // Valida que el jugador tenga saldo suficiente y que las apuestas estén abiertas

            Bet bet = new Bet(player, amount, this);
            addBet(bet);
            player.setBalance(player.getBalance() - amount); 
            //obtenemos el balance actual, le restamos lo apostado  y setbalance guarda el nuevo balance 
            return true;
        }
        return false;
        }
        // Abre el periodo de apuestas de la ronda
        public void openBetting() {
            status = RoundStatus.BETTING_OPEN;
        }

        // Cierra el período de apuestas de la ronda
        public void closeBetting() {
            if (status == RoundStatus.BETTING_OPEN) {
            status = RoundStatus.BETTING_CLOSED;
            }
        }

        public void startPlaying(){
            if(status == RoundStatus.BETTING_CLOSED){
                status = RoundStatus.PLAYING;
            }   
        }


}