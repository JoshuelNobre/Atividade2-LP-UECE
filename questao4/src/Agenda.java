public class Agenda {
    private Contato[] contatos;
    private int quantidadeContatos;

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
        quantidadeContatos = 0;
    }

    public void adicionarContato(Contato novoContato) {
        if (quantidadeContatos < contatos.length) {
            contatos[quantidadeContatos] = novoContato;
            quantidadeContatos++;
        } else {
            System.out.println("A agenda está toda lotada!");
        }
    }

    public void imprimirContatos() {
        for (int i = 0; i < quantidadeContatos; i++) {
            System.out.println("Nome: " + contatos[i].getNome() + ", Telefone: " + contatos[i].getTelefone());
        }
    }
}