package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.i1;
import androidx.core.app.p3;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.c1;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.y, c1, androidx.lifecycle.r, androidx.savedstate.d, androidx.activity.result.b {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    j mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @androidx.annotation.n0
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @androidx.annotation.i0
    private int mContentLayoutId;
    androidx.lifecycle.y0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    t<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.a0 mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<l> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @androidx.annotation.p0
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final l mSavedStateAttachListener;
    androidx.savedstate.c mSavedStateRegistryController;

    @androidx.annotation.p0
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @androidx.annotation.p0
    u0 mViewLifecycleOwner;
    androidx.lifecycle.i0<androidx.lifecycle.y> mViewLifecycleOwnerLiveData;

    @androidx.annotation.n0
    String mWho;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(@androidx.annotation.n0 String str, @androidx.annotation.p0 Exception exc) {
            super(str, exc);
        }
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @androidx.annotation.n0
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f23510b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Bundle bundle) {
            this.f23510b = bundle;
        }

        SavedState(@androidx.annotation.n0 Parcel parcel, @androidx.annotation.p0 ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f23510b = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
            parcel.writeBundle(this.f23510b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends androidx.activity.result.g<I> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AtomicReference f23511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z.a f23512b;

        a(AtomicReference atomicReference, z.a aVar) {
            this.f23511a = atomicReference;
            this.f23512b = aVar;
        }

        @Override // androidx.activity.result.g
        @androidx.annotation.n0
        public z.a<I, ?> a() {
            return this.f23512b;
        }

        @Override // androidx.activity.result.g
        public void c(I i10, @androidx.annotation.p0 androidx.core.app.i iVar) {
            androidx.activity.result.g gVar = (androidx.activity.result.g) this.f23511a.get();
            if (gVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            gVar.c(i10, iVar);
        }

        @Override // androidx.activity.result.g
        public void d() {
            androidx.activity.result.g gVar = (androidx.activity.result.g) this.f23511a.getAndSet(null);
            if (gVar != null) {
                gVar.d();
            }
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class c extends l {
        c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            Fragment.this.mSavedStateRegistryController.c();
            SavedStateHandleSupport.c(Fragment.this);
            Bundle bundle = Fragment.this.mSavedFragmentState;
            Fragment.this.mSavedStateRegistryController.d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SpecialEffectsController f23517b;

        e(SpecialEffectsController specialEffectsController) {
            this.f23517b = specialEffectsController;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23517b.k();
        }
    }

    public class f extends q {
        f() {
        }

        @Override // androidx.fragment.app.q
        @androidx.annotation.p0
        public View c(int i10) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.q
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    public class g implements f0.a<Void, ActivityResultRegistry> {
        g() {
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r10) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof androidx.activity.result.i ? ((androidx.activity.result.i) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class h implements f0.a<Void, ActivityResultRegistry> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ActivityResultRegistry f23521a;

        h(ActivityResultRegistry activityResultRegistry) {
            this.f23521a = activityResultRegistry;
        }

        @Override // f0.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r10) {
            return this.f23521a;
        }
    }

    public class i extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0.a f23523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicReference f23524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z.a f23525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.activity.result.a f23526d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(f0.a aVar, AtomicReference atomicReference, z.a aVar2, androidx.activity.result.a aVar3) {
            super(null);
            this.f23523a = aVar;
            this.f23524b = atomicReference;
            this.f23525c = aVar2;
            this.f23526d = aVar3;
        }

        @Override // androidx.fragment.app.Fragment.l
        void a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f23524b.set(((ActivityResultRegistry) this.f23523a.apply(null)).i(strGenerateActivityResultKey, Fragment.this, this.f23525c, this.f23526d));
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f23528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f23529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.a
        int f23530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.a
        int f23531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.a
        int f23532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.a
        int f23533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f23534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        ArrayList<String> f23535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        ArrayList<String> f23536i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f23537j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f23538k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f23539l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f23540m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f23541n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f23542o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Boolean f23543p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Boolean f23544q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        p3 f23545r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        p3 f23546s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        float f23547t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        View f23548u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f23549v;

        j() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f23538k = obj;
            this.f23539l = null;
            this.f23540m = obj;
            this.f23541n = null;
            this.f23542o = obj;
            this.f23545r = null;
            this.f23546s = null;
            this.f23547t = 1.0f;
            this.f23548u = null;
        }
    }

    @androidx.annotation.w0(19)
    public static class k {
        private k() {
        }

        static void a(@androidx.annotation.n0 View view) {
            view.cancelPendingInputEvents();
        }
    }

    public static abstract class l {
        private l() {
        }

        /* synthetic */ l(b bVar) {
            this();
        }

        abstract void a();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new e0();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.i0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    @androidx.annotation.o
    public Fragment(@androidx.annotation.i0 int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private j ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new j();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    @androidx.annotation.p0
    private Fragment getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            FragmentStrictMode.m(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.o0(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.a0(this);
        this.mSavedStateRegistryController = androidx.savedstate.c.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @androidx.annotation.n0
    @Deprecated
    public static Fragment instantiate(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str) {
        return instantiate(context, str, null);
    }

    @androidx.annotation.n0
    @Deprecated
    public static Fragment instantiate(@androidx.annotation.n0 Context context, @androidx.annotation.n0 String str, @androidx.annotation.p0 Bundle bundle) {
        try {
            Fragment fragmentNewInstance = s.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e10) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$performCreateView$0() {
        this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @androidx.annotation.n0
    private <I, O> androidx.activity.result.g<I> prepareCallInternal(@androidx.annotation.n0 z.a<I, O> aVar, @androidx.annotation.n0 f0.a<Void, ActivityResultRegistry> aVar2, @androidx.annotation.n0 androidx.activity.result.a<O> aVar3) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new i(aVar2, atomicReference, aVar, aVar3));
            return new a(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(@androidx.annotation.n0 l lVar) {
        if (this.mState >= 0) {
            lVar.a();
        } else {
            this.mOnPreAttachedListeners.add(lVar);
        }
    }

    private void restoreViewState() {
        if (FragmentManager.X0(3)) {
            Log.d(FragmentManager.X, "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        j jVar = this.mAnimationInfo;
        if (jVar != null) {
            jVar.f23549v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController specialEffectsControllerR = SpecialEffectsController.r(viewGroup, fragmentManager);
        specialEffectsControllerR.t();
        if (z10) {
            this.mHost.g().post(new e(specialEffectsControllerR));
        } else {
            specialEffectsControllerR.k();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @androidx.annotation.n0
    q createFragmentContainer() {
        return new f();
    }

    public void dump(@androidx.annotation.n0 String str, @androidx.annotation.p0 FileDescriptor fileDescriptor, @androidx.annotation.n0 PrintWriter printWriter, @androidx.annotation.p0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.e0(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        return super.equals(obj);
    }

    @androidx.annotation.p0
    Fragment findFragmentByWho(@androidx.annotation.n0 String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.t0(str);
    }

    @androidx.annotation.n0
    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @androidx.annotation.p0
    public final FragmentActivity getActivity() {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return (FragmentActivity) tVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f23544q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        j jVar = this.mAnimationInfo;
        if (jVar == null || (bool = jVar.f23543p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f23528a;
    }

    @androidx.annotation.p0
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @androidx.annotation.n0
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @androidx.annotation.p0
    public Context getContext() {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return tVar.f();
    }

    @Override // androidx.lifecycle.r
    @androidx.annotation.i
    @androidx.annotation.n0
    public u2.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.X0(3)) {
            Log.d(FragmentManager.X, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        u2.e eVar = new u2.e();
        if (application != null) {
            eVar.c(androidx.lifecycle.y0.a.f24293i, application);
        }
        eVar.c(SavedStateHandleSupport.f24115c, this);
        eVar.c(SavedStateHandleSupport.f24116d, this);
        if (getArguments() != null) {
            eVar.c(SavedStateHandleSupport.f24117e, getArguments());
        }
        return eVar;
    }

    @Override // androidx.lifecycle.r
    @androidx.annotation.n0
    public androidx.lifecycle.y0.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            for (Context applicationContext = requireContext().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && FragmentManager.X0(3)) {
                Log.d(FragmentManager.X, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.s0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @androidx.annotation.a
    int getEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f23530c;
    }

    @androidx.annotation.p0
    public Object getEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f23537j;
    }

    p3 getEnterTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f23545r;
    }

    @androidx.annotation.a
    int getExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f23531d;
    }

    @androidx.annotation.p0
    public Object getExitTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f23539l;
    }

    p3 getExitTransitionCallback() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f23546s;
    }

    View getFocusedView() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f23548u;
    }

    @androidx.annotation.p0
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @androidx.annotation.p0
    public final Object getHost() {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return tVar.i();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @androidx.annotation.n0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @androidx.annotation.n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public LayoutInflater getLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterJ = tVar.j();
        androidx.core.view.q.d(layoutInflaterJ, this.mChildFragmentManager.L0());
        return layoutInflaterJ;
    }

    @Override // androidx.lifecycle.y
    @androidx.annotation.n0
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @androidx.annotation.n0
    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.d(this);
    }

    int getNextTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f23534g;
    }

    @androidx.annotation.p0
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @androidx.annotation.n0
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f23529b;
    }

    @androidx.annotation.a
    int getPopEnterAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f23532e;
    }

    @androidx.annotation.a
    int getPopExitAnim() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 0;
        }
        return jVar.f23533f;
    }

    float getPostOnViewCreatedAlpha() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return 1.0f;
        }
        return jVar.f23547t;
    }

    @androidx.annotation.p0
    public Object getReenterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f23540m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @androidx.annotation.n0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.k(this);
        return this.mRetainInstance;
    }

    @androidx.annotation.p0
    public Object getReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f23538k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.d
    @androidx.annotation.n0
    public final androidx.savedstate.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @androidx.annotation.p0
    public Object getSharedElementEnterTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        return jVar.f23541n;
    }

    @androidx.annotation.p0
    public Object getSharedElementReturnTransition() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return null;
        }
        Object obj = jVar.f23542o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @androidx.annotation.n0
    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f23535h) == null) ? new ArrayList<>() : arrayList;
    }

    @androidx.annotation.n0
    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        j jVar = this.mAnimationInfo;
        return (jVar == null || (arrayList = jVar.f23536i) == null) ? new ArrayList<>() : arrayList;
    }

    @androidx.annotation.n0
    public final String getString(@d1 int i10) {
        return getResources().getString(i10);
    }

    @androidx.annotation.n0
    public final String getString(@d1 int i10, @androidx.annotation.p0 Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    @androidx.annotation.p0
    public final String getTag() {
        return this.mTag;
    }

    @androidx.annotation.p0
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.l(this);
        return this.mTargetRequestCode;
    }

    @androidx.annotation.n0
    public final CharSequence getText(@d1 int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @androidx.annotation.p0
    public View getView() {
        return this.mView;
    }

    @androidx.annotation.n0
    @androidx.annotation.k0
    public androidx.lifecycle.y getViewLifecycleOwner() {
        u0 u0Var = this.mViewLifecycleOwner;
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @androidx.annotation.n0
    public LiveData<androidx.lifecycle.y> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.c1
    @androidx.annotation.n0
    public androidx.lifecycle.b1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.S0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new e0();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.a1(this.mParentFragment));
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.b1(this.mParentFragment));
    }

    boolean isPostponed() {
        j jVar = this.mAnimationInfo;
        if (jVar == null) {
            return false;
        }
        return jVar.f23549v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.e1();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.o1();
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    @Deprecated
    public void onActivityCreated(@androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    @Deprecated
    public void onAttach(@androidx.annotation.n0 Activity activity) {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onAttach(@androidx.annotation.n0 Context context) {
        this.mCalled = true;
        t<?> tVar = this.mHost;
        Activity activityE = tVar == null ? null : tVar.e();
        if (activityE != null) {
            this.mCalled = false;
            onAttach(activityE);
        }
    }

    @androidx.annotation.k0
    @Deprecated
    public void onAttachFragment(@androidx.annotation.n0 Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    public void onConfigurationChanged(@androidx.annotation.n0 Configuration configuration) {
        this.mCalled = true;
    }

    @androidx.annotation.k0
    public boolean onContextItemSelected(@androidx.annotation.n0 MenuItem menuItem) {
        return false;
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (this.mChildFragmentManager.d1(1)) {
            return;
        }
        this.mChildFragmentManager.J();
    }

    @androidx.annotation.k0
    @androidx.annotation.p0
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    @androidx.annotation.k0
    @androidx.annotation.p0
    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @androidx.annotation.k0
    public void onCreateContextMenu(@androidx.annotation.n0 ContextMenu contextMenu, @androidx.annotation.n0 View view, @androidx.annotation.p0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @androidx.annotation.k0
    @Deprecated
    public void onCreateOptionsMenu(@androidx.annotation.n0 Menu menu, @androidx.annotation.n0 MenuInflater menuInflater) {
    }

    @androidx.annotation.k0
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onDestroy() {
        this.mCalled = true;
    }

    @androidx.annotation.k0
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onDestroyView() {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onDetach() {
        this.mCalled = true;
    }

    @androidx.annotation.n0
    public LayoutInflater onGetLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @androidx.annotation.k0
    public void onHiddenChanged(boolean z10) {
    }

    @androidx.annotation.i
    @i1
    @Deprecated
    public void onInflate(@androidx.annotation.n0 Activity activity, @androidx.annotation.n0 AttributeSet attributeSet, @androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @i1
    public void onInflate(@androidx.annotation.n0 Context context, @androidx.annotation.n0 AttributeSet attributeSet, @androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
        t<?> tVar = this.mHost;
        Activity activityE = tVar == null ? null : tVar.e();
        if (activityE != null) {
            this.mCalled = false;
            onInflate(activityE, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @androidx.annotation.i
    @androidx.annotation.k0
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @androidx.annotation.k0
    @Deprecated
    public boolean onOptionsItemSelected(@androidx.annotation.n0 MenuItem menuItem) {
        return false;
    }

    @androidx.annotation.k0
    @Deprecated
    public void onOptionsMenuClosed(@androidx.annotation.n0 Menu menu) {
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @androidx.annotation.k0
    @Deprecated
    public void onPrepareOptionsMenu(@androidx.annotation.n0 Menu menu) {
    }

    @androidx.annotation.k0
    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, @androidx.annotation.n0 String[] strArr, @androidx.annotation.n0 int[] iArr) {
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onResume() {
        this.mCalled = true;
    }

    @androidx.annotation.k0
    public void onSaveInstanceState(@androidx.annotation.n0 Bundle bundle) {
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onStart() {
        this.mCalled = true;
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onStop() {
        this.mCalled = true;
    }

    @androidx.annotation.k0
    public void onViewCreated(@androidx.annotation.n0 View view, @androidx.annotation.p0 Bundle bundle) {
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void onViewStateRestored(@androidx.annotation.p0 Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.o1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.F();
        } else {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<l> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.s(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.P(this);
            this.mChildFragmentManager.G();
        } else {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(@androidx.annotation.n0 Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    boolean performContextItemSelected(@androidx.annotation.n0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.I(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.o1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new androidx.lifecycle.v() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.v
            public void d(@androidx.annotation.n0 androidx.lifecycle.y yVar, @androidx.annotation.n0 Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                k.a(view);
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.l(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(@androidx.annotation.n0 Menu menu, @androidx.annotation.n0 MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z10 = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z10 | this.mChildFragmentManager.K(menu, menuInflater);
    }

    void performCreateView(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, @androidx.annotation.p0 Bundle bundle) {
        this.mChildFragmentManager.o1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new u0(this, getViewModelStore(), new Runnable() { // from class: androidx.fragment.app.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f23730b.lambda$performCreateView$0();
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (FragmentManager.X0(3)) {
            Log.d(FragmentManager.X, "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        ViewTreeLifecycleOwner.b(this.mView, this.mViewLifecycleOwner);
        ViewTreeViewModelStoreOwner.b(this.mView, this.mViewLifecycleOwner);
        ViewTreeSavedStateRegistryOwner.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.r(this.mViewLifecycleOwner);
    }

    void performDestroy() {
        this.mChildFragmentManager.L();
        this.mLifecycleRegistry.l(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.M();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.d(this).h();
            this.mPerformedCreateView = false;
        } else {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.W0()) {
                return;
            }
            this.mChildFragmentManager.L();
            this.mChildFragmentManager = new e0();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
    }

    @androidx.annotation.n0
    LayoutInflater performGetLayoutInflater(@androidx.annotation.p0 Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
    }

    void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    boolean performOptionsItemSelected(@androidx.annotation.n0 MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.R(menuItem);
    }

    void performOptionsMenuClosed(@androidx.annotation.n0 Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.S(menu);
    }

    void performPause() {
        this.mChildFragmentManager.U();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.l(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    boolean performPrepareOptionsMenu(@androidx.annotation.n0 Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z10 = true;
            onPrepareOptionsMenu(menu);
        }
        return z10 | this.mChildFragmentManager.W(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zC1 = this.mFragmentManager.c1(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zC1) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zC1);
            onPrimaryNavigationFragmentChanged(zC1);
            this.mChildFragmentManager.X();
        }
    }

    void performResume() {
        this.mChildFragmentManager.o1();
        this.mChildFragmentManager.j0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.a0 a0Var = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        a0Var.l(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        this.mChildFragmentManager.Y();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    void performStart() {
        this.mChildFragmentManager.o1();
        this.mChildFragmentManager.j0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.a0 a0Var = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        a0Var.l(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        this.mChildFragmentManager.Z();
    }

    void performStop() {
        this.mChildFragmentManager.b0();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.l(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.c0();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f23549v = true;
    }

    public final void postponeEnterTransition(long j10, @androidx.annotation.n0 TimeUnit timeUnit) {
        ensureAnimationInfo().f23549v = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.K0().g();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    @Override // androidx.activity.result.b
    @androidx.annotation.n0
    @androidx.annotation.k0
    public final <I, O> androidx.activity.result.g<I> registerForActivityResult(@androidx.annotation.n0 z.a<I, O> aVar, @androidx.annotation.n0 ActivityResultRegistry activityResultRegistry, @androidx.annotation.n0 androidx.activity.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new h(activityResultRegistry), aVar2);
    }

    @Override // androidx.activity.result.b
    @androidx.annotation.n0
    @androidx.annotation.k0
    public final <I, O> androidx.activity.result.g<I> registerForActivityResult(@androidx.annotation.n0 z.a<I, O> aVar, @androidx.annotation.n0 androidx.activity.result.a<O> aVar2) {
        return prepareCallInternal(aVar, new g(), aVar2);
    }

    public void registerForContextMenu(@androidx.annotation.n0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@androidx.annotation.n0 String[] strArr, int i10) {
        if (this.mHost != null) {
            getParentFragmentManager().k1(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @androidx.annotation.n0
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @androidx.annotation.n0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @androidx.annotation.n0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @androidx.annotation.n0
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @androidx.annotation.n0
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @androidx.annotation.n0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @androidx.annotation.n0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.N1(bundle);
        this.mChildFragmentManager.J();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
            }
        } else {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f23544q = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f23543p = Boolean.valueOf(z10);
    }

    void setAnimations(@androidx.annotation.a int i10, @androidx.annotation.a int i11, @androidx.annotation.a int i12, @androidx.annotation.a int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f23530c = i10;
        ensureAnimationInfo().f23531d = i11;
        ensureAnimationInfo().f23532e = i12;
        ensureAnimationInfo().f23533f = i13;
    }

    public void setArguments(@androidx.annotation.p0 Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@androidx.annotation.p0 p3 p3Var) {
        ensureAnimationInfo().f23545r = p3Var;
    }

    public void setEnterTransition(@androidx.annotation.p0 Object obj) {
        ensureAnimationInfo().f23537j = obj;
    }

    public void setExitSharedElementCallback(@androidx.annotation.p0 p3 p3Var) {
        ensureAnimationInfo().f23546s = p3Var;
    }

    public void setExitTransition(@androidx.annotation.p0 Object obj) {
        ensureAnimationInfo().f23539l = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f23548u = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.s();
        }
    }

    public void setInitialSavedState(@androidx.annotation.p0 SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f23510b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.s();
            }
        }
    }

    void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f23534g = i10;
    }

    void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f23529b = z10;
    }

    void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f23547t = f10;
    }

    public void setReenterTransition(@androidx.annotation.p0 Object obj) {
        ensureAnimationInfo().f23540m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        FragmentStrictMode.o(this);
        this.mRetainInstance = z10;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            fragmentManager.q(this);
        } else {
            fragmentManager.H1(this);
        }
    }

    public void setReturnTransition(@androidx.annotation.p0 Object obj) {
        ensureAnimationInfo().f23538k = obj;
    }

    public void setSharedElementEnterTransition(@androidx.annotation.p0 Object obj) {
        ensureAnimationInfo().f23541n = obj;
    }

    void setSharedElementNames(@androidx.annotation.p0 ArrayList<String> arrayList, @androidx.annotation.p0 ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        j jVar = this.mAnimationInfo;
        jVar.f23535h = arrayList;
        jVar.f23536i = arrayList2;
    }

    public void setSharedElementReturnTransition(@androidx.annotation.p0 Object obj) {
        ensureAnimationInfo().f23542o = obj;
    }

    @Deprecated
    public void setTargetFragment(@androidx.annotation.p0 Fragment fragment, int i10) {
        if (fragment != null) {
            FragmentStrictMode.p(this, fragment, i10);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        FragmentStrictMode.q(this, z10);
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.r1(fragmentManager.D(this));
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@androidx.annotation.n0 String str) {
        t<?> tVar = this.mHost;
        if (tVar != null) {
            return tVar.o(str);
        }
        return false;
    }

    public void startActivity(@androidx.annotation.n0 Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(@androidx.annotation.n0 Intent intent, @androidx.annotation.p0 Bundle bundle) {
        t<?> tVar = this.mHost;
        if (tVar != null) {
            tVar.q(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@androidx.annotation.n0 Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startActivityForResult(@androidx.annotation.n0 Intent intent, int i10, @androidx.annotation.p0 Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().l1(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(@androidx.annotation.n0 IntentSender intentSender, int i10, @androidx.annotation.p0 Intent intent, int i11, int i12, int i13, @androidx.annotation.p0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.X0(2)) {
            Log.v(FragmentManager.X, "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().m1(this, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f23549v) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f23549v = false;
        } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
            this.mHost.g().postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    @androidx.annotation.n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(z5.g.f141884d);
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@androidx.annotation.n0 View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
