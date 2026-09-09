public class AlgoritmoDez {
    public static void main(String[]args)
    {
        //Entrar com dois numeros reais e imprimir a media aritmética com a mensagem media antes do resultado
        double numero1 = Double.parseDouble(IO.readln("digite um numero real: "));
        double numero2 = Double.parseDouble(IO.readln("digite o numero 2 real: "));
        double media;

        media = (numero1 + numero2) / 2;

        IO.println("Média");
        IO.println("Resultado: " + media);
        
    }
}
