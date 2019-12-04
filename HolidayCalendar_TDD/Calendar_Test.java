import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calendar_Test {

    HolidayCalendar calendar;
    
    public Calendar_Test() {
    }
    
    @Before
    public void setUp() {
        calendar = new HolidayCalendar();
    }
    
    @Test
    public void Test1() {
        assertTrue(calendar.isHoliday("Domingo"));
    }
    
    @Test
    public void Test2() {
        assertFalse(calendar.isHoliday("Lunes"));
    }

}
