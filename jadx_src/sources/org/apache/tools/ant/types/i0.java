package org.apache.tools.ant.types;

/* JADX INFO: compiled from: FlexInteger.java */
/* JADX INFO: loaded from: classes5.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f136177a;

    public i0(String str) {
        this.f136177a = Integer.decode(str);
    }

    public int a() {
        return this.f136177a.intValue();
    }

    public String toString() {
        return this.f136177a.toString();
    }
}
