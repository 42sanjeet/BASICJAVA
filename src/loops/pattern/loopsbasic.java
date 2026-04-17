package loops.pattern;

import java.util.Scanner;

public class loopsbasic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" ENTER THE NO ");

        int n = input.nextInt();
        int i;
        for ( i = 1; i <= n; i++) {
            System.out.print ("   " +i);
        }
        System.out.println(" \n");
        System.out.println(i);


    }

}
