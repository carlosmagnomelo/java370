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

            if (nome.equals("senai") && senha.equals("123")) 
            {
                System.out.println("login com sucesso");
                
                break;   //serve para sair do sistema
              
            }
          
            else
            {
                tentativas++;
                System.out.println("login e senha errada! tente novamente: " + tentativas + "/3\n");
            }
        }
            
        if (tentativas == 3)     
        {
            System.out.println("cartão bloqueado, procure o gerente!");
            return;    
        }

        // Emprestimo
        IO.println("\n----- SENATECH -----");
        IO.println("Bem-vindo ao simulador de empréstimo");

        // VALIDAÇÃO DO VALOR
        double valor = Double.parseDouble(IO.readln("Digite o valor do emprestimo R$ "));
        if (valor <=0 || valor > 20000) 
        {
            IO.println("Valor invalido");
            IO.println("O emprestimo máximo é R$ 20.000");
            return;
        }
        // PARCELAS
        int parcelas = Integer.parseInt(IO.readln("DIgite a quantidade de parcelas. Maximo 10 meses: "));
        // VALIDAÇÃO DAS PARCELAS
        if (parcelas <=0 || parcelas >=10) 
        {
            IO.println("Quantidade de parcelas inválida!");
            IO.println("Escolha entre 1 e 10 parcelas.");

            return;
        }

        double juros = 0.01;

        double valorJuros = valor * juros * parcelas;

        double valorTotal = valor + valorJuros;

        double valorParcela = valorTotal / parcelas;

        IO.println("\n===== RESULTADO =====");

        IO.println("Valor financiado: R$ "+ String.format("%.2f", valor));

        IO.println("Quantidade de parcelas: "+ parcelas + " meses");

        IO.println("Juros: 1% ao mês");

        IO.println("Valor dos juros: R$ "+ String.format("%.2f", valorJuros));

        IO.println("Valor da parcela: R$ "+ String.format("%.2f", valorParcela));

        IO.println("Valor total do financiamento: R$ "+ String.format("%.2f", valorTotal));

        IO.println("\nParabéns, seja bem vindo a família SENATECH!");
    }
}
