package television;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

public class TelevisionTest {



    @Test
    public void createClassObjectTest(){
        Television samsungTv = new Television();
        assertNotNull(samsungTv);

    }
    @Test
    public void samsungTvIsOnTest(){
        Television samsungTv = new Television();
        assertFalse(samsungTv.isOn());
        System.out.println(samsungTv.isOn);
        samsungTv.toggle();
        assertTrue(samsungTv.isOn());
        System.out.println(samsungTv.isOn);
    }
    @Test
    public void samsungTvIsOffTest(){
        Television samsungTv = new Television();
        samsungTv.toggle();
        assertTrue(samsungTv.isOn);
        System.out.println(samsungTv.isOn);
        samsungTv.toggle();
        assertFalse(samsungTv.isOn);
        System.out.println(samsungTv.isOn);

    }
    @Test
    public void samsungaTvIncreaseVolumeTest(){
        Television samsungTv = new Television();
        samsungTv.toggle();
        assertTrue(samsungTv.isOn);
        System.out.println(samsungTv.isOn);
        samsungTv.increaseVolume(107);
        assertEquals(100,samsungTv.getvolume());
        System.out.println(samsungTv.getvolume());
    }
    @Test
    public void samsungTvDecreaseVolumeTest(){
        Television samsungTv = new Television();
        samsungTv.toggle();
        assertTrue(samsungTv.isOn);
        System.out.println(samsungTv.isOn);
        samsungTv.decreaseVolume(0);
        assertEquals(0,samsungTv.getvolume());
        System.out.println(samsungTv.getvolume());
    }
    @Test
    public void samsungTvChangeChannelTest(){
        Television samsungTv = new Television();
        samsungTv.toggle();
        assertTrue(samsungTv.isOn);
        System.out.println(samsungTv.isOn);
        samsungTv.channels(10);
        System.out.println(samsungTv.getChannels());
    }
}
