class Solution {

    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;
        int[] state = new int[n];

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (dfs(i, graph, state)) {
                result.add(i);
            }
        }

        return result;
    }

    private boolean dfs(int node, int[][] graph, int[] state) {

        // Already processed
        if (state[node] == 2) {
            return true;
        }

        // Currently in recursion path -> cycle
        if (state[node] == 1) {
            return false;
        }

        // Mark as currently visiting
        state[node] = 1;

        for (int neighbour : graph[node]) {

            if (!dfs(neighbour, graph, state)) {
                return false;
            }
        }

        // All neighbours are safe
        state[node] = 2;

        return true;
    }
}