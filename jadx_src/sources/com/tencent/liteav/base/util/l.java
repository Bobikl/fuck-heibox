package com.tencent.liteav.base.util;

/* JADX INFO: loaded from: classes4.dex */
public enum l {
    NORMAL(0),
    ROTATION_90(90),
    ROTATION_180(180),
    ROTATION_270(270);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final l[] f99715e = values();
    public final int mValue;

    l(int i10) {
        this.mValue = i10;
    }

    public static int a(l lVar) {
        return lVar != null ? lVar.mValue : NORMAL.mValue;
    }

    public static l a(int i10) {
        for (l lVar : f99715e) {
            if (lVar.mValue == i10) {
                return lVar;
            }
        }
        return NORMAL;
    }

    public static boolean b(int i10) {
        return i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270;
    }
}
