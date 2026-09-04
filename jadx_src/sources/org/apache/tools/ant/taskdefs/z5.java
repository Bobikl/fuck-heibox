package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.util.Objects;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Rmic.java */
/* JADX INFO: loaded from: classes5.dex */
public class z5 extends h4 {
    public static final String H = "Rmic failed; see the compiler error output for details.";
    public static final String I = "Unable to verify class ";
    public static final String J = ". It could not be found.";
    public static final String K = ". It is not defined.";
    public static final String L = ". Loading caused Exception: ";
    public static final String M = "base or destdir does not exist: ";
    public static final String N = "base or destdir is not a directory:";
    public static final String O = "base or destdir attribute must be set!";
    private static final org.apache.tools.ant.util.j0 P = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f136029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f136030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f136031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f136032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f136033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f136034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f136035r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f136039v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f136041x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f136036s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f136037t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f136038u = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f136040w = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f136042y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f136043z = true;
    private boolean A = false;
    private Vector<String> B = new Vector<>();
    private org.apache.tools.ant.g C = null;
    private String E = null;
    private boolean F = false;
    private org.apache.tools.ant.taskdefs.rmic.e G = null;
    private tj.d D = new tj.d("default");

    /* JADX INFO: compiled from: Rmic.java */
    public class a extends tj.e {
        public a() {
        }

        public void S1(String str) {
            super.R1(str);
        }
    }

