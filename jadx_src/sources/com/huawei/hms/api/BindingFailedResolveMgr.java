package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class BindingFailedResolveMgr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final BindingFailedResolveMgr f60373b = new BindingFailedResolveMgr();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60374c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<Activity> f60375a = new ArrayList(1);

    BindingFailedResolveMgr() {
    }

    void a(Activity activity) {
        synchronized (f60374c) {
            for (Activity activity2 : this.f60375a) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f60375a.add(activity);
        }
    }

    void b(Activity activity) {
        synchronized (f60374c) {
            this.f60375a.remove(activity);
        }
    }
}
