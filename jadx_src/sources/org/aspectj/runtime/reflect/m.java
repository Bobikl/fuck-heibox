package org.aspectj.runtime.reflect;

import zj.z;

/* JADX INFO: compiled from: SourceLocationImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class m implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Class f137762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f137763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f137764c;

    m(Class cls, String str, int i10) {
        this.f137762a = cls;
        this.f137763b = str;
        this.f137764c = i10;
    }

    @Override // zj.z
    public int a() {
        return this.f137764c;
    }

    @Override // zj.z
    public int b() {
        return -1;
    }

    @Override // zj.z
    public Class c() {
        return this.f137762a;
    }

    @Override // zj.z
    public String getFileName() {
        return this.f137763b;
    }

    public String toString() {
        return getFileName() + ":" + a();
    }
}
