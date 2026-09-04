package com.bumptech.glide.request;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

/* JADX INFO: compiled from: RequestOptions.java */
/* JADX INFO: loaded from: classes6.dex */
public class h extends a<h> {

    @p0
    private static h W;

    @p0
    private static h X;

    @p0
    private static h Y;

    @p0
    private static h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @p0
    private static h f41875a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @p0
    private static h f41876b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @p0
    private static h f41877c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @p0
    private static h f41878p1;

    @n0
    @androidx.annotation.j
    public static h A1(@v int i10) {
        return new h().E0(i10);
    }

    @n0
    @androidx.annotation.j
    public static h B1(@p0 Drawable drawable) {
        return new h().F0(drawable);
    }

    @n0
    @androidx.annotation.j
    public static h C1(@n0 Priority priority) {
        return new h().H0(priority);
    }

    @n0
    @androidx.annotation.j
    public static h D1(@n0 com.bumptech.glide.load.c cVar) {
        return new h().O0(cVar);
    }

    @n0
    @androidx.annotation.j
    public static h E1(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        return new h().P0(f10);
    }

    @n0
    @androidx.annotation.j
    public static h F1(boolean z10) {
        if (z10) {
            if (W == null) {
                W = new h().Q0(true).j();
            }
            return W;
        }
        if (X == null) {
            X = new h().Q0(false).j();
        }
        return X;
    }

    @n0
    @androidx.annotation.j
    public static h G1(@f0(from = 0) int i10) {
        return new h().S0(i10);
    }

    @n0
    @androidx.annotation.j
    public static h e1(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        return new h().T0(iVar);
    }

    @n0
    @androidx.annotation.j
    public static h g1() {
        if (f41875a0 == null) {
            f41875a0 = new h().k().j();
        }
        return f41875a0;
    }

    @n0
    @androidx.annotation.j
    public static h i1() {
        if (Z == null) {
            Z = new h().l().j();
        }
        return Z;
    }

    @n0
    @androidx.annotation.j
    public static h j1() {
        if (f41876b0 == null) {
            f41876b0 = new h().m().j();
        }
        return f41876b0;
    }

    @n0
    @androidx.annotation.j
    public static h k1(@n0 Class<?> cls) {
        return new h().o(cls);
    }

    @n0
    @androidx.annotation.j
    public static h l1(@n0 com.bumptech.glide.load.engine.h hVar) {
        return new h().q(hVar);
    }

    @n0
    @androidx.annotation.j
    public static h m1(@n0 DownsampleStrategy downsampleStrategy) {
        return new h().t(downsampleStrategy);
    }

    @n0
    @androidx.annotation.j
    public static h n1(@n0 Bitmap.CompressFormat compressFormat) {
        return new h().u(compressFormat);
    }

    @n0
    @androidx.annotation.j
    public static h o1(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        return new h().v(i10);
    }

    @n0
    @androidx.annotation.j
    public static h p1(@v int i10) {
        return new h().w(i10);
    }

    @n0
    @androidx.annotation.j
    public static h q1(@p0 Drawable drawable) {
        return new h().x(drawable);
    }

    @n0
    @androidx.annotation.j
    public static h r1() {
        if (Y == null) {
            Y = new h().B().j();
        }
        return Y;
    }

    @n0
    @androidx.annotation.j
    public static h s1(@n0 DecodeFormat decodeFormat) {
        return new h().C(decodeFormat);
    }

    @n0
    @androidx.annotation.j
    public static h t1(@f0(from = 0) long j10) {
        return new h().D(j10);
    }

    @n0
    @androidx.annotation.j
    public static h u1() {
        if (f41878p1 == null) {
            f41878p1 = new h().r().j();
        }
        return f41878p1;
    }

    @n0
    @androidx.annotation.j
    public static h w1() {
        if (f41877c0 == null) {
            f41877c0 = new h().s().j();
        }
        return f41877c0;
    }

    @n0
    @androidx.annotation.j
    public static <T> h x1(@n0 com.bumptech.glide.load.e<T> eVar, @n0 T t10) {
        return new h().N0(eVar, t10);
    }

    @n0
    @androidx.annotation.j
    public static h y1(int i10) {
        return z1(i10, i10);
    }

    @n0
    @androidx.annotation.j
    public static h z1(int i10, int i11) {
        return new h().B0(i10, i11);
    }

    @Override // com.bumptech.glide.request.a
    public boolean equals(Object obj) {
        return (obj instanceof h) && super.equals(obj);
    }

    @Override // com.bumptech.glide.request.a
    public int hashCode() {
        return super.hashCode();
    }
}
