public class AlgoritmoSete 
{
    public static void main(String[]args)
    {
        int numero1 = Integer.parseInt(IO.readln("Digite seu número 1: "));
        int numero2 = Integer.parseInt(IO.readln("Digite seu número 2: "));
        int soma;

        soma = numero1 + numero2;

        IO.println("Soma: "  + numero1 + "+" + numero2);
        IO.println("Resultado: " + soma);

    }
}
