package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.i0;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.r0;
import androidx.annotation.w0;
import androidx.core.app.b0;
import androidx.core.app.b3;
import androidx.core.app.v2;
import androidx.core.app.w2;
import androidx.core.app.x2;
import androidx.core.content.o0;
import androidx.core.content.p0;
import androidx.core.view.v;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.a0;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.r;
import androidx.lifecycle.s0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.b2;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements androidx.activity.contextaware.a, y, c1, r, androidx.savedstate.d, s, androidx.activity.result.i, androidx.activity.result.b, o0, p0, w2, v2, x2, v, n {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @i0
    private int mContentLayoutId;
    final androidx.activity.contextaware.b mContextAwareHelper;
    private y0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @n0
    final m mFullyDrawnReporter;
    private final a0 mLifecycleRegistry;
    private final androidx.core.view.y mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<androidx.core.util.d<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.d<b0>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.d<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<androidx.core.util.d<b3>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<androidx.core.util.d<Integer>> mOnTrimMemoryListeners;
    final f mReportFullyDrawnExecutor;
    final androidx.savedstate.c mSavedStateRegistryController;
    private b1 mViewModelStore;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {

        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1354b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ z.a.C1283a f1355c;

            a(int i10, z.a.C1283a c1283a) {
                this.f1354b = i10;
                this.f1355c = c1283a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f1354b, this.f1355c.a());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0010b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1357b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f1358c;

            RunnableC0010b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f1357b = i10;
                this.f1358c = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f1357b, 0, new Intent().setAction(z.b.n.f141828b).putExtra(z.b.n.f141830d, this.f1358c));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i10, @n0 z.a<I, O> aVar, I i11, @androidx.annotation.p0 androidx.core.app.i iVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            z.a.C1283a<O> c1283aB = aVar.b(componentActivity, i11);
            if (c1283aB != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, c1283aB));
                return;
            }
            Intent intentA = aVar.a(componentActivity, i11);
            Bundle bundleL = null;
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentA.hasExtra(z.b.m.f141826b)) {
                bundleL = intentA.getBundleExtra(z.b.m.f141826b);
                intentA.removeExtra(z.b.m.f141826b);
            } else if (iVar != null) {
                bundleL = iVar.l();
            }
            Bundle bundle = bundleL;
            if (z.b.k.f141822b.equals(intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra(z.b.k.f141823c);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.J(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!z.b.n.f141828b.equals(intentA.getAction())) {
                androidx.core.app.b.Q(componentActivity, intentA, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentA.getParcelableExtra(z.b.n.f141829c);
            try {
                androidx.core.app.b.R(componentActivity, intentSenderRequest.d(), i10, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0010b(i10, e10));
            }
        }
    }

    @w0(19)
    public static class c {
        private c() {
        }

        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    @w0(33)
    public static class d {
        private d() {
        }

        @androidx.annotation.u
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f1360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b1 f1361b;

        e() {
        }
    }

    public interface f extends Executor {
        void J(@n0 View view);

        void q0();
    }

    @w0(16)
    public class g implements f, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Runnable f1363c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final long f1362b = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1364d = false;

        g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            Runnable runnable = this.f1363c;
            if (runnable != null) {
                runnable.run();
                this.f1363c = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void J(@n0 View view) {
            if (this.f1364d) {
                return;
            }
            this.f1364d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1363c = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f1364d) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1481b.b();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f1363c;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f1362b) {
                    this.f1364d = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f1363c = null;
            if (ComponentActivity.this.mFullyDrawnReporter.e()) {
                this.f1364d = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // androidx.activity.ComponentActivity.f
        public void q0() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static class h implements f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Handler f1366b = a();

        h() {
        }

        @n0
        private Handler a() {
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                looperMyLooper = Looper.getMainLooper();
            }
            return new Handler(looperMyLooper);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void J(@n0 View view) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f1366b.postAtFrontOfQueue(runnable);
        }

        @Override // androidx.activity.ComponentActivity.f
        public void q0() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new androidx.activity.contextaware.b();
        this.mMenuHostHelper = new androidx.core.view.y(new Runnable() { // from class: androidx.activity.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1477b.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new a0(this);
        androidx.savedstate.c cVarA = androidx.savedstate.c.a(this);
        this.mSavedStateRegistryController = cVarA;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        f fVarCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = fVarCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new m(fVarCreateFullyDrawnExecutor, new yh.a() { // from class: androidx.activity.f
            @Override // yh.a
            public final Object invoke() {
                return this.f1478b.lambda$new$0();
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i10 = Build.VERSION.SDK_INT;
        getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.v
            public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        c.a(viewPeekDecorView);
                    }
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.v
            public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.b();
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                    ComponentActivity.this.mReportFullyDrawnExecutor.q0();
                }
            }
        });
        getLifecycle().a(new androidx.lifecycle.v() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.v
            public void d(@n0 y yVar, @n0 Lifecycle.Event event) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().d(this);
            }
        });
        cVarA.c();
        SavedStateHandleSupport.c(this);
        if (i10 <= 23) {
            getLifecycle().a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().j(ACTIVITY_RESULT_TAG, new androidx.savedstate.b.c() { // from class: androidx.activity.g
            @Override // androidx.savedstate.b.c
            public final Bundle saveState() {
                return this.f1479a.lambda$new$1();
            }
        });
        addOnContextAvailableListener(new androidx.activity.contextaware.c() { // from class: androidx.activity.h
            @Override // androidx.activity.contextaware.c
            public final void a(Context context) {
                this.f1480a.lambda$new$2(context);
            }
        });
    }

    @androidx.annotation.o
    public ComponentActivity(@i0 int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private f createFullyDrawnExecutor() {
        return new g();
    }

    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.b(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.b(getWindow().getDecorView(), this);
        ViewTreeFullyDrawnReporterOwner.b(getWindow().getDecorView(), this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b2 lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle bundleB = getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (bundleB != null) {
            this.mActivityResultRegistry.g(bundleB);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.v
    public void addMenuProvider(@n0 androidx.core.view.p0 p0Var) {
        this.mMenuHostHelper.c(p0Var);
    }

    @Override // androidx.core.view.v
    public void addMenuProvider(@n0 androidx.core.view.p0 p0Var, @n0 y yVar) {
        this.mMenuHostHelper.d(p0Var, yVar);
    }

    @Override // androidx.core.view.v
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@n0 androidx.core.view.p0 p0Var, @n0 y yVar, @n0 Lifecycle.State state) {
        this.mMenuHostHelper.e(p0Var, yVar, state);
    }

    @Override // androidx.core.content.o0
    public final void addOnConfigurationChangedListener(@n0 androidx.core.util.d<Configuration> dVar) {
        this.mOnConfigurationChangedListeners.add(dVar);
    }

    @Override // androidx.activity.contextaware.a
    public final void addOnContextAvailableListener(@n0 androidx.activity.contextaware.c cVar) {
        this.mContextAwareHelper.a(cVar);
    }

    @Override // androidx.core.app.v2
    public final void addOnMultiWindowModeChangedListener(@n0 androidx.core.util.d<b0> dVar) {
        this.mOnMultiWindowModeChangedListeners.add(dVar);
    }

    @Override // androidx.core.app.w2
    public final void addOnNewIntentListener(@n0 androidx.core.util.d<Intent> dVar) {
        this.mOnNewIntentListeners.add(dVar);
    }

    @Override // androidx.core.app.x2
    public final void addOnPictureInPictureModeChangedListener(@n0 androidx.core.util.d<b3> dVar) {
        this.mOnPictureInPictureModeChangedListeners.add(dVar);
    }

    @Override // androidx.core.content.p0
    public final void addOnTrimMemoryListener(@n0 androidx.core.util.d<Integer> dVar) {
        this.mOnTrimMemoryListeners.add(dVar);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.mViewModelStore = eVar.f1361b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new b1();
            }
        }
    }

    @Override // androidx.activity.result.i
    @n0
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.r
    @androidx.annotation.i
    @n0
    public u2.a getDefaultViewModelCreationExtras() {
        u2.e eVar = new u2.e();
        if (getApplication() != null) {
            eVar.c(y0.a.f24293i, getApplication());
        }
        eVar.c(SavedStateHandleSupport.f24115c, this);
        eVar.c(SavedStateHandleSupport.f24116d, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            eVar.c(SavedStateHandleSupport.f24117e, getIntent().getExtras());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    @n0
    public y0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new s0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.activity.n
    @n0
    public m getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @androidx.annotation.p0
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        e eVar = (e) getLastNonConfigurationInstance();
        if (eVar != null) {
            return eVar.f1360a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.y
    @n0
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.s
    @n0
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.d
    @n0
    public final androidx.savedstate.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.c1
    @n0
    public b1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @Override // androidx.core.view.v
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @Deprecated
    protected void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        if (this.mActivityResultRegistry.b(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @k0
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onConfigurationChanged(@n0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<androidx.core.util.d<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @r0(markerClass = {androidx.core.os.a.b.class})
    protected void onCreate(@androidx.annotation.p0 Bundle bundle) {
        this.mSavedStateRegistryController.d(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        ReportFragment.g(this);
        if (androidx.core.os.a.k()) {
            this.mOnBackPressedDispatcher.g(d.a(this));
        }
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, @n0 Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @n0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<androidx.core.util.d<b0>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new b0(z10));
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @w0(api = 26)
    public void onMultiWindowModeChanged(boolean z10, @n0 Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<androidx.core.util.d<b0>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new b0(z10, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    protected void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<androidx.core.util.d<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @n0 Menu menu) {
        this.mMenuHostHelper.i(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<androidx.core.util.d<b3>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new b3(z10));
        }
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @w0(api = 26)
    public void onPictureInPictureModeChanged(boolean z10, @n0 Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<androidx.core.util.d<b3>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new b3(z10, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, @androidx.annotation.p0 View view, @n0 Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.k(menu);
        return true;
    }

    @Override // android.app.Activity
    @androidx.annotation.i
    @Deprecated
    public void onRequestPermissionsResult(int i10, @n0 String[] strArr, @n0 int[] iArr) {
        if (this.mActivityResultRegistry.b(i10, -1, new Intent().putExtra(z.b.k.f141823c, strArr).putExtra(z.b.k.f141824d, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @androidx.annotation.p0
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @androidx.annotation.p0
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        b1 b1Var = this.mViewModelStore;
        if (b1Var == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            b1Var = eVar.f1361b;
        }
        if (b1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f1360a = objOnRetainCustomNonConfigurationInstance;
        eVar2.f1361b = b1Var;
        return eVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @androidx.annotation.i
    protected void onSaveInstanceState(@n0 Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof a0) {
            ((a0) lifecycle).s(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @androidx.annotation.i
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<androidx.core.util.d<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // androidx.activity.contextaware.a
    @androidx.annotation.p0
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    @Override // androidx.activity.result.b
    @n0
    public final <I, O> androidx.activity.result.g<I> registerForActivityResult(@n0 z.a<I, O> aVar, @n0 ActivityResultRegistry activityResultRegistry, @n0 androidx.activity.result.a<O> aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, aVar2);
    }

    @Override // androidx.activity.result.b
    @n0
    public final <I, O> androidx.activity.result.g<I> registerForActivityResult(@n0 z.a<I, O> aVar, @n0 androidx.activity.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, aVar2);
    }

    @Override // androidx.core.view.v
    public void removeMenuProvider(@n0 androidx.core.view.p0 p0Var) {
        this.mMenuHostHelper.l(p0Var);
    }

    @Override // androidx.core.content.o0
    public final void removeOnConfigurationChangedListener(@n0 androidx.core.util.d<Configuration> dVar) {
        this.mOnConfigurationChangedListeners.remove(dVar);
    }

    @Override // androidx.activity.contextaware.a
    public final void removeOnContextAvailableListener(@n0 androidx.activity.contextaware.c cVar) {
        this.mContextAwareHelper.e(cVar);
    }

    @Override // androidx.core.app.v2
    public final void removeOnMultiWindowModeChangedListener(@n0 androidx.core.util.d<b0> dVar) {
        this.mOnMultiWindowModeChangedListeners.remove(dVar);
    }

    @Override // androidx.core.app.w2
    public final void removeOnNewIntentListener(@n0 androidx.core.util.d<Intent> dVar) {
        this.mOnNewIntentListeners.remove(dVar);
    }

    @Override // androidx.core.app.x2
    public final void removeOnPictureInPictureModeChangedListener(@n0 androidx.core.util.d<b3> dVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(dVar);
    }

    @Override // androidx.core.content.p0
    public final void removeOnTrimMemoryListener(@n0 androidx.core.util.d<Integer> dVar) {
        this.mOnTrimMemoryListeners.remove(dVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.b.h()) {
                androidx.tracing.b.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.d();
        } finally {
            androidx.tracing.b.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@i0 int i10) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.J(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@n0 Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@n0 Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@n0 IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@n0 IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
