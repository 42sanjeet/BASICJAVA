package conditional.statement;

import java.util.Scanner;

public class AbsoluteValue {


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no ");

        int abs = sc.nextInt();


        if (abs<0){
            abs = abs*(-1);
        }
        System.out.println(abs);
    }
}
