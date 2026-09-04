class Solution {
    public boolean isAnagram(String s, String t) {
       List<Character> set1=new ArrayList<>();
    List<Character> set2=new ArrayList<>();
    boolean flag=false;
    for(char c : s.toCharArray()){
        set1.add(c);
    }
    for(char c : t.toCharArray()){
        set2.add(c);
    }
    Collections.sort(set1);
    Collections.sort(set2);

    if(s.length()!=t.length()){
     flag=false;
    } else if (set1.equals(set2)) {
        flag=true;

    } else {
        return flag;
    }
    return flag;


    }
}
