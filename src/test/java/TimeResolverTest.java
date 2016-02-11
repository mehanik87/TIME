import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import time.TimeResolver;
import time.TimesDay;

/**
 * Created by Администратор on 10.02.2016.
 */
@RunWith(JUnit4.class)
public class TimeResolverTest extends TestCase{


    @Test
    public void testEvening(){
        TimeResolver resolver = new TimeResolver();
        assertEquals(TimesDay.EVENING, resolver.getDaysTime(19));
        assertEquals(TimesDay.EVENING, resolver.getDaysTime(21));
        assertEquals(TimesDay.EVENING, resolver.getDaysTime(22));
    }
    @Test
    public void testMorning(){
        TimeResolver resolver = new TimeResolver();
        assertEquals(TimesDay.MORNING, resolver.getDaysTime(6));
        assertEquals(TimesDay.MORNING, resolver.getDaysTime(7));
        assertEquals(TimesDay.MORNING, resolver.getDaysTime(8));
    }
    @Test
    public void testDay(){
        TimeResolver resolver = new TimeResolver();
        assertEquals(TimesDay.DAY, resolver.getDaysTime(9));
        assertEquals(TimesDay.DAY, resolver.getDaysTime(12));
        assertEquals(TimesDay.DAY, resolver.getDaysTime(18));
    }
    @Test
    public void testNight(){
        TimeResolver resolver = new TimeResolver();
        assertEquals(TimesDay.NIGHT, resolver.getDaysTime(23));
        assertEquals(TimesDay.NIGHT, resolver.getDaysTime(0));
        assertEquals(TimesDay.NIGHT, resolver.getDaysTime(5));
    }
       @Test(expected = IllegalArgumentException.class)
    public void testNegativeArgum()
    {
        TimeResolver resolver = new TimeResolver();
        resolver.getDaysTime(-5);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testBigArgum()
    {
        TimeResolver resolver = new TimeResolver();
        resolver.getDaysTime(545623);
    }

}
