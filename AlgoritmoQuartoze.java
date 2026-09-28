public class AlgoritmoQuartoze {
    public static void main(String[]args)
    {
        /*Considere um menu de  um joguinho. Esse menu deverá mostrar uma mensagem personalizada.
            Se 1 : " jogo iniciado"
            Se 2: " suas vidas estão acabando"
            Se 3: "Game Over!"
            Se qualquer número fora desses números então: "Número inválido". */
        IO.println("1: Jogo iniciado");
        IO.println("2: Suas vidas estão acabando");
        IO.println("3: Game Over!");
        boolean opcaoValida = false;
       
        while (!opcaoValida) 
        {
            
        int opcao = Integer.parseInt(IO.readln("Escolhe o numero do menu: "));
            switch (opcao) 
            {
                case 1:
                    System.out.println("Jogo Iniciado");
                    opcaoValida = true;
                    break;
                case 2:
                    System.out.println("Suas vidas estão acabando");
                    opcaoValida = true;
                    break;
                case 3:
                    System.out.println("Game over!");
                    opcaoValida = true;
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        }
            
    }
}
