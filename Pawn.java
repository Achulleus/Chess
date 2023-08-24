import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pawn extends Figure{
    public Pawn(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
        setType("Pawn");
    }

    public List<Position> canMoveTo(Map<Character, List<Square>> board){
        Position investigatedPosition;
        List<Position> res = new ArrayList<>();

        if(isWhite() == true){
            if(getPosition().getNumber() == 2){
                investigatedPosition = new Position(getPosition().getLetter(), 3);
                if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
                investigatedPosition = new Position(getPosition().getLetter(), 4);
                if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            }else{
                investigatedPosition = new Position(getPosition().getLetter(), getPosition().getNumber()+1);
                if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            }
        }else{
            if(getPosition().getNumber() == Board.numbers - 1){
                investigatedPosition = new Position(getPosition().getLetter(), Board.numbers - 2);
                if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
                investigatedPosition = new Position(getPosition().getLetter(), Board.numbers - 3);
                if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            }else{
                investigatedPosition = new Position(getPosition().getLetter(), getPosition().getNumber()-1);
                if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            }
        }

        return res;
    }
}
