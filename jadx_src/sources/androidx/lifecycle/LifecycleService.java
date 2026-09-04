package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: LifecycleService.kt */
/* JADX INFO: loaded from: classes6.dex */
public class LifecycleService extends Service implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final u0 f24039b = new u0(this);

    @Override // androidx.lifecycle.y
    @dl.d
    public Lifecycle getLifecycle() {
        return this.f24039b.a();
    }

    @Override // android.app.Service
    @androidx.annotation.i
    @dl.e
    public IBinder onBind(@dl.d Intent intent) {
        kotlin.jvm.internal.f0.p(intent, "intent");
        this.f24039b.b();
        return null;
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onCreate() {
        this.f24039b.c();
        super.onCreate();
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public void onDestroy() {
        this.f24039b.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @androidx.annotation.i
    @kotlin.k(message = "Deprecated in Java")
    public void onStart(@dl.e Intent intent, int i10) {
        this.f24039b.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    @androidx.annotation.i
    public int onStartCommand(@dl.e Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
