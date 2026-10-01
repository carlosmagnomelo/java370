package br.com.carlos.curso.arquivos;
import java.util.HashMap;
import java.util.Map;

public class Algoritmo53 {
    public void main()
    {
        //json - (chave, valor) - JS
        //Dictionary (obsoleta) - Legado
        // <> generics
        Map<String,Estudante> estudantes = new HashMap<>();

        IO.println("Java Doctor");
        Estudante e1 = new Estudante("JP","ADS", 2025);
        estudantes.put("MAT-123", e1);

        Estudante e2 = new Estudante("Elias", "Ciencias", 2023);
        estudantes.put("MAT-1224", e2);

        Estudante e3 = new Estudante("Daniel", "publicidade e propaganda", 2016);
        estudantes.put("MAT-1225", e3);

        Estudante e4 = new Estudante("Maria", "ADS", 2028);
        estudantes.put("MAT-1226", e4);
        // lista todos os estudantes cadastrados
        //Buscar um estudante pela matrícula

         

        for(Estudante e : estudantes.values())
        {
            //IO.println(e);
        }
        for(String matriculas : estudantes.keySet())
        {
            matriculas = IO.readln("Digite a Matrícula: ");
            Estudante e = estudantes.get(matriculas);
            IO.println(matriculas + "->" + e);

            if (matriculas !=null) 
            {
                IO.println("Busca encontrada: " + matriculas);
            }
            else 
            {
                IO.println("Digitou a matrícula errada| Agora digite a certa! ");
            }
        }
    }
}
