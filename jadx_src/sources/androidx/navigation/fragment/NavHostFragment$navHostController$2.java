package androidx.navigation.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.navigation.g0;
import kotlin.c1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NavHostFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NavHostFragment$navHostController$2 extends Lambda implements yh.a<g0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ NavHostFragment f25123b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavHostFragment$navHostController$2(NavHostFragment navHostFragment) {
        super(0);
        this.f25123b = navHostFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle d(g0 this_apply) {
        f0.p(this_apply, "$this_apply");
        Bundle bundleM1 = this_apply.m1();
        if (bundleM1 != null) {
            return bundleM1;
        }
        Bundle EMPTY = Bundle.EMPTY;
        f0.o(EMPTY, "EMPTY");
        return EMPTY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle e(NavHostFragment this$0) {
        f0.p(this$0, "this$0");
        if (this$0.f25121d != 0) {
            return androidx.core.os.e.b(c1.a(NavHostFragment.f25115g, Integer.valueOf(this$0.f25121d)));
        }
        Bundle bundle = Bundle.EMPTY;
        f0.o(bundle, "{\n                    Bu…e.EMPTY\n                }");
        return bundle;
    }

    @Override // yh.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final g0 invoke() {
        Context context = this.f25123b.getContext();
        if (context == null) {
            throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
        }
        f0.o(context, "checkNotNull(context) {\n…s attached\"\n            }");
        final g0 g0Var = new g0(context);
        final NavHostFragment navHostFragment = this.f25123b;
        g0Var.s1(navHostFragment);
        b1 viewModelStore = navHostFragment.getViewModelStore();
        f0.o(viewModelStore, "viewModelStore");
        g0Var.v1(viewModelStore);
        navHostFragment.U3(g0Var);
        Bundle bundleB = navHostFragment.getSavedStateRegistry().b("android-support-nav:fragment:navControllerState");
        if (bundleB != null) {
            g0Var.j1(bundleB);
        }
        navHostFragment.getSavedStateRegistry().j("android-support-nav:fragment:navControllerState", new androidx.savedstate.b.c() { // from class: androidx.navigation.fragment.l
            @Override // androidx.savedstate.b.c
            public final Bundle saveState() {
                return NavHostFragment$navHostController$2.d(g0Var);
            }
        });
        Bundle bundleB2 = navHostFragment.getSavedStateRegistry().b(NavHostFragment.f25115g);
        if (bundleB2 != null) {
            navHostFragment.f25121d = bundleB2.getInt(NavHostFragment.f25115g);
        }
        navHostFragment.getSavedStateRegistry().j(NavHostFragment.f25115g, new androidx.savedstate.b.c() { // from class: androidx.navigation.fragment.m
            @Override // androidx.savedstate.b.c
            public final Bundle saveState() {
                return NavHostFragment$navHostController$2.e(navHostFragment);
            }
        });
        if (navHostFragment.f25121d != 0) {
            g0Var.n1(navHostFragment.f25121d);
        } else {
            Bundle arguments = navHostFragment.getArguments();
            int i10 = arguments != null ? arguments.getInt(NavHostFragment.f25115g) : 0;
            Bundle bundle = arguments != null ? arguments.getBundle(NavHostFragment.f25116h) : null;
            if (i10 != 0) {
                g0Var.o1(i10, bundle);
            }
        }
        return g0Var;
    }
}
