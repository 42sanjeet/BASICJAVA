package conditional.statement;

import java.util.Scanner;

public class SellingPriceCostPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the cost price ");
        int cp = sc.nextInt();

        System.out.println(" enter the selleing price ");
        int sp = sc.nextInt();

        if(cp<sp){
            int profit= sp-cp;
            System.out.println("profit is of :  " + profit);
        }else if(sp<cp) {
            int loss = cp - sp;
            System.out.println(" loss  is  of : " + loss);
        }else{
            System.out.println(" no profit no loss ");
        }



    }

}
