class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> anagrams=new HashMap<>();
        for (String s:strs){
            int [] freq=new int[26];
           for(char c: s.toCharArray()){
            freq[c -'a']++;
           }
           String stkey=Arrays.toString(freq);
            anagrams.computeIfAbsent(stkey,k->new ArrayList<>()).add(s);
        }
return new ArrayList<>(anagrams.values());
            
    }
}
