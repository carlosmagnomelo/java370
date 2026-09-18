public class Cachorro extends Animal {

    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    // no processo de herança não herda o construtor do pai. Tem que ser redefinido do filho.
    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("ração canil para cães");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("Tocando auau.mp3");
    }

    @Override
    public double trazPix() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trazPix'");
    }

    
}
