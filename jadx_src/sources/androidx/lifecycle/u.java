package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.j1;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: LifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u f24261a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final AtomicBoolean f24262b = new AtomicBoolean(false);

    /* JADX INFO: compiled from: LifecycleDispatcher.kt */
    @j1
    public static final class a extends m {
        @Override // androidx.lifecycle.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@dl.d Activity activity, @dl.e Bundle bundle) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            ReportFragment.f24106c.d(activity);
        }
    }

    private u() {
    }

    @xh.m
    public static final void a(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        if (f24262b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.f0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
