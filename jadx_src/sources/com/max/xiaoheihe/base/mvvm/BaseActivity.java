package com.max.xiaoheihe.base.mvvm;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.o;
import androidx.lifecycle.j0;
import androidx.lifecycle.y0;
import bb.c;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcommon.analytics.j;
import com.max.hbcommon.base.f;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcommon.component.TitleBar;
import com.max.hbutils.utils.t;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.base.mvvm.BaseViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.analytics.MobclickAgent;
import dl.d;
import dl.e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.k;
import kotlin.z;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@t0({"SMAP\nBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseActivity.kt\ncom/max/xiaoheihe/base/mvvm/BaseActivity\n+ 2 MVVMUtils.kt\ncom/max/xiaoheihe/base/mvvm/MVVMUtilsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,349:1\n11#2:350\n10#2,6:362\n4098#3,11:351\n*S KotlinDebug\n*F\n+ 1 BaseActivity.kt\ncom/max/xiaoheihe/base/mvvm/BaseActivity\n*L\n88#1:350\n88#1:362,6\n88#1:351,11\n*E\n"})
@o(parameters = 0)
public abstract class BaseActivity<T extends BaseViewModel> extends AppCompatActivity implements com.max.hbcommon.analytics.d.f, f {
    public static final int B = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected View f76851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FrameLayout f76852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View.OnClickListener f76853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected TitleBar f76854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected View f76855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private mb.a f76856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private l3.c f76857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected T f76858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private y0.b f76859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f76860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private View f76861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private View f76862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @e
    private View f76863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @e
    private View f76864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @e
    private View f76865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @e
    private View f76866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @e
    private CircularProgressIndicator f76867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f76868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f76869t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f76870u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f76871v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final ViewGroup.LayoutParams f76872w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.d
    private final z f76873x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @e
    private j f76874y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @e
    private PathSrcNode f76875z;

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity<T> f76876b;

