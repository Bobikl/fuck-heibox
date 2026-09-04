package org.apache.tools.ant.types.resources.selectors;

import org.apache.tools.ant.types.s1;

/* JADX INFO: compiled from: Size.java */
/* JADX INFO: loaded from: classes5.dex */
public class p implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f136451b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.apache.tools.ant.types.q f136452c = org.apache.tools.ant.types.q.f136292d;

    @Override // org.apache.tools.ant.types.resources.selectors.n
    public boolean a(s1 s1Var) {
        long jN2 = s1Var.n2() - this.f136451b;
        return this.f136452c.h(jN2 == 0 ? 0 : (int) (jN2 / Math.abs(jN2)));
    }

    public long b() {
        return this.f136451b;
    }

    public org.apache.tools.ant.types.q c() {
        return this.f136452c;
    }

    public void d(long j10) {
        this.f136451b = j10;
    }

    public void e(org.apache.tools.ant.types.q qVar) {
        this.f136452c = qVar;
    }
}
