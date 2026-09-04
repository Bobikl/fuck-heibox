package org.apache.tools.ant.taskdefs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.RuntimeConfigurable;

/* JADX INFO: compiled from: MacroInstance.java */
/* JADX INFO: loaded from: classes5.dex */
public class u3 extends org.apache.tools.ant.u2 implements org.apache.tools.ant.w0, org.apache.tools.ant.x2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f135812s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f135813t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f135814u = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t3 f135815k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, org.apache.tools.ant.z2> f135818n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<String, String> f135819o;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f135816l = new HashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, t3.d> f135817m = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f135820p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f135821q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<org.apache.tools.ant.u2> f135822r = new ArrayList();

    /* JADX INFO: compiled from: MacroInstance.java */
    public static class a implements org.apache.tools.ant.x2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<org.apache.tools.ant.u2> f135823b = new ArrayList();

        public List<org.apache.tools.ant.u2> a() {
            return this.f135823b;
        }

        @Override // org.apache.tools.ant.x2
        public void c1(org.apache.tools.ant.u2 u2Var) {
            this.f135823b.add(u2Var);
        }
    }

    private org.apache.tools.ant.z2 j2(org.apache.tools.ant.z2 z2Var, boolean z10) {
        org.apache.tools.ant.z2 z2Var2 = new org.apache.tools.ant.z2(z2Var.s2());
        z2Var2.y2(z2Var.o2());
        z2Var2.J(b());
        z2Var2.z2(z2Var.q2());
        z2Var2.h2(z2Var.L1());
        z2Var2.g2(z2Var.K1());
        z2Var2.A1(this.f135815k.s2() ? z2Var.w1() : w1());
        if (G1() == null) {
            org.apache.tools.ant.t2 t2Var = new org.apache.tools.ant.t2();
            t2Var.A(b());
            z2Var2.e2(t2Var);
        } else {
            z2Var2.e2(G1());
        }
        RuntimeConfigurable runtimeConfigurable = new RuntimeConfigurable(z2Var2, z2Var.K1());
        runtimeConfigurable.z(z2Var.N1().l());
        for (Map.Entry<String, Object> entry : z2Var.N1().f().entrySet()) {
            runtimeConfigurable.v(entry.getKey(), m2((String) entry.getValue(), this.f135819o));
        }
        runtimeConfigurable.b(m2(z2Var.N1().n().toString(), this.f135819o));
        Iterator it = Collections.list(z2Var.N1().i()).iterator();
        while (it.hasNext()) {
            org.apache.tools.ant.z2 z2Var3 = (org.apache.tools.ant.z2) ((RuntimeConfigurable) it.next()).m();
            String strL1 = z2Var3.L1();
            if (strL1 != null) {
                strL1 = strL1.toLowerCase(Locale.ENGLISH);
            }
            t3.d dVar = l2().get(strL1);
            if (dVar == null || z10) {
                org.apache.tools.ant.z2 z2VarJ2 = j2(z2Var3, z10);
                runtimeConfigurable.a(z2VarJ2.N1());
                z2Var2.i2(z2VarJ2);
            } else if (!dVar.c()) {
                org.apache.tools.ant.z2 z2Var4 = this.f135818n.get(strL1);
                if (z2Var4 != null) {
                    String string = z2Var4.N1().n().toString();
                    if (!string.isEmpty()) {
                        runtimeConfigurable.b(m2(string, this.f135819o));
                    }
                    List<org.apache.tools.ant.z2> listM2 = z2Var4.m2();
                    if (listM2 != null) {
                        Iterator<org.apache.tools.ant.z2> it2 = listM2.iterator();
                        while (it2.hasNext()) {
                            org.apache.tools.ant.z2 z2VarJ3 = j2(it2.next(), true);
                            runtimeConfigurable.a(z2VarJ3.N1());
                            z2Var2.i2(z2VarJ3);
                        }
                    }
                } else if (!dVar.d()) {
                    throw new BuildException("Required nested element %s missing", dVar.b());
                }
            } else {
                if (this.f135822r.isEmpty() && !dVar.d()) {
                    throw new BuildException("Missing nested elements for implicit element %s", dVar.b());
                }
                Iterator<org.apache.tools.ant.u2> it3 = this.f135822r.iterator();
                while (it3.hasNext()) {
                    org.apache.tools.ant.z2 z2VarJ4 = j2((org.apache.tools.ant.z2) it3.next(), true);
                    runtimeConfigurable.a(z2VarJ4.N1());
                    z2Var2.i2(z2VarJ4);
                }
            }
        }
        return z2Var2;
    }

    private Map<String, t3.d> l2() {
        if (this.f135817m == null) {
            this.f135817m = new HashMap();
            for (Map.Entry<String, t3.d> entry : this.f135815k.t2().entrySet()) {
                this.f135817m.put(entry.getKey(), entry.getValue());
                t3.d value = entry.getValue();
                if (value.c()) {
                    this.f135821q = value.b();
                }
            }
        }
        return this.f135817m;
    }

    private String m2(String str, Map<String, String> map) {
        if (str == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = null;
        char c10 = 0;
        for (char c11 : str.toCharArray()) {
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 == 2) {
                        if (c11 == '}') {
                            String lowerCase = sb3.toString().toLowerCase(Locale.ENGLISH);
                            String str2 = map.get(lowerCase);
                            if (str2 == null) {
                                sb2.append("@{");
                                sb2.append(lowerCase);
                                sb2.append(z5.g.f141884d);
                            } else {
                                sb2.append(str2);
                            }
                            sb3 = null;
                            c10 = 0;
                        } else {
                            sb3.append(c11);
                        }
                    }
                } else if (c11 == '{') {
                    sb3 = new StringBuilder();
                    c10 = 2;
                } else {
                    if (c11 == '@') {
                        sb2.append('@');
                    } else {
                        sb2.append('@');
                        sb2.append(c11);
                    }
                    c10 = 0;
                }
            } else if (c11 == '@') {
                c10 = 1;
            } else {
                sb2.append(c11);
            }
        }
        if (c10 == 1) {
            sb2.append('@');
        } else if (c10 == 2) {
            sb2.append("@{");
            sb2.append(sb3.toString());
        }
        return sb2.toString();
    }

    private void n2() {
        if (this.f135821q != null) {
            return;
        }
        Iterator<org.apache.tools.ant.u2> it = this.f135822r.iterator();
        while (it.hasNext()) {
            org.apache.tools.ant.z2 z2Var = (org.apache.tools.ant.z2) it.next();
            String lowerCase = org.apache.tools.ant.e2.j(z2Var.s2()).toLowerCase(Locale.ENGLISH);
            if (l2().get(lowerCase) == null) {
                throw new BuildException("unsupported element %s", lowerCase);
            }
            if (this.f135818n.get(lowerCase) != null) {
                throw new BuildException("Element %s already present", lowerCase);
            }
            this.f135818n.put(lowerCase, z2Var);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() {
        this.f135818n = new HashMap();
        l2();
        n2();
        this.f135819o = new Hashtable();
        HashSet hashSet = new HashSet(this.f135816l.keySet());
        for (t3.a aVar : this.f135815k.r2()) {
            String strM2 = this.f135816l.get(aVar.c());
            if (strM2 == null && "description".equals(aVar.c())) {
                strM2 = u1();
            }
            if (strM2 == null) {
                strM2 = m2(aVar.a(), this.f135819o);
            }
            if (strM2 == null) {
                throw new BuildException("required attribute %s not set", aVar.c());
            }
            this.f135819o.put(aVar.c(), strM2);
            hashSet.remove(aVar.c());
        }
        hashSet.remove("id");
        if (this.f135815k.v2() != null) {
            if (this.f135820p == null) {
                String strA = this.f135815k.v2().a();
                if (!this.f135815k.v2().d() && strA == null) {
                    throw new BuildException("required text missing");
                }
                if (strA == null) {
                    strA = "";
                }
                this.f135820p = strA;
            }
            if (this.f135815k.v2().e()) {
                this.f135820p = this.f135820p.trim();
            }
            this.f135819o.put(this.f135815k.v2().c(), this.f135820p);
        } else {
            String str = this.f135820p;
            if (str != null && !str.trim().isEmpty()) {
                throw new BuildException("The \"%s\" macro does not support nested text data.", K1());
            }
        }
        if (!hashSet.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown attribute");
            sb2.append(hashSet.size() > 1 ? "s " : " ");
            sb2.append(hashSet);
            throw new BuildException(sb2.toString());
        }
        org.apache.tools.ant.z2 z2VarJ2 = j2(this.f135815k.u2(), false);
        z2VarJ2.V1();
        org.apache.tools.ant.property.b bVarJ = org.apache.tools.ant.property.b.j(b());
        bVarJ.h();
        try {
            try {
                z2VarJ2.b2();
                this.f135818n = null;
                this.f135819o = null;
                bVarJ.i();
            } catch (BuildException e10) {
                if (this.f135815k.s2()) {
                    throw org.apache.tools.ant.e2.c(e10, w1());
                }
                e10.c(w1());
                throw e10;
            }
        } catch (Throwable th2) {
            this.f135818n = null;
            this.f135819o = null;
            bVarJ.i();
            throw th2;
        }
    }

    @Deprecated
    public Object J0(String str) throws BuildException {
        throw new BuildException("Not implemented any more");
    }

    @Override // org.apache.tools.ant.x2
    public void c1(org.apache.tools.ant.u2 u2Var) {
        this.f135822r.add(u2Var);
    }

    public void i2(String str) {
        this.f135820p = str;
    }

    public t3 k2() {
        return this.f135815k;
    }

    public void o2(t3 t3Var) {
        this.f135815k = t3Var;
    }

    @Override // org.apache.tools.ant.w0
    public void r0(String str, String str2) {
        this.f135816l.put(str.toLowerCase(Locale.ENGLISH), str2);
    }
}
