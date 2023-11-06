import java.util.Scanner;
import java.text.DecimalFormat;

class JosephusChicken {
   
   final static double adultMealPrice = 100.00;
   final static double kiddieMealPrice = 250.00;
   final static double pesoToDollar = 56.00;
   
   public static void main(String[] args) {
      System.out.println("Josephus Chicken");
         Scanner in = new Scanner(System.in);
         
         /* Josephus Chicken 
         adultMeal = 100.00
         kiddieMeal = 250.00
         */
         
         System.out.print("Number of Adult Meals: ");
         int numberOfAdultMeal = in.nextInt();
         
         System.out.print("Number of Kiddie Meals: ");
         int numberOfKiddieMeal = in.nextInt();
         
         System.out.println("\nNumber of Adult Meals: " + numberOfAdultMeal);
         System.out.println("Number of Kiddie Meals: " + numberOfKiddieMeal );
         
         double adultMealTotalPrice = numberOfAdultMeal * adultMealPrice;
         double kiddieMealTotalPrice = numberOfKiddieMeal * kiddieMealPrice;
         
         System.out.println("Total Adult Meal Price: " + adultMealTotalPrice);
         System.out.println("Total Kiddie Meal Price: " + kiddieMealTotalPrice);
         
         double adultMealPriceInDollar = adultMealTotalPrice / pesoToDollar;
         double kiddieMealPriceInDollar = kiddieMealTotalPrice / pesoToDollar;
         
         System.out.println("Total Adult Meal Price in Dollar : " + adultMealPriceInDollar);
         System.out.println("Total Kiddie Meal Price in Dollar : " + kiddieMealPriceInDollar); 
         
         System.out.printf("Total Adult Meal Price in Dollar : %.2f\n" , adultMealPriceInDollar);
         System.out.printf("Total Kiddie Meal Price in Dollar : %.2f" , kiddieMealPriceInDollar); 

         
   }
}