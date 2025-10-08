public class BoardCellSnake implements BoardCell{
    public final int startPosition;
    public final int endPosition;

    public BoardCellSnake(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        System.out.println("Bitten by Snake ...");
        return endPosition;
    }
}
