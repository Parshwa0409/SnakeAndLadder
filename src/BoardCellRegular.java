public class BoardCellRegular implements BoardCell{
    int position;

    public BoardCellRegular(int position) {
        this.position = position;
    }

    @Override
    public int getStartPosition() {
        return position;
    }

    @Override
    public int getEndPosition() {
        return position;
    }
}
