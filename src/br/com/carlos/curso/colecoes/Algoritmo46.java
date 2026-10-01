package br.com.carlos.curso.colecoes;
import java.util.ArrayList;
import java.util.List;


public class Algoritmo46 {
    public void main()
    {
        // <> - generics dá velocidade
        //list 
        //dictionary 
        // pesquisa: 4 interfaces e 4 classes da colection
        /*

        Interface -> Classe que implementa | Estrutura
        List -> 	ArrayList	Lista
        Set	HashSet	Conjunto
        Queue	PriorityQueue	Fila
        Map	HashMap	Chave → valor

         */

        List<String> frutas = new ArrayList<>();

        frutas.add("Goiaba");
        frutas.add("Amora");
        frutas.add("Melancia");
        frutas.add("Mamão");

        IO.println("Primeira fruta: " + frutas.get(0));
        IO.println(frutas);
        frutas.set(1, "uva");
        //IO.println("Segunda fruta" +  );
        for(String fruta : frutas)
        {
            IO.println("Elemento "+fruta);
        }
        IO.println("total: " + frutas.size()); //consegue ver a quantidade de frutas
        frutas.remove("Mamão");
        IO.println("tamanho: " + frutas.size());
        IO.println("Lista" + frutas);
    }
}
