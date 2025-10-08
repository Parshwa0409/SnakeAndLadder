public class BoardCellSnake extends BoardCell{
    public BoardCellSnake(int startPosition, int endPosition) {
       super(startPosition, endPosition);
       if(startPosition <= endPosition) {
           throw new IllegalArgumentException("Start position of snake must be greater than end position.");
       }
    }
}
