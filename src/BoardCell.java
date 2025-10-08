abstract public class BoardCell {
    public final int startPosition;
    public final int endPosition;

    public BoardCell(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    int getStartPosition(){
        return startPosition;
    }

    int getEndPosition() {
        return endPosition;
    }
}
