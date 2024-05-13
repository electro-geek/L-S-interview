import java.util.*;
public class Option{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price of premium");
        int premium = scan.nextInt();
        System.out.println("Enter the no. of calls or put options you're buying");
        int noOption = scan.nextInt();
        System.out.println("Strike price");
        int strikePrice = scan.nextInt();
        System.out.println("What is the lot-size?");
        int lotSize = scan.nextInt();
        System.out.println("Enter the expiring price");
        int ep = scan.nextInt();
        System.out.println("Are you buing call(1) or option(2)");
        int options = scan.nextInt();
        int totalProfit = 0;
        if(options == 1){
            totalProfit = (noOption*(lotSize*(ep-strikePrice)-premium));
        }
        else if(options == 2){
            totalProfit = (noOption*(lotSize*(strikePrice-ep)-premium));
        }
        System.out.println("Total profit is: "+ totalProfit);
    }
}