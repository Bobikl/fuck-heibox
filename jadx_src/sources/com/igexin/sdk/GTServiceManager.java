package com.igexin.sdk;

import android.app.Activity;
import com.igexin.push.core.x;

/* JADX INFO: loaded from: classes6.dex */
public class GTServiceManager {
    private GTServiceManager() {
    }

    public static GTServiceManager getInstance() {
        return c.f64091a;
    }

    public void onActivityCreate(Activity activity) {
        x.a().a(activity);
    }
}
