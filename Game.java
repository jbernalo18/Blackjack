import java.util.ArrayList;

public class Game {
    private int gameId; //id de game (30min de juego)
    private ArrayList<Player> players; //lista que guarda los jugadores de la sesion
    private ArrayList<GameRound> rounds; // lista que guarda las rondas de la sesion
    private Dealer dealer; //
    private Deck deck;
    private int nextRoundId; // siguiente ronda 

    public Game (int gameId, Dealer dealer){
        this.players = new ArrayList<>(); //lista para guardas jugadores de sesion
        this.rounds = new ArrayList<>(); //lista para guardar las rondas de la sesion
        this.deck = new Deck(); //inicializamos sesion con deck
        this.dealer = dealer; // dealer de la sesion
        this.nextRoundId = 1;
    }

    public void addPlayer(Player player){ //agregar jugador a lista de jugadores de la sesion
        players.add(player);
    }

    public void addRound(GameRound round) { //agregar ronda a la lista de rondas
    rounds.add(round);
    }
    
    public GameRound createRound() { //crear ronda
        GameRound round = new GameRound(nextRoundId); //creamos ronda empezando con la siguiente ronda
        rounds.add(round); //guardamos la ronda en lista de rondas
        nextRoundId++; //aumentamos en 1 la ronda
        return round; //retornamos ronda
    }

    public int getPlayerCount(){ //numero de jugadores de la sesion
        return players.size();
    }

 public Player getPlayer(int id) { //metodo verificar su existe jugador mediante id

    for (Player player : players) { //ciclo que recorre lista de jugadores

        if (player.getId() == id) { //condicional para verificar si el id esta en la lista
            return player;
        }
    }
    return null;
 }

 public void dealInitialCards() { //repartir las cartas inciiales

    for (int i = 0; i < 2; i++) {  //dos vueltas

        for (Player player : players) { // recorre cada jugador de jugadores
            player.addCard(deck.drawCard()); //saca una carta de deck y pasala al jugador
        }

        dealer.addCard(deck.drawCard()); // saca un carta de deck y pasala a dealer
    }
}

 public int getGameId() { //getter id sesion
    return gameId;
}

public Dealer getDealer() { //getter dealer de sesion
    return dealer;
}

public ArrayList<Player> getPlayers() { //getter lista jugadores sesion
    return players;
}

public ArrayList<GameRound> getRounds() { //getter lista de rondas
    return rounds;
}

public Deck getDeck() { //getter mazo de ronda
    return deck;
}
}
