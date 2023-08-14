public class Figure {
    private boolean isWhite = false;
    private boolean isBlack = false;

    private Square position;
    //private char possibleLetter;
    //private int possibleNumber;
    //private Map<char, Integer> possiblePosition = new HashMap<>();
    private Position possiblePosition;

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }

    public Square getPosition() {
        return position;
    }

    public void setPosition(Square position) {
        this.position = position;
    }

    public Position getPossiblePosition() {
        return possiblePosition;
    }

    public void setPossiblePosition(Position possiblePosition) {
        this.possiblePosition = possiblePosition;
    }

    public Figure(boolean isWhite, boolean isBlack, Square position){
        this.isWhite = isWhite;
        this.isBlack = isBlack;
        this.position = position;
    }
}
