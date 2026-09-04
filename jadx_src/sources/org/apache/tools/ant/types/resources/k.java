package org.apache.tools.ant.types.resources;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.d2;
import org.apache.tools.ant.types.y1;

/* JADX INFO: compiled from: Archives.java */
/* JADX INFO: loaded from: classes5.dex */
public class k extends org.apache.tools.ant.types.s implements org.apache.tools.ant.types.u1, Cloneable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w1 f136380g = new w1();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private w1 f136381h = new w1();

    private k h2() {
        return (k) O1(k.class);
    }

    private Stream<org.apache.tools.ant.types.k> j2() {
        LinkedList linkedList = new LinkedList();
        Iterator<org.apache.tools.ant.types.s1> it = this.f136380g.iterator();
        while (it.hasNext()) {
            linkedList.add(e2(new d2(), it.next()));
        }
        Iterator<org.apache.tools.ant.types.s1> it2 = this.f136381h.iterator();
        while (it2.hasNext()) {
            linkedList.add(e2(new y1(), it2.next()));
        }
        return linkedList.stream();
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            org.apache.tools.ant.types.s.a2(this.f136380g, stack, project);
            org.apache.tools.ant.types.s.a2(this.f136381h, stack, project);
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public boolean O() {
        if (Y1()) {
            return h2().O();
        }
        H1();
        return false;
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (!this.f136380g.k2().isEmpty() || !this.f136381h.k2().isEmpty()) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        try {
            k kVar = (k) super.clone();
            kVar.f136380g = (w1) this.f136380g.clone();
            kVar.f136381h = (w1) this.f136381h.clone();
            return kVar;
        } catch (CloneNotSupportedException e10) {
            throw new BuildException(e10);
        }
    }

    protected org.apache.tools.ant.types.k e2(org.apache.tools.ant.types.k kVar, org.apache.tools.ant.types.s1 s1Var) {
        kVar.J(b());
        kVar.E3(s1Var);
        return kVar;
    }

    public w1 f2() {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        return this.f136381h;
    }

    public w1 g2() {
        if (Y1()) {
            throw Z1();
        }
        b2(false);
        return this.f136380g;
    }

    protected Iterator<org.apache.tools.ant.types.k> i2() {
        return j2().iterator();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ boolean isEmpty() {
        return org.apache.tools.ant.types.t1.a(this);
    }

    @Override // java.lang.Iterable
    public Iterator<org.apache.tools.ant.types.s1> iterator() {
        if (Y1()) {
            return h2().iterator();
        }
        H1();
        return j2().flatMap(new Function() { // from class: org.apache.tools.ant.types.resources.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.apache.tools.ant.types.k) obj).stream();
            }
        }).map(new i(org.apache.tools.ant.types.s1.class)).iterator();
    }

    @Override // org.apache.tools.ant.types.u1
    public int size() {
        if (Y1()) {
            return h2().size();
        }
        H1();
        return j2().mapToInt(new ToIntFunction() { // from class: org.apache.tools.ant.types.resources.j
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((org.apache.tools.ant.types.k) obj).size();
            }
        }).sum();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }
}
