
//link to Question - https://leetcode.com/problems/longest-substring-without-repeating-characters/


class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0)
            return 0;
        
        int res = 0;
        int start = 0;
        HashSet<Character> uniqueCharacter = new HashSet<>();
        
        for(char c : s.toCharArray()){
            while(uniqueCharacter.contains(c)){
                uniqueCharacter.remove(s.charAt(start));
                start++;
            }
            
            uniqueCharacter.add(c);
            
            res = Math.max(res, uniqueCharacter.size());
        }
        
        return res;
        
    }
}
