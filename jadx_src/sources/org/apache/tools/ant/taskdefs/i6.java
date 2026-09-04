package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: SignJar.java */
/* JADX INFO: loaded from: classes5.dex */
public class i6 extends d {
    private static final org.apache.tools.ant.util.j0 U = org.apache.tools.ant.util.j0.O();
    public static final String V = "'destdir' and 'signedjar' cannot both be set";
    public static final String W = "Too many mappers";
    public static final String X = "You cannot specify the signed JAR when using paths or filesets";
    public static final String Y = "Cannot map source file to anything sensible: ";
    public static final String Z = "The destDir attribute is required if a mapper is set";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f134299a0 = "alias attribute must be set";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f134300b0 = "storepass attribute must be set";
    protected String E;
    protected File F;
    protected boolean G;
    protected boolean H;
    private boolean I;
    protected boolean J;
    protected File K;
    private org.apache.tools.ant.util.g0 L;
    protected String M;
    protected String N;
    protected String O;
    protected String P;
    private boolean Q = false;
    private String R;
    private String S;
    private String T;

    private void N2(j1 j1Var, String str) {
        m2(j1Var, "-J-D" + str + ".proxyHost=" + this.N);
        if (this.O != null) {
            m2(j1Var, "-J-D" + str + ".proxyPort=" + this.O);
        }
    }

    private void O2(j1 j1Var) {
        if (this.M != null) {
            m2(j1Var, "-tsa");
            m2(j1Var, this.M);
        }
        if (this.P != null) {
            m2(j1Var, "-tsacert");
            m2(j1Var, this.P);
        }
        if (this.N != null) {
            String str = this.M;
            if (str == null || str.startsWith("https")) {
                N2(j1Var, "https");
            }
            String str2 = this.M;
            if (str2 == null || !str2.startsWith("https")) {
                N2(j1Var, "http");
            }
        }
        if (this.T != null) {
            m2(j1Var, "-tsadigestalg");
            m2(j1Var, this.T);
        }
    }

    private void p3(File file, File file2) throws BuildException {
        if (file2 == null) {
            file2 = file;
        }
        if (Z2(file, file2)) {
            return;
        }
        long jLastModified = file.lastModified();
        j1 j1VarP2 = p2();
        z2(j1VarP2);
        o2(j1VarP2);
        if (this.E != null) {
            m2(j1VarP2, "-sigfile");
            m2(j1VarP2, this.E);
        }
        try {
            org.apache.tools.ant.util.j0 j0Var = U;
            if (!j0Var.b(file, file2)) {
                m2(j1VarP2, "-signedjar");
                m2(j1VarP2, file2.getPath());
            }
            if (this.G) {
                m2(j1VarP2, "-internalsf");
            }
            if (this.H) {
                m2(j1VarP2, "-sectionsonly");
            }
            if (this.R != null) {
                m2(j1VarP2, "-sigalg");
                m2(j1VarP2, this.R);
            }
            if (this.S != null) {
                m2(j1VarP2, "-digestalg");
                m2(j1VarP2, this.S);
            }
            O2(j1VarP2);
            m2(j1VarP2, file.getPath());
            m2(j1VarP2, this.f134023l);
            log("Signing JAR: " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + " as " + this.f134023l);
            j1VarP2.D1();
            if (this.I) {
                j0Var.p0(file2, jLastModified);
            }
        } catch (IOException e10) {
            throw new BuildException(e10);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        boolean z10 = this.f134022k != null;
        boolean z11 = this.F != null;
        boolean z12 = this.K != null;
        boolean z13 = this.L != null;
        if (!z10 && !x2()) {
            throw new BuildException(d.C);
        }
        if (this.f134023l == null) {
            throw new BuildException(f134299a0);
        }
        if (this.f134025n == null) {
            throw new BuildException(f134300b0);
        }
        if (z12 && z11) {
            throw new BuildException(V);
        }
        if (x2() && z11) {
            throw new BuildException(X);
        }
        if (!z12 && z13) {
            throw new BuildException(Z);
        }
        n2();
        try {
            if (z10 && z11) {
                p3(this.f134022k, this.F);
                v2();
                return;
            }
            org.apache.tools.ant.types.o0 o0VarS2 = s2();
            org.apache.tools.ant.util.g0 q0Var = z13 ? this.L : new org.apache.tools.ant.util.q0();
            Iterator<org.apache.tools.ant.types.s1> it = o0VarS2.iterator();
            while (it.hasNext()) {
                org.apache.tools.ant.types.resources.z zVarD = ResourceUtils.d((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class));
                File fileW2 = z12 ? this.K : zVarD.w2();
                String[] strArrY0 = q0Var.y0(zVarD.k2());
                if (strArrY0 == null || strArrY0.length != 1) {
                    throw new BuildException(Y + zVarD.l0());
                }
                p3(zVarD.l0(), new File(fileW2, strArrY0[0]));
            }
            v2();
        } catch (Throwable th2) {
            v2();
            throw th2;
        }
    }

    public void M2(org.apache.tools.ant.util.g0 g0Var) {
        if (this.L != null) {
            throw new BuildException(W);
        }
        this.L = g0Var;
    }

    public String P2() {
        return this.S;
    }

    public org.apache.tools.ant.util.g0 Q2() {
        return this.L;
    }

    public String R2() {
        return this.R;
    }

    public String S2() {
        return this.T;
    }

    public String T2() {
        return this.P;
    }

    public String U2() {
        return this.N;
    }

    public String V2() {
        return this.O;
    }

    public String W2() {
        return this.M;
    }

    public boolean X2() {
        return this.Q;
    }

    protected boolean Y2(File file) {
        try {
            String str = this.E;
            if (str == null) {
                str = this.f134023l;
            }
            return org.apache.tools.ant.taskdefs.condition.t.f2(file, str);
        } catch (IOException e10) {
            x1(e10.toString(), 3);
            return false;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    protected boolean Z2(File file, File file2) {
        File file3;
        if (X2() || file == null || !file.exists()) {
            file3 = file2;
            return false;
        }
        if (file2 == null) {
            file3 = file;
        }
        if (!file.equals(file3)) {
            return U.d0(file, file3);
        }
        if (this.J) {
            return Y2(file);
        }
        return false;
    }

    public void a3(File file) {
        this.K = file;
    }

    public void b3(String str) {
        this.S = str;
    }

    public void c3(boolean z10) {
        this.Q = z10;
    }

    public void d3(boolean z10) {
        this.G = z10;
    }

    public void e3(boolean z10) {
        this.J = z10;
    }

    public void f3(boolean z10) {
        this.I = z10;
    }

    public void g3(boolean z10) {
        this.H = z10;
    }

    public void h3(String str) {
        this.R = str;
    }

    public void i3(String str) {
        this.E = str;
    }

    public void j3(File file) {
        this.F = file;
    }

    public void k3(String str) {
        this.T = str;
    }

    public void l3(String str) {
        this.P = str;
    }

    public void m3(String str) {
        this.N = str;
    }

    public void n3(String str) {
        this.O = str;
    }

    public void o3(String str) {
        this.M = str;
    }
}
