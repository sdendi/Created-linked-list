public class LinkedList {
  
  private int data;
  private Node next;
  
  public class LLNode {
    
    private int data;
    private LLNode next;
    
    public LLNode(int data) {
      this.data = data;
    }
    
    public int data() {
      return data; 
    }
    
    public Node next() {
      return next; 
    }
  }
  
}