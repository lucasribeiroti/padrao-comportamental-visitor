package src.main.java;

public class CampanhaVisitor implements Visitor {

    public String exibir(Segmento segmento) {
        return segmento.aceitar(this);
    }

    @Override
    public String exibirJovem(Jovem jovem) {
        return "Campanha para Jovens: " + jovem.getNome() + ", aproveite 20% de desconto em produtos de tecnologia!";
    }

    @Override
    public String exibirAdulto(Adulto adulto) {
        return "Campanha para Adultos: " + adulto.getNome() + ", confira ofertas exclusivas para renovação de guarda-roupa!";
    }

    @Override
    public String exibirIdoso(Idoso idoso) {
        return "Campanha para Idosos: " + idoso.getNome() + ", aproveite planos de saúde e viagens com descontos especiais!";
    }
}
