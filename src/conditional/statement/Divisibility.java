package conditional.statement;

import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the no ");
        int n = sc.nextInt();

        if(n%5==0 || n%3==0) {
            if (n % 15 != 0) {
                System.out.println("no is divisible by 5 or 3 but not 15  " + n);

            }else{
                System.out.println(" no is divible by 5, 3,and 15");
            }
        }else{
            System.out.println(" is not divisible by 5 ,3 and 15   "  + n);
        }

    }




}
