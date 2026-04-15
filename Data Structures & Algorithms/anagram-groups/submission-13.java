class Solution {
    
    /**
    1.Create a hash map where each key is a 26-length tuple representing character frequencies, and each value is a list of strings belonging to that anagram group.
    2.For each string in the input:
         Initialize a count array of size 26 with all zeros.
         For each character c in the string, increment the count at the corresponding index.
         Convert the count array to a tuple and use it as the key.
         Append the string to the list associated with this key.
    3.After processing all strings, return all the lists stored in the hash map.

    Tc: O(m*n)
    SC: O(m)
       O(m*n) space for the output list.
    **/
     public List<List<String>> groupAnagramsBest(String[] strs) {
        Map<String, List<String>> res=new HashMap<>();
        for(String str: strs){
            int[] count=new int[26];
            for(char c : str.toCharArray()){
                count[c-'a']++;
            }
            String key=Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(str);
        }
        return new ArrayList<>(res.values());
     }

    /**
    1.Create a hash map where each key is the sorted version of a string, and the value is a list of strings belonging to that anagram group.
    2.Iterate through each string in the input list:
            Sort the characters of the string to form a key.
            Append the original string to the list corresponding to this key.
    3.After processing all strings, return all values from the hash map, which represent the grouped anagrams.

    TC: O(m*nlogn)
    SC: O(m*n)
    **/
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String str: strs){
            char[] charArray=str.toCharArray();
            Arrays.sort(charArray);

            String sortedStr=new String(charArray);
            res.putIfAbsent(sortedStr, new ArrayList());
            res.get(sortedStr).add(str);
        }
        
    return new ArrayList<>(res.values());
    }
}
