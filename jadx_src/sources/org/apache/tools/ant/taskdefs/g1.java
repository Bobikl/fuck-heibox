package org.apache.tools.ant.taskdefs;

import java.io.File;
import java.io.IOException;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.util.ResourceUtils;

/* JADX INFO: compiled from: Echo.java */
/* JADX INFO: loaded from: classes5.dex */
public class g1 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected String f134156k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected File f134157l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected boolean f134158m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f134159n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f134160o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f134161p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private org.apache.tools.ant.types.s1 f134162q;

    /* JADX INFO: compiled from: Echo.java */
    public static class a extends org.apache.tools.ant.types.j0 {
    }

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        try {
            org.apache.tools.ant.types.resources.l1 l1Var = new org.apache.tools.ant.types.resources.l1(this.f134156k.isEmpty() ? System.lineSeparator() : this.f134156k);
            org.apache.tools.ant.types.s1 p0Var = this.f134162q;
            if (p0Var == null) {
                p0Var = new org.apache.tools.ant.types.resources.p0(this, this.f134161p);
            }
            ResourceUtils.m(l1Var, p0Var, null, null, false, false, this.f134158m, null, this.f134159n.isEmpty() ? null : this.f134159n, b(), this.f134160o);
        } catch (IOException e10) {
            throw new BuildException(e10, w1());
        }
    }

    public void i2(String str) {
        this.f134156k += b().V0(str);
    }

    public void j2(boolean z10) {
        this.f134158m = z10;
    }

    public void k2(String str) {
        this.f134159n = str;
    }

    public void l2(File file) {
        p2(new org.apache.tools.ant.types.resources.z(b(), file));
    }

    public void m2(boolean z10) {
        this.f134160o = z10;
    }

    public void n2(a aVar) {
        this.f134161p = aVar.h();
    }

    public void o2(String str) {
        if (str == null) {
            str = "";
        }
        this.f134156k = str;
    }

    public void p2(org.apache.tools.ant.types.s1 s1Var) {
        if (this.f134162q != null) {
            throw new BuildException("Cannot set > 1 output target");
        }
        this.f134162q = s1Var;
        org.apache.tools.ant.types.resources.y yVar = (org.apache.tools.ant.types.resources.y) s1Var.e2(org.apache.tools.ant.types.resources.y.class);
        this.f134157l = yVar != null ? yVar.l0() : null;
    }
}
