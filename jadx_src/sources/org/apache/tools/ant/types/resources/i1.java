package org.apache.tools.ant.types.resources;

import java.util.Iterator;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Restrict.java */
/* JADX INFO: loaded from: classes5.dex */
public class i1 extends org.apache.tools.ant.types.resources.selectors.o implements org.apache.tools.ant.types.u1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o0 f136376h = new a();

    /* JADX INFO: compiled from: Restrict.java */
    public class a extends o0 {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean r2(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.types.resources.selectors.n nVar) {
            return !nVar.a(s1Var);
        }

        @Override // org.apache.tools.ant.types.resources.o0
        protected boolean o2(final org.apache.tools.ant.types.s1 s1Var) {
            return i1.this.g2().stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.types.resources.h1
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return i1.a.r2(s1Var, (org.apache.tools.ant.types.resources.selectors.n) obj);
                }
            });
        }
    }

    private i1 j2() {
        return (i1) O1(i1.class);
    }

    @Override // org.apache.tools.ant.types.resources.selectors.o, org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) {
        if (X1()) {
            return;
        }
        super.I1(stack, project);
        if (!Y1()) {
            org.apache.tools.ant.types.s.a2(this.f136376h, stack, project);
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized boolean O() {
        if (Y1()) {
            return j2().O();
        }
        H1();
        return this.f136376h.O();
    }

    @Override // org.apache.tools.ant.types.resources.selectors.o
    public synchronized void e2(org.apache.tools.ant.types.resources.selectors.n nVar) {
        if (nVar == null) {
            return;
        }
        super.e2(nVar);
        x.d(this);
    }

    public synchronized void i2(org.apache.tools.ant.types.u1 u1Var) {
        if (Y1()) {
            throw Z1();
        }
        if (u1Var == null) {
            return;
        }
        this.f136376h.e2(u1Var);
        b2(false);
    }

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
        return this.f136376h.iterator();
    }

    public synchronized boolean k2() {
        return this.f136376h.j2();
    }

    public synchronized void l2(boolean z10) {
        this.f136376h.l2(z10);
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized int size() {
        if (Y1()) {
            return j2().size();
        }
        H1();
        return this.f136376h.size();
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
        H1();
        return this.f136376h.toString();
    }
}
