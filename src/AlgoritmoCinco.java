public class AlgoritmoCinco 
{

    public static void main(String[]args)
    {
       

        // estrutura de seleção múltipla
        int numAula = Integer.parseInt(IO.readln("Entre com um número de 1 a 4: "));
        switch (numAula) 
        {
            case 1:
                IO.println("Segunda");
                break;
            case 2:
                IO.println("terça");
                break;
            case 3:
                IO.println("quarta");
                break;
            case 4:
                IO.println("quinta");
                break;
            case 5:
                IO.println("sexta");
                break;

            default:
                
                IO.println("Número inválido!");

        }

    }
}