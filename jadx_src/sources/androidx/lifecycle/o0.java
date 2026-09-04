package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.j1;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class o0 implements y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f24223k = 700;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24226c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private Handler f24229f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final b f24222j = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final o0 f24224l = new o0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24227d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f24228e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final a0 f24230g = new a0(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final Runnable f24231h = new Runnable() { // from class: androidx.lifecycle.m0
        @Override // java.lang.Runnable
        public final void run() {
            o0.i(this.f24220b);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final ReportFragment.a f24232i = new d();

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @androidx.annotation.w0(29)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final a f24233a = new a();

        private a() {
        }

        @androidx.annotation.u
        @xh.m
        public static final void a(@dl.d Activity activity, @dl.d Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            kotlin.jvm.internal.f0.p(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j1
        public static /* synthetic */ void b() {
        }

        @dl.d
        @xh.m
        public final y a() {
            return o0.f24224l;
        }

        @xh.m
        public final void c(@dl.d Context context) {
            kotlin.jvm.internal.f0.p(context, "context");
            o0.f24224l.h(context);
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    public static final class c extends m {

        /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
        public static final class a extends m {
            final /* synthetic */ o0 this$0;

            a(o0 o0Var) {
                this.this$0 = o0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@dl.d Activity activity) {
                kotlin.jvm.internal.f0.p(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@dl.d Activity activity) {
                kotlin.jvm.internal.f0.p(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@dl.d Activity activity, @dl.e Bundle bundle) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.f24106c.b(activity).h(o0.this.f24232i);
            }
        }

        @Override // androidx.lifecycle.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            o0.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @androidx.annotation.w0(29)
        public void onActivityPreCreated(@dl.d Activity activity, @dl.e Bundle bundle) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            a.a(activity, new a(o0.this));
        }

        @Override // androidx.lifecycle.m, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            o0.this.g();
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    public static final class d implements ReportFragment.a {
        d() {
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onCreate() {
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onResume() {
            o0.this.e();
        }

        @Override // androidx.lifecycle.ReportFragment.a
        public void onStart() {
            o0.this.f();
        }
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(o0 this$0) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.j();
        this$0.k();
    }

    @dl.d
    @xh.m
    public static final y l() {
        return f24222j.a();
    }

    @xh.m
    public static final void m(@dl.d Context context) {
        f24222j.c(context);
    }

    public final void d() {
        int i10 = this.f24226c - 1;
        this.f24226c = i10;
        if (i10 == 0) {
            Handler handler = this.f24229f;
            kotlin.jvm.internal.f0.m(handler);
            handler.postDelayed(this.f24231h, 700L);
        }
    }

    public final void e() {
        int i10 = this.f24226c + 1;
        this.f24226c = i10;
        if (i10 == 1) {
            if (this.f24227d) {
                this.f24230g.l(Lifecycle.Event.ON_RESUME);
                this.f24227d = false;
            } else {
                Handler handler = this.f24229f;
                kotlin.jvm.internal.f0.m(handler);
                handler.removeCallbacks(this.f24231h);
            }
        }
    }

    public final void f() {
        int i10 = this.f24225b + 1;
        this.f24225b = i10;
        if (i10 == 1 && this.f24228e) {
            this.f24230g.l(Lifecycle.Event.ON_START);
            this.f24228e = false;
        }
    }

    public final void g() {
        this.f24225b--;
        k();
    }

    @Override // androidx.lifecycle.y
    @dl.d
    public Lifecycle getLifecycle() {
        return this.f24230g;
    }

    public final void h(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.f24229f = new Handler();
        this.f24230g.l(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.f0.n(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f24226c == 0) {
            this.f24227d = true;
            this.f24230g.l(Lifecycle.Event.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f24225b == 0 && this.f24227d) {
            this.f24230g.l(Lifecycle.Event.ON_STOP);
            this.f24228e = true;
        }
    }
}
