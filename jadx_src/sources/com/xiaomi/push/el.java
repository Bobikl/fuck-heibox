package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class el implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f107040a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private String f336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f107041b;

    public el(Context context, String str) {
        this.f107040a = context;
        this.f336a = str;
    }

    private void a(String str) {
        iv ivVar = new iv();
        ivVar.a(str);
        ivVar.a(System.currentTimeMillis());
        ivVar.a(ip.ActivityActiveTimeStamp);
        et.a(this.f107040a, ivVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (TextUtils.isEmpty(this.f336a) || TextUtils.isEmpty(localClassName)) {
            return;
        }
        this.f107041b = "";
        if (!TextUtils.isEmpty("") && !TextUtils.equals(this.f107041b, localClassName)) {
            this.f336a = "";
            return;
        }
        a(this.f107040a.getPackageName() + "|" + localClassName + ":" + this.f336a + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(System.currentTimeMillis() / 1000));
        this.f336a = "";
        this.f107041b = "";
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f107041b)) {
            this.f107041b = activity.getLocalClassName();
        }
        this.f336a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
