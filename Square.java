import java.util.ArrayList;
import java.util.List;

public class Square {
    private Position position;
    //private boolean isOccupiedByWhite = false;
    //private boolean isOccupiedByBlack = false;
    //private boolean isObservedByWhite = false;
    //private boolean isObservedByBlack = false
    private Figure occupiedFigure;
    private List<Figure> observedFigures = new ArrayList<>();

    public Figure getOccupiedFigure() {
        return occupiedFigure;
    }

    public void setOccupiedFigure(Figure occupiedFigure) {
        this.occupiedFigure = occupiedFigure;
    }

    public List<Figure> getObservedFigures() {
        return observedFigures;
    }

    public void setObservedFigures(List<Figure> observedFigures) {
        this.observedFigures = observedFigures;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
    public Square(Position position){
        this.position = position;
    }
}
