package org.apache.tools.ant.taskdefs;

import com.tencent.open.SocialConstants;
import com.tencent.qcloud.core.util.IOUtils;
import java.net.URL;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: WhichResource.java */
/* JADX INFO: loaded from: classes5.dex */
public class r7 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private org.apache.tools.ant.types.o0 f135686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135689n;

    private void o2() {
        int i10 = this.f135687l != null ? 1 : 0;
        if (this.f135688m != null) {
            i10++;
        }
        if (i10 == 0) {
            throw new BuildException("One of classname or resource must be specified");
        }
        if (i10 > 1) {
            throw new BuildException("Only one of classname or resource can be specified");
        }
        if (this.f135689n == null) {
            throw new BuildException(v3.f135886r);
        }
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        o2();
        org.apache.tools.ant.types.o0 o0Var = this.f135686k;
        if (o0Var != null) {
            this.f135686k = o0Var.s2(z0.b.f136024i);
            b().M0("using user supplied classpath: " + this.f135686k, 4);
        } else {
            org.apache.tools.ant.types.o0 o0Var2 = new org.apache.tools.ant.types.o0(b());
            this.f135686k = o0Var2;
            this.f135686k = o0Var2.s2(SocialConstants.PARAM_ONLY);
            b().M0("using system classpath: " + this.f135686k, 4);
        }
        org.apache.tools.ant.g gVarF0 = org.apache.tools.ant.g.f0(b().f0(), b(), this.f135686k, false);
        try {
            if (this.f135687l != null) {
                this.f135688m = this.f135687l.replace(lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX) + ".class";
            }
            String str = this.f135688m;
            if (str == null) {
                throw new BuildException("One of class or resource is required");
            }
            if (str.startsWith("/")) {
                this.f135688m = this.f135688m.substring(1);
            }
            x1("Searching for " + this.f135688m, 3);
            URL resource = gVarF0.getResource(this.f135688m);
            if (resource != null) {
                b().n1(this.f135689n, resource.toExternalForm());
            }
            gVarF0.close();
        } catch (Throwable th2) {
            if (gVarF0 != null) {
                try {
                    gVarF0.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public org.apache.tools.ant.types.o0 i2() {
        if (this.f135686k == null) {
            this.f135686k = new org.apache.tools.ant.types.o0(b());
        }
        return this.f135686k.u2();
    }

    public void j2(String str) {
        this.f135687l = str;
    }

    public void k2(org.apache.tools.ant.types.o0 o0Var) {
        org.apache.tools.ant.types.o0 o0Var2 = this.f135686k;
        if (o0Var2 == null) {
            this.f135686k = o0Var;
        } else {
            o0Var2.n2(o0Var);
        }
    }

    public void l2(org.apache.tools.ant.types.q1 q1Var) {
        i2().c2(q1Var);
    }

    public void m2(String str) {
        this.f135689n = str;
    }

    public void n2(String str) {
        this.f135688m = str;
    }
}
