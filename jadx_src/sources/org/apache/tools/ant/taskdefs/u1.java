package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: Filter.java */
/* JADX INFO: loaded from: classes5.dex */
public class u1 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f135809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private File f135810m;

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        File file = this.f135810m;
        boolean z10 = file != null && this.f135808k == null && this.f135809l == null;
        boolean z11 = (file != null || this.f135808k == null || this.f135809l == null) ? false : true;
        if (!z10 && !z11) {
            throw new BuildException("both token and value parameters, or only a filtersFile parameter is required", w1());
        }
        if (z11) {
            b().n0().j2(this.f135808k, this.f135809l);
        }
        if (z10) {
            i2();
        }
    }

    protected void i2() throws BuildException {
        x1("Reading filters from " + this.f135810m, 3);
        b().n0().y2(this.f135810m);
    }

    public void j2(File file) {
        this.f135810m = file;
    }

    public void k2(String str) {
        this.f135808k = str;
    }

    public void l2(String str) {
        this.f135809l = str;
    }
}
