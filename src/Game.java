import java.util.ArrayDeque;
import java.util.Deque;

public class Game {
    private Deque<Player> players;
    private final Board board;
    private final Dice dice;

    public Game(Board board, Dice dice) {
        this.players = new ArrayDeque<>();
        this.board = board;
        this.dice = dice;
    }

    public void initializePlayers() {
        players.forEach(player -> player.setCurrentPosition(0));
    }

    public boolean addPlayer(Player player) {
        if (players.stream().anyMatch(p -> p.getInfo().equals(player.getInfo()))) {
            return false;
        }
        players.addLast(player);
        return true;
    }

    public void startGame(){
        if(players.size() < 2){
            throw new IllegalStateException("At least two players are required to start the game.");
        }

        Player currentPlayer;
        boolean gameWon = false;

        while(!gameWon){
            currentPlayer = players.removeFirst();
            System.out.println(currentPlayer.getInfo() + "'s turn. Current position: " + currentPlayer.getCurrentPosition());
            int diceValue = rollDice();
            System.out.println(currentPlayer.getInfo() + " rolled a " + diceValue);
            int newPosition = board.getNextPosition(currentPlayer.getCurrentPosition(), diceValue);
            if(newPosition == currentPlayer.getCurrentPosition()){
                System.out.println(currentPlayer.getInfo() + " cannot move, needs exact roll to reach the end.");
            }else {
                currentPlayer.setCurrentPosition(newPosition);
                System.out.println(currentPlayer.getInfo() + " moved to position " + newPosition);
            }
            System.out.println("-----------------------------------");

            if(isTheGameOver(currentPlayer)){
                gameWon = true;
                System.out.println(currentPlayer.getInfo() + " has won the game!");
            }else{
                players.addLast(currentPlayer);
            }

        }
    }

    private int rollDice() {
        return dice.roll();
    }

    private boolean isTheGameOver(Player player){
        return player.getCurrentPosition() == board.getBoardSize();
    }
}
