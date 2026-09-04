package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: EmptyActivityLifecycleCallbacks.kt */
/* JADX INFO: loaded from: classes6.dex */
public class m implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@dl.d Activity activity, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@dl.d Activity activity) {
        kotlin.jvm.internal.f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@dl.d Activity activity) {
        kotlin.jvm.internal.f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@dl.d Activity activity) {
        kotlin.jvm.internal.f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@dl.d Activity activity, @dl.d Bundle outState) {
        kotlin.jvm.internal.f0.p(activity, "activity");
        kotlin.jvm.internal.f0.p(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@dl.d Activity activity) {
        kotlin.jvm.internal.f0.p(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@dl.d Activity activity) {
        kotlin.jvm.internal.f0.p(activity, "activity");
    }
}
