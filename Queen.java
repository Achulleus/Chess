import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Queen extends Figure{
    public Queen(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
        setType("Queen");
    }

    public List<Position> canMoveTo(Map<Character, List<Square>> board){
        Position investigatedPosition;
        Square invertigatedSquare;
        List<Position> res = new ArrayList<>();

        for(int i = 1; i<= Board.letters.length(); i++){
            investigatedPosition = new Position(getPosition().getLetterAfter(i), getPosition().getNumber());
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
        }

        for(int i = 1;i<=Board.numbers;i++){
            investigatedPosition = new Position(getPosition().getLetter(), getPosition().getNumber() - i);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
        }

        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterBefor(i), getPosition().getNumber());
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
        }

        for(int i = 1;i<=Board.numbers;i++){
            investigatedPosition = new Position(getPosition().getLetter(), getPosition().getNumber() + i);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
        }

        int z = 1;
        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterAfter(i), getPosition().getNumber() + z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterAfter(i), getPosition().getNumber() - z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterBefor(i), getPosition().getNumber() - z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            investigatedPosition = new Position(getPosition().getLetterBefor(i), getPosition().getNumber() + z);
            if(validatePosition(board,investigatedPosition , isWhite())) res.add(investigatedPosition);
            invertigatedSquare = board.get(investigatedPosition.getLetter()).get(investigatedPosition.getNumber()-1);
            if(invertigatedSquare.getOccupiedFigure() != null) break;
            z++;
        }

        return res;
    }
}
