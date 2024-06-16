public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Produto1", "Tipo1", 10.0);
        Produto produto2 = new Produto("Produto2", "Tipo2", 20.0);

        System.out.println("Produto 1 - Nome: " + produto1.nome + ", Tipo: " + produto1.tipo + ", Valor: " + produto1.valor);
        System.out.println("Produto 2 - Nome: " + produto2.nome + ", Tipo: " + produto2.tipo + ", Valor: " + produto2.valor);
    }
}