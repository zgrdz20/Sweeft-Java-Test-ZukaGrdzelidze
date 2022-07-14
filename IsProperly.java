import java.util.Stack;

public class IsProperly {


    public static boolean isProperly(String sequence){
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < sequence.length(); i++){
            if(sequence.charAt(i) == '(') st.push('(');
            if(sequence.charAt(i) == ')' && st.isEmpty()) return false;
            if(sequence.charAt(i) == ')' && !st.isEmpty()) st.pop();
            if(st.size() > sequence.length() - 1 - i) return false;
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
