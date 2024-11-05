package src.main.java.test;

import org.junit.jupiter.api.Test;
import src.main.java.Adulto;
import src.main.java.CampanhaVisitor;
import src.main.java.Idoso;
import src.main.java.Jovem;

import static org.junit.jupiter.api.Assertions.*;

class CampanhaVisitorTest {

    @Test
    void deveExibirCampanhaJovem() {
        Jovem jovem = new Jovem("Alice", 22);
        CampanhaVisitor visitor = new CampanhaVisitor();
        assertEquals("Campanha para Jovens: Alice, aproveite 20% de desconto em produtos de tecnologia!", visitor.exibir(jovem));
    }

    @Test
    void deveExibirCampanhaAdulto() {
        Adulto adulto = new Adulto("Carlos", 35);
        CampanhaVisitor visitor = new CampanhaVisitor();
        assertEquals("Campanha para Adultos: Carlos, confira ofertas exclusivas para renovação de guarda-roupa!", visitor.exibir(adulto));
    }

    @Test
    void deveExibirCampanhaIdoso() {
        Idoso idoso = new Idoso("Maria", 68);
        CampanhaVisitor visitor = new CampanhaVisitor();
        assertEquals("Campanha para Idosos: Maria, aproveite planos de saúde e viagens com descontos especiais!", visitor.exibir(idoso));
    }
}