package org.apache.tools.ant.types.resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* JADX INFO: compiled from: LazyResourceCollectionWrapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class o0 extends c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Iterator<org.apache.tools.ant.types.s1> f136397k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<org.apache.tools.ant.types.s1> f136396j = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Supplier<Iterator<org.apache.tools.ant.types.s1>> f136398l = new Supplier() { // from class: org.apache.tools.ant.types.resources.n0
        @Override // java.util.function.Supplier
        public final Object get() {
            return this.f136393a.p2();
        }
    };

    /* JADX INFO: compiled from: LazyResourceCollectionWrapper.java */
    public class a implements Iterator<org.apache.tools.ant.types.s1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f136399b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Iterator<org.apache.tools.ant.types.s1> f136400c;

        public a(Iterator<org.apache.tools.ant.types.s1> it) {
            this.f136400c = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.apache.tools.ant.types.s1 next() {
            org.apache.tools.ant.types.s1 s1Var;
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            synchronized (o0.this.f136396j) {
                List list = o0.this.f136396j;
                int i10 = this.f136399b;
                this.f136399b = i10 + 1;
                s1Var = (org.apache.tools.ant.types.s1) list.get(i10);
            }
            return s1Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            synchronized (o0.this.f136396j) {
                if (o0.this.f136396j.size() > this.f136399b) {
                    return true;
                }
                if (!this.f136400c.hasNext()) {
                    return false;
                }
                o0.this.f136396j.add(this.f136400c.next());
                return true;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: LazyResourceCollectionWrapper.java */
    public class b implements Iterator<org.apache.tools.ant.types.s1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        org.apache.tools.ant.types.s1 f136402b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f136403c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final Iterator<org.apache.tools.ant.types.s1> f136404d;

        b(Iterator<org.apache.tools.ant.types.s1> it) {
            this.f136404d = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.apache.tools.ant.types.s1 next() {
            if (!hasNext()) {
                throw new UnsupportedOperationException();
            }
            org.apache.tools.ant.types.s1 s1Var = this.f136402b;
            this.f136402b = null;
            return s1Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f136403c) {
                return false;
            }
            while (this.f136402b == null) {
                if (!this.f136404d.hasNext()) {
                    this.f136403c = true;
                    return false;
                }
                org.apache.tools.ant.types.s1 next = this.f136404d.next();
                this.f136402b = next;
                if (o0.this.o2(next)) {
                    this.f136402b = null;
                }
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterator p2() {
        return new b(h2().iterator());
    }

    @Override // org.apache.tools.ant.types.resources.c
    protected Iterator<org.apache.tools.ant.types.s1> f2() {
        if (!j2()) {
            return this.f136398l.get();
        }
        if (this.f136397k == null) {
            this.f136397k = this.f136398l.get();
        }
        return new a(this.f136397k);
    }

    @Override // org.apache.tools.ant.types.resources.c
    protected int i2() {
        Iterator<org.apache.tools.ant.types.s1> itF2 = f2();
        int i10 = 0;
        while (itF2.hasNext()) {
            itF2.next();
            i10++;
        }
        return i10;
    }

    protected boolean o2(org.apache.tools.ant.types.s1 s1Var) {
        return false;
    }
}
