package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.annotation.k0;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.utils.a0;
import androidx.work.n;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemAlarmService extends LifecycleService implements g.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f28842e = n.i("SystemAlarmService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f28843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28844d;

    @k0
    private void e() {
        g gVar = new g(this);
        this.f28843c = gVar;
        gVar.l(this);
    }

    @Override // androidx.work.impl.background.systemalarm.g.c
    @k0
    public void b() {
        this.f28844d = true;
        n.e().a(f28842e, "All commands completed in dispatcher");
        a0.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f28844d = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f28844d = true;
        this.f28843c.j();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f28844d) {
            n.e().f(f28842e, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f28843c.j();
            e();
            this.f28844d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f28843c.a(intent, i11);
        return 3;
    }
}
