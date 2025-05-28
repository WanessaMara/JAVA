package Application.exception;

public class NutricionistaNotFoundException extends Exception{




    public NutricionistaNotFoundException() {
    }

    public NutricionistaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NutricionistaNotFoundException(String message) {
        super(message);
    }

    public NutricionistaNotFoundException(Throwable cause) {
        super(cause);
    }

    public NutricionistaNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
