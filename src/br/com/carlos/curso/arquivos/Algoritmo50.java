package br.com.carlos.curso.arquivos;
public class Algoritmo50 {
    void main()
    {
        try // tentar
        {
        int idade = Integer.parseInt(IO.readln("Digite sua idade: "));
        String resultado = (idade >= 18) ? "maior" : "menor";
        IO.println(resultado);
        }
        catch(NumberFormatException e)
        {
            //erro
            IO.println("😒😒"+e.getMessage()+"valor inválido.digite um número");
        }
        finally
        {
            //conclusão
            IO.println("Independente da Onça, estou aqui!");
        }
    }
}
