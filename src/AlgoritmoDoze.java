public class AlgoritmoDoze {
    public static void main(String[]args)
    {
        
       /*Crie um algoritmo que leia um número e mostre se esse número é par ou impar...
        O resto da divisão:   %

        >
        <=
        >=
        <=
        ==
        !=

        +
        -
        *
        /
        %  */

        int numero = Integer.parseInt(IO.readln("Insira um número: "));
        
        if (numero % 2 == 0) 
        {
            IO.println(numero + " é par");
        }
        else 
        {
            IO.println(numero + " é impar");
        }
        
        
    }
}
