package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

    @Test
    public void testSolarPowerOn() {
        //given I have an A.C
        AirConditioner solar = new AirConditioner();

        // given that it is off
        solar.setTurnOff(true);

        // given that it is on
        solar.setTurnOn(true);

        // check that power is on
        boolean powerOn = solar.getTurnOn();

        // CHECK FOR POWEROFF
        boolean powerOff = solar.getTurnOff();

        assertTrue(powerOn);

    }

    @Test
    public void testSolarPowerOff() {
        AirConditioner solar = new AirConditioner();
        solar.setTurnOff(true);

        solar.setTurnOn(false);

        boolean powerOn = solar.getTurnOn();

        boolean powerOff = solar.getTurnOff();
        assertTrue(powerOff);

    }

    @Test
    public void solarIncreaseTemperature() {
        //given that you have an Ac,
        AirConditioner solar = new AirConditioner();

        //given that it is off
        solar.setTurnOff(true);

        //given that it is on
        solar.setTurnOn(true);

        //given that the temp is between 16 or 30 degree
        solar.setTemperature(23);

        //given that the temp is increased by 5 degree
        solar.increaseTemperature(5);
        int temperature = solar.getTemperature();

        assertEquals(28, temperature);
    }
    @Test
    public void solarDecreaseTemperature(){
        AirConditioner solar = new AirConditioner();
        solar.setTurnOff(true);
        solar.setTurnOn(true);
        solar.setTemperature(19);
        solar.decreaseTemperature(1);
        int temperature = solar.getTemperature();
        assertEquals(18, temperature);
    }


    @Test
    public void solarIncreaseTemperatureBeyond30() {

        AirConditioner solar = new AirConditioner();
        solar.setTurnOff(true);
        solar.setTurnOn(true);
        solar.setTemperature(29);
        solar.increaseTemperature(2);
        int temperature = solar.getTemperature();
        assertEquals(30, temperature);


    }
    @Test
    public void solarDecreaseTemperatureBelow16(){
            AirConditioner solar = new AirConditioner();

            solar.setTurnOff (true);

            solar.setTurnOn(true);

            solar.setTemperature(22);

            solar.decreaseTemperature( 20);

            int temperature = solar.getTemperature();
            assertEquals(16, temperature);


    }
}

