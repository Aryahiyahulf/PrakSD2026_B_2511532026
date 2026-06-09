package pekan9_2511532026;
import java.util.*;

public class GraphTraversal_2511532026 {

    private Map<String, List<String>> graph_2026 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge_2026(String node1_2026, String node2_2026) {
        graph_2026.putIfAbsent(node1_2026, new ArrayList<>());
        graph_2026.putIfAbsent(node2_2026, new ArrayList<>());

        graph_2026.get(node1_2026).add(node2_2026);
        graph_2026.get(node2_2026).add(node1_2026);
    }

    // Menampilkan graf awal
    public void printGraph_2026() {
        System.out.println("Graf Awal (Adjacency List):");

        for (String node_2026 : graph_2026.keySet()) {
            System.out.print(node_2026 + " -> ");

            List<String> neighbors_2026 = graph_2026.get(node_2026);
            System.out.println(String.join(", ", neighbors_2026));
        }

        System.out.println();
    }

    // DFS rekursif
    public void dfs_2026(String start_2026) {
        Set<String> visited_2026 = new HashSet<>();

        System.out.println("Penelusuran DFS:");
        dfsHelper_2026(start_2026, visited_2026);

        System.out.println();
    }

    private void dfsHelper_2026(String current_2026, Set<String> visited_2026) {

        if (visited_2026.contains(current_2026)) return;

        visited_2026.add(current_2026);
        System.out.print(current_2026 + " ");

        for (String neighbor_2026 : graph_2026.getOrDefault(current_2026, new ArrayList<>())) {
            dfsHelper_2026(neighbor_2026, visited_2026);
        }
    }
    public void bfs_2026(String start_2026) {

        Set<String> visited_2026 = new HashSet<>();
        Queue<String> queue_2026 = new LinkedList<>();

        queue_2026.add(start_2026);
        visited_2026.add(start_2026);

        System.out.println("Penelusuran BFS:");

        while (!queue_2026.isEmpty()) {

            String current_2026 = queue_2026.poll();
            System.out.print(current_2026 + " ");

            for (String neighbor_2026 : graph_2026.getOrDefault(current_2026, new ArrayList<>())) {
                if (!visited_2026.contains(neighbor_2026)) {
                    queue_2026.add(neighbor_2026);
                    visited_2026.add(neighbor_2026);
                }
            }
        }

        System.out.println();
    }
    public static void main(String[] args) {

        GraphTraversal_2511532026 graph_2026 = new GraphTraversal_2511532026();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_2026.addEdge_2026("A", "B");
        graph_2026.addEdge_2026("A", "C");
        graph_2026.addEdge_2026("B", "D");
        graph_2026.addEdge_2026("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah: ");
        graph_2026.printGraph_2026();

        // DFS
        graph_2026.dfs_2026("A");

        // BFS
        graph_2026.bfs_2026("A");
    }
}