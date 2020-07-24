import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class AntlrParser {

    public static void main(String... args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("file_test.txt");

        gramatica_decafLexer decafLexer = new gramatica_decafLexer(charStream);
        decafLexer.removeErrorListeners();
        decafLexer.addErrorListener(ThrowingErrorListener.INSTANCE);

        CommonTokenStream commonTokenStream = new CommonTokenStream(decafLexer);
        gramatica_decafParser decafParser = new gramatica_decafParser(commonTokenStream);
        decafParser.removeErrorListeners();
        decafParser.addErrorListener(ThrowingErrorListener.INSTANCE);

        MainFrame frame = new MainFrame(decafParser);

        try {
            ParseTree parseTree = decafParser.program();
            System.out.println("parseTree = " + parseTree.toStringTree(decafParser));

            System.out.println("parseTree.getChild(0).getChildCount() = " + parseTree.getChild(0).getChildCount());
            System.out.println("parseTree.getChild(0).toString = " + parseTree.getChild(0).toStringTree(decafParser));

            frame.createTree(parseTree);

        }catch (Exception e){
            System.out.println("e = " + e);
            frame.error();
        }

//        ParserRuleContext parseTree = decafParser.program();



//        MainFrame frame = new MainFrame();


    }
}
