import java.util.HashMap;
import java.util.Map;

// Classe Chave com os métodos Get e Set
class Chave {
    private String descricao;

    public Chave(String descricao) 
    {
        this.descricao = descricao;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public void setDescricao(String descricao) 
    {
        this.descricao = descricao;
    }

    @Override
    public String toString() 
    {
        return this.descricao;
    }
}