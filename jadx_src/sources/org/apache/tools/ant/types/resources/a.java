package org.apache.tools.ant.types.resources;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: AbstractClasspathResource.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends org.apache.tools.ant.types.s1 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f136317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.types.q1 f136318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f136319r = true;

    /* JADX INFO: renamed from: org.apache.tools.ant.types.resources.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AbstractClasspathResource.java */
    public class C1238a extends FilterInputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f136320b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1238a(InputStream inputStream, b bVar) {
            super(inputStream);
            this.f136320b = bVar;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            org.apache.tools.ant.util.j0.c(((FilterInputStream) this).in);
            this.f136320b.a();
        }

        protected void finalize() throws Throwable {
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    /* JADX INFO: compiled from: AbstractClasspathResource.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClassLoader f136322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f136323b;

        b(ClassLoader classLoader, boolean z10) {
            this.f136322a = classLoader;
            this.f136323b = z10 && (classLoader instanceof org.apache.tools.ant.g);
        }

        public void a() {
            if (this.f136323b) {
                ((org.apache.tools.ant.g) this.f136322a).n();
            }
        }

        public ClassLoader b() {
            return this.f136322a;
        }

        public boolean c() {
            return this.f136323b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: A2 */
    public a m2() {
        return (a) O1(a.class);
    }

    protected abstract InputStream B2(ClassLoader classLoader) throws IOException;

    public void C2(org.apache.tools.ant.types.o0 o0Var) {
        B1();
        org.apache.tools.ant.types.o0 o0Var2 = this.f136317p;
        if (o0Var2 == null) {
            this.f136317p = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
        b2(false);
    }

    public void D2(org.apache.tools.ant.types.q1 q1Var) {
        B1();
        w2().c2(q1Var);
    }

    public void E2(org.apache.tools.ant.types.q1 q1Var) {
        B1();
        this.f136318q = q1Var;
    }

    public void F2(boolean z10) {
        this.f136319r = z10;
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            org.apache.tools.ant.types.o0 o0Var = this.f136317p;
            if (o0Var != null) {
                org.apache.tools.ant.types.s.a2(o0Var, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136318q != null || this.f136317p != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public InputStream h2() throws IOException {
        if (Y1()) {
            return m2().h2();
        }
        H1();
        b bVarX2 = x2();
        return !bVarX2.c() ? B2(bVarX2.b()) : new C1238a(B2(bVarX2.b()), bVarX2);
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean p2() {
        if (Y1()) {
            return m2().p2();
        }
        H1();
        try {
            InputStream inputStreamH2 = h2();
            boolean z10 = inputStreamH2 != null;
            if (inputStreamH2 != null) {
                inputStreamH2.close();
            }
            return z10;
        } catch (IOException unused) {
            return false;
        }
    }

    public org.apache.tools.ant.types.o0 w2() {
        D1();
        if (this.f136317p == null) {
            this.f136317p = new org.apache.tools.ant.types.o0(b());
        }
        b2(false);
        return this.f136317p.u2();
    }

    protected b x2() {
        org.apache.tools.ant.types.q1 q1Var = this.f136318q;
        ClassLoader classLoader = q1Var != null ? (ClassLoader) q1Var.c() : null;
        boolean z10 = false;
        if (classLoader == null) {
            if (y2() != null) {
                org.apache.tools.ant.types.o0 o0VarS2 = y2().s2(org.apache.tools.ant.taskdefs.z0.b.f136024i);
                classLoader = this.f136319r ? b().z(o0VarS2) : org.apache.tools.ant.g.f0(b().f0(), b(), o0VarS2, false);
                if (this.f136318q == null) {
                    z10 = true;
                }
            } else {
                classLoader = l0.class.getClassLoader();
            }
            if (this.f136318q != null && classLoader != null) {
                b().i(this.f136318q.b(), classLoader);
            }
        }
        return new b(classLoader, z10);
    }

    public org.apache.tools.ant.types.o0 y2() {
        if (Y1()) {
            return m2().y2();
        }
        H1();
        return this.f136317p;
    }

    public org.apache.tools.ant.types.q1 z2() {
        if (Y1()) {
            return m2().z2();
        }
        H1();
        return this.f136318q;
    }
}
