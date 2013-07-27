/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlist;

/**
 *
 * @author j0ni
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack sl=new StackList();
        Stack sa=new StackArray();
        sl.push(1);
        sl.push(2);
        sl.push(3);

        System.out.println("Stack return "+sl.pop());
        System.out.println("Stack Size: "+sl.size());
        System.out.println("\n");
        sa.push(4);
        sa.push(5);
        sa.push(6);

        System.out.println("Stack return "+sa.pop());
        System.out.println("Stack Size: "+sa.size());
    }

}
