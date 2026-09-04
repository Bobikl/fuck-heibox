package org.apache.tools.ant.taskdefs;

import com.tencent.open.SocialConstants;
import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Classloader.java */
/* JADX INFO: loaded from: classes5.dex */
public class g0 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f134150p = "ant.coreLoader";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f134152l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134151k = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f134153m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f134154n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f134155o = null;

    @Override // org.apache.tools.ant.u2
    public void D1() {
        org.apache.tools.ant.types.o0 o0Var;
        String str;
        try {
            String str2 = "ant.coreLoader";
            if (SocialConstants.PARAM_ONLY.equals(b().u0(org.apache.tools.ant.j1.f133479c)) && ((str = this.f134151k) == null || "ant.coreLoader".equals(str))) {
                x1("Changing the system loader is disabled by build.sysclasspath=only", 1);
                return;
            }
            String str3 = this.f134151k;
            if (str3 != null) {
                str2 = str3;
            }
            Object objW0 = b().w0(str2);
            Object classLoader = null;
            if (this.f134153m) {
                objW0 = null;
            }
            if (objW0 != null && !(objW0 instanceof org.apache.tools.ant.g)) {
                x1("Referenced object is not an AntClassLoader", 0);
                return;
            }
            org.apache.tools.ant.g gVarF0 = (org.apache.tools.ant.g) objW0;
            boolean z10 = gVarF0 != null;
            if (gVarF0 == null) {
                if (this.f134155o != null) {
                    Object objW1 = b().w0(this.f134155o);
                    if (objW1 instanceof ClassLoader) {
                        classLoader = objW1;
                    }
                }
                if (classLoader == null) {
                    classLoader = getClass().getClassLoader();
                }
                b().M0("Setting parent loader " + this.f134151k + " " + classLoader + " " + this.f134154n, 4);
                gVarF0 = org.apache.tools.ant.g.f0((ClassLoader) classLoader, b(), this.f134152l, this.f134154n);
                b().i(str2, gVarF0);
                if (this.f134151k == null) {
                    gVarF0.d("org.apache.tools.ant.taskdefs.optional");
                    b().b1(gVarF0);
                }
            }
            if (!z10 || (o0Var = this.f134152l) == null) {
                return;
            }
            for (String str4 : o0Var.z2()) {
                File file = new File(str4);
                if (file.exists()) {
                    x1("Adding to class loader " + gVarF0 + " " + file.getAbsolutePath(), 4);
                    gVarF0.f(file.getAbsolutePath());
                }
            }
        } catch (Exception e10) {
            x1(org.apache.tools.ant.util.j2.b(e10), 0);
        }
    }

    public org.apache.tools.ant.types.o0 i2() {
        if (this.f134152l == null) {
            this.f134152l = new org.apache.tools.ant.types.o0(null);
        }
        return this.f134152l.u2();
    }

    public void j2(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f134152l;
        if (o0Var2 == null) {
            this.f134152l = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void k2(org.apache.tools.ant.types.q1 q1Var) throws BuildException {
        this.f134152l = (org.apache.tools.ant.types.o0) q1Var.d(b());
    }

    public void l2(String str) {
        this.f134151k = str;
    }

    public void m2(boolean z10) {
        this.f134154n = z10;
    }

    public void n2(String str) {
        this.f134155o = str;
    }

    public void o2(boolean z10) {
        this.f134153m = z10;
    }

    @Deprecated
    public void p2(boolean z10) {
        this.f134154n = !z10;
    }
}
