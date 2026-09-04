package org.apache.tools.ant.types.resources;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: SizeLimitCollection.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j1 extends r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f136378l = "size-limited collection count should be set to an int >= 0";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f136379k = 1;

    public synchronized int getCount() {
        return this.f136379k;
    }

    protected int o2() {
        int count = getCount();
        if (count >= 0) {
            return count;
        }
        throw new BuildException(f136378l);
    }

    public synchronized void p2(int i10) {
        B1();
        this.f136379k = i10;
    }

    @Override // org.apache.tools.ant.types.resources.c, org.apache.tools.ant.types.u1
    public synchronized int size() {
        return Math.min(h2().size(), o2());
    }
}
