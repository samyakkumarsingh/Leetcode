class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        // Initialize each HashSet
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        // Traverse every cell
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                char d = board[r][c];

                // Ignore empty cells
                if (d == '.') {
                    continue;
                }

                // Compute box index
                int box = (r / 3) * 3 + (c / 3);

                // Check for duplicates
                if (rows[r].contains(d) ||
                    cols[c].contains(d) ||
                    boxes[box].contains(d)) {
                    return false;
                }

                // Store the digit
                rows[r].add(d);
                cols[c].add(d);
                boxes[box].add(d);
            }
        }

        return true;
    }
}