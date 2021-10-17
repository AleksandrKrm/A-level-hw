package kramarenko.module2;

public class IncorrectStringException extends Exception{
    public IncorrectStringException() {
    }

    public IncorrectStringException(String s) {
        super(s);
    }

    public IncorrectStringException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public IncorrectStringException(Throwable throwable) {
        super(throwable);
    }

    public IncorrectStringException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
