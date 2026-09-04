package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.InputStream;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Available.java */
/* JADX INFO: loaded from: classes5.dex */
public class r extends org.apache.tools.ant.u2 implements org.apache.tools.ant.taskdefs.condition.d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f135634x = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private a f135641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private org.apache.tools.ant.g f135643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Object f135644t = "true";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f135645u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f135646v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f135647w = false;

    /* JADX INFO: compiled from: Available.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String[] f135648c = {"file", "dir"};

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return f135648c;
        }

        public boolean h() {
            return "dir".equalsIgnoreCase(d());
        }

        public boolean i() {
            return "file".equalsIgnoreCase(d());
        }
    }

    private boolean i2(String str) {
        try {
            if (this.f135646v) {
                org.apache.tools.ant.g gVarZ = b().z(this.f135642r);
                this.f135643s = gVarZ;
                gVarZ.t0(false);
                this.f135643s.c();
                try {
                    this.f135643s.findClass(str);
                } catch (SecurityException unused) {
                    return true;
                }
            } else {
                org.apache.tools.ant.g gVar = this.f135643s;
                if (gVar != null) {
                    gVar.loadClass(str);
                } else {
                    ClassLoader classLoader = getClass().getClassLoader();
                    if (classLoader != null) {
                        Class.forName(str, true, classLoader);
                    } else {
                        Class.forName(str);
                    }
                }
            }
            return true;
        } catch (ClassNotFoundException unused2) {
            x1("class \"" + str + "\" was not found", 4);
            return false;
        } catch (NoClassDefFoundError e10) {
            x1("Could not load dependent class \"" + e10.getMessage() + "\" for class \"" + str + "\"", 4);
            return false;
        }
    }

    private boolean j2() {
        org.apache.tools.ant.types.o0 o0Var = this.f135639o;
        if (o0Var == null) {
            return k2(this.f135638n, this.f135637m);
        }
        for (String str : o0Var.z2()) {
            x1("Searching " + str, 3);
            File file = new File(str);
            if (file.exists() && (this.f135637m.equals(str) || this.f135637m.equals(file.getName()))) {
                a aVar = this.f135641q;
                if (aVar == null) {
                    x1("Found: " + file, 3);
                    return true;
                }
                if (aVar.h() && file.isDirectory()) {
                    x1("Found directory: " + file, 3);
                    return true;
                }
                if (!this.f135641q.i() || !file.isFile()) {
                    return false;
                }
                x1("Found file: " + file, 3);
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && parentFile.exists() && this.f135637m.equals(parentFile.getAbsolutePath())) {
                a aVar2 = this.f135641q;
                if (aVar2 == null) {
                    x1("Found: " + parentFile, 3);
                    return true;
                }
                if (!aVar2.h()) {
                    return false;
                }
                x1("Found directory: " + parentFile, 3);
                return true;
            }
            if (file.exists() && file.isDirectory()) {
                if (k2(new File(file, this.f135637m), this.f135637m + " in " + file)) {
                    return true;
                }
            }
            while (this.f135647w && parentFile != null && parentFile.exists()) {
                if (k2(new File(parentFile, this.f135637m), this.f135637m + " in " + parentFile)) {
                    return true;
                }
                parentFile = parentFile.getParentFile();
            }
        }
        return false;
    }

    private boolean k2(File file, String str) {
        a aVar = this.f135641q;
        if (aVar != null) {
            if (aVar.h()) {
                if (file.isDirectory()) {
                    x1("Found directory: " + str, 3);
                }
                return file.isDirectory();
            }
            if (this.f135641q.i()) {
                if (file.isFile()) {
                    x1("Found file: " + str, 3);
                }
                return file.isFile();
            }
        }
        if (file.exists()) {
            x1("Found: " + str, 3);
        }
        return file.exists();
    }

    private boolean l2(String str) {
        InputStream resourceAsStream;
        try {
            org.apache.tools.ant.g gVar = this.f135643s;
            if (gVar != null) {
                resourceAsStream = gVar.getResourceAsStream(str);
            } else {
                ClassLoader classLoader = getClass().getClassLoader();
                resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(str) : ClassLoader.getSystemResourceAsStream(str);
            }
            boolean z10 = resourceAsStream != null;
            org.apache.tools.ant.util.j0.c(resourceAsStream);
            return z10;
        } catch (Throwable th2) {
            org.apache.tools.ant.util.j0.c(null);
            throw th2;
        }
    }

    public void A2(String str) {
        z2(str);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f135635k == null) {
            throw new BuildException("property attribute is required", w1());
        }
        this.f135645u = true;
        try {
            if (e()) {
                org.apache.tools.ant.p2 p2VarU = org.apache.tools.ant.p2.u(b());
                Object property = p2VarU.getProperty(this.f135635k);
                if (property != null && !property.equals(this.f135644t)) {
                    x1(String.format("DEPRECATED - <available> used to override an existing property.%n  Build file should not reuse the same property name for different values.", new Object[0]), 1);
                }
                p2VarU.R(this.f135635k, this.f135644t, true);
            }
        } finally {
            this.f135645u = false;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        try {
            if (this.f135636l == null && this.f135638n == null && this.f135640p == null) {
                throw new BuildException("At least one of (classname|file|resource) is required", w1());
            }
            if (this.f135641q != null && this.f135638n == null) {
                throw new BuildException("The type attribute is only valid when specifying the file attribute.", w1());
            }
            org.apache.tools.ant.types.o0 o0Var = this.f135642r;
            if (o0Var != null) {
                o0Var.J(b());
                this.f135643s = b().z(this.f135642r);
            }
            String str = "";
            if (this.f135645u) {
                str = " to set property " + this.f135635k;
            } else {
                g2("available");
            }
            String str2 = this.f135636l;
            if (str2 != null && !i2(str2)) {
                x1("Unable to load class " + this.f135636l + str, 3);
                org.apache.tools.ant.g gVar = this.f135643s;
                if (gVar != null) {
                    gVar.n();
                    this.f135643s = null;
                }
                if (!this.f135645u) {
                    g2(null);
                }
                return false;
            }
            if (this.f135638n != null && !j2()) {
                StringBuilder sb2 = new StringBuilder("Unable to find ");
                a aVar = this.f135641q;
                if (aVar != null) {
                    sb2.append(aVar);
                    sb2.append(' ');
                }
                sb2.append(this.f135637m);
                sb2.append(str);
                x1(sb2.toString(), 3);
                org.apache.tools.ant.g gVar2 = this.f135643s;
                if (gVar2 != null) {
                    gVar2.n();
                    this.f135643s = null;
                }
                if (!this.f135645u) {
                    g2(null);
                }
                return false;
            }
            String str3 = this.f135640p;
            if (str3 == null || l2(str3)) {
                org.apache.tools.ant.g gVar3 = this.f135643s;
                if (gVar3 != null) {
                    gVar3.n();
                    this.f135643s = null;
                }
                if (this.f135645u) {
                    return true;
                }
                g2(null);
                return true;
            }
            x1("Unable to load resource " + this.f135640p + str, 3);
            org.apache.tools.ant.g gVar4 = this.f135643s;
            if (gVar4 != null) {
                gVar4.n();
                this.f135643s = null;
            }
            if (!this.f135645u) {
                g2(null);
            }
            return false;
        } catch (Throwable th2) {
            org.apache.tools.ant.g gVar5 = this.f135643s;
            if (gVar5 != null) {
                gVar5.n();
                this.f135643s = null;
            }
            if (!this.f135645u) {
                g2(null);
            }
            throw th2;
        }
    }

    public org.apache.tools.ant.types.o0 m2() {
        if (this.f135642r == null) {
            this.f135642r = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135642r.u2();
    }

    public org.apache.tools.ant.types.o0 n2() {
        if (this.f135639o == null) {
            this.f135639o = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135639o.u2();
    }

    public void o2(String str) {
        if (str.isEmpty()) {
            return;
        }
        this.f135636l = str;
    }

    public void p2(org.apache.tools.ant.types.o0 o0Var) {
        m2().n2(o0Var);
    }

    public void q2(org.apache.tools.ant.types.q1 q1Var) {
        m2().c2(q1Var);
    }

    public void r2(File file) {
        this.f135638n = file;
        this.f135637m = f135634x.l0(b().Z(), file);
    }

    public void s2(org.apache.tools.ant.types.o0 o0Var) {
        n2().n2(o0Var);
    }

    public void t2(boolean z10) {
        this.f135646v = z10;
    }

    public void u2(String str) {
        this.f135635k = str;
    }

    public void v2(String str) {
        this.f135640p = str;
    }

    public void w2(boolean z10) {
        this.f135647w = z10;
    }

    @Deprecated
    public void x2(String str) {
        x1("DEPRECATED - The setType(String) method has been deprecated. Use setType(Available.FileDir) instead.", 1);
        a aVar = new a();
        this.f135641q = aVar;
        aVar.g(str);
    }

    public void y2(a aVar) {
        this.f135641q = aVar;
    }

    public void z2(Object obj) {
        this.f135644t = obj;
    }
}
