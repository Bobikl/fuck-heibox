package org.apache.tools.ant.taskdefs.optional.ccm;

import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.taskdefs.n1;
import org.apache.tools.ant.taskdefs.q1;
import org.apache.tools.ant.taskdefs.s3;
import org.apache.tools.ant.types.o;
import org.apache.tools.ant.u2;
import org.apache.tools.ant.util.j0;

/* JADX INFO: compiled from: Continuus.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g extends u2 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f134707m = "ccm";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f134708n = "create_task";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f134709o = "co";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f134710p = "ci";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f134711q = "reconfigure";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f134712r = "default_task";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f134713k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f134714l = "";

    public String i2() {
        return this.f134714l;
    }

    protected final String j2() {
        String str = this.f134713k;
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str + "/";
        }
        return str + f134707m;
    }

    protected int k2(o oVar) {
        return l2(oVar, new s3((u2) this, 3, 1));
    }

    protected int l2(o oVar, q1 q1Var) {
        try {
            n1 n1Var = new n1(q1Var);
            n1Var.w(b());
            n1Var.E(b().Z());
            n1Var.x(oVar.s());
            return n1Var.e();
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    public void m2(String str) {
        this.f134714l = str;
    }

    public final void n2(String str) {
        this.f134713k = j0.s0(str);
    }
}
