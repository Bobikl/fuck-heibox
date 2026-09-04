package org.apache.tools.ant.taskdefs;

import com.tencent.qcloud.core.util.IOUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: PathConvert.java */
/* JADX INFO: loaded from: classes5.dex */
public class r4 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static boolean f135665v = org.apache.tools.ant.taskdefs.condition.z.b(org.apache.tools.ant.taskdefs.condition.z.f133973o);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.resources.f1 f135666k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private org.apache.tools.ant.types.q1 f135667l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135668m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f135669n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135670o = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135671p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<a> f135672q = new Vector();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f135673r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f135674s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private org.apache.tools.ant.types.k0 f135675t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f135676u;

    /* JADX INFO: compiled from: PathConvert.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f135677a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f135678b = null;

        public a() {
        }

        public String a(String str) {
            if (this.f135677a == null || this.f135678b == null) {
                throw new BuildException("Both 'from' and 'to' must be set in a map entry");
            }
            if (!(r4.f135665v ? str.toLowerCase().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) : str).startsWith(r4.f135665v ? this.f135677a.toLowerCase().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX) : this.f135677a)) {
                return str;
            }
            return this.f135678b + str.substring(this.f135677a.length());
        }

        public void b(String str) {
            this.f135677a = str;
        }

        public void c(String str) {
            this.f135678b = str;
        }
    }

    /* JADX INFO: compiled from: PathConvert.java */
    public static class b extends org.apache.tools.ant.types.w {
        @Override // org.apache.tools.ant.types.w
        public String[] e() {
            return new String[]{"windows", org.apache.tools.ant.taskdefs.condition.z.f133976r, org.apache.tools.ant.taskdefs.condition.z.f133972n, org.apache.tools.ant.taskdefs.condition.z.f133971m, org.apache.tools.ant.taskdefs.condition.z.f133975q};
        }
    }

    private void B2() throws BuildException {
        if (this.f135666k == null) {
            throw new BuildException("You must specify a path to convert");
        }
        String str = File.separator;
        String str2 = File.pathSeparator;
        if (this.f135668m != null) {
            boolean z10 = this.f135669n;
            str2 = z10 ? ";" : ":";
            str = z10 ? "\\" : "/";
        }
        String str3 = this.f135673r;
        if (str3 != null) {
            str2 = str3;
        }
        String str4 = this.f135674s;
        if (str4 != null) {
            str = str4;
        }
        this.f135673r = str2;
        this.f135674s = str;
    }

    private synchronized org.apache.tools.ant.types.resources.f1 o2() {
        if (this.f135666k == null) {
            org.apache.tools.ant.types.resources.f1 f1Var = new org.apache.tools.ant.types.resources.f1(b());
            this.f135666k = f1Var;
            f1Var.k2(true);
        }
        return this.f135666k;
    }

    private String r2(String str) {
        Iterator<a> it = this.f135672q.iterator();
        while (it.hasNext()) {
            String strA = it.next().a(str);
            if (strA != str) {
                return strA;
            }
        }
        return str;
    }

    private BuildException s2() {
        return new BuildException("You must not specify nested elements when using the refid attribute.");
    }

    public void A2(b bVar) {
        String strD = bVar.d();
        this.f135668m = strD;
        this.f135669n = (org.apache.tools.ant.taskdefs.condition.z.f133976r.equals(strD) || org.apache.tools.ant.taskdefs.condition.z.f133975q.equals(this.f135668m)) ? false : true;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        org.apache.tools.ant.types.resources.f1 f1Var = this.f135666k;
        String str = this.f135673r;
        String str2 = this.f135674s;
        try {
            if (q2()) {
                Object objD = this.f135667l.d(b());
                if (!(objD instanceof org.apache.tools.ant.types.u1)) {
                    throw new BuildException("refid '%s' does not refer to a resource collection.", this.f135667l.b());
                }
                o2().g2((org.apache.tools.ant.types.u1) objD);
            }
            B2();
            String str3 = f135665v ? "\\" : "/";
            StringBuilder sb2 = new StringBuilder();
            Iterable w1Var = p2() ? this.f135666k : new org.apache.tools.ant.types.resources.w1(this.f135666k);
            ArrayList arrayList = new ArrayList();
            org.apache.tools.ant.types.k0 k0Var = this.f135675t;
            org.apache.tools.ant.util.g0 q0Var = k0Var == null ? new org.apache.tools.ant.util.q0() : k0Var.i2();
            Iterator it = w1Var.iterator();
            while (it.hasNext()) {
                String[] strArrY0 = q0Var.y0(String.valueOf((org.apache.tools.ant.types.s1) it.next()));
                for (int i10 = 0; strArrY0 != null && i10 < strArrY0.length; i10++) {
                    arrayList.add(strArrY0[i10]);
                }
            }
            Iterator it2 = arrayList.iterator();
            boolean z10 = true;
            while (it2.hasNext()) {
                String strR2 = r2((String) it2.next());
                if (!z10) {
                    sb2.append(this.f135673r);
                }
                StringTokenizer stringTokenizer = new StringTokenizer(strR2, str3, true);
                while (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    if (str3.equals(strNextToken)) {
                        strNextToken = this.f135674s;
                    }
                    sb2.append(strNextToken);
                }
                z10 = false;
            }
            if (this.f135670o || sb2.length() > 0) {
                String string = sb2.toString();
                if (this.f135671p == null) {
                    log(string);
                } else {
                    x1("Set property " + this.f135671p + " = " + string, 3);
                    b().n1(this.f135671p, string);
                }
            }
            this.f135666k = f1Var;
            this.f135674s = str2;
            this.f135673r = str;
        } catch (Throwable th2) {
            this.f135666k = f1Var;
            this.f135674s = str2;
            this.f135673r = str;
            throw th2;
        }
    }

    public void j2(org.apache.tools.ant.types.u1 u1Var) {
        if (q2()) {
            throw s2();
        }
        o2().g2(u1Var);
    }

    public void k2(org.apache.tools.ant.util.g0 g0Var) {
        org.apache.tools.ant.types.k0 k0Var = new org.apache.tools.ant.types.k0(b());
        k0Var.e2(g0Var);
        l2(k0Var);
    }

    public void l2(org.apache.tools.ant.types.k0 k0Var) {
        if (this.f135675t != null) {
            throw new BuildException(t1.f135751x);
        }
        this.f135675t = k0Var;
    }

    public a m2() {
        a aVar = new a();
        this.f135672q.add(aVar);
        return aVar;
    }

    public org.apache.tools.ant.types.o0 n2() {
        if (q2()) {
            throw s2();
        }
        org.apache.tools.ant.types.o0 o0Var = new org.apache.tools.ant.types.o0(b());
        j2(o0Var);
        return o0Var;
    }

    public boolean p2() {
        return this.f135676u;
    }

    public boolean q2() {
        return this.f135667l != null;
    }

    public void t2(String str) {
        this.f135674s = str;
    }

    public void u2(String str) {
        this.f135673r = str;
    }

    public void v2(boolean z10) {
        this.f135676u = z10;
    }

    public void w2(String str) {
        this.f135671p = str;
    }

    public void x2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f135666k != null) {
            throw s2();
        }
        this.f135667l = q1Var;
    }

    public void y2(boolean z10) {
        this.f135670o = z10;
    }

    @Deprecated
    public void z2(String str) {
        b bVar = new b();
        bVar.g(str);
        A2(bVar);
    }
}
