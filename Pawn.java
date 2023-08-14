import java.util.List;

public class Pawn extends Figure{
    public Pawn(boolean isWhite, boolean isBlack, Square position){
        super(isWhite, isBlack, position);
    }

    public List<Position> canMoveTo(){
        return null;
    }

    public List<Position> canSee(){
        return null;
    }
}
