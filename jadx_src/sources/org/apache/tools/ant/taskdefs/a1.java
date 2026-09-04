package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Stream;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: Delete.java */
/* JADX INFO: loaded from: classes5.dex */
public class a1 extends h4 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final org.apache.tools.ant.types.resources.comparators.m f133680x = new org.apache.tools.ant.types.resources.comparators.o(new org.apache.tools.ant.types.resources.comparators.k());

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final org.apache.tools.ant.types.resources.selectors.n f133681y = new org.apache.tools.ant.types.resources.selectors.e();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static org.apache.tools.ant.util.j0 f133682z = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected File f133683l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected File f133684m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected Vector<org.apache.tools.ant.types.b0> f133685n = new Vector<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected boolean f133686o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected boolean f133687p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f133688q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f133689r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f133690s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f133691t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f133692u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.f1 f133693v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f133694w = org.apache.tools.ant.taskdefs.condition.z.b("windows");

    /* JADX INFO: compiled from: Delete.java */
    public class a implements org.apache.tools.ant.types.u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String[] f133695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f133696c;

        a(String[] strArr, File file) {
            this.f133695b = strArr;
            this.f133696c = file;
        }

        @Override // org.apache.tools.ant.types.u1
        public boolean O() {
            return true;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ boolean isEmpty() {
            return org.apache.tools.ant.types.t1.a(this);
        }

        @Override // java.lang.Iterable
        public Iterator<org.apache.tools.ant.types.s1> iterator() {
            return new org.apache.tools.ant.types.resources.a0(a1.this.b(), this.f133696c, this.f133695b);
        }

        @Override // org.apache.tools.ant.types.u1
        public int size() {
            return this.f133695b.length;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ Stream stream() {
            return org.apache.tools.ant.types.t1.b(this);
        }
    }

    /* JADX INFO: compiled from: Delete.java */
    public static class b implements org.apache.tools.ant.types.u1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Project f133698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f133699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String[] f133700d;

        b(Project project, File file, String[] strArr) {
            this.f133698b = project;
            this.f133699c = file;
            this.f133700d = strArr;
            Arrays.sort(strArr, Comparator.reverseOrder());
        }

        @Override // org.apache.tools.ant.types.u1
        public boolean O() {
            return true;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ boolean isEmpty() {
            return org.apache.tools.ant.types.t1.a(this);
        }

        @Override // java.lang.Iterable
        public Iterator<org.apache.tools.ant.types.s1> iterator() {
            return new org.apache.tools.ant.types.resources.a0(this.f133698b, this.f133699c, this.f133700d);
        }

        @Override // org.apache.tools.ant.types.u1
        public int size() {
            return this.f133700d.length;
        }

        @Override // org.apache.tools.ant.types.u1
        public /* synthetic */ Stream stream() {
            return org.apache.tools.ant.types.t1.b(this);
        }
    }

    private boolean A2(File file) {
        if (f133682z.u0(file, this.f133694w)) {
            return true;
        }
        if (!this.f133691t) {
            return false;
        }
        x1("Failed to delete " + file + ", calling deleteOnExit. This attempts to delete the file when the Ant jvm has exited and might not succeed.", this.f133689r ? 3 : 2);
        file.deleteOnExit();
        return true;
    }

    private void B2(Exception exc) {
        if (!this.f133690s) {
            Y1(exc, this.f133689r ? 3 : this.f133688q);
        } else if (!(exc instanceof BuildException)) {
            throw new BuildException(exc);
        }
    }

    private void C2(String str) {
        B2(new BuildException(str));
    }

    private boolean D2(File file) {
        if (Files.isSymbolicLink(file.toPath())) {
            return !Files.exists(file.toPath(), new LinkOption[0]);
        }
        return false;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file;
        if (this.f133686o) {
            x1("DEPRECATED - Use of the implicit FileSet is deprecated.  Use a nested fileset element instead.", this.f133689r ? 3 : this.f133688q);
        }
        if (this.f133683l == null && this.f133684m == null && this.f133685n.isEmpty() && this.f133693v == null) {
            throw new BuildException("At least one of the file or dir attributes, or a nested resource collection, must be set.");
        }
        if (this.f133689r && this.f133690s) {
            throw new BuildException("quiet and failonerror cannot both be set to true", w1());
        }
        File file2 = this.f133683l;
        if (file2 != null) {
            if (file2.exists()) {
                if (this.f133683l.isDirectory()) {
                    x1("Directory " + this.f133683l.getAbsolutePath() + " cannot be removed using the file attribute.  Use dir instead.", this.f133689r ? 3 : this.f133688q);
                } else {
                    log("Deleting: " + this.f133683l.getAbsolutePath());
                    if (!A2(this.f133683l)) {
                        C2("Unable to delete file " + this.f133683l.getAbsolutePath());
                    }
                }
            } else if (D2(this.f133683l)) {
                x1("Trying to delete file " + this.f133683l.getAbsolutePath() + " which looks like a broken symlink.", this.f133689r ? 3 : this.f133688q);
                if (!A2(this.f133683l)) {
                    C2("Unable to delete file " + this.f133683l.getAbsolutePath());
                }
            } else {
                x1("Could not find file " + this.f133683l.getAbsolutePath() + " to delete.", this.f133689r ? 3 : this.f133688q);
            }
        }
        File file3 = this.f133684m;
        if (file3 != null && !this.f133686o) {
            if (file3.exists() && this.f133684m.isDirectory()) {
                if (this.f133688q == 3) {
                    log("Deleting directory " + this.f133684m.getAbsolutePath());
                }
                E2(this.f133684m);
            } else if (D2(this.f133684m)) {
                x1("Trying to delete directory " + this.f133684m.getAbsolutePath() + " which looks like a broken symlink.", this.f133689r ? 3 : this.f133688q);
                if (!A2(this.f133684m)) {
                    C2("Unable to delete directory " + this.f133684m.getAbsolutePath());
                }
            }
        }
        org.apache.tools.ant.types.resources.f1 f1Var = new org.apache.tools.ant.types.resources.f1();
        f1Var.J(b());
        f1Var.k2(true);
        org.apache.tools.ant.types.resources.f1 f1Var2 = new org.apache.tools.ant.types.resources.f1();
        f1Var2.J(b());
        f1Var2.k2(true);
        org.apache.tools.ant.types.b0 b0VarQ2 = null;
        if (this.f133686o && (file = this.f133684m) != null && file.isDirectory()) {
            b0VarQ2 = q2();
            b0VarQ2.J(b());
            this.f133685n.add(b0VarQ2);
        }
        for (org.apache.tools.ant.types.b0 b0Var : this.f133685n) {
            if (b0Var.b() == null) {
                x1("Deleting fileset with no project specified; assuming executing project", 3);
                b0Var = (org.apache.tools.ant.types.b0) b0Var.clone();
                b0Var.J(b());
            }
            File fileY2 = b0Var.y2();
            if (b0Var.C2() || (fileY2 != null && fileY2.exists())) {
                if (fileY2 == null) {
                    throw new BuildException("File or Resource without directory or file specified");
                }
                if (fileY2.isDirectory()) {
                    org.apache.tools.ant.v0 v0VarA2 = b0Var.A2();
                    f1Var.g2(new a(v0VarA2.m(), fileY2));
                    if (this.f133687p) {
                        f1Var2.g2(new b(b(), fileY2, v0VarA2.j()));
                    }
                    if (this.f133692u) {
                        String[] strArrY = v0VarA2.Y();
                        if (strArrY.length > 0) {
                            int length = strArrY.length;
                            String[] strArr = new String[length];
                            System.arraycopy(strArrY, 0, strArr, 0, strArrY.length);
                            Arrays.sort(strArr, Comparator.reverseOrder());
                            for (int i10 = 0; i10 < length; i10++) {
                                Path path = Paths.get(strArr[i10], new String[0]);
                                if (Files.isSymbolicLink(path) && !path.toFile().delete()) {
                                    C2("Could not delete symbolic link at " + path);
                                }
                            }
                        }
                    }
                } else {
                    C2("Directory does not exist: " + fileY2);
                }
            }
        }
        f1Var.g2(f1Var2);
        if (this.f133693v != null) {
            org.apache.tools.ant.types.resources.i1 i1Var = new org.apache.tools.ant.types.resources.i1();
            i1Var.e2(f133681y);
            i1Var.i2(this.f133693v);
            org.apache.tools.ant.types.resources.k1 k1Var = new org.apache.tools.ant.types.resources.k1();
            k1Var.o2(f133680x);
            k1Var.e2(i1Var);
            f1Var.g2(k1Var);
        }
        try {
            try {
                if (f1Var.O()) {
                    Iterator<org.apache.tools.ant.types.s1> it = f1Var.iterator();
                    while (it.hasNext()) {
                        File fileL0 = ((org.apache.tools.ant.types.resources.y) it.next().e2(org.apache.tools.ant.types.resources.y.class)).l0();
                        if (fileL0.exists() && (!fileL0.isDirectory() || fileL0.list().length == 0)) {
                            x1("Deleting " + fileL0, this.f133688q);
                            if (!A2(fileL0) && this.f133690s) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unable to delete ");
                                sb2.append(fileL0.isDirectory() ? "directory " : "file ");
                                sb2.append(fileL0);
                                C2(sb2.toString());
                            }
                        }
                    }
                } else {
                    C2(K1() + " handles only filesystem resources");
                }
                if (b0VarQ2 == null) {
                    return;
                }
            } catch (Exception e10) {
                B2(e10);
                if (b0VarQ2 == null) {
                    return;
                }
            }
            this.f133685n.remove(b0VarQ2);
        } catch (Throwable th2) {
            if (b0VarQ2 != null) {
                this.f133685n.remove(b0VarQ2);
            }
            throw th2;
        }
    }

    protected void E2(File file) {
        String[] list = file.list();
        if (list == null) {
            list = new String[0];
        }
        for (String str : list) {
            File file2 = new File(file, str);
            if (file2.isDirectory()) {
                E2(file2);
            } else {
                x1("Deleting " + file2.getAbsolutePath(), this.f133689r ? 3 : this.f133688q);
                if (!A2(file2)) {
                    C2("Unable to delete file " + file2.getAbsolutePath());
                }
            }
        }
        x1("Deleting directory " + file.getAbsolutePath(), this.f133688q);
        if (A2(file)) {
            return;
        }
        C2("Unable to delete directory " + file.getAbsolutePath());
    }

    protected void F2(File file, String[] strArr, String[] strArr2) {
        int i10 = 0;
        if (strArr.length > 0) {
            x1("Deleting " + strArr.length + " files from " + file.getAbsolutePath(), this.f133689r ? 3 : this.f133688q);
            for (String str : strArr) {
                File file2 = new File(file, str);
                x1("Deleting " + file2.getAbsolutePath(), this.f133689r ? 3 : this.f133688q);
                if (!A2(file2)) {
                    C2("Unable to delete file " + file2.getAbsolutePath());
                }
            }
        }
        if (strArr2.length <= 0 || !this.f133687p) {
            return;
        }
        for (int length = strArr2.length - 1; length >= 0; length--) {
            File file3 = new File(file, strArr2[length]);
            String[] list = file3.list();
            if (list == null || list.length == 0) {
                x1("Deleting " + file3.getAbsolutePath(), this.f133689r ? 3 : this.f133688q);
                if (A2(file3)) {
                    i10++;
                } else {
                    C2("Unable to delete directory " + file3.getAbsolutePath());
                }
            }
        }
        if (i10 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Deleted ");
            sb2.append(i10);
            sb2.append(" director");
            sb2.append(i10 == 1 ? "y" : "ies");
            sb2.append(" form ");
            sb2.append(file.getAbsolutePath());
            x1(sb2.toString(), this.f133689r ? 3 : this.f133688q);
        }
    }

    public void G2(boolean z10) {
        this.f133691t = z10;
    }

    public void H2(File file) {
        this.f133684m = file;
        q2().R2(file);
    }

    public void I2(boolean z10) {
        this.f133690s = z10;
    }

    public void J2(File file) {
        this.f133683l = file;
    }

    public void K2(boolean z10) {
        this.f133687p = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void L0(org.apache.tools.ant.types.selectors.a0 a0Var) {
        this.f133686o = true;
        super.L0(a0Var);
    }

    public void L2(boolean z10) {
        this.f133694w = z10;
    }

    public void M2(boolean z10) {
        this.f133689r = z10;
        if (z10) {
            this.f133690s = false;
        }
    }

    public void N2(boolean z10) {
        this.f133692u = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void O0(org.apache.tools.ant.types.selectors.b0 b0Var) {
        this.f133686o = true;
        super.O0(b0Var);
    }

    public void O2(boolean z10) {
        if (z10) {
            this.f133688q = 2;
        } else {
            this.f133688q = 3;
        }
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void Q(org.apache.tools.ant.types.selectors.k kVar) {
        this.f133686o = true;
        super.Q(kVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void T0(org.apache.tools.ant.types.selectors.v vVar) {
        this.f133686o = true;
        super.T0(vVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void U(org.apache.tools.ant.types.selectors.l lVar) {
        this.f133686o = true;
        super.U(lVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void V0(org.apache.tools.ant.types.selectors.x xVar) {
        this.f133686o = true;
        super.V0(xVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void X(org.apache.tools.ant.types.selectors.j0 j0Var) {
        this.f133686o = true;
        super.X(j0Var);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void b0(org.apache.tools.ant.types.selectors.o0 o0Var) {
        this.f133686o = true;
        super.b0(o0Var);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void g(org.apache.tools.ant.types.selectors.h0 h0Var) {
        this.f133686o = true;
        super.g(h0Var);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void g1(org.apache.tools.ant.types.selectors.w wVar) {
        this.f133686o = true;
        super.g1(wVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void k0(org.apache.tools.ant.types.selectors.m mVar) {
        this.f133686o = true;
        super.k0(mVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public org.apache.tools.ant.types.w0.c k2() {
        this.f133686o = true;
        return super.k2();
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void l(org.apache.tools.ant.types.selectors.o oVar) {
        this.f133686o = true;
        super.l(oVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public org.apache.tools.ant.types.w0.c l2() {
        this.f133686o = true;
        return super.l2();
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public org.apache.tools.ant.types.w0.c m2() {
        this.f133686o = true;
        return super.m2();
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public org.apache.tools.ant.types.w0.c n2() {
        this.f133686o = true;
        return super.n2();
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public org.apache.tools.ant.types.w0 o2() {
        this.f133686o = true;
        return super.o2();
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public void r2(boolean z10) {
        this.f133686o = true;
        super.r2(z10);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void s1(org.apache.tools.ant.types.selectors.n nVar) {
        this.f133686o = true;
        super.s1(nVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public void s2(boolean z10) {
        this.f133686o = true;
        super.s2(z10);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void t(org.apache.tools.ant.types.selectors.s sVar) {
        this.f133686o = true;
        super.t(sVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public void t2(String str) {
        this.f133686o = true;
        super.t2(str);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void u0(org.apache.tools.ant.types.selectors.f fVar) {
        this.f133686o = true;
        super.u0(fVar);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public void u2(File file) {
        this.f133686o = true;
        super.u2(file);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void v0(org.apache.tools.ant.types.selectors.d0 d0Var) {
        this.f133686o = true;
        super.v0(d0Var);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public void v2(boolean z10) {
        this.f133686o = true;
        super.v2(z10);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public void w2(String str) {
        this.f133686o = true;
        super.w2(str);
    }

    @Override // org.apache.tools.ant.taskdefs.h4
    public void x2(File file) {
        this.f133686o = true;
        super.x2(file);
    }

    @Override // org.apache.tools.ant.taskdefs.h4, org.apache.tools.ant.types.selectors.k0
    public void y(org.apache.tools.ant.types.selectors.modifiedselector.i iVar) {
        this.f133686o = true;
        super.y(iVar);
    }

    public void y2(org.apache.tools.ant.types.u1 u1Var) {
        if (u1Var == null) {
            return;
        }
        if (this.f133693v == null) {
            org.apache.tools.ant.types.resources.f1 f1Var = new org.apache.tools.ant.types.resources.f1();
            this.f133693v = f1Var;
            f1Var.k2(true);
        }
        this.f133693v.g2(u1Var);
    }

    public void z2(org.apache.tools.ant.types.b0 b0Var) {
        this.f133685n.addElement(b0Var);
    }
}
