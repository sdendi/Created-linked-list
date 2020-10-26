public class LLNode<T> {
  // field for element stored
  private T element;
  // field for the next node
  private LLNode<T> next;
  
  /* Constructs a Node for the linked list
   * @param element is the element you want stored
   * @param next is the next node you want 
   */
  public LLNode(T element , LLNode<T> next) {
    this.element = element;
    this.next = next;
  }
  
  /* sets the next node
   * @param next is the new next node
   */
  public void setNext(LLNode<T> next) {
    this.next = next; 
  }
  
  /* gets the next element
   * @return next is the element in the next node
   */
  public LLNode<T> getNext() {
    return next;
  }
  
  /* returns the element at the node
   * @return element is the element at the node
   */
  public T getElement() {
    return element; 
  }
  
  /* sets the element at the node
   * @param element is the new element at the node
   */
  public void setElement(T element) {
    this.element = element; 
  }
}