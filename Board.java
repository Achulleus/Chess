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
    private boolean isCheckmate = false;
    private boolean isStalemate = false;
    private char[] figureTypes = new char[4];

    public boolean isCheckmate() {
        return isCheckmate;
    }

    public void setCheckmate(boolean checkmate) {
        isCheckmate = checkmate;
    }

    public boolean isStalemate() {
        return isStalemate;
    }

    public void setStalemate(boolean stalemate) {
        isStalemate = stalemate;
    }

    public Map<Character, List<Square>> getBoard() {
        return board;
    }

    public List<Figure> getCapturedFigures() {
        return capturedFigures;
    }

    public List<Figure> getLivingFiguresBlack() {
        return livingFiguresBlack;
    }

    public List<Figure> getLivingFiguresWhite() {
        return livingFiguresWhite;
    }

    public Board(){
        createNewChessboard();
        isCheckmate = false;
        isStalemate = false;
        figureTypes[0] = 'Q';
        figureTypes[1] = 'K';
        figureTypes[2] = 'B';
        figureTypes[3] = 'R';
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
        if(figure.isHadMoved()) figure.setHadMovedtwice(true);
        figure.setHadMoved(true);
        board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).setOccupiedFigure(figure);
    }

    public boolean validateMove(Figure figure, Position newPosition){
        boolean isValid = true;
        boolean figureCanSeePosition = false;
        Map<Character, List<Square>> boardAfterMove = board;
        Position kingsPosition;
        Figure figureAfterMove = figure;

        if(figure.getType().equalsIgnoreCase("King")) {
            kingsPosition = figure.getPosition();
        }else{
            kingsPosition = getKingsPosition(figure.isWhite());
        }

        if(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure().isWhite() && figure.isWhite()) isValid = false;
        if(board.get(newPosition.getLetter()).get(newPosition.getNumber()-1).getOccupiedFigure().isBlack() && figure.isBlack()) isValid = false;
        if(figure.getType().equalsIgnoreCase("Pawn")){
            if(figure.canMoveTo(board).contains(newPosition)) figureCanSeePosition = true;
            if(pawnCanSee(figure).contains(newPosition)) figureCanSeePosition = true;
        }else {
            if(figure.canMoveTo(board).contains(newPosition)) figureCanSeePosition = true;
        }
        if(figureCanSeePosition = false) isValid = false;

        if(isValid == true){
            if(isCheck(board,figure.isWhite(),kingsPosition)) {
                isCheckmate = isCheckmate(figure.isWhite(), kingsPosition);
                if(isCheckmate) return false;
            }else{
                isStalemate = isStalemate(figure.isWhite(),kingsPosition);
                if(isStalemate) return false;
            }
            boardAfterMove.get(figure.getPosition().getLetter()).get(figure.getPosition().getNumber() - 1).setOccupiedFigure(null);
            figureAfterMove.setPosition(newPosition);
            boardAfterMove.get(newPosition.getLetter()).get(newPosition.getNumber() - 1).setOccupiedFigure(figureAfterMove);
            if(figure.getType().equalsIgnoreCase("King")) kingsPosition = newPosition;
            if(isCheck(boardAfterMove, figure.isWhite(), kingsPosition)) isValid = false;
        }

        if(isEnPassant(figure, newPosition)) return true;
        if(figureCanSeePosition && figure.getType().equalsIgnoreCase("Pawn")){
            if(isPawnPromotion(figure, newPosition)) return true;
        }
        if(isChastle(figure, newPosition)) return true;
        if(isValid == true) makeMove(figure, newPosition);
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

    public boolean isCheck(Map<Character, List<Square>> board, boolean isWhite, Position kingsPosition){
        boolean isCheck = false;
        List<Position> res = new ArrayList<>();

        if(isWhite){
            for(int i = 0; i < livingFiguresBlack.size(); i++){
                res = livingFiguresBlack.get(i).canMoveTo(board);
                if(res.contains(kingsPosition)) isCheck = true;
            }
        }else{
            for(int i = 0; i < livingFiguresWhite.size(); i++){
                res = livingFiguresWhite.get(i).canMoveTo(board);
                if(res.contains(kingsPosition)) isCheck = true;
            }
        }

        return isCheck;
    }

    public Position getKingsPosition(boolean isWhite){
        Position kingsPosition = null;

        if (isWhite == true) {
            for(int i = 0; i < livingFiguresWhite.size(); i++){
                if(livingFiguresWhite.get(i).getType().equalsIgnoreCase("King")) kingsPosition = livingFiguresWhite.get(i).getPosition();
            }
        } else {
            for(int i = 0; i < livingFiguresBlack.size(); i++){
                if(livingFiguresBlack.get(i).getType().equalsIgnoreCase("King")) kingsPosition = livingFiguresBlack.get(i).getPosition();
            }
        }

        return kingsPosition;
    }

    public boolean isCheckmate(boolean isWhite, Position kingsPosition){
        boolean isCheckmate = true;
        Figure king = board.get(kingsPosition.getLetter()).get(kingsPosition.getNumber()-1).getOccupiedFigure();
        List<Position> res = king.canMoveTo(board);
        for(int i = 0; i < res.size(); i++){
            kingsPosition = res.get(i);
            if(isCheck(board, isWhite, kingsPosition) == false) isCheckmate = false;
        }
        return isCheckmate;
    }

    public boolean isStalemate(boolean isWhite, Position kingsPosition){
        boolean isStalemate = true;
        Figure king = board.get(kingsPosition.getLetter()).get(kingsPosition.getNumber()-1).getOccupiedFigure();
        List<Position> res = king.canMoveTo(board);
        if(isCheck(board, isWhite, kingsPosition)) isStalemate = false;
        if(isStalemate == true) {
            for (int i = 0; i < res.size(); i++) {
                kingsPosition = res.get(i);
                if (isCheck(board, isWhite, kingsPosition) == false) isStalemate = false;
            }
        }
        return isStalemate;
    }

    public boolean isChastle(Figure figure, Position newPosition){
        boolean isChastle = false;

        if(figure.getType().equalsIgnoreCase("King") && figure.isHadMoved() == false){
            if(figure.isWhite() && newPosition.getNumber() == 1 && newPosition.getLetter() == 'G' && board.get(letters.charAt(letters.length()-1)).get(0).getOccupiedFigure().isHadMoved() == false){
                if(board.get('F').get(0).getOccupiedFigure() == null && board.get('G').get(0).getOccupiedFigure() == null) {
                    if (isCheck(board, true, figure.getPosition()) == false && isCheck(board, true, new Position('F', 1)) == false && isCheck(board, true, new Position('G', 1)) == false) {
                        makeMove(figure, newPosition);
                        makeMove(board.get('H').get(0).getOccupiedFigure(), new Position('F', 1));
                        isChastle = true;
                    }
                }
            } else if (figure.isWhite() && newPosition.getNumber() == 1 && newPosition.getLetter() == 'C' && board.get('A').get(0).getOccupiedFigure().isHadMoved() == false) {
                if(board.get('B').get(0).getOccupiedFigure() == null && board.get('C').get(0).getOccupiedFigure() == null && board.get('D').get(0).getOccupiedFigure() == null) {
                    if (isCheck(board, true, figure.getPosition()) == false && isCheck(board, true, new Position('D', 1)) == false && isCheck(board, true, new Position('C', 1)) == false) {
                        makeMove(figure, newPosition);
                        makeMove(board.get('A').get(0).getOccupiedFigure(), new Position('D', 1));
                        isChastle = true;
                    }
                }
            } else if (figure.isBlack() && newPosition.getNumber() == numbers && newPosition.getLetter() == 'G' && board.get(letters.charAt(letters.length()-1)).get(numbers-1).getOccupiedFigure().isHadMoved() == false) {
                if(board.get('F').get(numbers-1).getOccupiedFigure() == null && board.get('G').get(numbers-1).getOccupiedFigure() == null) {
                    if (isCheck(board, false, figure.getPosition()) == false && isCheck(board, false, new Position('F', numbers)) == false && isCheck(board, false, new Position('G', numbers)) == false) {
                        makeMove(figure, newPosition);
                        makeMove(board.get('H').get(numbers-1).getOccupiedFigure(), new Position('F', numbers));
                        isChastle = true;
                    }
                }
            } else if (figure.isBlack() && newPosition.getNumber() == numbers && newPosition.getLetter() == 'C' && board.get('A').get(numbers-1).getOccupiedFigure().isHadMoved() == false) {
                if(board.get('B').get(numbers-1).getOccupiedFigure() == null && board.get('C').get(numbers-1).getOccupiedFigure() == null && board.get('D').get(numbers-1).getOccupiedFigure() == null) {
                    if (isCheck(board, false, figure.getPosition()) == false && isCheck(board, false, new Position('D', numbers)) == false && isCheck(board, false, new Position('C', numbers)) == false) {
                        makeMove(figure, newPosition);
                        makeMove(board.get('A').get(numbers-1).getOccupiedFigure(), new Position('D', numbers));
                        isChastle = true;
                    }
                }
            }
        }

        return isChastle;
    }

    public boolean isEnPassant(Figure figure, Position newPosition){
        boolean isEnPassant = false;

        if(figure.getType().equalsIgnoreCase("Pawn")){
            if(figure.isWhite() && figure.getPosition().getNumber() == 5){
                if(newPosition.getLetter() == figure.getPosition().getLetterBefor() && newPosition.getNumber() == figure.getPosition().getNumber()+1){
                    if(figure.validatePosition(board, newPosition, figure.isWhite())){
                        if(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().getType().equalsIgnoreCase("Pawn") && board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isBlack()){
                            if(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isCanEnPassant()){
                                capturedFigures.add(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                livingFiguresBlack.remove(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).setOccupiedFigure(null);
                                makeMove(figure, newPosition);
                                isEnPassant = true;
                            }
                        }
                    }
                } else if (newPosition.getLetter() == figure.getPosition().getLetterAfter() && newPosition.getNumber() == figure.getPosition().getNumber()+1) {
                    if(figure.validatePosition(board, newPosition, figure.isWhite())){
                        if(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().getType().equalsIgnoreCase("Pawn") && board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isBlack()){
                            if(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isCanEnPassant()){
                                capturedFigures.add(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                livingFiguresBlack.remove(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).setOccupiedFigure(null);
                                makeMove(figure, newPosition);
                                isEnPassant = true;
                            }
                        }
                    }
                }
            } else if (figure.isBlack() && figure.getPosition().getNumber() == numbers-3) {
                if(newPosition.getLetter() == figure.getPosition().getLetterBefor() && newPosition.getNumber() == figure.getPosition().getNumber()-1){
                    if(figure.validatePosition(board, newPosition, figure.isWhite())){
                        if(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().getType().equalsIgnoreCase("Pawn") && board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isWhite()){
                            if(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isCanEnPassant()){
                                capturedFigures.add(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                livingFiguresWhite.remove(board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                board.get(figure.getPosition().getLetterBefor()).get(figure.getPosition().getNumber()-1).setOccupiedFigure(null);
                                makeMove(figure, newPosition);
                                isEnPassant = true;
                            }
                        }
                    }
                } else if (newPosition.getLetter() == figure.getPosition().getLetterAfter() && newPosition.getNumber() == figure.getPosition().getNumber()-1) {
                    if(figure.validatePosition(board, newPosition, figure.isWhite())){
                        if(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().getType().equalsIgnoreCase("Pawn") && board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isWhite()){
                            if(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure().isCanEnPassant()){
                                capturedFigures.add(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                livingFiguresWhite.remove(board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).getOccupiedFigure());
                                board.get(figure.getPosition().getLetterAfter()).get(figure.getPosition().getNumber()-1).setOccupiedFigure(null);
                                makeMove(figure, newPosition);
                                isEnPassant = true;
                            }
                        }
                    }
                }
            }
        }

        return isEnPassant;
    }

    public boolean isPawnPromotion(Figure figure, Position newPosition){
        boolean isPawnPromotion = false;
        char newType;
        boolean isValidType = false;

        if(figure.getType().equalsIgnoreCase("Pawn")){
            if(figure.isWhite() && newPosition.getNumber() == numbers){
                do {
                    System.out.println("Enter the type you want to promote to. [K ... Knight, B ... Bishop, R ... Rook, Q ... Queen]");
                    newType = System.console().readLine().charAt(0);
                    for (int i = 0; i < figureTypes.length; i++) {
                        if (newType == figureTypes[i]) isValidType = true;
                    }
                }while(isValidType == false);
                pawnPromotion(figure, newPosition, newType);
                isPawnPromotion = true;
            } else if (figure.isBlack() && newPosition.getNumber() == 1) {
                do {
                    System.out.println("Enter the type you want to promote to. [K ... Knight, B ... Bishop, R ... Rook, Q ... Queen]");
                    newType = System.console().readLine().charAt(0);
                    for (int i = 0; i < figureTypes.length; i++) {
                        if (newType == figureTypes[i]) isValidType = true;
                    }
                }while (isValidType == false);
                pawnPromotion(figure, newPosition, newType);
                isPawnPromotion = true;
            }
        }

        return isPawnPromotion;
    }

    public void pawnPromotion(Figure figure, Position newPosition, char newTypeChar){
        String newType;
        Figure newFigure = null;
        if(newTypeChar == 'K') newFigure = new Knight(figure.isWhite(), figure.isBlack(), figure.getPosition());
        if(newTypeChar == 'B') newFigure = new Bishop(figure.isWhite(), figure.isBlack(), figure.getPosition());
        if(newTypeChar == 'R') newFigure = new Rook(figure.isWhite(), figure.isBlack(), figure.getPosition());
        if(newTypeChar == 'Q') newFigure = new Queen(figure.isWhite(), figure.isBlack(), figure.getPosition());
        makeMove(newFigure, newPosition);
    }

    //TODO: Add canEnPassant variable Set to the class board. Is to be set to true, if a pawn makes the first move and goes 2 squares forward and is set to false, if enpassant isn't played at the very next move.
}
