package com.igexin.push.c;

/* JADX INFO: loaded from: classes.dex */
public enum d {
    NORMAL(0),
    BACKUP(1),
    TRY_NORMAL(2);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63355d;

    d(int i10) {
        this.f63355d = i10;
    }

    public static d a(int i10) {
        for (d dVar : values()) {
            if (dVar.b() == i10) {
                return dVar;
            }
        }
        return null;
    }

    public int b() {
        return this.f63355d;
    }
}
