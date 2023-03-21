package ds.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversal {
    public static void dfsTraversal(int source, LinkedList<Integer>[] adjList, int numberOfVertex) {
        boolean[] isVisited = new boolean[numberOfVertex];
        Stack<Integer> q = new Stack<>();
        q.push(source);
        isVisited[source] = true;
        while (!q.isEmpty()) {
            int temp = q.pop();
            System.out.println(temp + " ");
            for (int n : adjList[temp]) {
                if (!isVisited[n]) {
                    isVisited[n] = true;
                    q.push(n);
                }
            }
        }
    }

    public static void bfsTraversal(int source, LinkedList<Integer>[] adjList, int numberOfVertex) {
        boolean[] isVisited = new boolean[numberOfVertex];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        isVisited[source] = true;
        while (!q.isEmpty()) {
            int temp = q.poll();
            System.out.println(temp + " ");
            for (int n : adjList[temp]) {
                if (!isVisited[n]) {
                    isVisited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public void bfsUtil() {

    }

    public static void main(String[] args) {
        GraphUsingList list = new GraphUsingList(10);
        list.addEdge(1, 2);
        list.addEdge(1, 3);
        list.addEdge(2, 4);
        list.addEdge(4, 5);
        list.addEdge(4, 6);
        list.addEdge(6, 7);
        list.addEdge(7, 8);
        list.addEdge(5, 9);
         bfsTraversal(1, list.adjList, list.v);
       // dfsTraversal(1, list.adjList, list.v);

    }

}
