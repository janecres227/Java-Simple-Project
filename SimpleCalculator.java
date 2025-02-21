import java.util.Scanner;
class Mathematics {
    Scanner sc = new Scanner(System.in);
    int Multiply(int numOne, int numTwo){
        return numOne*numTwo;
    }
    int Subtract(int numOne, int numTwo){
        return numOne-numTwo;
    }
    int Addition(int numOne, int numTwo){
        return numOne+numTwo;
    }
    int Division(int numOne, int numTwo){
        return numOne/numTwo;
    }
    }

public class SimpleCalculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter numOne:");
    int numOne = sc.nextInt();
    System.out.println("Enter numTwo:");
    int numTwo = sc.nextInt();

    //Create instance for Mathematics
    Mathematics m = new Mathematics();

    //Display options to the user
    System.out.println("Choose an operation");
    System.out.println("1: Multiplication");
    System.out.println("2: Subtraction");
    System.out.println("3: Addition");
    System.out.println("4: Division");

    System.out.println("Enter your choice");
    int choice = sc.nextInt();
    
     //Perform the chosen operation
     int result;
     switch(choice){
        case 1:
        result = m.Multiply(numOne, numTwo);
        System.out.println("Result: " + result);

        break;
        case 2:
        result = m.Subtract(numOne, numTwo);
        System.out.println("Result: " + result);

        break;
        case 3:
        result = m.Addition(numOne, numTwo);
        System.out.println("Result: " + result);

        break;
        case 4:
        result = m.Division(numOne, numTwo);
        System.out.println("Result: " + result);

        break;
        default:
        System.out.println("Invalid choice!!!");

        sc.close();
     }
    }
   }



