public class Algoritmo47 {
    //armazene 10 valores inteiro
    //IO.println    io.readln
    //imprima a média so valores

    public void main(String[]args)
    {
        int[] numeros = new int[3];
        int soma = 0;

        for(int i = 0; i <3; i++)
        {
            numeros[i] = Integer.parseInt(IO.readln("Digite o valor: "));
            soma = soma + numeros[i];
        }

        IO.println("soma: "+ soma);
        double media; 
        media = soma / 3;
        IO.println("Média é: "+media);
    }
}
