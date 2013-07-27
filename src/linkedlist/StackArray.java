/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author j0ni
 */
public class StackArray implements Stack{

    private int[] stack;
    private int top;

    public StackArray(){
        stack=new int[100];
        top=0;
    }

    public StackArray(int d){
        stack=new int[d];
        top=0;
    }

    public void push(int d) {
        stack[++top]=d;
    }

    public int pop() {
        return stack[--top];
    }

    public int size() {
        return top;
    }

    public boolean isempty() {
        return top==0;
    }

}
