package src.main.java;

public interface Visitor {
    String exibirJovem(Jovem jovem);
    String exibirAdulto(Adulto adulto);
    String exibirIdoso(Idoso idoso);
}