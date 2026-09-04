package org.apache.tools.ant.taskdefs.optional.testing;

import org.apache.tools.ant.taskdefs.p7;

/* JADX INFO: compiled from: BlockFor.java */
/* JADX INFO: loaded from: classes5.dex */
public class a extends p7 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f135369t;

    public a() {
        super("blockfor");
        this.f135369t = c2() + " timed out";
    }

    public a(String str) {
        super(str);
    }

    @Override // org.apache.tools.ant.taskdefs.p7
    protected void i2() throws BuildTimeoutException {
        super.i2();
        throw new BuildTimeoutException(this.f135369t, w1());
    }

    public void o2(String str) {
        this.f135369t = b().V0(str);
    }
}
