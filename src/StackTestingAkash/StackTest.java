package StackTestingAkash;

public class StackTest {
    public static void main(String[] args) {
        Stack st= new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.push(4);
        st.push(5);

        while (!st.empty()){
            System.out.println(st.top());
            st.pop();
        }
    }
}
