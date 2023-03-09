package simulacaodenoc;

import java.util.Scanner;

public class SimulacaoDeNoC {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos nodos a rede terá: ");
        Integer nodos = scan.nextInt();

        System.out.println("Quem é o Source? ");
        Integer source = scan.nextInt();
        System.out.println("Quem é o Target? ");
        Integer target = scan.nextInt();
        int anterior = source;

        System.out.println("Proc[" + source + "] criou a mensagem");
        while (true) {
            anterior = source;
            if (source < nodos - 1) {
                source++;
            } else {
                source = 0;
            }
            System.out.println("Proc[" + anterior + "] Enviou a mensagem para Proc[" + source + "]");
            System.out.println("Proc[" + source + "] Recebeu a mensagem de Proc[" + anterior + "]");
            if (source.equals(target)) {
                System.out.println("Proc[" + source + "] é o destino");
                System.out.println("Proc[" + source + "] consumiu a mensagem");
                return;
            } else {
                System.out.println("Proc[" + source + "] NÃO é o destino");
            }
        }
    }
}