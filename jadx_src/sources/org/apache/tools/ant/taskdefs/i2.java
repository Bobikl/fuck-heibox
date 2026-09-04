package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Function;
import java.util.function.Predicate;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ImportTask.java */
/* JADX INFO: loaded from: classes5.dex */
public class i2 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f134258p = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f134260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f134261m = org.apache.tools.ant.e2.f133127k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134262n = ".";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final org.apache.tools.ant.types.resources.w1 f134263o;

    public i2() {
        org.apache.tools.ant.types.resources.w1 w1Var = new org.apache.tools.ant.types.resources.w1();
        this.f134263o = w1Var;
        w1Var.n2(true);
    }

    private org.apache.tools.ant.types.s1 k2() {
        String str = this.f134259k;
        if (str == null) {
            return null;
        }
        if (n2(str)) {
            return new org.apache.tools.ant.types.resources.z(f134258p.i0(this.f134259k));
        }
        File absoluteFile = new File(w1().b()).getAbsoluteFile();
        if (absoluteFile.exists()) {
            return new org.apache.tools.ant.types.resources.z(f134258p.n0(new File(absoluteFile.getParent()), this.f134259k));
        }
        try {
            return new org.apache.tools.ant.types.resources.s1(new URL(new URL(w1().b()), this.f134259k));
        } catch (MalformedURLException e10) {
            x1(e10.toString(), 3);
            throw new BuildException("failed to resolve %s relative to %s", this.f134259k, w1().b());
        }
    }

    private boolean l2(final org.apache.tools.ant.types.s1 s1Var, Vector<Object> vector) {
        final File file = (File) s1Var.f2(org.apache.tools.ant.types.resources.y.class).map(new f2()).orElse(null);
        final URL url = (URL) s1Var.f2(org.apache.tools.ant.types.resources.p1.class).map(new Function() { // from class: org.apache.tools.ant.taskdefs.g2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((org.apache.tools.ant.types.resources.p1) obj).getURL();
            }
        }).orElse(null);
        return vector.stream().anyMatch(new Predicate() { // from class: org.apache.tools.ant.taskdefs.h2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.f134232a.q2(s1Var, file, url, obj);
            }
        });
    }

    private void m2(org.apache.tools.ant.e2 e2Var, org.apache.tools.ant.types.s1 s1Var) {
        String str;
        b().M0("Importing file " + s1Var + " from " + w1().b(), 3);
        if (!s1Var.p2()) {
            String str2 = "Cannot find " + s1Var + " imported from " + w1().b();
            if (!this.f134260l) {
                throw new BuildException(str2);
            }
            b().M0(str2, 3);
            return;
        }
        if (!o2() && l2(s1Var, e2Var.r())) {
            b().M0("Skipped already imported file:\n   " + s1Var + "\n", 3);
            return;
        }
        String strO = org.apache.tools.ant.e2.o();
        boolean zT = org.apache.tools.ant.e2.t();
        String strN = org.apache.tools.ant.e2.n();
        try {
            try {
                if (!o2() || strO == null || this.f134261m == null) {
                    str = (!o2() && org.apache.tools.ant.e2.f133127k.equals(this.f134261m)) ? strO : this.f134261m;
                } else {
                    str = strO + strN + this.f134261m;
                }
                v2(str, this.f134262n, o2());
                org.apache.tools.ant.e2 e2VarK = org.apache.tools.ant.l2.g().k(s1Var);
                e2VarK.r().addAll(e2Var.r());
                e2VarK.q().addAll(e2Var.q());
                b().i("ant.projectHelper", e2VarK);
                e2VarK.x(b(), s1Var);
                b().i("ant.projectHelper", e2Var);
                e2Var.r().clear();
                e2Var.r().addAll(e2VarK.r());
                e2Var.q().clear();
                e2Var.q().addAll(e2VarK.q());
                v2(strO, strN, zT);
            } catch (BuildException e10) {
                throw org.apache.tools.ant.e2.c(e10, w1());
            }
        } catch (Throwable th2) {
            v2(strO, strN, zT);
            throw th2;
        }
    }

    private boolean n2(String str) {
        File file = new File(str);
        return file.isAbsolute() && file.exists();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2, reason: merged with bridge method [inline-methods] */
    public boolean q2(Object obj, org.apache.tools.ant.types.s1 s1Var, File file, URL url) {
        org.apache.tools.ant.types.resources.y yVar;
        if (obj.equals(s1Var) || obj.equals(file) || obj.equals(url)) {
            return true;
        }
        if (obj instanceof org.apache.tools.ant.types.s1) {
            if (file != null && (yVar = (org.apache.tools.ant.types.resources.y) ((org.apache.tools.ant.types.s1) obj).e2(org.apache.tools.ant.types.resources.y.class)) != null && yVar.l0().equals(file)) {
                return true;
            }
            if (url != null) {
                org.apache.tools.ant.types.resources.p1 p1Var = (org.apache.tools.ant.types.resources.p1) ((org.apache.tools.ant.types.s1) obj).e2(org.apache.tools.ant.types.resources.p1.class);
                return p1Var != null && p1Var.getURL().equals(url);
            }
        }
        return false;
    }

    private static void v2(String str, String str2, boolean z10) {
        org.apache.tools.ant.e2.E(str);
        org.apache.tools.ant.e2.D(str2);
        org.apache.tools.ant.e2.F(z10);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        if (this.f134259k == null && this.f134263o.isEmpty()) {
            throw new BuildException("import requires file attribute or at least one nested resource");
        }
        if (G1() == null || !G1().k().isEmpty()) {
            throw new BuildException("import only allowed as a top-level task");
        }
        org.apache.tools.ant.e2 e2Var = (org.apache.tools.ant.e2) b().w0("ant.projectHelper");
        if (e2Var == null) {
            throw new BuildException("import requires support in ProjectHelper");
        }
        if (e2Var.r().isEmpty()) {
            throw new BuildException("import requires support in ProjectHelper");
        }
        if (w1() == null || w1().b() == null) {
            throw new BuildException("Unable to get location of import task");
        }
        org.apache.tools.ant.types.resources.w1 w1Var = new org.apache.tools.ant.types.resources.w1(b(), this.f134263o);
        org.apache.tools.ant.types.s1 s1VarK2 = k2();
        if (s1VarK2 != null) {
            this.f134263o.f2(s1VarK2);
        }
        Iterator<org.apache.tools.ant.types.s1> it = w1Var.iterator();
        while (it.hasNext()) {
            m2(e2Var, it.next());
        }
    }

    public void j2(org.apache.tools.ant.types.u1 u1Var) {
        this.f134263o.f2(u1Var);
    }

    protected final boolean o2() {
        return "include".equals(L1());
    }

    public void r2(String str) {
        this.f134261m = str;
    }

    public void s2(String str) {
        this.f134259k = str;
    }

    public void t2(boolean z10) {
        this.f134260l = z10;
    }

    public void u2(String str) {
        this.f134262n = str;
    }
}
