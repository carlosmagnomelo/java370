public class teste 
{
    public static void main(String[]args)
    {
    int numero = Integer.parseInt(IO.readln("Entre com um número: "));

        if (numero>0)
        {
            IO.println("O número é positivo: ");
        }
        else if(numero<0)
        {
            IO.println("O número é negativo!");
        }
        else
        {
            IO.println("O número é nulo");
        }

         // operador ternário
        //? - representa então
        int a = 10;
        String resultado = (a>10) ? "maior que 10" : "menor ou igual a 10";
        IO.println(resultado);
    }
}
