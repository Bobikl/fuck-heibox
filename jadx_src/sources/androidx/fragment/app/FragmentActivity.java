package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.b3;
import androidx.core.app.p3;
import androidx.core.app.v2;
import androidx.core.app.x2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c1;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes6.dex */
public class FragmentActivity extends ComponentActivity implements androidx.core.app.b.j, androidx.core.app.b.l {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.a0 mFragmentLifecycleRegistry;
    final r mFragments;
    boolean mResumed;
    boolean mStopped;

    public class a extends t<FragmentActivity> implements androidx.core.content.o0, androidx.core.content.p0, v2, x2, c1, androidx.activity.s, androidx.activity.result.i, androidx.savedstate.d, i0, androidx.core.view.v {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.i0
        public void a(@androidx.annotation.n0 FragmentManager fragmentManager, @androidx.annotation.n0 Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.v
        public void addMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var) {
            FragmentActivity.this.addMenuProvider(p0Var);
        }

        @Override // androidx.core.view.v
        public void addMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar) {
            FragmentActivity.this.addMenuProvider(p0Var, yVar);
        }

        @Override // androidx.core.view.v
        public void addMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var, @androidx.annotation.n0 androidx.lifecycle.y yVar, @androidx.annotation.n0 Lifecycle.State state) {
            FragmentActivity.this.addMenuProvider(p0Var, yVar, state);
        }

        @Override // androidx.core.content.o0
        public void addOnConfigurationChangedListener(@androidx.annotation.n0 androidx.core.util.d<Configuration> dVar) {
            FragmentActivity.this.addOnConfigurationChangedListener(dVar);
        }

        @Override // androidx.core.app.v2
        public void addOnMultiWindowModeChangedListener(@androidx.annotation.n0 androidx.core.util.d<androidx.core.app.b0> dVar) {
            FragmentActivity.this.addOnMultiWindowModeChangedListener(dVar);
        }

        @Override // androidx.core.app.x2
        public void addOnPictureInPictureModeChangedListener(@androidx.annotation.n0 androidx.core.util.d<b3> dVar) {
            FragmentActivity.this.addOnPictureInPictureModeChangedListener(dVar);
        }

        @Override // androidx.core.content.p0
        public void addOnTrimMemoryListener(@androidx.annotation.n0 androidx.core.util.d<Integer> dVar) {
            FragmentActivity.this.addOnTrimMemoryListener(dVar);
        }

        @Override // androidx.fragment.app.t, androidx.fragment.app.q
        @androidx.annotation.p0
        public View c(int i10) {
            return FragmentActivity.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.t, androidx.fragment.app.q
        public boolean d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.i
        @androidx.annotation.n0
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.y
        @androidx.annotation.n0
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.s
        @androidx.annotation.n0
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.savedstate.d
        @androidx.annotation.n0
        public androidx.savedstate.b getSavedStateRegistry() {
            return FragmentActivity.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.c1
        @androidx.annotation.n0
        public androidx.lifecycle.b1 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.t
        public void h(@androidx.annotation.n0 String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.core.view.v
        public void invalidateMenu() {
            FragmentActivity.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.t
        @androidx.annotation.n0
        public LayoutInflater j() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.t
        public int k() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.t
        public boolean l() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.t
        public boolean n(@androidx.annotation.n0 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.t
        public boolean o(@androidx.annotation.n0 String str) {
            return androidx.core.app.b.P(FragmentActivity.this, str);
        }

        @Override // androidx.core.view.v
        public void removeMenuProvider(@androidx.annotation.n0 androidx.core.view.p0 p0Var) {
            FragmentActivity.this.removeMenuProvider(p0Var);
        }

        @Override // androidx.core.content.o0
        public void removeOnConfigurationChangedListener(@androidx.annotation.n0 androidx.core.util.d<Configuration> dVar) {
            FragmentActivity.this.removeOnConfigurationChangedListener(dVar);
        }

        @Override // androidx.core.app.v2
        public void removeOnMultiWindowModeChangedListener(@androidx.annotation.n0 androidx.core.util.d<androidx.core.app.b0> dVar) {
            FragmentActivity.this.removeOnMultiWindowModeChangedListener(dVar);
        }

        @Override // androidx.core.app.x2
        public void removeOnPictureInPictureModeChangedListener(@androidx.annotation.n0 androidx.core.util.d<b3> dVar) {
            FragmentActivity.this.removeOnPictureInPictureModeChangedListener(dVar);
        }

        @Override // androidx.core.content.p0
        public void removeOnTrimMemoryListener(@androidx.annotation.n0 androidx.core.util.d<Integer> dVar) {
            FragmentActivity.this.removeOnTrimMemoryListener(dVar);
        }

        @Override // androidx.fragment.app.t
        public void s() {
            invalidateMenu();
        }

        @Override // androidx.fragment.app.t
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public FragmentActivity i() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        this.mFragments = r.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.a0(this);
        this.mStopped = true;
        init();
    }

    @androidx.annotation.o
    public FragmentActivity(@androidx.annotation.i0 int i10) {
        super(i10);
        this.mFragments = r.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.a0(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().j(LIFECYCLE_TAG, new androidx.savedstate.b.c() { // from class: androidx.fragment.app.l
            @Override // androidx.savedstate.b.c
            public final Bundle saveState() {
                return this.f23731a.lambda$init$0();
            }
        });
        addOnConfigurationChangedListener(new androidx.core.util.d() { // from class: androidx.fragment.app.m
            @Override // androidx.core.util.d
            public final void accept(Object obj) {
                this.f23732b.lambda$init$1((Configuration) obj);
            }
        });
        addOnNewIntentListener(new androidx.core.util.d() { // from class: androidx.fragment.app.n
            @Override // androidx.core.util.d
            public final void accept(Object obj) {
                this.f23749b.lambda$init$2((Intent) obj);
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.c() { // from class: androidx.fragment.app.o
            @Override // androidx.activity.contextaware.c
            public final void a(Context context) {
                this.f23761a.lambda$init$3(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$3(Context context) {
        this.mFragments.a(null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.J0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                u0 u0Var = fragment.mViewLifecycleOwner;
                if (u0Var != null && u0Var.getLifecycle().b().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.f(state);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.b().isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.s(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @androidx.annotation.p0
    final View dispatchFragmentsOnCreateView(@androidx.annotation.p0 View view, @androidx.annotation.n0 String str, @androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        return this.mFragments.G(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@androidx.annotation.n0 String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.D().e0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @androidx.annotation.n0
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.D();
    }

    @androidx.annotation.n0
    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.d(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    protected void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        this.mFragments.F();
        super.onActivityResult(i10, i11, intent);
    }

    @androidx.annotation.k0
    @Deprecated
    public void onAttachFragment(@androidx.annotation.n0 Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@androidx.annotation.p0 Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.p0 View view, @androidx.annotation.n0 String str, @androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.n0 String str, @androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @androidx.annotation.n0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.e(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.n();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    public void onRequestPermissionsResult(int i10, @androidx.annotation.n0 String[] strArr, @androidx.annotation.n0 int[] iArr) {
        this.mFragments.F();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.F();
        super.onResume();
        this.mResumed = true;
        this.mFragments.z();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_RESUME);
        this.mFragments.r();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.F();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.z();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_START);
        this.mFragments.s();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.F();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.t();
        this.mFragmentLifecycleRegistry.l(Lifecycle.Event.ON_STOP);
    }

    public void setEnterSharedElementCallback(@androidx.annotation.p0 p3 p3Var) {
        androidx.core.app.b.L(this, p3Var);
    }

    public void setExitSharedElementCallback(@androidx.annotation.p0 p3 p3Var) {
        androidx.core.app.b.M(this, p3Var);
    }

    public void startActivityFromFragment(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Intent intent, int i10) {
        startActivityFromFragment(fragment, intent, i10, (Bundle) null);
    }

    public void startActivityFromFragment(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        if (i10 == -1) {
            androidx.core.app.b.Q(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@androidx.annotation.n0 Fragment fragment, @androidx.annotation.n0 IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            androidx.core.app.b.R(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.A(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.G(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.S(this);
    }

    @Override // androidx.core.app.b.l
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }
}
