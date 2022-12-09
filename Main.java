import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

       Token nextToken = new Token();
       Lexer newLex = new Lexer();

       newLex.setToken(nextToken);

       File inputFile = new File("file.txt");
       if(inputFile.exists()){
           FileReader fileReader = new FileReader(inputFile);
           BufferedReader buffer = new BufferedReader(fileReader);

           while (nextToken.getTokenCode() != -1) {
               nextToken = newLex.getToken(buffer);
               if(nextToken.getTokenCode()!=-1){
                   System.out.println("Next token: "+ nextToken.getTokenCode() 
                                      + " Next lexeme: "+ nextToken.getLexeme());

               }else{
                   nextToken.setLexeme("EOF");
                   System.out.println("Next token: "+ nextToken.getTokenCode() 
                                      + " Next lexeme: " + nextToken.getLexeme());
               }
           }
       }else{
           System.out.println("File error");
       }
    }
}
