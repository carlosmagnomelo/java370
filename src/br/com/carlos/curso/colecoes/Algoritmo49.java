package br.com.carlos.curso.colecoes;
import java.util.ArrayList;
import java.util.List;

public class Algoritmo49 {

    // crie um algoritmo que pergunte?
    /*
        IO.println(qual laboratorio quer adionar) 
        leia o laboratorio do usuario
        o laboratorio é String tipo:  F03, F05, F07.
    */
   //crie um loop 1- adicionar 2-sair
   //mostre no final a quantidade de laboratirio adicionado
   //mostre todos os laboratorios
   //List<String> laboratorios = ArrayList<>();

   public void main()
   {
            

        // Inicializa a lista de laboratórios
        List<String> laboratorios = new ArrayList<>();
        String opcao = "";

        // Loop do menu: 1- Adicionar, 2- Sair
        while (!opcao.equals("2")) 
        {
            IO.println("--- MENU ---");
            IO.println("1 - Adicionar laboratório");
            IO.println("2 - Sair");
            
            // Lê a opção do usuário usando a nova API de IO do Java
            opcao = IO.readln("Escolha uma opção: ").trim();

            if (opcao.equals("1")) {
                // Pergunta e lê o laboratório usando readln
                String laboratorio = IO.readln("Qual laboratorio quer adicionar? (Ex: F03): ").trim();
                
                // Adiciona o laboratório na lista
                laboratorios.add(laboratorio);
                IO.println("Laboratório " + laboratorio + " adicionado com sucesso!\n");
                
            } else if (!opcao.equals("2")) {
                IO.println("Opção inválida! Tente novamente.\n");
            }
        }

        // Mostra o resultado final após sair do loop
        IO.println("\n--- RESULTADO FINAL ---");
        // Mostra a quantidade de laboratórios adicionados
        IO.println("Quantidade de laboratórios adicionados: " + laboratorios.size());
        
        // Mostra todos os laboratórios cadastrados
        IO.println("Laboratórios cadastrados: " + laboratorios);
    }
   
}