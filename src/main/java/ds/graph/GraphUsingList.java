package ds.graph;

import java.util.LinkedList;

public class GraphUsingList {
    int v;
    //int edge;
    LinkedList<Integer>[] adjList;

    public GraphUsingList(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    /**
     * for undirected Graph
     *
     * @param source
     * @param dest
     */
    public void addEdge(int source, int dest) {
        adjList[source].add(dest);
        adjList[dest].add(source);
    }
}
