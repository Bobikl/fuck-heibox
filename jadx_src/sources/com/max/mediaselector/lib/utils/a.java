package com.max.mediaselector.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityCompatHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f75521a = 1;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, bb.c.m.f35105w7, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (context instanceof Activity) {
            return !d((Activity) context);
        }
        if (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() instanceof Activity) {
                return !d((Activity) contextWrapper.getBaseContext());
            }
        }
        return true;
    }

    public static boolean b(FragmentActivity fragmentActivity, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentActivity, str}, null, changeQuickRedirect, true, bb.c.m.f35083v7, new Class[]{FragmentActivity.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !d(fragmentActivity) && fragmentActivity.getSupportFragmentManager().s0(str) == null;
    }

    public static boolean c(FragmentActivity fragmentActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragmentActivity}, null, changeQuickRedirect, true, bb.c.m.f35127x7, new Class[]{FragmentActivity.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !d(fragmentActivity) && fragmentActivity.getSupportFragmentManager().C0() == 1;
    }

    public static boolean d(Activity activity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, bb.c.m.f35061u7, new Class[]{Activity.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
