package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.s0;

/* JADX INFO: compiled from: JavaVersion.java */
/* JADX INFO: loaded from: classes5.dex */
public class v implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f133957b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f133958c = null;

    private void f() throws BuildException {
        String str = this.f133957b;
        if (str != null && this.f133958c != null) {
            throw new BuildException("Only one of atleast or exactly may be set.");
        }
        if (str == null && this.f133958c == null) {
            throw new BuildException("One of atleast or exactly must be set.");
        }
        if (str != null) {
            try {
                new org.apache.tools.ant.util.f0(str);
                return;
            } catch (NumberFormatException unused) {
                throw new BuildException("The 'atleast' attribute is not a Dewey Decimal eg 1.1.0 : " + this.f133957b);
            }
        }
        try {
            new org.apache.tools.ant.util.f0(this.f133958c);
        } catch (NumberFormatException unused2) {
            throw new BuildException("The 'exactly' attribute is not a Dewey Decimal eg 1.1.0 : " + this.f133958c);
        }
    }

    public String a() {
        return this.f133957b;
    }

    public String b() {
        return this.f133958c;
    }

    public void c(String str) {
        this.f133957b = str;
    }

    public void d(String str) {
        this.f133958c = str;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        f();
        org.apache.tools.ant.util.f0 f0VarL = s0.l();
        String str = this.f133957b;
        if (str != null) {
            return f0VarL.f(new org.apache.tools.ant.util.f0(str));
        }
        String str2 = this.f133958c;
        if (str2 != null) {
            return f0VarL.d(new org.apache.tools.ant.util.f0(str2));
        }
        return false;
    }
}
