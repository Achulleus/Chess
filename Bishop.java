import java.util.ArrayList;
import java.util.List;

public class Bishop extends Figure{
    Bishop(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
    }

    public List<Position> canMoveTo(){
        List<Position> res = new ArrayList<>();
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
