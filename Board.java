import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    //private Map<Character, List<Square>> board = new HashMap<>();
    private Square[][] board = new Square[8][8];
    public Board(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){

            }
        }
    }

    public Square[][] createNewChessboard(){
        int z = 65;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                board[i][j] = new Square((char) z, j);
            }
            z++;
        }
        return board;
    }
}
