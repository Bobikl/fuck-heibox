package androidx.navigation.dynamicfeatures.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.m0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavDestination;
import androidx.navigation.dynamicfeatures.DynamicInstallManager;
import androidx.navigation.dynamicfeatures.f;
import androidx.navigation.dynamicfeatures.fragment.ui.DefaultProgressFragment;
import androidx.navigation.dynamicfeatures.g;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.g0;
import androidx.navigation.q0;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;
import xh.m;

/* JADX INFO: compiled from: DynamicNavHostFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDynamicNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicNavHostFragment.kt\nandroidx/navigation/dynamicfeatures/fragment/DynamicNavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,102:1\n176#2,2:103\n176#2,2:105\n176#2,2:107\n176#2,2:109\n*S KotlinDebug\n*F\n+ 1 DynamicNavHostFragment.kt\nandroidx/navigation/dynamicfeatures/fragment/DynamicNavHostFragment\n*L\n41#1:103,2\n45#1:105,2\n54#1:107,2\n56#1:109,2\n*E\n"})
public class DynamicNavHostFragment extends NavHostFragment {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    public static final a f25008k = new a(null);

    /* JADX INFO: compiled from: DynamicNavHostFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ DynamicNavHostFragment c(a aVar, int i10, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            return aVar.b(i10, bundle);
        }

        @d
        @i
        @m
        public final DynamicNavHostFragment a(@m0 int i10) {
            return c(this, i10, null, 2, null);
        }

        @d
        @i
        @m
        public final DynamicNavHostFragment b(@m0 int i10, @e Bundle bundle) {
            Bundle bundle2;
            DynamicNavHostFragment dynamicNavHostFragment = new DynamicNavHostFragment();
            if (i10 == 0 && bundle == null) {
                bundle2 = null;
            } else {
                Bundle bundle3 = new Bundle();
                if (i10 != 0) {
                    bundle3.putInt(NavHostFragment.f25115g, i10);
                }
                if (bundle != null) {
                    bundle3.putBundle(NavHostFragment.f25116h, bundle);
                }
                bundle2 = bundle3;
            }
            dynamicNavHostFragment.setArguments(bundle2);
            return dynamicNavHostFragment;
        }
    }

    @d
    @i
    @m
    public static final DynamicNavHostFragment V3(@m0 int i10) {
        return f25008k.a(i10);
    }

    @d
    @i
    @m
    public static final DynamicNavHostFragment W3(@m0 int i10, @e Bundle bundle) {
        return f25008k.b(i10, bundle);
    }

    @Override // androidx.navigation.fragment.NavHostFragment
    protected void U3(@d g0 navHostController) {
        f0.p(navHostController, "navHostController");
        super.U3(navHostController);
        Context contextRequireContext = requireContext();
        f0.o(contextRequireContext, "requireContext()");
        DynamicInstallManager dynamicInstallManager = new DynamicInstallManager(contextRequireContext, X3());
        q0 q0VarZ = navHostController.Z();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity()");
        q0VarZ.b(new androidx.navigation.dynamicfeatures.b(fragmentActivityRequireActivity, dynamicInstallManager));
        Context contextRequireContext2 = requireContext();
        f0.o(contextRequireContext2, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        f0.o(childFragmentManager, "childFragmentManager");
        final androidx.navigation.dynamicfeatures.fragment.a aVar = new androidx.navigation.dynamicfeatures.fragment.a(contextRequireContext2, childFragmentManager, getId(), dynamicInstallManager);
        q0VarZ.b(aVar);
        f fVar = new f(q0VarZ, dynamicInstallManager);
        fVar.s(new yh.a<NavDestination>() { // from class: androidx.navigation.dynamicfeatures.fragment.DynamicNavHostFragment$onCreateNavHostController$1
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final NavDestination invoke() {
                a.C0190a c0190aA = aVar.a();
                String name = DefaultProgressFragment.class.getName();
                f0.o(name, "DefaultProgressFragment::class.java.name");
                c0190aA.k0(name);
                c0190aA.Z(R.id.dfn_progress_fragment);
                return c0190aA;
            }
        });
        q0VarZ.b(fVar);
        Context contextRequireContext3 = requireContext();
        f0.o(contextRequireContext3, "requireContext()");
        q0VarZ.b(new g(contextRequireContext3, q0VarZ, navHostController.Y(), dynamicInstallManager));
    }

    @d
    protected com.google.android.play.core.splitinstall.c X3() {
        com.google.android.play.core.splitinstall.c cVarA = com.google.android.play.core.splitinstall.d.a(requireContext());
        f0.o(cVarA, "create(requireContext())");
        return cVarA;
    }
}
