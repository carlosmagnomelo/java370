
import java.util.HashMap;
import java.util.Map;

public class Laboratorio {
    // Crie um arquivo que possa armazenar valores de um dicionário
   // Map (Interface) - HashMap (Classe)
   // Ambiente- Laboratório de Programação Java 
   // Chave: F07
   // Chave: F07 Descrição: "Laboratório de Programação Java"
   // Chave: B03 Descrição: "Sala de Aula Padrão"
   // Chave: G09 Descrição: "Oficina de Laternagem e Pintura"

   public void main()
   {
        //json - (chave, valor) - JS
        //Dictionary (obsoleta) - Legado
        // <> generics

        IO.println("------------------ Ambiente- Laboratório de Programação Java ------------------");
        Map<String,Chave> chaves = new HashMap<>();

        
        Chave chave1 = new Chave("Laboratório de Programação Java");
        chaves.put("F07", chave1);

        Chave chave2 = new Chave("Sala de Aula Padrão");
        chaves.put("B03", chave2);

        Chave chave3 = new Chave("Oficina de Laternagem e Pintura");
        chaves.put("G09", chave3);

        
        // lista todos as chaves cadastradas
        //Buscar um chave

        IO.println("\n--- CHAVES CADASTRADAS ---");

        for (String chave : chaves.keySet()) 
        {
            Chave c = chaves.get(chave);

            IO.println(chave + " -> " + c);
        }
        IO.println("\n--- PESQUISAR CHAVE ---");

        String numero = IO.readln("Digite a Chave: ");

        Chave c = chaves.get(numero);


        // Verifica se encontrou
        if (c != null) {

            IO.println("Busca encontrada!");
            IO.println(numero + " -> " + c);

        } else {

            IO.println("Digitou a CHAVE errada!");
            IO.println("Chave não encontrada.");
        }
   }
}
