package com.max.mediaselector.lib.basic;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.max.mediaselector.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: FragmentInjectManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(FragmentActivity fragmentActivity, String str, Fragment fragment) {
        if (!PatchProxy.proxy(new Object[]{fragmentActivity, str, fragment}, null, changeQuickRedirect, true, bb.c.l.f34028ai, new Class[]{FragmentActivity.class, String.class, Fragment.class}, Void.TYPE).isSupported && com.max.mediaselector.lib.utils.a.b(fragmentActivity, str)) {
            fragmentActivity.getSupportFragmentManager().u().c(R.id.fragment_container, fragment, str).k(str).n();
        }
    }

    public static void b(FragmentManager fragmentManager, String str, Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragmentManager, str, fragment}, null, changeQuickRedirect, true, bb.c.l.f34051bi, new Class[]{FragmentManager.class, String.class, Fragment.class}, Void.TYPE).isSupported) {
            return;
        }
        fragmentManager.u().c(android.R.id.content, fragment, str).k(str).n();
    }
}
