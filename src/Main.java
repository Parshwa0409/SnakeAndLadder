import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Player-1");
        Player playerTwo = new Player("Player-2");
        Player playerThree = new Player("Player-3");

        Map<Integer, BoardCell> boardCellMap = Map.ofEntries(
                Map.entry(1, new BoardCellRegular(1)),
                Map.entry(2, new BoardCellRegular(2)),
                Map.entry(3, new BoardCellRegular(3)),
                Map.entry(4, new BoardCellRegular(4)),
                Map.entry(5, new BoardCellRegular(5)),
                Map.entry(6, new BoardCellRegular(6)),
                Map.entry(7, new BoardCellSnake(7, 4)),
                Map.entry(8, new BoardCellRegular(8)),
                Map.entry(9, new BoardCellLadder(9, 14)),
                Map.entry(10, new BoardCellRegular(10)),
                Map.entry(11, new BoardCellRegular(11)),
                Map.entry(12, new BoardCellRegular(12)),
                Map.entry(13, new BoardCellSnake(13, 8)),
                Map.entry(14, new BoardCellRegular(14)),
                Map.entry(15, new BoardCellLadder(15, 16))
        );

        Board board = new Board(4, boardCellMap);
        Dice dice = new Dice(1, 4, 2);

        Game game = new Game(board, dice);
        game.addPlayer(playerOne);
        game.addPlayer(playerTwo);
        game.addPlayer(playerThree);
        game.initializePlayers();

        game.startGame();
    }
}