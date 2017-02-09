
public class FilaVaziaException extends RuntimeException {
    @Override
    public String getMessage() {
        return "A fila está vazia";
    }
}
