package com.max.mediaselector.lib.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.max.mediaselector.lib.thread.PictureThreadUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ToastUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f75564a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f75565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f75566c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ToastUtils.java */
    public class a implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f75567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f75568c;

        a(Context context, String str) {
            this.f75567b = context;
            this.f75568c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.S9, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Context contextB = ke.b.d().b();
            if (contextB == null) {
                contextB = this.f75567b.getApplicationContext();
            }
            Toast.makeText(contextB, this.f75568c, 0).show();
            String unused = t.f75566c = this.f75568c;
        }
    }

    public static boolean b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.R9, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f75565b < 1000) {
            return true;
        }
        f75565b = jCurrentTimeMillis;
        return false;
    }

    public static void c(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.Q9, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (b() && TextUtils.equals(str, f75566c)) {
            return;
        }
        Context contextB = ke.b.d().b();
        if (contextB == null) {
            contextB = context.getApplicationContext();
        }
        if (!PictureThreadUtils.r0()) {
            PictureThreadUtils.s0(new a(context, str));
        } else {
            Toast.makeText(contextB, str, 0).show();
            f75566c = str;
        }
    }
}
