public class AlgoritmoVInteNove {
    // Crie um algoritmo que armazene as vendas do ano em um vetor e mostre o total da venda anual e a média anual.

    public void main(String[]args)
    {

    double [] vendas = new double[12];
    double soma = 0;

    for(int i = 0; i < vendas.length; i++)
    {
        vendas[i] = Double.parseDouble(IO.readln("Entre com as vendas de cada mes: R$ "));
        
        
        soma = soma + vendas[i];
    }
    double media = soma / vendas.length;

    IO.println("A soma total das vendas é: " + soma);
    IO.println("A média é: " + media);




    }
}
