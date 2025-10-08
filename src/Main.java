import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Player-1");
        Player playerTwo = new Player("Player-2");
        Player playerThree = new Player("Player-3");

        List<Map<Integer, BoardCell>> boardCellsList = List.of(
                Map.of(1, new BoardCellRegular(1)),
                Map.of(2, new BoardCellRegular(2)),
                Map.of(3, new BoardCellRegular(3)),
                Map.of(4, new BoardCellRegular(4)),
                Map.of(5, new BoardCellSnake(5, 3)),
                Map.of(6, new BoardCellRegular(6)),
                Map.of(7, new BoardCellLadder(7, 9)),
                Map.of(8, new BoardCellRegular(8)),
                Map.of(9, new BoardCellRegular(9)),
                Map.of(10, new BoardCellRegular(10)),
                Map.of(11, new BoardCellRegular(11)),
                Map.of(12, new BoardCellRegular(12)),
                Map.of(13, new BoardCellRegular(13)),
                Map.of(14, new BoardCellRegular(14)),
                Map.of(15, new BoardCellRegular(15)),
                Map.of(16, new BoardCellRegular(16))
        );

        Board board = new Board(4, boardCellsList);
        Dice dice = new Dice(1, 4, 2);

        Game game = new Game(board, dice);
        game.addPlayer(playerOne);
        game.addPlayer(playerTwo);
        game.addPlayer(playerThree);
        game.initializePlayers();

        game.startGame();
    }
}