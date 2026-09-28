public class Porco extends Animal {

    public Porco(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() {
        // TODO Auto-generated method stub
        IO.println("Porco come lavagem");
    }

    @Override
    public void tocarSom() {
        // TODO Auto-generated method stub
        IO.println("Tocando Nof Nof.mp3");
    }

    @Override
    public double trazPix() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trazPix'");
    }
    
}
