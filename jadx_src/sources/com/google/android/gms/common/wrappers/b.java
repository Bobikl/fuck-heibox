package com.google.android.gms.common.wrappers;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;
import z8.v;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f52652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private static Boolean f52653b;

    @v8.a
    public static synchronized boolean a(@n0 Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f52652a;
        if (context2 != null && (bool = f52653b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f52653b = null;
        if (v.n()) {
            f52653b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f52653b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f52653b = Boolean.FALSE;
            }
        }
        f52652a = applicationContext;
        return f52653b.booleanValue();
    }
}
