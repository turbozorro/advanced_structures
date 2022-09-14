class Graph {
  constructor() {
    this.nodes = 0;
    this.adjList = {};
  }
  addVtx(node) {
    this.adjList[node] = [];
    this.nodes++;
  }
  addEdg(node1, node2) {
    this.adjList[node1].push(node2);
    this.adjList[node2].push(node1);
  }
}

const myGraph = new Graph();
myGraph.addVtx('1');
myGraph.addVtx('3');
myGraph.addVtx('4');
myGraph.addVtx('5');
myGraph.addVtx('6');
myGraph.addVtx('8');

myGraph.addEdg('1','3');
myGraph.addEdg('1','4');
myGraph.addEdg('1','6');
myGraph.addEdg('3','5');
myGraph.addEdg('3','6');
myGraph.addEdg('4','5');
myGraph.addEdg('4','8');

