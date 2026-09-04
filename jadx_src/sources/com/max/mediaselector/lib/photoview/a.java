package com.max.mediaselector.lib.photoview;

import android.annotation.TargetApi;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: Compat.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    a() {
    }

    public static void a(View view, Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{view, runnable}, null, changeQuickRedirect, true, bb.c.m.T2, new Class[]{View.class, Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        b(view, runnable);
    }

    @TargetApi(16)
    private static void b(View view, Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{view, runnable}, null, changeQuickRedirect, true, bb.c.m.U2, new Class[]{View.class, Runnable.class}, Void.TYPE).isSupported) {
            return;
        }
        view.postOnAnimation(runnable);
    }
}
