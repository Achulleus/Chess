import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Knight extends Figure{
    public Knight(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
        setType("Knight");
    }

    public List<Position> canMoveTo(Map<Character, List<Square>> board){
        Position investigatedPosition;
        List<Position> res = new ArrayList<>();

        investigatedPosition = new Position(getPosition().getLetterAfter(), getPosition().getNumber() + 2);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterAfter(2), getPosition().getNumber() + 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterAfter(2), getPosition().getNumber() - 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterAfter(), getPosition().getNumber() - 2);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterBefor(), getPosition().getNumber() - 2);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterBefor(2), getPosition().getNumber() - 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterBefor(2), getPosition().getNumber() + 1);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
        investigatedPosition = new Position(getPosition().getLetterBefor(), getPosition().getNumber() + 2);
        if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);

        return res;
    }
}