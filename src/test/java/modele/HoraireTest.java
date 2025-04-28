package modele;
import modele.PlageHoraire;
import modele.Horaire;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HoraireTest {

    private Horaire h1, h2, h3;

    @BeforeEach
    public void setUp() {
        h1 = new Horaire(10, 30);
        h2 = new Horaire(12, 0);
        h3 = new Horaire(10, 30);
    }

    @Test
    @Order(1)
    public void testToMinutes() {
        assertEquals(630, h1.toMinutes());
        assertEquals(720, h2.toMinutes());
    }

    @Test
    @Order(2)
    public void testCompareToInferieur() {
        assertTrue(h1.compareTo(h2) < 0);
    }

    @Test
    @Order(3)
    public void testCompareToSuperieur() {
        assertTrue(h2.compareTo(h1) > 0);
    }

    @Test
    @Order(4)
    public void testCompareToEgal() {
        assertEquals(0, h1.compareTo(h3));
    }
}
