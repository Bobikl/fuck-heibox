package org.apache.tools.ant.taskdefs.optional;

import com.umeng.analytics.pro.ak;
import java.io.File;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.taskdefs.t1;
import org.apache.tools.ant.types.k0;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.util.f2;
import org.apache.tools.ant.util.q0;

/* JADX INFO: compiled from: Native2Ascii.java */
/* JADX INFO: loaded from: classes5.dex */
public class s extends h4 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private k0 f135320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private tj.d f135321r;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f135315l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135316m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private File f135317n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135318o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135319p = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private org.apache.tools.ant.taskdefs.optional.native2ascii.g f135322s = null;

    /* JADX INFO: compiled from: Native2Ascii.java */
    public class b implements org.apache.tools.ant.util.g0 {
        private b() {
        }

        @Override // org.apache.tools.ant.util.g0
        public void n0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public void q0(String str) {
        }

        @Override // org.apache.tools.ant.util.g0
        public String[] y0(String str) {
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                return new String[]{str.substring(0, iLastIndexOf) + s.this.f135319p};
            }
            return new String[]{str + s.this.f135319p};
        }
    }

    public s() {
        this.f135321r = null;
        this.f135321r = new tj.d(org.apache.tools.ant.taskdefs.optional.native2ascii.h.c());
    }

    private void B2(String str, String str2) throws BuildException {
        File file = new File(this.f135317n, str);
        File file2 = new File(this.f135318o, str2);
        if (file.equals(file2)) {
            throw new BuildException("file %s would overwrite itself", file);
        }
        String parent = file2.getParent();
        if (parent != null) {
            File file3 = new File(parent);
            if (!file3.exists() && !file3.mkdirs() && !file3.isDirectory()) {
                throw new BuildException("cannot create parent directory %s", parent);
            }
        }
        x1("converting " + str, 3);
        org.apache.tools.ant.taskdefs.optional.native2ascii.g gVarB = this.f135322s;
        if (gVarB == null) {
            gVarB = org.apache.tools.ant.taskdefs.optional.native2ascii.h.b(this.f135321r.f(), this, D2());
        }
        if (!gVarB.a(this, file, file2)) {
            throw new BuildException("conversion failed");
        }
    }

    public void A2(org.apache.tools.ant.util.g0 g0Var) {
        E2().e2(g0Var);
    }

    public tj.e C2() {
        tj.e eVar = new tj.e();
        this.f135321r.c(eVar);
        return eVar;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f135317n == null) {
            this.f135317n = b().W0(".");
        }
        File file = this.f135318o;
        if (file == null) {
            throw new BuildException("The dest attribute must be set.");
        }
        if (this.f135317n.equals(file) && this.f135319p == null && this.f135320q == null) {
            throw new BuildException("The ext attribute or a mapper must be set if src and dest dirs are the same.");
        }
        k0 k0Var = this.f135320q;
        org.apache.tools.ant.util.g0 q0Var = k0Var == null ? this.f135319p == null ? new q0() : new b() : k0Var.i2();
        String[] strArrK = new f2(this).k(p2(this.f135317n).m(), this.f135317n, this.f135318o, q0Var);
        int length = strArrK.length;
        if (length == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Converting ");
        sb2.append(length);
        sb2.append(" file");
        sb2.append(length != 1 ? ak.aB : "");
        sb2.append(" from ");
        log(sb2.toString() + this.f135317n + " to " + this.f135318o);
        int length2 = strArrK.length;
        for (int i10 = 0; i10 < length2; i10++) {
            String str = strArrK[i10];
            String[] strArrY0 = q0Var.y0(str);
            if (strArrY0 != null && strArrY0.length > 0) {
                B2(str, strArrY0[0]);
            }
        }
    }

    public o0 D2() {
        return this.f135321r.g(b());
    }

    public k0 E2() throws BuildException {
        if (this.f135320q != null) {
            throw new BuildException(t1.f135751x, w1());
        }
        k0 k0Var = new k0(b());
        this.f135320q = k0Var;
        return k0Var;
    }

    public String[] F2() {
        return this.f135321r.d();
    }

    public String G2() {
        return this.f135316m;
    }

    public boolean H2() {
        return this.f135315l;
    }

    public void I2(File file) {
        this.f135318o = file;
    }

    public void J2(String str) {
        this.f135316m = str;
    }

    public void K2(String str) {
        this.f135319p = str;
    }

    public void L2(String str) {
        if ("default".equals(str)) {
            this.f135321r.k(org.apache.tools.ant.taskdefs.optional.native2ascii.h.c());
        } else {
            this.f135321r.k(str);
        }
    }

    public void M2(boolean z10) {
        this.f135315l = z10;
    }

    public void N2(File file) {
        this.f135317n = file;
    }

    public void z2(org.apache.tools.ant.taskdefs.optional.native2ascii.g gVar) {
        if (this.f135322s != null) {
            throw new BuildException("Can't have more than one native2ascii adapter");
        }
        this.f135322s = gVar;
    }
}
