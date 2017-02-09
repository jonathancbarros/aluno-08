public class FilaCheiaException extends RuntimeException {
    @Override
    public String getMessage() {
        return "A Fila está cheia";
    }
}
