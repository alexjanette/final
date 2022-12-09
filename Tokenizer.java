public class Token {

    int tokenCode;
    String lexeme;
    private static final int UNKNOWN = 99
    public Token(){
        tokenCode = UNKNOWN;
        lexeme = "";
    }
    public Token(int tokenCode, String lexeme){
        this.tokenCode = tokenCode;
        this.lexeme = lexeme;
    }
    public void setTokenCode(int tokenCode){
        this.tokenCode = tokenCode;
    }
    public int getTokenCode(){ return tokenCode; }

    public void setLexeme(String lexeme){
        this.lexeme = lexeme;
    }

    public String getLexeme(){ return lexeme; }

}
