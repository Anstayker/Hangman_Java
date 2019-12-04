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
        MyDate date = new MyDate("Domingo");
        assertTrue(calendar.isHoliday(date));
    }
    
    @Test
    public void Test2() {
        MyDate date = new MyDate("Lunes");
        assertFalse(calendar.isHoliday(date));
    }

}
