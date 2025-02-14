package org.example;

import org.example.problems.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello, \nLets practice DSA problems!  ");

        //IsomorphicStrings
        IsomorphicStrings isomorphic = new IsomorphicStrings();
        isomorphic.display();

        //validParantheses
        validParantheses v = new validParantheses();
        v.display();

        //Minimum Size Subarray Sum
        MinSizeSubarrSum ms = new MinSizeSubarrSum();
        ms.display();

    }
}