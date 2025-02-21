import java.util.Scanner;
public class Multiplication {
   /**
 
 *
  
/* */
public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");
    int number = sc.nextInt();

    //for loop for multiplier

    for (int i = 0; i <=10; i++){
        int product = number*i;

    System.out.println(number + " x " + i + " = " + (number*i));
        sc.close();

    }
   } 
}

