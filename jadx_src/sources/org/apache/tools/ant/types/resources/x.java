package org.apache.tools.ant.types.resources;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: FailFast.java */
/* JADX INFO: loaded from: classes5.dex */
public class x implements Iterator<org.apache.tools.ant.types.s1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final WeakHashMap<Object, Set<x>> f136472d = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f136473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator<org.apache.tools.ant.types.s1> f136474c;

    x(Object obj, Iterator<org.apache.tools.ant.types.s1> it) {
        if (obj == null) {
            throw new IllegalArgumentException("parent object is null");
        }
        if (it == null) {
            throw new IllegalArgumentException("cannot wrap null iterator");
        }
        this.f136473b = obj;
        if (it.hasNext()) {
            this.f136474c = it;
            b(this);
        }
    }

    private static synchronized void b(x xVar) {
        f136472d.computeIfAbsent(xVar.f136473b, new Function() { // from class: org.apache.tools.ant.types.resources.w
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return x.e(obj);
            }
        }).add(xVar);
    }

    private static synchronized void c(x xVar) {
        if (!f136472d.get(xVar.f136473b).contains(xVar)) {
            throw new ConcurrentModificationException();
        }
    }

    static synchronized void d(Object obj) {
        Set<x> set = f136472d.get(obj);
        if (set != null) {
            set.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Set e(Object obj) {
        return new HashSet();
    }

    private static synchronized void g(x xVar) {
        Set<x> set = f136472d.get(xVar.f136473b);
        if (set != null) {
            set.remove(xVar);
        }
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public org.apache.tools.ant.types.s1 next() {
        Iterator<org.apache.tools.ant.types.s1> it = this.f136474c;
        if (it == null || !it.hasNext()) {
            throw new NoSuchElementException();
        }
        c(this);
        try {
            return this.f136474c.next();
        } finally {
            if (!this.f136474c.hasNext()) {
                this.f136474c = null;
                g(this);
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f136474c == null) {
            return false;
        }
        c(this);
        return this.f136474c.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
