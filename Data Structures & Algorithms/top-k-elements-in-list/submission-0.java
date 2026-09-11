class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      Map<Integer,Integer> map = new HashMap<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (Integer i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        map.forEach((num, count) -> {
            minHeap.offer(new int[]{num, count});
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        });
        int[] result = new int[k];
            for (int i = 0; i < k; i++) {
                result[i] = minHeap.poll()[0];
            }
        return result; 
        
    }
}
