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
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; // formato

public class Algoritmo55 {
    public static void main(String[] args) {

        int opcao = 0;
        //código para criar os menus

        do // Testa a condição depois de rodar o bloco
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

            switch (opcao) {

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
    }


    
    // Código para cadastrar
    
    public static void cadastrar() 
    {

        IO.println("\n--- CADASTRAR AMBIENTE ---");

        IO.print("Digite o código: ");
        String codigo = IO.readln();

        IO.print("Digite o nome do ambiente: ");
        String chave = IO.readln();

        IO.print("Digite a descrição: ");
        String descricao = IO.readln();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String carimbo = LocalDateTime.now().format(formato);

        //fileWriter fecha automaticamente
        try (FileWriter arquivo = new FileWriter("registro1.txt", true)) 
        {
            arquivo.write(
                    codigo + ";" +
                    chave + ";" +
                    descricao + ";" +
                    carimbo + "\n"
            );

            IO.println("Ambiente cadastrado com sucesso!");

        } 
        catch (IOException e) 
        {
            IO.println("Erro ao salvar o ambiente." + e.getMessage());
        }
       
    }

    // LISTAR
    
    public static void listar() 
    {
        IO.println("\n--- LISTA DE AMBIENTES ---");

        try 
        {   // java.io.BufferedReader é uma classe do Java usada para ler textos de um arquivo. listar o CRUD
            // FileReader - abre o arquivo para leitura
            java.io.BufferedReader arquivo = new java.io.BufferedReader(new java.io.FileReader("registro1.txt"));

            String linha;

            while ((linha = arquivo.readLine()) != null) 
            {

                String[] dados = linha.split(";");

                if (dados.length >= 3) 
                {

                    IO.println("-------------------------");
                    IO.println("Código: " + dados[0]);
                    IO.println("Chave: " + dados[1]);
                    IO.println("Descrição: " + dados[2]);
                    

                    if (dados.length >= 4) 
                    {
                        IO.println("Cadastro: " + dados[3]);
                    }
                }
            }

            arquivo.close();

        } 
        catch (IOException e) 
        {
            IO.println("Nenhum ambiente cadastrado.");
        }
    }


    
    // PESQUISAR
   
    public static void pesquisar() 
    {

        IO.println("\n--- PESQUISAR AMBIENTE ---");

        IO.print("Digite o código: ");
        String codigoPesquisa = IO.readln();

        boolean encontrado = false;

        try // trata os erros
        {
            java.io.BufferedReader arquivo = new java.io.BufferedReader(new java.io.FileReader("registro1.txt"));

            String linha;
            //arquivo.readLine() significa "ler uma linha do arquivo
            while ((linha = arquivo.readLine()) != null) 
            {

                String[] dados = linha.split(";");

                if (dados[0].equals(codigoPesquisa)) 
                {

                    IO.println("\nAmbiente encontrado!");
                    IO.println("Código: " + dados[0]);
                    IO.println("Chave: " + dados[1]);
                    IO.println("Descrição: " + dados[2]);
                    

                    encontrado = true;
                    break;
                }
            }

            arquivo.close();

            if (!encontrado) 
            {
                IO.println("Ambiente não encontrado.");
            }

        } 
        catch (IOException e) 
        {
            IO.println("Erro ao pesquisar.");
        }
    }


    
    // EXCLUIR
    
    public static void excluir() 
    {
        IO.println("\n--- EXCLUIR AMBIENTE ---");

        IO.print("Digite o código do ambiente: ");
        String codigoExcluir = IO.readln();

        java.io.File arquivoOriginal = new java.io.File("registro1.txt");

        java.io.File arquivoTemporario = new java.io.File("temp.txt");

        boolean encontrado = false;

        try 
        {

            java.io.BufferedReader arquivo = new java.io.BufferedReader(new java.io.FileReader(arquivoOriginal));

            FileWriter temp = new FileWriter(arquivoTemporario);

            String linha;

            while ((linha = arquivo.readLine()) != null) 
            {
                String[] dados = linha.split(";");

                if (dados[0].equals(codigoExcluir)) 
                {
                    encontrado = true;
                } 
                else 
                {
                    temp.write(linha + "\n");
                }
            }

            arquivo.close();
            temp.close();

            arquivoOriginal.delete();
            arquivoTemporario.renameTo(arquivoOriginal);

            if (encontrado) 
            {
                IO.println("Ambiente excluído com sucesso!");
            } 
            else 
            {
                IO.println("Ambiente não encontrado.");
            }

        } 
        catch (IOException e) 
        {
            IO.println("Erro ao excluir o ambiente.");
        }
    }


    
    // ALTERAR
    
    public static void alterar() 
    {

        IO.println("\n--- ALTERAR AMBIENTE ---");

        IO.print("Digite o código do ambiente: ");
        String codigoAlterar = IO.readln();

        java.io.File arquivoOriginal =
                new java.io.File("registro1.txt");

        java.io.File arquivoTemporario =
                new java.io.File("temp.txt");

        boolean encontrado = false;

        try 
        {

            java.io.BufferedReader arquivo =
                    new java.io.BufferedReader(
                            new java.io.FileReader(arquivoOriginal));

            FileWriter temp =
                    new FileWriter(arquivoTemporario);

            String linha;

            while ((linha = arquivo.readLine()) != null) 
            {

                String[] dados = linha.split(";");

                if (dados[0].equals(codigoAlterar)) 
                {
                    encontrado = true;

                    IO.print("Novo nome do ambiente: ");
                    String novoChave = IO.readln();

                    IO.print("Nova descrição: ");
                    String novaDescricao = IO.readln();

                    

                    temp.write(
                            dados[0] + ";" +
                            novoChave + ";" +
                            novaDescricao + ";" +
                            dados[3] + "\n"
                    );

                } 
                else 
                {
                    temp.write(linha + "\n");
                }
            }

            arquivo.close();
            temp.close();

            arquivoOriginal.delete();
            arquivoTemporario.renameTo(arquivoOriginal);

            if (encontrado) 
            {
                IO.println("Ambiente alterado com sucesso!");
            } 
            else 
            {
                IO.println("Ambiente não encontrado.");
            }

        } 
        catch (IOException e) 
        {
            IO.println("Erro ao alterar o ambiente.");
        }
    }
}