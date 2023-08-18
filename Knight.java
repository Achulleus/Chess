import java.util.ArrayList;
import java.util.List;

public class Knight extends Figure{
    public Knight(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
    }

    public List<Position> canMoveTo(){
        List<Position> res = new ArrayList<>();
        res.add(new Position(getPosition().getLetterAfter(), getPosition().getNumber() + 2));
        res.add(new Position(getPosition().getLetterAfter(2), getPosition().getNumber() + 1));
        res.add(new Position(getPosition().getLetterAfter(2), getPosition().getNumber() - 1));
        res.add(new Position(getPosition().getLetterAfter(), getPosition().getNumber() - 2));
        res.add(new Position(getPosition().getLetterBefor(), getPosition().getNumber() - 2));
        res.add(new Position(getPosition().getLetterBefor(2), getPosition().getNumber() - 1));
        res.add(new Position(getPosition().getLetterBefor(2), getPosition().getNumber() + 1));
        res.add(new Position(getPosition().getLetterBefor(), getPosition().getNumber() + 2));
        return res;
    }
}