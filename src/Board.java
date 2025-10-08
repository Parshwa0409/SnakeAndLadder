import java.util.List;
import java.util.Map;

public class Board {
    private final int size;
    private final List<Map<Integer, BoardCell>> boardCellsList;

    public Board(int size, List<Map<Integer, BoardCell>> boardCellsList) {
        this.size = size;
        this.boardCellsList = boardCellsList;
    }

    public int getBoardSize() {
        return size * size;
    }

    public int getNextPosition(int currentPosition, int diceValue){
        int newPosition = currentPosition + diceValue;

        if(newPosition > getBoardSize()){
            return currentPosition;
        }

        return boardCellsList.stream()
                .filter( map -> map.containsKey((newPosition)))
                .findFirst()
                .map(map -> map.get(newPosition).getEndPosition())
                .get();
    }
}
