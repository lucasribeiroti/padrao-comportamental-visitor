package src.main.java;

public class Jovem implements Segmento {

    private String nome;
    private int idade;

    public Jovem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String aceitar(CampanhaVisitor visitor) {
        return visitor.exibirJovem(this);
    }
}