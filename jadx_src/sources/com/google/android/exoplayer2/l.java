package com.google.android.exoplayer2;

/* JADX INFO: compiled from: DefaultLoadControl.java */
/* JADX INFO: loaded from: classes7.dex */
public class l implements g2 {
    public static final int A = 13107200;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f46522l = 50000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f46523m = 50000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f46524n = 2500;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f46525o = 5000;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f46526p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f46527q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f46528r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f46529s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f46530t = 131072000;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f46531u = 13107200;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f46532v = 131072;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f46533w = 131072;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f46534x = 131072;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f46535y = 131072;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f46536z = 144310272;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.s f46537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f46539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f46540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f46541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f46542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f46543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f46544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f46545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f46546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f46547k;

    /* JADX INFO: compiled from: DefaultLoadControl.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.upstream.s f46548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f46549b = 50000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f46550c = 50000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f46551d = 2500;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f46552e = 5000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f46553f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f46554g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f46555h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f46556i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f46557j;

        public l a() {
            com.google.android.exoplayer2.util.a.i(!this.f46557j);
            this.f46557j = true;
            if (this.f46548a == null) {
                this.f46548a = new com.google.android.exoplayer2.upstream.s(true, 65536);
            }
            return new l(this.f46548a, this.f46549b, this.f46550c, this.f46551d, this.f46552e, this.f46553f, this.f46554g, this.f46555h, this.f46556i);
        }

        @Deprecated
        public l b() {
            return a();
        }

        public a c(com.google.android.exoplayer2.upstream.s sVar) {
            com.google.android.exoplayer2.util.a.i(!this.f46557j);
            this.f46548a = sVar;
            return this;
        }

        public a d(int i10, boolean z10) {
            com.google.android.exoplayer2.util.a.i(!this.f46557j);
            l.b(i10, 0, "backBufferDurationMs", "0");
            this.f46555h = i10;
            this.f46556i = z10;
            return this;
        }

        public a e(int i10, int i11, int i12, int i13) {
            com.google.android.exoplayer2.util.a.i(!this.f46557j);
            l.b(i12, 0, "bufferForPlaybackMs", "0");
            l.b(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            l.b(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            l.b(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            l.b(i11, i10, "maxBufferMs", "minBufferMs");
            this.f46549b = i10;
            this.f46550c = i11;
            this.f46551d = i12;
            this.f46552e = i13;
            return this;
        }

        public a f(boolean z10) {
            com.google.android.exoplayer2.util.a.i(!this.f46557j);
            this.f46554g = z10;
            return this;
        }

        public a g(int i10) {
            com.google.android.exoplayer2.util.a.i(!this.f46557j);
            this.f46553f = i10;
            return this;
        }
    }

    public l() {
        this(new com.google.android.exoplayer2.upstream.s(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    protected l(com.google.android.exoplayer2.upstream.s sVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        b(i12, 0, "bufferForPlaybackMs", "0");
        b(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        b(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(i11, i10, "maxBufferMs", "minBufferMs");
        b(i15, 0, "backBufferDurationMs", "0");
        this.f46537a = sVar;
        this.f46538b = com.google.android.exoplayer2.util.u0.U0(i10);
        this.f46539c = com.google.android.exoplayer2.util.u0.U0(i11);
        this.f46540d = com.google.android.exoplayer2.util.u0.U0(i12);
        this.f46541e = com.google.android.exoplayer2.util.u0.U0(i13);
        this.f46542f = i14;
        this.f46546j = i14 == -1 ? 13107200 : i14;
        this.f46543g = z10;
        this.f46544h = com.google.android.exoplayer2.util.u0.U0(i15);
        this.f46545i = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10, int i11, String str, String str2) {
        boolean z10 = i10 >= i11;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" cannot be less than ");
        sb2.append(str2);
        com.google.android.exoplayer2.util.a.b(z10, sb2.toString());
    }

    private static int m(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return f46536z;
            case 1:
                return 13107200;
            case 2:
                return f46530t;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    private void n(boolean z10) {
        int i10 = this.f46542f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f46546j = i10;
        this.f46547k = false;
        if (z10) {
            this.f46537a.g();
        }
    }

    @Override // com.google.android.exoplayer2.g2
    public void c() {
        n(false);
    }

    @Override // com.google.android.exoplayer2.g2
    public boolean d() {
        return this.f46545i;
    }

    @Override // com.google.android.exoplayer2.g2
    public void e(m3[] m3VarArr, com.google.android.exoplayer2.source.p1 p1Var, com.google.android.exoplayer2.trackselection.j[] jVarArr) {
        int iL = this.f46542f;
        if (iL == -1) {
            iL = l(m3VarArr, jVarArr);
        }
        this.f46546j = iL;
        this.f46537a.h(iL);
    }

    @Override // com.google.android.exoplayer2.g2
    public void f() {
        n(true);
    }

    @Override // com.google.android.exoplayer2.g2
    public boolean g(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f46537a.a() >= this.f46546j;
        long jMin = this.f46538b;
        if (f10 > 1.0f) {
            jMin = Math.min(com.google.android.exoplayer2.util.u0.k0(jMin, f10), this.f46539c);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            if (!this.f46543g && z11) {
                z10 = false;
            }
            this.f46547k = z10;
            if (!z10 && j11 < 500000) {
                com.google.android.exoplayer2.util.u.m("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f46539c || z11) {
            this.f46547k = false;
        }
        return this.f46547k;
    }

    @Override // com.google.android.exoplayer2.g2
    public long h() {
        return this.f46544h;
    }

    @Override // com.google.android.exoplayer2.g2
    public boolean i(long j10, float f10, boolean z10, long j11) {
        long jP0 = com.google.android.exoplayer2.util.u0.p0(j10, f10);
        long jMin = z10 ? this.f46541e : this.f46540d;
        if (j11 != j.f46377b) {
            jMin = Math.min(j11 / 2, jMin);
        }
        return jMin <= 0 || jP0 >= jMin || (!this.f46543g && this.f46537a.a() >= this.f46546j);
    }

    @Override // com.google.android.exoplayer2.g2
    public com.google.android.exoplayer2.upstream.b j() {
        return this.f46537a;
    }

    @Override // com.google.android.exoplayer2.g2
    public void k() {
        n(true);
    }

    protected int l(m3[] m3VarArr, com.google.android.exoplayer2.trackselection.j[] jVarArr) {
        int iM = 0;
        for (int i10 = 0; i10 < m3VarArr.length; i10++) {
            if (jVarArr[i10] != null) {
                iM += m(m3VarArr[i10].d());
            }
        }
        return Math.max(13107200, iM);
    }
}
