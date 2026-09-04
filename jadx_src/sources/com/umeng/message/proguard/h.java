package com.umeng.message.proguard;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f105802a;

    public static Uri a(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(f(context));
        builder.path("MsgAlias");
        return builder.build();
    }

    public static Uri b(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(f(context));
        builder.path("MsgAliasDeleteAll");
        return builder.build();
    }

    public static Uri c(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(f(context));
        builder.path("sp");
        return builder.build();
    }

    public static Uri d(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(f(context));
        builder.path("MsgLogStores");
        return builder.build();
    }

    public static Uri e(Context context) {
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("content");
        builder.authority(f(context));
        builder.path("InAppLogStores");
        return builder.build();
    }

    public static String f(Context context) {
        if (f105802a == null) {
            f105802a = context.getPackageName() + ".umeng.message";
        }
        return f105802a;
    }
}
