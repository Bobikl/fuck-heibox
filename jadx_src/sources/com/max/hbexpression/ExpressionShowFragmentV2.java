package com.max.hbexpression;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.max.hbexpression.bean.ExpressionPackViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b0;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: ExpressionShowFragmentV2.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nExpressionShowFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionShowFragmentV2.kt\ncom/max/hbexpression/ExpressionShowFragmentV2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,353:1\n106#2,15:354\n*S KotlinDebug\n*F\n+ 1 ExpressionShowFragmentV2.kt\ncom/max/hbexpression/ExpressionShowFragmentV2\n*L\n45#1:354,15\n*E\n"})
public final class ExpressionShowFragmentV2 extends com.max.hbcommon.base.d implements q {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    public static final a f69986o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final String f69987p = "ExpressionShowFragmentV2-dbg";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f69988q = 300;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private nc.g f69989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private FragmentStateAdapter f69990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private List<ExpressionPackViewObj> f69991d = CollectionsKt__CollectionsKt.E();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final z f69992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private q.a f69993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private q.b f69994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private yh.a<Boolean> f69995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final z f69996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f69998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f69999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f70000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private ValueAnimator f70001n;

    /* JADX INFO: compiled from: ExpressionShowFragmentV2.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final ExpressionShowFragmentV2 a(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f33043q1, new Class[]{Boolean.TYPE}, ExpressionShowFragmentV2.class);
            if (patchProxyResultProxy.isSupported) {
                return (ExpressionShowFragmentV2) patchProxyResultProxy.result;
            }
            ExpressionShowFragmentV2 expressionShowFragmentV2 = new ExpressionShowFragmentV2();
            expressionShowFragmentV2.setArguments(androidx.core.os.e.b(c1.a(e.f70194a, Boolean.valueOf(z10))));
            return expressionShowFragmentV2;
        }
    }

    /* JADX INFO: compiled from: ExpressionShowFragmentV2.kt */
    public static final class b extends FragmentStateAdapter {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(ExpressionShowFragmentV2.this);
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @dl.d
        public Fragment createFragment(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f33083s1, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            ExpressionPackViewObj expressionPackViewObj = (ExpressionPackViewObj) CollectionsKt___CollectionsKt.R2(ExpressionShowFragmentV2.this.f69991d, i10);
            return ExpressionPackGridFragmentV2.f69958j.a(expressionPackViewObj != null ? expressionPackViewObj.getPackGroupCode() : null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33063r1, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ExpressionShowFragmentV2.this.f69991d.size();
        }
    }

    /* JADX INFO: compiled from: ExpressionShowFragmentV2.kt */
    public static final class c implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TabLayout f70004b;

        c(TabLayout tabLayout) {
            this.f70004b = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            int iF;
            View viewG;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.f33103t1, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ExpressionShowFragmentV2.this.f69997j) {
                String str = ExpressionShowFragmentV2.this.f69998k;
                if (str != null && !kotlin.text.u.V1(str)) {
                    z10 = false;
                }
                iF = z10 ? androidx.core.content.d.f(this.f70004b.getContext(), R.color.divider_secondary_2_dark_not_change_color) : com.max.hbutils.utils.a.e(ExpressionShowFragmentV2.this.f69998k);
            } else {
                iF = androidx.core.content.d.f(this.f70004b.getContext(), R.color.divider_secondary_2_color);
            }
            if (hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            viewG.setBackgroundColor(iF);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
            int iF;
            View viewG;
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, bb.c.g.f33123u1, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ExpressionShowFragmentV2.this.f69997j) {
                String str = ExpressionShowFragmentV2.this.f69998k;
                if (str != null && !kotlin.text.u.V1(str)) {
                    z10 = false;
                }
                iF = z10 ? androidx.core.content.d.f(this.f70004b.getContext(), R.color.background_layer_2_dark_not_change_color) : androidx.core.content.d.f(this.f70004b.getContext(), R.color.transparent);
            } else {
                iF = androidx.core.content.d.f(this.f70004b.getContext(), R.color.background_layer_2_color);
            }
            if (hVar == null || (viewG = hVar.g()) == null) {
                return;
            }
            viewG.setBackgroundColor(iF);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    /* JADX INFO: compiled from: ExpressionShowFragmentV2.kt */
    public static final /* synthetic */ class d implements j0, a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ yh.l f70005a;

