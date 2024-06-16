import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        p1.setNome(nome);
        p1.setIdade(idade);
        p1.setAltura(altura);

        p1.printDados();
    }
}