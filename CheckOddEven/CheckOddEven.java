import java.util.Scanner;

public class CheckOddEven{
    public static void main(String[] args){
        int number;
         Scanner in = new Scanner (System.in);   
         System.out.print("Enter a number: ");
         number = in.nextInt();
                   System.out.println("The number is " + number);
        if (number % 2 == 0){   //using module to get the answer if it is odd or even
            System.out.println(number +" is an Even number\n\n"); //using \n new line
        } else{
            System.out.println(number +"is an Odd number\n\n");
        }
    }
}