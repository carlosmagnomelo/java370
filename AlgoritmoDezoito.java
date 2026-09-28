public class AlgoritmoDezoito {
    public static void main(String[]args)
    {
        int [] numeros = new int[201];
        
        for(int i = 0; i < numeros.length; i++)
        {
            numeros[i] = i; // guarda até 200
        }
        for (int numero : numeros) // : significa percorrer o vetor de numeros 1, 2, 3
        {
            if (numero % 2 == 0) 
            {
                System.out.println(numero);
            }
        }


    }
}
