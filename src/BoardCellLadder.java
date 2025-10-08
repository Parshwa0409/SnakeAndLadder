public class BoardCellLadder extends BoardCell{
    public BoardCellLadder(int startPosition, int endPosition) {
       super(startPosition, endPosition);
       if(startPosition >= endPosition) {
           throw new IllegalArgumentException("Start position of ladder must be less than end position.");
       }
    }
}
