class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){
               char[] ch = strs[i].toCharArray();
               Arrays.sort(ch);
               String sortedKey = new String(ch);
               if(!map.containsKey(sortedKey)){
                map.put(sortedKey, new ArrayList<>());
               }
               map.get(sortedKey).add(strs[i]);


    // Automatically creates a new list if missing, then adds the string
    // map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
