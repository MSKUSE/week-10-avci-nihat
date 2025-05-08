public class StackLinkedList implements Stack {
    StackItem top = null;


    @Override
    public void push(Object item) {
        StackItem temp_box = new StackItem(item);
        StackItem prev_top = top;
        top = temp_box;
        top.setNext(prev_top);

    }

    @Override
    public Object pop() {
        Object data = top.getItem();
        top = top.getNext();            // we can do top.getNext.top.getNext.top.getNext
        return null;
    }

    @Override
    public void peek() {
        System.out.println("the top is " + top.getItem());

    }

    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}
