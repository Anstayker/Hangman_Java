public class MyDate {

    String weekday;
    int day;
    int month;
    
    public MyDate(String wk, int d, int m) {
        weekday = wk;
        day = d;
        month = m;
    }
    
    public String getWeekday() {
        return weekday;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }

}
