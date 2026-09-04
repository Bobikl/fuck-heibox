package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public enum jb {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int f670a;

    jb(int i10) {
        this.f670a = i10;
    }

    public static jb a(int i10) {
        if (i10 == 0) {
            return RegIdExpired;
        }
        if (i10 == 1) {
            return PackageUnregistered;
        }
        if (i10 != 2) {
            return null;
        }
        return Init;
    }

    public int a() {
        return this.f670a;
    }
}
