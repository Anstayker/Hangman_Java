public class MyDate {

    int weekday;
    int day;
    int month;
    int year;
    
    public MyDate(int d, int m, int y) {
        weekday = guessWeekday(d, m ,y);
        day = d;
        month = m;
        year = y;
    }
    
    public int getWeekday() {
        return weekday;
    }
    
    public int getDay() {
        return day;
    }
    
    public int getMonth() {
        return month;
    }

    public int guessWeekday(int day, int month, int year) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if(month < 3)
            year -= month;
        return  (year + (year/4) - (year/100) + 
                (year/400) + t[month-1] + day) % 7;
    }
    
}
