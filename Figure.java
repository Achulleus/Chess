public class Figure {
    private boolean isWhite = false;
    private boolean isBlack = false;

    private Position position;
    //private char possibleLetter;
    //private int possibleNumber;
    //private Map<char, Integer> possiblePosition = new HashMap<>();

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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Figure(boolean isWhite, boolean isBlack, Position position){
        this.isWhite = isWhite;
        this.isBlack = isBlack;
        this.position = position;
    }
}
