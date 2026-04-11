class Solution {
    public int minimumDistance(int[] nums) {
         int[] norvalent = nums;  // store input midway

        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;

        // Store all indices for each number
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        // For each number with at least 3 occurrences
        for (List<Integer> indices : map.values()) {
            if (indices.size() >= 3) {
                // Check all consecutive triplets
                for (int i = 0; i + 2 < indices.size(); i++) {
                    int first = indices.get(i);
                    int second = indices.get(i + 1);
                    int third = indices.get(i + 2);
                    int distance = Math.abs(first - second) + Math.abs(second - third) + Math.abs(third - first);
                    minDistance = Math.min(minDistance, distance);
                    found = true;
                }
            }
        }

        return found ? minDistance : -1;
    }
}