public class Principal {
    void main()
    {
        //instancia de uma classe
        Algoritmo31 objeto = new Algoritmo31();

        IO.println(objeto.getAlomundo());
        objeto.printarNaTela();

        Algoritmo32 objeto2 = new Algoritmo32();
        String nome = IO.readln("Digite seu nome: ");
        objeto2.mostrarSalaEco("JP Max Plus!");
        objeto2.mostrarSalaEco(nome);

        Algoritmo32 objeto3 = new Algoritmo32();
        IO.println(objeto3.mostrarSala("maria"));
    }
}
