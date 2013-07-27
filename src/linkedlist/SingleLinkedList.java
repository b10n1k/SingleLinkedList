package linkedlist;

import java.util.Iterator;

public class SingleLinkedList {

    private Node head;

    public SingleLinkedList() {
        head = null;

    }

// -----------------------------------------------
    private Node createNewNode(int data) {
        return new Node(data);
    }

// -----------------------------------------------
    public void addBack(int data) {
        Node p;
        Node node = createNewNode(data);

        if (head == null) {
            head = node;
        } else {
            p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        }
    }

// -----------------------------------------------
    public void addFront(int data) {
        Node p;
        Node node = createNewNode(data);

        node.next = head;
        head = node;

    }

// -----------------------------------------------
    public void removeBack() {
        Node p, q;

        p = head;
        q = null;

        while (p.next != null) {
            q = p;
            p = p.next;
        }

        if (q == null) {
            head = null;
        } else {
            q.next = null;
        }

        p = null;
    }

// -----------------------------------------------
    public void removeFront() {
        Node p = head;

        head = p.next;
        p.next = null;
        p = null;
    }

// -----------------------------------------------
    public boolean isEmpty() {
        return head == null;
    }

// -----------------------------------------------
    public void find(int elem) {
        Node p = head;
        boolean found = false;
        int pos = 0;

        while ((p != null) && !found) {
            if (elem == p.data) {
                found = true;
            }
            pos++;
            p = p.next;
        }

        if (found) {
            System.out.println("Element found in position:" + pos);
        } else {
            System.out.println("Element not found...");
        }
    }

// -----------------------------------------------
    public void addAfter(int exist, int elem) {
        Node p = head;

        boolean found = false;

        while ((p != null) && !found) {
            if (exist == p.data) {
                found = true;
                Node node = createNewNode(elem);
                node.next = p.next;
                p.next = node;
            }

            p = p.next;
        }

        if (!found) {
            addBack(elem);
        }
    }

// -----------------------------------------------
    public void addSorted(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
        } else {
            Node p = head;
            Node q = null;

            while ((p != null) && (node.data > p.data)) {
                q = p;
                p = p.next;
            }

            node.next = p;
            if (q == null) {
                head = node;
            } else {
                q.next = node;
            }
        }
    }

// -----------------------------------------------
    public void printList() {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

// -----------------------------------------------
    @Override
    public String toString() {
        Node p = head;
        String s = "";
        if (head == null) {
            s = "List is Empty";
        } else {
            while (p != null) {
                s = s + p.data + " ";
                p = p.next;
            }
        }
        return s;
    }

// -----------------------------------------------

    public Iterator iterator()
    {
        return new ListIterator();
    }

    private class ListIterator implements Iterator
    {
        Node p;

        public ListIterator()
        {
            p = null;
        }

        public boolean hasNext()
        {
            if (p == null)
                return head != null;
            else
                return p.next != null;
        }

        public Object next()
        {
            if(hasNext())
            {
                if (p == null)
                    p = head;
                else
                {
                    p = p.next;
                }
                return p.data;
            }
            else
                return null;
        }

        public void remove() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }


     private class Node {

        public int data;
        public Node next = null;

        public Node(int data) {
            this.data = data;
        }
    }

     public class StackList implements Stack{

         SingleLinkedList sl;
         int top=0;
        
        public StackList(){
            sl=new SingleLinkedList();
        } 
         
        public void push(int d) {
            sl.addFront(d);
            top++;
        }

        public int pop() {
            sl.removeFront();
            --top;
            return sl.head.data;
        }

        public int size() {
            return top;
        }

        public boolean isempty() {
            return top==0;
        }
         
     }
     
     private class StackArray implements Stack{

         private int stack[];
         private int top=0;
         
        public StackArray(){
            stack=new int[100];
        } 
        
        public void push(int d) {
            stack[top]=d;
            top++;
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

}