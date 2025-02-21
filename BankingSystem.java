public class BankingSystem {
public static void main(String[] args) {
    String accountHolderName = "Janecres";
     double accountBalance = 1500;
     String accountType = "Savings";
     float interestRate;
     int accountAge = 5;
     
    
     if(accountType.equals("Savings")) {
       interestRate = 0.005f;
            
     } else {
       interestRate = 0.001f;
     }
    
     //Perform operation
        accountBalance += 500.0;
        accountBalance -= 1000.0;
        
    //Calculate Interest
        double interestEarned = accountBalance * interestRate * accountAge;
        accountBalance += interestEarned;
    
    
    //Check condition and apply messages
        if(accountBalance >= 1000){
        System.out.println("HIGH BALANCE ACCOUNT");
        }
        if(accountType.equals("Savings") && accountBalance <= 100){
        System.out.println("LOW BALANCE ACCOUNT");
        }
        if(accountAge >= 5){
        System.out.println("YOU HAVE LOYALTY BONUS");
        }
        
        //Print output
        System.out.println("Account holder: " + accountHolderName);
        System.out.println("Account type: " + accountType);
        System.out.println("Initial balance Php: " + accountBalance);
        System.out.println("Deposit: Php 500.00");
        System.out.println("Withdrawals: Php 1000.00");
        System.out.println("Interest Earned: Php" + interestEarned);
        System.out.println("Final Balance: Php" + accountBalance);
             
        
        }
        } 

    

