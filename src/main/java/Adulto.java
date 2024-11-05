package src.main.java;

public class Adulto implements Segmento {

    private String nome;
    private int idade;

    public Adulto(String nome, int idade) {
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
        return visitor.exibirAdulto(this);
    }
}
