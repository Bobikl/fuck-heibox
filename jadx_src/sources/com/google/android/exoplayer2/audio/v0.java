package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: WavUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44313a = 1380533830;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44314b = 1463899717;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f44315c = 1718449184;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f44316d = 1684108385;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f44317e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f44318f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f44319g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f44320h = 7;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44321i = 17;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44322j = 65534;

    private v0() {
    }

    public static int a(int i10, int i11) {
        if (i10 != 1) {
            if (i10 == 3) {
                return i11 == 32 ? 4 : 0;
            }
            if (i10 != 65534) {
                return 0;
            }
        }
        return com.google.android.exoplayer2.util.u0.m0(i11);
    }

    public static int b(int i10) {
        if (i10 == 2 || i10 == 3) {
            return 1;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 536870912 || i10 == 805306368) {
            return 1;
        }
        throw new IllegalArgumentException();
    }
}
