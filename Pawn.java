import java.util.ArrayList;
import java.util.List;

public class Pawn extends Figure{
    public Pawn(boolean isWhite, boolean isBlack, Position position){
        super(isWhite, isBlack, position);
    }

    public List<Position> canMoveTo(){
        List<Position> res = new ArrayList<>();
        if(isWhite() == true){
            if(getPosition().getNumber() == 2){
                res.add(new Position(getPosition().getLetter(), 3));
                res.add(new Position(getPosition().getLetter(), 4));
            }else{
                res.add(new Position(getPosition().getLetter(), getPosition().getNumber()+1));
            }
        }else{
            if(getPosition().getNumber() == Board.numbers - 1){
                res.add(new Position(getPosition().getLetter(), Board.numbers - 2));
                res.add(new Position(getPosition().getLetter(), Board.numbers - 3));
            }else{
                res.add(new Position(getPosition().getLetter(), getPosition().getNumber()-1));
            }
        }
        return res;
    }

    public List<Position> canSee(){
        List<Position> res = new ArrayList<>();
        if(isWhite()==true) {
            res.add(new Position(getPosition().getLetterBefor(), getPosition().getNumber() + 1));
            res.add(new Position(getPosition().getLetterAfter(), getPosition().getNumber() + 1));
        }else{
            res.add(new Position(getPosition().getLetterBefor(), getPosition().getNumber() - 1));
            res.add(new Position(getPosition().getLetterAfter(), getPosition().getNumber() - 1));
        }
        return res;
    }
}
