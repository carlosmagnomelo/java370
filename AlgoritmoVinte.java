import java.util.List;

public class AlgoritmoVinte {
    public static void main(String[]args)
    {
        List<String> nomes = List.of("PROMO10", "DESCONTO20", "FRETEGRATIS", "PIX");
       
        nomes.forEach(System.out::println);
    }
}
