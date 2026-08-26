class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int low = 0;
        int high = Math.max(Arrays.stream(houses).max().getAsInt(), Arrays.stream(heaters).max().getAsInt());
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(houses, heaters, mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    public boolean isPossible(int[] houses, int[] heaters, int radius) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0;

        for (int house : houses) {
            while (i < heaters.length - 1 &&
                    Math.abs(heaters[i + 1] - house) <= Math.abs(heaters[i] - house)) {
                i++;
            }
            if (Math.abs(heaters[i] - house) > radius) {
                return false;
            }
        }
        return true;
    }

}