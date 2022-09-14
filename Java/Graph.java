package Java;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
  int nodes;
  HashMap <Integer, ArrayList<Integer>> adjList;

  public Graph() {
    this.nodes = 0;
    this.adjList = new HashMap<Integer, ArrayList<Integer>>();
  }

  public void addVtx(int node) {
    ArrayList<Integer> vtxEdges = new ArrayList<Integer>();
    this.adjList.put(node, vtxEdges);
    this.nodes++;
  }

  public HashMap <Integer, ArrayList<Integer>> addEdg(int node1, int node2) {
    ArrayList<Integer> temp = new ArrayList<Integer>();
    
    temp = this.adjList.get(node1);
    temp.add(node2);
    this.adjList.replace(node1, temp);

    temp = this.adjList.get(node2);
    temp.add(node1);
    this.adjList.replace(node2, temp);
    
    return adjList;
  }
}
