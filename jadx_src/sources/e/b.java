package e;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: ActivityLifecycleDetector.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        f.b.b("%s.onCreate", activity);
        Iterator<a> it = c.f118528a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        f.b.b("%s.onDestroy", activity);
        Iterator<a> it = c.f118528a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        f.b.b("%s.onPause", activity);
        Iterator<a> it = c.f118528a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        f.b.b("%s.onResume", activity);
        Iterator<a> it = c.f118528a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f.b.b("%s.onSaveInstanceState", activity);
        Iterator<a> it = c.f118528a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        f.b.b("%s.onStart", activity);
        Iterator<a> it = c.f118528a.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        f.b.b("%s.onStop", activity);
        Iterator<a> it = c.f118528a.iterator();
        while (it.hasNext()) {
            it.next().a(activity);
        }
    }
}
