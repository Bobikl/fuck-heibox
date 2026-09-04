package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.sina.weibo.BuildConfig;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.openapi.SdkListener;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f96800a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AuthInfo f96801b;

    public static AuthInfo a() {
        if (f96800a) {
            return f96801b;
        }
        throw new RuntimeException("please init sdk before use it. Wb.install()");
    }

    public static void a(AuthInfo authInfo, SdkListener sdkListener) {
        if (f96800a) {
            return;
        }
        if (authInfo == null) {
            throw new RuntimeException("authInfo must not be null.");
        }
        f96801b = authInfo;
        f96800a = true;
        if (sdkListener != null) {
            sdkListener.onInitSuccess();
        }
    }

    public static boolean a(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        String[] strArr = {BuildConfig.APPLICATION_ID, "com.sina.weibog3"};
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            Intent intent = new Intent("com.sina.weibo.action.sdkidentity");
            intent.setPackage(str);
            intent.addCategory("android.intent.category.DEFAULT");
            if (context != null && (listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0)) != null && !listQueryIntentServices.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context) {
        com.sina.weibo.sdk.b.a.C0922a c0922aE;
        return a(context) && (c0922aE = com.sina.weibo.sdk.b.a.e(context)) != null && c0922aE.f96817ah >= 10772;
    }
}
