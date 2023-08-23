import java.util.ArrayList;
import java.util.List;

public class King extends Figure{
    public King(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
        setType("King");
    }

    public List<Position> canMoveTo(){
        List<Position> res = new ArrayList<>();
        res.add(new Position(getPosition().getLetterBefor(), getPosition().getNumber() + 1));
        res.add(new Position(getPosition().getLetter(), getPosition().getNumber() + 1));
        res.add(new Position(getPosition().getLetterAfter(), getPosition().getNumber() + 1));
        res.add(new Position(getPosition().getLetterAfter(), getPosition().getNumber()));
        res.add(new Position(getPosition().getLetterAfter(), getPosition().getNumber() - 1));
        res.add(new Position(getPosition().getLetter(), getPosition().getNumber() - 1));
        res.add(new Position(getPosition().getLetterBefor(), getPosition().getNumber() - 1));
        res.add(new Position(getPosition().getLetterBefor(), getPosition().getNumber()));
        return res;
    }
}
