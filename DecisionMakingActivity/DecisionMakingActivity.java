import java.util.Scanner;
public class DecisionMakingActivity {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      System.out.println("Route to MoalBoal");
      
      System.out.print("Is Barili route obstructed? (Yes = 1 or No = 0)- ");
      int isRouteAObstructed = in.nextInt();
      
      if (isRouteAObstructed == 0){
         System.out.println("Recomended Route");
         System.out.println("MInglla (Route 1)");
         System.out.println("San Fernando (Route 2)");
         System.out.println("CarCar (Route 3)");
         System.out.println("Barili (Route 4.1)");
         System.out.println("Dumanjug (Route 4.1.1)");
         System.out.println("Alcantara (Route 4.1.2)");
         System.out.println("You arrive at MoalBoal");
          
      }else {
      System.out.print("Is Sibonga route obstructed? (Yes = 1 or No = 0)-");
      int isRouteAObstructed1 = in.nextInt();
      
      if(isRouteAObstructed1 == 0) {
         System.out.println("MInglla (Route 1)");
         System.out.println("San Fernando (Route 2)");
         System.out.println("CarCar (Route 3)");
         System.out.println("Sibonga (Route 4.2)");
         System.out.println("Dumanjug (Route 4.2.1)");
         System.out.println("Alcantara (Route 4.2.2)");
         System.out.println("You arrive at MoalBoal");

        }else{
        System.out.print("Is Dumanjug route obstructed? (Yes = 1 or No = 0)-");
         int isRouteAObstructed2 = in.nextInt();
         
         if(isRouteAObstructed1 == 0){
         System.out.println("MInglla (Route 1)");
         System.out.println("San Fernando (Route 2)");
         System.out.println("CarCar (Route 3)");
         System.out.println("Sibonga (Route 4.2)");
         System.out.println("Dumanjug (Route 4.2.1)");
         System.out.println("Alcantara (Route 4.1.2)");
         System.out.println("You arrive at MoalBoal");
         }else {
         System.out.println("Last Route");
         System.out.println("MInglla (Route 1)");
         System.out.println("San Fernando (Route 2)");
         System.out.println("CarCar (Route 3)");
         System.out.println("Sibonga (Route 4.2)");
         System.out.println("Argao (Route 5)");
         System.out.println("Ronda (Route 5.1)");
         System.out.println("Alcantara (Route 5.2)");
         System.out.println("You arrive at MoalBoal");

         }
      }
      }
   }
}