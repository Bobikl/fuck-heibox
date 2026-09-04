package org.apache.tools.ant.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

/* JADX INFO: loaded from: classes5.dex */
public class IdentityStack<E> extends Stack<E> {
    private static final long serialVersionUID = -5555522620060077046L;

    public IdentityStack() {
    }

    public IdentityStack(E e10) {
        push(e10);
    }

    public static <E> IdentityStack<E> a(Stack<E> stack) {
        if (stack instanceof IdentityStack) {
            return (IdentityStack) stack;
        }
        IdentityStack<E> identityStack = new IdentityStack<>();
        if (stack != null) {
            identityStack.addAll(stack);
        }
        return identityStack;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean containsAll(Collection<?> collection) {
        IdentityHashMap identityHashMap;
        identityHashMap = new IdentityHashMap();
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            identityHashMap.put(it.next(), Boolean.TRUE);
        }
        return identityHashMap.keySet().containsAll(collection);
    }

    @Override // java.util.Vector
    public synchronized int indexOf(Object obj, int i10) {
        int size = size();
        while (i10 < size) {
            if (get(i10) == obj) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Vector
    public synchronized int lastIndexOf(Object obj, int i10) {
        while (i10 >= 0) {
            if (get(i10) == obj) {
                return i10;
            }
            i10--;
        }
        return -1;
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean removeAll(Collection<?> collection) {
        if (!(collection instanceof Set)) {
            collection = new HashSet((Collection<? extends Object>) collection);
        }
        return super.removeAll(collection);
    }

    @Override // java.util.Vector, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized boolean retainAll(Collection<?> collection) {
        if (!(collection instanceof Set)) {
            collection = new HashSet((Collection<? extends Object>) collection);
        }
        return super.retainAll(collection);
    }
}
