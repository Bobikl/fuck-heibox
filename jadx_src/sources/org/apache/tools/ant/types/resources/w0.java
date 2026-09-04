package org.apache.tools.ant.types.resources;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: MappedResourceCollection.java */
/* JADX INFO: loaded from: classes5.dex */
public class w0 extends org.apache.tools.ant.types.s implements org.apache.tools.ant.types.u1, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.apache.tools.ant.types.u1 f136467g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.apache.tools.ant.types.k0 f136468h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136469i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f136470j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Collection<org.apache.tools.ant.types.s1> f136471k = null;

    private synchronized Collection<org.apache.tools.ant.types.s1> j2() {
        if (this.f136471k == null || !this.f136470j) {
            this.f136471k = m2();
        }
        return this.f136471k;
    }

    private void k2() {
        if (this.f136467g == null) {
            throw new BuildException("A nested resource collection element is required", w1());
        }
        H1();
    }

    private Collection<org.apache.tools.ant.types.s1> m2() {
        org.apache.tools.ant.types.k0 k0Var = this.f136468h;
        final org.apache.tools.ant.util.g0 q0Var = k0Var == null ? new org.apache.tools.ant.util.q0() : k0Var.i2();
        return (Collection) (this.f136469i ? this.f136467g.stream().flatMap(new Function() { // from class: org.apache.tools.ant.types.resources.u0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return w0.p2(q0Var, (org.apache.tools.ant.types.s1) obj);
            }
        }) : this.f136467g.stream().map(new Function() { // from class: org.apache.tools.ant.types.resources.v0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return w0.q2(q0Var, (org.apache.tools.ant.types.s1) obj);
            }
        })).collect(Collectors.toList());
    }

    private w0 n2() {
        return (w0) O1(w0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q0 o2(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.util.b1 b1Var) {
        return new q0(s1Var, b1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream p2(org.apache.tools.ant.util.g0 g0Var, final org.apache.tools.ant.types.s1 s1Var) {
        return Stream.of((Object[]) g0Var.y0(s1Var.k2())).filter(new Predicate() { // from class: org.apache.tools.ant.types.resources.r0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return com.google.auto.common.s.a((String) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.types.resources.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new org.apache.tools.ant.util.b1((String) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.types.resources.t0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return w0.o2(s1Var, (org.apache.tools.ant.util.b1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ q0 q2(org.apache.tools.ant.util.g0 g0Var, org.apache.tools.ant.types.s1 s1Var) {
        return new q0(s1Var, g0Var);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            k2();
            org.apache.tools.ant.types.k0 k0Var = this.f136468h;
            if (k0Var != null) {
                org.apache.tools.ant.types.s.a2(k0Var, stack, project);
            }
            Object obj = this.f136467g;
            if (obj instanceof org.apache.tools.ant.types.s) {
                org.apache.tools.ant.types.s.a2((org.apache.tools.ant.types.s) obj, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        if (Y1()) {
            return n2().O();
        }
        k2();
        return false;
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136467g != null || this.f136468h != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        try {
            w0 w0Var = (w0) super.clone();
            w0Var.f136467g = this.f136467g;
            w0Var.f136468h = this.f136468h;
            w0Var.f136471k = null;
            return w0Var;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    public synchronized void h2(org.apache.tools.ant.types.u1 u1Var) throws BuildException {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136467g != null) {
            throw new BuildException("Only one resource collection can be nested into mappedresources", w1());
        }
        b2(false);
        this.f136471k = null;
        this.f136467g = u1Var;
    }

    public void i2(org.apache.tools.ant.util.g0 g0Var) {
        l2().e2(g0Var);
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<org.apache.tools.ant.types.s1> iterator() {
        if (Y1()) {
            return n2().iterator();
        }
        k2();
        return j2().iterator();
    }

    public org.apache.tools.ant.types.k0 l2() throws BuildException {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136468h != null) {
            throw new BuildException(org.apache.tools.ant.taskdefs.t1.f135751x, w1());
        }
        b2(false);
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.f136468h = k0Var;
        this.f136471k = null;
        return k0Var;
    }

    public void r2(boolean z10) {
        this.f136470j = z10;
    }

    public void s2(boolean z10) {
        this.f136469i = z10;
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        if (Y1()) {
            return n2().size();
        }
        k2();
        return j2().size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }

    @Override // org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return n2().toString();
        }
        return isEmpty() ? "" : (String) stream().map(new b()).collect(Collectors.joining(File.pathSeparator));
    }
}
