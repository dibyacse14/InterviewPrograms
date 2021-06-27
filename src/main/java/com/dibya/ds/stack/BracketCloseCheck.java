package com.dibya.ds.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/*
* Check expression wheth´´ all bracket are closed properly*/
public class BracketCloseCheck {
    static boolean checkBracketClose(String expr){
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0; i< expr.length();i++){
            char x = expr.charAt(i);
            if(x == '{' || x=='[' || x=='('){
                stack.push(x);
                continue;
            } else if(x == '}' || x==']' || x==')') {
                if(stack.isEmpty()){
                    return false;
                }
                char check;
                switch (x){
                    case ')':
                        check = stack.pop();
                        if(check == '{' || check == '[')
                            return false;
                        break;
                    case '}':

                        check = stack.pop();
                        if(check == '(' || check == '[')
                            return false;
                        break;
                    case ']':
                        check = stack.pop();
                        if(check == '{' || check == '(')
                            return false;
                        break;

                }
            } else {
                continue;
            }


        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String expr = "x(?=y), x(?!y), (?<=y)x, (?<!y)x";
        boolean flagExpr = checkBracketClose(expr);
        if(flagExpr){
            System.out.println("bracket properly closed");
        } else {
            System.out.println("bracket not properly closed");
        }
    }
}
