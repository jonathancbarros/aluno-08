
public class Fila {

    private int tamanhoAtual;
    private int [] fila;
    private int fim;
    private int inicio;
    private int capacidade;

    public Fila(int capacidade) {
        if(capacidade > 0 && capacidade < Integer.MAX_VALUE) {
            this.fila = new int[capacidade];
            this.capacidade = capacidade;
        } else {
            this.fila = new int[10];
            this.capacidade = 10;
        }
        initAtributos();
    }

    private void initAtributos() {
        tamanhoAtual = 0;
        fim = -1;
        inicio = 0;
    }

    private boolean temEspaco() {
        return fim < capacidade - 1;
    }

    public void add(int elemento) {
        if(temEspaco()) {
            fila[++fim] = elemento;
            tamanhoAtual++;
        } else {
            throw new RuntimeException("A Fila está cheia");
        }
    }

    public boolean empty() {
        return fim < inicio;
    }

    public int size () {
        return tamanhoAtual;
    }

    public int remove() {

        if(empty())
            throw new RuntimeException("A fila está vazia");

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

    public String print() {
        if(empty())
            throw new RuntimeException("A fila está vazia");

        String texto = "";
        for (int i = inicio; i <= fim; i++) {
            texto += fila[i];
            if((i + 1) != tamanhoAtual) {
                texto += ", ";
            }
        }
        initAtributos();

        return texto;
    }

    public int element() {
        if(empty())
            throw new RuntimeException("A fila está vazia");

        return fila[inicio];
    }

    public int getCapacidade() {
        return capacidade;
    }
}
