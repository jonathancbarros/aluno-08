import java.util.ArrayList;

public class Fila {

    private int capacidade;
    private ArrayList<Integer> fila;

    public Fila(int capacidade) {
        if(capacidade > 0 && capacidade < Integer.MAX_VALUE) {
            this.capacidade = capacidade;
        } else {
            this.capacidade = 10;
        }
        inicializarFila();
    }

    private void inicializarFila() {
        this.fila = new ArrayList<Integer>();
    }

    private boolean temEspaco() {
        return fila.size() < capacidade;
    }

    public void add(int elemento) {
        if(temEspaco()) {
            fila.add(size(), elemento);
        } else {
            throw new RuntimeException("A Fila está cheia");
        }
    }

    public boolean empty() {
        return fila.isEmpty();
    }

    public int size () {
        return fila.size();
    }

    public int remove() {
        if(empty())
            throw new RuntimeException("A fila está vazia");

        int elemento = fila.get(0);
        fila.remove(0);
        return elemento;
    }

    public String print() {
        if(empty())
            throw new RuntimeException("A fila está vazia");

        String texto = "";
        for (int i = 0; i <= fila.size() - 1; i++) {
            texto += fila.get(i);
            if(i != fila.size() - 1) {
                texto += ", ";
            }
        }
        inicializarFila();

        return texto;
    }

    public int element() {
        if(empty())
            throw new RuntimeException("A fila está vazia");

        return fila.get(0);
    }

    public int getCapacidade() {
        return capacidade;
    }
}
