package org.apache.tools.ant.types.resources;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.p2;

/* JADX INFO: compiled from: ResourceList.java */
/* JADX INFO: loaded from: classes5.dex */
public class e1 extends org.apache.tools.ant.types.s implements org.apache.tools.ant.types.u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Vector<org.apache.tools.ant.types.c0> f136350g = new Vector<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList<org.apache.tools.ant.types.u1> f136351h = new ArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w1 f136352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f136353j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f136354k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f136355l;

    public e1() {
        w1 w1Var = new w1();
        this.f136352i = w1Var;
        this.f136353j = false;
        this.f136354k = null;
        w1Var.n2(true);
    }

    private synchronized org.apache.tools.ant.types.u1 i2() {
        if (!this.f136353j) {
            H1();
            Stream map = this.f136351h.stream().flatMap(new b1()).map(new Function() { // from class: org.apache.tools.ant.types.resources.c1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f136335a.m2((org.apache.tools.ant.types.s1) obj);
                }
            });
            final w1 w1Var = this.f136352i;
            Objects.requireNonNull(w1Var);
            map.forEach(new Consumer() { // from class: org.apache.tools.ant.types.resources.d1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    w1Var.f2((org.apache.tools.ant.types.u1) obj);
                }
            });
            this.f136353j = true;
        }
        return this.f136352i;
    }

    private e1 j2() {
        return (e1) O1(e1.class);
    }

    private Reader k2(org.apache.tools.ant.types.s1 s1Var) throws IOException {
        org.apache.tools.ant.filters.util.i iVar = new org.apache.tools.ant.filters.util.i();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(s1Var.h2());
        String str = this.f136354k;
        iVar.m(new InputStreamReader(bufferedInputStream, str == null ? Charset.defaultCharset() : Charset.forName(str)));
        iVar.l(this.f136350g);
        iVar.n(b());
        return iVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.tools.ant.types.s1 l2(String str) {
        Object objE = p2.u(b()).E(str);
        if (objE instanceof org.apache.tools.ant.types.s1) {
            return (org.apache.tools.ant.types.s1) objE;
        }
        String string = objE.toString();
        if (string.contains(":")) {
            try {
                return new s1(string);
            } catch (BuildException unused) {
            }
        }
        if (this.f136355l == null) {
            return new z(b(), string);
        }
        z zVar = new z(this.f136355l, string);
        zVar.J(b());
        return zVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public org.apache.tools.ant.types.u1 m2(org.apache.tools.ant.types.s1 s1Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(k2(s1Var));
            try {
                final w1 w1Var = new w1();
                w1Var.n2(true);
                bufferedReader.lines().map(new Function() { // from class: org.apache.tools.ant.types.resources.z0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return this.f136486a.l2((String) obj);
                    }
                }).forEach(new Consumer() { // from class: org.apache.tools.ant.types.resources.a1
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        w1Var.f2((org.apache.tools.ant.types.s1) obj);
                    }
                });
                bufferedReader.close();
                return w1Var;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new BuildException("Unable to read resource " + s1Var.k2() + ": " + e10, e10, w1());
        }
    }

    @Override // org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
        } else {
            for (Object obj : this.f136351h) {
                if (obj instanceof org.apache.tools.ant.types.s) {
                    org.apache.tools.ant.types.s.a2((org.apache.tools.ant.types.s) obj, stack, project);
                }
            }
            Iterator<org.apache.tools.ant.types.c0> it = this.f136350g.iterator();
            while (it.hasNext()) {
                org.apache.tools.ant.types.s.a2(it.next(), stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized boolean O() {
        if (Y1()) {
            return j2().O();
        }
        return i2().O();
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) throws BuildException {
        if (this.f136354k != null) {
            throw d2();
        }
        if (!this.f136350g.isEmpty() || !this.f136351h.isEmpty()) {
            throw Z1();
        }
        super.c2(q1Var);
    }

    public void g2(org.apache.tools.ant.types.u1 u1Var) {
        if (Y1()) {
            throw Z1();
        }
        this.f136351h.add(u1Var);
        b2(false);
    }

    public final void h2(org.apache.tools.ant.types.c0 c0Var) {
        if (Y1()) {
            throw Z1();
        }
        this.f136350g.add(c0Var);
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
        return i2().iterator();
    }

    public final void n2(File file) {
        if (Y1()) {
            throw d2();
        }
        this.f136355l = file;
    }

    public final void o2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136354k = str;
    }

    @Override // org.apache.tools.ant.types.u1
    public synchronized int size() {
        if (Y1()) {
            return j2().size();
        }
        return i2().size();
    }

    @Override // org.apache.tools.ant.types.u1
    public /* synthetic */ Stream stream() {
        return org.apache.tools.ant.types.t1.b(this);
    }
}
