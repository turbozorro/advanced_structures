class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class Queue {
  constructor() {
    this.first = null;
    this.last = null;
    this.length = 0;
  }

  peek() {
    return this.first;
  }

  seek(index) {
    if (index === 0) {
      return this.first.value;
    }
    let tempNode;
    tempNode = this.first;
    for (let i = 1; i < this.length; i++) {
      tempNode = tempNode.next;
      if (i === index) {
        return tempNode.value;
      }
    }
  }

  enq(value) {
    const newNode = new Node(value);
    if(this.length === 0) {
      this.first = newNode;
      this.last = newNode;
    } else {
      this.last.next = newNode;
      this.last = newNode;
    }

    this.length++;
    return this;
  }
  
  deq() {
    if(!this.first) {
      return null;
    }
    if(this.first === this.last) {
      this.last = null;
    }
    this.first = this.first.next;

    this.length--;
    return this;
  }

  print(){
    const queue = [];
    for (let i = 0; i < this.length; i++) {
      queue.push(this.seek(i));
    }
    return queue;
  }
}

const myQueue = new Queue();
myQueue.enq('Viernes');
myQueue.enq('Jueves');
myQueue.enq('Miércoles');
myQueue.enq('Martes');
myQueue.enq('Lunes');
console.log(myQueue.print());