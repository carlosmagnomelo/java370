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
package br.com.carlos.curso.arquivos;

import java.io.FileWriter; //arquivo
import java.io.IOException; // erro
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; // formato

public class Algoritmo55 {
    public void main()
    {
        int r = 0;
        do
        {
            IO.println("\n--- DICIONÁRIO DE AMBIENTES ---");
            IO.println("1. Cadastrar");
            IO.println("2. Listar");
            IO.println("3. Pesquisar");
            IO.println("4. Excluir");
            IO.println("5. Alterar");
            IO.println("6. Sair");



            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            IO.println("digite uma dúvida? ");
            String duvida = IO.readln();

            String carimbo = LocalDateTime.now().format(formato);

            try(FileWriter arquivo = new  FileWriter("registro1.txt", true))
            {
                arquivo.write("[" + carimbo + "]" + duvida + "\n");
                IO.println("Registrado: [" + carimbo +"]" + duvida);
            }
            catch(IOException e)
            {
                IO.println(e.getMessage());// mostra o erro para tentar corrigir. para o usuário mostra uma mensagem amigável
            }

            IO.print("adicionar msg: 1[sim] 0[não]");
            r = Integer.parseInt(IO.readln());
        }
        while(r==1);

    }
}
