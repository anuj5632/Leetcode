import java.util.*;

class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Set<Integer> visited = new HashSet<>();
        int completeCount = 0;

        for (int node = 0; node < n; node++) {
            if (!visited.contains(node)) {
                Set<Integer> component = new HashSet<>();
                dfs(node, graph, visited, component);

                int nodeCount = component.size();
                int edgeCount = 0;
                for (int v : component) {
                    edgeCount += graph.get(v).size();
                }
                edgeCount /= 2;

                if (edgeCount == (nodeCount * (nodeCount - 1)) / 2) {
                    completeCount++;
                }
            }
        }

        return completeCount;
    }

    private void dfs(int node, Map<Integer, Set<Integer>> graph, Set<Integer> visited, Set<Integer> component) {
        Stack<Integer> stack = new Stack<>();
        stack.push(node);
        visited.add(node);
        component.add(node);

        while (!stack.isEmpty()) {
            int current = stack.pop();
            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                    component.add(neighbor);
                }
            }
        }
    }
}