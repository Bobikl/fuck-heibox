package com.google.android.exoplayer2;

import android.os.Bundle;

/* JADX INFO: compiled from: PlaybackParameters.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b3 implements i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f44368f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f44369g = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f44371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f44372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f44373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b3 f44367e = new b3(1.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i.a<b3> f44370h = new i.a() { // from class: com.google.android.exoplayer2.a3
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return b3.e(bundle);
        }
    };

    public b3(float f10) {
        this(f10, 1.0f);
    }

    public b3(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f11) {
        com.google.android.exoplayer2.util.a.a(f10 > 0.0f);
        com.google.android.exoplayer2.util.a.a(f11 > 0.0f);
        this.f44371b = f10;
        this.f44372c = f11;
        this.f44373d = Math.round(f10 * 1000.0f);
    }

    private static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b3 e(Bundle bundle) {
        return new b3(bundle.getFloat(d(0), 1.0f), bundle.getFloat(d(1), 1.0f));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putFloat(d(0), this.f44371b);
        bundle.putFloat(d(1), this.f44372c);
        return bundle;
    }

    public long c(long j10) {
        return j10 * ((long) this.f44373d);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b3.class != obj.getClass()) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return this.f44371b == b3Var.f44371b && this.f44372c == b3Var.f44372c;
    }

    @androidx.annotation.j
    public b3 f(@androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        return new b3(f10, this.f44372c);
    }

    public int hashCode() {
        return ((bb.c.b.f30674h7 + Float.floatToRawIntBits(this.f44371b)) * 31) + Float.floatToRawIntBits(this.f44372c);
    }

    public String toString() {
        return com.google.android.exoplayer2.util.u0.H("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f44371b), Float.valueOf(this.f44372c));
    }
}
