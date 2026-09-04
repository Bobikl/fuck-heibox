package com.billy.android.swipe;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.core.view.j1;
import com.billy.android.swipe.consumer.j;
import java.util.ArrayList;

/* JADX INFO: compiled from: SmartSwipeBack.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList<Activity> f40312a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static h f40313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f40314c;

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public static final class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f40315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40317c;

        /* JADX INFO: renamed from: com.billy.android.swipe.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SmartSwipeBack.java */
        public class C0317a extends r6.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f40318a;

            C0317a(Activity activity) {
                this.f40318a = activity;
            }

            @Override // r6.a, r6.b
            public void d(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10) {
                Activity activity = this.f40318a;
                if (activity != null) {
                    activity.finish();
                }
            }
        }

        a(int i10, int i11, int i12) {
            this.f40315a = i10;
            this.f40316b = i11;
            this.f40317c = i12;
        }

        @Override // com.billy.android.swipe.c.i
        public com.billy.android.swipe.f a(Activity activity) {
            return new j().g2(this.f40315a).x1(this.f40316b).v(this.f40317c).b(new C0317a(activity));
        }
    }

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f40320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40323d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f40324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f40325f;

        /* JADX INFO: compiled from: SmartSwipeBack.java */
        public class a extends r6.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f40326a;

            a(Activity activity) {
                this.f40326a = activity;
            }

            @Override // r6.a, r6.b
            public void d(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10) {
                Activity activity = this.f40326a;
                if (activity != null) {
                    activity.finish();
                    Activity activity2 = this.f40326a;
                    int i11 = R.anim.anim_none;
                    activity2.overridePendingTransition(i11, i11);
                }
            }
        }

        b(float f10, int i10, int i11, int i12, int i13, int i14) {
            this.f40320a = f10;
            this.f40321b = i10;
            this.f40322c = i11;
            this.f40323d = i12;
            this.f40324e = i13;
            this.f40325f = i14;
        }

        @Override // com.billy.android.swipe.c.i
        public com.billy.android.swipe.f a(Activity activity) {
            return new com.billy.android.swipe.consumer.c(activity).M2(this.f40320a).A2(this.f40321b).B2(this.f40322c).C2(this.f40323d).x1(this.f40324e).v(this.f40325f).b(new a(activity));
        }
    }

    /* JADX INFO: renamed from: com.billy.android.swipe.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public static final class C0318c implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f40328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40329b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40330c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40331d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f40332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f40333f;

        /* JADX INFO: renamed from: com.billy.android.swipe.c$c$a */
        /* JADX INFO: compiled from: SmartSwipeBack.java */
        public class a extends r6.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f40334a;

            a(Activity activity) {
                this.f40334a = activity;
            }

            @Override // r6.a, r6.b
            public void h(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10, float f10, float f11, float f12) {
                if (f10 >= 1.0f) {
                    this.f40334a.finish();
                }
            }
        }

        C0318c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f40328a = i10;
            this.f40329b = i11;
            this.f40330c = i12;
            this.f40331d = i13;
            this.f40332e = i14;
            this.f40333f = i15;
        }

        @Override // com.billy.android.swipe.c.i
        public com.billy.android.swipe.f a(Activity activity) {
            return new com.billy.android.swipe.consumer.d().m2(this.f40328a).k2(this.f40329b).n2(this.f40330c).C1(this.f40331d).b(new a(activity)).x1(this.f40332e).v(this.f40333f);
        }
    }

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public static final class d implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40339d;

        /* JADX INFO: compiled from: SmartSwipeBack.java */
        public class a extends r6.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f40340a;

            a(Activity activity) {
                this.f40340a = activity;
            }

            @Override // r6.a, r6.b
            public void d(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10) {
                this.f40340a.finish();
                Activity activity = this.f40340a;
                int i11 = R.anim.anim_none;
                activity.overridePendingTransition(i11, i11);
            }
        }

        d(boolean z10, int i10, int i11, int i12) {
            this.f40336a = z10;
            this.f40337b = i10;
            this.f40338c = i11;
            this.f40339d = i12;
        }

        @Override // com.billy.android.swipe.c.i
        public com.billy.android.swipe.f a(Activity activity) {
            return new com.billy.android.swipe.consumer.a(activity).r2(this.f40336a).t2(this.f40337b).v(this.f40338c).x1(this.f40339d).b(new a(activity));
        }
    }

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public static final class e implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f40342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f40343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f40344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f40345d;

        /* JADX INFO: compiled from: SmartSwipeBack.java */
        public class a extends r6.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Activity f40346a;

            a(Activity activity) {
                this.f40346a = activity;
            }

            @Override // r6.a, r6.b
            public void d(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.f fVar, int i10) {
                this.f40346a.finish();
                Activity activity = this.f40346a;
                int i11 = R.anim.anim_none;
                activity.overridePendingTransition(i11, i11);
            }
        }

        e(boolean z10, int i10, int i11, int i12) {
            this.f40342a = z10;
            this.f40343b = i10;
            this.f40344c = i11;
            this.f40345d = i12;
        }

        @Override // com.billy.android.swipe.c.i
        public com.billy.android.swipe.f a(Activity activity) {
            return new com.billy.android.swipe.consumer.b(activity).r2(this.f40342a).t2(this.f40343b).v(this.f40344c).x1(this.f40345d).b(new a(activity));
        }
    }

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public interface f {
        boolean a(Activity activity);
    }

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public static class g implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i f40348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private f f40349c;

        g(i iVar, f fVar) {
            this.f40348b = iVar;
            this.f40349c = fVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            c.f40312a.add(activity);
            if (this.f40348b == null) {
                return;
            }
            f fVar = this.f40349c;
            if (fVar == null || fVar.a(activity)) {
                com.billy.android.swipe.b.m(activity).addConsumer(this.f40348b.a(activity));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            c.f40312a.remove(activity);
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
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public interface h {
        Activity a(Activity activity);
    }

    /* JADX INFO: compiled from: SmartSwipeBack.java */
    public interface i {
        com.billy.android.swipe.f a(Activity activity);
    }

    public static void a(Application application, i iVar) {
        b(application, iVar, null);
    }

    public static void b(Application application, i iVar, f fVar) {
        g gVar = f40314c;
        if (gVar == null) {
            f40314c = new g(iVar, fVar);
        } else {
            application.unregisterActivityLifecycleCallbacks(gVar);
            f40314c.f40348b = iVar;
            f40314c.f40349c = fVar;
        }
        application.registerActivityLifecycleCallbacks(f40314c);
    }

    public static void c(Application application, f fVar) {
        d(application, fVar, com.billy.android.swipe.b.b(20, application));
    }

    public static void d(Application application, f fVar, int i10) {
        e(application, fVar, i10, com.billy.android.swipe.b.b(200, application), com.billy.android.swipe.b.b(30, application), j1.f21601t, -1, 1);
    }

    public static void e(Application application, f fVar, int i10, int i11, int i12, int i13, int i14, int i15) {
        b(application, new C0318c(i13, i14, i11, i12, i10, i15), fVar);
    }

    public static void f(Application application, f fVar) {
        g(application, fVar, 1, com.billy.android.swipe.b.b(20, application), Integer.MIN_VALUE, true);
    }

    public static void g(Application application, f fVar, int i10, int i11, int i12, boolean z10) {
        b(application, new d(z10, i12, i10, i11), fVar);
    }

    public static void h(Application application, f fVar) {
        i(application, fVar, 1, com.billy.android.swipe.b.b(20, application), Integer.MIN_VALUE, true);
    }

    public static void i(Application application, f fVar, int i10, int i11, int i12, boolean z10) {
        b(application, new e(z10, i12, i10, i11), fVar);
    }

    public static void j(Application application, f fVar) {
        k(application, fVar, 0.5f);
    }

    public static void k(Application application, f fVar, float f10) {
        l(application, fVar, com.billy.android.swipe.b.b(20, application), 0, Integer.MIN_VALUE, com.billy.android.swipe.b.b(10, application), f10, 1);
    }

    public static void l(Application application, f fVar, int i10, int i11, int i12, int i13, float f10, int i14) {
        b(application, new b(f10, i11, i12, i13, i10, i14), fVar);
    }

    public static void m(Application application, f fVar) {
        n(application, fVar, com.billy.android.swipe.b.b(20, application), 0, 1);
    }

    public static void n(Application application, f fVar, int i10, int i11, int i12) {
        b(application, new a(i11, i10, i12), fVar);
    }

    public static Activity o(Activity activity) {
        ArrayList<Activity> arrayList;
        int iIndexOf;
        h hVar = f40313b;
        if (hVar != null) {
            return hVar.a(activity);
        }
        if (activity == null || (iIndexOf = (arrayList = f40312a).indexOf(activity)) <= 0) {
            return null;
        }
        return arrayList.get(iIndexOf - 1);
    }

    public static void p(h hVar) {
        f40313b = hVar;
    }
}
