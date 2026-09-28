public class Algoritmo34 {
    
    //encapsulamento - visibilidade do poo
    //public - private - protected - package
    //public - todo mundo acesso
    //private - somente a classe pode acessar
    //protected - apenas as classes autorizadas
    //package - apenas no pacote
    private int primeiroNumero; //atributo
    private int segundoNumero;

    public void setPrimeiroNumero(int primeiroNumero)
    {
        this.primeiroNumero = primeiroNumero;
    }
    public void setSegundoNumero(int segundoNumero)
    {
        this.segundoNumero = segundoNumero;
    }
    
    public int getPrimeiroNumero()
    {
        return primeiroNumero;
    }
    public int getSegundoNumero()
    {
        return segundoNumero;
    }
    
}
