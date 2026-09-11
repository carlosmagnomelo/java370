public class AlgoritmoVinteDois {
    public static void main(String[]args)
    {
        /*O Banco SENATECH é um banco que auxilia ex-alunos que implementa e desenvolve Startups. 
        A SENATECH quer que você desenvolva de forma simples um sistema que recebe a usuário e a senha (para teste considere usuario:senai senha:123). 
        A lógica funciona assim: 
        se ele errar três vezes você deve bloquear o cartão e pedir para ele procurar o gerente caso contrário abra uma janela perguntando : 
        quando deseja simular de empréstimo.  
        O empréstimo máximo é 20.000. 
        Pergunte a quantidade de parcelas e mostre o valor das parcelas com juros de 1% ao mês. 
        As parcelas podem ser divididas em até 10 meses. 
        Mostre o valor total do financiamento, o valor financiado e a mensagem "Parabéns, seja bem vindo a família SENATECH. */

        int tentativas = 0;
        while (tentativas < 3) 
        {
            String nome = IO.readln("digite seu usuario: ");
            String senha = IO.readln("digite sua senha: ");

            if (nome.equals("senai")) 
            {
              System.out.println("login com sucesso");
              break;   
            }
            else
            {
                tentativas++;
                System.out.println("login e senha errada! tente novamente: " + tentativas + "/3\n");
            }
        }

        if (tentativas == 3)     
        {
            System.out.println("cartão bloqueado");    
        }
    }
}
