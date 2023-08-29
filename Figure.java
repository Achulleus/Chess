import java.util.List;
import java.util.Map;

public abstract class Figure {
    private boolean isWhite;
    private boolean isBlack;
    private  String type;
    private Position position;
    private boolean hadMoved = false;
    public boolean hadMovedtwice = false;

    public boolean canEnPassant = false;

    public boolean isCanEnPassant() {
        return canEnPassant;
    }

    public void setCanEnPassant(boolean canEnPassant) {
        this.canEnPassant = canEnPassant;
    }

    public boolean isHadMovedtwice() {
        return hadMovedtwice;
    }

    public void setHadMovedtwice(boolean hadMovedtwice) {
        this.hadMovedtwice = hadMovedtwice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public boolean isHadMoved() {
        return hadMoved;
    }

    public void setHadMoved(boolean hadMoved) {
        this.hadMoved = hadMoved;
    }

    public Figure(boolean isWhite, boolean isBlack, Position position){
        this.isWhite = isWhite;
        this.isBlack = isBlack;
        this.position = position;
    }

    public abstract List<Position> canMoveTo(Map<Character, List<Square>> board);

    public boolean validateLetter(char c){
        boolean validateChar = false;
        for(int i = 0; i < Board.letters.length(); i++){
            if(Board.letters.charAt(i) == c) validateChar = true;
        }
        return validateChar;
    }

    public boolean validatePosition(Map<Character, List<Square>> board, Position investigatedPosition, boolean isWhite){
        boolean isValidPosition = false;
        Square investigatedSquare;

        if(validateLetter(investigatedPosition.getLetter()) && investigatedPosition.getNumber() > 0 && investigatedPosition.getNumber() <= Board.numbers) {
            investigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(investigatedSquare.getOccupiedFigure() == null){
                isValidPosition = true;
            } else if (investigatedSquare.getOccupiedFigure().isWhite() && isWhite == false) {
                isValidPosition = true;
            } else if (investigatedSquare.getOccupiedFigure().isBlack() && isWhite) {
                isValidPosition = true;
            }
        }

        return isValidPosition;
    }
}
