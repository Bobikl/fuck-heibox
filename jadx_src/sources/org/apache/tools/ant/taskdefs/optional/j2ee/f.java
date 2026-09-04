package org.apache.tools.ant.taskdefs.optional.j2ee;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.v2;

/* JADX INFO: compiled from: WebLogicHotDeploymentTool.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends a implements c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f135170n = 1024;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f135171o = "weblogic.deploy";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f135172p = {c.f135155a, c.f135156b, "list", c.f135158d, "update"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f135173k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135174l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135175m;

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void a() {
        v2 v2Var = new v2(h());
        v2Var.S2(true);
        v2Var.R2(true);
        v2Var.L2(e());
        v2Var.K2(f135171o);
        v2Var.q2().H1(s());
        v2Var.D1();
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.a, org.apache.tools.ant.taskdefs.optional.j2ee.c
    public void b() throws BuildException {
        super.b();
        String strL2 = h().l2();
        if (f() == null) {
            throw new BuildException("The password attribute must be set.");
        }
        if ((strL2.equals(c.f135156b) || strL2.equals("update")) && this.f135174l == null) {
            throw new BuildException("The application attribute must be set if action = %s", strL2);
        }
        if ((strL2.equals(c.f135156b) || strL2.equals("update")) && h().m2() == null) {
            throw new BuildException("The source attribute must be set if action = %s", strL2);
        }
        if ((strL2.equals(c.f135155a) || strL2.equals(c.f135158d)) && this.f135174l == null) {
            throw new BuildException("The application attribute must be set if action = %s", strL2);
        }
    }

    @Override // org.apache.tools.ant.taskdefs.optional.j2ee.a
    protected boolean j() {
        String strL2 = h().l2();
        for (String str : f135172p) {
            if (strL2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    protected StringBuffer o() {
        String str;
        e eVarH = h();
        StringBuffer stringBuffer = new StringBuffer(1024);
        String str2 = "";
        if (g() != null) {
            str = "-url " + g();
        } else {
            str = "";
        }
        stringBuffer.append(str);
        stringBuffer.append(" ");
        stringBuffer.append(this.f135173k ? "-debug " : "");
        if (i() != null) {
            str2 = "-username " + i();
        }
        stringBuffer.append(str2);
        stringBuffer.append(" ");
        stringBuffer.append(eVarH.l2());
        stringBuffer.append(" ");
        stringBuffer.append(f());
        stringBuffer.append(" ");
        return stringBuffer;
    }

    protected String p() {
        StringBuffer stringBufferO = o();
        stringBufferO.append(this.f135174l);
        stringBufferO.append(" ");
        stringBufferO.append(h().m2());
        String string = stringBufferO.toString();
        if (this.f135175m == null) {
            return string;
        }
        return "-component " + this.f135175m + " " + string;
    }

    protected String q() {
        return o().toString();
    }

    protected String r() {
        StringBuffer stringBufferO = o();
        stringBufferO.append(this.f135174l);
        stringBufferO.append(" ");
        return stringBufferO.toString();
    }

    public String s() throws BuildException {
        String strL2 = h().l2();
        if (strL2.equals(c.f135156b) || strL2.equals("update")) {
            return p();
        }
        if (strL2.equals(c.f135155a) || strL2.equals(c.f135158d)) {
            return r();
        }
        if (strL2.equals("list")) {
            return q();
        }
        return null;
    }

    public void t(String str) {
        this.f135174l = str;
    }

    public void u(String str) {
        this.f135175m = str;
    }

    public void v(boolean z10) {
        this.f135173k = z10;
    }
}
