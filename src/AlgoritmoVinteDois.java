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

        String [] usuario = {"senai"};
        String [] senha = {"123"};
        String n = IO.readln("Insira seu usuário: ");

        boolean usuarioEncontrado = false;
        for(String nome : usuario)
        {
            System.out.println("Usuário: " + nome);
            if (nome.equals (n)) 
            {
                System.out.println("Usuário correto: " + nome );
                usuarioEncontrado = true;
                break;
            }
          
        }
        for(String pass : senha)
        {
            System.out.println("Senha: " + pass);
        }



    }
}
