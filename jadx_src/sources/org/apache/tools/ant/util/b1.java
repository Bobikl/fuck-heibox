package org.apache.tools.ant.util;

/* JADX INFO: compiled from: MergingMapper.java */
/* JADX INFO: loaded from: classes5.dex */
public class b1 implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String[] f136738b = null;

    public b1() {
    }

    public b1(String str) {
        q0(str);
    }

    @Override // org.apache.tools.ant.util.g0
    public void n0(String str) {
    }

    @Override // org.apache.tools.ant.util.g0
    public void q0(String str) {
        this.f136738b = new String[]{str};
    }

    @Override // org.apache.tools.ant.util.g0
    public String[] y0(String str) {
        return this.f136738b;
    }
}
