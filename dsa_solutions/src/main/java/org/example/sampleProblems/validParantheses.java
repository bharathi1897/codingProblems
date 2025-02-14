package org.example.sampleProblems;
import java.util.Stack;
import java.util.function.Predicate;


public class validParantheses {
    public boolean isValid(String s) {
        Stack<Character> bh = new Stack<>();

        Predicate<Character> checkInputType = i -> i == '(' || i == ')' || i == '{' || i == '}' || i == '[' || i == ']';

        s.chars()
                .mapToObj(x -> (char) x)
                .filter(checkInputType)
                .forEach(x -> {
                    if(x == '(' || x == '{' || x == '[')
                        bh.push(x);
                    else if(x == ')' && !bh.isEmpty() && bh.peek()=='(')
                        bh.pop();
                    else if(x == '}' && !bh.isEmpty() && bh.peek()=='{')
                        bh.pop();
                    else if(x == ']' && !bh.isEmpty() && bh.peek()=='[')
                        bh.pop();
                    else
                        bh.push(x);
                });
        return bh.isEmpty();

    }

    public void display(){
        System.out.println("\nparantheses balances " +isValid("([])") );
    }
}
