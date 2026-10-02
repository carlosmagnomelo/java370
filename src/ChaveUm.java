import java.util.HashMap;
import java.util.Map;

// Classe que encapsula os dados usando Getters e Setters
class Ambiente {
    private String codigo;
    private String descricao;

    // Construtor
    public Ambiente(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    // Métodos Get e Set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
