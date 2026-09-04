package org.apache.tools.ant.types.resources;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: BaseResourceCollectionContainer.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class q extends org.apache.tools.ant.types.s implements org.apache.tools.ant.types.u1, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<org.apache.tools.ant.types.u1> f136409g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Collection<org.apache.tools.ant.types.s1> f136410h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136411i = true;

    public q() {
    }

    public q(Project project) {
        J(project);
    }

    private synchronized Collection<org.apache.tools.ant.types.s1> h2() {
        if (this.f136410h == null || !l2()) {
            this.f136410h = i2();
        }
        return this.f136410h;
    }

    private q j2() {
        return (q) O1(q.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean m2(org.apache.tools.ant.types.s1 s1Var) {
        return s1Var.f2(y.class).isPresent();
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            for (Object obj : this.f136409g) {
                if (obj instanceof org.apache.tools.ant.types.s) {
                    org.apache.tools.ant.types.s.a2((org.apache.tools.ant.types.s) obj, stack, project);
                }
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized boolean O() {
        if (Y1()) {
            return j2().O();
        }
        H1();
        if (this.f136409g.stream().allMatch(new n())) {
            return true;
        }
        return h2().stream().allMatch(new Predicate() { // from class: org.apache.tools.ant.types.resources.o
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return q.m2((org.apache.tools.ant.types.s1) obj);
            }
        });
    }

    public synchronized void clear() throws BuildException {
        if (Y1()) {
            throw Z1();
        }
        this.f136409g.clear();
        x.d(this);
        this.f136410h = null;
        b2(false);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        try {
            q qVar = (q) super.clone();
            qVar.f136409g = new ArrayList(this.f136409g);
            qVar.f136410h = null;
            return qVar;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public synchronized void f2(org.apache.tools.ant.types.u1 u1Var) throws BuildException {
        Project projectB;
        if (Y1()) {
            throw Z1();
        }
        if (u1Var == null) {
            return;
        }
        if (Project.s0(u1Var) == null && (projectB = b()) != null) {
            projectB.o1(u1Var);
        }
        this.f136409g.add(u1Var);
        x.d(this);
        this.f136410h = null;
        b2(false);
    }

    public synchronized void g2(Collection<? extends org.apache.tools.ant.types.u1> collection) throws BuildException {
        if (Y1()) {
            throw Z1();
        }
        try {
            collection.forEach(new Consumer() { // from class: org.apache.tools.ant.types.resources.p
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f136406b.f2((org.apache.tools.ant.types.u1) obj);
                }
            });
        } catch (ClassCastException e10) {
            throw new BuildException(e10);
        }
    }

    protected abstract Collection<org.apache.tools.ant.types.s1> i2();

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator<org.apache.tools.ant.types.s1> iterator() {
        if (Y1()) {
            return j2().iterator();
        }
        H1();
        return new x(this, h2().iterator());
    }

    public final synchronized List<org.apache.tools.ant.types.u1> k2() {
        H1();
        return Collections.unmodifiableList(this.f136409g);
    }

    public synchronized boolean l2() {
        return this.f136411i;
    }

    public synchronized void n2(boolean z10) {
        this.f136411i = z10;
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized int size() {
        if (Y1()) {
            return j2().size();
        }
        H1();
        return h2().size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }

    @Override // org.apache.tools.ant.types.s
    public synchronized String toString() {
        if (Y1()) {
            return j2().toString();
        }
        if (h2().isEmpty()) {
            return "";
        }
        return (String) this.f136410h.stream().map(new b()).collect(Collectors.joining(File.pathSeparator));
    }
}
