public class StackItem {
    private Object Item;
    private StackItem next;

    public StackItem(){

    }

    public StackItem(Object item) {
        this.Item = item;
    }

    public Object getItem() {
        return Item;
    }

    public void setItem(Object item) {
        Item = item;
    }

    public StackItem getNext() {
        return next;
    }

    public void setNext(StackItem next) {
        this.next = next;
    }
}
