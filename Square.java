import java.util.ArrayList;
import java.util.List;

public class Square {

    private char squareletter;
    private int squarenumber;
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



    public char getSquareletter() {
        return squareletter;
    }

    public void setSquareletter(char squareletter) {
        this.squareletter = squareletter;
    }

    public int getSquarenumber() {
        return squarenumber;
    }

    public void setSquarenumber(int squarenumber) {
        this.squarenumber = squarenumber;
    }

    public Square(char squareletter, int squarenumber){
        this.squareletter = squareletter;
        this.squarenumber = squarenumber;
    }
}
