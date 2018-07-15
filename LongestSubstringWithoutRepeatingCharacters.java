class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s == "")
            return 0;
        int start = 0;
        int end = 0;
        int max = 0;
        char strArray[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int size = strArray.length;
        for (int i = 0; i < size; i++) {
			  // 如果key已经存在，并且在子字符串内
		      // 根据上述描述重设start
            if (map.containsKey(strArray[i])) 
                if (map.get(strArray[i]) >= start) 
                    start = map.get(strArray[i]) + 1;
            end = i;
            map.put(strArray[i], i);
            int currentLength = end - start + 1;
            if (currentLength > max)
                max = currentLength;
        } 
        
        return max;
    }
}