        a(BaseActivity<T> baseActivity) {
            this.f76876b = baseActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.BH, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f76876b.i1().a();
        }
    }

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class b implements j0<BaseDisplayState> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseActivity<T> f76877a;

        /* JADX INFO: compiled from: BaseActivity.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f76878a;

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
                f76878a = iArr;
            }
        }

        b(BaseActivity<T> baseActivity) {
            this.f76877a = baseActivity;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(BaseDisplayState baseDisplayState) {
            if (PatchProxy.proxy(new Object[]{baseDisplayState}, this, changeQuickRedirect, false, bb.c.m.FH, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(baseDisplayState);
        }

        public final void b(BaseDisplayState baseDisplayState) {
            if (PatchProxy.proxy(new Object[]{baseDisplayState}, this, changeQuickRedirect, false, bb.c.m.EH, new Class[]{BaseDisplayState.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseActivity.N0(this.f76877a);
            int i10 = baseDisplayState == null ? -1 : a.f76878a[baseDisplayState.ordinal()];
            if (i10 == 1) {
                BaseActivity.P0(this.f76877a);
                return;
            }
            if (i10 == 2) {
                this.f76877a.C1();
                return;
            }
            if (i10 == 3) {
                BaseActivity.Q0(this.f76877a);
                return;
            }
            if (i10 == 4) {
                this.f76877a.E1();
            } else if (i10 != 5) {
                BaseActivity.O0(this.f76877a);
            } else {
                BaseActivity.O0(this.f76877a);
            }
        }
    }

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class c implements j0<Integer> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseActivity<T> f76879a;

        c(BaseActivity<T> baseActivity) {
            this.f76879a = baseActivity;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Integer num) {
            if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.m.HH, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(num);
        }

        public final void b(Integer it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.GH, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                return;
            }
            BaseActivity<T> baseActivity = this.f76879a;
            f0.o(it, "it");
            baseActivity.D1(it.intValue());
        }
    }

    /* JADX INFO: compiled from: BaseActivity.kt */
    public static final class d implements j0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseActivity<T> f76880a;

        d(BaseActivity<T> baseActivity) {
            this.f76880a = baseActivity;
        }

        @Override // androidx.lifecycle.j0
        public /* bridge */ /* synthetic */ void a(Boolean bool) {
            if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.m.JH, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            b(bool);
        }

        public final void b(Boolean it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.m.IH, new Class[]{Boolean.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.o(it, "it");
            if (it.booleanValue()) {
                this.f76880a.finish();
            }
        }
    }

    public BaseActivity() {
        this.f76868s = R.layout.empty_view;
        this.f76869t = R.layout.error_view;
        this.f76870u = R.layout.loading_view;
        this.f76871v = R.layout.no_network_view;
        this.f76872w = new ViewGroup.LayoutParams(-1, -1);
        this.f76873x = b0.c(new yh.a<ArrayList<Dialog>>() { // from class: com.max.xiaoheihe.base.mvvm.BaseActivity$mDialogList$2
            public static ChangeQuickRedirect changeQuickRedirect;

            @d
            public final ArrayList<Dialog> a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.CH, new Class[0], ArrayList.class);
                return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : new ArrayList<>();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.ArrayList<android.app.Dialog>] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ArrayList<Dialog> invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.DH, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseActivity(@dl.d y0.b factory) {
        this();
        f0.p(factory, "factory");
        this.f76859j = factory;
    }

    private final void F1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.nH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76862m == null) {
            FrameLayout frameLayout = null;
            View viewInflate = LayoutInflater.from(this).inflate(this.f76869t, (ViewGroup) null);
            this.f76862m = viewInflate;
            f0.m(viewInflate);
            View.OnClickListener onClickListener = this.f76853d;
            if (onClickListener == null) {
                f0.S("mOnRetryClickListener");
                onClickListener = null;
            }
            viewInflate.setOnClickListener(onClickListener);
            FrameLayout frameLayout2 = this.f76852c;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76862m, 0, this.f76872w);
        }
        j jVar = this.f76874y;
        if (jVar != null) {
            jVar.i();
        }
        View view = this.f76862m;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    private final void G1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.mH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76863n == null) {
            FrameLayout frameLayout = null;
            this.f76863n = LayoutInflater.from(this).inflate(this.f76870u, (ViewGroup) null);
            FrameLayout frameLayout2 = this.f76852c;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76863n, 0, this.f76872w);
        }
        View view = this.f76863n;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.f76863n;
        f0.m(view2);
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) view2.findViewById(R.id.img_progress);
        this.f76867r = circularProgressIndicator;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.p();
        }
    }

    private final void H1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.oH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76864o == null) {
            FrameLayout frameLayout = null;
            View viewInflate = LayoutInflater.from(this).inflate(this.f76871v, (ViewGroup) null);
            this.f76864o = viewInflate;
            f0.m(viewInflate);
            View.OnClickListener onClickListener = this.f76853d;
            if (onClickListener == null) {
                f0.S("mOnRetryClickListener");
                onClickListener = null;
            }
            viewInflate.setOnClickListener(onClickListener);
            FrameLayout frameLayout2 = this.f76852c;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76864o, 0, this.f76872w);
        }
        View view = this.f76864o;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    public static final /* synthetic */ void N0(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, bb.c.m.xH, new Class[]{BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        baseActivity.j1();
    }

    public static final /* synthetic */ void O0(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, bb.c.m.AH, new Class[]{BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        baseActivity.F1();
    }

    public static final /* synthetic */ void P0(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, bb.c.m.yH, new Class[]{BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        baseActivity.G1();
    }

    public static final /* synthetic */ void Q0(BaseActivity baseActivity) {
        if (PatchProxy.proxy(new Object[]{baseActivity}, null, changeQuickRedirect, true, bb.c.m.zH, new Class[]{BaseActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        baseActivity.H1();
    }

    private final void S0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.jH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        mb.a aVar = this.f76856g;
        f0.m(aVar);
        LinearLayout linearLayout = aVar.f131476c;
        f0.o(linearLayout, "mBaseBinding!!.root");
        setMRootView(linearLayout);
        mb.a aVar2 = this.f76856g;
        f0.m(aVar2);
        FrameLayout frameLayout = aVar2.f131475b;
        f0.o(frameLayout, "mBaseBinding!!.multiStatusViewContainer");
        this.f76852c = frameLayout;
        mb.a aVar3 = this.f76856g;
        f0.m(aVar3);
        TitleBar titleBar = aVar3.f131477d;
        f0.o(titleBar, "mBaseBinding!!.tbTitle");
        y1(titleBar);
        mb.a aVar4 = this.f76856g;
        f0.m(aVar4);
        View root = aVar4.f131478e.getRoot();
        f0.o(root, "mBaseBinding!!.titleBarDivider.root");
        setMTitleBarDivider(root);
        t.J(this);
    }

    private final ArrayList<Dialog> a1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.ZG, new Class[0], ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : (ArrayList) this.f76873x.getValue();
    }

    private final void j1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.hH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f76863n;
        if (view != null) {
            view.setVisibility(8);
        }
        CircularProgressIndicator circularProgressIndicator = this.f76867r;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.j();
        }
        View view2 = this.f76861l;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = this.f76862m;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = this.f76864o;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        View view5 = this.f76866q;
        if (view5 == null) {
            return;
        }
        view5.setVisibility(8);
    }

    private final void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.kH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76853d = new a(this);
    }

    public final void A1(@dl.d l3.c binding) {
        if (PatchProxy.proxy(new Object[]{binding}, this, changeQuickRedirect, false, bb.c.m.bH, new Class[]{l3.c.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(binding, "binding");
        this.f76857h = binding;
        FrameLayout frameLayout = this.f76852c;
        if (frameLayout == null) {
            f0.S("mContainer");
            frameLayout = null;
        }
        frameLayout.addView(binding.getRoot(), 0, this.f76872w);
        this.f76866q = binding.getRoot();
    }

    public final void C1() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.lH, new Class[0], Void.TYPE).isSupported || (view = this.f76866q) == null) {
            return;
        }
        view.setVisibility(0);
    }

    public void D1(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.m.tH, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 == 0) {
            T0();
        }
    }

    public void E1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.pH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f76861l == null) {
            FrameLayout frameLayout = null;
            this.f76861l = LayoutInflater.from(this).inflate(this.f76868s, (ViewGroup) null);
            FrameLayout frameLayout2 = this.f76852c;
            if (frameLayout2 == null) {
                f0.S("mContainer");
            } else {
                frameLayout = frameLayout2;
            }
            frameLayout.addView(this.f76861l, 0, this.f76872w);
        }
        View view = this.f76861l;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String H() {
        return com.max.hbcommon.analytics.e.a(this);
    }

    public final void R0(@e Dialog dialog) {
        if (PatchProxy.proxy(new Object[]{dialog}, this, changeQuickRedirect, false, bb.c.m.rH, new Class[]{Dialog.class}, Void.TYPE).isSupported || dialog == null) {
            return;
        }
        a1().add(dialog);
    }

    public final void T0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.sH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (Dialog dialog : a1()) {
            if (dialog.isShowing()) {
                dialog.dismiss();
            }
        }
        a1().clear();
    }

    @dl.d
    public final String U0() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.qH, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String simpleName = getClass().getSimpleName();
        f0.o(simpleName, "javaClass.simpleName");
        return simpleName;
    }

    @dl.d
    public abstract Handler V0();

    @e
    public final mb.a W0() {
        return this.f76856g;
    }

    @e
    public final l3.c X0() {
        return this.f76857h;
    }

    @e
    public final View Z0() {
        return this.f76866q;
    }

    public abstract void bindViews();

    @dl.d
    public final View c1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.RG, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f76851b;
        if (view != null) {
            return view;
        }
        f0.S("mRootView");
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean d2() {
        return com.max.hbcommon.analytics.e.c(this);
    }

    @Override // android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.vH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.finish();
        ob.a.b().j(this);
    }

    @dl.d
    public final TitleBar g1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.TG, new Class[0], TitleBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (TitleBar) patchProxyResultProxy.result;
        }
        TitleBar titleBar = this.f76854e;
        if (titleBar != null) {
            return titleBar;
        }
        f0.S("mTitleBar");
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public PathSrcNode getClickSrc() {
        return this.f76875z;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public String getPageAdditional() {
        return null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    @e
    public String getPagePath() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.uH, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbcommon.analytics.d.r(getClass());
    }

    @Override // com.max.hbcommon.base.f
    @dl.d
    public Context getViewContext() {
        return this;
    }

    @dl.d
    public final View h1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.VG, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f76855f;
        if (view != null) {
            return view;
        }
        f0.S("mTitleBarDivider");
        return null;
    }

    @dl.d
    public final T i1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.XG, new Class[0], BaseViewModel.class);
        if (patchProxyResultProxy.isSupported) {
            return (T) patchProxyResultProxy.result;
        }
        T t10 = this.f76858i;
        if (t10 != null) {
            return t10;
        }
        f0.S("mViewModel");
        return null;
    }

    public abstract void initViews();

    @Override // com.max.hbcommon.base.f
    public boolean isActive() {
        return this.f76860k;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public boolean isPageVisited() {
        return this.A;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ void l1(View view) {
        com.max.hbcommon.analytics.e.f(this, view);
    }

    public final boolean n1() {
        return this.f76858i != null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ boolean o3() {
        return com.max.hbcommon.analytics.e.d(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.m.aH, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("OnCreate :  " + getClass().getSimpleName());
        }
        mb.a aVarC = mb.a.c(LayoutInflater.from(this));
        this.f76856g = aVarC;
        super.setContentView(aVarC != null ? aVarC.f131476c : null);
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
        baseViewModel.n(this);
        z1(baseViewModel);
        S0();
        k1();
        bindViews();
        initViews();
        this.f76874y = new j(this, bundle != null);
        q1();
        t1();
        this.f76860k = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.gH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f76860k = false;
        super.onDestroy();
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("OnDestroy :  " + getClass().getSimpleName());
        }
        j jVar = this.f76874y;
        if (jVar != null) {
            jVar.d();
        }
        T0();
        this.f76866q = null;
        this.f76861l = null;
        this.f76862m = null;
        this.f76863n = null;
        this.f76864o = null;
        this.f76856g = null;
        this.f76857h = null;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void onPageVisitSuccess() {
        j jVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.wH, new Class[0], Void.TYPE).isSupported || (jVar = this.f76874y) == null) {
            return;
        }
        jVar.k();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.eH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("OnPause :  " + getClass().getSimpleName());
        }
        j jVar = this.f76874y;
        if (jVar != null) {
            jVar.e();
        }
        if (f0.g("1", com.max.hbcache.c.j(lb.a.f130931a1))) {
            MobclickAgent.onPause(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.dH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("OnResume :  " + getClass().getSimpleName());
        }
        j jVar = this.f76874y;
        if (jVar != null) {
            jVar.f();
        }
        if (f0.g("1", com.max.hbcache.c.j(lb.a.f130931a1))) {
            MobclickAgent.onResume(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.cH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStart();
        j jVar = this.f76874y;
        if (jVar != null) {
            jVar.g();
        }
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("OnStart :  " + getClass().getSimpleName());
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.fH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        j jVar = this.f76874y;
        if (jVar != null) {
            jVar.h();
        }
        super.onStop();
        g gVarF = g.f74531b.F();
        if (gVarF != null) {
            gVarF.a0("OnStop :  " + getClass().getSimpleName());
        }
    }

    public void q1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.m.iH, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        i1().k().k(this, new b(this));
        i1().f().k(this, new c(this));
        i1().i().k(this, new d(this));
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setClickSrc(@e PathSrcNode pathSrcNode) {
        this.f76875z = pathSrcNode;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    @k(message = "建议使用 setViewBinding(binding: ViewBinding)")
    public void setContentView(@e View view) {
        FrameLayout frameLayout = this.f76852c;
        if (frameLayout == null) {
            f0.S("mContainer");
            frameLayout = null;
        }
        frameLayout.addView(view, 0, this.f76872w);
        this.f76866q = view;
    }

    public final void setMContentView(@e View view) {
        this.f76866q = view;
    }

    public final void setMRootView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.SG, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f76851b = view;
    }

    public final void setMTitleBarDivider(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.m.WG, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f76855f = view;
    }

    @Override // com.max.hbcommon.analytics.d.f
    public void setPageVisited(boolean z10) {
        this.A = z10;
    }

    public abstract void t1();

    @Override // com.max.hbcommon.analytics.d.f
    public /* synthetic */ String v3() {
        return com.max.hbcommon.analytics.e.b(this);
    }

    public final void w1(@e mb.a aVar) {
        this.f76856g = aVar;
    }

    public final void x1(@e l3.c cVar) {
        this.f76857h = cVar;
    }

    public final void y1(@dl.d TitleBar titleBar) {
        if (PatchProxy.proxy(new Object[]{titleBar}, this, changeQuickRedirect, false, bb.c.m.UG, new Class[]{TitleBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(titleBar, "<set-?>");
        this.f76854e = titleBar;
    }

    public final void z1(@dl.d T t10) {
        if (PatchProxy.proxy(new Object[]{t10}, this, changeQuickRedirect, false, bb.c.m.YG, new Class[]{BaseViewModel.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(t10, "<set-?>");
        this.f76858i = t10;
    }
}
