package com.algorithm.guide;

import java.util.EmptyStackException;

public class JDKStack<E> {
    protected Object[] elementData;
    protected int elementCount;
    protected transient int modCount = 0;
    public JDKStack() {
        this.elementData = new Object[10];
    }
    public E push(E item) {
        modCount++;
        elementData[elementCount++] = item;
        return item;
    }

    public synchronized E pop() {
        E obj;
        int len = size();

        obj = peek();
        removeElementAt(len - 1);

        return obj;
    }
    public synchronized void removeElementAt(int index) {
        modCount++;
        if (index >= elementCount) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " +
                    elementCount);
        }
        else if (index < 0) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        int j = elementCount - index - 1;
        if (j > 0) {
            System.arraycopy(elementData, index + 1, elementData, index, j);
        }
        elementCount--;
        elementData[elementCount] = null; /* to let gc do its work */
    }
    public synchronized E peek() {
        int len = size();

        if (len == 0)
            throw new EmptyStackException();
        return elementAt(len - 1);
    }
    public synchronized E elementAt(int index) {
        if (index >= elementCount) {
            throw new ArrayIndexOutOfBoundsException(index + " >= " + elementCount);
        }

        return elementData(index);
    }
    E elementData(int index) {
        return (E) elementData[index];
    }

    public synchronized int size() {
        return elementCount;
    }
}
