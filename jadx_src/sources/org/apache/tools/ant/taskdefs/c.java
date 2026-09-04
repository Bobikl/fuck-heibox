package org.apache.tools.ant.taskdefs;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: AbstractCvsTask.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c extends org.apache.tools.ant.u2 {
    public static final int G = 3;
    private static final int H = 9;
    private static final String I = "checkout";
    private File A;
    private File B;
    private q1 D;
    private OutputStream E;
    private OutputStream F;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f133801n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f133802o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f133803p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f133804q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private File f133812y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.o f133798k = new org.apache.tools.ant.types.o();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<a> f133799l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<org.apache.tools.ant.types.o> f133800m = new Vector();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f133805r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f133806s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f133807t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f133808u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f133809v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f133810w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private File f133811x = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f133813z = false;
    private boolean C = false;

    /* JADX INFO: compiled from: AbstractCvsTask.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f133814a;

        public String a() {
            return this.f133814a;
        }

        public void b(String str) {
            this.f133814a = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String C2(String str) {
        return String.format("%n\t%s", str);
    }

    private StringBuilder E2(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        int iIndexOf = str.indexOf("-d:");
        if (iIndexOf >= 0) {
            int iIndexOf2 = str.indexOf(64, iIndexOf);
            int iIndexOf3 = str.indexOf(58, iIndexOf);
            int iIndexOf4 = str.indexOf(58, str.indexOf(58, iIndexOf3 + 1) + 1);
            if (iIndexOf2 >= 0 && iIndexOf4 > iIndexOf3 && iIndexOf4 < iIndexOf2) {
                int i10 = iIndexOf4 + 1;
                while (i10 < iIndexOf2) {
                    int i11 = i10 + 1;
                    sb2.replace(i10, i11, androidx.webkit.b.f28327e);
                    i10 = i11;
                }
            }
        }
        return sb2;
    }

    private String p2(n1 n1Var) {
        StringBuilder sbE2 = E2(org.apache.tools.ant.types.o.q(n1Var.f()));
        String[] strArrG = n1Var.g();
        if (strArrG != null) {
            sbE2.append((String) Arrays.stream(strArrG).map(new Function() { // from class: org.apache.tools.ant.taskdefs.b
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c.C2((String) obj);
                }
            }).collect(Collectors.joining("", String.format("%n%nenvironment:%n", new Object[0]), "")));
        }
        return sbE2.toString();
    }

    public int A2() {
        return this.f133810w;
    }

    public String B2() {
        return this.f133804q;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        String strQ2 = q2();
        if (q2() == null && this.f133800m.isEmpty()) {
            H2("checkout");
        }
        String strQ3 = q2();
        org.apache.tools.ant.types.o oVar = null;
        if (strQ3 != null) {
            oVar = (org.apache.tools.ant.types.o) this.f133798k.clone();
            oVar.i(true).H1(strQ3);
            m2(oVar, true);
        }
        try {
            this.f133800m.forEach(new Consumer() { // from class: org.apache.tools.ant.taskdefs.a
                @Override // java.util.function.Consumer
                public final void accept(Object obj) throws Throwable {
                    this.f133675b.F2((org.apache.tools.ant.types.o) obj);
                }
            });
        } finally {
            if (oVar != null) {
                D2(oVar);
            }
            H2(strQ2);
            org.apache.tools.ant.util.j0.d(this.E);
            org.apache.tools.ant.util.j0.d(this.F);
        }
    }

    protected void D2(org.apache.tools.ant.types.o oVar) {
        this.f133800m.remove(oVar);
    }

    protected void F2(org.apache.tools.ant.types.o oVar) throws Throwable {
        org.apache.tools.ant.types.z zVar = new org.apache.tools.ant.types.z();
        if (this.f133810w > 0) {
            org.apache.tools.ant.types.z.a aVar = new org.apache.tools.ant.types.z.a();
            aVar.e("CVS_CLIENT_PORT");
            aVar.g(String.valueOf(this.f133810w));
            zVar.b(aVar);
            org.apache.tools.ant.types.z.a aVar2 = new org.apache.tools.ant.types.z.a();
            aVar2.e("CVS_PSERVER_PORT");
            aVar2.g(String.valueOf(this.f133810w));
            zVar.b(aVar2);
        }
        if (this.f133811x == null) {
            File file = new File(System.getProperty("cygwin.user.home", System.getProperty("user.home")) + File.separatorChar + ".cvspass");
            if (file.exists()) {
                W2(file);
            }
        }
        File file2 = this.f133811x;
        if (file2 != null) {
            if (file2.isFile() && this.f133811x.canRead()) {
                org.apache.tools.ant.types.z.a aVar3 = new org.apache.tools.ant.types.z.a();
                aVar3.e("CVS_PASSFILE");
                aVar3.g(String.valueOf(this.f133811x));
                zVar.b(aVar3);
                x1("Using cvs passfile: " + String.valueOf(this.f133811x), 3);
            } else if (this.f133811x.canRead()) {
                x1("cvs passfile: " + String.valueOf(this.f133811x) + " ignored as it is not a file", 1);
            } else {
                x1("cvs passfile: " + String.valueOf(this.f133811x) + " ignored as it is not readable", 1);
            }
        }
        if (this.f133802o != null) {
            org.apache.tools.ant.types.z.a aVar4 = new org.apache.tools.ant.types.z.a();
            aVar4.e("CVS_RSH");
            aVar4.g(String.valueOf(this.f133802o));
            zVar.b(aVar4);
        }
        n1 n1Var = new n1(v2(), null);
        n1Var.w(b());
        if (this.f133812y == null) {
            this.f133812y = b().Z();
        }
        if (!this.f133812y.exists()) {
            this.f133812y.mkdirs();
        }
        n1Var.E(this.f133812y);
        n1Var.x(oVar.s());
        n1Var.y(zVar.c());
        try {
            String strP2 = p2(n1Var);
            x1(strP2, 3);
            int iE = n1Var.e();
            x1("retCode=" + iE, 4);
            if (this.C && n1.o(iE)) {
                throw new BuildException(String.format("cvs exited with error code %s%nCommand line was [%s]", Integer.valueOf(iE), strP2), w1());
            }
        } catch (IOException e10) {
            if (this.C) {
                throw new BuildException(e10, w1());
            }
            x1("Caught exception: " + e10.getMessage(), 1);
        } catch (BuildException e11) {
            e = e11;
            if (this.C) {
                throw e;
            }
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            x1("Caught exception: " + e.getMessage(), 1);
        } catch (Exception e12) {
            if (this.C) {
                throw new BuildException(e12, w1());
            }
            x1("Caught exception: " + e12.getMessage(), 1);
        }
    }

    public void G2(boolean z10) {
        this.f133813z = z10;
    }

    public void H2(String str) {
        this.f133805r = str;
    }

    public void I2(boolean z10) {
        J2(z10 ? 3 : 0);
    }

    public void J2(int i10) {
        this.f133808u = i10;
    }

    public void K2(String str) {
        if (str != null && str.trim().isEmpty()) {
            str = null;
        }
        this.f133801n = str;
    }

    public void L2(String str) {
        if (str != null && str.trim().isEmpty()) {
            str = null;
        }
        this.f133802o = str;
    }

    public void M2(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        j2(org.apache.tools.ant.taskdefs.optional.vss.g.f135460i3);
        j2(str);
    }

    public void N2(File file) {
        this.f133812y = file;
    }

    public void O2(File file) {
        this.B = file;
    }

    protected void P2(OutputStream outputStream) {
        this.F = outputStream;
    }

    public void Q2(q1 q1Var) {
        this.D = q1Var;
    }

    public void R2(boolean z10) {
        this.C = z10;
    }

    public void S2(boolean z10) {
        this.f133809v = z10;
    }

    public void T2(File file) {
        this.A = file;
    }

    protected void U2(OutputStream outputStream) {
        this.E = outputStream;
    }

    public void V2(String str) {
        this.f133803p = str;
    }

    public void W2(File file) {
        this.f133811x = file;
    }

    public void X2(int i10) {
        this.f133810w = i10;
    }

    public void Y2(boolean z10) {
        this.f133806s = z10;
    }

    public void Z2(boolean z10) {
        this.f133807t = z10;
    }

    public void a3(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        this.f133804q = str;
        j2("-r" + str);
    }

    public void j2(String str) {
        k2(this.f133798k, str);
    }

    public void k2(org.apache.tools.ant.types.o oVar, String str) {
        oVar.h().O1(str);
    }

    public void l2(org.apache.tools.ant.types.o oVar) {
        m2(oVar, false);
    }

    public void m2(org.apache.tools.ant.types.o oVar, boolean z10) {
        if (oVar == null) {
            return;
        }
        o2(oVar);
        if (z10) {
            this.f133800m.add(0, oVar);
        } else {
            this.f133800m.add(oVar);
        }
    }

    public void n2(a aVar) {
        this.f133799l.add(aVar);
    }

    protected void o2(org.apache.tools.ant.types.o oVar) {
        if (oVar == null) {
            return;
        }
        oVar.w("cvs");
        if (this.f133803p != null) {
            oVar.h().H1(this.f133803p);
        }
        Iterator<a> it = this.f133799l.iterator();
        while (it.hasNext()) {
            oVar.h().O1(it.next().a());
        }
        int i10 = this.f133808u;
        if (i10 > 0 && i10 <= 9) {
            oVar.i(true).O1("-z" + this.f133808u);
        }
        if (this.f133806s && !this.f133807t) {
            oVar.i(true).O1("-q");
        }
        if (this.f133807t) {
            oVar.i(true).O1("-Q");
        }
        if (this.f133809v) {
            oVar.i(true).O1("-n");
        }
        if (this.f133801n != null) {
            oVar.i(true).H1("-d" + this.f133801n);
        }
    }

    public String q2() {
        return this.f133805r;
    }

    public String r2() {
        return this.f133801n;
    }

    public String s2() {
        return this.f133802o;
    }

    public File t2() {
        return this.f133812y;
    }

    protected OutputStream u2() {
        if (this.F == null) {
            if (this.B != null) {
                try {
                    P2(new PrintStream(new BufferedOutputStream(org.apache.tools.ant.util.j0.h0(Paths.get(this.B.getPath(), new String[0]), this.f133813z))));
                } catch (IOException e10) {
                    throw new BuildException(e10, w1());
                }
            } else {
                P2(new r3((org.apache.tools.ant.u2) this, 1));
            }
        }
        return this.F;
    }

    protected q1 v2() {
        if (this.D == null) {
            Q2(new d5(x2(), u2()));
        }
        return this.D;
    }

    protected List<a> w2() {
        return new ArrayList(this.f133799l);
    }

    protected OutputStream x2() {
        if (this.E == null) {
            if (this.A != null) {
                try {
                    U2(new PrintStream(new BufferedOutputStream(org.apache.tools.ant.util.j0.h0(Paths.get(this.A.getPath(), new String[0]), this.f133813z))));
                } catch (IOException e10) {
                    throw new BuildException(e10, w1());
                }
            } else {
                U2(new r3((org.apache.tools.ant.u2) this, 2));
            }
        }
        return this.E;
    }

    public String y2() {
        return this.f133803p;
    }

    public File z2() {
        return this.f133811x;
    }
}
