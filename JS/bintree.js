class Node {
  constructor(value) {
    this.left = null;
    this.right = null;
    this.value = value;
  }
}

class BinTree {
  constructor() {
    this.root = null;
  }
  
  insert(value) {
    const newNode = new Node(value);
    if(this.root === null) {
      this.root = newNode;
    } else {
      let currentNode = this.root;
      while(true) {
        if(value < currentNode.value){
          if(!currentNode.left) {
            currentNode.left = newNode;
            return this;
          }
          currentNode = currentNode.left;
        } else {
          if(!currentNode.right){
            currentNode.right = newNode;
            return this;
          }
          currentNode = currentNode.right;
        }
      }
    }
  }

  seek(value) {
    if(this.root === null) {
      return null;
    } else {
      let currentNode = this.root;
      while(true) {
        if(value === currentNode.value) {
          return currentNode;
        } else if (value < currentNode.value){
          currentNode = currentNode.left;
        } else {
          currentNode = currentNode.right;
        }
      }
    }

  }
}

const tree = new BinTree();
tree.insert(10);
tree.insert(4);
tree.insert(20);
tree.insert(2);
tree.insert(8);
tree.insert(17);
tree.insert(170);
