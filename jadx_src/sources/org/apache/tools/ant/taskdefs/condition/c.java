package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.j1;
import org.apache.tools.ant.u2;

/* JADX INFO: compiled from: AntVersion.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends u2 implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f133875k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f133876l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f133877m = null;

    private org.apache.tools.ant.util.f0 l2() {
        Project project = new Project();
        project.F0();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        for (char c10 : project.u0(j1.f133478b).toCharArray()) {
            if (Character.isDigit(c10)) {
                sb2.append(c10);
                z10 = true;
            }
            if (c10 == '.' && z10) {
                sb2.append(c10);
            }
            if (Character.isLetter(c10) && z10) {
                break;
            }
        }
        return new org.apache.tools.ant.util.f0(sb2.toString());
    }

    private void p2() throws BuildException {
        String str = this.f133875k;
        if (str != null && this.f133876l != null) {
            throw new BuildException("Only one of atleast or exactly may be set.");
        }
        if (str == null && this.f133876l == null) {
            throw new BuildException("One of atleast or exactly must be set.");
        }
        if (str != null) {
            try {
                new org.apache.tools.ant.util.f0(str);
            } catch (NumberFormatException unused) {
                throw new BuildException("The 'atleast' attribute is not a Dewey Decimal eg 1.1.0 : %s", this.f133875k);
            }
        } else {
            try {
                new org.apache.tools.ant.util.f0(this.f133876l);
            } catch (NumberFormatException unused2) {
                throw new BuildException("The 'exactly' attribute is not a Dewey Decimal eg 1.1.0 : %s", this.f133876l);
            }
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        if (this.f133877m == null) {
            throw new BuildException("'property' must be set.");
        }
        if (this.f133875k == null && this.f133876l == null) {
            b().n1(this.f133877m, l2().toString());
        } else if (e()) {
            b().n1(this.f133877m, l2().toString());
        }
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() throws BuildException {
        p2();
        org.apache.tools.ant.util.f0 f0VarL2 = l2();
        String str = this.f133875k;
        if (str != null) {
            return f0VarL2.f(new org.apache.tools.ant.util.f0(str));
        }
        String str2 = this.f133876l;
        if (str2 != null) {
            return f0VarL2.d(new org.apache.tools.ant.util.f0(str2));
        }
        return false;
    }

    public String i2() {
        return this.f133875k;
    }

    public String j2() {
        return this.f133876l;
    }

    public String k2() {
        return this.f133877m;
    }

    public void m2(String str) {
        this.f133875k = str;
    }

    public void n2(String str) {
        this.f133876l = str;
    }

    public void o2(String str) {
        this.f133877m = str;
    }
}
