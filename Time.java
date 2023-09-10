public class Time {
    public static void main (String[] args){
        double hour, minute, second, secondsInDay, second2, secondsElapsed;
        hour = 11.0;
        minute = 51.0;
        secondsInDay = 24 * 60 *60;
        second = (hour * 60 *60) + (minute * 60);
        System.out.println("Seconds since midnight: " + second);
        System.out.println("Seconds Left in the day: " + (secondsInDay - second));
        hour = 11.0;
        minute = 56.0;
        second2 = (hour * 60 * 60) + (minute *60);
        secondsElapsed = second2 - second;
        System.out.println("Seconds elapsed since starting this exercise: " + secondsElapsed);

    }
    
}
