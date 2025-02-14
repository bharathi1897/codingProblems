package org.example.sampleProblems;
import java.util.HashMap;

public class IsomorphicStrings {
    //Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> map= new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else if(!(map.containsValue(t.charAt(i))))
                map.put(s.charAt(i), t.charAt(i));
            else return false;
        }
        return true;
    }

    public void display(){
        System.out.println("\nAre strings isomorphic: " + isIsomorphic("egg","add"));
    }

}
