package com.google.android.exoplayer2.video;

import android.os.Bundle;
import androidx.annotation.p0;
import java.util.Arrays;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: compiled from: ColorInfo.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f51716g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51717h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f51718i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f51719j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<c> f51720k = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.video.b
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return c.f(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public final byte[] f51724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51725f;

    public c(int i10, int i11, int i12, @p0 byte[] bArr) {
        this.f51721b = i10;
        this.f51722c = i11;
        this.f51723d = i12;
        this.f51724e = bArr;
    }

    @Pure
    public static int c(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int d(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c f(Bundle bundle) {
        return new c(bundle.getInt(e(0), -1), bundle.getInt(e(1), -1), bundle.getInt(e(2), -1), bundle.getByteArray(e(3)));
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(e(0), this.f51721b);
        bundle.putInt(e(1), this.f51722c);
        bundle.putInt(e(2), this.f51723d);
        bundle.putByteArray(e(3), this.f51724e);
        return bundle;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f51721b == cVar.f51721b && this.f51722c == cVar.f51722c && this.f51723d == cVar.f51723d && Arrays.equals(this.f51724e, cVar.f51724e);
    }

    public int hashCode() {
        if (this.f51725f == 0) {
            this.f51725f = ((((((bb.c.b.f30674h7 + this.f51721b) * 31) + this.f51722c) * 31) + this.f51723d) * 31) + Arrays.hashCode(this.f51724e);
        }
        return this.f51725f;
    }

    public String toString() {
        int i10 = this.f51721b;
        int i11 = this.f51722c;
        int i12 = this.f51723d;
        boolean z10 = this.f51724e != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
