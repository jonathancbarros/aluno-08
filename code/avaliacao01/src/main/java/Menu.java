import java.util.Scanner;

public class Menu {

    public void run() {

        Scanner input = new Scanner(System.in);

        Fila fila = new Fila(input.nextInt());
        input.nextLine();

        boolean loop = true;
        while(loop) {
            String[] command = input.nextLine().split(" ");

            if(command[0].equals("add")) {
                fila.add(Integer.parseInt(command[1]));
            } else if(command[0].equals("remove")) {
                System.out.println(fila.remove());
            } else if(command[0].equals("element")) {
                System.out.println(fila.element());
            } else if(command[0].equals("size")) {
                System.out.println(fila.size());
            } else if(command[0].equals("print")) {
                System.out.println(fila.print());
            } else if(command[0].equals("quit")) {
                System.out.println("Programa fechado.");
                loop = false;
            } else {
                System.out.println("Instrução não encontrada.");
            }
        }
    }
}
