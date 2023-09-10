import java.util.Scanner;

public class tempConv {
    public static void main (String[] args){
        double temp;
        double convertC;
        Scanner in = new Scanner(System.in);

        System.out.print ("What is the temperature in Celsius? ");
        temp = in.nextDouble();
        convertC = ( temp * (9.0/5.0)) +32;
        // System.out.print("\n"+temp +" C = " + convertC +" F"); This was test output

        //final output using printf
        System.out.printf("\n%.1f C = %.1f F ", temp,convertC);

    }
    
}
