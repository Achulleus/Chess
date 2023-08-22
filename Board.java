import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private String letters = "ABCDEFGH";
    private int numbers = 8;
    private Map<Character, List<Square>> board = new HashMap<>();
    //private Square[][] board = new Square[8][8];
    Pawn whiteAPawn = new Pawn(true, false, new Position('A',2));
    Pawn whiteBPawn = new Pawn(true,false,new Position('B',2));
    Pawn whiteCPawn = new Pawn(true,false,new Position('C',2));
    Pawn whiteDPawn = new Pawn(true,false,new Position('D',2));
    Pawn whiteEPawn = new Pawn(true,false,new Position('E',2));
    Pawn whiteFPawn = new Pawn(true,false,new Position('F',2));
    Pawn whiteGPawn = new Pawn(true,false,new Position('G',2));
    Pawn whiteHPawn = new Pawn(true,false,new Position('H',2));
    Rook whiteARook = new Rook(true, false, new Position('A', 1));
    Rook whiteHRook = new Rook(true, false, new Position('H',1));
    Knight whiteBKnight = new Knight(true, false, new Position('B',1));
    Knight whiteGKnight = new Knight(true, false, new Position('G', 1));
    Bishop whiteCBishop = new Bishop(true, false, new Position('C',1));
    Bishop whiteFBishop = new Bishop(true,false,new Position('F', 1));
    Queen whiteQueen = new Queen(true,false,new Position('D',1));
    King whiteKing = new King(true,false,new Position('E',1));

    Pawn blackAPawn = new Pawn(false,true,new Position('A',7));
    Pawn blackBPawn = new Pawn(false,true,new Position('B',7));
    Pawn blackCPawn = new Pawn(false,true,new Position('C',7));
    Pawn blackDPawn = new Pawn(false,true,new Position('D',7));
    Pawn blackEPawn = new Pawn(false,true,new Position('E',7));
    Pawn blackFPawn = new Pawn(false,true,new Position('F',7));
    Pawn blackGPawn = new Pawn(false,true,new Position('G',7));
    Pawn blackHPawn = new Pawn(false,true,new Position('H',7));
    Rook blackARook = new Rook(false,true,new Position('A',8));
    Rook blackHRook = new Rook(false,true,new Position('H',8));
    Knight blackBKnight = new Knight(false,true,new Position('B',8));
    Knight blackGKnight = new Knight(false,true,new Position('G',8));
    Bishop blackCBishop = new Bishop(false,true,new Position('C',8));
    Bishop blackFBishop = new Bishop(false,true,new Position('F',8));
    Queen blackQueen = new Queen(false,true,new Position('D',8));
    King blackKing = new King(false,true,new Position('E',8));

    public Board(){

    }

    public Map<Character, List<Square>> createNewChessboard(){
        for(int i = 0; i < letters.length(); i++){
            board.put(letters.charAt(i), new ArrayList<Square>());
            for(int j = 0; j < numbers; j++){
                board.get(letters.charAt(i)).add(new Square(new Position(letters.charAt(i), j)));
            }
        }
        //TODO: Set figures to there starting position
        return board;
    }

    public void makeMove(Figure figure, Position newPosition){
        //TODO
    }

    public boolean validateMove(Figure figure, Position newPosition){
        boolean isValid = false;
        //TODO
        return isValid;
    }
}
