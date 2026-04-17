package conditional.statement;

import java.util.Scanner;

public class AreaRactangle {

   public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length");
        int l = sc.nextInt();

        System.out.println("enter the breadth ");
        int b = sc.nextInt();

        float Reactangle = (l*b);

        float Periemeter= 2*(l+b);

        if(Reactangle > Periemeter){
            System.out.println( "  REACTANGLE is greater than its   PERIMETRE :  " + Reactangle);

        }
        else if (Reactangle<Periemeter){
            System.out.println(" REACTANGLE is SMALLER than its  PERIMETREE  : " + Periemeter);
        }else {
            System.out.println("equal  ");
        }

    }

}
