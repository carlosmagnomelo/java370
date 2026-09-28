public class AlgoritmoVinteUm {
    /*Considere uma lista de um vetor de 10 números:
45, 67, 89, 34, 23, 56 , 78, 98,45, 34

Agora, crie um for que percorra esses números e dentro do for uma lógica que possa 
somar esses valores e calcular a média no final. */
    public static void main(String[]args)
    {
        int [] numeros = {45, 67, 89, 34, 23, 56 , 78, 98,45, 34};
        int soma = 0;

        for(int cont : numeros)
        {
            soma += cont;
            System.out.println("Contador: " + cont);
        }
        double media = soma / numeros.length;

        System.out.println("soma: " + soma);
        System.out.println("media: " + media);
    }
}
