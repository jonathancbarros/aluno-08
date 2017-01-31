
public class Fila {

    private int tamanhoAtual = 0;
    private int[] fila;
    private int topo = -1;
    private int calda = 0;
    private int capacidade;

    public Fila(int capacidade) {
        if(capacidade > 0) {
            this.fila = new int[capacidade];
            this.capacidade = capacidade;
        } else {
            this.fila = new int[10];
            this.capacidade = 10;
        }
    }

    private boolean checarCapacidadeAtual() {
        return topo < capacidade - 1;
    }

    public void add(int elemento) {
        if(checarCapacidadeAtual()) {
            fila[++topo] = elemento;
            tamanhoAtual++;
        } else {
            System.out.println("A fila já está cheia.");
        }
    }

    public boolean empty() {
        return topo < calda;
    }

    public int size () {
        return tamanhoAtual;
    }

    public void remove() {
        if(empty()) {
            throw new FilaVaziaException();
        }

        element();
        calda++;
        tamanhoAtual--;

        int j = 0;
        int[] filaSubstituta = new int[capacidade];
        for(int i = calda; i <= topo; i++) {
            filaSubstituta[j++] = fila[i];
        }
        topo = topo - calda;
        calda = 0;

        fila = filaSubstituta;
    }

    public void print() {
        if(empty()) {
            throw new FilaVaziaException();
        }
        for (int i = calda; i <= topo; i++) {
            System.out.print(fila[i]);
            if((i + 1) != tamanhoAtual) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void element() {
        if(empty()) {
            throw new FilaVaziaException();
        }
        System.out.println(fila[calda]);
    }
}
