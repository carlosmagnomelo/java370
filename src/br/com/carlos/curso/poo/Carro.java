package br.com.carlos.curso.poo;
public class Carro extends Veiculo implements IManutencao, IMeusImpostos {
    
    private int numPortas;

    public Carro() 
    {
        super();
    }
    public Carro(String placa, int velocidadeMax, String tipoCombustivel, String cor, int numPortas) {
        super(placa, velocidadeMax, tipoCombustivel, cor);
        this.numPortas = numPortas;
    }
    
    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) 
    {
        this.numPortas = numPortas;
    }
    
    @Override
    public void mover() {
        // TODO Auto-generated method stub
        IO.print("O carro se moveu");
    }

    @Override 
    public void adicionar()
    {
        IO.print("Impostos add");
    }

    @Override 
    public  void revisaoProgramada()
    {
        IO.print("Faça a revisão com a taxa de: " + IManutencao.TAXA);
    }

    
}
