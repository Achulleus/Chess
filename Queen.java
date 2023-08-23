import java.util.ArrayList;
import java.util.List;


public class Queen extends Figure{
    public Queen(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
        setType("Queen");
    }

    public List<Position> canMoveTo(){
        List<Position> res = new ArrayList<>();
        for(int i = 1; i<= Board.letters.length(); i++){
            res.add(new Position(getPosition().getLetterAfter(i), getPosition().getNumber()));
        }

        for(int i = 1;i<=Board.numbers;i++){
            res.add(new Position(getPosition().getLetter(), getPosition().getNumber() - i));
        }

        for(int i = 1;i<=Board.letters.length();i++){
            res.add(new Position(getPosition().getLetterBefor(i), getPosition().getNumber()));
        }

        for(int i = 1;i<=Board.numbers;i++){
            res.add(new Position(getPosition().getLetter(), getPosition().getNumber() + i));
        }

        int z = 1;
        for(int i = 1;i<=Board.letters.length();i++){
            res.add(new Position(getPosition().getLetterAfter(i), getPosition().getNumber() + z));
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            res.add(new Position(getPosition().getLetterAfter(i), getPosition().getNumber() - z));
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            res.add(new Position(getPosition().getLetterBefor(i), getPosition().getNumber() - z));
            z++;
        }
        z = 1;

        for(int i = 1;i<=Board.letters.length();i++){
            res.add(new Position(getPosition().getLetterBefor(i), getPosition().getNumber() + z));
            z++;
        }
        return res;
    }
}
