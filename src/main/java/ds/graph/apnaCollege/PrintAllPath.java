package ds.graph.apnaCollege;

import java.util.ArrayList;

public class PrintAllPath {
    public static void printPaths(ArrayList<Edge> graph[], int curr, boolean[] isVisited, int target, String paths) {
        if (curr == target) {
            System.out.println(paths + " ");
            return;
        }
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!isVisited[e.destination]) {
                isVisited[curr] = true;
                printPaths(graph, e.destination, isVisited, target, paths + e.destination);
                isVisited[curr] = false;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];
        Creategraph.constructGraph(graph);
        PrintAllPath.printPaths(graph, 0, new boolean[6], 5, "0");

    }
}
