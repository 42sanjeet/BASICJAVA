package conditional.statement;

import java.util.Scanner;

public class Divisile {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println(" enter the no ");
            int n = sc.nextInt();

            if(n%5==0 && n%3==0){
                System.out.println("no is divisible by 5 and 3  "  + n);

            }else{
                System.out.println(" is not divisible by 5 and 3  "  + n);
            }

        }
    }






