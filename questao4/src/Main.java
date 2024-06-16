public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(5);

        agenda.adicionarContato(new Contato("Joshuel", "123456789"));
        agenda.adicionarContato(new Contato("Jonathan", "987654321"));
        agenda.adicionarContato(new Contato("João", "456123789"));

        agenda.imprimirContatos();
    }
}