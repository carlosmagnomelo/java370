package br.com.carlos.curso.arquivos;
import java.io.FileWriter; //arquivo
import java.io.IOException; //erro
import java.sql.Date;
import java.time.LocalDateTime; //data e hora
import java.time.format.DateTimeFormatter; //formata

public class Algoritmo52 {
    public void main()
    {
        int r = 0;
        do
        {
             DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                
                //amanhã - manipular aqui..
                IO.println("digite um dúvida?");
                String duvida = IO.readln();

                String carimbo = LocalDateTime.now().format(formato);

            try(FileWriter arquivo = new FileWriter("registro.txt", true))
            {
               
                arquivo.write("[" + carimbo +"] " + duvida + "\n");
                IO.println("Registrado: [" + carimbo +"]"+ duvida);
                

            }
            catch(IOException e)
            {
              IO.println(e.getMessage());
            }

            IO.print("adicionar msg:1[sim] 0[não] ");
            r = Integer.parseInt(IO.readln());
        }
        while(r==1);
    }
}
