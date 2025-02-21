import java.util.Scanner;
public class AddingPositiveNumber {
    public static void main(String[] args) {

        int sum = 0;
        //Object of  Scanner class
        Scanner sc = new Scanner(System.in);

        //Take integer input from the user
        System.out.println("Enter a number");
        int number = sc.nextInt();
        
        //While loop continues 
        //until entered number is positive
        while (number >= 0){

        //add only positive number
        sum += number;

        System.out.println("Enter a number");
        number = sc.nextInt();
        }
        System.out.println("Sum =" + sum);
        sc.close();


        
    }
    
}
