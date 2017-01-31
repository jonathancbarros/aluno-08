
public class Fila {

    private int tamanhoAtual = 0;
    private int[] fila;

    public Fila(int capacidade) {
        this.fila = capacidade > 0 ? new int[capacidade] : new int[10];
    }

    private boolean checarCapacidadeAtual() {
        return tamanhoAtual < fila.length;
    }

    public void add(int elemento) {
        if(checarCapacidadeAtual()) {
            fila[tamanhoAtual++] = elemento;
        } else {
            System.out.println("A fila já está cheia.");
        }
    }

    public boolean empty() {
        return tamanhoAtual == 0;
    }

    public int size () {
        return tamanhoAtual;
    }

    public int remove() {
        if(empty()) {
            throw new FilaVaziaException();
        }
        return fila[tamanhoAtual--];
    }

    public void print() {
        if(empty()) {
            throw new FilaVaziaException();
        }

        for(int i = 0; i < tamanhoAtual; i++) {
            System.out.print(fila[i]);
            if((i + 1) != tamanhoAtual) {
                System.out.print(", ");
            }
        }
    }

    public int element() {
        if(empty()) {
            throw new FilaVaziaException();
        }
        return fila[0];
    }
}
