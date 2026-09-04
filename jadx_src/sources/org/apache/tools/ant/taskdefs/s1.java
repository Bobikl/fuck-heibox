package org.apache.tools.ant.taskdefs;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.ExitStatusException;

/* JADX INFO: compiled from: Exit.java */
/* JADX INFO: loaded from: classes5.dex */
public class s1 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135732k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Object f135733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Object f135734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f135735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Integer f135736o;

    /* JADX INFO: compiled from: Exit.java */
    public static class b extends org.apache.tools.ant.taskdefs.condition.e implements org.apache.tools.ant.taskdefs.condition.d {
        private b() {
        }

        @Override // org.apache.tools.ant.taskdefs.condition.d
        public boolean e() {
            if (a2() == 1) {
                return b2().nextElement().e();
            }
            throw new BuildException("A single nested condition is required.");
        }
    }

    private boolean k2(Object obj) {
        return obj == null || "".equals(obj);
    }

    private boolean l2() {
        return this.f135735n != null;
    }

    private boolean s2() {
        return org.apache.tools.ant.p2.u(b()).W(this.f135733l);
    }

    private boolean t2() {
        boolean zL2 = l2();
        if ((!zL2 || this.f135733l == null) && this.f135734m == null) {
            return zL2 && this.f135735n.e();
        }
        throw new BuildException("Nested conditions not permitted in conjunction with if/unless attributes");
    }

    private boolean u2() {
        return org.apache.tools.ant.p2.u(b()).X(this.f135734m);
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        boolean zT2;
        String str;
        if (l2()) {
            zT2 = t2();
        } else {
            zT2 = s2() && u2();
        }
        if (zT2) {
            String strTrim = null;
            String str2 = this.f135732k;
            if (str2 == null || str2.trim().isEmpty()) {
                if (!k2(this.f135733l) && s2()) {
                    strTrim = "if=" + this.f135733l;
                }
                if (!k2(this.f135734m) && u2()) {
                    if (strTrim == null) {
                        str = "";
                    } else {
                        str = strTrim + " and ";
                    }
                    strTrim = str + "unless=" + this.f135734m;
                }
                if (l2()) {
                    strTrim = "condition satisfied";
                } else if (strTrim == null) {
                    strTrim = "No message";
                }
            } else {
                strTrim = this.f135732k.trim();
            }
            x1("failing due to " + strTrim, 4);
            if (this.f135736o != null) {
                throw new ExitStatusException(strTrim, this.f135736o.intValue());
            }
        }
    }

    public void i2(String str) {
        if (this.f135732k == null) {
            this.f135732k = "";
        }
        this.f135732k += b().V0(str);
    }

    public org.apache.tools.ant.taskdefs.condition.e j2() {
        if (this.f135735n != null) {
            throw new BuildException("Only one nested condition is allowed.");
        }
        b bVar = new b();
        this.f135735n = bVar;
        return bVar;
    }

    public void m2(Object obj) {
        this.f135733l = obj;
    }

    public void n2(String str) {
        m2(str);
    }

    public void o2(String str) {
        this.f135732k = str;
    }

    public void p2(int i10) {
        this.f135736o = Integer.valueOf(i10);
    }

    public void q2(Object obj) {
        this.f135734m = obj;
    }

    public void r2(String str) {
        q2(str);
    }
}
