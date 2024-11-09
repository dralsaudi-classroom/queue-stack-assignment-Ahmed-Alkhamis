package com.example.project;

public class DLL<T> {
	private DLLNode<T> head;
	private DLLNode<T> current;

    public DLL() {
        head = current = null;
    }
    public boolean empty() {
        return head == null;
    }
    public boolean last() {
        return current.next == null;
    }
    public boolean first() {
        return current.previous == null;
    }
    public boolean full() {
        return false;
    }
    public void findFirst() {
        current = head;
    }
    public void findNext() {
        current = current.next;
    }
    public void findPrevious() {
        current = current.previous;
    }
    public T retrieve() {
        return current.data;
    }
    public void update(T val) {
        current.data = val;
    }
    public void insert(T val) {
        DLLNode<T> tmp = new DLLNode<T>(val);
        if(empty()) {
            current = head = tmp;
        }
        else {
            tmp.next = current.next;
            tmp.previous = current;
            if(current.next != null)
                current.next.previous = tmp;
            current.next = tmp;
            current = tmp;
        }
    }
    public void remove() {
        if(current == head) {
            head = head.next;
            if(head != null)
               head.previous = null;
        }
        else {
            current.previous.next = current.next;
            if(current.next != null)
               current.next.previous = current.previous;
        }
        if(current.next == null)
            current = head;
        else
            current = current.next;
    }
    public void removeBetween(T e1, T e2) {
        throw new UnsupportedOperationException("Not supported yet.");
       Node<T> e11 = head;
	    while(e11 != null){
		    if(e11.data.equals(e1))
			    break;
		    e11 = e11.next;}
	    Node<T> e22 = e11;
	    while(e22 != null){
		    if(e22.data.equals(e2))
			    break;
		    e22 = e22.next;}
	    if(e11.data.equals(e1) && e22.data.equals(e2) && e11 != e22){
		    e11.next.previous = null;
		    e22.previous.next = null;
		    e11.next = e22;
		    e22.previous = e11;}
			    
    }
}