        d(yh.l function) {
            f0.p(function, "function");
            this.f70005a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.B1, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f70005a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final kotlin.u<?> b() {
            return this.f70005a;
        }

        public final boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.C1, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if ((obj instanceof j0) && (obj instanceof a0)) {
                return f0.g(b(), ((a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.D1, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b().hashCode();
        }
    }

    public ExpressionShowFragmentV2() {
        final yh.a<Fragment> aVar = new yh.a<Fragment>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Fragment a() {
                return this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Fragment invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.E1, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB = b0.b(LazyThreadSafetyMode.NONE, new yh.a<androidx.lifecycle.c1>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final androidx.lifecycle.c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.F1, new Class[0], androidx.lifecycle.c1.class);
                return patchProxyResultProxy.isSupported ? (androidx.lifecycle.c1) patchProxyResultProxy.result : (androidx.lifecycle.c1) aVar.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ androidx.lifecycle.c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.G1, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar2 = null;
        this.f69992e = FragmentViewModelLazyKt.h(this, n0.d(pc.a.class), new yh.a<b1>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.H1, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.I1, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$special$$inlined$viewModels$default$4
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.K1, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar3;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.J1, new Class[0], u2.a.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u2.a) patchProxyResultProxy.result;
                }
                yh.a aVar4 = aVar2;
                if (aVar4 != null && (aVar3 = (u2.a) aVar4.invoke()) != null) {
                    return aVar3;
                }
                androidx.lifecycle.c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                return rVar != null ? rVar.getDefaultViewModelCreationExtras() : u2.a.C1270a.f140743b;
            }
        }, new yh.a<y0.b>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$special$$inlined$viewModels$default$5
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final y0.b invoke() {
                y0.b defaultViewModelProviderFactory;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.L1, new Class[0], y0.b.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0.b) patchProxyResultProxy.result;
                }
                androidx.lifecycle.c1 c1VarP = FragmentViewModelLazyKt.p(zVarB);
                r rVar = c1VarP instanceof r ? (r) c1VarP : null;
                if (rVar != null && (defaultViewModelProviderFactory = rVar.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                y0.b defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                f0.o(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.y0$b, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0.b invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.M1, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
        this.f69996i = b0.c(new yh.a<Float>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$targetKeyboardHeight$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Float a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.N1, new Class[0], Float.class);
                return patchProxyResultProxy.isSupported ? (Float) patchProxyResultProxy.result : Float.valueOf(ViewUtils.J(this.f70016b.getContext()) * 0.45f);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Float invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.O1, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f70000m = true;
    }

    public static final /* synthetic */ void N3(ExpressionShowFragmentV2 expressionShowFragmentV2) {
        if (PatchProxy.proxy(new Object[]{expressionShowFragmentV2}, null, changeQuickRedirect, true, bb.c.g.f33023p1, new Class[]{ExpressionShowFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        expressionShowFragmentV2.X3();
    }

    private final ValueAnimator V3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32903j1, new Class[0], ValueAnimator.class);
        if (patchProxyResultProxy.isSupported) {
            return (ValueAnimator) patchProxyResultProxy.result;
        }
        nc.g gVar = this.f69989b;
        final WeakReference weakReference = new WeakReference(gVar != null ? gVar.b() : null);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, (int) Y3());
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setInterpolator(new AccelerateInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.max.hbexpression.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpressionShowFragmentV2.W3(weakReference, valueAnimator);
            }
        });
        f0.o(valueAnimatorOfInt, "apply(...)");
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(WeakReference rootViewRef, ValueAnimator animation) {
        if (PatchProxy.proxy(new Object[]{rootViewRef, animation}, null, changeQuickRedirect, true, bb.c.g.f33003o1, new Class[]{WeakReference.class, ValueAnimator.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootViewRef, "$rootViewRef");
        f0.p(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = null;
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        LinearLayout linearLayout = (LinearLayout) rootViewRef.get();
        if (num == null || linearLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
        if (layoutParams2 != null) {
            f0.m(layoutParams2);
            layoutParams2.height = num.intValue();
            layoutParams = layoutParams2;
        }
        linearLayout.setLayoutParams(layoutParams);
    }

    private final void X3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32804e1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        yh.a<Boolean> aVar = this.f69995h;
        boolean zBooleanValue = aVar != null ? aVar.invoke().booleanValue() : true;
        if (isAdded()) {
            Z3().p(zBooleanValue);
        }
    }

    private final float Y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.W0, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : ((Number) this.f69996i.getValue()).floatValue();
    }

    private final pc.a Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.V0, new Class[0], pc.a.class);
        return patchProxyResultProxy.isSupported ? (pc.a) patchProxyResultProxy.result : (pc.a) this.f69992e.getValue();
    }

    private final void a4() {
        nc.g gVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32724a1, new Class[0], Void.TYPE).isSupported || (gVar = this.f69989b) == null) {
            return;
        }
        b bVar = new b();
        this.f69990c = bVar;
        gVar.f132065c.setAdapter(bVar);
        gVar.f132065c.setSaveEnabled(false);
        TabLayout tabLayout = gVar.f132064b;
        tabLayout.setSelectedTabIndicator(new ColorDrawable(0));
        tabLayout.h(new c(tabLayout));
        new com.google.android.material.tabs.d(gVar.f132064b, gVar.f132065c, true, true, new com.google.android.material.tabs.d.b() { // from class: com.max.hbexpression.o
            @Override // com.google.android.material.tabs.d.b
            public final void a(TabLayout.h hVar, int i10) {
                ExpressionShowFragmentV2.b4(this.f70227a, hVar, i10);
            }
        }).a();
        if (this.f70000m) {
            q1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(ExpressionShowFragmentV2 this$0, TabLayout.h tab, int i10) {
        if (PatchProxy.proxy(new Object[]{this$0, tab, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.f32983n1, new Class[]{ExpressionShowFragmentV2.class, TabLayout.h.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        f0.p(tab, "tab");
        Context contextRequireContext = this$0.requireContext();
        f0.o(contextRequireContext, "requireContext(...)");
        View viewE4 = this$0.e4(contextRequireContext, i10);
        if (viewE4 != null) {
            tab.v(viewE4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    private final void c4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32784d1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        pc.a.v(Z3(), false, 1, null);
        androidx.activity.result.b parentFragment = getParentFragment();
        LayoutInflater.Factory activity = getActivity();
        if (parentFragment instanceof q.a) {
            this.f69993f = (q.a) parentFragment;
        } else if (activity instanceof q.a) {
            this.f69993f = (q.a) activity;
        } else if (activity instanceof com.max.hbminiprogram.h) {
            com.max.hbminiprogram.h hVar = (com.max.hbminiprogram.h) activity;
            if (hVar.T() instanceof q.a) {
                androidx.activity.result.b bVarT = hVar.T();
                this.f69993f = bVarT instanceof q.a ? (q.a) bVarT : null;
            } else {
                com.max.heybox.hblog.g.f74531b.v("[ExpressionShowFragmentV2-dbg][initViewData] ExpressionClickListener设置异常");
                x.p("ExpressionClickListener设置异常");
            }
        } else {
            com.max.heybox.hblog.g.f74531b.v("[ExpressionShowFragmentV2-dbg][initViewData] ExpressionClickListener设置异常");
            x.p("ExpressionClickListener设置异常");
        }
        if (parentFragment instanceof q.b) {
            this.f69994g = (q.b) parentFragment;
        } else if (activity instanceof q.b) {
            this.f69994g = (q.b) activity;
        } else if (activity instanceof com.max.hbminiprogram.h) {
            com.max.hbminiprogram.h hVar2 = (com.max.hbminiprogram.h) activity;
            if (hVar2.T() instanceof q.b) {
                androidx.activity.result.b bVarT2 = hVar2.T();
                this.f69994g = bVarT2 instanceof q.b ? (q.b) bVarT2 : null;
            } else {
                com.max.heybox.hblog.g.f74531b.v("[ExpressionShowFragmentV2-dbg][initViewData] ExpressionDeleteClickListener设置异常");
                x.p("ExpressionDeleteClickListener设置异常");
            }
        } else {
            com.max.heybox.hblog.g.f74531b.v("[ExpressionShowFragmentV2-dbg][initViewData] ExpressionDeleteClickListener设置异常");
            x.p("ExpressionDeleteClickListener设置异常");
        }
        Z3().t();
        X3();
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32764c1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Z3().k().k(getViewLifecycleOwner(), new d(new yh.l<List<? extends ExpressionPackViewObj>, b2>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$initViewModel$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.e List<ExpressionPackViewObj> list) {
                if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f33143v1, new Class[]{List.class}, Void.TYPE).isSupported || list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f70006b.f69991d);
                this.f70006b.f69991d = list;
                FragmentStateAdapter fragmentStateAdapter = this.f70006b.f69990c;
                if (fragmentStateAdapter != null) {
                    com.max.hbcommon.base.adapter.d.a(fragmentStateAdapter, arrayList, list, lc.b.f131303a);
                }
                Log.d("ExpressionShowFragmentV2-dbg", "[initViewModel][expressionPackListLiveData]\nexpressionPackList: " + list);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(List<? extends ExpressionPackViewObj> list) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f33163w1, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(list);
                return b2.f124493a;
            }
        }));
        Z3().i().k(getViewLifecycleOwner(), new d(new yh.l<pc.a.b, b2>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$initViewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.e pc.a.b bVar) {
                if (PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.g.f33183x1, new Class[]{pc.a.b.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (bVar == null) {
                    Log.e("ExpressionShowFragmentV2-dbg", "[initViewModel][expressionClickEventLiveData] invalid null clickEvent");
                    return;
                }
                ExpressionShowFragmentV2 expressionShowFragmentV2 = this.f70007b;
                q.a aVar = expressionShowFragmentV2.f69993f;
                if (aVar != null) {
                    aVar.o0(bVar.f());
                }
                ExpressionShowFragmentV2.N3(expressionShowFragmentV2);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(pc.a.b bVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bVar}, this, changeQuickRedirect, false, bb.c.g.f33203y1, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bVar);
                return b2.f124493a;
            }
        }));
        Z3().h().k(getViewLifecycleOwner(), new d(new yh.l<Long, b2>() { // from class: com.max.hbexpression.ExpressionShowFragmentV2$initViewModel$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Long l10) {
                if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.g.f33223z1, new Class[]{Long.class}, Void.TYPE).isSupported || l10 == null) {
                    return;
                }
                q.b bVar = this.f70008b.f69994g;
                if (bVar != null) {
                    bVar.expressionDeleteClick(null);
                }
                ExpressionShowFragmentV2.N3(this.f70008b);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.g.A1, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(l10);
                return b2.f124493a;
            }
        }));
        if (this.f69998k != null || this.f69997j) {
            Z3().o(this.f69997j, this.f69998k);
        }
    }

