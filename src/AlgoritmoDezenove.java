import java.util.List;

public class AlgoritmoDezenove {
    public static void main()
    {
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Diego");
        System.out.println("Notificação de Mensagem não lidas: ");

        nomes.forEach (n -> System.out.println("Uma mensagem para você de: " + n));
    }
    

    //forEach: Significa "para cada". Ele vai passar por cada item de dentro da lista de forma automática.
    //n ->  Isso é chamado de Expressão Lambda.
    // O n representa o número ou nome da vez. Na primeira rodada o n vale 1, na segunda vale 2, e assim até o fim.
}

