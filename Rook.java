import java.util.ArrayList;
import java.util.List;

public class Rook extends Figure{
    public Rook(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
    }

    public List<Position> canMoveTo(){
        List<Position> res = new ArrayList<>();

        return res;
    }
}
