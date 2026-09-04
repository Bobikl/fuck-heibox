package org.apache.tools.ant.taskdefs;

import java.io.File;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: TempFile.java */
/* JADX INFO: loaded from: classes5.dex */
public class y6 extends org.apache.tools.ant.u2 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f135992q = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f135993k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f135995m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f135997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f135998p;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private File f135994l = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f135996n = "";

    @Override // org.apache.tools.ant.u2
    public void D1() throws BuildException {
        String str = this.f135993k;
        if (str == null || str.isEmpty()) {
            throw new BuildException("no property specified");
        }
        if (this.f135994l == null) {
            this.f135994l = b().W0(".");
        }
        b().n1(this.f135993k, f135992q.G(b(), this.f135995m, this.f135996n, this.f135994l, this.f135997o, this.f135998p).toString());
    }

    public boolean i2() {
        return this.f135998p;
    }

    public boolean j2() {
        return this.f135997o;
    }

    public void k2(boolean z10) {
        this.f135998p = z10;
    }

    public void l2(boolean z10) {
        this.f135997o = z10;
    }

    public void m2(File file) {
        this.f135994l = file;
    }

    public void n2(String str) {
        this.f135995m = str;
    }

    public void o2(String str) {
        this.f135993k = str;
    }

    public void p2(String str) {
        this.f135996n = str;
    }
}
