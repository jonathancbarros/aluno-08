
public class Fila {

    private int tamanhoAtual = 0;
    private int[] fila;
    private int fim = -1;
    private int inicio = 0;
    private int capacidade;

    public Fila(int capacidade) {
        if(capacidade > 0 && capacidade < Integer.MAX_VALUE) {
            this.fila = new int[capacidade];
            this.capacidade = capacidade;
        } else {
            this.fila = new int[10];
            this.capacidade = 10;
        }
    }

    private boolean checarCapacidadeAtual() {
        return fim < capacidade - 1;
    }

    public void add(int elemento) {
        if(checarCapacidadeAtual()) {
            fila[++fim] = elemento;
            tamanhoAtual++;
        } else {
            throw new FilaCheiaException();
        }
    }

    public boolean empty() {
        return fim < inicio;
    }

    public int size () {
        return tamanhoAtual;
    }

    public int remove() {

        if(empty()) {
            throw new FilaVaziaException();
        }

        int elemento = fila[inicio];

        inicio++;
        tamanhoAtual--;

        int j = 0;
        int[] filaSubstituta = new int[capacidade];
        for(int i = inicio; i <= fim; i++) {
            filaSubstituta[j++] = fila[i];
        }
        fim = fim - inicio;
        inicio = 0;

        fila = filaSubstituta;
        return elemento;
    }

    public void print() {
        if(empty()) {
            throw new FilaVaziaException();
        }
        for (int i = inicio; i <= fim; i++) {
            System.out.print(fila[i]);
            if((i + 1) != tamanhoAtual) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public int element() {
        if(empty()) {
            throw new FilaVaziaException();
        }
        return fila[inicio];
    }

    public int getCapacidade() {
        return capacidade;
    }
}
