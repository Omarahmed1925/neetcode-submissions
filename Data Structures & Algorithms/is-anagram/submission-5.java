
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }
        if (charCountMap1.equals(charCountMap2)) {
            System.out.println(s + " and " + t + " are anagrams.");
            return true;
        } else {
            System.out.println(s + " and " + t + " are not anagrams.");
        


        }
        return false;
    
    }

}
