
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AcTest {
    @Test
    public void turnOnAcTest() {
        //given i have an ac, ac is off
        Ac ac = new Ac();
        assertFalse(ac.isOn());
        //when i turn it on
        ac.toggleOn();
        // assert that ac is on
        assertTrue(ac.isOn());
        System.out.println(ac.isOn());
    }
    @Test
    public void turnAcOffTest(){
        //given i have an ac and my ac is on
        Ac ac = new Ac();
        ac.toggleOn();
        assertTrue(ac.isOn());
        //when i turn off my ac
        ac.toggleOn();
        assertFalse(ac.isOn());
        System.out.println(ac.isOn());
        //assert that my ac is off
    }
    @Test
    public void increaseTemperatureTest(){
        Ac ac = new Ac();
        ac.toggleOn();
        assertTrue(ac.isOn());
        assertEquals(16, ac.getTemperature());
        ac.increaseTemperature(2);
        assertEquals(18,ac.getTemperature());

    }
    @Test
    public void increaseTemperatureMoreThan30Test(){
        Ac ac = new Ac();
        ac.toggleOn();
        assertTrue(ac.isOn());
        System.out.println("It is " + ac.isOn() +" " + "that your AC is on");
        System.out.println("Current AC temperature is " + ac.getTemperature());
        ac.increaseTemperature(2);
        assertEquals(18, ac.getTemperature());
        System.out.println(ac.getTemperature());
    }
    @Test
    public void decreseTemperatureTest(){
        Ac ac = new Ac();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
        System.out.println(ac.getTemperature());
        ac.increaseTemperature(16);
        System.out.println(ac.getTemperature());
        ac.decreaseTemperature(3);
        System.out.println(ac.getTemperature());
        assertEquals(16,ac.getTemperature());


    }
    @Test
    public void decreaseTemperatureLessThan16(){
        Ac ac = new Ac();
        assertFalse(ac.isOn());
        ac.toggleOn();
        assertTrue(ac.isOn());
        System.out.println(ac.getTemperature());
        //ac.decreaseTemperature();
        assertEquals(16, ac.getTemperature());
        System.out.println(ac.getTemperature());

    }


}



