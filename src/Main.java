import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {

        try {
            String parenthesis = isInputCorrect();
            if (isBalanced(parenthesis)) {
                System.out.println("Parenthesis is balanced");
            } else {
                System.out.println("Parenthesis is un-balanced");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }

    public static String isInputCorrect() throws Exception {
        Scanner sc = new Scanner(System.in);
        String parenthesis = sc.nextLine();
        char[] chars = parenthesis.toCharArray();
        if (chars.length == 0) {
            throw new Exception();
        }
        for (int i = 0; i < parenthesis.length(); i++) {
            if (chars[i] != '(' && chars[i] != ')') {
                throw new Exception();
            }
        }
        sc.close();
        return parenthesis;
    }

    public static boolean isBalanced(String parenthesis) {
        if (parenthesis == null || parenthesis.length() % 2 != 0) return false;

        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            char c = parenthesis.charAt(i);
            if (c == '(') {
                characters.push(c);
            } else if (c == ')') {
                characters.pop();
            }
        }
        return characters.isEmpty();
    }
}
