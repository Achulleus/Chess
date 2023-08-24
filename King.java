import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class King extends Figure{
    public King(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
        setType("King");
    }

    public List<Position> canMoveTo(Map<Character, List<Square>> board){
        Position investigatedPosition;
        List<Position> res = new ArrayList<>();

        investigatedPosition = new Position(getPosition().getLetterBefor(), getPosition().getNumber() + 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetter(), getPosition().getNumber() + 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterAfter(), getPosition().getNumber() + 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterAfter(), getPosition().getNumber());
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterAfter(), getPosition().getNumber() - 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetter(), getPosition().getNumber() - 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterBefor(), getPosition().getNumber() - 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterBefor(), getPosition().getNumber());
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);

        return res;
    }
}
