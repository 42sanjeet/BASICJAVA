package conditional.statement;

import java.util.Scanner;

public class TRhreeDigit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the no ");
        int n = sc.nextInt();

        if(n>99 && n<1000){
            System.out.println("no is a thrree digit "  + n);

        }else{
            System.out.println(" is not a 3 digit no  ");
        }

    }
}
