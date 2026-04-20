class Solution {
    //Create an empty string newStr
    //loop through each character of c in the input string
       //check if c is alphanumeric,convert it lower case and add it into newStr
    //Compare newStr with it's reverse
       //if they are equal, return true
       //otherwise return false
    public boolean isPalindrome(String s) {
        StringBuilder newStr=new StringBuilder();
        for(char c :s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }
}
