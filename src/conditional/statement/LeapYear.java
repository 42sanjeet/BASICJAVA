package conditional.statement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter the year : ");

        int year = input.nextInt();

       //if(year%400==0 || (year%4==0 && year %100!=0)) {
        //       System.out.println(year + "  is a leap year ");

      // }else{
           // System.out.println( year + "  is not a leap year ");
        //}


        if(year %400==0){
            System.out.println(" leap year");
        }else{
            if(year%4==0 && year%100!=0){
                System.out.println("  is a leap year");
            }else{
                System.out.println(" is not a leap year");
            }
        }


    }
}
