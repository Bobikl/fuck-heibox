package org.apache.tools.ant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.tools.ant.taskdefs.s4;

/* JADX INFO: compiled from: UnknownElement.java */
/* JADX INFO: loaded from: classes5.dex */
public class z2 extends u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f137119k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f137121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f137122n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f137120l = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<z2> f137123o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f137124p = false;

    public z2(String str) {
        this.f137119k = str;
    }

    private boolean u2(String str, i1 i1Var, Object obj, z2 z2Var, RuntimeConfigurable runtimeConfigurable) {
        String strL = e2.l(z2Var.o2(), z2Var.s2());
        if (!i1Var.Q(str, strL, b(), obj)) {
            return false;
        }
        try {
            i1.r rVarU = i1Var.u(b(), str, obj, strL, z2Var);
            rVarU.c(runtimeConfigurable.l());
            Object objA = rVarU.a();
            if (objA instanceof s4.a) {
                Object objB = rVarU.b();
                z2Var.j2(((s4.a) objA).x());
                objA = objB;
            }
            runtimeConfigurable.x(rVarU);
            runtimeConfigurable.A(objA);
            if (objA instanceof u2) {
                u2 u2Var = (u2) objA;
                u2Var.f2(runtimeConfigurable);
                u2Var.g2(strL);
                u2Var.h2(strL);
            }
            if (objA instanceof b2) {
                ((b2) objA).A1(z2Var.w1());
            }
            runtimeConfigurable.q(b());
            z2Var.v2(objA, runtimeConfigurable);
            rVarU.d();
            return true;
        } catch (UnsupportedElementException e10) {
            if (i1Var.I()) {
                return false;
            }
            throw e10;
        }
    }

    public void A2(Object obj) {
        this.f137122n = obj;
    }

    public boolean B2(Object obj) {
        if (obj == null || !getClass().getName().equals(obj.getClass().getName())) {
            return false;
        }
        z2 z2Var = (z2) obj;
        if (!Objects.equals(this.f137119k, z2Var.f137119k) || !this.f137120l.equals(z2Var.f137120l) || !this.f137121m.equals(z2Var.f137121m) || !N1().f().equals(z2Var.N1().f()) || !N1().n().toString().equals(z2Var.N1().n().toString())) {
            return false;
        }
        List<z2> list = this.f137123o;
        int size = list == null ? 0 : list.size();
        if (size == 0) {
            List<z2> list2 = z2Var.f137123o;
            return list2 == null || list2.isEmpty();
        }
        List<z2> list3 = z2Var.f137123o;
        if (list3 == null || size != list3.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f137123o.get(i10).B2(z2Var.f137123o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        Object obj = this.f137122n;
        if (obj == null) {
            return;
        }
        try {
            if (obj instanceof u2) {
                ((u2) obj).D1();
            }
        } finally {
            if (N1().k() == null) {
                this.f137122n = null;
                N1().A(null);
            }
        }
    }

    @Override // org.apache.tools.ant.u2
    public String K1() {
        Object obj = this.f137122n;
        return !(obj instanceof u2) ? super.K1() : ((u2) obj).K1();
    }

    @Override // org.apache.tools.ant.u2
    public RuntimeConfigurable N1() {
        return super.N1();
    }

    @Override // org.apache.tools.ant.u2
    protected void O1(String str) {
        Object obj = this.f137122n;
        if (obj instanceof u2) {
            ((u2) obj).O1(str);
        } else {
            super.O1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    protected void Q1(String str) {
        Object obj = this.f137122n;
        if (obj instanceof u2) {
            ((u2) obj).Q1(str);
        } else {
            super.Q1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    protected void R1(String str) {
        Object obj = this.f137122n;
        if (obj instanceof u2) {
            ((u2) obj).R1(str);
        } else {
            super.R1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    protected int S1(byte[] bArr, int i10, int i11) throws IOException {
        Object obj = this.f137122n;
        return obj instanceof u2 ? ((u2) obj).S1(bArr, i10, i11) : super.S1(bArr, i10, i11);
    }

    @Override // org.apache.tools.ant.u2
    protected void U1(String str) {
        Object obj = this.f137122n;
        if (obj instanceof u2) {
            ((u2) obj).U1(str);
        } else {
            super.U1(str);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void a2() throws BuildException {
        if (this.f137122n != null) {
            return;
        }
        k2(w2(this, N1()));
    }

    public void i2(z2 z2Var) {
        if (this.f137123o == null) {
            this.f137123o = new ArrayList();
        }
        this.f137123o.add(z2Var);
    }

    public void j2(z2 z2Var) {
        if (this.f137124p) {
            return;
        }
        N1().d(z2Var.N1());
        if (z2Var.f137123o != null) {
            ArrayList arrayList = new ArrayList(z2Var.f137123o);
            List<z2> list = this.f137123o;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f137123o = arrayList;
        }
        this.f137124p = true;
    }

    public void k2(Object obj) {
        if (obj == null) {
            return;
        }
        this.f137122n = obj;
        N1().A(this.f137122n);
        u2 u2Var = null;
        Object obj2 = this.f137122n;
        if (obj2 instanceof u2) {
            u2Var = (u2) obj2;
            u2Var.f2(N1());
            if (N1().k() != null) {
                G1().t(this, (u2) this.f137122n);
            }
        }
        if (u2Var != null) {
            u2Var.a2();
        } else {
            N1().q(b());
        }
        v2(this.f137122n, N1());
    }

    public z2 l2(Project project) {
        z2 z2Var = new z2(s2());
        z2Var.y2(o2());
        z2Var.J(project);
        z2Var.z2(q2());
        z2Var.h2(L1());
        z2Var.g2(K1());
        z2Var.A1(w1());
        if (G1() == null) {
            t2 t2Var = new t2();
            t2Var.A(b());
            z2Var.e2(t2Var);
        } else {
            z2Var.e2(G1());
        }
        RuntimeConfigurable runtimeConfigurable = new RuntimeConfigurable(z2Var, K1());
        runtimeConfigurable.z(N1().l());
        for (Map.Entry<String, Object> entry : N1().f().entrySet()) {
            runtimeConfigurable.v(entry.getKey(), (String) entry.getValue());
        }
        runtimeConfigurable.b(N1().n().toString());
        Iterator it = Collections.list(N1().i()).iterator();
        while (it.hasNext()) {
            z2 z2VarL2 = ((z2) ((RuntimeConfigurable) it.next()).m()).l2(project);
            runtimeConfigurable.a(z2VarL2.N1());
            z2Var.i2(z2VarL2);
        }
        return z2Var;
    }

    public List<z2> m2() {
        return this.f137123o;
    }

    protected String n2() {
        return e2.l(o2(), s2());
    }

    public String o2() {
        return this.f137120l;
    }

    protected BuildException p2(String str, String str2) {
        return new BuildException(u.y(b()).q(str2, str), w1());
    }

    public String q2() {
        return this.f137121m;
    }

    public Object r2() {
        return this.f137122n;
    }

    public String s2() {
        return this.f137119k;
    }

    public u2 t2() {
        Object obj = this.f137122n;
        if (obj instanceof u2) {
            return (u2) obj;
        }
        return null;
    }

    protected void v2(Object obj, RuntimeConfigurable runtimeConfigurable) throws BuildException {
        if (obj instanceof y2) {
            obj = ((y2) obj).R();
        }
        String strO2 = o2();
        i1 i1VarB = i1.B(b(), obj.getClass());
        List<z2> list = this.f137123o;
        if (list != null) {
            int i10 = 0;
            for (z2 z2Var : list) {
                RuntimeConfigurable runtimeConfigurableH = runtimeConfigurable.h(i10);
                try {
                    if ((runtimeConfigurableH.o(z2Var) || !i1VarB.P(strO2, e2.l(z2Var.o2(), z2Var.s2()))) && !u2(strO2, i1VarB, obj, z2Var, runtimeConfigurableH)) {
                        if (obj instanceof x2) {
                            ((x2) obj).c1(z2Var);
                        } else {
                            i1VarB.S(b(), obj, z2Var.s2());
                        }
                    }
                    i10++;
                } catch (UnsupportedElementException e10) {
                    throw new BuildException(runtimeConfigurable.j() + " doesn't support the nested \"" + e10.d() + "\" element.", e10);
                }
            }
        }
    }

    protected Object w2(z2 z2Var, RuntimeConfigurable runtimeConfigurable) {
        if (!runtimeConfigurable.o(z2Var)) {
            return null;
        }
        u uVarY = u.y(b());
        String strN2 = z2Var.n2();
        Object objM = uVarY.m(z2Var, z2Var.o2(), strN2);
        if (objM == null) {
            throw p2("task or type", strN2);
        }
        if (objM instanceof s4.a) {
            s4.a aVar = (s4.a) objM;
            Object objW = aVar.w(z2Var.b());
            if (objW == null) {
                throw p2("preset " + strN2, aVar.x().n2());
            }
            z2Var.j2(aVar.x());
            if (objW instanceof u2) {
                u2 u2Var = (u2) objW;
                u2Var.h2(z2Var.L1());
                u2Var.g2(z2Var.K1());
                u2Var.V1();
            }
            objM = objW;
        }
        if (objM instanceof z2) {
            z2 z2Var2 = (z2) objM;
            objM = z2Var2.w2(z2Var2, runtimeConfigurable);
        }
        if (objM instanceof u2) {
            ((u2) objM).e2(G1());
        }
        if (objM instanceof b2) {
            ((b2) objM).A1(w1());
        }
        return objM;
    }

    protected u2 x2(z2 z2Var, RuntimeConfigurable runtimeConfigurable) {
        u2 u2VarC = b().C(z2Var.s2());
        if (u2VarC != null) {
            u2VarC.A1(w1());
            u2VarC.e2(G1());
            u2VarC.V1();
        }
        return u2VarC;
    }

    public void y2(String str) {
        if (str.equals(e2.f133120d)) {
            str = u.y(b()).z();
        }
        if (str == null) {
            str = "";
        }
        this.f137120l = str;
    }

    public void z2(String str) {
        this.f137121m = str;
    }
}
