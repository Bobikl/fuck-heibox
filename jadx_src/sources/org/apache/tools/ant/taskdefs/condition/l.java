package org.apache.tools.ant.taskdefs.condition;

import org.apache.tools.ant.taskdefs.n1;

/* JADX INFO: compiled from: IsFailure.java */
/* JADX INFO: loaded from: classes5.dex */
public class l implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f133916b;

    public int a() {
        return this.f133916b;
    }

    public void b(int i10) {
        this.f133916b = i10;
    }

    @Override // org.apache.tools.ant.taskdefs.condition.d
    public boolean e() {
        return n1.o(this.f133916b);
    }
}
