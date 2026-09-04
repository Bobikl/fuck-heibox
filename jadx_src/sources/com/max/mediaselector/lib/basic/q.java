package com.max.mediaselector.lib.basic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import com.max.mediaselector.lib.entity.LocalMedia;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: PictureSelector.java */
/* JADX INFO: loaded from: classes2.dex */
public final class q {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Activity> f74973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Fragment> f74974b;

    private q(Activity activity) {
        this(activity, null);
    }

    private q(Activity activity, Fragment fragment) {
        this.f74973a = new WeakReference<>(activity);
        this.f74974b = new WeakReference<>(fragment);
    }

    private q(Fragment fragment) {
        this(fragment.getActivity(), fragment);
    }

    public static q a(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.l.Lk, new Class[]{Activity.class}, q.class);
        return patchProxyResultProxy.isSupported ? (q) patchProxyResultProxy.result : new q(activity);
    }

    public static q b(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.l.Kk, new Class[]{Context.class}, q.class);
        return patchProxyResultProxy.isSupported ? (q) patchProxyResultProxy.result : new q((Activity) context);
    }

    public static q c(Fragment fragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment}, null, changeQuickRedirect, true, bb.c.l.Mk, new Class[]{Fragment.class}, q.class);
        return patchProxyResultProxy.isSupported ? (q) patchProxyResultProxy.result : new q(fragment);
    }

    public static ArrayList<LocalMedia> g(Intent intent) {
        ArrayList<LocalMedia> parcelableArrayListExtra;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{intent}, null, changeQuickRedirect, true, bb.c.l.Tk, new Class[]{Intent.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        return (intent == null || (parcelableArrayListExtra = intent.getParcelableArrayListExtra(com.max.mediaselector.lib.config.e.f75097b)) == null) ? new ArrayList<>() : parcelableArrayListExtra;
    }

    public static Intent l(ArrayList<LocalMedia> arrayList) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList}, null, changeQuickRedirect, true, bb.c.l.Sk, new Class[]{ArrayList.class}, Intent.class);
        return patchProxyResultProxy.isSupported ? (Intent) patchProxyResultProxy.result : new Intent().putParcelableArrayListExtra(com.max.mediaselector.lib.config.e.f75097b, arrayList);
    }

    public o d(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Qk, new Class[]{Integer.TYPE}, o.class);
        return patchProxyResultProxy.isSupported ? (o) patchProxyResultProxy.result : new o(this, i10);
    }

    @p0
    Activity e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Uk, new Class[0], Activity.class);
        return patchProxyResultProxy.isSupported ? (Activity) patchProxyResultProxy.result : this.f74973a.get();
    }

    @p0
    Fragment f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Vk, new Class[0], Fragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (Fragment) patchProxyResultProxy.result;
        }
        WeakReference<Fragment> weakReference = this.f74974b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public l h(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Ok, new Class[]{Integer.TYPE}, l.class);
        return patchProxyResultProxy.isSupported ? (l) patchProxyResultProxy.result : new l(this, i10);
    }

    public m i(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Nk, new Class[]{Integer.TYPE}, m.class);
        return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : new m(this, i10);
    }

    public n j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.Rk, new Class[0], n.class);
        return patchProxyResultProxy.isSupported ? (n) patchProxyResultProxy.result : new n(this);
    }

    public p k(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.l.Pk, new Class[]{Integer.TYPE}, p.class);
        return patchProxyResultProxy.isSupported ? (p) patchProxyResultProxy.result : new p(this, i10);
    }
}
