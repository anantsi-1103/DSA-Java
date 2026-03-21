
import java.util.Stack;

public class stack_que {

    public static void InsertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();
        InsertAtBottom(st, x);
        st.push(top); // khali hone ke baad return wali value ko ek ek krke ap store krdoge
    }

    public static void reverse(Stack<Integer> st){
        // 10 , 30, 50
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverse(st);  // 50 ,30 , 10
        InsertAtBottom(st,top);
        //50 30 10
    }
    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();

        // st.push(10);
        // st.push(40);
        // st.push(50);
        // st.push(90);

        // System.out.println(st);

        // InsertAtBottom(st, 200);


        // System.out.println(st);
        // reverse(st);
        // System.out.println(st);




    }
}

