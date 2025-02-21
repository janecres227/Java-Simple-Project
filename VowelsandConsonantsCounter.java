import java.util.Scanner;
public class VowelsandConsonantsCounter {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter a sentence:");
       String str = sc.nextLine().toLowerCase();

       int vowels = 0, consonants = 0;
       for(char ch : str.toCharArray()) {
         if(ch >= 'a' || ch <= 'z') {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++;

        } else {
            consonants++;
        }
    }
}
//It counts includes whitespace and symbols
   System.out.println("vowels: " + vowels);
   System.out.println("consonants: " + consonants);
        sc.close();
       }
   } 

