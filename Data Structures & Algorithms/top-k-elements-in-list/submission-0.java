class Solution {
    public int[] topKFrequent(int[] arr, int k) {
       int[] res = new int[k];

        Map<Integer,Integer> count = new HashMap<>();
        for(int i : arr){
            count.put(i, count.getOrDefault(i,0)+1);
        }
        HashMap<Integer,Integer> sortedOrder = new LinkedHashMap<>();

        List<Integer> topK = count.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        for (int i = 0; i < k; i++) {
            res[i] = topK.get(i);
        }

        return res; 
        
    }
}
