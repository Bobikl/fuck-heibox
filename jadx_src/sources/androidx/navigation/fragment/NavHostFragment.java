package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.annotation.m0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.f0;
import androidx.navigation.g0;
import androidx.navigation.q0;
import kotlin.b0;
import kotlin.b2;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: NavHostFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,393:1\n176#2,2:394\n1#3:396\n232#4,3:397\n232#4,3:400\n*S KotlinDebug\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n*L\n203#1:394,2\n273#1:397,3\n280#1:400,3\n*E\n"})
public class NavHostFragment extends Fragment implements f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f25114f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f25115g = "android-support-nav:fragment:graphId";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String f25116h = "android-support-nav:fragment:startDestinationArgs";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final String f25117i = "android-support-nav:fragment:navControllerState";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final String f25118j = "android-support-nav:fragment:defaultHost";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f25119b = b0.c(new NavHostFragment$navHostController$2(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private View f25120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f25122e;

    /* JADX INFO: compiled from: NavHostFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ NavHostFragment c(a aVar, int i10, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            return aVar.b(i10, bundle);
        }

        @dl.d
        @xh.i
        @xh.m
        public final NavHostFragment a(@m0 int i10) {
            return c(this, i10, null, 2, null);
        }

        @dl.d
        @xh.i
        @xh.m
        public final NavHostFragment b(@m0 int i10, @dl.e Bundle bundle) {
            Bundle bundle2;
            if (i10 != 0) {
                bundle2 = new Bundle();
                bundle2.putInt(NavHostFragment.f25115g, i10);
            } else {
                bundle2 = null;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putBundle(NavHostFragment.f25116h, bundle);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle2 != null) {
                navHostFragment.setArguments(bundle2);
            }
            return navHostFragment;
        }

        @dl.d
        @xh.m
        public final NavController d(@dl.d Fragment fragment) {
            Dialog dialog;
            Window window;
            kotlin.jvm.internal.f0.p(fragment, "fragment");
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) parentFragment).S3();
                }
                Fragment fragmentO0 = parentFragment.getParentFragmentManager().O0();
                if (fragmentO0 instanceof NavHostFragment) {
                    return ((NavHostFragment) fragmentO0).S3();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return Navigation.k(view);
            }
            View decorView = null;
            androidx.fragment.app.j jVar = fragment instanceof androidx.fragment.app.j ? (androidx.fragment.app.j) fragment : null;
            if (jVar != null && (dialog = jVar.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return Navigation.k(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }
    }

    @dl.d
    @xh.i
    @xh.m
    public static final NavHostFragment N3(@m0 int i10) {
        return f25114f.a(i10);
    }

    @dl.d
    @xh.i
    @xh.m
    public static final NavHostFragment O3(@m0 int i10, @dl.e Bundle bundle) {
        return f25114f.b(i10, bundle);
    }

    @dl.d
    @xh.m
    public static final NavController Q3(@dl.d Fragment fragment) {
        return f25114f.d(fragment);
    }

    private final int R3() {
        int id2 = getId();
        return (id2 == 0 || id2 == -1) ? R.id.nav_host_fragment_container : id2;
    }

    @dl.d
    @kotlin.k(message = "Use {@link #onCreateNavController(NavController)}")
    protected Navigator<? extends FragmentNavigator.c> P3() {
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.f0.o(childFragmentManager, "childFragmentManager");
        return new FragmentNavigator(contextRequireContext, childFragmentManager, R3());
    }

    @dl.d
    public final g0 S3() {
        return (g0) this.f25119b.getValue();
    }

    @androidx.annotation.i
    @kotlin.k(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    protected void T3(@dl.d NavController navController) {
        kotlin.jvm.internal.f0.p(navController, "navController");
        q0 q0VarZ = navController.Z();
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.f0.o(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.f0.o(childFragmentManager, "childFragmentManager");
        q0VarZ.b(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
        navController.Z().b(P3());
    }

    @androidx.annotation.i
    protected void U3(@dl.d g0 navHostController) {
        kotlin.jvm.internal.f0.p(navHostController, "navHostController");
        T3(navHostController);
    }

    @Override // androidx.navigation.f0
    @dl.d
    public final NavController i3() {
        return S3();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onAttach(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        super.onAttach(context);
        if (this.f25122e) {
            getParentFragmentManager().u().L(this).m();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onCreate(@dl.e Bundle bundle) {
        S3();
        if (bundle != null && bundle.getBoolean(f25118j, false)) {
            this.f25122e = true;
            getParentFragmentManager().u().L(this).m();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(inflater, "inflater");
        Context context = inflater.getContext();
        kotlin.jvm.internal.f0.o(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(R3());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.f25120c;
        if (view != null && Navigation.k(view) == S3()) {
            Navigation.n(view, null);
        }
        this.f25120c = null;
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onInflate(@dl.d Context context, @dl.d AttributeSet attrs, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(attrs, "attrs");
        super.onInflate(context, attrs, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, androidx.navigation.R.styleable.f24955b);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.f25121d = resourceId;
        }
        b2 b2Var = b2.f124493a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, R.styleable.f25126c);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.f25122e = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.i
    public void onSaveInstanceState(@dl.d Bundle outState) {
        kotlin.jvm.internal.f0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.f25122e) {
            outState.putBoolean(f25118j, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(view, "view");
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        Navigation.n(view, S3());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            kotlin.jvm.internal.f0.n(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f25120c = view2;
            kotlin.jvm.internal.f0.m(view2);
            if (view2.getId() == getId()) {
                View view3 = this.f25120c;
                kotlin.jvm.internal.f0.m(view3);
                Navigation.n(view3, S3());
            }
        }
    }
}
