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
        }
        return new ArrayList<>(map.values());
        
    }
}
