import java.util.Scanner;

public class secondConverter {
    public static void main (String[] args){
        int seconds, hours, minutes, secRemain, minRemain;
        Scanner in = new Scanner(System.in);

        System.out.print("How many seconds are left? ");
        seconds = in.nextInt();
        hours = seconds / (60*60);
        minRemain = seconds % (60*60);
        minutes = minRemain / 60;
        secRemain = (minRemain % 60);
        
        System.out.printf("%d seconds = %d hours %d minutes %d seconds", seconds,hours,minutes,secRemain);


        

    } 
}
