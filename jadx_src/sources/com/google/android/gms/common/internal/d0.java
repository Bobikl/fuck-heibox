package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f52504a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("sLock")
    private static boolean f52505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private static String f52506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f52507d;

    public static int a(Context context) {
        c(context);
        return f52507d;
    }

    @androidx.annotation.p0
    public static String b(Context context) {
        c(context);
        return f52506c;
    }

    private static void c(Context context) {
        synchronized (f52504a) {
            if (f52505b) {
                return;
            }
            f52505b = true;
            try {
                Bundle bundle = com.google.android.gms.common.wrappers.e.a(context).c(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f52506c = bundle.getString("com.google.app.id");
                f52507d = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("MetadataValueReader", "This should never happen.", e10);
            }
        }
    }
}
