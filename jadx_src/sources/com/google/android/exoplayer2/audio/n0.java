package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: MpegAudioUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f44170a = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f44171b = 40000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f44172c = {com.google.android.exoplayer2.util.y.E, com.google.android.exoplayer2.util.y.F, "audio/mpeg"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f44173d = {44100, 48000, 32000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f44174e = {32000, 64000, 96000, 128000, 160000, j0.f44139a, 224000, com.google.android.exoplayer2.audio.a.f44048i, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f44175f = {32000, 48000, 56000, 64000, b.f44079a, 96000, 112000, 128000, 144000, 160000, 176000, j0.f44139a, 224000, com.google.android.exoplayer2.audio.a.f44048i};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f44176g = {32000, 48000, 56000, 64000, b.f44079a, 96000, 112000, 128000, 160000, j0.f44139a, 224000, com.google.android.exoplayer2.audio.a.f44048i, 320000, 384000};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f44177h = {32000, 40000, 48000, 56000, 64000, b.f44079a, 96000, 112000, 128000, 160000, j0.f44139a, 224000, com.google.android.exoplayer2.audio.a.f44048i, 320000};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f44178i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, b.f44079a, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f44179j = 384;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44180k = 1152;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f44181l = 1152;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f44182m = 576;

    /* JADX INFO: compiled from: MpegAudioUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f44183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public String f44184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44185c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44187e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f44188f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44189g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!n0.l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f44183a = i11;
            this.f44184b = n0.f44172c[3 - i12];
            int i15 = n0.f44173d[i14];
            this.f44186d = i15;
            if (i11 == 2) {
                this.f44186d = i15 / 2;
            } else if (i11 == 0) {
                this.f44186d = i15 / 4;
            }
            int i16 = (i10 >>> 9) & 1;
            this.f44189g = n0.k(i11, i12);
            if (i12 == 3) {
                int i17 = i11 == 3 ? n0.f44174e[i13 - 1] : n0.f44175f[i13 - 1];
                this.f44188f = i17;
                this.f44185c = (((i17 * 12) / this.f44186d) + i16) * 4;
            } else {
                if (i11 == 3) {
                    int i18 = i12 == 2 ? n0.f44176g[i13 - 1] : n0.f44177h[i13 - 1];
                    this.f44188f = i18;
                    this.f44185c = ((i18 * 144) / this.f44186d) + i16;
                } else {
                    int i19 = n0.f44178i[i13 - 1];
                    this.f44188f = i19;
                    this.f44185c = (((i12 == 1 ? 72 : 144) * i19) / this.f44186d) + i16;
                }
            }
            this.f44187e = ((i10 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    private n0() {
    }

    public static int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f44173d[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f44174e[i13 - 1] : f44175f[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f44176g[i13 - 1] : f44177h[i13 - 1];
        } else {
            i15 = f44178i[i13 - 1];
        }
        if (i11 == 3) {
            return ((i15 * 144) / i16) + i17;
        }
        return (((i12 == 1 ? 72 : 144) * i15) / i16) + i17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11) {
        if (i11 == 1) {
            if (i10 == 3) {
                return bb.c.b.f30708ij;
            }
            return 576;
        }
        if (i11 == 2) {
            return bb.c.b.f30708ij;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int m(int i10) {
        int i11;
        int i12;
        if (!l(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return k(i11, i12);
    }
}
