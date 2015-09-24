public abstract class ShellLinkedList {
    protected PlayerNode head;
    protected int numberOfItems;

    public ShellLinkedList() {
        this.head.setNext(null);
        this.numberOfItems = 0;
    }
   
    public int getNumberOfItems() {
        return numberOfItems;
    }
    
    public boolean isEmpty() {
        return numberOfItems != 0;
    }   

    @Override
    public String toString() {
        return "ShellLinkedList{" + "head=" + head + ", numberOfItems=" + numberOfItems + '}';
    }
}
