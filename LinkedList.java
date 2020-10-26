import java.util.Random;

public class LinkedList<T> {
  
  // the first node of the linked list
  private LLNode<T> firstNode;
  
  /** Create an empty linked list */
  public LinkedList() {
    firstNode = null; 
  }
  
  /** Gets the first node of the list
    * @return the first node
    */
  protected LLNode<T> getFirstNode() {
    return firstNode; 
  }
  
  /** Sets the first node of the list
    * @param node is the node that's being set
    */  
  protected void setFirstNode(LLNode<T> node) {
    firstNode = node; 
  }
  
  /** Add an element to the front of the linked list
    * @param element the element to add
    */
  public void addToFront(T element) {
    setFirstNode(new LLNode<T>(element, getFirstNode()));
  }
  /* Prints the linked list 
   */
  public void printList() {
    LLNode<T> ptr = getFirstNode();
    while(ptr != null) {
      System.out.print(ptr.getElement() + " ");
      ptr = ptr.getNext();
    }
    System.out.println();
  }
  
  /* Reverses the linked list
   */
  public void reverse() { 
    LLNode<T> ptr = getFirstNode();
    LLNode<T> previous = null, current  = null;
    
    while(ptr != null) {
      current = ptr;
      ptr = ptr.getNext();
      current.setNext(previous);
      previous = current;
      setFirstNode(current);
    }
    
    if(firstNode == null) {
      throw new NullPointerException("No elements in the linked list"); 
    }
  }
  
  /*
   * Main Method to run test of reverse
   */
  public static void main(String[] args) {
    Random r = new Random();
    LinkedList<Integer> list = new LinkedList<Integer>(); 
    for(int i = 0; i < 10; i++) {
    int randomInt = r.nextInt(100) + 1;
    list.addToFront(randomInt);
    }
    list.printList();
    list.reverse();
    list.printList();
  }
}