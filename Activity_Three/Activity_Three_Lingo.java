import java.util.Scanner;

public class Activity_Three_Lingo {
   public static void main(String[] args) {
   
      double c1 = 109.00;
      double c2 = 153.00;
      double c3 = 250.00;
      double c4 = 499.00;
      double c5 = 699.00;
      double r1 = 35.00;
      double r2 = 50.00;
      
      Scanner in = new Scanner(System.in);
      
         System.out.println("Menu Selection:     Add ons:");
         System.out.println("*C1 = P" + c1 + "        *R1 = P" + r1);
         System.out.println("*C2 = P" + c2 + "        *R2 = P" + r2);
         System.out.println("*C3 = P" + c3);
         System.out.println("*C4 = P" + c4);
         System.out.println("*C5 = P" + c5);
         
         
       System.out.print("\nNumber of C1:  ");
       double  numC1 = in.nextDouble() ;
       
       System.out.print("Number of C2:  ");
       double numC2 = in.nextDouble() ;
       
       System.out.print("Number of C3:  ");
       double numC3 = in.nextDouble();
       
       System.out.print("Number of C4   ");
       double numC4 = in.nextDouble() ;
       
       System.out.print("Number of C5:  ");
       double numC5 = in.nextDouble() ;
       
       System.out.print("Number of R1:  ");
       double numR1 = in.nextDouble() ;
       
       System.out.print("Number of R2:  ");
       double numR2 = in.nextDouble() ;
       
       in.close();
 		double totalPriceC1 = numC1 * c1;
 		System.out.println("Total price of C1: " + totalPriceC1);
         
         double totalPriceC2 = numC2 * c2;
 		System.out.println("Total price of C2: " + totalPriceC2);
 		
 		double totalPriceC3 = numC3 * c3;
 		System.out.println("Total price of C3: " + totalPriceC3);
 		
 		double totalPriceC4 = numC4 * c4;
 		System.out.println("Total price of C1: " + totalPriceC4);
 		
 		double totalPriceC5= numC5 * c5;
 		System.out.println("Total price of C5: " + totalPriceC5);
 		
 		double totalPriceR1 = numR1 * r1;
 		System.out.println("Total price of R1: " + totalPriceR1);
 		
 		double totalPriceR2 = numR2 * r2;
 		System.out.println("Total price of R2: " + totalPriceR2);
 		
        double total = totalPriceC1 + totalPriceC2 + totalPriceC3 + totalPriceC4 + totalPriceC5+ 
        totalPriceR1 + totalPriceR2;
         
         System.out.println("Total price of Your Order: " + total);
         
         int quantity = (int) (numC1 + numC2 +numC3 + numC4 + numC5 + numR1 + numR2); 
         
         System.out.println("Total quantity of Your Order: " + quantity + " Orders");
         
       double  pesoToDollar = total / 56.00;
       
       System.out.printf("Peso to Dollar: %.2f ", pesoToDollar);

   }
}