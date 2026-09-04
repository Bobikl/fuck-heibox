package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: ReportFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ReportFragment extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final b f24106c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f24107d = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private a f24108b;

    /* JADX INFO: compiled from: ReportFragment.kt */
    public interface a {
        void onCreate();

        void onResume();

        void onStart();
    }

    /* JADX INFO: compiled from: ReportFragment.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void c(Activity activity) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @xh.m
        public final void a(@dl.d Activity activity, @dl.d Lifecycle.Event event) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            kotlin.jvm.internal.f0.p(event, "event");
            if (activity instanceof c0) {
                ((c0) activity).getLifecycle().l(event);
            } else if (activity instanceof y) {
                Lifecycle lifecycle = ((y) activity).getLifecycle();
                if (lifecycle instanceof a0) {
                    ((a0) lifecycle).l(event);
                }
            }
        }

        @dl.d
        @xh.h(name = "get")
        public final ReportFragment b(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag(ReportFragment.f24107d);
            kotlin.jvm.internal.f0.n(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) fragmentFindFragmentByTag;
        }

        @xh.m
        public final void d(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(ReportFragment.f24107d) == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), ReportFragment.f24107d).commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* JADX INFO: compiled from: ReportFragment.kt */
    @androidx.annotation.w0(29)
    public static final class c implements Application.ActivityLifecycleCallbacks {

        @dl.d
        public static final a Companion = new a(null);

        /* JADX INFO: compiled from: ReportFragment.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
                this();
            }

            @xh.m
            public final void a(@dl.d Activity activity) {
                kotlin.jvm.internal.f0.p(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        @xh.m
        public static final void registerIn(@dl.d Activity activity) {
            Companion.a(activity);
        }

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
        public void onActivityPostCreated(@dl.d Activity activity, @dl.e Bundle bundle) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            ReportFragment.f24106c.a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            ReportFragment.f24106c.a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            ReportFragment.f24106c.a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            ReportFragment.f24106c.a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            ReportFragment.f24106c.a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            ReportFragment.f24106c.a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@dl.d Activity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@dl.d Activity activity, @dl.d Bundle bundle) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            kotlin.jvm.internal.f0.p(bundle, "bundle");
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

    private final void a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f24106c;
            Activity activity = getActivity();
            kotlin.jvm.internal.f0.o(activity, "activity");
            bVar.a(activity, event);
        }
    }

    @xh.m
    public static final void b(@dl.d Activity activity, @dl.d Lifecycle.Event event) {
        f24106c.a(activity, event);
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private final void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    @dl.d
    @xh.h(name = "get")
    public static final ReportFragment f(@dl.d Activity activity) {
        return f24106c.b(activity);
    }

    @xh.m
    public static final void g(@dl.d Activity activity) {
        f24106c.d(activity);
    }

    public final void h(@dl.e a aVar) {
        this.f24108b = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@dl.e Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f24108b);
        a(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(Lifecycle.Event.ON_DESTROY);
        this.f24108b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        d(this.f24108b);
        a(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        e(this.f24108b);
        a(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(Lifecycle.Event.ON_STOP);
    }
}
