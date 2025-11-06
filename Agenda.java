import java.util.ArrayList;

public class Agenda {
    // Lista para armazenar os contatos
    private ArrayList<Contato> contatos;

    // Construtor
    public Agenda() {
        contatos = new ArrayList<>();
    }

    // Método para armazenar contato
    public void armazenarContato(Contato contato) {
        contatos.add(contato);
        System.out.println("Contato adicionado: " + contato.getNome());
    }

    // Método para remover contato pelo nome
    public void removerContato(String nome) {
        boolean removido = false;
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatos.remove(c);
                System.out.println("Contato removido: " + nome);
                removido = true;
                break;
            }
        }
        if (!removido) {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    // Método para encontrar contato pelo nome
    public Contato encontrarContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    // Método para imprimir todos os contatos
    public void imprimirContatos() {
        System.out.println("\n--- Lista de Contatos ---");
        for (Contato c : contatos) {
            c.imprimeInformacoes();
        }
    }
}