package org.apache.tools.ant.taskdefs;

import java.io.IOException;

/* JADX INFO: compiled from: LogOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class r3 extends org.apache.tools.ant.util.x0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.apache.tools.ant.b2 f135663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f135664h;

    public r3(org.apache.tools.ant.b2 b2Var) {
        this.f135664h = 2;
        this.f135663g = b2Var;
    }

    public r3(org.apache.tools.ant.b2 b2Var, int i10) {
        this(b2Var);
        this.f135664h = i10;
    }

    public r3(org.apache.tools.ant.u2 u2Var, int i10) {
        this((org.apache.tools.ant.b2) u2Var, i10);
    }

    @Override // org.apache.tools.ant.util.x0
    protected void a() {
        try {
            super.a();
        } catch (IOException e10) {
            throw new RuntimeException("Impossible IOException caught: " + e10);
        }
    }

    @Override // org.apache.tools.ant.util.x0
    protected void b(String str) {
        e(str, this.f135664h);
    }

    public int d() {
        return this.f135664h;
    }

    protected void e(String str, int i10) {
        this.f135663g.x1(str, i10);
    }
}
