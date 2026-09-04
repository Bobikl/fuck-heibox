package com.igexin.push.core;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.exoplayer2.audio.q0;
import com.igexin.sdk.PushConsts;

/* JADX INFO: loaded from: classes.dex */
public class g implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f63742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f63743b;

    private void a(Activity activity) {
        try {
            com.igexin.a.a.c.b.a("GALC|" + activity.getComponentName().getClassName() + " onAStart " + this.f63743b, new Object[0]);
            if (this.f63743b == 0) {
                Context applicationContext = activity.getApplicationContext();
                if (com.igexin.push.util.d.a(applicationContext) || System.currentTimeMillis() - this.f63742a <= q0.f44202v) {
                    return;
                }
                Intent intent = new Intent(applicationContext, (Class<?>) com.igexin.push.core.a.e.a().a(applicationContext));
                intent.putExtra("action", PushConsts.ACTION_SERVICE_ONRESUME);
                x.a().a(applicationContext, intent);
                com.igexin.a.a.c.b.a("GALC|on fg, start>>>>>>", new Object[0]);
                this.f63742a = System.currentTimeMillis();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (activity == null) {
            return;
        }
        a(activity);
        this.f63743b++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity == null) {
            return;
        }
        int i10 = this.f63743b - 1;
        this.f63743b = i10;
        this.f63743b = Math.max(i10, 0);
        com.igexin.a.a.c.b.a("GALC|" + activity.getComponentName().getClassName() + " onAStopp " + this.f63743b, new Object[0]);
        if (this.f63743b == 0) {
            com.igexin.a.a.c.b.a("GALC|>>>>>> on bg", new Object[0]);
        }
    }
}
