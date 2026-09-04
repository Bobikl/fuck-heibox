package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: AppLaunchChecker.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20074a = "android.support.AppLaunchChecker";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20075b = "startedFromLauncher";

    @Deprecated
    public o() {
    }

    public static boolean a(@androidx.annotation.n0 Context context) {
        return context.getSharedPreferences(f20074a, 0).getBoolean(f20075b, false);
    }

    public static void b(@androidx.annotation.n0 Activity activity) {
        Intent intent;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(f20074a, 0);
        if (sharedPreferences.getBoolean(f20075b, false) || (intent = activity.getIntent()) == null || !"android.intent.action.MAIN".equals(intent.getAction())) {
            return;
        }
        if (intent.hasCategory("android.intent.category.LAUNCHER") || intent.hasCategory(androidx.core.content.m.f20450e)) {
            sharedPreferences.edit().putBoolean(f20075b, true).apply();
        }
    }
}
