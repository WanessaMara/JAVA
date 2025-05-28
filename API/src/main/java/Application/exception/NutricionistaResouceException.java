package Application.exception;

public class NutricionistaResouceException extends Exception{

    public NutricionistaResouceException() {
    }

    public NutricionistaResouceException(String message) {
        super(message);
    }

    public NutricionistaResouceException(String message, Throwable cause) {
        super(message, cause);
    }

    public NutricionistaResouceException(Throwable cause) {
        super(cause);
    }

    public NutricionistaResouceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
