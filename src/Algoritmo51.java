public class Algoritmo51 {
    //criar uma calc
    // que só tem a operação de divisão

    // tratar uma exceção de um nmero dividindo por zero
    // use o robozinho

    public void main()
    {
        int numero1 = 2;
        int numero2 = 0;
        
        try
        {
            numero1 = Integer.parseInt(IO.readln("Digite o numero 1: "));
            numero2 = Integer.parseInt(IO.readln("Digite o numero 2: "));
            
            //  SOMA
            int soma = numero1 + numero2;
            IO.println(" Soma: " + soma);

            // SUBTRAÇÃO
            int subtracao = numero1 - numero2;
            IO.println(" Subtração: " + subtracao);

            //  MULTIPLICAÇÃO
            int multiplicacao = numero1 * numero2;
            IO.println(" Multiplicação: " + multiplicacao);

            //  DIVISÃO
            int divisao; 
            divisao = numero1 / numero2;
            IO.println("Resultado: " + divisao);
        }

        catch(ArithmeticException erro)
        {
            IO.println("opa! Não é possível dividir um número por zero.");
            IO.println("Detalhe do erro: " + erro.getMessage());
        }
        catch(NumberFormatException e)
        {
            //erro
            IO.println("😒😒"+e.getMessage()+"valor inválido.digite um número");
        }
        IO.println("Programa continua normalmente...");
    }
}
