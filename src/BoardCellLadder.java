public class BoardCellLadder implements BoardCell{
    public final int startPosition;
    public final int endPosition;

    public BoardCellLadder(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public int getStartPosition() {
        return startPosition;
    }

    public int getEndPosition() {
        System.out.println("Climbing Ladder ...");
        return endPosition;
    }
}
