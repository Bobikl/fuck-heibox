package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.j1;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c1;

/* JADX INFO: compiled from: FragmentStateManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class m0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f23733f = "FragmentManager";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f23734g = "state";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f23735h = "savedInstanceState";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final String f23736i = "registryState";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final String f23737j = "childFragmentManager";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final String f23738k = "viewState";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final String f23739l = "viewRegistryState";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final String f23740m = "arguments";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f23741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0 f23742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    private final Fragment f23743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f23744d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23745e = -1;

    /* JADX INFO: compiled from: FragmentStateManager.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f23746b;

        a(View view) {
            this.f23746b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f23746b.removeOnAttachStateChangeListener(this);
            j1.v1(this.f23746b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: compiled from: FragmentStateManager.java */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23748a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f23748a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23748a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23748a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23748a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    m0(@androidx.annotation.n0 x xVar, @androidx.annotation.n0 o0 o0Var, @androidx.annotation.n0 Fragment fragment) {
        this.f23741a = xVar;
        this.f23742b = o0Var;
        this.f23743c = fragment;
    }

    m0(@androidx.annotation.n0 x xVar, @androidx.annotation.n0 o0 o0Var, @androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Bundle bundle) {
        this.f23741a = xVar;
        this.f23742b = o0Var;
        this.f23743c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    m0(@androidx.annotation.n0 x xVar, @androidx.annotation.n0 o0 o0Var, @androidx.annotation.n0 ClassLoader classLoader, @androidx.annotation.n0 s sVar, @androidx.annotation.n0 Bundle bundle) {
        this.f23741a = xVar;
        this.f23742b = o0Var;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable("state")).a(sVar, classLoader);
        this.f23743c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    private boolean l(@androidx.annotation.n0 View view) {
        if (view == this.f23743c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f23743c.mView) {
                return true;
            }
        }
        return false;
    }

    void a() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f23743c);
        }
        Bundle bundle = this.f23743c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f23735h) : null;
        this.f23743c.performActivityCreated(bundle2);
        this.f23741a.a(this.f23743c, bundle2, false);
    }

    void b() {
        Fragment fragmentV0 = FragmentManager.v0(this.f23743c.mContainer);
        Fragment parentFragment = this.f23743c.getParentFragment();
        if (fragmentV0 != null && !fragmentV0.equals(parentFragment)) {
            Fragment fragment = this.f23743c;
            FragmentStrictMode.s(fragment, fragmentV0, fragment.mContainerId);
        }
        int iJ = this.f23742b.j(this.f23743c);
        Fragment fragment2 = this.f23743c;
        fragment2.mContainer.addView(fragment2.mView, iJ);
    }

    void c() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f23743c);
        }
        Fragment fragment = this.f23743c;
        Fragment fragment2 = fragment.mTarget;
        m0 m0VarO = null;
        if (fragment2 != null) {
            m0 m0VarO2 = this.f23742b.o(fragment2.mWho);
            if (m0VarO2 == null) {
                throw new IllegalStateException("Fragment " + this.f23743c + " declared target fragment " + this.f23743c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f23743c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            m0VarO = m0VarO2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (m0VarO = this.f23742b.o(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f23743c + " declared target fragment " + this.f23743c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (m0VarO != null) {
            m0VarO.m();
        }
        Fragment fragment4 = this.f23743c;
        fragment4.mHost = fragment4.mFragmentManager.K0();
        Fragment fragment5 = this.f23743c;
        fragment5.mParentFragment = fragment5.mFragmentManager.N0();
        this.f23741a.g(this.f23743c, false);
        this.f23743c.performAttach();
        this.f23741a.b(this.f23743c, false);
    }

    int d() {
        Fragment fragment = this.f23743c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f23745e;
        int i10 = b.f23748a[fragment.mMaxState.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment2 = this.f23743c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f23745e, 2);
                View view = this.f23743c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f23745e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f23743c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment3 = this.f23743c;
        ViewGroup viewGroup = fragment3.mContainer;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpactP = viewGroup != null ? SpecialEffectsController.r(viewGroup, fragment3.getParentFragmentManager()).p(this) : null;
        if (lifecycleImpactP == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpactP == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f23743c;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f23743c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f23743c);
        }
        return iMin;
    }

    void e() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f23743c);
        }
        Bundle bundle = this.f23743c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f23735h) : null;
        Fragment fragment = this.f23743c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f23741a.h(fragment, bundle2, false);
            this.f23743c.performCreate(bundle2);
            this.f23741a.c(this.f23743c, bundle2, false);
        }
    }

    void f() {
        String resourceName;
        if (this.f23743c.mFromLayout) {
            return;
        }
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f23743c);
        }
        Bundle bundle = this.f23743c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle(f23735h) : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f23743c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f23743c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = fragment.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f23743c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.E0().c(this.f23743c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f23743c;
                    if (!fragment2.mRestored) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f23743c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f23743c.mContainerId) + " (" + resourceName + ") for fragment " + this.f23743c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.r(this.f23743c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f23743c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f23743c.mView != null) {
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + this.f23743c);
            }
            this.f23743c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f23743c;
            fragment4.mView.setTag(R.id.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment5 = this.f23743c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (j1.O0(this.f23743c.mView)) {
                j1.v1(this.f23743c.mView);
            } else {
                View view = this.f23743c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f23743c.performViewCreated();
            x xVar = this.f23741a;
            Fragment fragment6 = this.f23743c;
            xVar.m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f23743c.mView.getVisibility();
            this.f23743c.setPostOnViewCreatedAlpha(this.f23743c.mView.getAlpha());
            Fragment fragment7 = this.f23743c;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f23743c.setFocusedView(viewFindFocus);
                    if (FragmentManager.X0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f23743c);
                    }
                }
                this.f23743c.mView.setAlpha(0.0f);
            }
        }
        this.f23743c.mState = 2;
    }

    void g() {
        Fragment fragmentF;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f23743c);
        }
        Fragment fragment = this.f23743c;
        boolean zIsChangingConfigurations = true;
        boolean z10 = fragment.mRemoving && !fragment.isInBackStack();
        if (z10) {
            Fragment fragment2 = this.f23743c;
            if (!fragment2.mBeingSaved) {
                this.f23742b.C(fragment2.mWho, null);
            }
        }
        if (!(z10 || this.f23742b.q().u(this.f23743c))) {
            String str = this.f23743c.mTargetWho;
            if (str != null && (fragmentF = this.f23742b.f(str)) != null && fragmentF.mRetainInstance) {
                this.f23743c.mTarget = fragmentF;
            }
            this.f23743c.mState = 0;
            return;
        }
        t<?> tVar = this.f23743c.mHost;
        if (tVar instanceof c1) {
            zIsChangingConfigurations = this.f23742b.q().p();
        } else if (tVar.f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) tVar.f()).isChangingConfigurations();
        }
        if ((z10 && !this.f23743c.mBeingSaved) || zIsChangingConfigurations) {
            this.f23742b.q().e(this.f23743c, false);
        }
        this.f23743c.performDestroy();
        this.f23741a.d(this.f23743c, false);
        for (m0 m0Var : this.f23742b.l()) {
            if (m0Var != null) {
                Fragment fragmentK = m0Var.k();
                if (this.f23743c.mWho.equals(fragmentK.mTargetWho)) {
                    fragmentK.mTarget = this.f23743c;
                    fragmentK.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f23743c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f23742b.f(str2);
        }
        this.f23742b.t(this);
    }

    void h() {
        View view;
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f23743c);
        }
        Fragment fragment = this.f23743c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f23743c.performDestroyView();
        this.f23741a.n(this.f23743c, false);
        Fragment fragment2 = this.f23743c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.r(null);
        this.f23743c.mInLayout = false;
    }

    void i() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f23743c);
        }
        this.f23743c.performDetach();
        boolean z10 = false;
        this.f23741a.e(this.f23743c, false);
        Fragment fragment = this.f23743c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z10 = true;
        }
        if (z10 || this.f23742b.q().u(this.f23743c)) {
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f23743c);
            }
            this.f23743c.initState();
        }
    }

    void j() {
        Fragment fragment = this.f23743c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.X0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f23743c);
            }
            Bundle bundle = this.f23743c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle(f23735h) : null;
            Fragment fragment2 = this.f23743c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f23743c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f23743c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f23743c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f23743c.performViewCreated();
                x xVar = this.f23741a;
                Fragment fragment5 = this.f23743c;
                xVar.m(fragment5, fragment5.mView, bundle2, false);
                this.f23743c.mState = 2;
            }
        }
    }

    @androidx.annotation.n0
    Fragment k() {
        return this.f23743c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f23744d) {
            if (FragmentManager.X0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f23744d = true;
            boolean z10 = false;
            while (true) {
                int iD = d();
                Fragment fragment = this.f23743c;
                int i10 = fragment.mState;
                if (iD == i10) {
                    if (!z10 && i10 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f23743c.mBeingSaved) {
                        if (FragmentManager.X0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f23743c);
                        }
                        this.f23742b.q().e(this.f23743c, true);
                        this.f23742b.t(this);
                        if (FragmentManager.X0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f23743c);
                        }
                        this.f23743c.initState();
                    }
                    Fragment fragment2 = this.f23743c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerR = SpecialEffectsController.r(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f23743c.mHidden) {
                                specialEffectsControllerR.g(this);
                            } else {
                                specialEffectsControllerR.i(this);
                            }
                        }
                        Fragment fragment3 = this.f23743c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.V0(fragment3);
                        }
                        Fragment fragment4 = this.f23743c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f23743c.mChildFragmentManager.Q();
                    }
                    return;
                }
                if (iD <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f23742b.r(fragment.mWho) == null) {
                                this.f23742b.C(this.f23743c.mWho, r());
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f23743c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.X0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f23743c);
                            }
                            Fragment fragment5 = this.f23743c;
                            if (fragment5.mBeingSaved) {
                                this.f23742b.C(fragment5.mWho, r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f23743c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                SpecialEffectsController.r(viewGroup2, fragment6.getParentFragmentManager()).h(this);
                            }
                            this.f23743c.mState = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController.r(viewGroup3, fragment.getParentFragmentManager()).f(SpecialEffectsController.Operation.State.from(this.f23743c.mView.getVisibility()), this);
                            }
                            this.f23743c.mState = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f23744d = false;
        }
    }

    void n() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f23743c);
        }
        this.f23743c.performPause();
        this.f23741a.f(this.f23743c, false);
    }

    void o(@androidx.annotation.n0 ClassLoader classLoader) {
        Bundle bundle = this.f23743c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f23743c.mSavedFragmentState.getBundle(f23735h) == null) {
            this.f23743c.mSavedFragmentState.putBundle(f23735h, new Bundle());
        }
        Fragment fragment = this.f23743c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f23738k);
        Fragment fragment2 = this.f23743c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f23739l);
        FragmentState fragmentState = (FragmentState) this.f23743c.mSavedFragmentState.getParcelable("state");
        if (fragmentState != null) {
            Fragment fragment3 = this.f23743c;
            fragment3.mTargetWho = fragmentState.f23630m;
            fragment3.mTargetRequestCode = fragmentState.f23631n;
            Boolean bool = fragment3.mSavedUserVisibleHint;
            if (bool != null) {
                fragment3.mUserVisibleHint = bool.booleanValue();
                this.f23743c.mSavedUserVisibleHint = null;
            } else {
                fragment3.mUserVisibleHint = fragmentState.f23632o;
            }
        }
        Fragment fragment4 = this.f23743c;
        if (fragment4.mUserVisibleHint) {
            return;
        }
        fragment4.mDeferStart = true;
    }

    void p() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f23743c);
        }
        View focusedView = this.f23743c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.X0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : z5.f.f141859j);
                sb2.append(" on Fragment ");
                sb2.append(this.f23743c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f23743c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f23743c.setFocusedView(null);
        this.f23743c.performResume();
        this.f23741a.i(this.f23743c, false);
        this.f23742b.C(this.f23743c.mWho, null);
        Fragment fragment = this.f23743c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    @androidx.annotation.p0
    Fragment.SavedState q() {
        if (this.f23743c.mState > -1) {
            return new Fragment.SavedState(r());
        }
        return null;
    }

    @androidx.annotation.n0
    Bundle r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f23743c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f23743c));
        if (this.f23743c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f23743c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle(f23735h, bundle3);
            }
            this.f23741a.j(this.f23743c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f23743c.mSavedStateRegistryController.e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle(f23736i, bundle4);
            }
            Bundle bundleF1 = this.f23743c.mChildFragmentManager.f1();
            if (!bundleF1.isEmpty()) {
                bundle2.putBundle(f23737j, bundleF1);
            }
            if (this.f23743c.mView != null) {
                s();
            }
            SparseArray<Parcelable> sparseArray = this.f23743c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray(f23738k, sparseArray);
            }
            Bundle bundle5 = this.f23743c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle(f23739l, bundle5);
            }
        }
        Bundle bundle6 = this.f23743c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    void s() {
        if (this.f23743c.mView == null) {
            return;
        }
        if (FragmentManager.X0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f23743c + " with view " + this.f23743c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f23743c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f23743c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f23743c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f23743c.mSavedViewRegistryState = bundle;
    }

    void t(int i10) {
        this.f23745e = i10;
    }

    void u() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f23743c);
        }
        this.f23743c.performStart();
        this.f23741a.k(this.f23743c, false);
    }

    void v() {
        if (FragmentManager.X0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f23743c);
        }
        this.f23743c.performStop();
        this.f23741a.l(this.f23743c, false);
    }
}
