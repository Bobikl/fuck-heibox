package com.max.hbimage.image;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.View;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;

/* JADX INFO: compiled from: GlideApp.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    public static ChangeQuickRedirect changeQuickRedirect;

    private g() {
    }

    @j1
    @SuppressLint({"VisibleForTests"})
    public static void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32969m7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Glide.d();
    }

    @n0
    public static Glide b(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.g.f32909j7, new Class[]{Context.class}, Glide.class);
        return patchProxyResultProxy.isSupported ? (Glide) patchProxyResultProxy.result : Glide.e(context);
    }

    @p0
    public static File c(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.g.f32870h7, new Class[]{Context.class}, File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : Glide.l(context);
    }

    @p0
    public static File d(@n0 Context context, @n0 String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.g.f32890i7, new Class[]{Context.class, String.class}, File.class);
        return patchProxyResultProxy.isSupported ? (File) patchProxyResultProxy.result : Glide.m(context, str);
    }

    @j1
    @SuppressLint({"VisibleForTests"})
    public static void e(@n0 Context context, @n0 com.bumptech.glide.c cVar) {
        if (PatchProxy.proxy(new Object[]{context, cVar}, null, changeQuickRedirect, true, bb.c.g.f32929k7, new Class[]{Context.class, com.bumptech.glide.c.class}, Void.TYPE).isSupported) {
            return;
        }
        Glide.q(context, cVar);
    }

    @j1
    @SuppressLint({"VisibleForTests"})
    @Deprecated
    public static void f(Glide glide) {
        Glide.r(glide);
    }

    @j1
    @SuppressLint({"VisibleForTests"})
    public static void g() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32949l7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Glide.u();
    }

    @j1
    @SuppressLint({"VisibleForTests"})
    public static void h() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.g.f32989n7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Glide.z();
    }

    @n0
    @Deprecated
    public static j i(@n0 Activity activity) {
        return (j) Glide.D(activity);
    }

    @n0
    @Deprecated
    public static j j(@n0 Fragment fragment) {
        return (j) Glide.E(fragment);
    }

    @n0
    public static j k(@n0 Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.g.f33009o7, new Class[]{Context.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : (j) Glide.F(context);
    }

    @n0
    public static j l(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.f33069r7, new Class[]{View.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : (j) Glide.G(view);
    }

    @n0
    public static j m(@n0 androidx.fragment.app.Fragment fragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment}, null, changeQuickRedirect, true, bb.c.g.f33049q7, new Class[]{androidx.fragment.app.Fragment.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : (j) Glide.H(fragment);
    }

    @n0
    public static j n(@n0 FragmentActivity fragmentActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentActivity}, null, changeQuickRedirect, true, bb.c.g.f33029p7, new Class[]{FragmentActivity.class}, j.class);
        return patchProxyResultProxy.isSupported ? (j) patchProxyResultProxy.result : (j) Glide.I(fragmentActivity);
    }
}
