package com.example.project;

public class QueueStackTester {
    public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
    {
        throw new UnsupportedOperationException("Not supported yet.");
        splitQueue(q, oq, eq, q.length(), 1);
}

    private static <T> void splitQueue(Queue<T> inputQueue, Queue<T> oddQueue, Queue<T> evenQueue, int totalCount, int currentPos) {
    if (currentPos > totalCount)
        return;
    
    T item = inputQueue.serve();
    inputQueue.enqueue(item);

    if (currentPos % 2 == 1) {
        if (!oddQueue.full())
            oddQueue.enqueue(item);
    } else {
        if (!evenQueue.full())
            evenQueue.enqueue(item);
    }

    splitQueue(inputQueue, oddQueue, evenQueue, totalCount, currentPos + 1);
    }
    public static <T> void remove(LinkedPQ<T> pq, int p)
    {
        throw new UnsupportedOperationException("Not supported yet.");
        PriorityQueue<T> tempPQ = new LinkedPQ<T>();
        int count = pq.length();
        for (int i = 0; i < count; i++) {
             PQElement<T> element = pq.serve();
             if (element.priority >= p)
                 tempPQ.enqueue(element.data, element.priority);
    }
        count = tempPQ.length();
        for (int i = 0; i < count; i++) {
            PQElement<T> element = tempPQ.serve();
            pq.enqueue(element.data, element.priority);
    }
    }
    public static <T> boolean search(Stack<T> st, T e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
        if (st.empty())
           return false;

        T top = st.pop();
        boolean found;

        if (top.equals(e))
           found = true;
        else
           found = search(st, e);

        st.push(top);
        return found;
    }
}
