import java.util.Scanner;
public class Squareroot {
  public static void main(String[] args) {

    int squareRoot = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
       int number = sc.nextInt();
       squareRoot = number*number;
       System.out.println("Squareroot: " + squareRoot);
         sc.close();
  }  
}