    private boolean f3(Class<?> cls) {
        return Remote.class.isAssignableFrom(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h3(File file, org.apache.tools.ant.taskdefs.rmic.e eVar, String str) {
        k3(file, this.f136032o, str, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String i3(String str) {
        return str.replace(File.separatorChar, lg.a.f131414g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j3(String str) {
        return str.substring(0, str.lastIndexOf(".class"));
    }

    private void k3(File file, File file2, String str, org.apache.tools.ant.taskdefs.rmic.e eVar) throws BuildException {
        String[] strArrY0 = eVar.a().y0(str.replace(lg.a.f131414g, File.separatorChar) + ".class");
        if (strArrY0 == null) {
            return;
        }
        for (String str2 : strArrY0) {
            if (str2.endsWith(".class")) {
                String str3 = org.apache.tools.ant.util.j2.i(str2, ".class") + ".java";
                File file3 = new File(file, str3);
                if (file3.exists()) {
                    File file4 = new File(file2, str3);
                    try {
                        if (this.f136037t) {
                            P.m(file3, file4, new org.apache.tools.ant.types.h0(b().n0()));
                        } else {
                            P.l(file3, file4);
                        }
                        file3.delete();
                    } catch (IOException e10) {
                        throw new BuildException("Failed to copy " + file3 + " to " + file4 + " due to " + e10.getMessage(), e10, w1());
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void A3(boolean z10) {
        this.f136043z = z10;
    }

    public void B2(org.apache.tools.ant.taskdefs.rmic.e eVar) {
        if (this.G != null) {
            throw new BuildException("Can't have more than one rmic adapter");
        }
        this.G = eVar;
    }

    public void B3(boolean z10) {
        this.A = z10;
    }

    protected void C2() {
        org.apache.tools.ant.g gVar = this.C;
        if (gVar != null) {
            gVar.n();
            this.C = null;
        }
    }

    public void C3(boolean z10) {
        this.F = z10;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        try {
            this.B.clear();
            final File fileA3 = a3();
            if (fileA3 == null) {
                throw new BuildException(O, w1());
            }
            if (!fileA3.exists()) {
                throw new BuildException(M + fileA3, w1());
            }
            if (!fileA3.isDirectory()) {
                throw new BuildException(N + fileA3, w1());
            }
            if (this.f136036s) {
                x1("Verify has been turned on.", 3);
            }
            final org.apache.tools.ant.taskdefs.rmic.e eVarB = this.G;
            if (eVarB == null) {
                eVarB = org.apache.tools.ant.taskdefs.rmic.f.b(L2(), this, F2());
            }
            eVarB.b(this);
            this.C = b().z(eVarB.c());
            if (this.f136031n == null) {
                l3(this.f136029l, p2(this.f136029l).m(), eVarB.a());
            } else {
                String str = this.f136031n.replace(lg.a.f131414g, File.separatorChar) + ".class";
                if (new File(this.f136029l, str).isFile()) {
                    l3(this.f136029l, new String[]{str}, eVarB.a());
                } else {
                    this.B.add(this.f136031n);
                }
            }
            int size = this.B.size();
            if (size > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("RMI Compiling ");
                sb2.append(size);
                sb2.append(" class");
                sb2.append(size > 1 ? "es" : "");
                sb2.append(" to ");
                sb2.append(fileA3);
                x1(sb2.toString(), 2);
                if (this.F) {
                    this.B.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.t5
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f135800b.log((String) obj);
                        }
                    });
                }
                if (!eVarB.execute()) {
                    throw new BuildException(H, w1());
                }
            }
            File file = this.f136032o;
            if (file != null && !fileA3.equals(file) && size > 0) {
                if (this.f136040w) {
                    x1("Cannot determine sourcefiles in idl mode, ", 1);
                    x1("sourcebase attribute will be ignored.", 1);
                } else {
                    this.B.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.u5
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            this.f135833b.h3(fileA3, eVarB, (String) obj);
                        }
                    });
                }
            }
            C2();
        } catch (Throwable th2) {
            C2();
            throw th2;
        }
    }

    public synchronized org.apache.tools.ant.types.o0 D2() {
        if (this.f136034q == null) {
            this.f136034q = new org.apache.tools.ant.types.o0(b());
        }
        return this.f136034q.u2();
    }

    public void D3(File file) {
        this.f136032o = file;
    }

    public a E2() {
        a aVar = new a();
        this.D.c(aVar);
        return aVar;
    }

    public void E3(String str) {
        this.f136033p = str;
    }

    public org.apache.tools.ant.types.o0 F2() {
        return this.D.g(b());
    }

    public void F3(boolean z10) {
        this.f136036s = z10;
    }

    public synchronized org.apache.tools.ant.types.o0 G2() {
        if (this.f136035r == null) {
            this.f136035r = new org.apache.tools.ant.types.o0(b());
        }
        return this.f136035r.u2();
    }

    public File H2() {
        return this.f136029l;
    }

    public String I2() {
        return this.f136031n;
    }

    public org.apache.tools.ant.types.o0 J2() {
        return this.f136034q;
    }

    public Vector<String> K2() {
        return this.B;
    }

    public String L2() {
        this.D.l(b().u0("build.rmic"));
        return this.D.f();
    }

    public String[] M2() {
        L2();
        return this.D.d();
    }

    public boolean N2() {
        return this.f136042y;
    }

    public File O2() {
        return this.f136030m;
    }

    public String P2() {
        return this.E;
    }

    public org.apache.tools.ant.types.o0 Q2() {
        return this.f136035r;
    }

    public Vector<String> R2() {
        return this.B;
    }

    public boolean S2() {
        return this.f136037t;
    }

    public boolean T2() {
        return this.f136040w;
    }

    public String U2() {
        return this.f136041x;
    }

    public boolean V2() {
        return this.f136038u;
    }

    public String W2() {
        return this.f136039v;
    }

    public boolean X2() {
        return this.f136043z;
    }

    public boolean Y2() {
        return this.A;
    }

    public ClassLoader Z2() {
        return this.C;
    }

    public File a3() {
        return O2() != null ? O2() : H2();
    }

    public Class<?> b3(Class<?> cls) {
        final Class<Remote> cls2 = Remote.class;
        return (Class) Stream.of((Object[]) cls.getInterfaces()).filter(new Predicate() { // from class: org.apache.tools.ant.taskdefs.y5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls2.isAssignableFrom((Class) obj);
            }
        }).findFirst().orElse(null);
    }

    public File c3() {
        return this.f136032o;
    }

    public String d3() {
        return this.f136033p;
    }

    public boolean e3() {
        return this.f136036s;
    }

    public boolean g3(String str) {
        try {
            Class<?> clsLoadClass = this.C.loadClass(str);
            return (!clsLoadClass.isInterface() || this.f136038u || this.f136040w) && f3(clsLoadClass);
        } catch (ClassNotFoundException unused) {
            x1(I + str + J, 1);
            return false;
        } catch (NoClassDefFoundError unused2) {
            x1(I + str + K, 1);
            return false;
        } catch (Throwable th2) {
            x1(I + str + L + th2.getMessage(), 1);
            return false;
        }
    }

    protected void l3(File file, String[] strArr, org.apache.tools.ant.util.g0 g0Var) {
        String str;
        if (this.f136040w) {
            x1("will leave uptodate test to rmic implementation in idl mode.", 3);
        } else if (this.f136038u && (str = this.f136039v) != null && str.contains("-always")) {
            x1("no uptodate test as -always option has been specified", 3);
        } else {
            strArr = new org.apache.tools.ant.util.f2(this).k(strArr, file, a3(), g0Var);
        }
        Stream map = Stream.of((Object[]) strArr).map(new Function() { // from class: org.apache.tools.ant.taskdefs.v5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z5.i3((String) obj);
            }
        }).map(new Function() { // from class: org.apache.tools.ant.taskdefs.w5
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z5.j3((String) obj);
            }
        });
        final Vector<String> vector = this.B;
        Objects.requireNonNull(vector);
        map.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.x5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                vector.add((String) obj);
            }
        });
    }

    public void m3(File file) {
        this.f136029l = file;
    }

    public void n3(String str) {
        this.f136031n = str;
    }

    public synchronized void o3(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f136034q;
        if (o0Var2 == null) {
            this.f136034q = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void p3(org.apache.tools.ant.types.q1 q1Var) {
        D2().c2(q1Var);
    }

    public void q3(String str) {
        if (str.isEmpty()) {
            return;
        }
        this.D.k(str);
    }

    public void r3(boolean z10) {
        this.f136042y = z10;
    }

    public void s3(File file) {
        this.f136030m = file;
    }

    public void t3(String str) {
        this.E = str;
    }

    public synchronized void u3(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f136035r;
        if (o0Var2 == null) {
            this.f136035r = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void v3(boolean z10) {
        this.f136037t = z10;
    }

    public void w3(boolean z10) {
        this.f136040w = z10;
    }

    public void x3(String str) {
        this.f136041x = str;
    }

    public void y3(boolean z10) {
        this.f136038u = z10;
    }

    public void z3(String str) {
        this.f136039v = str;
    }
}
