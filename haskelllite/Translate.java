import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Vector;

public class Translate {

    public static void main(String[] args) throws Exception {

        String inputFile = null;

        if (args.length > 0 )
            inputFile = args[0];

        InputStream is = System.in;

        if (inputFile != null ) is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);

        HaskellLexer lexer = new HaskellLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        HaskellParser parser = new HaskellParser(tokens);

        ParseTree tree = parser.program();

        ParseTreeWalker walker = new ParseTreeWalker();

        HaskListener translate = new HaskListener(parser);

        walker.walk(translate, tree);



    }
    
}
