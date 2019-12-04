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
        MyDate date = new MyDate(1, 12, 2019);
        assertTrue(calendar.isHoliday(date));
    }
    
    @Test
    public void Test2() {
        MyDate date = new MyDate(12, 03, 2019);
        assertFalse(calendar.isHoliday(date));
    }

    @Test
    public void Test3() {
        MyDate date = new MyDate(25 ,12, 2019);
        assertTrue(calendar.isHoliday(date));
    }
    
    @Test
    public void Test4() {
        MyDate date = new MyDate(18, 12, 2019);
        assertEquals( date.getWeekday(), 3);
    }
}
