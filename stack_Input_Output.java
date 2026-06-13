import java.util.ArrayList;
import java.util.Scanner;

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
        // Static stack
        Stack st = new Stack();

        // Taking input
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            st.push(num);
        }

        // Printing
        while (!st.empty()) {
            System.out.print(st.top() + " ");
            st.pop();
        }
        System.out.println();

        sc.close();
    }
}