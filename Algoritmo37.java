public class Algoritmo37 {
    
    void main()
    {
        /*
        Exemplo Didatico
        -herança
        -super()
        -Redefinição do construtor
        -Polimorfismo
        -Sobrescrita (override)
        */
       Cachorro dog = new Cachorro("Rex", "auau.mp3");
       IO.println("Nome: " + dog.getNome());
       dog.comer();
       dog.tocarSom();
       /////////////////////////////////////////////////////////////////
       Gato gato = new Gato("Juliano", "miau.mp3");
       IO.println("Nome: " + gato.getNome());
       gato.comer();
       gato.tocarSom();

       Porco pig = new Porco("porks", "Nof.mp3");
       IO.println("Nome: " + pig.getNome());
       pig.comer();
       pig.tocarSom();

    }
}
