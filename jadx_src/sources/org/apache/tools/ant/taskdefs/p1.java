package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: ExecuteOn.java */
/* JADX INFO: loaded from: classes5.dex */
public class p1 extends j1 {
    protected Vector<org.apache.tools.ant.types.i> H = new Vector<>();
    private org.apache.tools.ant.types.resources.w1 I = null;
    private boolean J = false;
    private boolean K = false;
    private boolean L = false;
    protected String M = "file";
    protected org.apache.tools.ant.types.o.b N = null;
    private boolean O = false;
    protected org.apache.tools.ant.types.o.b P = null;
    protected org.apache.tools.ant.types.k0 Q = null;
    protected org.apache.tools.ant.util.g0 R = null;
    protected File S = null;
    private int T = -1;
    private boolean U = true;
    private boolean V = false;
    private boolean W = true;
    private boolean X = false;
    protected boolean Y = true;

    /* JADX INFO: compiled from: ExecuteOn.java */
    public static class a extends org.apache.tools.ant.types.w {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f135506c = "file";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f135507d = "dir";

        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"file", "dir", "both"};
        }
    }

    private static void m3(String[] strArr, String[] strArr2, int i10, String str, String str2) {
        if (str.isEmpty() && str2.isEmpty()) {
            System.arraycopy(strArr, 0, strArr2, i10, strArr.length);
            return;
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            strArr2[i10 + i11] = str + strArr[i11] + str2;
        }
    }

    private void n3(String str, org.apache.tools.ant.v0 v0Var, File file) {
        int iX = (!"dir".equals(str) ? v0Var.X() : 0) + ("file".equals(str) ? 0 : v0Var.W());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Skipping fileset for directory ");
        sb2.append(file);
        sb2.append(". It is ");
        sb2.append(iX > 0 ? "up to date." : "empty.");
        x1(sb2.toString(), this.V ? 2 : 3);
    }

    private String[] o3(String[] strArr, File file) {
        return (this.R == null || this.X) ? strArr : new org.apache.tools.ant.util.f2(this).k(strArr, file, this.S, this.R);
    }

    public void A3(boolean z10) {
        this.V = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    protected void Y2() {
        super.Y2();
        this.D.u(true);
    }

    public void Z2(org.apache.tools.ant.types.u1 u1Var) {
        if (this.I == null) {
            this.I = new org.apache.tools.ant.types.resources.w1();
        }
        this.I.f2(u1Var);
    }

    public void a3(org.apache.tools.ant.util.g0 g0Var) {
        e3().e2(g0Var);
    }

    public void b3(org.apache.tools.ant.types.v vVar) {
        this.H.addElement(vVar);
    }

    public void c3(org.apache.tools.ant.types.a0 a0Var) {
        Z2(a0Var);
    }

    public void d3(org.apache.tools.ant.types.b0 b0Var) {
        this.H.addElement(b0Var);
    }

    public org.apache.tools.ant.types.k0 e3() throws BuildException {
        if (this.Q != null) {
            throw new BuildException(t1.f135751x, w1());
        }
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        this.Q = k0Var;
        return k0Var;
    }

    public org.apache.tools.ant.types.o.b f3() {
        if (this.N == null) {
            org.apache.tools.ant.types.o.b bVarJ = this.f134310r.j();
            this.N = bVarJ;
            return bVarJ;
        }
        throw new BuildException(L1() + " doesn't support multiple srcfile elements.", w1());
    }

    public org.apache.tools.ant.types.o.b g3() {
        if (this.P == null) {
            org.apache.tools.ant.types.o.b bVarJ = this.f134310r.j();
            this.P = bVarJ;
            this.Y = this.N != null;
            return bVarJ;
        }
        throw new BuildException(L1() + " doesn't support multiple targetfile elements.", w1());
    }

    protected String[] h3(String str, File file) {
        return i3(new String[]{str}, new File[]{file});
    }

    protected String[] i3(String[] strArr, File[] fileArr) {
        char c10 = File.separatorChar;
        ArrayList arrayList = new ArrayList();
        if (this.P != null) {
            HashSet hashSet = new HashSet();
            for (String str : strArr) {
                String[] strArrY0 = this.R.y0(str);
                if (strArrY0 != null) {
                    int length = strArrY0.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        String strReplace = strArrY0[i10];
                        if (!this.J) {
                            strReplace = new File(this.S, strReplace).getAbsolutePath();
                        }
                        if (this.L && c10 != '/') {
                            strReplace = strReplace.replace(c10, IOUtils.DIR_SEPARATOR_UNIX);
                        }
                        if (!hashSet.contains(strReplace)) {
                            arrayList.add(strReplace);
                            hashSet.add(strReplace);
                        }
                    }
                }
            }
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        if (!this.U) {
            strArr = new String[0];
        }
        String[] strArrS = this.f134310r.s();
        String[] strArr3 = new String[strArrS.length + strArr.length + strArr2.length];
        int length2 = strArrS.length;
        org.apache.tools.ant.types.o.b bVar = this.N;
        if (bVar != null) {
            length2 = bVar.a();
        }
        org.apache.tools.ant.types.o.b bVar2 = this.P;
        if (bVar2 != null) {
            int iA = bVar2.a();
            if (length2 < iA || (length2 == iA && this.Y)) {
                System.arraycopy(strArrS, 0, strArr3, 0, length2);
                System.arraycopy(strArrS, length2, strArr3, strArr.length + length2, iA - length2);
                m3(strArr2, strArr3, strArr.length + iA, this.P.b(), this.P.c());
                System.arraycopy(strArrS, iA, strArr3, strArr.length + iA + strArr2.length, strArrS.length - iA);
            } else {
                System.arraycopy(strArrS, 0, strArr3, 0, iA);
                m3(strArr2, strArr3, iA, this.P.b(), this.P.c());
                System.arraycopy(strArrS, iA, strArr3, strArr2.length + iA, length2 - iA);
                System.arraycopy(strArrS, length2, strArr3, strArr.length + length2 + strArr2.length, strArrS.length - length2);
                length2 += strArr2.length;
            }
        } else {
            System.arraycopy(strArrS, 0, strArr3, 0, length2);
            System.arraycopy(strArrS, length2, strArr3, strArr.length + length2, strArrS.length - length2);
        }
        for (int i11 = 0; i11 < strArr.length; i11++) {
            String absolutePath = this.J ? strArr[i11] : new File(fileArr[i11], strArr[i11]).getAbsolutePath();
            if (this.L && c10 != '/') {
                absolutePath = absolutePath.replace(c10, IOUtils.DIR_SEPARATOR_UNIX);
            }
            org.apache.tools.ant.types.o.b bVar3 = this.N;
            if (bVar3 != null && (!bVar3.b().isEmpty() || !this.N.c().isEmpty())) {
                absolutePath = this.N.b() + absolutePath + this.N.c();
            }
            strArr3[length2 + i11] = absolutePath;
        }
        return strArr3;
    }

    protected String[] j3(File file, org.apache.tools.ant.v0 v0Var) {
        return o3(v0Var.j(), file);
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    protected void k2() {
        if ("execon".equals(K1())) {
            log("!! execon is deprecated. Use apply instead. !!");
        }
        super.k2();
        if (this.H.isEmpty() && this.I == null) {
            throw new BuildException("no resources specified", w1());
        }
        if (this.P != null && this.Q == null) {
            throw new BuildException("targetfile specified without mapper", w1());
        }
        if (this.S != null && this.Q == null) {
            throw new BuildException("dest specified without mapper", w1());
        }
        org.apache.tools.ant.types.k0 k0Var = this.Q;
        if (k0Var != null) {
            this.R = k0Var.i2();
        }
    }

    protected String[] k3(File file, org.apache.tools.ant.v0 v0Var) {
        return o3(v0Var.m(), file);
    }

    protected String[] l3(org.apache.tools.ant.types.a0 a0Var) {
        return o3(a0Var.g2(b()), a0Var.f2(b()));
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    protected q1 m2() throws BuildException {
        return this.E == null ? super.m2() : new d5();
    }

    protected void p3(n1 n1Var, Vector<String> vector, Vector<File> vector2) throws IOException, BuildException {
        String[] strArr = (String[]) vector.toArray(new String[vector.size()]);
        File[] fileArr = (File[]) vector2.toArray(new File[vector2.size()]);
        if (this.T <= 0 || strArr.length == 0) {
            String[] strArrI3 = i3(strArr, fileArr);
            x1(org.apache.tools.ant.types.o.q(strArrI3), 3);
            n1Var.x(strArrI3);
            if (this.E != null) {
                Y2();
                this.E.i2(this.D, null);
                n1Var.C(this.D.f());
            }
            A2(n1Var);
            return;
        }
        int size = vector.size();
        int i10 = 0;
        while (size > 0) {
            int iMin = Math.min(size, this.T);
            String[] strArr2 = new String[iMin];
            System.arraycopy(strArr, i10, strArr2, 0, iMin);
            File[] fileArr2 = new File[iMin];
            System.arraycopy(fileArr, i10, fileArr2, 0, iMin);
            String[] strArrI4 = i3(strArr2, fileArr2);
            x1(org.apache.tools.ant.types.o.q(strArrI4), 3);
            n1Var.x(strArrI4);
            if (this.E != null) {
                Y2();
                this.E.i2(this.D, null);
            }
            if (this.E != null || i10 > 0) {
                n1Var.C(this.D.f());
            }
            A2(n1Var);
            size -= iMin;
            i10 += iMin;
        }
    }

    public void q3(boolean z10) {
        this.U = z10;
    }

    public void r3(File file) {
        this.S = file;
    }

    public void s3(boolean z10) {
        this.X = z10;
    }

    public void t3(boolean z10) {
        this.L = z10;
    }

    public void u3(boolean z10) {
        this.W = z10;
    }

    public void v3(int i10) {
        this.T = i10;
    }

    public void w3(boolean z10) {
        this.K = z10;
    }

    public void x3(boolean z10) {
        this.J = z10;
    }

    public void y3(boolean z10) {
        this.O = z10;
    }

    @Override // org.apache.tools.ant.taskdefs.j1
    protected void z2(n1 n1Var) throws BuildException {
        try {
            try {
                Vector<String> vector = new Vector<>();
                Vector<File> vector2 = new Vector<>();
                boolean z10 = false;
                int i10 = 0;
                int i11 = 0;
                for (org.apache.tools.ant.types.i iVar : this.H) {
                    String str = this.M;
                    if ((iVar instanceof org.apache.tools.ant.types.v) && !"dir".equals(str)) {
                        x1("Found a nested dirset but type is " + this.M + ". Temporarily switching to type=\"dir\" on the assumption that you really did mean <dirset> not <fileset>.", 4);
                        str = "dir";
                    }
                    File fileZ2 = iVar.z2(b());
                    org.apache.tools.ant.v0 v0VarB2 = iVar.B2(b());
                    if (!"dir".equals(str)) {
                        for (String str2 : k3(fileZ2, v0VarB2)) {
                            i10++;
                            vector.add(str2);
                            vector2.add(fileZ2);
                        }
                    }
                    if (!"file".equals(str)) {
                        for (String str3 : j3(fileZ2, v0VarB2)) {
                            i11++;
                            vector.add(str3);
                            vector2.add(fileZ2);
                        }
                    }
                    if (vector.isEmpty() && this.O) {
                        n3(str, v0VarB2, fileZ2);
                    } else if (!this.K) {
                        for (String str4 : vector) {
                            String[] strArrH3 = h3(str4, fileZ2);
                            x1(org.apache.tools.ant.types.o.q(strArrH3), 3);
                            n1Var.x(strArrH3);
                            if (this.E != null) {
                                Y2();
                                this.E.i2(this.D, str4);
                            }
                            if (this.E != null || z10) {
                                n1Var.C(this.D.f());
                            }
                            A2(n1Var);
                            z10 = true;
                        }
                        vector.clear();
                        vector2.clear();
                    }
                }
                org.apache.tools.ant.types.resources.w1 w1Var = this.I;
                if (w1Var != null) {
                    for (org.apache.tools.ant.types.s1 s1Var : w1Var) {
                        if (s1Var.p2() || !this.W) {
                            File file = null;
                            String strK2 = s1Var.k2();
                            org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
                            if (yVar != null) {
                                org.apache.tools.ant.types.resources.z zVarD = ResourceUtils.d(yVar);
                                File fileW2 = zVarD.w2();
                                if (fileW2 == null) {
                                    strK2 = zVarD.l0().getAbsolutePath();
                                }
                                file = fileW2;
                            }
                            if (o3(new String[]{strK2}, file).length != 0) {
                                if ((!s1Var.o2() || !s1Var.p2()) && !"dir".equals(this.M)) {
                                    i10++;
                                } else if (s1Var.o2() && !"file".equals(this.M)) {
                                    i11++;
                                }
                                vector2.add(file);
                                vector.add(strK2);
                                if (!this.K) {
                                    String[] strArrH4 = h3(strK2, file);
                                    x1(org.apache.tools.ant.types.o.q(strArrH4), 3);
                                    n1Var.x(strArrH4);
                                    if (this.E != null) {
                                        Y2();
                                        this.E.i2(this.D, strK2);
                                    }
                                    if (this.E != null || z10) {
                                        n1Var.C(this.D.f());
                                    }
                                    A2(n1Var);
                                    vector.clear();
                                    vector2.clear();
                                    z10 = true;
                                }
                            }
                        }
                    }
                }
                if (this.K && (!vector.isEmpty() || !this.O)) {
                    p3(n1Var, vector, vector2);
                    z10 = true;
                }
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Applied ");
                    sb2.append(this.f134310r.t());
                    sb2.append(" to ");
                    sb2.append(i10);
                    sb2.append(" file");
                    sb2.append(i10 != 1 ? ak.aB : "");
                    sb2.append(" and ");
                    sb2.append(i11);
                    sb2.append(" director");
                    sb2.append(i11 != 1 ? "ies" : "y");
                    sb2.append(".");
                    x1(sb2.toString(), this.V ? 2 : 3);
                }
                v2();
                this.D.u(false);
                this.D.P();
            } catch (IOException e10) {
                throw new BuildException("Execute failed: " + e10, e10, w1());
            }
        } catch (Throwable th2) {
            v2();
            this.D.u(false);
            this.D.P();
            throw th2;
        }
    }

    public void z3(a aVar) {
        this.M = aVar.d();
    }
}
