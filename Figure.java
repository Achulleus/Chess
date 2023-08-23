import java.util.List;

public abstract class Figure {
    private boolean isWhite = false;
    private boolean isBlack = false;
    private  String type;
    private Position position;

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

    public Figure(boolean isWhite, boolean isBlack, Position position){
        this.isWhite = isWhite;
        this.isBlack = isBlack;
        this.position = position;
    }

    public abstract List<Position> canMoveTo();
}
