package com.bumptech.glide.signature;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: ApplicationVersionSignature.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f41967a = "AppVersionSignature";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentMap<String, com.bumptech.glide.load.c> f41968b = new ConcurrentHashMap();

    private b() {
    }

    @p0
    private static PackageInfo a(@n0 Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f41967a, "Cannot resolve info for" + context.getPackageName(), e10);
            return null;
        }
    }

    @n0
    private static String b(@p0 PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @n0
    public static com.bumptech.glide.load.c c(@n0 Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, com.bumptech.glide.load.c> concurrentMap = f41968b;
        com.bumptech.glide.load.c cVar = concurrentMap.get(packageName);
        if (cVar != null) {
            return cVar;
        }
        com.bumptech.glide.load.c cVarD = d(context);
        com.bumptech.glide.load.c cVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, cVarD);
        return cVarPutIfAbsent == null ? cVarD : cVarPutIfAbsent;
    }

    @n0
    private static com.bumptech.glide.load.c d(@n0 Context context) {
        return new e(b(a(context)));
    }

    @j1
    static void e() {
        f41968b.clear();
    }
}
