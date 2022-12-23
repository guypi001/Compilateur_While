import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        projetLexer lex = new projetLexer(new ANTLRFileStream("/home/guypi/Documents/Compilateur_While/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        projetParser g = new projetParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}