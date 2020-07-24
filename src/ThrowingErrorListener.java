import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ThrowingErrorListener extends BaseErrorListener {

    public String error = "";

    public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        this.error = "line " + line + ":" + charPositionInLine + " " + msg;
        error_handling.error = this.error;
        throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
//        System.out.println("error = " + error);
    }
}