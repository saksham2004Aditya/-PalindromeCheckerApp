 //PallindromeCheckerApp

 import java.util.Scanner;
 import java.util.LinkedList;
 import java.util.Queue;
 import java.util.Stack;

 public class PallindromeCheckerApp {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter string: ");
         String input = scanner.nextLine();

         Queue<Character> queue = new LinkedList<>();
         Stack<Character> stack = new Stack<>();

         for (char c : input.toCharArray()) {
             queue.add(c);
             stack.push(c);
         }

         boolean isPalindrome = true;

         while (!queue.isEmpty()) {
             if (!queue.remove().equals(stack.pop())) {
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
