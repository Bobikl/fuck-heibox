package com.tencent.open.b;

import android.content.Context;
import android.text.TextUtils;
import android.view.WindowManager;
import java.util.Locale;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f101049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f101050b;

    public static String a() {
        return Locale.getDefault().getLanguage();
    }

    public static String a(Context context) {
        if (!TextUtils.isEmpty(f101049a)) {
            return f101049a;
        }
        if (context == null) {
            return "";
        }
        f101049a = "";
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            f101049a = windowManager.getDefaultDisplay().getWidth() + "x" + windowManager.getDefaultDisplay().getHeight();
        }
        return f101049a;
    }
}
