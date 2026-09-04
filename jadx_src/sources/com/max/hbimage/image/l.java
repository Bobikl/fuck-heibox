package com.max.hbimage.image;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: ImageLoaderRefManager.java */
/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f70475a;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Context a() {
        return f70475a;
    }

    public static void b(Context context) {
        f70475a = context;
    }
}
