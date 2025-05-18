import java.util.*;

public class BracketStack {
    public static boolean isBalanced(String a) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty() || st.pop() != '(') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String a = "(())()";
        System.out.println(isBalanced(a));  // Output: true
    }
}
