package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;

/* JADX INFO: compiled from: AudioAttributes.java */
/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f44115h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f44116i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f44117j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f44118k = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f44121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    private AudioAttributes f44124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f44114g = new b().a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<f> f44119l = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.audio.e
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return f.e(bundle);
        }
    };

    /* JADX INFO: compiled from: AudioAttributes.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f44125a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f44126b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f44127c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f44128d = 1;

        public f a() {
            return new f(this.f44125a, this.f44126b, this.f44127c, this.f44128d);
        }

        public b b(int i10) {
            this.f44128d = i10;
            return this;
        }

        public b c(int i10) {
            this.f44125a = i10;
            return this;
        }

        public b d(int i10) {
            this.f44126b = i10;
            return this;
        }

        public b e(int i10) {
            this.f44127c = i10;
            return this;
        }
    }

    private f(int i10, int i11, int i12, int i13) {
        this.f44120b = i10;
        this.f44121c = i11;
        this.f44122d = i12;
        this.f44123e = i13;
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f e(Bundle bundle) {
        b bVar = new b();
        if (bundle.containsKey(d(0))) {
            bVar.c(bundle.getInt(d(0)));
        }
        if (bundle.containsKey(d(1))) {
            bVar.d(bundle.getInt(d(1)));
        }
        if (bundle.containsKey(d(2))) {
            bVar.e(bundle.getInt(d(2)));
        }
        if (bundle.containsKey(d(3))) {
            bVar.b(bundle.getInt(d(3)));
        }
        return bVar.a();
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(d(0), this.f44120b);
        bundle.putInt(d(1), this.f44121c);
        bundle.putInt(d(2), this.f44122d);
        bundle.putInt(d(3), this.f44123e);
        return bundle;
    }

    @androidx.annotation.w0(21)
    public AudioAttributes c() {
        if (this.f44124f == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f44120b).setFlags(this.f44121c).setUsage(this.f44122d);
            if (com.google.android.exoplayer2.util.u0.f51536a >= 29) {
                usage.setAllowedCapturePolicy(this.f44123e);
            }
            this.f44124f = usage.build();
        }
        return this.f44124f;
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f44120b == fVar.f44120b && this.f44121c == fVar.f44121c && this.f44122d == fVar.f44122d && this.f44123e == fVar.f44123e;
    }

    public int hashCode() {
        return ((((((bb.c.b.f30674h7 + this.f44120b) * 31) + this.f44121c) * 31) + this.f44122d) * 31) + this.f44123e;
    }
}
