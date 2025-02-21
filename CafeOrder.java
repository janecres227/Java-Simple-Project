import java.util.Scanner;
public class CafeOrder {
 public static void main(String[] args) {
     
    Scanner scanner = new Scanner(System.in);
     double totalCost = 0;

     while (true) { 
        displayMenu();
        System.out.println("Enter your choice (1-5 or 0 to exit): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if(choice == 0){
            break;
        }
        if(choice >= 1 && choice <= 5) {
            System.out.println("Enter quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            double price = getPrice(choice);
            double itemCost = price * quantity;

            totalCost += itemCost;
            System.out.println(getProductName(choice) + " x " + quantity + " = $ " + itemCost);
        } else {
            System.out.println("Invalid choice. Please try again");
        }
            System.out.println("\nCurrent total: $ " + totalCost);
        }

        if(totalCost > 0){
            System.out.println("Enter cash paid: $ ");

        double cashPaid = scanner.nextDouble();
        double change = cashPaid - totalCost;
        System.out.println("Change: $ " + change);
        }

        scanner.close();
    }
       private static void displayMenu(){
          System.out.println("\nMenu");
          System.out.println("1. Coffee - $ 0.50");
          System.out.println("2. Water - $ 0.80");
          System.out.println("3. Beer - $ 1.20");
          System.out.println("4. Sweets - $ 1.45");
          System.out.println("5. Peanuts - $ 1.60");
          System.out.println("0. Exit");
        } 

        private static double getPrice(int choice){
            switch(choice) {
             case 1:
              return 0.50;
             case 2:
              return 0.80;
             case 3:
              return 1.20;
             case 4:
              return 1.45;
             case 5:
              return 1.60;
             default:
              return -1;
            }
            }

            private static String getProductName(int choice) {
                switch(choice) {
                case 1:
                 return "Coffee";
                case 2:
                 return "Water";
                case 3:
                 return " Beer"; 
                case 4:
                 return "Sweets";
                case 5:
                 return "Peanuts"; 
                default: 
                 return "Invalid product";
                }
            }
        }
             
         
        
    
        
        