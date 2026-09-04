package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Mode.java */
/* JADX INFO: loaded from: classes7.dex */
public enum u4 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f62419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62420b;

    u4(int[] iArr, int i10) {
        this.f62419a = iArr;
        this.f62420b = i10;
    }

    public static u4 a(int i10) throws Exception {
        if (i10 == 0) {
            return TERMINATOR;
        }
        if (i10 == 1) {
            return NUMERIC;
        }
        if (i10 == 2) {
            return ALPHANUMERIC;
        }
        if (i10 == 3) {
            return STRUCTURED_APPEND;
        }
        if (i10 == 4) {
            return BYTE;
        }
        if (i10 == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i10 == 7) {
            return ECI;
        }
        if (i10 == 8) {
            return KANJI;
        }
        if (i10 == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i10 == 13) {
            return HANZI;
        }
        try {
            throw new IllegalArgumentException();
        } catch (Exception e10) {
            throw e10;
        }
    }

    public int a() {
        return this.f62420b;
    }

    public int a(b8 b8Var) {
        char c10;
        int iF = b8Var.f();
        if (iF <= 9) {
            c10 = 0;
        } else {
            c10 = iF <= 26 ? (char) 1 : (char) 2;
        }
        return this.f62419a[c10];
    }
}
