package org.apache.tools.ant.util;

import java.io.File;

/* JADX INFO: compiled from: ScriptRunnerHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f137039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137040c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f137043f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private org.apache.tools.ant.b2 f137046i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i.a f137038a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f137041d = "auto";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f137044g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f137045h = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ClassLoader f137047j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.w1 f137048k = new org.apache.tools.ant.types.resources.w1();

    private synchronized ClassLoader d() {
        ClassLoader classLoader = this.f137047j;
        if (classLoader != null) {
            return classLoader;
        }
        i.a aVar = this.f137038a;
        if (aVar == null) {
            ClassLoader classLoader2 = getClass().getClassLoader();
            this.f137047j = classLoader2;
            return classLoader2;
        }
        ClassLoader classLoaderC = aVar.c();
        this.f137047j = classLoaderC;
        return classLoaderC;
    }

    private i.a e() {
        if (this.f137038a == null) {
            org.apache.tools.ant.b2 b2Var = this.f137046i;
            if (b2Var == null) {
                throw new IllegalStateException("Can't access classpath without a project component");
            }
            this.f137038a = i.g(b2Var);
        }
        return this.f137038a;
    }

    private x1 i() {
        return new y1(this.f137046i.b()).a(this.f137041d, this.f137042e, d());
    }

    public void a(org.apache.tools.ant.types.u1 u1Var) {
        this.f137048k.f2(u1Var);
    }

    public void b(String str) {
        this.f137043f = str;
    }

    public org.apache.tools.ant.types.o0 c() {
        return e().a();
    }

    public boolean f() {
        return this.f137044g;
    }

    public String g() {
        return this.f137040c;
    }

    public String h() {
        return this.f137042e;
    }

    public x1 j() {
        x1 x1VarI = i();
        x1VarI.y(this.f137044g);
        String str = this.f137040c;
        if (str != null) {
            x1VarI.z(str);
        }
        File file = this.f137039b;
        if (file != null) {
            x1VarI.E(file);
        }
        String str2 = this.f137043f;
        if (str2 != null) {
            x1VarI.d(str2);
        }
        org.apache.tools.ant.types.resources.w1 w1Var = this.f137048k;
        if (w1Var != null) {
            x1VarI.u(w1Var);
        }
        if (this.f137045h) {
            x1VarI.e(this.f137046i);
        } else {
            x1VarI.f(this.f137046i);
        }
        return x1VarI;
    }

    public File k() {
        return this.f137039b;
    }

    public void l(ClassLoader classLoader) {
        this.f137047j = classLoader;
    }

    public void m(org.apache.tools.ant.types.o0 o0Var) {
        e().i(o0Var);
    }

    public void n(org.apache.tools.ant.types.q1 q1Var) {
        e().j(q1Var);
    }

    public void o(boolean z10) {
        this.f137044g = z10;
    }

    public void p(String str) {
        this.f137040c = str;
    }

    public void q(String str) {
        this.f137042e = str;
    }

    public void r(String str) {
        this.f137041d = str;
    }

    public void s(org.apache.tools.ant.b2 b2Var) {
        this.f137046i = b2Var;
    }

    public void t(boolean z10) {
        this.f137045h = z10;
    }

    public void u(File file) {
        this.f137039b = file;
    }
}
