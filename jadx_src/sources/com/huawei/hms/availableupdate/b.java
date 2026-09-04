package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: NotInstalledHmsResolveMgr.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f60428b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60429c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Activity> f60430a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f60429c) {
            for (Activity activity2 : this.f60430a) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f60430a.add(activity);
        }
    }

    public void b(Activity activity) {
        synchronized (f60429c) {
            this.f60430a.remove(activity);
        }
    }
}
