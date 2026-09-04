package com.max.xiaoheihe.base.mvvm;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.i0;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import bb.c;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.analytics.d;
import com.max.hbcommon.analytics.j;
import com.max.hbcommon.base.f;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.TitleBar;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;
import kotlin.z;
import mb.s;

/* JADX INFO: compiled from: BaseFragment.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nBaseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFragment.kt\ncom/max/xiaoheihe/base/mvvm/BaseFragment\n+ 2 MVVMUtils.kt\ncom/max/xiaoheihe/base/mvvm/MVVMUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,539:1\n20#2:540\n19#2,5:552\n24#2:558\n4098#3,11:541\n1#4:557\n*S KotlinDebug\n*F\n+ 1 BaseFragment.kt\ncom/max/xiaoheihe/base/mvvm/BaseFragment\n*L\n105#1:540\n105#1:552,5\n105#1:558\n105#1:541,11\n105#1:557\n*E\n"})
@o(parameters = 0)
public abstract class BaseFragment<T extends BaseViewModel> extends Fragment implements d.f, f, com.max.hbcommon.analytics.f {
    public static final int K = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private CircularProgressIndicator C;
    private boolean G;
    private boolean H;

    @e
    private j I;

    @e
    private PathSrcNode J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f76882b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f76884d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f76886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private Activity f76887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected T f76888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private y0.b f76889i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private View f76890j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f76891k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnClickListener f76892l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected TitleBar f76893m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected View f76894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected LayoutInflater f76895o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @e
    private s f76896p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @e
    private l3.c f76897q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @e
    private View f76898r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @e
    private View f76899s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @e
    private View f76900t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @e
    private View f76901u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @e
    private View f76902v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f76903w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f76883c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f76885e = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final ViewGroup.LayoutParams f76904x = new ViewGroup.LayoutParams(-1, -1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f76905y = R.layout.empty_view;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f76906z = R.layout.error_view;
    private int A = R.layout.loading_view;
    private int B = R.layout.no_network_view;

    @dl.d
    private final z D = b0.c(new yh.a<io.reactivex.disposables.a>() { // from class: com.max.xiaoheihe.base.mvvm.BaseFragment$mCompositeDisposable$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final io.reactivex.disposables.a a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.UI, new Class[0], io.reactivex.disposables.a.class);
            return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : new io.reactivex.disposables.a();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [io.reactivex.disposables.a, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ io.reactivex.disposables.a invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.VI, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    @dl.d
    private final z E = b0.c(new yh.a<ArrayList<ValueAnimator>>() { // from class: com.max.xiaoheihe.base.mvvm.BaseFragment$mValueAnimatorList$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final ArrayList<ValueAnimator> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.YI, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : new ArrayList<>();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.ArrayList<android.animation.ValueAnimator>] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ ArrayList<ValueAnimator> invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.ZI, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    @dl.d
    private final z F = b0.c(new yh.a<ArrayList<Dialog>>() { // from class: com.max.xiaoheihe.base.mvvm.BaseFragment$mDialogList$2
        public static ChangeQuickRedirect changeQuickRedirect;

        @dl.d
        public final ArrayList<Dialog> a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.WI, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : new ArrayList<>();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.ArrayList<android.app.Dialog>] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ ArrayList<Dialog> invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.XI, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
        }
    });

    /* JADX INFO: compiled from: BaseFragment.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseFragment<T> f76907b;

        a(BaseFragment<T> baseFragment) {
            this.f76907b = baseFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.TI, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f76907b.Y3().a();
        }
    }

    /* JADX INFO: compiled from: BaseFragment.kt */
    public static final class b implements j0<BaseDisplayState> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseFragment<T> f76908a;

        /* JADX INFO: compiled from: BaseFragment.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76909a;

            static {
                int[] iArr = new int[BaseDisplayState.valuesCustom().length];
                try {
                    iArr[BaseDisplayState.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BaseDisplayState.CONTENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[BaseDisplayState.NO_NETWORK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[BaseDisplayState.EMPTY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[BaseDisplayState.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f76909a = iArr;
            }
        }

        b(BaseFragment<T> baseFragment) {
            this.f76908a = baseFragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(BaseDisplayState baseDisplayState) {
            if (PatchProxy.proxy(new Object[]{baseDisplayState}, this, changeQuickRedirect, false, bb.c.m.bJ, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(baseDisplayState);
        }

        public final void b(BaseDisplayState baseDisplayState) {
            if (PatchProxy.proxy(new Object[]{baseDisplayState}, this, changeQuickRedirect, false, bb.c.m.aJ, new Class[]{BaseDisplayState.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseFragment.L3(this.f76908a);
            int i10 = baseDisplayState == null ? -1 : a.f76909a[baseDisplayState.ordinal()];
            if (i10 == 1) {
                this.f76908a.showLoading();
                return;
            }
            if (i10 == 2) {
                this.f76908a.showContentView();
                return;
            }
            if (i10 == 3) {
                this.f76908a.showNoNetwork();
                return;
            }
            if (i10 == 4) {
                this.f76908a.showEmpty();
            } else if (i10 != 5) {
                this.f76908a.showError();
            } else {
                this.f76908a.showError();
            }
        }
    }

    /* JADX INFO: compiled from: BaseFragment.kt */
    public static final class c implements j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseFragment<T> f76910a;

        c(BaseFragment<T> baseFragment) {
            this.f76910a = baseFragment;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.m.dJ, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public final void b(Integer it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.cJ, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseFragment<T> baseFragment = this.f76910a;
            f0.o(it, "it");
            baseFragment.r4(it.intValue());
        }
    }

    public static final /* synthetic */ void L3(BaseFragment baseFragment) {
        if (PatchProxy.proxy(new Object[]{baseFragment}, null, changeQuickRedirect, true, bb.c.m.SI, new Class[]{BaseFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        baseFragment.a4();
    }

    private final io.reactivex.disposables.a P3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.UH, new Class[0], io.reactivex.disposables.a.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.disposables.a) patchProxyResultProxy.result : (io.reactivex.disposables.a) this.D.getValue();
    }

    private final ArrayList<Dialog> R3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.WH, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : (ArrayList) this.F.getValue();
    }

    private final ArrayList<ValueAnimator> X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.VH, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : (ArrayList) this.E.getValue();
    }

    private final void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.BI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f76900t;
        if (view != null) {
            view.setVisibility(8);
        }
        CircularProgressIndicator circularProgressIndicator = this.C;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.j();
        }
        View view2 = this.f76898r;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.f76899s;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f76901u;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = this.f76902v;
        if (view5 == null) {
            return;
        }
        view5.setVisibility(8);
    }

    private final void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.KI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76892l = new a(this);
    }

    private final void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.JI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        s sVar = this.f76896p;
        f0.m(sVar);
        this.f76890j = sVar.b();
        s sVar2 = this.f76896p;
        f0.m(sVar2);
        FrameLayout frameLayout = sVar2.f131735b;
        f0.o(frameLayout, "mBaseBinding!!.multiStatusViewContainer");
        this.f76891k = frameLayout;
        s sVar3 = this.f76896p;
        f0.m(sVar3);
        TitleBar titleBar = sVar3.f131736c;
        f0.o(titleBar, "mBaseBinding!!.tbTitle");
        n4(titleBar);
        s sVar4 = this.f76896p;
        f0.m(sVar4);
        View root = sVar4.f131737d.getRoot();
        f0.o(root, "mBaseBinding!!.titleBarDivider.root");
        o4(root);
    }

    private final boolean isParentHidden() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.kI, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        for (Fragment parentFragment = getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment.isHidden() || !parentFragment.getUserVisibleHint()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String H() {
        return com.max.hbcommon.analytics.e.a(this);
    }

    public final void M3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.EI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Dialog dialog : R3()) {
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        R3().clear();
    }

    public final boolean N3() {
        return this.G;
    }

    @e
    public final s O3() {
        return this.f76896p;
    }

    @e
    public final View Q3() {
        return this.f76902v;
    }

    public final boolean S3() {
        return this.f76885e;
    }

    public final boolean T3() {
        return this.f76884d;
    }

    public final boolean U3() {
        return this.f76886f;
    }

    @dl.d
    public final TitleBar V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.OH, new Class[0], TitleBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (TitleBar) patchProxyResultProxy.result;
        }
        TitleBar titleBar = this.f76893m;
        if (titleBar != null) {
            return titleBar;
        }
        f0.S("mTitleBar");
        return null;
    }

    @dl.d
    public final View W3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.QH, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f76894n;
        if (view != null) {
            return view;
        }
        f0.S("mTitleBarDivider");
        return null;
    }

    @dl.d
    public final T Y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.MH, new Class[0], BaseViewModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        T t10 = this.f76888h;
        if (t10 != null) {
            return t10;
        }
        f0.S("mViewModel");
        return null;
    }

    @e
    public final j Z3() {
        return this.I;
    }

    public final void addDisposable(@dl.d io.reactivex.disposables.b disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, changeQuickRedirect, false, bb.c.m.FI, new Class[]{io.reactivex.disposables.b.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(disposable, "disposable");
        P3().c(disposable);
    }

    public void addValueAnimator(@dl.d ValueAnimator valueAnimator) {
        if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.m.HI, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(valueAnimator, "valueAnimator");
        X3().add(valueAnimator);
    }

    public abstract void bindViews();

    public void clearCompositeDisposable() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.GI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        P3().f();
    }

    public void clearValueAnimator() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.II, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (ValueAnimator valueAnimator : X3()) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        X3().clear();
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean d2() {
        return com.max.hbcommon.analytics.e.c(this);
    }

    public final boolean d4() {
        return this.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.max.hbcommon.analytics.f
    public void dispatchUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.PI, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            onFragmentShow();
        } else {
            onFragmentHide();
        }
        if (isAdded()) {
            List<Fragment> listJ0 = getChildFragmentManager().J0();
            f0.o(listJ0, "childFragmentManager.fragments");
            if (com.max.hbcommon.utils.c.w(listJ0)) {
                return;
            }
            for (Fragment fragment : listJ0) {
                if ((fragment instanceof com.max.hbcommon.analytics.f) && fragment.getUserVisibleHint()) {
                    ((com.max.hbcommon.analytics.f) fragment).dispatchUserVisibleHint(z10);
                }
            }
        }
    }

    public final boolean e4() {
        return this.f76888h != null;
    }

    public void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.CI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y3().k().k(getViewLifecycleOwner(), new b(this));
        Y3().f().k(getViewLifecycleOwner(), new c(this));
    }

    public abstract void g4();

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public PathSrcNode getClickSrc() {
        return this.J;
    }

    @dl.d
    public abstract Handler getEventHandler();

    @e
    public final l3.c getMBinding() {
        return this.f76897q;
    }

    @dl.d
    public final LayoutInflater getMInflater() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.SH, new Class[0], LayoutInflater.class);
        if (patchProxyResultProxy.isSupported) {
            return (LayoutInflater) patchProxyResultProxy.result;
        }
        LayoutInflater layoutInflater = this.f76895o;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        f0.S("mInflater");
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public String getPageAdditional() {
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public String getPagePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.NI, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : d.r(getClass());
    }

    @e
    public final Activity getParentActivity() {
        return this.f76887g;
    }

    @e
    public ViewGroup getVgBaseFragmentView() {
        return (ViewGroup) this.f76890j;
    }

    @Override // com.max.hbcommon.base.f
    @e
    public Context getViewContext() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.MI, new Class[0], Context.class);
        return patchProxyResultProxy.isSupported ? (Context) patchProxyResultProxy.result : getContext();
    }

    public final void h4(boolean z10) {
        this.G = z10;
    }

    public final void i4(@e s sVar) {
        this.f76896p = sVar;
    }

    public void initData() {
    }

    public abstract void initViews();

    @Override // com.max.hbcommon.base.f
    public boolean isActive() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.LI, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return isAdded() && this.f76882b;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public boolean isPageVisited() {
        return this.f76903w;
    }

    public final void j4(@e View view) {
        this.f76902v = view;
    }

    public final void k4(boolean z10) {
        this.f76885e = z10;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ void l1(View view) {
        com.max.hbcommon.analytics.e.f(this, view);
    }

    public final void l4(boolean z10) {
        this.f76884d = z10;
    }

    public void loadData() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.nI, new Class[0], Void.TYPE).isSupported && this.f76884d && this.f76886f && this.f76885e) {
            initData();
            this.f76885e = false;
        }
    }

    public final void m4(boolean z10) {
        this.f76886f = z10;
    }

    public final void n4(@dl.d TitleBar titleBar) {
        if (PatchProxy.proxy(new Object[]{titleBar}, this, changeQuickRedirect, false, bb.c.m.PH, new Class[]{TitleBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(titleBar, "<set-?>");
        this.f76893m = titleBar;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean o3() {
        return com.max.hbcommon.analytics.e.d(this);
    }

    public final void o4(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.RH, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f76894n = view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.m.XH, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        this.f76887g = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.m.ZH, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Type genericSuperclass = getClass().getGenericSuperclass();
        f0.n(genericSuperclass, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        f0.o(actualTypeArguments, "javaClass.genericSupercl…Type).actualTypeArguments");
        ArrayList arrayList = new ArrayList();
        for (Type type : actualTypeArguments) {
            if (type instanceof Class) {
                arrayList.add(type);
            }
        }
        Object obj = arrayList.get(0);
        f0.n(obj, "null cannot be cast to non-null type java.lang.Class<VM of com.max.xiaoheihe.base.mvvm.MVVMUtilsKt.createViewModel>");
        BaseViewModel baseViewModel = (BaseViewModel) new y0(this).a((Class) obj);
        FragmentActivity it = getActivity();
        if (it != null) {
            f0.o(it, "it");
            baseViewModel.n(it);
        }
        p4(baseViewModel);
    }

    @Override // androidx.fragment.app.Fragment
    @e
    public View onCreateView(@dl.d LayoutInflater inflater, @e ViewGroup viewGroup, @e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.m.aI, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        this.f76896p = s.d(inflater, viewGroup, false);
        setMInflater(inflater);
        c4();
        b4();
        bindViews();
        initViews();
        f4();
        g4();
        this.f76882b = true;
        this.I = new j(this, bundle != null);
        d.z(this, this.f76890j, bundle);
        if (this.H) {
            V3().setInStack();
        }
        if (this.G) {
            V3().setBackIconInvisible();
            V3().getAppbarNavButtonView().setVisibility(4);
        }
        return this.f76890j;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.iI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("Fragment_OnDestroyView :  " + getClass().getSimpleName());
        }
        j jVar = this.I;
        if (jVar != null) {
            jVar.d();
        }
        clearCompositeDisposable();
        clearValueAnimator();
        M3();
        this.f76885e = true;
        this.f76884d = false;
        this.f76882b = false;
        this.f76902v = null;
        this.f76898r = null;
        this.f76899s = null;
        this.f76900t = null;
        this.f76901u = null;
        this.f76890j = null;
        this.f76896p = null;
        this.f76897q = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.YH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
        this.f76887g = null;
    }

    public final void onFragmentHide() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.mI, new Class[0], Void.TYPE).isSupported || this.f76883c) {
            return;
        }
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("Fragment_OnFragmentHide :  " + getClass().getSimpleName());
        }
        onInvisible();
        this.f76883c = true;
        j jVar = this.I;
        if (jVar != null) {
            jVar.e();
        }
    }

    public final void onFragmentShow() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.lI, new Class[0], Void.TYPE).isSupported && this.f76883c) {
            g gVarF = g.f74531b.F();
            if (gVarF != null) {
                gVarF.a0("Fragment_OnFragmentShow :  " + getClass().getSimpleName());
            }
            onVisible();
            this.f76883c = false;
            j jVar = this.I;
            if (jVar != null) {
                jVar.f();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        if (!PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.bI, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported && getUserVisibleHint()) {
            if (z10) {
                onFragmentHide();
            } else {
                if (isParentHidden()) {
                    return;
                }
                onFragmentShow();
            }
        }
    }

    public void onInvisible() {
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void onPageVisitSuccess() {
        j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.OI, new Class[0], Void.TYPE).isSupported || (jVar = this.I) == null) {
            return;
        }
        jVar.k();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.gI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("Fragment_OnPause :  " + getClass().getSimpleName());
        }
        onFragmentHide();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.fI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("Fragment_OnResume :  " + getClass().getSimpleName());
        }
        if (isHidden() || isParentHidden() || !getUserVisibleHint()) {
            return;
        }
        onFragmentShow();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.eI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        j jVar = this.I;
        if (jVar != null) {
            jVar.g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.hI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j jVar = this.I;
        if (jVar != null) {
            jVar.h();
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.m.dI, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("Fragment_OnViewCreated :  " + getClass().getSimpleName());
        }
        this.f76884d = true;
        loadData();
    }

    public void onVisible() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.oI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        loadData();
    }

    public final void p4(@dl.d T t10) {
        if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.m.NH, new Class[]{BaseViewModel.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(t10, "<set-?>");
        this.f76888h = t10;
    }

    public final void q4(@e j jVar) {
        this.I = jVar;
    }

    public void r4(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.DI, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == 0) {
            M3();
        }
    }

    public final void registerReceiver(@e BroadcastReceiver broadcastReceiver, @e String str) {
        if (PatchProxy.proxy(new Object[]{broadcastReceiver, str}, this, changeQuickRedirect, false, bb.c.m.QI, new Class[]{BroadcastReceiver.class, String.class}, Void.TYPE).isSupported || broadcastReceiver == null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        if (Build.VERSION.SDK_INT >= 26) {
            Activity activity = this.f76887g;
            if (activity != null) {
                activity.registerReceiver(broadcastReceiver, intentFilter, 2);
                return;
            }
            return;
        }
        Activity activity2 = this.f76887g;
        if (activity2 != null) {
            activity2.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setClickSrc(@e PathSrcNode pathSrcNode) {
        this.J = pathSrcNode;
    }

    public final void setInFragmentStack(boolean z10) {
        this.H = z10;
    }

    public final void setMBinding(@e l3.c cVar) {
        this.f76897q = cVar;
    }

    public final void setMInflater(@dl.d LayoutInflater layoutInflater) {
        if (PatchProxy.proxy(new Object[]{layoutInflater}, this, changeQuickRedirect, false, bb.c.m.TH, new Class[]{LayoutInflater.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(layoutInflater, "<set-?>");
        this.f76895o = layoutInflater;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setPageVisited(boolean z10) {
        this.f76903w = z10;
    }

    public final void setParentActivity(@e Activity activity) {
        this.f76887g = activity;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.m.cI, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setUserVisibleHint(z10);
        if (isResumed() && z10) {
            dispatchUserVisibleHint(true);
        } else {
            dispatchUserVisibleHint(false);
        }
        if (getUserVisibleHint()) {
            this.f76886f = true;
            onVisible();
        } else {
            this.f76886f = false;
            onInvisible();
        }
    }

    public final void setViewBinding(@dl.d l3.c binding) {
        if (PatchProxy.proxy(new Object[]{binding}, this, changeQuickRedirect, false, bb.c.m.jI, new Class[]{l3.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(binding, "binding");
        this.f76897q = binding;
        FrameLayout frameLayout = this.f76891k;
        if (frameLayout == null) {
            f0.S("mContainer");
            frameLayout = null;
        }
        frameLayout.addView(binding.getRoot(), 0, this.f76904x);
        this.f76902v = binding.getRoot();
    }

    public final void showContentView() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.pI, new Class[0], Void.TYPE).isSupported || (view = this.f76902v) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void showEmpty() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.uI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76898r == null) {
            FrameLayout frameLayout = null;
            this.f76898r = getMInflater().inflate(this.f76905y, (ViewGroup) null);
            FrameLayout frameLayout2 = this.f76891k;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76898r, 0, this.f76904x);
        }
        View view = this.f76898r;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void showEmpty(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.tI, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76905y = i10;
        showEmpty();
    }

    public final void showEmpty(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.m.wI, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        showEmpty(i10, com.max.xiaoheihe.utils.d.n0(i11));
    }

    public final void showEmpty(int i10, @e String str) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), str}, this, changeQuickRedirect, false, bb.c.m.vI, new Class[]{Integer.TYPE, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f76898r == null) {
            FrameLayout frameLayout = null;
            this.f76898r = getMInflater().inflate(this.f76905y, (ViewGroup) null);
            FrameLayout frameLayout2 = this.f76891k;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76898r, 0, this.f76904x);
        }
        View view = this.f76898r;
        f0.m(view);
        View viewFindViewById = view.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View view2 = this.f76898r;
        f0.m(view2);
        View viewFindViewById2 = view2.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((ImageView) viewFindViewById).setImageResource(i10);
        ((TextView) viewFindViewById2).setText(str);
        View view3 = this.f76898r;
        if (view3 == null) {
            return;
        }
        view3.setVisibility(0);
    }

    public final void showError() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.yI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76899s == null) {
            FrameLayout frameLayout = null;
            View viewInflate = getMInflater().inflate(this.f76906z, (ViewGroup) null);
            this.f76899s = viewInflate;
            f0.m(viewInflate);
            View.OnClickListener onClickListener = this.f76892l;
            if (onClickListener == null) {
                f0.S("mOnRetryClickListener");
                onClickListener = null;
            }
            viewInflate.setOnClickListener(onClickListener);
            FrameLayout frameLayout2 = this.f76891k;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76899s, 0, this.f76904x);
        }
        j jVar = this.I;
        if (jVar != null) {
            jVar.i();
        }
        View view = this.f76899s;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void showError(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.xI, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f76906z = i10;
        showError();
    }

    public final void showLoading() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.rI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading((String) null);
    }

    public final void showLoading(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.qI, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.A = i10;
        showLoading();
    }

    public final void showLoading(@e String str) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.m.sI, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f76900t == null) {
            View viewInflate = getMInflater().inflate(this.A, (ViewGroup) null);
            this.f76900t = viewInflate;
            View viewFindViewById = viewInflate != null ? viewInflate.findViewById(R.id.tv_loading_description) : null;
            TextView textView = viewFindViewById instanceof TextView ? (TextView) viewFindViewById : null;
            if (str != null && !u.V1(str)) {
                z10 = false;
            }
            if (!z10 && textView != null) {
                textView.setText(str);
            }
            FrameLayout frameLayout = this.f76891k;
            if (frameLayout == null) {
                f0.S("mContainer");
                frameLayout = null;
            }
            frameLayout.addView(this.f76900t, 0, this.f76904x);
        }
        View view = this.f76900t;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f76900t;
        CircularProgressIndicator circularProgressIndicator = view2 != null ? (CircularProgressIndicator) view2.findViewById(R.id.img_progress) : null;
        CircularProgressIndicator circularProgressIndicator2 = circularProgressIndicator instanceof CircularProgressIndicator ? circularProgressIndicator : null;
        this.C = circularProgressIndicator2;
        if (circularProgressIndicator2 != null) {
            circularProgressIndicator2.p();
        }
    }

    public final void showNoNetwork() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.AI, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76901u == null) {
            FrameLayout frameLayout = null;
            View viewInflate = getMInflater().inflate(this.B, (ViewGroup) null);
            this.f76901u = viewInflate;
            f0.m(viewInflate);
            View.OnClickListener onClickListener = this.f76892l;
            if (onClickListener == null) {
                f0.S("mOnRetryClickListener");
                onClickListener = null;
            }
            viewInflate.setOnClickListener(onClickListener);
            FrameLayout frameLayout2 = this.f76891k;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76901u, 0, this.f76904x);
        }
        View view = this.f76901u;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public final void showNoNetwork(@i0 int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.zI, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.B = i10;
        showNoNetwork();
    }

    public final void unregisterReceiver(@e BroadcastReceiver broadcastReceiver) {
        if (PatchProxy.proxy(new Object[]{broadcastReceiver}, this, changeQuickRedirect, false, bb.c.m.RI, new Class[]{BroadcastReceiver.class}, Void.TYPE).isSupported || broadcastReceiver == null) {
            return;
        }
        try {
            Activity activity = this.f76887g;
            if (activity != null) {
                activity.unregisterReceiver(broadcastReceiver);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String v3() {
        return com.max.hbcommon.analytics.e.b(this);
    }
}
