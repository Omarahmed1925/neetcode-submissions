class Solution {

  public String encode(List<String> strs) {
        String encodedString = "";
        for (String str : strs) {
            encodedString += str.length() + "#" + str;
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        int stringLength;
        List<String> decodedStrings = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
           int j=i;
            while (str.charAt(j) != '#') {
                j++;
            }
            stringLength = Integer.parseInt(str.substring(i, j));
            decodedStrings.add(str.substring(j + 1, j + 1 + stringLength));
            i = j + stringLength;
        }

        return decodedStrings;
    }
}
