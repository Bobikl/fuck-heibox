package org.apache.tools.ant.taskdefs.optional.jsp;

import com.umeng.analytics.pro.ak;
import java.io.File;
import java.time.Instant;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.g;
import org.apache.tools.ant.taskdefs.h4;
import org.apache.tools.ant.taskdefs.optional.jsp.compilers.f;
import org.apache.tools.ant.types.o0;
import org.apache.tools.ant.types.q1;

/* JADX INFO: compiled from: JspC.java */
/* JADX INFO: loaded from: classes5.dex */
public class b extends h4 {
    private static final String B = "Compile failed, messages should have been provided.";
    protected a A;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o0 f135253l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private o0 f135254m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private o0 f135255n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private File f135256o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135257p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135259r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f135260s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private File f135265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private File f135266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private File f135267z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135258q = "jasper";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f135261t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Vector<String> f135262u = new Vector<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    Vector<File> f135263v = new Vector<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f135264w = true;

    /* JADX INFO: compiled from: JspC.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private File f135268a;

        public File a() {
            return this.f135268a;
        }

        public void b(File file) {
            this.f135268a = file;
        }
    }

    private void C2(org.apache.tools.ant.taskdefs.optional.jsp.compilers.e eVar) throws BuildException {
        eVar.a(this);
        if (eVar.execute()) {
            return;
        }
        if (this.f135264w) {
            throw new BuildException(B, w1());
        }
        x1(B, 0);
    }

    private File D2() {
        if (this.f135257p == null) {
            return this.f135256o;
        }
        return new File(this.f135256o.getPath() + File.separatorChar + this.f135257p.replace(lg.a.f131414g, File.separatorChar));
    }

    private boolean S2(File file, File file2) {
        if (!file2.exists()) {
            x1("Compiling " + file.getPath() + " because java file " + file2.getPath() + " does not exist", 3);
            return true;
        }
        if (file.lastModified() > file2.lastModified()) {
            x1("Compiling " + file.getPath() + " because it is out of date with respect to " + file2.getPath(), 3);
            return true;
        }
        if (file2.length() != 0) {
            return false;
        }
        x1("Compiling " + file.getPath() + " because java file " + file2.getPath() + " is empty", 3);
        return true;
    }

    public o0 A2() {
        if (this.f135254m == null) {
            this.f135254m = new o0(b());
        }
        return this.f135254m.u2();
    }

    public void B2() {
        Vector<File> vector = this.f135263v;
        if (vector != null) {
            for (File file : vector) {
                if (file.exists() && file.length() == 0) {
                    log("deleting empty output file " + file);
                    file.delete();
                }
            }
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f135256o;
        if (file == null) {
            throw new BuildException("destdir attribute must be set!", w1());
        }
        if (!file.isDirectory()) {
            throw new BuildException("destination directory \"" + this.f135256o + "\" does not exist or is not a directory", w1());
        }
        File fileD2 = D2();
        g gVarZ = b().z(this.f135254m);
        try {
            org.apache.tools.ant.taskdefs.optional.jsp.compilers.e eVarB = f.b(this.f135258q, this, gVarZ);
            if (this.A != null) {
                C2(eVarB);
                if (gVarZ != null) {
                    gVarZ.close();
                    return;
                }
                return;
            }
            o0 o0Var = this.f135255n;
            if (o0Var == null) {
                throw new BuildException("srcdir attribute must be set!", w1());
            }
            String[] strArrZ2 = o0Var.z2();
            if (strArrZ2.length == 0) {
                throw new BuildException("srcdir attribute must be set!", w1());
            }
            if (eVarB.b()) {
                C2(eVarB);
                if (gVarZ != null) {
                    gVarZ.close();
                    return;
                }
                return;
            }
            c cVarC = eVarB.c();
            V2();
            int length = strArrZ2.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                File fileW0 = b().W0(strArrZ2[i10]);
                if (!fileW0.exists()) {
                    throw new BuildException("srcdir \"" + fileW0.getPath() + "\" does not exist!", w1());
                }
                String[] strArrM = p2(fileW0).m();
                int length2 = strArrM.length;
                W2(fileW0, fileD2, cVarC, strArrM);
                i10++;
                i11 = length2;
            }
            x1("compiling " + this.f135262u.size() + " files", 3);
            if (!this.f135262u.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Compiling ");
                sb2.append(this.f135262u.size());
                sb2.append(" source file");
                sb2.append(this.f135262u.size() == 1 ? "" : ak.aB);
                sb2.append(" to ");
                sb2.append(fileD2);
                log(sb2.toString());
                C2(eVarB);
            } else if (i11 == 0) {
                x1("there were no files to compile", 2);
            } else {
                x1("all files are up to date", 3);
            }
            if (gVarZ != null) {
                gVarZ.close();
            }
        } catch (Throwable th2) {
            if (gVarZ != null) {
                try {
                    gVarZ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public o0 E2() {
        return this.f135253l;
    }

    public Vector<String> F2() {
        return this.f135262u;
    }

    public o0 G2() {
        return this.f135254m;
    }

    public File H2() {
        return this.f135256o;
    }

    public boolean I2() {
        return this.f135264w;
    }

    public String J2() {
        return this.f135259r;
    }

    public String K2() {
        return this.f135257p;
    }

    public o0 L2() {
        return this.f135255n;
    }

    public File M2() {
        return this.f135265x;
    }

    public File N2() {
        return this.f135265x;
    }

    public int O2() {
        return this.f135261t;
    }

    public a P2() {
        return this.A;
    }

    public File Q2() {
        return this.f135266y;
    }

    public File R2() {
        return this.f135267z;
    }

    public boolean T2() {
        return this.f135260s;
    }

    protected File U2(c cVar, File file, File file2, File file3) {
        if (file.getName().endsWith(".jsp")) {
            return new File(file3, cVar.a(file));
        }
        return null;
    }

    protected void V2() {
        this.f135262u.removeAllElements();
    }

    protected void W2(File file, File file2, c cVar, String[] strArr) {
        long epochMilli = Instant.now().toEpochMilli();
        for (String str : strArr) {
            File file3 = new File(file, str);
            File fileU2 = U2(cVar, file3, file, file2);
            if (fileU2 != null) {
                if (file3.lastModified() > epochMilli) {
                    x1("Warning: file modified in the future: " + str, 1);
                }
                if (S2(file3, fileU2)) {
                    this.f135262u.addElement(file3.getAbsolutePath());
                    this.f135263v.addElement(fileU2);
                }
            }
        }
    }

    public void X2(o0 o0Var) {
        o0 o0Var2 = this.f135253l;
        if (o0Var2 == null) {
            this.f135253l = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void Y2(q1 q1Var) {
        z2().c2(q1Var);
    }

    public void Z2(String str) {
        this.f135258q = str;
    }

    public void a3(o0 o0Var) {
        o0 o0Var2 = this.f135254m;
        if (o0Var2 == null) {
            this.f135254m = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void b3(File file) {
        this.f135256o = file;
    }

    public void c3(boolean z10) {
        this.f135264w = z10;
    }

    public void d3(String str) {
        this.f135259r = str;
    }

    public void e3(boolean z10) {
        this.f135260s = z10;
    }

    public void f3(String str) {
        this.f135257p = str;
    }

    public void g3(o0 o0Var) {
        o0 o0Var2 = this.f135255n;
        if (o0Var2 == null) {
            this.f135255n = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void h3(File file) {
        x1("Uribase is currently an unused parameter", 1);
    }

    public void i3(File file) {
        this.f135265x = file;
    }

    public void j3(int i10) {
        this.f135261t = i10;
    }

    public void k3(File file) {
        this.f135266y = file;
    }

    public void l3(File file) {
        this.f135267z = file;
    }

    public void y2(a aVar) throws BuildException {
        if (this.A != null) {
            throw new BuildException("Only one webapp can be specified");
        }
        this.A = aVar;
    }

    public o0 z2() {
        if (this.f135253l == null) {
            this.f135253l = new o0(b());
        }
        return this.f135253l.u2();
    }
}
