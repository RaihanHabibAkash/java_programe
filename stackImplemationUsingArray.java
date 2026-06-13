import java.util.ArrayList;

class Stack {
    ArrayList<Integer> v = new ArrayList<>();

    void push(int val) {
        v.add(val);
    }

    void pop() {
        v.remove(v.size() - 1);
    }

    int top() {
        return v.get(v.size() - 1);
    }

    int size() {
        return v.size();
    }

    boolean empty() {
        return v.isEmpty();
    }
}

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top());
        st.pop();

        System.out.println(st.top());
        st.pop();

        System.out.println(st.top());
        st.pop();

        if (!st.empty()) {
            System.out.println(st.top());
            st.pop();
        }
    }
}