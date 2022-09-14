package Java;
import java.util.Arrays;

public class Main {

  public static void pila() {
    Stack myStack = new Stack();
    myStack.push("1");
    myStack.push("2");
    myStack.push("3");
    myStack.push("4");
    myStack.push("20");
    myStack.pop();
    myStack.pop();

    System.out.println(Arrays.toString(myStack.print()));
  
  }
  
  public static void cola() {
    Queue myQueue = new Queue();
    myQueue.enq("Viernes");
    myQueue.enq("Jueves");
    myQueue.enq("Miércoles");
    myQueue.enq("Martes");
    myQueue.enq("Lunes");
    myQueue.deq();
    myQueue.deq();
    myQueue.enq("Viernes");
    System.out.println(Arrays.toString(myQueue.print()));
  }
  
  public static void arbol() {
    Bintree tree = new Bintree();
    tree.insert(10);
    tree.insert(4);
    tree.insert(20);
    tree.insert(2);
    tree.insert(8);
    tree.insert(17);
    tree.insert(170);
    tree.insert(15);

    BTNode currentNode = tree.seek(17);
    System.out.println(currentNode.left.value);
    System.out.println(currentNode.right.value);
  }

  public static void grafo() {
    Graph myGraph = new Graph();
    myGraph.addVtx(1);
    myGraph.addVtx(3);
    myGraph.addVtx(4);
    myGraph.addVtx(5);
    myGraph.addVtx(6);
    myGraph.addVtx(8);

    myGraph.addEdg(1,3);
    myGraph.addEdg(1,4);
    myGraph.addEdg(1,6);
    myGraph.addEdg(3,5);
    myGraph.addEdg(3,6);
    myGraph.addEdg(4,5);
    myGraph.addEdg(4,8);

    System.out.println(myGraph.adjList);
  }
  public static void main(String[] args) {
    // pila();
    // cola();
    // arbol();
    grafo();
  }
}