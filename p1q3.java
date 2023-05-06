/*Create a class called "Time" with a constructor that takes the hour, minute, and
second. The class should have methods for setting and getting these attributes and a
method for displaying the time in a 12-hour format. */

class Time{
    int hour;
    int minute;
    int second;
    Time(int h,int m,int s){
        hour = h;
        minute = m;
        second = s;
    }
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setHour(int h) {
        hour = h;
    }
    
    public void setMinute(int m) {
        minute = m;
    }
    
    public void setSecond(int s) {
        second = s;
    }

    public void displayTime() {
        String amPm = "AM";
        int hour12 = hour;
        
        if (hour >= 12) {
            amPm = "PM";
            hour12 = hour - 12;
        }
        
        if (hour12 == 0) {
            hour12 = 12;
        }
        
        System.out.println("Time: " + hour12 + ":" + minute + ":" + second + " " + amPm);
    }
}
public class p1q3 {
    public static void main(String[] args) {
        Time time1 = new Time(10, 30, 0);
        Time time2 = new Time(15, 45, 20);
        
        time1.displayTime();
        time2.displayTime();
    }
}
