import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(123, 456, "Corrente", 550.32);

        for (int i = 0; i < 10; i++) {
            double valor = Math.random() * 100.0;
            c1.decrementarSaldo(valor);
            System.out.println("Realizado saque/pagamento de: " + valor);
        }
    }
}