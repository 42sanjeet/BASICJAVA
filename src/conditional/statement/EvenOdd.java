package conditional.statement;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        System.out.print(" ENTER THE NO ");

        int N =  input.nextInt();

        if(N%2==0){
            System.out.println( N + "  IS A EVEN " );
        }

       else {
            System.out.println(N + " NO IS ODD  " );


        }

    }
}
