import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    public static String letters = "ABCDEFGH";
    public static int numbers = 8;
    private Map<Character, List<Square>> board = new HashMap<>();
    private List<Figure> capturedFigures = new ArrayList<>();
    private List<Figure> livingFiguresBlack = new ArrayList<>();
    private List<Figure> livingFiguresWhite = new ArrayList<>();
    //private Square[][] board = new Square[8][8];

    public Board(){
        //TODO
    }

    public Map<Character, List<Square>> createNewChessboard(){
        for(int i = 0; i < letters.length(); i++){
            board.put(letters.charAt(i), new ArrayList<Square>());
            for(int j = 1; j <= numbers; j++){
                board.get(letters.charAt(i)).add(new Square(new Position(letters.charAt(i), j)));
            }
        }
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

        Pawn blackAPawn = new Pawn(false,true,new Position('A',numbers-1));
        Pawn blackBPawn = new Pawn(false,true,new Position('B',numbers-1));
        Pawn blackCPawn = new Pawn(false,true,new Position('C',numbers-1));
        Pawn blackDPawn = new Pawn(false,true,new Position('D',numbers-1));
        Pawn blackEPawn = new Pawn(false,true,new Position('E',numbers-1));
        Pawn blackFPawn = new Pawn(false,true,new Position('F',numbers-1));
        Pawn blackGPawn = new Pawn(false,true,new Position('G',numbers-1));
        Pawn blackHPawn = new Pawn(false,true,new Position('H',numbers-1));
        Rook blackARook = new Rook(false,true,new Position('A',numbers));
        Rook blackHRook = new Rook(false,true,new Position('H',numbers));
        Knight blackBKnight = new Knight(false,true,new Position('B',numbers));
        Knight blackGKnight = new Knight(false,true,new Position('G',numbers));
        Bishop blackCBishop = new Bishop(false,true,new Position('C',numbers));
        Bishop blackFBishop = new Bishop(false,true,new Position('F',numbers));
        Queen blackQueen = new Queen(false,true,new Position('D',numbers));
        King blackKing = new King(false,true,new Position('E',numbers));

        livingFiguresWhite.add(whiteAPawn);
        livingFiguresWhite.add(whiteBPawn);
        livingFiguresWhite.add(whiteCPawn);
        livingFiguresWhite.add(whiteDPawn);
        livingFiguresWhite.add(whiteEPawn);
        livingFiguresWhite.add(whiteFPawn);
        livingFiguresWhite.add(whiteGPawn);
        livingFiguresWhite.add(whiteHPawn);
        livingFiguresWhite.add(whiteARook);
        livingFiguresWhite.add(whiteBKnight);
        livingFiguresWhite.add(whiteCBishop);
        livingFiguresWhite.add(whiteQueen);
        livingFiguresWhite.add(whiteKing);
        livingFiguresWhite.add(whiteFBishop);
        livingFiguresWhite.add(whiteGKnight);
        livingFiguresWhite.add(whiteHRook);

        livingFiguresBlack.add(blackAPawn);
        livingFiguresBlack.add(blackBPawn);
        livingFiguresBlack.add(blackCPawn);
        livingFiguresBlack.add(blackDPawn);
        livingFiguresBlack.add(blackEPawn);
        livingFiguresBlack.add(blackFPawn);
        livingFiguresBlack.add(blackGPawn);
        livingFiguresBlack.add(blackHPawn);
        livingFiguresBlack.add(blackARook);
        livingFiguresBlack.add(blackBKnight);
        livingFiguresBlack.add(blackCBishop);
        livingFiguresBlack.add(blackQueen);
        livingFiguresBlack.add(blackKing);
        livingFiguresBlack.add(blackFBishop);
        livingFiguresBlack.add(blackGKnight);
        livingFiguresBlack.add(blackHRook);

        //Set figures to there starting position
        board.get(whiteAPawn.getPosition().getLetter()).get(whiteAPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteAPawn);
        board.get(whiteBPawn.getPosition().getLetter()).get(whiteBPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteBPawn);
        board.get(whiteCPawn.getPosition().getLetter()).get(whiteCPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteCPawn);
        board.get(whiteDPawn.getPosition().getLetter()).get(whiteDPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteDPawn);
        board.get(whiteEPawn.getPosition().getLetter()).get(whiteEPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteEPawn);
        board.get(whiteFPawn.getPosition().getLetter()).get(whiteFPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteFPawn);
        board.get(whiteGPawn.getPosition().getLetter()).get(whiteGPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteGPawn);
        board.get(whiteHPawn.getPosition().getLetter()).get(whiteHPawn.getPosition().getNumber()-1).setOccupiedFigure(whiteHPawn);

        board.get(whiteARook.getPosition().getLetter()).get(whiteARook.getPosition().getNumber()-1).setOccupiedFigure(whiteARook);
        board.get(whiteBKnight.getPosition().getLetter()).get(whiteBKnight.getPosition().getNumber()-1).setOccupiedFigure(whiteBKnight);
        board.get(whiteCBishop.getPosition().getLetter()).get(whiteCBishop.getPosition().getNumber()-1).setOccupiedFigure(whiteCBishop);
        board.get(whiteQueen.getPosition().getLetter()).get(whiteQueen.getPosition().getNumber()-1).setOccupiedFigure(whiteQueen);
        board.get(whiteKing.getPosition().getLetter()).get(whiteKing.getPosition().getNumber()-1).setOccupiedFigure(whiteKing);
        board.get(whiteFBishop.getPosition().getLetter()).get(whiteFBishop.getPosition().getNumber()-1).setOccupiedFigure(whiteFBishop);
        board.get(whiteGKnight.getPosition().getLetter()).get(whiteGKnight.getPosition().getNumber()-1).setOccupiedFigure(whiteGKnight);
        board.get(whiteHRook.getPosition().getLetter()).get(whiteHRook.getPosition().getNumber()-1).setOccupiedFigure(whiteHRook);

        board.get(blackAPawn.getPosition().getLetter()).get(blackAPawn.getPosition().getNumber()-1).setOccupiedFigure(blackAPawn);
        board.get(blackBPawn.getPosition().getLetter()).get(blackBPawn.getPosition().getNumber()-1).setOccupiedFigure(blackBPawn);
        board.get(blackCPawn.getPosition().getLetter()).get(blackCPawn.getPosition().getNumber()-1).setOccupiedFigure(blackCPawn);
        board.get(blackDPawn.getPosition().getLetter()).get(blackDPawn.getPosition().getNumber()-1).setOccupiedFigure(blackDPawn);
        board.get(blackEPawn.getPosition().getLetter()).get(blackEPawn.getPosition().getNumber()-1).setOccupiedFigure(blackEPawn);
        board.get(blackFPawn.getPosition().getLetter()).get(blackFPawn.getPosition().getNumber()-1).setOccupiedFigure(blackFPawn);
        board.get(blackGPawn.getPosition().getLetter()).get(blackGPawn.getPosition().getNumber()-1).setOccupiedFigure(blackGPawn);
        board.get(blackHPawn.getPosition().getLetter()).get(blackHPawn.getPosition().getNumber()-1).setOccupiedFigure(blackHPawn);

        board.get(blackARook.getPosition().getLetter()).get(blackARook.getPosition().getNumber()-1).setOccupiedFigure(blackARook);
        board.get(blackBKnight.getPosition().getLetter()).get(blackBKnight.getPosition().getNumber()-1).setOccupiedFigure(blackBKnight);
        board.get(blackCBishop.getPosition().getLetter()).get(blackCBishop.getPosition().getNumber()-1).setOccupiedFigure(blackCBishop);
        board.get(blackQueen.getPosition().getLetter()).get(blackQueen.getPosition().getNumber()-1).setOccupiedFigure(blackQueen);
        board.get(blackKing.getPosition().getLetter()).get(blackKing.getPosition().getNumber()-1).setOccupiedFigure(blackKing);
        board.get(blackFBishop.getPosition().getLetter()).get(blackFBishop.getPosition().getNumber()-1).setOccupiedFigure(blackFBishop);
        board.get(blackGKnight.getPosition().getLetter()).get(blackGKnight.getPosition().getNumber()-1).setOccupiedFigure(blackGKnight);
        board.get(blackHRook.getPosition().getLetter()).get(blackHRook.getPosition().getNumber()-1).setOccupiedFigure(blackHRook);

        return board;
    }

    public void makeMove(Figure figure, Position newPosition){
        if(validateMove(figure,newPosition) == true){
            if(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure() != null){
                capturedFigures.add(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure());
                if(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure().isWhite() == true){
                    livingFiguresWhite.remove(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure());
                }else{
                    livingFiguresBlack.remove(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure());
                }
            }
            board.get(figure.getPosition().getLetter()).get(figure.getPosition().getNumber()-1).setOccupiedFigure(null);
            figure.setPosition(newPosition);
            board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).setOccupiedFigure(figure);
        }
    }

    public boolean validateMove(Figure figure, Position newPosition){
        boolean isValid = true;
        boolean isInLetters = false;
        boolean figureCanSeePosition = false;
        Position oldPosition = figure.getPosition();

        if(newPosition.getNumber() <= 0 || newPosition.getNumber() >= numbers) isValid = false;
        for(int i = 0; i < letters.length(); i++){
            if(letters.charAt(i) == newPosition.getLetter()) isInLetters = true;
        }
        if(isInLetters = false) isValid = false;

        if(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure().isWhite() && figure.isWhite()) isValid = false;
        if(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure().isBlack() && figure.isBlack()) isValid = false;
        if(figure.getType().equalsIgnoreCase("Pawn")){
            if(figure.canMoveTo().contains(newPosition)) figureCanSeePosition = true;
            if(pawnCanSee(figure).contains(newPosition)) figureCanSeePosition = true;
        }else {
            if(figure.canMoveTo().contains(newPosition)) figureCanSeePosition = true;
        }
        if(figureCanSeePosition = false) isValid = false;

        //TODO: Figur zwischen oldPosition und newPosition
        //TODO: Check aktuell?
        //TODO: Check nach dem Zug? board in lokale Variable kopieren -> Zug durchfuehren -> auf Check überpruefen
        return isValid;
    }

    public List<Position> pawnCanSee(Figure figure){
        List<Position> res = new ArrayList<>();
        if(figure.isWhite()==true) {
            if(figure.getPosition().getNumber() < numbers) {
                if (board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()).getOccupiedFigure().isBlack())
                    res.add(new Position(figure.getPosition().getLetterBefor(), figure.getPosition().getNumber() + 1));
                if (board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()).getOccupiedFigure().isBlack())
                    res.add(new Position(figure.getPosition().getLetterAfter(), figure.getPosition().getNumber() + 1));
            }
        }else{
            if(figure.getPosition().getNumber() >= 2) {
                if (board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber() - 2).getOccupiedFigure().isWhite())
                    res.add(new Position(figure.getPosition().getLetterBefor(), figure.getPosition().getNumber() - 1));
                if (board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber() - 2).getOccupiedFigure().isWhite())
                    res.add(new Position(figure.getPosition().getLetterAfter(), figure.getPosition().getNumber() - 1));
            }
        }
        return res;
    }
}
