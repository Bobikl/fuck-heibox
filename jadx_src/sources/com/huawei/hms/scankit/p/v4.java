package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Mode.java */
/* JADX INFO: loaded from: classes7.dex */
public enum v4 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HEXADECIMAL(new int[]{8, 10, 12}, 10),
    HEXABYTE(new int[]{8, 10, 12}, 11),
    HANZI(new int[]{8, 10, 12}, 13);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f62460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62461b;

    v4(int[] iArr, int i10) {
        this.f62460a = iArr;
        this.f62461b = i10;
    }

    public static v4 a(int i10) {
        switch (i10) {
            case 0:
                return TERMINATOR;
            case 1:
                return NUMERIC;
            case 2:
                return ALPHANUMERIC;
            case 3:
                return STRUCTURED_APPEND;
            case 4:
                return BYTE;
            case 5:
                return FNC1_FIRST_POSITION;
            case 6:
            case 12:
            default:
                throw new IllegalArgumentException();
            case 7:
                return ECI;
            case 8:
                return KANJI;
            case 9:
                return FNC1_SECOND_POSITION;
            case 10:
                return HEXADECIMAL;
            case 11:
                return HEXABYTE;
            case 13:
                return HANZI;
        }
    }

    public int a(a8 a8Var) {
        char c10;
        int iM = a8Var.m();
        if (iM <= 9) {
            c10 = 0;
        } else {
            c10 = iM <= 26 ? (char) 1 : (char) 2;
        }
        return this.f62460a[c10];
    }
}
