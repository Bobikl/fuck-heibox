package org.apache.tools.ant.types.resources;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: FileResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class z extends org.apache.tools.ant.types.s1 implements o1, y, org.apache.tools.ant.types.v1, f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136482r = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f136483s = org.apache.tools.ant.types.s1.j2("null file".getBytes());

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private File f136484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private File f136485q;

    public z() {
    }

    public z(File file) {
        B2(file);
    }

    public z(File file, String str) {
        this.f136485q = file;
        this.f136484p = f136482r.n0(file, str);
    }

    public z(Project project, File file) {
        this(file);
        J(project);
    }

    public z(Project project, String str) {
        this(project, project.W0(str));
    }

    private OutputStream y2(boolean z10) throws IOException {
        File fileX2 = x2();
        if (!fileX2.exists()) {
            File parentFile = fileX2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
        } else if (Files.isSymbolicLink(fileX2.toPath()) && fileX2.isFile() && !z10) {
            fileX2.delete();
        }
        return org.apache.tools.ant.util.j0.h0(fileX2.toPath(), z10);
    }

    public void A2(File file) {
        B1();
        this.f136485q = file;
    }

    public void B2(File file) {
        B1();
        this.f136484p = file;
        if (file != null) {
            if (w2() == null || !f136482r.Y(w2(), file)) {
                A2(file.getParentFile());
            }
        }
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.u1
    public boolean O() {
        if (Y1()) {
            return m2().O();
        }
        H1();
        return true;
    }

    @Override // org.apache.tools.ant.types.resources.o1
    public void Z0(long j10) {
        if (Y1()) {
            m2().Z0(j10);
        } else {
            if (x2().setLastModified(j10)) {
                return;
            }
            x1("Failed to change file modification time", 1);
        }
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136484p != null || this.f136485q != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (Y1()) {
            return m2().equals(obj);
        }
        if (obj == null || !obj.getClass().equals(getClass())) {
            return false;
        }
        z zVar = (z) obj;
        if (l0() == null) {
            if (zVar.l0() == null) {
                return true;
            }
        } else if (l0().equals(zVar.l0()) && k2().equals(zVar.k2())) {
            return true;
        }
        return false;
    }

    @Override // org.apache.tools.ant.types.s1, java.lang.Comparable
    /* JADX INFO: renamed from: g2 */
    public int compareTo(org.apache.tools.ant.types.s1 s1Var) {
        if (Y1()) {
            return m2().compareTo(s1Var);
        }
        if (equals(s1Var)) {
            return 0;
        }
        y yVar = (y) s1Var.e2(y.class);
        if (yVar == null) {
            return super.compareTo(s1Var);
        }
        File fileL0 = l0();
        if (fileL0 == null) {
            return -1;
        }
        File fileL1 = yVar.l0();
        if (fileL1 == null) {
            return 1;
        }
        int iCompareTo = fileL0.compareTo(fileL1);
        return iCompareTo != 0 ? iCompareTo : k2().compareTo(s1Var.k2());
    }

    @Override // org.apache.tools.ant.types.s1
    public InputStream h2() throws IOException {
        return Y1() ? m2().h2() : Files.newInputStream(x2().toPath(), new OpenOption[0]);
    }

    @Override // org.apache.tools.ant.types.s1
    public int hashCode() {
        if (Y1()) {
            return m2().hashCode();
        }
        return org.apache.tools.ant.types.s1.f136492n * (l0() == null ? f136483s : l0().hashCode());
    }

    @Override // org.apache.tools.ant.types.s1
    public long i2() {
        return Y1() ? m2().i2() : x2().lastModified();
    }

    @Override // org.apache.tools.ant.types.resources.f
    public OutputStream j() throws IOException {
        return Y1() ? m2().j() : y2(true);
    }

    @Override // org.apache.tools.ant.types.s1
    public String k2() {
        if (Y1()) {
            return m2().k2();
        }
        File fileW2 = w2();
        return fileW2 == null ? x2().getName() : f136482r.l0(fileW2, x2());
    }

    @Override // org.apache.tools.ant.types.resources.y
    public File l0() {
        if (Y1()) {
            return m2().l0();
        }
        H1();
        synchronized (this) {
            if (this.f136484p == null) {
                File fileW2 = w2();
                String strK2 = super.k2();
                if (strK2 != null) {
                    B2(f136482r.n0(fileW2, strK2));
                }
            }
        }
        return this.f136484p;
    }

    @Override // org.apache.tools.ant.types.s1
    public OutputStream l2() throws IOException {
        return Y1() ? m2().l2() : y2(false);
    }

    @Override // org.apache.tools.ant.types.s1
    public long n2() {
        return Y1() ? m2().n2() : x2().length();
    }

    @Override // org.apache.tools.ant.types.v1
    public org.apache.tools.ant.types.s1 o(String str) {
        org.apache.tools.ant.util.j0 j0Var = f136482r;
        File fileN0 = j0Var.n0(l0(), str);
        z zVar = new z(fileN0);
        if (j0Var.Y(w2(), fileN0)) {
            zVar.A2(w2());
        }
        return zVar;
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean o2() {
        return Y1() ? m2().o2() : x2().isDirectory();
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean p2() {
        return Y1() ? m2().p2() : x2().exists();
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public String toString() {
        if (Y1()) {
            return m2().toString();
        }
        File file = this.f136484p;
        if (file == null) {
            return "(unbound file resource)";
        }
        return f136482r.i0(file.getAbsolutePath()).getAbsolutePath();
    }

    public File w2() {
        if (Y1()) {
            return m2().w2();
        }
        H1();
        return this.f136485q;
    }

    protected File x2() {
        if (l0() == null) {
            throw new BuildException("file attribute is null!");
        }
        H1();
        return l0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.tools.ant.types.s1
    /* JADX INFO: renamed from: z2, reason: merged with bridge method [inline-methods] */
    public z m2() {
        return (z) O1(z.class);
    }
}
