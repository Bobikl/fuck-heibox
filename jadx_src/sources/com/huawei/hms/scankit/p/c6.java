package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Patch.java */
/* JADX INFO: loaded from: classes7.dex */
public class c6 implements Comparable<c6> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i2 f61633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61634b;

    public c6(i2 i2Var, int i10) {
        this.f61633a = i2Var;
        this.f61634b = i10;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c6 c6Var) {
        return Float.compare((-c6Var.f61633a.g()) + c6Var.f61633a.h(), (-this.f61633a.g()) + this.f61633a.h());
    }
}
