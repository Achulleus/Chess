import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Bishop extends Figure{
    Bishop(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
        setType("Bishop");
    }

    public List<Position> canMoveTo(Map<Character, List<Square>> board){
        Position investigatedPosition;
        Square invertigatedSquare;
        List<Position> res = new ArrayList<>();

        int z = 1;
        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterAfter(i), getPosition().getNumber() + z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure().isWhite() && isBlack()) break;
            if(invertigatedSquare.getOccupiedFigure().isBlack() && isWhite()) break;
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterAfter(i), getPosition().getNumber() - z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure().isWhite() && isBlack()) break;
            if(invertigatedSquare.getOccupiedFigure().isBlack() && isWhite()) break;
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterBefor(i), getPosition().getNumber() - z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure().isWhite() && isBlack()) break;
            if(invertigatedSquare.getOccupiedFigure().isBlack() && isWhite()) break;
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterBefor(i), getPosition().getNumber() + z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure().isWhite() && isBlack()) break;
            if(invertigatedSquare.getOccupiedFigure().isBlack() && isWhite()) break;
            z++;
        }

        return res;
    }
}
