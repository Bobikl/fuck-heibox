package androidx.lifecycle;

import android.os.Handler;

/* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
public class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final a0 f24263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Handler f24264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private a f24265c;

    /* JADX INFO: compiled from: ServiceLifecycleDispatcher.kt */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final a0 f24266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private final Lifecycle.Event f24267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24268d;

        public a(@dl.d a0 registry, @dl.d Lifecycle.Event event) {
            kotlin.jvm.internal.f0.p(registry, "registry");
            kotlin.jvm.internal.f0.p(event, "event");
            this.f24266b = registry;
            this.f24267c = event;
        }

        @dl.d
        public final Lifecycle.Event a() {
            return this.f24267c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24268d) {
                return;
            }
            this.f24266b.l(this.f24267c);
            this.f24268d = true;
        }
    }

    public u0(@dl.d y provider) {
        kotlin.jvm.internal.f0.p(provider, "provider");
        this.f24263a = new a0(provider);
        this.f24264b = new Handler();
    }

    private final void f(Lifecycle.Event event) {
        a aVar = this.f24265c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f24263a, event);
        this.f24265c = aVar2;
        Handler handler = this.f24264b;
        kotlin.jvm.internal.f0.m(aVar2);
        handler.postAtFrontOfQueue(aVar2);
    }

    @dl.d
    public Lifecycle a() {
        return this.f24263a;
    }

    public void b() {
        f(Lifecycle.Event.ON_START);
    }

    public void c() {
        f(Lifecycle.Event.ON_CREATE);
    }

    public void d() {
        f(Lifecycle.Event.ON_STOP);
        f(Lifecycle.Event.ON_DESTROY);
    }

    public void e() {
        f(Lifecycle.Event.ON_START);
    }
}
