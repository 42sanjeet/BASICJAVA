package conditional.statement;

import java.util.Scanner;

public class InterInput {

    public static void main(String[] args ){


        Scanner User_Input = new Scanner(System.in);
        System.out.println("enter the no ");
        int n =  User_Input.nextInt();

        if(n%5!=0){
            System.out.print(" is  not divible b hy 5");
        }else{
            System.out.println("   devisible by 5");
        }



    }
}
