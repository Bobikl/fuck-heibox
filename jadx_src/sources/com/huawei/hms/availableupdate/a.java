package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: AppSpoofResolveMgr.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f60424c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f60425d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f60426a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<Activity> f60427b = new ArrayList(1);

    public AtomicBoolean a() {
        return this.f60426a;
    }

    public void a(Activity activity) {
        synchronized (f60425d) {
            for (Activity activity2 : this.f60427b) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.f60427b.add(activity);
        }
    }

    public void a(boolean z10) {
        this.f60426a.set(z10);
    }

    public void b(Activity activity) {
        synchronized (f60425d) {
            this.f60427b.remove(activity);
        }
    }
}
