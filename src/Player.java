public class Player {
    private final String info;
    private int currentPosition;

    public Player(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
