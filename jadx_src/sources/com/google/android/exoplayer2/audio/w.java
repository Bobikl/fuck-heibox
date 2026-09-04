package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import io.flutter.embedding.android.KeyboardMap;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: AudioTrackPositionTracker.java */
/* JADX INFO: loaded from: classes7.dex */
public final class w {
    private static final int G = 1;
    private static final int H = 2;
    private static final int I = 3;
    private static final long J = 5000000;
    private static final long K = 5000000;
    private static final long L = 1000000;
    private static final long M = 200;
    private static final int N = 10;
    private static final int O = 30000;
    private static final int P = 500000;
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f44324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private AudioTrack f44325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44327e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private v f44328f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f44329g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f44330h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f44331i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f44332j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f44333k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f44334l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f44335m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private Method f44336n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f44337o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f44338p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f44339q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f44340r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f44341s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f44342t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f44343u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f44344v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f44345w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f44346x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f44347y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f44348z;

    /* JADX INFO: compiled from: AudioTrackPositionTracker.java */
    public interface a {
        void a(long j10, long j11, long j12, long j13);

        void b(long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(int i10, long j10);

        void e(long j10);
    }

    public w(a aVar) {
        this.f44323a = (a) com.google.android.exoplayer2.util.a.g(aVar);
        if (com.google.android.exoplayer2.util.u0.f51536a >= 18) {
            try {
                this.f44336n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f44324b = new long[10];
    }

    private boolean a() {
        return this.f44330h && ((AudioTrack) com.google.android.exoplayer2.util.a.g(this.f44325c)).getPlayState() == 2 && f() == 0;
    }

    private long b(long j10) {
        return (j10 * 1000000) / ((long) this.f44329g);
    }

    private long f() {
        AudioTrack audioTrack = (AudioTrack) com.google.android.exoplayer2.util.a.g(this.f44325c);
        if (this.f44346x != com.google.android.exoplayer2.j.f46377b) {
            return Math.min(this.A, this.f44348z + ((((SystemClock.elapsedRealtime() * 1000) - this.f44346x) * ((long) this.f44329g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = KeyboardMap.kValueMask & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f44330h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f44343u = this.f44341s;
            }
            playbackHeadPosition += this.f44343u;
        }
        if (com.google.android.exoplayer2.util.u0.f51536a <= 29) {
            if (playbackHeadPosition == 0 && this.f44341s > 0 && playState == 3) {
                if (this.f44347y == com.google.android.exoplayer2.j.f46377b) {
                    this.f44347y = SystemClock.elapsedRealtime();
                }
                return this.f44341s;
            }
            this.f44347y = com.google.android.exoplayer2.j.f46377b;
        }
        if (this.f44341s > playbackHeadPosition) {
            this.f44342t++;
        }
        this.f44341s = playbackHeadPosition;
        return playbackHeadPosition + (this.f44342t << 32);
    }

    private long g() {
        return b(f());
    }

    private void m(long j10, long j11) {
        v vVar = (v) com.google.android.exoplayer2.util.a.g(this.f44328f);
        if (vVar.f(j10)) {
            long jC = vVar.c();
            long jB = vVar.b();
            if (Math.abs(jC - j10) > 5000000) {
                this.f44323a.c(jB, jC, j10, j11);
                vVar.g();
            } else if (Math.abs(b(jB) - j11) <= 5000000) {
                vVar.a();
            } else {
                this.f44323a.a(jB, jC, j10, j11);
                vVar.g();
            }
        }
    }

    private void n() {
        long jG = g();
        if (jG == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f44335m >= 30000) {
            long[] jArr = this.f44324b;
            int i10 = this.f44344v;
            jArr[i10] = jG - jNanoTime;
            this.f44344v = (i10 + 1) % 10;
            int i11 = this.f44345w;
            if (i11 < 10) {
                this.f44345w = i11 + 1;
            }
            this.f44335m = jNanoTime;
            this.f44334l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f44345w;
                if (i12 >= i13) {
                    break;
                }
                this.f44334l += this.f44324b[i12] / ((long) i13);
                i12++;
            }
        }
        if (this.f44330h) {
            return;
        }
        m(jNanoTime, jG);
        o(jNanoTime);
    }

    private void o(long j10) {
        Method method;
        if (!this.f44339q || (method = this.f44336n) == null || j10 - this.f44340r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) com.google.android.exoplayer2.util.u0.k((Integer) method.invoke(com.google.android.exoplayer2.util.a.g(this.f44325c), new Object[0]))).intValue()) * 1000) - this.f44331i;
            this.f44337o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f44337o = jMax;
            if (jMax > 5000000) {
                this.f44323a.e(jMax);
                this.f44337o = 0L;
            }
        } catch (Exception unused) {
            this.f44336n = null;
        }
        this.f44340r = j10;
    }

