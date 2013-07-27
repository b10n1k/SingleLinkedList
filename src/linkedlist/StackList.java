/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author j0ni
 */
public class StackList extends SingleLinkedList implements Stack{

    private int top;

    public StackList(){
        super();
        top=0;
    }

    public void push(int d) {
        addFront(d);
        top++;
    }

    public int pop() {
        removeFront();
        return --top;
    }

    public int size() {
        return top;
    }

    public boolean isempty() {
        return top==0;
    }

}
