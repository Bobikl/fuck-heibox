package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public enum iu {
    INT(1),
    LONG(2),
    STRING(3),
    BOOLEAN(4);


    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int f611a;

    iu(int i10) {
        this.f611a = i10;
    }

    public static iu a(int i10) {
        if (i10 == 1) {
            return INT;
        }
        if (i10 == 2) {
            return LONG;
        }
        if (i10 == 3) {
            return STRING;
        }
        if (i10 != 4) {
            return null;
        }
        return BOOLEAN;
    }
}
