class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxAltitude = 0;

        for (int x : gain) {
            altitude += x;
            maxAltitude = Math.max(maxAltitude, altitude);
        }

        return maxAltitude;
    }
}