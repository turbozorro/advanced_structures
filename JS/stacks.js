class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class Stack {
  constructor() {
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }

  peek() {
    return this.top;
  }

  seek(index) {
    if (index === 0) {
      return this.top.value;
    }
    let tempNode;
    tempNode = this.top;
    for (let i = 1; i < this.length; i++) {
      tempNode = tempNode.next;
      if (i === index) {
        return tempNode.value;
      }
    }
  }

  push(value) {
    const newNode = new Node(value);
    if(this.length === 0) {
      this.top = newNode;
      this.bottom = newNode;
    } else {
      const holdingPointer = this.top;
      this.top = newNode;
      this.top.next = holdingPointer;
    }

    this.length++;
    return this;
  }

  pop(){
    if(!this.top) {
      return null;
    }
    if(this.top === this.bottom) {
      this.bottom = null;
    }
    this.top = this.top.next;

    this.length--;
    return this;
  }
  
  print(){
    const stack = [];
    for (let i = 0; i < this.length; i++) {
      stack.push(this.seek(i));
    }
    return stack;
  }
}

const myStack = new Stack();
myStack.push(1);
myStack.push(2);
myStack.push(3);
myStack.push(4);