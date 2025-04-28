package modele;
import modele.PlageHoraire;
import modele.Horaire;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PlageHoraireTest {

    private PlageHoraire plage1, plage2, plage3, plage4;

    @BeforeEach
    public void setUp() throws ExceptionPlageHoraire {
        plage1 = new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0));
        plage2 = new PlageHoraire(new Horaire(10, 0), new Horaire(11, 0));
        plage3 = new PlageHoraire(new Horaire(9, 30), new Horaire(10, 30));
        plage4 = new PlageHoraire(new Horaire(9, 0), new Horaire(11, 0));
    }

    @Test
    @Order(1)
    public void testDuree() {
        assertEquals(60, plage1.duree());
    }

    @Test
    @Order(2)
    public void testCompareToSuccession() {
        assertTrue(plage1.compareTo(plage2) < 0);
    }

    @Test
    @Order(3)
    public void testCompareToChevauchement() {
        assertEquals(0, plage1.compareTo(plage3));
    }

    @Test
    @Order(4)
    public void testCompareToInclusion() {
        assertEquals(0, plage4.compareTo(plage1));
    }

    @Test
    @Order(5)
    public void testConstructeurValide() {
        assertNotNull(plage1);
    }

    @Test
    @Order(6)
    public void testConstructeurInvalide() {
        assertThrows(ExceptionPlageHoraire.class, () -> new PlageHoraire(new Horaire(10, 0), new Horaire(9, 0)));
    }
}
