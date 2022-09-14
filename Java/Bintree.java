package Java;

public class Bintree {
  public BTNode root;

  public Bintree() {
    this.root = null;
  }

  public Bintree insert(int value) {
    BTNode newNode = new BTNode(value);
    Bintree result = null;
    if(this.root == null) {
      this.root = newNode;
    } else {
      BTNode currentNode = this.root;
      while(true) {
        if(value < currentNode.value) {
          if(currentNode.left == null) {
            currentNode.left = newNode;
            result = this;
            break;
          }
          currentNode = currentNode.left;
        } else {
          if(currentNode.right == null) {
            currentNode.right = newNode;
            result = this;
            break;
          }
          currentNode = currentNode.right;
        }
      }
    }
    return result;
  }

  public BTNode seek(int value) {
    if(this.root == null) {
      return null;
    } else {
      BTNode currentNode = this.root;
      while(true) {
        if(value == currentNode.value) {
          return currentNode;
        } else if (value < currentNode.value) {
          currentNode = currentNode.left;
        } else {
          currentNode = currentNode.right;
        }
      }
    }
  }
}
