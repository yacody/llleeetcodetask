class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n : nums) {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        }
        for (int k : countMap.keySet()) {
            if (countMap.get(k) > 1) {
                return true;
            }
        }
        return false;
    }
}