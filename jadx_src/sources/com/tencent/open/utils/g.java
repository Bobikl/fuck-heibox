package com.tencent.open.utils;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f101172a;

    public static final Context a() {
        Context context = f101172a;
        if (context == null) {
            return null;
        }
        return context;
    }

    public static final File a(String str) {
        return m.h(a(), str);
    }

    public static final void a(Context context) {
        f101172a = context;
    }

    public static final String b() {
        return a() == null ? "" : a().getPackageName();
    }

    public static final File c() {
        if (a() == null) {
            return null;
        }
        return a().getFilesDir();
    }

    public static final File d() {
        Context contextA = a();
        if (contextA != null) {
            return contextA.getCacheDir();
        }
        return null;
    }

    public static final File e() {
        return a((String) null);
    }
}
