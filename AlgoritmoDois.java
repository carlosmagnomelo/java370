public class AlgoritmoDois {
    void main(){
        //ENTRADA
        IO.println(  "Seja vem vindo ao portal java 360?");
        String usuario = IO.readln( "Qual o seu nome? ");
        IO.println("Olá, " + usuario + "! Bem-vindo ao portal.");
        
        //mais rapido sem métodos
        //int estrelas = 0;

        //mais lento com métodos (Classes Wrappers)
        //Integer.parseInt(Valor para conversão)
        int estrelas = 0;
        IO.println( "quem criou o java?");
        IO.println( "1 - James Gosling");
        IO.println("2 - Bill Gates");
        IO.println("3 - Steve jobs");
        IO.println("4 - Mark Zuckerberg");
        int resp = Integer .parseInt(IO.readln("Digite o número"));
        if(resp == 1){
            IO.println( "Parabéns, você acertou! Ganhou uma estrela.");
            
        }else {
            IO.println( "Você errou!");
        }
        IO.println("Voce obteve " + estrelas + "estrelas.");
        
}   

}
