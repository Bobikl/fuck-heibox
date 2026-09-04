package com.max.hbimage.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u0;
import androidx.annotation.v;
import com.bumptech.glide.Glide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.net.URL;

/* JADX INFO: compiled from: GlideRequests.java */
/* JADX INFO: loaded from: classes10.dex */
public class j extends com.bumptech.glide.j {
    public static ChangeQuickRedirect changeQuickRedirect;

    public j(@n0 Glide glide, @n0 com.bumptech.glide.manager.j jVar, @n0 com.bumptech.glide.manager.o oVar, @n0 Context context) {
        super(glide, jVar, oVar, context);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: A */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i c(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.Uc, new Class[]{Drawable.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : g0(drawable);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: B */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i e(@p0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.g.Sc, new Class[]{Uri.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : h0(uri);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: C */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i b(@p0 File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.g.Rc, new Class[]{File.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : i0(file);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: D */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i h(@u0 @v @p0 Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.g.Qc, new Class[]{Integer.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : j0(num);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: E */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i d(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Nc, new Class[]{Object.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : k0(obj);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: F */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i load(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.Tc, new Class[]{String.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : l0(str);
    }

    @Override // com.bumptech.glide.j
    @androidx.annotation.j
    @Deprecated
    /* JADX INFO: renamed from: G */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i a(@p0 URL url) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, bb.c.g.Pc, new Class[]{URL.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : m0(url);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: H */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i f(@p0 byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, bb.c.g.Oc, new Class[]{byte[].class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : n0(bArr);
    }

    @Override // com.bumptech.glide.j
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.j O(@n0 com.bumptech.glide.request.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.f32756bd, new Class[]{com.bumptech.glide.request.h.class}, com.bumptech.glide.j.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.j) patchProxyResultProxy.result : o0(hVar);
    }

    @Override // com.bumptech.glide.j
    public void Q(@n0 com.bumptech.glide.request.h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.Ic, new Class[]{com.bumptech.glide.request.h.class}, Void.TYPE).isSupported) {
            return;
        }
        if (hVar instanceof h) {
            super.Q(hVar);
        } else {
            super.Q(new h().H1(hVar));
        }
    }

    @n0
    public j V(com.bumptech.glide.request.g<Object> gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.g.f33114tc, new Class[]{com.bumptech.glide.request.g.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : (j) super.i(gVar);
    }

    @n0
    public synchronized j W(@n0 com.bumptech.glide.request.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.f33054qc, new Class[]{com.bumptech.glide.request.h.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        return (j) super.j(hVar);
    }

    @n0
    @androidx.annotation.j
    public <ResourceType> i<ResourceType> X(@n0 Class<ResourceType> cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, bb.c.g.f33034pc, new Class[]{Class.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : new i<>(this.f40801b, this, cls, this.f40802c);
    }

    @n0
    @androidx.annotation.j
    public i<Bitmap> Y() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33134uc, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.l();
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> Z() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33174wc, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.m();
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @androidx.annotation.j
    @Deprecated
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> a(@p0 URL url) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url}, this, changeQuickRedirect, false, bb.c.g.f32836fd, new Class[]{URL.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : m0(url);
    }

    @n0
    @androidx.annotation.j
    public i<File> a0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Hc, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.n();
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> b(@p0 File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.g.f32876hd, new Class[]{File.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : i0(file);
    }

    @n0
    @androidx.annotation.j
    public i<com.bumptech.glide.load.resource.gif.c> b0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33154vc, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.o();
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> c(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f32935kd, new Class[]{Drawable.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : g0(drawable);
    }

    @n0
    public synchronized j c0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33094sc, new Class[0], j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        return (j) super.r();
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> d(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f32796dd, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : k0(obj);
    }

    @n0
    @androidx.annotation.j
    public i<File> d0(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Gc, new Class[]{Object.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.t(obj);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> e(@p0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.g.f32896id, new Class[]{Uri.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : h0(uri);
    }

    @n0
    @androidx.annotation.j
    public i<File> e0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Fc, new Class[0], i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.u();
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> f(@p0 byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, bb.c.g.f32816ed, new Class[]{byte[].class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : n0(bArr);
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> f0(@p0 Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.f33194xc, new Class[]{Bitmap.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.g(bitmap);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> g(@p0 Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.f32955ld, new Class[]{Bitmap.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : f0(bitmap);
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> g0(@p0 Drawable drawable) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.g.f33214yc, new Class[]{Drawable.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.c(drawable);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> h(@u0 @v @p0 Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.g.f32856gd, new Class[]{Integer.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : j0(num);
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> h0(@p0 Uri uri) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, bb.c.g.Ac, new Class[]{Uri.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.e(uri);
    }

    @Override // com.bumptech.glide.j
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.j i(com.bumptech.glide.request.g gVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gVar}, this, changeQuickRedirect, false, bb.c.g.Zc, new Class[]{com.bumptech.glide.request.g.class}, com.bumptech.glide.j.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.j) patchProxyResultProxy.result : V(gVar);
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> i0(@p0 File file) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{file}, this, changeQuickRedirect, false, bb.c.g.Bc, new Class[]{File.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.b(file);
    }

    @Override // com.bumptech.glide.j
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.j j(@n0 com.bumptech.glide.request.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.f32776cd, new Class[]{com.bumptech.glide.request.h.class}, com.bumptech.glide.j.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.j) patchProxyResultProxy.result : W(hVar);
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> j0(@u0 @v @p0 Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.g.Cc, new Class[]{Integer.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.h(num);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i k(@n0 Class cls) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cls}, this, changeQuickRedirect, false, bb.c.g.Jc, new Class[]{Class.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : X(cls);
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> k0(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Ec, new Class[]{Object.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.d(obj);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i l() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Yc, new Class[0], com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : Y();
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> l0(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f33234zc, new Class[]{String.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.load(str);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [com.bumptech.glide.i<android.graphics.drawable.Drawable>, java.lang.Object] */
    @Override // com.bumptech.glide.j, com.bumptech.glide.g
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i<Drawable> load(@p0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f32915jd, new Class[]{String.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : l0(str);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Wc, new Class[0], com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : Z();
    }

    @androidx.annotation.j
    @Deprecated
    public i<Drawable> m0(@p0 URL url) {
        return (i) super.a(url);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i n() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Kc, new Class[0], com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : a0();
    }

    @n0
    @androidx.annotation.j
    public i<Drawable> n0(@p0 byte[] bArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bArr}, this, changeQuickRedirect, false, bb.c.g.Dc, new Class[]{byte[].class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : (i) super.f(bArr);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i o() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Xc, new Class[0], com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : b0();
    }

    @n0
    public synchronized j o0(@n0 com.bumptech.glide.request.h hVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.f33074rc, new Class[]{com.bumptech.glide.request.h.class}, j.class);
        if (patchProxyResultProxy.isSupported) {
            return (j) patchProxyResultProxy.result;
        }
        return (j) super.O(hVar);
    }

    @Override // com.bumptech.glide.j
    @n0
    public /* bridge */ /* synthetic */ com.bumptech.glide.j r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32736ad, new Class[0], com.bumptech.glide.j.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.j) patchProxyResultProxy.result : c0();
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i t(@p0 Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.Lc, new Class[]{Object.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : d0(obj);
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    public /* bridge */ /* synthetic */ com.bumptech.glide.i u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Mc, new Class[0], com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : e0();
    }

    @Override // com.bumptech.glide.j
    @n0
    @androidx.annotation.j
    /* JADX INFO: renamed from: z */
    public /* bridge */ /* synthetic */ com.bumptech.glide.i g(@p0 Bitmap bitmap) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, bb.c.g.Vc, new Class[]{Bitmap.class}, com.bumptech.glide.i.class);
        return patchProxyResultProxy.isSupported ? (com.bumptech.glide.i) patchProxyResultProxy.result : f0(bitmap);
    }
}
