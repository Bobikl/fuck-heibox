package com.max.hbimage.image;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.f0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.net.URL;
import java.util.List;

/* JADX INFO: compiled from: GlideRequest.java */
/* JADX INFO: loaded from: classes10.dex */
public class i<TranscodeType> extends com.bumptech.glide.i<TranscodeType> implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;

    i(@n0 Glide glide, @n0 com.bumptech.glide.j jVar, @n0 Class<TranscodeType> cls, @n0 Context context) {
        super(glide, jVar, cls, context);
    }

    i(@n0 Class<TranscodeType> cls, @n0 com.bumptech.glide.i<?> iVar) {
        super(cls, iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a A0(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Yb, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : T2(i10);
    }

    @n0
    @androidx.annotation.j
    public i<File> A2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.G9, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : new i(File.class, this).d2(com.bumptech.glide.i.f40757p3);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a B() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Jb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : x2();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a B0(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.Zb, new Class[]{cls, cls}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : U2(i10, i11);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> B2(@p0 com.bumptech.glide.request.g<TranscodeType> gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.g.Aa, new Class[]{com.bumptech.glide.request.g.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.E1(gVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a C(@n0 DecodeFormat decodeFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{decodeFormat}, this, changeQuickRedirect, false, bb.c.g.Qb, new Class[]{DecodeFormat.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : y2(decodeFormat);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> C2(@p0 Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.Ia, new Class[]{Bitmap.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.g(bitmap);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a D(@f0(from = 0) long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.g.Rb, new Class[]{Long.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : z2(j10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> D2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.Ja, new Class[]{Drawable.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.c(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a E0(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32855gc, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : V2(i10);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i E1(@p0 com.bumptech.glide.request.g gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.g.f32894ib, new Class[]{com.bumptech.glide.request.g.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : B2(gVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> E2(@p0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.g.La, new Class[]{Uri.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.e(uri);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a F0(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32875hc, new Class[]{Drawable.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : W2(drawable);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: F1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i g(@p0 Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.Za, new Class[]{Bitmap.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : C2(bitmap);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> F2(@p0 File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.g.Ma, new Class[]{File.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.b(file);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: G1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i c(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.Ya, new Class[]{Drawable.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : D2(drawable);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> G2(@u0 @v @p0 Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.g.Na, new Class[]{Integer.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.h(num);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a H0(@n0 Priority priority) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{priority}, this, changeQuickRedirect, false, bb.c.g.f32895ic, new Class[]{Priority.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : X2(priority);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: H1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i e(@p0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.g.Wa, new Class[]{Uri.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : E2(uri);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> H2(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Ha, new Class[]{Object.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.d(obj);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: I1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i b(@p0 File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.g.Va, new Class[]{File.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : F2(file);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> I2(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.Ka, new Class[]{String.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.load(str);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: J1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i h(@u0 @v @p0 Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.g.Ua, new Class[]{Integer.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : G2(num);
    }

    @androidx.annotation.j
    @Deprecated
    public i<TranscodeType> J2(@p0 URL url) {
        return (i) super.a(url);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: K1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i d(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f32734ab, new Class[]{Object.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : H2(obj);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> K2(@p0 byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, bb.c.g.Oa, new Class[]{byte[].class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.f(bArr);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: L1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i load(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.Xa, new Class[]{String.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : I2(str);
    }

    @n0
    public i<TranscodeType> L2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33172wa, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.q0();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> M2(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.K9, new Class[]{Boolean.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.r0(z10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a N0(@n0 com.bumptech.glide.load.e eVar, @n0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, bb.c.g.Vb, new Class[]{com.bumptech.glide.load.e.class, Object.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Y2(eVar, obj);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @Deprecated
    /* JADX INFO: renamed from: N1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i a(@p0 URL url) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, bb.c.g.Ta, new Class[]{URL.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : J2(url);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> N2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32873ha, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.s0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a O0(@n0 com.bumptech.glide.load.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.g.Xb, new Class[]{com.bumptech.glide.load.c.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Z2(cVar);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: O1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i f(@p0 byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, bb.c.g.Sa, new Class[]{byte[].class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : K2(bArr);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> O2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32952la, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.t0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a P0(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.g.f32994nc, new Class[]{Float.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : a3(f10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> P2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32992na, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.u0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a Q0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f32735ac, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : b3(z10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> Q2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32912ja, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.v0();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a R0(@p0 Resources.Theme theme) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{theme}, this, changeQuickRedirect, false, bb.c.g.f32755bc, new Class[]{Resources.Theme.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : c3(theme);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> R2(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.f33072ra, new Class[]{com.bumptech.glide.load.i.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.x0(iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a S0(@f0(from = 0) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Nb, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : h3(i10);
    }

    @n0
    @androidx.annotation.j
    public <Y> i<TranscodeType> S2(@n0 Class<Y> cls, @n0 com.bumptech.glide.load.i<Y> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.f33092sa, new Class[]{Class.class, com.bumptech.glide.load.i.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.z0(cls, iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a T0(@n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.Eb, new Class[]{com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : i3(iVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> T2(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.W9, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.A0(i10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> U2(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.g.V9, new Class[]{cls, cls}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.B0(i10, i11);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> V2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.O9, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.E0(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a W0(@n0 Class cls, @n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.f33233zb, new Class[]{Class.class, com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : j3(cls, iVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> W2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.N9, new Class[]{Drawable.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.F0(drawable);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    @Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.i X1(float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.g.f32754bb, new Class[]{Float.TYPE}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : d3(f10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> X2(@n0 Priority priority) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{priority}, this, changeQuickRedirect, false, bb.c.g.M9, new Class[]{Priority.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.H0(priority);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a Y0(@n0 com.bumptech.glide.load.i[] iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.Db, new Class[]{com.bumptech.glide.load.i[].class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : k3(iVarArr);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i Y1(@p0 com.bumptech.glide.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.f32814eb, new Class[]{com.bumptech.glide.i.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : e3(iVar);
    }

    @n0
    @androidx.annotation.j
    public <Y> i<TranscodeType> Y2(@n0 com.bumptech.glide.load.e<Y> eVar, @n0 Y y10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{eVar, y10}, this, changeQuickRedirect, false, bb.c.g.Y9, new Class[]{com.bumptech.glide.load.e.class, Object.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.N0(eVar, y10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    @Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a Z0(@n0 com.bumptech.glide.load.i[] iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.Cb, new Class[]{com.bumptech.glide.load.i[].class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : l3(iVarArr);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i Z1(@p0 List list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f32774cb, new Class[]{List.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : f3(list);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> Z2(@n0 com.bumptech.glide.load.c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.g.X9, new Class[]{com.bumptech.glide.load.c.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.O0(cVar);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @androidx.annotation.j
    @Deprecated
    public /* bridge */ /* synthetic */ Object a(@p0 URL url) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, bb.c.g.f32993nb, new Class[]{URL.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : J2(url);
    }

    @Override // com.bumptech.glide.i
    @SafeVarargs
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i a2(@p0 com.bumptech.glide.i[] iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.f32794db, new Class[]{com.bumptech.glide.i[].class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : g3(iVarArr);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> a3(@x(from = 0.0d, to = com.google.android.material.color.utilities.d.f53848a) float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.g.H9, new Class[]{Float.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.P0(f10);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object b(@p0 File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.g.f33033pb, new Class[]{File.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : F2(file);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i b2(@n0 com.bumptech.glide.k kVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar}, this, changeQuickRedirect, false, bb.c.g.f32913jb, new Class[]{com.bumptech.glide.k.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : m3(kVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> b3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.U9, new Class[]{Boolean.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.Q0(z10);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object c(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f33093sb, new Class[]{Drawable.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : D2(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a c1(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f32954lc, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : n3(z10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> c2(@p0 com.bumptech.glide.request.g<TranscodeType> gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.g.Ba, new Class[]{com.bumptech.glide.request.g.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.e1(gVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> c3(@p0 Resources.Theme theme) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{theme}, this, changeQuickRedirect, false, bb.c.g.T9, new Class[]{Resources.Theme.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.R0(theme);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.request.a
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33014oc, new Class[0], Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i2();
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object d(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f32953lb, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : H2(obj);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a d1(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f32974mc, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : o3(z10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> d2(@n0 com.bumptech.glide.request.a<?> aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.g.f33212ya, new Class[]{com.bumptech.glide.request.a.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.i(aVar);
    }

    @n0
    @androidx.annotation.j
    @Deprecated
    public i<TranscodeType> d3(float f10) {
        return (i) super.X1(f10);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object e(@p0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.g.f33053qb, new Class[]{Uri.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : E2(uri);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i e1(@p0 com.bumptech.glide.request.g gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.g.f32874hb, new Class[]{com.bumptech.glide.request.g.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : c2(gVar);
    }

    @n0
    public i<TranscodeType> e2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33192xa, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.j();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> e3(@p0 com.bumptech.glide.i<TranscodeType> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.Ea, new Class[]{com.bumptech.glide.i.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.Y1(iVar);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object f(@p0 byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, bb.c.g.f32973mb, new Class[]{byte[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : K2(bArr);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> f2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32893ia, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.k();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> f3(@p0 List<com.bumptech.glide.i<TranscodeType>> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.Ga, new Class[]{List.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.Z1(list);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object g(@p0 Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.f33113tb, new Class[]{Bitmap.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : C2(bitmap);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: g1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i i(@n0 com.bumptech.glide.request.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.g.f32933kb, new Class[]{com.bumptech.glide.request.a.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : d2(aVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> g2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32972ma, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.l();
    }

    @SafeVarargs
    @n0
    @androidx.annotation.j
    public final i<TranscodeType> g3(@p0 com.bumptech.glide.i<TranscodeType>... iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.Fa, new Class[]{com.bumptech.glide.i[].class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.a2(iVarArr);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object h(@u0 @v @p0 Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.g.f33013ob, new Class[]{Integer.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : G2(num);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> h2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33012oa, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.m();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> h3(@f0(from = 0) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32853ga, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.S0(i10);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a i(@n0 com.bumptech.glide.request.a aVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, bb.c.g.f33173wb, new Class[]{com.bumptech.glide.request.a.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : d2(aVar);
    }

    @androidx.annotation.j
    public i<TranscodeType> i2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Pa, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.clone();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> i3(@n0 com.bumptech.glide.load.i<Bitmap> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.f33032pa, new Class[]{com.bumptech.glide.load.i.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.T0(iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33133ub, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : e2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> j2(@n0 Class<?> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, bb.c.g.Z9, new Class[]{Class.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.o(cls);
    }

    @n0
    @androidx.annotation.j
    public <Y> i<TranscodeType> j3(@n0 Class<Y> cls, @n0 com.bumptech.glide.load.i<Y> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.f33112ta, new Class[]{Class.class, com.bumptech.glide.load.i.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.W0(cls, iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a k() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Lb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : f2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> k2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32813ea, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.p();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> k3(@n0 com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVarArr}, this, changeQuickRedirect, false, bb.c.g.f33052qa, new Class[]{com.bumptech.glide.load.i[].class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.Y0(iVarArr);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Hb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : g2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> l2(@n0 com.bumptech.glide.load.engine.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.L9, new Class[]{com.bumptech.glide.load.engine.h.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.q(hVar);
    }

    @n0
    @androidx.annotation.j
    @Deprecated
    public i<TranscodeType> l3(@n0 com.bumptech.glide.load.i<Bitmap>... iVarArr) {
        return (i) super.Z0(iVarArr);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ Object load(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f33073rb, new Class[]{String.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : I2(str);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Fb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : h2();
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    /* JADX INFO: renamed from: m1 */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i clone() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Ra, new Class[0], com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : i2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> m2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33152va, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.r();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> m3(@n0 com.bumptech.glide.k<?, ? super TranscodeType> kVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{kVar}, this, changeQuickRedirect, false, bb.c.g.f33232za, new Class[]{com.bumptech.glide.k.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.b2(kVar);
    }

    @Override // com.bumptech.glide.i, com.bumptech.glide.request.a
    @androidx.annotation.j
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a clone() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Wb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : i2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> n2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33132ua, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.s();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> n3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.J9, new Class[]{Boolean.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.c1(z10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a o(@n0 Class cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, bb.c.g.Ub, new Class[]{Class.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : j2(cls);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> o2(@n0 DownsampleStrategy downsampleStrategy) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downsampleStrategy}, this, changeQuickRedirect, false, bb.c.g.f32833fa, new Class[]{DownsampleStrategy.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.t(downsampleStrategy);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> o3(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.I9, new Class[]{Boolean.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.d1(z10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a p() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Pb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : k2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> p2(@n0 Bitmap.CompressFormat compressFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{compressFormat}, this, changeQuickRedirect, false, bb.c.g.f32733aa, new Class[]{Bitmap.CompressFormat.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.u(compressFormat);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a q(@n0 com.bumptech.glide.load.engine.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.f32914jc, new Class[]{com.bumptech.glide.load.engine.h.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : l2(hVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a q0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33153vb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : L2();
    }

    @Override // com.bumptech.glide.i
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.i q1(@p0 com.bumptech.glide.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.f32854gb, new Class[]{com.bumptech.glide.i.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : t2(iVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> q2(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32753ba, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.v(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33193xb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : m2();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a r0(boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f32934kc, new Class[]{Boolean.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : M2(z10);
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i r1(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f32834fb, new Class[]{Object.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : u2(obj);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> r2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.S9, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.w(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a s() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33213yb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : n2();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a s0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Mb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : N2();
    }

    @Override // com.bumptech.glide.i
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i s1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Qa, new Class[0], com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : A2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> s2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.R9, new Class[]{Drawable.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.x(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a t(@n0 DownsampleStrategy downsampleStrategy) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{downsampleStrategy}, this, changeQuickRedirect, false, bb.c.g.Ob, new Class[]{DownsampleStrategy.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : o2(downsampleStrategy);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a t0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Ib, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : O2();
    }

    @n0
    public i<TranscodeType> t2(@p0 com.bumptech.glide.i<TranscodeType> iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.Ca, new Class[]{com.bumptech.glide.i.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.q1(iVar);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a u(@n0 Bitmap.CompressFormat compressFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{compressFormat}, this, changeQuickRedirect, false, bb.c.g.Tb, new Class[]{Bitmap.CompressFormat.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : p2(compressFormat);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a u0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Gb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : P2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> u2(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Da, new Class[]{Object.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.r1(obj);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a v(@f0(from = 0, to = AndroidComposeViewAccessibilityDelegateCompat.F) int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Sb, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : q2(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a v0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Kb, new Class[0], com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : Q2();
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> v2(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.Q9, new Class[]{Integer.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.y(i10);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a w(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32775cc, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : r2(i10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> w2(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.P9, new Class[]{Drawable.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.z(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a x(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32795dc, new Class[]{Drawable.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : s2(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a x0(@n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iVar}, this, changeQuickRedirect, false, bb.c.g.Bb, new Class[]{com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : R2(iVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> x2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32932ka, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.B();
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a y(@v int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32815ec, new Class[]{Integer.TYPE}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : v2(i10);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> y2(@n0 DecodeFormat decodeFormat) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{decodeFormat}, this, changeQuickRedirect, false, bb.c.g.f32793da, new Class[]{DecodeFormat.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.C(decodeFormat);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a z(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32835fc, new Class[]{Drawable.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : w2(drawable);
    }

    @Override // com.bumptech.glide.request.a
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.request.a z0(@n0 Class cls, @n0 com.bumptech.glide.load.i iVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls, iVar}, this, changeQuickRedirect, false, bb.c.g.Ab, new Class[]{Class.class, com.bumptech.glide.load.i.class}, com.bumptech.glide.request.a.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.request.a) patchProxyResultProxy.result : S2(cls, iVar);
    }

    @n0
    @androidx.annotation.j
    public i<TranscodeType> z2(@f0(from = 0) long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.g.f32773ca, new Class[]{Long.TYPE}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.D(j10);
    }
}