    private final View e4(Context context, int i10) {
        ExpressionPackViewObj expressionPackViewObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.g.f32744b1, new Class[]{Context.class, Integer.TYPE}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        List<ExpressionPackViewObj> listF = Z3().k().f();
        if (listF == null || (expressionPackViewObj = (ExpressionPackViewObj) CollectionsKt___CollectionsKt.R2(listF, i10)) == null) {
            Log.e(f69987p, "[makeCustomTabView] expressionPackListLiveData no data for: " + i10);
            return null;
        }
        String packGroupCode = expressionPackViewObj.getPackGroupCode();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(context, 22.0f), ViewUtils.f(context, 22.0f));
        layoutParams.gravity = 17;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams);
        ExpressionAssetManager expressionAssetManager = ExpressionAssetManager.f69919a;
        if (expressionAssetManager.u(packGroupCode, packGroupCode)) {
            Glide.F(context).b(expressionAssetManager.i(packGroupCode, packGroupCode)).C1(imageView);
        } else {
            com.max.hbimage.b.K(expressionPackViewObj.getPackGroupImg(), imageView);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(context, 42.0f), ViewUtils.f(context, 38.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams2);
        frameLayout.addView(imageView);
        return frameLayout;
    }

    @Override // com.max.hbexpression.q
    public void C() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32864h1, new Class[0], Void.TYPE).isSupported || this.f70000m) {
            return;
        }
        this.f70000m = true;
        if (this.f70001n == null) {
            this.f70001n = V3();
        }
        ValueAnimator valueAnimator = this.f70001n;
        if (valueAnimator != null) {
            valueAnimator.reverse();
        }
    }

    @Override // com.max.hbexpression.q
    public void L1(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.f32923k1, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69997j = z10;
        if (isAdded()) {
            Z3().o(z10, this.f69998k);
        }
    }

    @Override // com.max.hbexpression.q
    public void N1(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.f32943l1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69998k = str;
        if (isAdded()) {
            Z3().o(this.f69997j, this.f69998k);
        }
    }

    @Override // com.max.hbexpression.q
    @dl.d
    public Fragment P() {
        return this;
    }

    @Override // com.max.hbexpression.q
    public void b2(@dl.d yh.a<Boolean> onCheckIfHasContent) {
        if (PatchProxy.proxy(new Object[]{onCheckIfHasContent}, this, changeQuickRedirect, false, bb.c.g.f32963m1, new Class[]{yh.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(onCheckIfHasContent, "onCheckIfHasContent");
        this.f69995h = onCheckIfHasContent;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.Y0, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater == null) {
            com.max.heybox.hblog.g.f74531b.v("[ExpressionShowFragmentV2-dbg][installViews] inflater is null");
            return;
        }
        FrameLayout frameLayout = ((com.max.hbcommon.base.d) this).mContainer;
        if (frameLayout == null) {
            com.max.heybox.hblog.g.f74531b.v("[ExpressionShowFragmentV2-dbg][installViews] container is null");
            return;
        }
        nc.g gVarD = nc.g.d(layoutInflater, frameLayout, false);
        this.f69989b = gVarD;
        setContentView(gVarD);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.g.X0, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f69999l = arguments != null ? arguments.getBoolean(e.f70194a) : false;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.g.Z0, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        a4();
        d4();
        c4();
    }

    @Override // com.max.hbexpression.q
    public void q1() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32884i1, new Class[0], Void.TYPE).isSupported && this.f70000m) {
            this.f70000m = false;
            ValueAnimator valueAnimator = this.f70001n;
            if (valueAnimator == null) {
                this.f70001n = V3();
            } else if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.f70001n;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
            X3();
        }
    }

    @Override // com.max.hbexpression.q
    public void q2() {
        ViewPager2 viewPager2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32844g1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        nc.g gVar = this.f69989b;
        if (gVar != null && (viewPager2 = gVar.f132065c) != null) {
            viewPager2.setCurrentItem(0, false);
        }
        if (isAdded()) {
            pc.a.v(Z3(), false, 1, null);
        }
    }

    @Override // com.max.hbexpression.q
    public void v2() {
        ViewPager2 viewPager2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32824f1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        nc.g gVar = this.f69989b;
        if (gVar != null && (viewPager2 = gVar.f132065c) != null) {
            viewPager2.setCurrentItem(0, false);
        }
        if (isAdded()) {
            Z3().u(true);
        }
    }
}
