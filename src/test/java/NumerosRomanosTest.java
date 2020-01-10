import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumerosRomanosTest {

    private NumerosRomanos numerosRomanos = new NumerosRomanos();

    @Test
    void pasar1ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(1);
        assertEquals(romano, "I");
    }

    @Test
    void pasar2ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(2);
        assertEquals(romano, "II");
    }

    @Test
    void pasar3ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(3);
        assertEquals(romano, "III");
    }

    @Test
    void pasar4ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(4);
        assertEquals(romano, "IV");
    }

    @Test
    void pasar5ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(5);
        assertEquals(romano, "V");
    }

    @Test
    void pasar6ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(6);
        assertEquals(romano, "VI");
    }

    @Test
    void pasar7ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(7);
        assertEquals(romano, "VII");
    }

    @Test
    void pasar8ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(8);
        assertEquals(romano, "VIII");
    }

    @Test
    void pasar9ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(9);
        assertEquals(romano, "IX");
    }

    @Test
    void pasar10ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(10);
        assertEquals(romano, "X");
    }

    @Test
    void pasar11ARomanosTest(){
        String romano = numerosRomanos.pasarARomanos(11);
        assertEquals(romano, "XI");
    }

    @Test
    void pasar12RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(12);
        assertEquals(romano, "XII");
    }

    @Test
    void pasar13RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(13);
        assertEquals(romano, "XIII");
    }

    @Test
    void pasar14RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(14);
        assertEquals(romano, "XIV");
    }

    @Test
    void pasar15RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(15);
        assertEquals(romano, "XV");
    }

    @Test
    void pasar16RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(16);
        assertEquals(romano, "XVI");
    }

    @Test
    void pasar17RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(17);
        assertEquals(romano, "XVII");
    }

    @Test
    void pasar18RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(18);
        assertEquals(romano, "XVIII");
    }

    @Test
    void pasar19RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(19);
        assertEquals(romano, "XIX");
    }

    @Test
    void pasar20RomanosTest(){
        String romano = numerosRomanos.pasarARomanos(20);
        assertEquals(romano, "XX");
    }
}
