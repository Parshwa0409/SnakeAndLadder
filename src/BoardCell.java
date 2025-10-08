abstract public class BoardCell {
    public final int startPosition;
    public final int endPosition;

    public BoardCell(int startPosition, int endPosition) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    int getEndPosition() {
        if(startPosition < endPosition){
            System.out.println("Yay! Climbed a ladder from " + startPosition + " to " + endPosition);
        } else if(startPosition > endPosition){
            System.out.println("Oops! Bitten by a snake from " + startPosition + " to " + endPosition);
        }
        return endPosition;
    }
}
