import java.util.List;

public class Pawn extends Figure{
    public Pawn(boolean isWhite, boolean isBlack){
        super(isWhite, isBlack);
    }

    public List<Square> canMoveTo(){
        return null;
    }

    public List<Square> canSee(){
        return null;
    }
}
