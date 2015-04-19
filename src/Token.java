
/**
 *
 * @author Eric, Andew, Karl
 */
public class Token {

    public String lexeme;
    public int row, colomn;
    public Type type;
    
    public Token() {
        lexeme = "";
        type = null;
        row = 0;
        colomn = 0;
    }
    
    public String getLexeme() {
        return lexeme;
    }

    public Type getType() {
        return type;
    }
    
    public int getLineNumber() {
        return row;
    }

    public int getColomnNumber() {
        return colomn;
    }

}
