public class Principal {
    public static void main(String[] args) {
        System.out.println("=== Exercício 1 e 2 ===");

        // Criando contatos
        Contato p1 = new Contato("Felipe", "lucas@email.com", "69 91234-5678");
        Contato p2 = new Contato("crias", "crias@email.com", "69 91234-1234");

        // Alterando o nome do primeiro contato
        p1.setNome("Lucas");
        p1.imprimeInformacoes();

        // Criando a agenda
        Agenda agenda2 = new Agenda();

        // Armazenando contatos
        agenda2.armazenarContato(p1);
        agenda2.armazenarContato(p2);

        // Imprimindo contatos da agenda
        agenda2.imprimirContatos();

        // Procurando um contato
        Contato busca = agenda2.encontrarContato("Crias");
        if (busca != null) {
            System.out.println("Contato encontrado:");
            busca.imprimeInformacoes();
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Removendo contato
        agenda2.removerContato("Lucas");
        agenda2.imprimirContatos();
    }
}