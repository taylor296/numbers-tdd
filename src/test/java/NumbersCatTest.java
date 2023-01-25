import org.junit.After;
import org.junit.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.Assert.assertEquals;
public class NumbersCatTest {
    /*
    1. Zero
    2. Unitats (1-9)
    3. Negatius
    4. Decenes
        4.1 30-99
        4.2 20-29
        4.3 10-19
 */

    @Test
    public void donat_0_retorna_Zero() {
        assertEquals("Zero", NumbersCat.say(0l));
    }

    @Test
    public void donat_1_retorna_Un() {
        assertEquals("Uno", NumbersCat.say(1l));
    }

    @Test
    public void donat_2_retorna_Dos(){
        assertEquals("Dos", NumbersCat.say(2l));
    }

    @Test
    public void donat_9_retorna_Nou(){
        assertEquals("Donat el 9 retorna Nou","Nou", NumbersCat.say(9l));
    }

    @Test
    public void donat_Menys3() {
        assertEquals("Dona -3 retorna Menys tres","Menys tres", NumbersCat.say(-3l) );
    }

    @Test
    public void donat_30_retorna_Trenta() {
        assertEquals("Trenta", NumbersCat.say(30));
    }

    @Test
    public void donat_31() {assertEquals("Trenta-un", NumbersCat.say(31));}

    @Test
    public void donat_39() {assertEquals("Trenta-nou", NumbersCat.say(39));}

    @Test
    public void donat_41() {assertEquals("Quaranta-un", NumbersCat.say(41));}

    @Test
    public void donat_40() {assertEquals("Quaranta", NumbersCat.say(40));}

    @Test
    public void donat_23() {assertEquals("Vint-i-tres",NumbersCat.say(23));}

    @Test
    public void donat_100() {assertEquals("Cent", NumbersCat.say(100));}

    @Test
    public void donat_200() {assertEquals("Dos-cents", NumbersCat.say(200));}

    @Test
    public void donat_427() {assertEquals("Quatre-cents vint-i-set", NumbersCat.say(427));}

    @Test
    public void donat_1234() {assertEquals("Mil dos-cents trenta-quatre", NumbersCat.say(1234));}
}
