public class Chave {

    private String nome;

    public Chave(String nome) {
        this.nome = nome;
    }

    public Chave() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}