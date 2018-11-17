/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithmen;

import java.util.Stack;

/**
 *
 * @author Mutz
 */
public class StackTest {
    public static void main(String[] args) {
        Stack <Character> myStack = new Stack<Character>();
        boolean fehler=false;
        
        String gleichung = "()(abc()";
        
        for (int i = 0; i < gleichung.length(); i++) {
            if(gleichung.charAt(i)=='(')
                myStack.push(gleichung.charAt(i));
            else if (gleichung.charAt(i)==')')
                if(!myStack.empty()) 
                    myStack.pop();
                else {
                    fehler = true;
                    break;
                }
        }
        
        System.out.println((myStack.empty() && !fehler) ? "Syntax korrekt" : "Syntax fehlerhaft");
    }
}
