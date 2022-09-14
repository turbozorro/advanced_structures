package Java;

public class Queue {
  public QSNode first;
  public QSNode last;
  public int length;

  public Queue() {
    this.first = null;
    this.last = null;
    this.length = 0;
  }

  public QSNode peek() {
    return this.first;
  }

  public String seek(int index) {
    String resultNode = null;
    if (index == 0) {
      resultNode = this.first.value;
    }
    QSNode tempNode = this.first;
    for (int i = 1; i < this.length; i++) {
      tempNode = tempNode.next;
      if (i == index) {
        resultNode = tempNode.value;
      }
    }
    return resultNode;
  }

  public Queue enq(String value) {
    QSNode newNode = new QSNode(value);
    if(this.length == 0) {
      this.first = newNode;
      this.last = newNode;
    } else {
      this.last.next = newNode;
      this.last = newNode;
    }

    this.length ++;
    return this;
  }

  public Queue deq() {
    if(this.first == null) {
      return null;
    }
    if(this.first == this.last) {
      this.last = null;
    }
    this.first = this.first.next;

    this.length--;
    return this;
  }

  public String[] print() {
    String[] queue = new String[this.length];
    for (int i = 0; i < this.length; i++) {
      queue[i] = this.seek(i);
    }

    return queue;
  }
}
