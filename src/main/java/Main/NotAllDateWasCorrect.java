package Main;

public class NotAllDateWasCorrect extends RuntimeException {
    public NotAllDateWasCorrect(String key) {
        super("Не все данные были введены корректно " + key);
    }
}
