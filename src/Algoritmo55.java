    //desafio
    /*
       Considerando a aula da lógica aristotélica e os programas
       de fluxograma e pseudocódigo a saber:

       https://visualgo.net/en
       https://csvistool.com/
       https://www.geeksforgeeks.org/
       FAQ do professor nesse repositório: faq_logica.pdf   
    
    */
   // Crie um arquivo que possa armazenar valores de um dicionário
   // Map (Interface) - HashMap (Classe)
   // Ambiente- Laboratório de Programação Java 
   // Chave: F07
   // Chave: F07 Descrição: "Laboratório de Programação Java"
   // Chave: B03 Descrição: "Sala de Aula Padrão"
   // Chave: G09 Descrição: "Oficina de Laternagem e Pintura"

   /*
     Problema: Criar um cadastro de um dicionário de ambientes
     esse cadastro deverá armazenar em um arquivo .txt
     Deverá ter um loop (do while ) com um menu de opções.
     //cadastrar
     //listar
     //pesquisar
     //excluir
     //alterar
     //sair
   */

     /*
           Avaliação de Capacidades
           (cada item: 3,10 pontos)
           - Elaborar e Explicar um Try Catch Finally (Seg)
           - Uso de JOptionPane ou JFrame ou outros SWING
           - Elaborar e Explicar DateTimeFormatter (Ter)
           - Elaborar e Explicar LocalDateTime (Ter)
           - Elaborar e Explicar FileWriter (Ter)
           - Elaborar e Explicar HashMap (Qua)
           - Elaborar e Explicar Map (Qua)
           - Elaborar e Explicar a Organização do Código (Qui)
         
         
         */
    

import java.io.FileWriter; //arquivo
import java.io.IOException; // erro
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; // formato
import java.util.HashMap;
import java.util.Map;

public class Algoritmo55 {
    
    private static Map<String, Chave> chaves = new HashMap<>();

    public static void main(String[] args) {
        
        // Inicialização com os 3 ambientes padrão
        chaves.put("F07", new Chave("Laboratório de Programação Java"));
        chaves.put("B03", new Chave("Sala de Aula Padrão"));
        chaves.put("G09", new Chave("Oficina de Laternagem e Pintura"));

        int opcao;
        
        do 
        { 
            IO.println("\n--- DICIONÁRIO DE AMBIENTES ---");
            IO.println("1. Cadastrar");
            IO.println("2. Listar");
            IO.println("3. Pesquisar");
            IO.println("4. Excluir");
            IO.println("5. Alterar");
            IO.println("6. Sair");

            IO.println("\n --- Ambiente- Laboratório de Programação Java ---");
            IO.println("\n 3 tipos de chaves para a escolha");
            IO.println("Chave: F07 Descrição: Laboratório de Programação Java");
            IO.println("Chave: B03 Descrição: Sala de Aula Padrão");
            IO.println("Chave: G09 Descrição: Oficina de Laternagem e Pintura");

            IO.print("Digite uma opção: ");
            opcao = Integer.parseInt(IO.readln());

            switch (opcao) 
            {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    pesquisar();
                    break;
                case 4:
                    excluir();
                    break;
                case 5:
                    alterar();
                    break;
                case 6:
                    IO.println("Programa encerrado!");
                    break;
                default:
                    IO.println("Opção inválida!");
            }

        } while (opcao != 6);

        // Bloco final executado após sair do menu
        IO.println("------------------ Ambiente- Laboratório de Programação Java ------------------");

        IO.println("\n--- CHAVES CADASTRADAS ---");
        for (String chave : chaves.keySet()) {
            Chave c = chaves.get(chave);
            IO.println(chave + " -> " + c);
        }

        IO.println("\n--- PESQUISAR CHAVE ---");
        String numero = IO.readln("Digite a Chave: ");

        Chave c = chaves.get(numero);

        if (c != null) {
            IO.println("Busca encontrada!");
            IO.println(numero + " -> " + c);
        } else {
            IO.println("Digitou a CHAVE errada!");
            IO.println("Chave não encontrada.");
        }
    }

    // --- MÉTODOS DO SWITCH ---

    public static void cadastrar() 
    {
        IO.println("\n--- CADASTRAR ---");
        IO.print("Digite a nova chave: ");
        String novaChave = IO.readln();
        IO.print("Digite a descrição: ");
        String novaDesc = IO.readln();
        
        chaves.put(novaChave, new Chave(novaDesc));
        IO.println("Ambiente adicionado!");
    }

    public static void listar() 
    {
        IO.println("\n--- LISTAGEM ATUAL ---");
        for (String chave : chaves.keySet()) {
            IO.println(chave + " -> " + chaves.get(chave).getDescricao());
        }
    }

    public static void pesquisar() 
    {
        IO.println("\n--- PESQUISA ---");
        IO.print("Digite a chave: ");
        String busca = IO.readln();
        if (chaves.containsKey(busca)) {
            IO.println("Encontrado: " + chaves.get(busca).getDescricao());
        } else {
            IO.println("Não encontrado!");
        }
    }

    public static void excluir() 
    {
        IO.println("\n--- EXCLUIR ---");
        IO.print("Digite a chave para remover: ");
        String remover = IO.readln();
        if (chaves.remove(remover) != null) {
            IO.println("Removido com sucesso.");
        } else {
            IO.println("Chave inexistente.");
        }
    }

    public static void alterar() 
    {
        IO.println("\n--- ALTERAR ---");
        IO.print("Digite a chave para alterar: ");
        String alterarChave = IO.readln();
        Chave c = chaves.get(alterarChave);
        if (c != null) {
            IO.print("Nova descrição: ");
            c.setDescricao(IO.readln());
            IO.println("Alterado com sucesso.");
        } else {
            IO.println("Chave não cadastrada.");
        }
    }
       
}