package medium;

class Stack<E> {
  private final int size;

  private int top;

  private E[] elements;

  public Stack() {
    this(10);
  }

  public Stack(int s) {
    size = s > 0 ? s : 10;
    top = -1;

    elements = (E[]) new Object[size]; 
  }

  public void push(E pushValue) {
    if (top == size - 1) 
      throw new FullStackException(String.format("Stack is full, cannot push %s", pushValue));

    elements[++top] = pushValue; 
  }

  public E pop() {
    if (top == -1) 
      throw new EmptyStackException("Stack is empty, cannot pop");

    return elements[top--]; 
  }
}

class EmptyStackException extends RuntimeException {
	  public EmptyStackException() {
	    this("Stack is empty");
	  }

	  public EmptyStackException(String exception) {
	    super(exception);
	  }
	}

	class FullStackException extends RuntimeException {
	  public FullStackException() {
	    this("Stack is full");
	  }

	  public FullStackException(String exception) {
	    super(exception);
	  }
	}
	
public class C3_genericStack {

	public static void main(String args[]) {
	    double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6 };
	    int[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

	    Stack<Double> doubleStack = new Stack<Double>(5);
	    Stack<Integer> integerStack = new Stack<Integer>(10);

	    
	    try {
	      System.out.println("\nPushing elements onto doubleStack");

	      for (double element : doubleElements) {
	        System.out.printf("%.1f ", element);
	        doubleStack.push(element);
	      }
	    } catch (FullStackException fullStackException) {
	      System.err.println();
	      fullStackException.printStackTrace();
	    }

	    
	    try {
	      System.out.println("\nPopping elements from doubleStack");
	      double popValue;

	      while (true) {
	        popValue = doubleStack.pop(); // pop from doubleStack
	        System.out.printf("%.1f ", popValue);
	      }
	    } catch (EmptyStackException emptyStackException) {
	      System.err.println();
	      emptyStackException.printStackTrace();
	    }

	    
	    try {
	      System.out.println("\nPushing elements onto integerStack");

	      for (int element : integerElements) {
	        System.out.printf("%d ", element);
	        integerStack.push(element);
	      }
	    } catch (FullStackException fullStackException) {
	      System.err.println();
	      fullStackException.printStackTrace();
	    }
	    
	    try {
	      System.out.println("\nPopping elements from integerStack");
	      int popValue; 

	      
	      while (true) {
	        popValue = integerStack.pop();
	        System.out.printf("%d ", popValue);
	      }
	    } catch (EmptyStackException emptyStackException) {
	      System.err.println();
	      emptyStackException.printStackTrace();
	    }

	  }
}