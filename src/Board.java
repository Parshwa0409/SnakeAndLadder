import java.util.List;
import java.util.Map;

public class Board {
    private final int size;
    private final Map<Integer, BoardCell> boardCellsMap;

    public Board(int size, Map<Integer, BoardCell> boardCellsList) {
        this.size = size;
        this.boardCellsMap = boardCellsList;
    }

    public int getBoardSize() {
        return size * size;
    }

    public int getNextPosition(int currentPosition, int diceValue){
        int newPosition = currentPosition + diceValue;

        if(newPosition > getBoardSize()){
            return currentPosition;
        }

        return boardCellsMap.get(newPosition).getEndPosition();
    }
}
