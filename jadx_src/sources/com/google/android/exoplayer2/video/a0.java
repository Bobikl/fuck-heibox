package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.f0;
import androidx.annotation.p0;

/* JADX INFO: compiled from: VideoSize.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a0 implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f51702f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51703g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51704h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f51705i = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f51707k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f51708l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f51709m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f51710n = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f0(from = 0)
    public final int f51712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f0(from = 0)
    public final int f51713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f0(from = 0, to = 359)
    public final int f51714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.x(from = 0.0d, fromInclusive = false)
    public final float f51715e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a0 f51706j = new a0(0, 0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<a0> f51711o = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.video.z
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return a0.d(bundle);
        }
    };

    public a0(@f0(from = 0) int i10, @f0(from = 0) int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public a0(@f0(from = 0) int i10, @f0(from = 0) int i11, @f0(from = 0, to = 359) int i12, @androidx.annotation.x(from = 0.0d, fromInclusive = false) float f10) {
        this.f51712b = i10;
        this.f51713c = i11;
        this.f51714d = i12;
        this.f51715e = f10;
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a0 d(Bundle bundle) {
        return new a0(bundle.getInt(c(0), 0), bundle.getInt(c(1), 0), bundle.getInt(c(2), 0), bundle.getFloat(c(3), 1.0f));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(c(0), this.f51712b);
        bundle.putInt(c(1), this.f51713c);
        bundle.putInt(c(2), this.f51714d);
        bundle.putFloat(c(3), this.f51715e);
        return bundle;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f51712b == a0Var.f51712b && this.f51713c == a0Var.f51713c && this.f51714d == a0Var.f51714d && this.f51715e == a0Var.f51715e;
    }

    public int hashCode() {
        return ((((((217 + this.f51712b) * 31) + this.f51713c) * 31) + this.f51714d) * 31) + Float.floatToRawIntBits(this.f51715e);
    }
}
