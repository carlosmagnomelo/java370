public class Algoritmo32 {
    public void mostrarSalaEco(String nome)
    {
        IO.println("Quem ousa entrar na sala do ECO?");
        IO.println("Ah....."+ nome + " eu esperava por voce");
    }
    public String mostrarSala(String nome)
    {
        String res = "quem ousa entrar na sala do eco";
        String resNome = "aha.."+nome+"... Eu esperava por voce";
        return res + "\n" +resNome;
    }
}
