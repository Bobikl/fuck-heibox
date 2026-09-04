package com.max.hbimage.image;

import android.content.res.Resources;
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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: GlideOptions.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends com.bumptech.glide.request.h implements Cloneable {
    private static h G2;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static h f70444p2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static h f70445x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static h f70446x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static h f70447y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static h f70448y2;

    @n0
    @androidx.annotation.j
    public static h F2(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.B7, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().D2(i10);
    }

    @n0
    @androidx.annotation.j
    public static h G2(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.g.A7, new Class[]{cls, cls}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().E2(i10, i11);
    }

    @n0
    @androidx.annotation.j
    public static h J1(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, null, changeQuickRedirect, true, bb.c.g.H7, new Class[]{com.bumptech.glide.load.i.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().X2(iVar);
    }

    @n0
    @androidx.annotation.j
    public static h J2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.f33169w7, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().H2(i10);
    }

    @n0
    @androidx.annotation.j
    public static h K2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, null, changeQuickRedirect, true, bb.c.g.f33149v7, new Class[]{Drawable.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().I2(drawable);
    }

    @n0
    @androidx.annotation.j
    public static h L1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.F7, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (f70444p2 == null) {
            f70444p2 = new h().K1().I1();
        }
        return f70444p2;
    }

    @n0
    @androidx.annotation.j
    public static h M2(@n0 Priority priority) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{priority}, null, changeQuickRedirect, true, bb.c.g.f33129u7, new Class[]{Priority.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().L2(priority);
    }

    @n0
    @androidx.annotation.j
    public static h O1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.E7, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (f70447y1 == null) {
            f70447y1 = new h().N1().I1();
        }
        return f70447y1;
    }

    @n0
    @androidx.annotation.j
    public static h P2(@n0 com.bumptech.glide.load.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, bb.c.g.C7, new Class[]{com.bumptech.glide.load.c.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().O2(cVar);
    }

    @n0
    @androidx.annotation.j
    public static h R1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.G7, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (f70446x2 == null) {
            f70446x2 = new h().Q1().I1();
        }
        return f70446x2;
    }

    @n0
    @androidx.annotation.j
    public static h R2(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, null, changeQuickRedirect, true, bb.c.g.f33089s7, new Class[]{Float.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().Q2(f10);
    }

    @n0
    @androidx.annotation.j
    public static h T2(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.f33229z7, new Class[]{Boolean.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().S2(z10);
    }

    @n0
    @androidx.annotation.j
    public static h U1(@n0 Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, null, changeQuickRedirect, true, bb.c.g.K7, new Class[]{Class.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().T1(cls);
    }

    @n0
    @androidx.annotation.j
    public static h W2(@f0(from = 0) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.O7, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().V2(i10);
    }

    @n0
    @androidx.annotation.j
    public static h X1(@n0 com.bumptech.glide.load.engine.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, null, changeQuickRedirect, true, bb.c.g.f33109t7, new Class[]{com.bumptech.glide.load.engine.h.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().W1(hVar);
    }

    @n0
    @androidx.annotation.j
    public static h b2(@n0 DownsampleStrategy downsampleStrategy) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downsampleStrategy}, null, changeQuickRedirect, true, bb.c.g.N7, new Class[]{DownsampleStrategy.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().a2(downsampleStrategy);
    }

    @n0
    @androidx.annotation.j
    public static h d2(@n0 Bitmap.CompressFormat compressFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{compressFormat}, null, changeQuickRedirect, true, bb.c.g.Q7, new Class[]{Bitmap.CompressFormat.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().c2(compressFormat);
    }

    @n0
    @androidx.annotation.j
    public static h f2(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.P7, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().e2(i10);
    }

    @n0
    @androidx.annotation.j
    public static h i2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.f33209y7, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().g2(i10);
    }

    @n0
    @androidx.annotation.j
    public static h j2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, null, changeQuickRedirect, true, bb.c.g.f33189x7, new Class[]{Drawable.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().h2(drawable);
    }

    @n0
    @androidx.annotation.j
    public static h n2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.D7, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (f70445x1 == null) {
            f70445x1 = new h().m2().I1();
        }
        return f70445x1;
    }

    @n0
    @androidx.annotation.j
    public static h p2(@n0 DecodeFormat decodeFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{decodeFormat}, null, changeQuickRedirect, true, bb.c.g.L7, new Class[]{DecodeFormat.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().o2(decodeFormat);
    }

    @n0
    @androidx.annotation.j
    public static h r2(@f0(from = 0) long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.g.M7, new Class[]{Long.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().q2(j10);
    }

    @n0
    @androidx.annotation.j
    public static h t2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.R7, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (G2 == null) {
            G2 = new h().Y1().I1();
        }
        return G2;
    }

    @n0
    @androidx.annotation.j
    public static h u2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.I7, new Class[0], h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        if (f70448y2 == null) {
            f70448y2 = new h().Z1().I1();
        }
        return f70448y2;
    }

    @n0
    @androidx.annotation.j
    public static <T> h w2(@n0 com.bumptech.glide.load.e<T> eVar, @n0 T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, t10}, null, changeQuickRedirect, true, bb.c.g.J7, new Class[]{com.bumptech.glide.load.e.class, Object.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : new h().N2(eVar, t10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a A0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 7016, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : D2(i10);
    }

    @n0
    @androidx.annotation.j
    public h A2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33150v8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.v0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a B() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7001, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : m2();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a B0(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 7017, new Class[]{cls, cls}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : E2(i10, i11);
    }

    @n0
    @androidx.annotation.j
    public h B2(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.D8, new Class[]{com.bumptech.glide.load.i.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.x0(iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a C(@n0 DecodeFormat decodeFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{decodeFormat}, this, changeQuickRedirect, false, 7008, new Class[]{DecodeFormat.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : o2(decodeFormat);
    }

    @n0
    @androidx.annotation.j
    public <Y> h C2(@n0 Class<Y> cls, @n0 com.bumptech.glide.load.i<Y> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.E8, new Class[]{Class.class, com.bumptech.glide.load.i.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.z0(cls, iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a D(@f0(from = 0) long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 7009, new Class[]{Long.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : q2(j10);
    }

    @n0
    @androidx.annotation.j
    public h D2(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32871h8, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.A0(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a E0(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33191x9, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : H2(i10);
    }

    @n0
    @androidx.annotation.j
    public h E2(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.f32851g8, new Class[]{cls, cls}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.B0(i10, i11);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a F0(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f33211y9, new Class[]{Drawable.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : I2(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a H0(@n0 Priority priority) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{priority}, this, changeQuickRedirect, false, bb.c.g.f33231z9, new Class[]{Priority.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : L2(priority);
    }

    @n0
    @androidx.annotation.j
    public h H1(@n0 com.bumptech.glide.request.a<?> aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.g.I8, new Class[]{com.bumptech.glide.request.a.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.i(aVar);
    }

    @n0
    @androidx.annotation.j
    public h H2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Z7, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.E0(i10);
    }

    @n0
    public h I1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.K8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.j();
    }

    @n0
    @androidx.annotation.j
    public h I2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.Y7, new Class[]{Drawable.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.F0(drawable);
    }

    @n0
    @androidx.annotation.j
    public h K1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33130u8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.k();
    }

    @n0
    @androidx.annotation.j
    public h L2(@n0 Priority priority) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{priority}, this, changeQuickRedirect, false, bb.c.g.X7, new Class[]{Priority.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.H0(priority);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a N0(@n0 com.bumptech.glide.load.e eVar, @n0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 7013, new Class[]{com.bumptech.glide.load.e.class, Object.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : N2(eVar, obj);
    }

    @n0
    @androidx.annotation.j
    public h N1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33210y8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.l();
    }

    @n0
    @androidx.annotation.j
    public <Y> h N2(@n0 com.bumptech.glide.load.e<Y> eVar, @n0 Y y10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, y10}, this, changeQuickRedirect, false, bb.c.g.f32930k8, new Class[]{com.bumptech.glide.load.e.class, Object.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.N0(eVar, y10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a O0(@n0 com.bumptech.glide.load.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 7015, new Class[]{com.bumptech.glide.load.c.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : O2(cVar);
    }

    @n0
    @androidx.annotation.j
    public h O2(@n0 com.bumptech.glide.load.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.g.f32891i8, new Class[]{com.bumptech.glide.load.c.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.O0(cVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a P0(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.g.E9, new Class[]{Float.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Q2(f10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a Q0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 7018, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : S2(z10);
    }

    @n0
    @androidx.annotation.j
    public h Q1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.A8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.m();
    }

    @n0
    @androidx.annotation.j
    public h Q2(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.g.S7, new Class[]{Float.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.P0(f10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a R0(@p0 Resources.Theme theme) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{theme}, this, changeQuickRedirect, false, 7019, new Class[]{Resources.Theme.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : U2(theme);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a S0(@f0(from = 0) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 7005, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : V2(i10);
    }

    @androidx.annotation.j
    public h S1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32910j8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.clone();
    }

    @n0
    @androidx.annotation.j
    public h S2(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f32831f8, new Class[]{Boolean.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.Q0(z10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a T0(@n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.V8, new Class[]{com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : X2(iVar);
    }

    @n0
    @androidx.annotation.j
    public h T1(@n0 Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, bb.c.g.f32950l8, new Class[]{Class.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.o(cls);
    }

    @n0
    @androidx.annotation.j
    public h U2(@p0 Resources.Theme theme) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{theme}, this, changeQuickRedirect, false, bb.c.g.f32811e8, new Class[]{Resources.Theme.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.R0(theme);
    }

    @n0
    @androidx.annotation.j
    public h V1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33050q8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.p();
    }

    @n0
    @androidx.annotation.j
    public h V2(@f0(from = 0) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33090s8, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.S0(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a W0(@n0 Class cls, @n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.Q8, new Class[]{Class.class, com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Y2(cls, iVar);
    }

    @n0
    @androidx.annotation.j
    public h W1(@n0 com.bumptech.glide.load.engine.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.W7, new Class[]{com.bumptech.glide.load.engine.h.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.q(hVar);
    }

    @n0
    @androidx.annotation.j
    public h X2(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.B8, new Class[]{com.bumptech.glide.load.i.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.T0(iVar);
    }

    @Override // com.bumptech.glide.request.a
    @SafeVarargs
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a Y0(@n0 com.bumptech.glide.load.i[] iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.U8, new Class[]{com.bumptech.glide.load.i[].class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Z2(iVarArr);
    }

    @n0
    @androidx.annotation.j
    public h Y1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.H8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.r();
    }

    @n0
    @androidx.annotation.j
    public <Y> h Y2(@n0 Class<Y> cls, @n0 com.bumptech.glide.load.i<Y> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.F8, new Class[]{Class.class, com.bumptech.glide.load.i.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.W0(cls, iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @Deprecated
    @SafeVarargs
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a Z0(@n0 com.bumptech.glide.load.i[] iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.T8, new Class[]{com.bumptech.glide.load.i[].class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : a3(iVarArr);
    }

    @n0
    @androidx.annotation.j
    public h Z1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.G8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.s();
    }

    @SafeVarargs
    @n0
    @androidx.annotation.j
    public final h Z2(@n0 com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.C8, new Class[]{com.bumptech.glide.load.i[].class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.Y0(iVarArr);
    }

    @n0
    @androidx.annotation.j
    public h a2(@n0 DownsampleStrategy downsampleStrategy) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downsampleStrategy}, this, changeQuickRedirect, false, bb.c.g.f33070r8, new Class[]{DownsampleStrategy.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.t(downsampleStrategy);
    }

    @n0
    @Deprecated
    @SafeVarargs
    @androidx.annotation.j
    public final h a3(@n0 com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        return (h) super.Z0(iVarArr);
    }

    @n0
    @androidx.annotation.j
    public h b3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.U7, new Class[]{Boolean.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.c1(z10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a c1(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.C9, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : b3(z10);
    }

    @n0
    @androidx.annotation.j
    public h c2(@n0 Bitmap.CompressFormat compressFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{compressFormat}, this, changeQuickRedirect, false, bb.c.g.f32970m8, new Class[]{Bitmap.CompressFormat.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.u(compressFormat);
    }

    @n0
    @androidx.annotation.j
    public h c3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.T7, new Class[]{Boolean.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.d1(z10);
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.F9, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : S1();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a d1(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.D9, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : c3(z10);
    }

    @n0
    @androidx.annotation.j
    public h e2(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32990n8, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.v(i10);
    }

    @n0
    @androidx.annotation.j
    public h g2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32791d8, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.w(i10);
    }

    @n0
    @androidx.annotation.j
    public h h2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32771c8, new Class[]{Drawable.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.x(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a i(@n0 com.bumptech.glide.request.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.g.N8, new Class[]{com.bumptech.glide.request.a.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : H1(aVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.L8, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : I1();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7003, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : K1();
    }

    @n0
    @androidx.annotation.j
    public h k2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32751b8, new Class[]{Integer.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.y(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Y8, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : N1();
    }

    @n0
    @androidx.annotation.j
    public h l2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32731a8, new Class[]{Drawable.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.z(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.W8, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Q1();
    }

    @n0
    @androidx.annotation.j
    public h m2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33170w8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.B();
    }

    @Override // com.bumptech.glide.request.a
    @androidx.annotation.j
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a clone() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7014, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : S1();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a o(@n0 Class cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, 7012, new Class[]{Class.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : T1(cls);
    }

    @n0
    @androidx.annotation.j
    public h o2(@n0 DecodeFormat decodeFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{decodeFormat}, this, changeQuickRedirect, false, bb.c.g.f33030p8, new Class[]{DecodeFormat.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.C(decodeFormat);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7007, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : V1();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a q(@n0 com.bumptech.glide.load.engine.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.A9, new Class[]{com.bumptech.glide.load.engine.h.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : W1(hVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a q0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.M8, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : s2();
    }

    @n0
    @androidx.annotation.j
    public h q2(@f0(from = 0) long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.g.f33010o8, new Class[]{Long.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.D(j10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.O8, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Y1();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a r0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.B9, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : v2(z10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a s() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.P8, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Z1();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a s0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7004, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : x2();
    }

    @n0
    public h s2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.J8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.q0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a t(@n0 DownsampleStrategy downsampleStrategy) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downsampleStrategy}, this, changeQuickRedirect, false, 7006, new Class[]{DownsampleStrategy.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : a2(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a t0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7000, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : y2();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a u(@n0 Bitmap.CompressFormat compressFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{compressFormat}, this, changeQuickRedirect, false, 7011, new Class[]{Bitmap.CompressFormat.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : c2(compressFormat);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a u0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.X8, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : z2();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a v(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 7010, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : e2(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a v0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7002, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : A2();
    }

    @n0
    @androidx.annotation.j
    public h v2(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.V7, new Class[]{Boolean.TYPE}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.r0(z10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a w(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33111t9, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : g2(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a x(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f33131u9, new Class[]{Drawable.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : h2(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a x0(@n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.S8, new Class[]{com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : B2(iVar);
    }

    @n0
    @androidx.annotation.j
    public h x2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33110t8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.s0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a y(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33151v9, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : k2(i10);
    }

    @n0
    @androidx.annotation.j
    public h y2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33190x8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.t0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a z(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f33171w9, new Class[]{Drawable.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : l2(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a z0(@n0 Class cls, @n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.R8, new Class[]{Class.class, com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : C2(cls, iVar);
    }

    @n0
    @androidx.annotation.j
    public h z2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33230z8, new Class[0], h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : (h) super.u0();
    }
}
