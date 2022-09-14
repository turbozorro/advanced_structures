package Java;

public class Stack {
  public QSNode top;
  public QSNode bottom;
  public int length;

  public Stack() {
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }

  public QSNode peek() {
    return this.top;
  }

  public String seek(int index) {
    String resultNode = null;
    if (index == 0) {
      resultNode = this.top.value;
    } 
    QSNode tempNode = this.top;
    for (int i = 1; i < this.length; i++) {
      tempNode = tempNode.next;
      if (i == index) {
        resultNode = tempNode.value;
      }
    }
    return resultNode;
  }

  public Stack push(String value) {
    QSNode newNode = new QSNode(value);
    if(this.length == 0) {
      this.top = newNode;
      this.bottom = newNode;
    } else {
      QSNode holdingPointer = this.top;
      this.top = newNode;
      this.top.next = holdingPointer;
    }

    this.length++;
    return this;
  }

  public Stack pop() {
    if(this.top == null) {
      return null;
    }
    if(this.top == this.bottom) {
      this.bottom = null;
    }
    this.top = this.top.next;

    this.length--;
    return this;
  }

  public String[] print() {
    String[] stack = new String[this.length];
    for (int i = 0; i < this.length; i++) {
      stack[i] = this.seek(i);
    }

    return stack;
  }
}