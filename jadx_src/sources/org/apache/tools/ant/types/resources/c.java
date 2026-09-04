package org.apache.tools.ant.types.resources;

import java.io.File;
import java.util.Iterator;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: AbstractResourceCollectionWrapper.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends org.apache.tools.ant.types.s implements org.apache.tools.ant.types.u1, Cloneable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f136331i = " expects exactly one nested resource collection.";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.apache.tools.ant.types.u1 f136332g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136333h = true;

    private c g2() {
        return (c) O1(c.class);
    }

    private BuildException k2() {
        return new BuildException(super.toString() + f136331i);
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            Object obj = this.f136332g;
            if (obj instanceof org.apache.tools.ant.types.s) {
                org.apache.tools.ant.types.s.a2((org.apache.tools.ant.types.s) obj, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized boolean O() {
        if (Y1()) {
            return g2().O();
        }
        H1();
        org.apache.tools.ant.types.u1 u1Var = this.f136332g;
        if (u1Var != null && !u1Var.O()) {
            Iterator<org.apache.tools.ant.types.s1> it = iterator();
            while (it.hasNext()) {
                if (it.next().e2(y.class) == null) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public synchronized void e2(org.apache.tools.ant.types.u1 u1Var) throws BuildException {
        Project projectB;
        if (Y1()) {
            throw Z1();
        }
        if (u1Var == null) {
            return;
        }
        if (this.f136332g != null) {
            throw k2();
        }
        this.f136332g = u1Var;
        if (Project.s0(u1Var) == null && (projectB = b()) != null) {
            projectB.o1(this.f136332g);
        }
        b2(false);
    }

    protected abstract Iterator<org.apache.tools.ant.types.s1> f2();

    protected final synchronized org.apache.tools.ant.types.u1 h2() {
        org.apache.tools.ant.types.u1 u1Var;
        H1();
        u1Var = this.f136332g;
        if (u1Var == null) {
            throw k2();
        }
        return u1Var;
    }

    protected abstract int i2();

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public final synchronized Iterator<org.apache.tools.ant.types.s1> iterator() {
        if (Y1()) {
            return g2().iterator();
        }
        H1();
        return new x(this, f2());
    }

    public synchronized boolean j2() {
        return this.f136333h;
    }

    public synchronized void l2(boolean z10) {
        this.f136333h = z10;
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized int size() {
        if (Y1()) {
            return g2().size();
        }
        H1();
        return i2();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }

    @Override // org.apache.tools.ant.types.s
    public synchronized String toString() {
        if (Y1()) {
            return g2().toString();
        }
        if (isEmpty()) {
            return "";
        }
        return (String) stream().map(new b()).collect(Collectors.joining(File.pathSeparator));
    }
}
