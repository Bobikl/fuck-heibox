package com.max.mediaselector.utils;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ContextHoleder.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Context f75682a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Context a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34608ab, new Class[0], Context.class);
        if (patchProxyResultProxy.isSupported) {
            return (Context) patchProxyResultProxy.result;
        }
        if (f75682a == null) {
            b();
        }
        return f75682a;
    }

    private static void b() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.m.f34631bb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
            if (application == null) {
                application = (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, null);
            }
            f75682a = application.getApplicationContext();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
