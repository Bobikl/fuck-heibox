package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: UpdateAdapterMgr.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f60431b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f60432a;

    private Activity a() {
        WeakReference<Activity> weakReference = this.f60432a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public boolean a(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityCreate");
        Activity activityA = a();
        if (activityA == null || activityA.isFinishing()) {
            this.f60432a = new WeakReference<>(activity);
            return true;
        }
        activity.finish();
        HMSLog.i("UpdateAdapterMgr", "finish one");
        return false;
    }

    public void b(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityDestroy");
        Activity activityA = a();
        if (activity == null || !activity.equals(activityA)) {
            return;
        }
        HMSLog.i("UpdateAdapterMgr", "reset");
        this.f60432a = null;
    }
}