    private static boolean p(int i10) {
        return com.google.android.exoplayer2.util.u0.f51536a < 23 && (i10 == 5 || i10 == 6);
    }

    private void s() {
        this.f44334l = 0L;
        this.f44345w = 0;
        this.f44344v = 0;
        this.f44335m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f44333k = false;
    }

    public int c(long j10) {
        return this.f44327e - ((int) (j10 - (f() * ((long) this.f44326d))));
    }

    public long d(boolean z10) {
        long jG;
        if (((AudioTrack) com.google.android.exoplayer2.util.a.g(this.f44325c)).getPlayState() == 3) {
            n();
        }
        long jNanoTime = System.nanoTime() / 1000;
        v vVar = (v) com.google.android.exoplayer2.util.a.g(this.f44328f);
        boolean zD = vVar.d();
        if (zD) {
            jG = b(vVar.b()) + com.google.android.exoplayer2.util.u0.k0(jNanoTime - vVar.c(), this.f44332j);
        } else {
            jG = this.f44345w == 0 ? g() : this.f44334l + jNanoTime;
            if (!z10) {
                jG = Math.max(0L, jG - this.f44337o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j10 = jNanoTime - this.F;
        if (j10 < 1000000) {
            long jK0 = this.E + com.google.android.exoplayer2.util.u0.k0(j10, this.f44332j);
            long j11 = (j10 * 1000) / 1000000;
            jG = ((jG * j11) + ((1000 - j11) * jK0)) / 1000;
        }
        if (!this.f44333k) {
            long j12 = this.B;
            if (jG > j12) {
                this.f44333k = true;
                this.f44323a.b(System.currentTimeMillis() - com.google.android.exoplayer2.util.u0.B1(com.google.android.exoplayer2.util.u0.p0(com.google.android.exoplayer2.util.u0.B1(jG - j12), this.f44332j)));
            }
        }
        this.C = jNanoTime;
        this.B = jG;
        this.D = zD;
        return jG;
    }

    public long e(long j10) {
        return com.google.android.exoplayer2.util.u0.B1(b(j10 - f()));
    }

    public void h(long j10) {
        this.f44348z = f();
        this.f44346x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean i(long j10) {
        return j10 > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) com.google.android.exoplayer2.util.a.g(this.f44325c)).getPlayState() == 3;
    }

    public boolean k(long j10) {
        return this.f44347y != com.google.android.exoplayer2.j.f46377b && j10 > 0 && SystemClock.elapsedRealtime() - this.f44347y >= M;
    }

    public boolean l(long j10) {
        int playState = ((AudioTrack) com.google.android.exoplayer2.util.a.g(this.f44325c)).getPlayState();
        if (this.f44330h) {
            if (playState == 2) {
                this.f44338p = false;
                return false;
            }
            if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z10 = this.f44338p;
        boolean zI = i(j10);
        this.f44338p = zI;
        if (z10 && !zI && playState != 1) {
            this.f44323a.d(this.f44327e, com.google.android.exoplayer2.util.u0.B1(this.f44331i));
        }
        return true;
    }

    public boolean q() {
        s();
        if (this.f44346x != com.google.android.exoplayer2.j.f46377b) {
            return false;
        }
        ((v) com.google.android.exoplayer2.util.a.g(this.f44328f)).h();
        return true;
    }

    public void r() {
        s();
        this.f44325c = null;
        this.f44328f = null;
    }

    public void t(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f44325c = audioTrack;
        this.f44326d = i11;
        this.f44327e = i12;
        this.f44328f = new v(audioTrack);
        this.f44329g = audioTrack.getSampleRate();
        this.f44330h = z10 && p(i10);
        boolean zH0 = com.google.android.exoplayer2.util.u0.H0(i10);
        this.f44339q = zH0;
        this.f44331i = zH0 ? b(i12 / i11) : -9223372036854775807L;
        this.f44341s = 0L;
        this.f44342t = 0L;
        this.f44343u = 0L;
        this.f44338p = false;
        this.f44346x = com.google.android.exoplayer2.j.f46377b;
        this.f44347y = com.google.android.exoplayer2.j.f46377b;
        this.f44340r = 0L;
        this.f44337o = 0L;
        this.f44332j = 1.0f;
    }

    public void u(float f10) {
        this.f44332j = f10;
        v vVar = this.f44328f;
        if (vVar != null) {
            vVar.h();
        }
    }

    public void v() {
        ((v) com.google.android.exoplayer2.util.a.g(this.f44328f)).h();
    }
}
