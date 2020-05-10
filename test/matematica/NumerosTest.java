
package matematica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class NumerosTest {
    private Numeros n;
    
    public NumerosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n =new Numeros ();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testNumeroPar() {
        assertEquals(true,n.numeroPar(8));
    }
    @Test
    public void testAreaQuadrado() {
        assertEquals(100,n.areaQuadrado(10));
    }
    @Test
    public void testNumeroDivisivel() {
        assertEquals(true,n.numeroDivisivel(4,2));
    }
    
}
