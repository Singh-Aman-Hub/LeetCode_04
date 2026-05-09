class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int tsx = 0;
        int tsy = 0;
        int tex = m - 1;
        int tey = n - 1;

        while (tsx < tex && tsy < tey) {

            List<Integer> ring = new ArrayList<>();

            // TOP
            for (int j = tsy; j <= tey; j++) {
                ring.add(grid[tsx][j]);
            }

            // RIGHT
            for (int i = tsx + 1; i <= tex - 1; i++) {
                ring.add(grid[i][tey]);
            }

            // BOTTOM
            for (int j = tey; j >= tsy; j--) {
                ring.add(grid[tex][j]);
            }

            // LEFT
            for (int i = tex - 1; i >= tsx + 1; i--) {
                ring.add(grid[i][tsy]);
            }

            int len = ring.size();
            int rot = k % len;

            List<Integer> rotated = new ArrayList<>();

            // counter-clockwise rotation
            for (int i = 0; i < len; i++) {
                rotated.add(ring.get((i + rot) % len));
            }

            int idx = 0;

            // TOP
            for (int j = tsy; j <= tey; j++) {
                grid[tsx][j] = rotated.get(idx++);
            }

            // RIGHT
            for (int i = tsx + 1; i <= tex - 1; i++) {
                grid[i][tey] = rotated.get(idx++);
            }

            // BOTTOM
            for (int j = tey; j >= tsy; j--) {
                grid[tex][j] = rotated.get(idx++);
            }

            // LEFT
            for (int i = tex - 1; i >= tsx + 1; i--) {
                grid[i][tsy] = rotated.get(idx++);
            }

            tsx++;
            tsy++;
            tex--;
            tey--;
        }

        return grid;
    }
}