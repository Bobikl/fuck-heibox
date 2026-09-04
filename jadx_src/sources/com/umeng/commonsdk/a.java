package com.umeng.commonsdk;

import android.content.Context;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: UMInnerManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Class<?> f105058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f105059b;

    static {
        try {
            Class<?> cls = Class.forName("com.umeng.commonsdk.UMInnerImpl");
            f105058a = cls;
            Method declaredMethod = cls.getDeclaredMethod("initAndSendInternal", Context.class);
            if (declaredMethod != null) {
                f105059b = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context) {
        Method method;
        if (context == null || !UMUtils.isMainProgress(context)) {
            return;
        }
        if (SdkVersion.SDK_TYPE == 1) {
            UMConfigureInternation.sendInternal(context);
            return;
        }
        Class<?> cls = f105058a;
        if (cls == null || (method = f105059b) == null) {
            return;
        }
        try {
            method.invoke(cls, context);
        } catch (Throwable unused) {
        }
    }
}
