public abstract class ShellLinkedList {
    protected PlayerNode head;
    protected int numberOfItems;

    public ShellLinkedList(PlayerNode head, int numberOfItems) {
        this.head = head;
        this.numberOfItems = numberOfItems;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
    
    public boolean isEmpty() {
        
        return numberOfItems > 0;
    }   

    @Override
    public String toString() {
        return "ShellLinkedList{" + "head=" + head + ", numberOfItems=" + numberOfItems + '}';
    }
    
    
}
