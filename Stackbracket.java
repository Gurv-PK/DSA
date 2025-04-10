
import java.util.Stack;

public class Stackbracket {

    public String getReverseBracket(String s){
        if("[".equals(s))
            return "]";
        else if("{".equals(s))
            return "}";
        else
            return ")";
    }

    public boolean isLeftBracket(String s){
        if("[".equals(s) || "{".equals(s) || "(".equals(s))
            return true;
        else
            return false;
    }
    

    public boolean isValid(String s){
        Stack st = new Stack();
        for (int i =0;i<s.length();i++) {
            String ch = String.valueOf(s.charAt(i));
            

            if(isLeftBracket(ch)){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                else{
                    if(!ch.equals(getReverseBracket(st.pop().toString()))){
                        return false;
                    }
                }

            }
            
        }
        return st.isEmpty();

        
    }

    public static void main(String[] args) {
        String s = "()";
        Stackbracket sb = new Stackbracket();
        System.out.println(sb.isValid(s));
    }
}
