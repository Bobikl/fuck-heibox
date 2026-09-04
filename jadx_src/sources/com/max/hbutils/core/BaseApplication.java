package com.max.hbutils.core;

import android.app.Application;
import android.content.Context;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes13.dex */
public class BaseApplication extends Application {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BaseApplication f73450b;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static BaseApplication a() {
        return f73450b;
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.k.On, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.attachBaseContext(context);
        f73450b = this;
    }
}
