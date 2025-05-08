public class Main {
    public static void main(String[] args) {
/*
        Stack stack = new StackArray();
        stack.push("string");
        stack.push(12);
        stack.peek();
        System.out.println("pop = " + stack.pop());
        stack.peek();
        System.out.println("pop = " + stack.pop());
        System.out.println("is Empty = " + stack.pop());
        stack.peek();
*/
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push("string");
        stack.peek();
        System.out.println(stack.top.getItem());
        System.out.println(stack.top.getNext().getItem());
        System.out.println(stack.top.getNext().getNext());
    }
}
