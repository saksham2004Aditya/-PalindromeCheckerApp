 //PallindromeCheckerApp

 import java.util.Scanner;
 import java.util.Deque;
 import java.util.ArrayDeque;

 public class PallindromeCheckerApp {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter string: ");
         String input = scanner.nextLine();

         Deque<Character> deque = new ArrayDeque<>();

         for (char c : input.toCharArray()) {
             deque.addLast(c);
         }

         boolean isPalindrome = true;

         while (deque.size() > 1) {
             if (!deque.removeFirst().equals(deque.removeLast())) {
                 isPalindrome = false;
                 break;
             }
         }

         if (isPalindrome) {
             System.out.println(input + " is a palindrome.");
         } else {
             System.out.println(input + " is not a palindrome.");
         }

         scanner.close();
     }
 }
