package com.huawei.hms.hatool;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* JADX INFO: loaded from: classes7.dex */
public class q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static q1 f61020c = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f61021a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f61022b = q0.i();

    private q1() {
    }

    public static q1 b() {
        return f61020c;
    }

    @TargetApi(24)
    public boolean a() {
        boolean zIsUserUnlocked;
        if (!this.f61021a) {
            Context context = this.f61022b;
            if (context == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                UserManager userManager = (UserManager) context.getSystemService("user");
                if (userManager != null) {
                    zIsUserUnlocked = userManager.isUserUnlocked();
                } else {
                    this.f61021a = false;
                }
            } else {
                zIsUserUnlocked = true;
            }
            this.f61021a = zIsUserUnlocked;
        }
        return this.f61021a;
    }
}
