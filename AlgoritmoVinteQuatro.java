public class AlgoritmoVinteQuatro {

    public static void main(String[]args)
    {
        int [] numeros = new int[5];

        for(int i = 0; i < numeros.length; i++)
        {
            numeros[i] = Integer.parseInt(IO.readln("Entre com o número: "));

        }

        for(int i = 0; i < numeros.length; i++)
        {
            IO.println("Variavel: " + (i+1) + " = " + numeros[i]);
        }




    }
}