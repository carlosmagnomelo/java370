public class Gato extends Animal {

    public Gato(String nome, String arquivoSom) 
    {
        super(nome, arquivoSom);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void comer() 
    {
        // TODO Auto-generated method stub
        IO.println("Leite longa vida");
    }

    @Override
    public void tocarSom() 
    {
        // TODO Auto-generated method stub
        IO.println("tocando o som miau" +super.getArquivoSom());
    }

    @Override
    public double trazPix() 
    {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'trazPix'");
    }
    
}
