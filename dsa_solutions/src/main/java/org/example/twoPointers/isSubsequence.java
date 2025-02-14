package org.example.twoPointers;

public class isSubsequence {
    public boolean isSubsequencefound(String s, String t) {
        int i = 0, j =0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i==s.length();
    }

    public void display(){
        System.out.println("\nIS it a subsequence ? :"+ isSubsequencefound("abc","ahbgdc"));
    }
}
