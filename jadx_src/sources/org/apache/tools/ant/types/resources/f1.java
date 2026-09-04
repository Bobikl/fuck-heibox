package org.apache.tools.ant.types.resources;

import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Resources.java */
/* JADX INFO: loaded from: classes5.dex */
public class f1 extends org.apache.tools.ant.types.s implements org.apache.tools.ant.types.u1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final org.apache.tools.ant.types.u1 f136356j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Iterator<org.apache.tools.ant.types.s1> f136357k = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<org.apache.tools.ant.types.u1> f136358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Collection<org.apache.tools.ant.types.s1> f136359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136360i = false;

    /* JADX INFO: compiled from: Resources.java */
    public class a implements org.apache.tools.ant.types.u1 {
        a() {
        }

        @Override // org.apache.tools.ant.types.u1
        public boolean O() {
            return true;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ boolean isEmpty() {
            return org.apache.tools.ant.types.t1.a(this);
        }

        @Override // java.lang.Iterable
        public Iterator<org.apache.tools.ant.types.s1> iterator() {
            return f1.f136357k;
        }

        @Override // org.apache.tools.ant.types.u1
        public int size() {
            return 0;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ Stream stream() {
            return org.apache.tools.ant.types.t1.b(this);
        }
    }

    /* JADX INFO: compiled from: Resources.java */
    public class b implements Iterator<org.apache.tools.ant.types.s1> {
        b() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public org.apache.tools.ant.types.s1 next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: compiled from: Resources.java */
    public class c extends AbstractCollection<org.apache.tools.ant.types.s1> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Collection<org.apache.tools.ant.types.s1> f136361b;

        /* JADX INFO: compiled from: Resources.java */
        public class a implements Iterator<org.apache.tools.ant.types.s1> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Iterator<org.apache.tools.ant.types.u1> f136363b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Iterator<org.apache.tools.ant.types.s1> f136364c;

            private a() {
                this.f136363b = f1.this.h2().iterator();
                this.f136364c = null;
            }

            /* synthetic */ a(c cVar, a aVar) {
                this();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public org.apache.tools.ant.types.s1 next() {
                if (hasNext()) {
                    return this.f136364c.next();
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Iterator<org.apache.tools.ant.types.s1> it = this.f136364c;
                boolean zHasNext = it != null && it.hasNext();
                while (!zHasNext && this.f136363b.hasNext()) {
                    Iterator<org.apache.tools.ant.types.s1> it2 = this.f136363b.next().iterator();
                    this.f136364c = it2;
                    zHasNext = it2.hasNext();
                }
                return zHasNext;
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        c() {
        }

        private synchronized Collection<org.apache.tools.ant.types.s1> a() {
            final Collection<org.apache.tools.ant.types.s1> arrayList;
            arrayList = this.f136361b;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                new a(this, null).forEachRemaining(new Consumer() { // from class: org.apache.tools.ant.types.resources.g1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        arrayList.add((org.apache.tools.ant.types.s1) obj);
                    }
                });
                if (f1.this.f136360i) {
                    this.f136361b = arrayList;
                }
            }
            return arrayList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<org.apache.tools.ant.types.s1> iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    public f1() {
    }

    public f1(Project project) {
        J(project);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized List<org.apache.tools.ant.types.u1> h2() {
        List<org.apache.tools.ant.types.u1> listEmptyList;
        listEmptyList = this.f136358g;
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        return listEmptyList;
    }

    private org.apache.tools.ant.types.u1 i2() {
        return (org.apache.tools.ant.types.u1) O1(org.apache.tools.ant.types.u1.class);
    }

    private synchronized void l2() {
        H1();
        Collection<org.apache.tools.ant.types.s1> cVar = this.f136359h;
        if (cVar == null) {
            cVar = new c();
        }
        this.f136359h = cVar;
    }

    @Override // org.apache.tools.ant.types.s
    protected void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
            return;
        }
        for (Object obj : h2()) {
            if (obj instanceof org.apache.tools.ant.types.s) {
                org.apache.tools.ant.types.s.a2((org.apache.tools.ant.types.s) obj, stack, project);
            }
        }
        b2(true);
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        if (Y1()) {
            return i2().O();
        }
        l2();
        return h2().stream().allMatch(new n());
    }

    public synchronized void g2(org.apache.tools.ant.types.u1 u1Var) {
        if (Y1()) {
            throw Z1();
        }
        if (u1Var == null) {
            return;
        }
        if (this.f136358g == null) {
            this.f136358g = Collections.synchronizedList(new ArrayList());
        }
        this.f136358g.add(u1Var);
        j2();
        this.f136359h = null;
        b2(false);
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<org.apache.tools.ant.types.s1> iterator() {
        if (Y1()) {
            return i2().iterator();
        }
        l2();
        return new x(this, this.f136359h.iterator());
    }

    protected void j2() {
        x.d(this);
    }

    public synchronized void k2(boolean z10) {
        this.f136360i = z10;
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized int size() {
        if (Y1()) {
            return i2().size();
        }
        l2();
        return this.f136359h.size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }

    @Override // org.apache.tools.ant.types.s
    public synchronized String toString() {
        if (Y1()) {
            return i2().toString();
        }
        l2();
        Collection<org.apache.tools.ant.types.s1> collection = this.f136359h;
        if (collection != null && !collection.isEmpty()) {
            return (String) this.f136359h.stream().map(new org.apache.tools.ant.types.resources.b()).collect(Collectors.joining(File.pathSeparator));
        }
        return "";
    }
}
