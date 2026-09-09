public class AlgoritmoTreze {
    /*Crie um algoritmo usando if , else if encadeado. 
    1 - O algoritmo inicialmente vai pedir para o usuário digitar um número. 
    2 - Depois ele vai pedir para digitar um segundo número. 
    3 - Sua missão é criar uma lógica no algoritmo que identifique qual é o número maior e menor. 
    Ao final mostre quem é o maior e o menor.

Operadores aritméticos: + / *  % -
Operadores relacionais: > <  >= <= == !=
Operadores lógicos: && (E) , II (OU) , !  (NÃO) 
    */

    public static void main(String[]args)
    {
        int numero1 = Integer.parseInt(IO.readln("digite um número 1: "));
        int numero2 = Integer.parseInt(IO.readln("digite um número 2: "));
        

        if (numero1 > numero2) 
        {
            IO.println( "Número Maior: " + numero1);
            IO.println( "Número Menor: " + numero2);
        }
        else if (numero1 < numero2) 
        {
             IO.println( "Número Menor: " + numero1);
             IO.println( "Número Maior: " + numero2);
        }
    
        
        else if (numero2 > numero1) 
        {
            IO.println("Número Maior: " + numero2);
            IO.println( "Número Menor: " + numero1);
        }
        else if (numero1 < numero2) 
        {
             IO.println( "Número Menor: " + numero2);
             IO.println("Número Maior: " + numero1);
        }
      
        
        
    }
}
