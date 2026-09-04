package org.apache.tools.ant.types;

import java.io.File;
import java.util.Iterator;
import java.util.Stack;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;

/* JADX INFO: compiled from: ArchiveFileSet.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class k extends b0 {
    private static final int B = 8;
    public static final int C = 16877;
    public static final int D = 33188;
    private static final String E = "Cannot set both dir and src attributes";
    private static final String F = "Cannot set both fullpath and prefix attributes";
    private String A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private s1 f136202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f136203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f136204t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f136205u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f136206v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f136207w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f136208x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f136209y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f136210z;

    public k() {
        this.f136202r = null;
        this.f136203s = "";
        this.f136204t = "";
        this.f136205u = false;
        this.f136206v = 33188;
        this.f136207w = 16877;
        this.f136208x = false;
        this.f136209y = false;
        this.f136210z = true;
        this.A = null;
    }

    protected k(b0 b0Var) {
        super(b0Var);
        this.f136202r = null;
        this.f136203s = "";
        this.f136204t = "";
        this.f136205u = false;
        this.f136206v = 33188;
        this.f136207w = 16877;
        this.f136208x = false;
        this.f136209y = false;
        this.f136210z = true;
        this.A = null;
    }

    protected k(k kVar) {
        super(kVar);
        this.f136202r = null;
        this.f136203s = "";
        this.f136204t = "";
        this.f136205u = false;
        this.f136206v = 33188;
        this.f136207w = 16877;
        this.f136208x = false;
        this.f136209y = false;
        this.f136210z = true;
        this.A = null;
        this.f136202r = kVar.f136202r;
        this.f136203s = kVar.f136203s;
        this.f136204t = kVar.f136204t;
        this.f136205u = kVar.f136205u;
        this.f136206v = kVar.f136206v;
        this.f136207w = kVar.f136207w;
        this.f136208x = kVar.f136208x;
        this.f136209y = kVar.f136209y;
        this.f136210z = kVar.f136210z;
        this.A = kVar.A;
    }

    private void e3() {
        if (b() == null || (Y1() && (V1().d(b()) instanceof k))) {
            B1();
        }
    }

    public void A3(String str) {
        e3();
        v3(Integer.parseInt(str, 8));
    }

    @Override // org.apache.tools.ant.types.i
    public org.apache.tools.ant.v0 B2(Project project) {
        if (Y1()) {
            return E2(project).B2(project);
        }
        H1();
        s1 s1Var = this.f136202r;
        if (s1Var == null) {
            return super.B2(project);
        }
        if (!s1Var.p2() && this.f136210z) {
            throw new BuildException("The archive " + this.f136202r.k2() + " doesn't exist");
        }
        if (this.f136202r.o2()) {
            throw new BuildException("The archive " + this.f136202r.k2() + " can't be a directory");
        }
        l lVarW3 = w3();
        lVarW3.W0(this.f136210z);
        lVarW3.Y0(this.f136202r);
        super.R2(project.Z());
        b3(lVarW3, project);
        lVarW3.S0();
        return lVarW3;
    }

    public void B3(String str) {
        e3();
        if (!this.f136203s.isEmpty() && !str.isEmpty()) {
            throw new BuildException(F);
        }
        this.f136204t = str;
    }

    public void C3(String str) {
        e3();
        if (!str.isEmpty() && !this.f136204t.isEmpty()) {
            throw new BuildException(F);
        }
        this.f136203s = str;
    }

    public void D3(File file) {
        E3(new org.apache.tools.ant.types.resources.z(file));
    }

    public void E3(s1 s1Var) {
        e3();
        if (this.f136205u) {
            throw new BuildException(E);
        }
        this.f136202r = s1Var;
        b2(false);
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s
    protected synchronized void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        super.I1(stack, project);
        if (!Y1()) {
            s1 s1Var = this.f136202r;
            if (s1Var != null) {
                s.a2(s1Var, stack, project);
            }
            b2(true);
        }
    }

    @Override // org.apache.tools.ant.types.b0, org.apache.tools.ant.types.u1
    public boolean O() {
        if (Y1()) {
            return ((k) p3()).O();
        }
        H1();
        return this.f136202r == null;
    }

    @Override // org.apache.tools.ant.types.i
    public void R2(File file) throws BuildException {
        B1();
        if (this.f136202r != null) {
            throw new BuildException(E);
        }
        super.R2(file);
        this.f136205u = true;
    }

    @Override // org.apache.tools.ant.types.b0, org.apache.tools.ant.types.i, org.apache.tools.ant.types.s, org.apache.tools.ant.b2
    public Object clone() {
        return Y1() ? ((k) O1(k.class)).clone() : super.clone();
    }

    public void d3(u1 u1Var) {
        D1();
        if (u1Var.size() != 1) {
            throw new BuildException("only single argument resource collections are supported as archives");
        }
        E3(u1Var.iterator().next());
    }

    protected void f3(k kVar) {
        kVar.C3(this.f136203s);
        kVar.B3(this.f136204t);
        kVar.f136208x = this.f136208x;
        kVar.f136206v = this.f136206v;
        kVar.f136209y = this.f136209y;
        kVar.f136207w = this.f136207w;
    }

    @Deprecated
    public int g3() {
        return this.f136207w;
    }

    public int h3(Project project) {
        if (Y1()) {
            return ((k) E2(project)).h3(project);
        }
        H1();
        return this.f136207w;
    }

    public String i3() {
        if (!Y1()) {
            return this.A;
        }
        i iVarP3 = p3();
        if (iVarP3 instanceof k) {
            return ((k) iVarP3).i3();
        }
        return null;
    }

    @Override // org.apache.tools.ant.types.b0, java.lang.Iterable
    public Iterator<s1> iterator() {
        if (Y1()) {
            return ((u1) p3()).iterator();
        }
        return this.f136202r == null ? super.iterator() : ((l) A2()).R0(b());
    }

    @Deprecated
    public int j3() {
        return this.f136206v;
    }

    public int k3(Project project) {
        if (Y1()) {
            return ((k) E2(project)).k3(project);
        }
        H1();
        return this.f136206v;
    }

    @Deprecated
    public String l3() {
        return this.f136204t;
    }

    public String m3(Project project) {
        if (Y1()) {
            return ((k) E2(project)).m3(project);
        }
        K1(project);
        return this.f136204t;
    }

    @Deprecated
    public String n3() {
        return this.f136203s;
    }

    public String o3(Project project) {
        if (Y1()) {
            return ((k) E2(project)).o3(project);
        }
        K1(project);
        return this.f136203s;
    }

    protected i p3() {
        return (i) O1(i.class);
    }

    public File q3() {
        if (Y1()) {
            return ((k) O1(k.class)).q3();
        }
        H1();
        s1 s1Var = this.f136202r;
        if (s1Var == null) {
            return null;
        }
        return (File) s1Var.f2(org.apache.tools.ant.types.resources.y.class).map(new org.apache.tools.ant.taskdefs.f2()).orElse(null);
    }

    public File r3(Project project) {
        return Y1() ? ((k) E2(project)).r3(project) : q3();
    }

    public boolean s3() {
        if (Y1()) {
            return ((k) p3()).s3();
        }
        H1();
        return this.f136209y;
    }

    @Override // org.apache.tools.ant.types.b0, org.apache.tools.ant.types.u1
    public int size() {
        if (Y1()) {
            return ((u1) p3()).size();
        }
        return this.f136202r == null ? super.size() : A2().X();
    }

    public boolean t3() {
        if (Y1()) {
            return ((k) p3()).t3();
        }
        H1();
        return this.f136208x;
    }

    @Override // org.apache.tools.ant.types.i, org.apache.tools.ant.types.s
    public String toString() {
        if (this.f136205u && b() != null) {
            return super.toString();
        }
        s1 s1Var = this.f136202r;
        if (s1Var == null) {
            return null;
        }
        return s1Var.k2();
    }

    public void u3(int i10) {
        this.f136209y = true;
        this.f136207w = i10 | 16384;
    }

    public void v3(int i10) {
        this.f136208x = true;
        this.f136206v = i10 | 32768;
    }

    protected abstract l w3();

    public void x3(String str) {
        e3();
        u3(Integer.parseInt(str, 8));
    }

    public void y3(String str) {
        B1();
        this.A = str;
    }

    public void z3(boolean z10) {
        B1();
        this.f136210z = z10;
    }
}
