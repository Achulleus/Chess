public class Position {
    private char letter;
    private int number;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Position(char letter, int number){
        this.letter = letter;
        this.number = number;
    }

    public char getLetterBefor(){
        int z = (int) getLetter();
        z = z -1;
        char res = (char) z;
        return res;
    }

    public char getLetterBefor(int i){
        int z = (int) getLetter();
        z = z - i;
        char res = (char) z;
        return res;
    }

    public char getLetterAfter(){
        int z = (int) getLetter();
        z++;
        char res = (char) z;
        return res;
    }

    public char getLetterAfter(int i){
        int z = (int) getLetter();
        z = z + i;
        char res = (char) z;
        return res;
    }
}
