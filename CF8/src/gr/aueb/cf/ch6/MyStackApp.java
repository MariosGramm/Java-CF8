package gr.aueb.cf.ch6;

public class MyStackApp {
    final static int STACK_SIZE = 50 ;
    static int[] stack = new int [STACK_SIZE];
    static int top = -1 ;


    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        printStack();

    }

    public static void push(int num){

        if (isFull()){
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = num ; //πρώτα αύξηση , μετά εκχωρεί

    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];    //πρώτα επιστρέφει την τιμή και μετά μειώνεται
    }

    public static boolean isFull(){
        return top == stack.length - 1 ;
    }

    public static boolean isEmpty() {
        return top == -1 ;
    }

    public static void printStack() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return ;
        }

        for (int i = 0 ; i < top ; i++ ) System.out.println(stack[i]);
    }

}
