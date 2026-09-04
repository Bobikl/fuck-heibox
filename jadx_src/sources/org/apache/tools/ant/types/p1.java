package org.apache.tools.ant.types;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.i5;

/* JADX INFO: compiled from: RedirectorElement.java */
/* JADX INFO: loaded from: classes5.dex */
public class p1 extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Boolean f136274j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f136275k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f136276l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f136277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Boolean f136278n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f136279o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Boolean f136280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private k0 f136281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private k0 f136282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k0 f136283s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f136287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f136288x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private String f136289y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Boolean f136290z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f136271g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f136272h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f136273i = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Vector<c0> f136284t = new Vector<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Vector<c0> f136285u = new Vector<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Vector<c0> f136286v = new Vector<>();
    private boolean A = false;

    private p1 n2() {
        return (p1) O1(p1.class);
    }

    public void A2(File file) {
        if (Y1()) {
            throw d2();
        }
        if (file == null) {
            throw new IllegalArgumentException("output file specified as null");
        }
        this.f136272h = true;
        this.f136282r = l2(file);
    }

    public void B2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136287w = str;
    }

    public void C2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136275k = str;
    }

    protected File[] D2(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(b().W0(str));
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    @Override // org.apache.tools.ant.types.s
    protected void I1(Stack<Object> stack, Project project) throws BuildException {
        if (X1()) {
            return;
        }
        if (Y1()) {
            super.I1(stack, project);
            return;
        }
        for (k0 k0Var : Arrays.asList(this.f136281q, this.f136282r, this.f136283s)) {
            if (k0Var != null) {
                stack.push(k0Var);
                k0Var.I1(stack, project);
                stack.pop();
            }
        }
        for (List list : Arrays.asList(this.f136284t, this.f136285u, this.f136286v)) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    s.a2((c0) it.next(), stack, project);
                }
            }
        }
        b2(true);
    }

    @Override // org.apache.tools.ant.types.s
    public void c2(q1 q1Var) throws BuildException {
        if (this.f136271g || this.f136272h || this.f136273i || this.f136277m != null || this.f136274j != null || this.f136278n != null || this.f136280p != null || this.f136289y != null || this.f136287w != null || this.f136288x != null || this.f136275k != null || this.f136276l != null || this.f136290z != null) {
            throw d2();
        }
        super.c2(q1Var);
    }

    public void e2(k0 k0Var) {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136283s != null) {
            if (!this.f136273i) {
                throw new BuildException("Cannot have > 1 <errormapper>");
            }
            throw new BuildException("attribute \"error\" cannot coexist with a nested <errormapper>");
        }
        b2(false);
        this.f136283s = k0Var;
    }

    public void f2(k0 k0Var) {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136281q != null) {
            if (!this.f136271g) {
                throw new BuildException("Cannot have > 1 <inputmapper>");
            }
            throw new BuildException("attribute \"input\" cannot coexist with a nested <inputmapper>");
        }
        b2(false);
        this.f136281q = k0Var;
    }

    public void g2(k0 k0Var) {
        if (Y1()) {
            throw Z1();
        }
        if (this.f136282r != null) {
            if (!this.f136272h) {
                throw new BuildException("Cannot have > 1 <outputmapper>");
            }
            throw new BuildException("attribute \"output\" cannot coexist with a nested <outputmapper>");
        }
        b2(false);
        this.f136282r = k0Var;
    }

    public void h2(i5 i5Var) {
        i2(i5Var, null);
    }

    public void i2(i5 i5Var, String str) {
        String[] strArrY0;
        String[] strArrY1;
        if (Y1()) {
            n2().i2(i5Var, str);
            return;
        }
        H1();
        Boolean bool = this.f136279o;
        if (bool != null) {
            i5Var.s(bool.booleanValue());
        }
        Boolean bool2 = this.f136274j;
        if (bool2 != null) {
            i5Var.I(bool2.booleanValue());
        }
        Boolean bool3 = this.f136278n;
        if (bool3 != null) {
            i5Var.t(bool3.booleanValue());
        }
        Boolean bool4 = this.f136280p;
        if (bool4 != null) {
            i5Var.w(bool4.booleanValue());
        }
        String str2 = this.f136275k;
        if (str2 != null) {
            i5Var.O(str2);
        }
        String str3 = this.f136276l;
        if (str3 != null) {
            i5Var.B(str3);
        }
        String str4 = this.f136277m;
        if (str4 != null) {
            i5Var.H(str4);
        }
        Boolean bool5 = this.f136290z;
        if (bool5 != null) {
            i5Var.J(bool5.booleanValue());
        }
        k0 k0Var = this.f136281q;
        String[] strArrY2 = null;
        if (k0Var != null) {
            try {
                strArrY0 = k0Var.i2().y0(str);
            } catch (NullPointerException e10) {
                if (str != null) {
                    throw e10;
                }
                strArrY0 = null;
            }
            if (strArrY0 != null && strArrY0.length > 0) {
                i5Var.D(D2(strArrY0));
            }
        }
        k0 k0Var2 = this.f136282r;
        if (k0Var2 != null) {
            try {
                strArrY1 = k0Var2.i2().y0(str);
            } catch (NullPointerException e11) {
                if (str != null) {
                    throw e11;
                }
                strArrY1 = null;
            }
            if (strArrY1 != null && strArrY1.length > 0) {
                i5Var.L(D2(strArrY1));
            }
        }
        k0 k0Var3 = this.f136283s;
        if (k0Var3 != null) {
            try {
                strArrY2 = k0Var3.i2().y0(str);
            } catch (NullPointerException e12) {
                if (str != null) {
                    throw e12;
                }
            }
            if (strArrY2 != null && strArrY2.length > 0) {
                i5Var.y(D2(strArrY2));
            }
        }
        if (!this.f136284t.isEmpty()) {
            i5Var.F(this.f136284t);
        }
        if (!this.f136285u.isEmpty()) {
            i5Var.N(this.f136285u);
        }
        if (!this.f136286v.isEmpty()) {
            i5Var.A(this.f136286v);
        }
        String str5 = this.f136289y;
        if (str5 != null) {
            i5Var.E(str5);
        }
        String str6 = this.f136287w;
        if (str6 != null) {
            i5Var.M(str6);
        }
        String str7 = this.f136288x;
        if (str7 != null) {
            i5Var.z(str7);
        }
        i5Var.v(this.A);
    }

    public c0 j2() {
        if (Y1()) {
            throw Z1();
        }
        c0 c0Var = new c0();
        c0Var.J(b());
        this.f136286v.add(c0Var);
        b2(false);
        return c0Var;
    }

    public c0 k2() {
        if (Y1()) {
            throw Z1();
        }
        c0 c0Var = new c0();
        c0Var.J(b());
        this.f136284t.add(c0Var);
        b2(false);
        return c0Var;
    }

    protected k0 l2(File file) {
        k0 k0Var = new k0(b());
        k0Var.l2(org.apache.tools.ant.util.b1.class.getName());
        k0Var.q0(file.getAbsolutePath());
        return k0Var;
    }

    public c0 m2() {
        if (Y1()) {
            throw Z1();
        }
        c0 c0Var = new c0();
        c0Var.J(b());
        this.f136285u.add(c0Var);
        b2(false);
        return c0Var;
    }

    public void o2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136279o = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    public void p2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136278n = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    public void q2(boolean z10) {
        this.A = z10;
    }

    public void r2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136280p = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    public void s2(File file) {
        if (Y1()) {
            throw d2();
        }
        if (file == null) {
            throw new IllegalArgumentException("error file specified as null");
        }
        this.f136273i = true;
        this.f136283s = l2(file);
    }

    public void t2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136288x = str;
    }

    public void u2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136276l = str;
    }

    public void v2(File file) {
        if (Y1()) {
            throw d2();
        }
        if (this.f136277m != null) {
            throw new BuildException("The \"input\" and \"inputstring\" attributes cannot both be specified");
        }
        this.f136271g = true;
        this.f136281q = l2(file);
    }

    public void w2(String str) {
        if (Y1()) {
            throw d2();
        }
        this.f136289y = str;
    }

    public void x2(String str) {
        if (Y1()) {
            throw d2();
        }
        if (this.f136271g) {
            throw new BuildException("The \"input\" and \"inputstring\" attributes cannot both be specified");
        }
        this.f136277m = str;
    }

    public void y2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136274j = z10 ? Boolean.TRUE : Boolean.FALSE;
    }

    public void z2(boolean z10) {
        if (Y1()) {
            throw d2();
        }
        this.f136290z = z10 ? Boolean.TRUE : Boolean.FALSE;
    }
}
