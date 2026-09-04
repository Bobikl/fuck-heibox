package org.apache.tools.ant.types.resources;

/* JADX INFO: compiled from: MappedResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class q0 extends y0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final org.apache.tools.ant.util.g0 f136412q;

    public q0(org.apache.tools.ant.types.s1 s1Var, org.apache.tools.ant.util.g0 g0Var) {
        super(s1Var);
        this.f136412q = g0Var;
    }

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public void c2(org.apache.tools.ant.types.q1 q1Var) {
        if (this.f136412q != null) {
            throw Z1();
        }
        super.c2(q1Var);
    }

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1
    public <T> T e2(Class<T> cls) {
        if (y.class.isAssignableFrom(cls)) {
            return null;
        }
        return (T) x2().e2(cls);
    }

    @Override // org.apache.tools.ant.types.s1
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        String strK2 = k2();
        String strK3 = q0Var.k2();
        if (strK2 == null) {
            if (strK3 != null) {
                return false;
            }
        } else if (!strK2.equals(strK3)) {
            return false;
        }
        return x2().equals(q0Var.x2());
    }

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1
    public int hashCode() {
        String strK2 = k2();
        return strK2 == null ? super.hashCode() : strK2.hashCode();
    }

    @Override // org.apache.tools.ant.types.resources.y0, org.apache.tools.ant.types.s1
    public String k2() {
        String strK2 = x2().k2();
        if (Y1()) {
            return strK2;
        }
        String[] strArrY0 = this.f136412q.y0(strK2);
        if (strArrY0 == null || strArrY0.length <= 0) {
            return null;
        }
        return strArrY0[0];
    }

    @Override // org.apache.tools.ant.types.s1, org.apache.tools.ant.types.s
    public String toString() {
        return Y1() ? m2().toString() : k2();
    }
}
