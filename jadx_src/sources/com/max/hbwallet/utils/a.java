package com.max.hbwallet.utils;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: CouponUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(List<Fragment> list, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, null, changeQuickRedirect, true, bb.c.l.K5, new Class[]{List.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.hbcommon.utils.c.w(list)) {
            for (Fragment fragment : list) {
                if (((fragment instanceof c) && str.equals(((c) fragment).j2())) || a(fragment.getChildFragmentManager().J0(), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Activity activity, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, str}, null, changeQuickRedirect, true, bb.c.l.J5, new Class[]{Activity.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (activity instanceof FragmentActivity) {
            return a(((FragmentActivity) activity).getSupportFragmentManager().J0(), str);
        }
        return false;
    }

    public static boolean c(String str) {
        Activity activity;
        boolean z10 = true;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.l.I5, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        ob.a aVar = ob.a.f132240a;
        List<WeakReference<Activity>> listA = ob.a.b().a();
        Activity activity2 = null;
        if (listA.size() <= 0) {
            z10 = false;
            break;
        }
        int size = listA.size() - 1;
        while (true) {
            if (size < 0) {
                z10 = false;
                break;
            }
            Activity activity3 = listA.get(size).get();
            if (b(activity3, str)) {
                activity2 = activity3;
                break;
            }
            size--;
        }
        if (z10) {
            ListIterator<WeakReference<Activity>> listIterator = listA.listIterator(listA.size());
            while (listIterator.hasPrevious() && activity2 != (activity = listIterator.previous().get())) {
                listIterator.remove();
                activity.finish();
            }
        }
        return z10;
    }
}
