 //PallindromeCheckerApp

  import java.util.Scanner;
import java.util.Stack;

     public class PallindromeCheckerApp {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.print("Enter string: ");
             String input = scanner.nextLine();

             Stack<Character> stack = new Stack<>();
             for (char c : input.toCharArray()) {
                 stack.push(c);
             }

             String reversed = "";
             while (!stack.isEmpty()) {
                 reversed += stack.pop();
             }

             if (input.equalsIgnoreCase(reversed)) {
                 System.out.println(input + " is a palindrome.");
             } else {
                 System.out.println(input + " is not a palindrome.");
             }

             scanner.close();
         }
     }
