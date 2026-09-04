package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Navigation.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class Navigation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final Navigation f24945a = new Navigation();

    private Navigation() {
    }

    @dl.d
    @xh.i
    @xh.m
    public static final View.OnClickListener d(@androidx.annotation.d0 int i10) {
        return g(i10, null, 2, null);
    }

    @dl.d
    @xh.i
    @xh.m
    public static final View.OnClickListener e(@androidx.annotation.d0 final int i10, @dl.e final Bundle bundle) {
        return new View.OnClickListener() { // from class: androidx.navigation.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.h(i10, bundle, view);
            }
        };
    }

    @dl.d
    @xh.m
    public static final View.OnClickListener f(@dl.d final c0 directions) {
        kotlin.jvm.internal.f0.p(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.i(directions, view);
            }
        };
    }

    public static /* synthetic */ View.OnClickListener g(int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return e(i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i10, Bundle bundle, View view) {
        kotlin.jvm.internal.f0.o(view, "view");
        k(view).k0(i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c0 directions, View view) {
        kotlin.jvm.internal.f0.p(directions, "$directions");
        kotlin.jvm.internal.f0.o(view, "view");
        k(view).u0(directions);
    }

    @dl.d
    @xh.m
    public static final NavController j(@dl.d Activity activity, @androidx.annotation.d0 int i10) {
        kotlin.jvm.internal.f0.p(activity, "activity");
        View viewK = androidx.core.app.b.K(activity, i10);
        kotlin.jvm.internal.f0.o(viewK, "requireViewById<View>(activity, viewId)");
        NavController navControllerL = f24945a.l(viewK);
        if (navControllerL != null) {
            return navControllerL;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + i10);
    }

    @dl.d
    @xh.m
    public static final NavController k(@dl.d View view) {
        kotlin.jvm.internal.f0.p(view, "view");
        NavController navControllerL = f24945a.l(view);
        if (navControllerL != null) {
            return navControllerL;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }

    private final NavController l(View view) {
        return (NavController) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(SequencesKt__SequencesKt.l(view, new yh.l<View, View>() { // from class: androidx.navigation.Navigation$findViewNavController$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final View invoke(View it) {
                kotlin.jvm.internal.f0.p(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new yh.l<View, NavController>() { // from class: androidx.navigation.Navigation$findViewNavController$2
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NavController invoke(View it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return Navigation.f24945a.m(it);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController m(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    @xh.m
    public static final void n(@dl.d View view, @dl.e NavController navController) {
        kotlin.jvm.internal.f0.p(view, "view");
        view.setTag(R.id.nav_controller_view_tag, navController);
    }
}
