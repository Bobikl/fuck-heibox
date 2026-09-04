package com.google.android.exoplayer2.audio;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: compiled from: AudioTimestampPoller.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f44293g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f44294h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f44295i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f44296j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44297k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f44298l = 10000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f44299m = 10000000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f44300n = 500000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f44301o = 500000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private final a f44302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f44303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f44306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f44307f;

    /* JADX INFO: compiled from: AudioTimestampPoller.java */
    @androidx.annotation.w0(19)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AudioTrack f44308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f44309b = new AudioTimestamp();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f44310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f44311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f44312e;

        public a(AudioTrack audioTrack) {
            this.f44308a = audioTrack;
        }

        public long a() {
            return this.f44312e;
        }

        public long b() {
            return this.f44309b.nanoTime / 1000;
        }

        public boolean c() {
            boolean timestamp = this.f44308a.getTimestamp(this.f44309b);
            if (timestamp) {
                long j10 = this.f44309b.framePosition;
                if (this.f44311d > j10) {
                    this.f44310c++;
                }
                this.f44311d = j10;
                this.f44312e = j10 + (this.f44310c << 32);
            }
            return timestamp;
        }
    }

    public v(AudioTrack audioTrack) {
        if (com.google.android.exoplayer2.util.u0.f51536a >= 19) {
            this.f44302a = new a(audioTrack);
            h();
        } else {
            this.f44302a = null;
            i(3);
        }
    }

    private void i(int i10) {
        this.f44303b = i10;
        if (i10 == 0) {
            this.f44306e = 0L;
            this.f44307f = -1L;
            this.f44304c = System.nanoTime() / 1000;
            this.f44305d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f44305d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f44305d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f44305d = 500000L;
        }
    }

    public void a() {
        if (this.f44303b == 4) {
            h();
        }
    }

    @TargetApi(19)
    public long b() {
        a aVar = this.f44302a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public long c() {
        a aVar = this.f44302a;
        return aVar != null ? aVar.b() : com.google.android.exoplayer2.j.f46377b;
    }

    public boolean d() {
        return this.f44303b == 2;
    }

    public boolean e() {
        int i10 = this.f44303b;
        return i10 == 1 || i10 == 2;
    }

    @TargetApi(19)
    public boolean f(long j10) {
        a aVar = this.f44302a;
        if (aVar == null || j10 - this.f44306e < this.f44305d) {
            return false;
        }
        this.f44306e = j10;
        boolean zC = aVar.c();
        int i10 = this.f44303b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC) {
                        h();
                    }
                } else if (!zC) {
                    h();
                }
            } else if (!zC) {
                h();
            } else if (this.f44302a.a() > this.f44307f) {
                i(2);
            }
        } else if (zC) {
            if (this.f44302a.b() < this.f44304c) {
                return false;
            }
            this.f44307f = this.f44302a.a();
            i(1);
        } else if (j10 - this.f44304c > 500000) {
            i(3);
        }
        return zC;
    }

    public void g() {
        i(4);
    }

    public void h() {
        if (this.f44302a != null) {
            i(0);
        }
    }
}
