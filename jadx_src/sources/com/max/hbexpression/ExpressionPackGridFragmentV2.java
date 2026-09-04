package com.max.hbexpression;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.r;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;
import com.max.hbcommon.component.bubble.BubbleTipPopup;
import com.max.hbexpression.bean.ExpressionObj;
import com.max.hbexpression.bean.ExpressionPackViewObj;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.b0;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.z;

/* JADX INFO: compiled from: ExpressionPackGridFragmentV2.kt */
/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131247s0)
@t0({"SMAP\nExpressionPackGridFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressionPackGridFragmentV2.kt\ncom/max/hbexpression/ExpressionPackGridFragmentV2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,399:1\n106#2,15:400\n254#3,2:415\n254#3,2:417\n254#3,2:419\n254#3,2:421\n254#3,2:423\n254#3,2:425\n254#3,2:427\n254#3,2:429\n*S KotlinDebug\n*F\n+ 1 ExpressionPackGridFragmentV2.kt\ncom/max/hbexpression/ExpressionPackGridFragmentV2\n*L\n41#1:400,15\n363#1:415,2\n364#1:417,2\n365#1:419,2\n366#1:421,2\n368#1:423,2\n369#1:425,2\n370#1:427,2\n371#1:429,2\n*E\n"})
public final class ExpressionPackGridFragmentV2 extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    public static final a f69958j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final String f69959k = "ExpressionPackGridFragmentV2-dbg";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f69960l = 7;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f69961m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final String f69962n = "arg_expression_pack_code";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private nc.e f69963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f69964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f69965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f69966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private lc.f f69967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private lc.f f69968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private lc.f f69969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private BubbleTipPopup f69970i;

    /* JADX INFO: compiled from: ExpressionPackGridFragmentV2.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final ExpressionPackGridFragmentV2 a(@dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.g.R, new Class[]{String.class}, ExpressionPackGridFragmentV2.class);
            if (patchProxyResultProxy.isSupported) {
                return (ExpressionPackGridFragmentV2) patchProxyResultProxy.result;
            }
            ExpressionPackGridFragmentV2 expressionPackGridFragmentV2 = new ExpressionPackGridFragmentV2();
            expressionPackGridFragmentV2.setArguments(androidx.core.os.e.b(c1.a(ExpressionPackGridFragmentV2.f69962n, str)));
            return expressionPackGridFragmentV2;
        }
    }

    /* JADX INFO: compiled from: ExpressionPackGridFragmentV2.kt */
    public static final class b extends ViewOutlineProvider {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@dl.e View view, @dl.e Outline outline) {
            if (PatchProxy.proxy(new Object[]{view, outline}, this, changeQuickRedirect, false, bb.c.g.f33002o0, new Class[]{View.class, Outline.class}, Void.TYPE).isSupported || view == null) {
                return;
            }
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(view.getWidth() / 2, view.getHeight());
            path.lineTo(view.getWidth(), 0.0f);
            path.lineTo(0.0f, 0.0f);
            if (Build.VERSION.SDK_INT >= 30) {
                if (outline != null) {
                    outline.setPath(path);
                }
            } else if (outline != null) {
                outline.setConvexPath(path);
            }
        }
    }

    /* JADX INFO: compiled from: ExpressionPackGridFragmentV2.kt */
    public static final /* synthetic */ class c implements j0, a0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ yh.l f69971a;

        c(yh.l function) {
            f0.p(function, "function");
            this.f69971a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f33022p0, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f69971a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final kotlin.u<?> b() {
            return this.f69971a;
        }

        public final boolean equals(@dl.e Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.g.f33042q0, new Class[]{Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if ((obj instanceof j0) && (obj instanceof a0)) {
                return f0.g(b(), ((a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33062r0, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : b().hashCode();
        }
    }

    public ExpressionPackGridFragmentV2() {
        final yh.a<androidx.lifecycle.c1> aVar = new yh.a<androidx.lifecycle.c1>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$viewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final androidx.lifecycle.c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.A0, new Class[0], androidx.lifecycle.c1.class);
                if (patchProxyResultProxy.isSupported) {
                    return (androidx.lifecycle.c1) patchProxyResultProxy.result;
                }
                Fragment fragmentRequireParentFragment = this.f69985b.requireParentFragment();
                f0.o(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ androidx.lifecycle.c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.B0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        };
        final z zVarB = b0.b(LazyThreadSafetyMode.NONE, new yh.a<androidx.lifecycle.c1>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$special$$inlined$viewModels$default$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final androidx.lifecycle.c1 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33082s0, new Class[0], androidx.lifecycle.c1.class);
                return patchProxyResultProxy.isSupported ? (androidx.lifecycle.c1) patchProxyResultProxy.result : (androidx.lifecycle.c1) aVar.invoke();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.c1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ androidx.lifecycle.c1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33102t0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        final yh.a aVar2 = null;
        this.f69964c = FragmentViewModelLazyKt.h(this, n0.d(pc.a.class), new yh.a<b1>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$special$$inlined$viewModels$default$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @dl.d
            public final b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33122u0, new Class[0], b1.class);
                return patchProxyResultProxy.isSupported ? (b1) patchProxyResultProxy.result : FragmentViewModelLazyKt.p(zVarB).getViewModelStore();
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.b1, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b1 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33142v0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        }, new yh.a<u2.a>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$special$$inlined$viewModels$default$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, u2.a] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u2.a invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33182x0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }

            @Override // yh.a
            @dl.d
            public final u2.a invoke() {
                u2.a aVar3;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33162w0, new Class[0], u2.a.class);
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
        }, new yh.a<y0.b>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$special$$inlined$viewModels$default$4
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33202y0, new Class[0], y0.b.class);
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
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33222z0, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public static final /* synthetic */ pc.a U3(ExpressionPackGridFragmentV2 expressionPackGridFragmentV2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionPackGridFragmentV2}, null, changeQuickRedirect, true, bb.c.g.O, new Class[]{ExpressionPackGridFragmentV2.class}, pc.a.class);
        return patchProxyResultProxy.isSupported ? (pc.a) patchProxyResultProxy.result : expressionPackGridFragmentV2.Y3();
    }

    public static final /* synthetic */ void V3(ExpressionPackGridFragmentV2 expressionPackGridFragmentV2) {
        if (PatchProxy.proxy(new Object[]{expressionPackGridFragmentV2}, null, changeQuickRedirect, true, bb.c.g.Q, new Class[]{ExpressionPackGridFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        expressionPackGridFragmentV2.l4();
    }

    public static final /* synthetic */ boolean W3(ExpressionPackGridFragmentV2 expressionPackGridFragmentV2, ExpressionObj expressionObj, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionPackGridFragmentV2, expressionObj, view}, null, changeQuickRedirect, true, bb.c.g.P, new Class[]{ExpressionPackGridFragmentV2.class, ExpressionObj.class, View.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : expressionPackGridFragmentV2.m4(expressionObj, view);
    }

    public static final /* synthetic */ void X3(ExpressionPackGridFragmentV2 expressionPackGridFragmentV2, ExpressionPackViewObj expressionPackViewObj) {
        if (PatchProxy.proxy(new Object[]{expressionPackGridFragmentV2, expressionPackViewObj}, null, changeQuickRedirect, true, bb.c.g.N, new Class[]{ExpressionPackGridFragmentV2.class, ExpressionPackViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        expressionPackGridFragmentV2.o4(expressionPackViewObj);
    }

    private final pc.a Y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33061r, new Class[0], pc.a.class);
        return patchProxyResultProxy.isSupported ? (pc.a) patchProxyResultProxy.result : (pc.a) this.f69964c.getValue();
    }

    private final void Z3(final nc.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.g.f33201y, new Class[]{nc.e.class}, Void.TYPE).isSupported) {
            return;
        }
        final RecyclerView recyclerView = eVar.f132055g;
        List listE = CollectionsKt__CollectionsKt.E();
        Context context = recyclerView.getContext();
        f0.o(context, "getContext(...)");
        lc.f fVar = new lc.f(listE, context, true, new yh.l<ExpressionObj, b2>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$initBigExpression$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d ExpressionObj it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.g.S, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                ExpressionPackGridFragmentV2.U3(this.f69972b).s(new pc.a.b(2, it));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ExpressionObj expressionObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, bb.c.g.T, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(expressionObj);
                return b2.f124493a;
            }
        }, null, null, 48, null);
        this.f69969h = fVar;
        recyclerView.setAdapter(fVar);
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
        recyclerView.setOverScrollMode(2);
        recyclerView.post(new Runnable() { // from class: com.max.hbexpression.k
            @Override // java.lang.Runnable
            public final void run() {
                ExpressionPackGridFragmentV2.a4(eVar, recyclerView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(nc.e viewBinding, RecyclerView this_with) {
        if (PatchProxy.proxy(new Object[]{viewBinding, this_with}, null, changeQuickRedirect, true, bb.c.g.M, new Class[]{nc.e.class, RecyclerView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewBinding, "$viewBinding");
        f0.p(this_with, "$this_with");
        this_with.addItemDecoration(new fc.a(4, viewBinding.f132055g.getMeasuredWidth(), ViewUtils.f(this_with.getContext(), 60.0f), ViewUtils.f(this_with.getContext(), 16.0f), false, 16, null));
    }

    private final void b4(final nc.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.g.f33161w, new Class[]{nc.e.class}, Void.TYPE).isSupported) {
            return;
        }
        final RecyclerView recyclerView = eVar.f132056h;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 7));
        recyclerView.setOverScrollMode(2);
        List listE = CollectionsKt__CollectionsKt.E();
        Context context = recyclerView.getContext();
        f0.o(context, "getContext(...)");
        this.f69967f = new lc.f(listE, context, false, new yh.l<ExpressionObj, b2>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$initRecentUsedExpression$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d ExpressionObj it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.g.U, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                RecentEmojiManger.f70167a.g(it);
                ExpressionPackGridFragmentV2.U3(this.f69973b).s(new pc.a.b(0, it));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ExpressionObj expressionObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, bb.c.g.V, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(expressionObj);
                return b2.f124493a;
            }
        }, new ExpressionPackGridFragmentV2$initRecentUsedExpression$1$2(this), new ExpressionPackGridFragmentV2$initRecentUsedExpression$1$3(this));
        recyclerView.post(new Runnable() { // from class: com.max.hbexpression.i
            @Override // java.lang.Runnable
            public final void run() {
                ExpressionPackGridFragmentV2.c4(eVar, recyclerView, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(final nc.e viewBinding, final RecyclerView this_with, ExpressionPackGridFragmentV2 this$0) {
        if (PatchProxy.proxy(new Object[]{viewBinding, this_with, this$0}, null, changeQuickRedirect, true, bb.c.g.J, new Class[]{nc.e.class, RecyclerView.class, ExpressionPackGridFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewBinding, "$viewBinding");
        f0.p(this_with, "$this_with");
        f0.p(this$0, "this$0");
        int measuredWidth = ((viewBinding.f132056h.getMeasuredWidth() - (ViewUtils.f(this_with.getContext(), 30.0f) * 7)) - (ViewUtils.f(this_with.getContext(), 22.0f) * 2)) / 12;
        lc.f fVar = this$0.f69967f;
        if (fVar != null) {
            fVar.x(measuredWidth);
        }
        this_with.setAdapter(this$0.f69967f);
        lc.f fVar2 = this$0.f69967f;
        final int iQ = fVar2 != null ? fVar2.q() : 0;
        ViewGroup.LayoutParams layoutParams = this_with.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(ViewUtils.f(this_with.getContext(), 22.0f) - iQ);
            marginLayoutParams.setMarginEnd(ViewUtils.f(this_with.getContext(), 22.0f) - iQ);
            layoutParams2 = marginLayoutParams;
        }
        this_with.setLayoutParams(layoutParams2);
        this_with.post(new Runnable() { // from class: com.max.hbexpression.g
            @Override // java.lang.Runnable
            public final void run() {
                ExpressionPackGridFragmentV2.d4(viewBinding, this_with, iQ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(nc.e viewBinding, RecyclerView this_with, int i10) {
        if (PatchProxy.proxy(new Object[]{viewBinding, this_with, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.I, new Class[]{nc.e.class, RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewBinding, "$viewBinding");
        f0.p(this_with, "$this_with");
        this_with.addItemDecoration(new fc.a(7, viewBinding.f132056h.getMeasuredWidth(), ViewUtils.f(this_with.getContext(), 30.0f) + (i10 * 2), 0, false, 16, null));
    }

    private final void e4(final nc.e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.g.f33181x, new Class[]{nc.e.class}, Void.TYPE).isSupported) {
            return;
        }
        final RecyclerView recyclerView = eVar.f132057i;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 7));
        recyclerView.setOverScrollMode(2);
        List listE = CollectionsKt__CollectionsKt.E();
        Context context = recyclerView.getContext();
        f0.o(context, "getContext(...)");
        this.f69968g = new lc.f(listE, context, false, new yh.l<ExpressionObj, b2>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$initSmallExpression$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.d ExpressionObj it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.g.f32723a0, new Class[]{ExpressionObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                RecentEmojiManger.f70167a.g(it);
                ExpressionPackGridFragmentV2.U3(this.f69974b).s(new pc.a.b(1, it));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(ExpressionObj expressionObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj}, this, changeQuickRedirect, false, bb.c.g.f32743b0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(expressionObj);
                return b2.f124493a;
            }
        }, new ExpressionPackGridFragmentV2$initSmallExpression$1$2(this), new ExpressionPackGridFragmentV2$initSmallExpression$1$3(this));
        recyclerView.post(new Runnable() { // from class: com.max.hbexpression.l
            @Override // java.lang.Runnable
            public final void run() {
                ExpressionPackGridFragmentV2.f4(eVar, recyclerView, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(final nc.e viewBinding, final RecyclerView this_with, ExpressionPackGridFragmentV2 this$0) {
        if (PatchProxy.proxy(new Object[]{viewBinding, this_with, this$0}, null, changeQuickRedirect, true, bb.c.g.L, new Class[]{nc.e.class, RecyclerView.class, ExpressionPackGridFragmentV2.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewBinding, "$viewBinding");
        f0.p(this_with, "$this_with");
        f0.p(this$0, "this$0");
        int measuredWidth = ((viewBinding.f132057i.getMeasuredWidth() - (ViewUtils.f(this_with.getContext(), 30.0f) * 7)) - (ViewUtils.f(this_with.getContext(), 22.0f) * 2)) / 12;
        lc.f fVar = this$0.f69968g;
        if (fVar != null) {
            fVar.x(measuredWidth);
        }
        this_with.setAdapter(this$0.f69968g);
        lc.f fVar2 = this$0.f69968g;
        final int iQ = fVar2 != null ? fVar2.q() : 0;
        ViewGroup.LayoutParams layoutParams = this_with.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart(ViewUtils.f(this_with.getContext(), 22.0f) - iQ);
            marginLayoutParams.setMarginEnd(ViewUtils.f(this_with.getContext(), 22.0f) - iQ);
            layoutParams2 = marginLayoutParams;
        }
        this_with.setLayoutParams(layoutParams2);
        this_with.post(new Runnable() { // from class: com.max.hbexpression.j
            @Override // java.lang.Runnable
            public final void run() {
                ExpressionPackGridFragmentV2.g4(viewBinding, this_with, iQ);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(nc.e viewBinding, RecyclerView this_with, int i10) {
        if (PatchProxy.proxy(new Object[]{viewBinding, this_with, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.g.K, new Class[]{nc.e.class, RecyclerView.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewBinding, "$viewBinding");
        f0.p(this_with, "$this_with");
        this_with.addItemDecoration(new fc.a(7, viewBinding.f132057i.getMeasuredWidth(), ViewUtils.f(this_with.getContext(), 30.0f) + (i10 * 2), 0, false, 16, null));
    }

    private final void h4() {
        nc.e eVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f33141v, new Class[0], Void.TYPE).isSupported || (eVar = this.f69963b) == null) {
            return;
        }
        b4(eVar);
        e4(eVar);
        Z3(eVar);
        FrameLayout frameLayout = eVar.f132051c;
        frameLayout.setBackground(com.max.hbutils.utils.q.o(frameLayout.getContext(), R.color.background_layer_2_color, 5.0f));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.max.hbexpression.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpressionPackGridFragmentV2.i4(this.f70200b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i4(ExpressionPackGridFragmentV2 this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.g.H, new Class[]{ExpressionPackGridFragmentV2.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        this$0.Y3().r();
    }

    private final void j4() {
        List<ExpressionPackViewObj> listF;
        Object next;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.C, new Class[0], Void.TYPE).isSupported || (listF = Y3().k().f()) == null) {
            return;
        }
        Iterator<T> it = listF.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!f0.g(((ExpressionPackViewObj) next).getPackGroupCode(), this.f69965d));
        ExpressionPackViewObj expressionPackViewObj = (ExpressionPackViewObj) next;
        if (expressionPackViewObj != null) {
            o4(expressionPackViewObj);
            Log.d(f69959k, "[initViewData] data: " + expressionPackViewObj);
        }
    }

    private final void k4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.B, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Y3().n().k(getViewLifecycleOwner(), new c(new yh.l<List<? extends ExpressionObj>, b2>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$initViewModel$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.e List<? extends ExpressionObj> list) {
                lc.f fVar;
                if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f32843g0, new Class[]{List.class}, Void.TYPE).isSupported || list == null || (fVar = this.f69975b.f69967f) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fVar.p());
                fVar.w(list);
                com.max.hbcommon.base.adapter.d.a(fVar, arrayList, list, lc.a.f131302a);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(List<? extends ExpressionObj> list) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f32863h0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(list);
                return b2.f124493a;
            }
        }));
        Y3().k().k(getViewLifecycleOwner(), new c(new yh.l<List<? extends ExpressionPackViewObj>, b2>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$initViewModel$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.e List<ExpressionPackViewObj> list) {
                if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f32883i0, new Class[]{List.class}, Void.TYPE).isSupported) {
                    return;
                }
                ExpressionPackViewObj expressionPackViewObj = null;
                Object obj = null;
                if (list != null) {
                    ExpressionPackGridFragmentV2 expressionPackGridFragmentV2 = this.f69976b;
                    for (Object obj2 : list) {
                        if (f0.g(((ExpressionPackViewObj) obj2).getPackGroupCode(), expressionPackGridFragmentV2.f69965d)) {
                            obj = obj2;
                            break;
                        }
                    }
                    expressionPackViewObj = (ExpressionPackViewObj) obj;
                }
                if (expressionPackViewObj != null) {
                    ExpressionPackGridFragmentV2.X3(this.f69976b, expressionPackViewObj);
                    return;
                }
                Log.e("ExpressionPackGridFragmentV2-dbg", "[initViewModel][expressionPackListLiveData] no expression pack found for " + this.f69976b.f69965d);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(List<? extends ExpressionPackViewObj> list) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.g.f32902j0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(list);
                return b2.f124493a;
            }
        }));
        Y3().g().k(getViewLifecycleOwner(), new c(new yh.l<Pair<? extends Boolean, ? extends String>, b2>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$initViewModel$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Pair<Boolean, String> pair) {
                int iF;
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, bb.c.g.f32922k0, new Class[]{Pair.class}, Void.TYPE).isSupported) {
                    return;
                }
                boolean zBooleanValue = pair.a().booleanValue();
                String strB = pair.b();
                nc.e eVar = this.f69977b.f69963b;
                if (eVar == null) {
                    return;
                }
                FrameLayout frameLayoutB = eVar.b();
                if (zBooleanValue) {
                    if (strB != null && !kotlin.text.u.V1(strB)) {
                        z10 = false;
                    }
                    iF = z10 ? androidx.core.content.d.f(frameLayoutB.getContext(), R.color.divider_secondary_2_dark_not_change_color) : com.max.hbutils.utils.a.e(strB);
                } else {
                    iF = androidx.core.content.d.f(frameLayoutB.getContext(), R.color.divider_secondary_2_color);
                }
                frameLayoutB.setBackgroundColor(iF);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Pair<? extends Boolean, ? extends String> pair) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pair}, this, changeQuickRedirect, false, bb.c.g.f32942l0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(pair);
                return b2.f124493a;
            }
        }));
        Y3().m().k(getViewLifecycleOwner(), new c(new yh.l<Boolean, b2>() { // from class: com.max.hbexpression.ExpressionPackGridFragmentV2$initViewModel$4
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(@dl.e Boolean bool) {
                ImageView imageView;
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.g.f32962m0, new Class[]{Boolean.class}, Void.TYPE).isSupported || bool == null) {
                    return;
                }
                bool.booleanValue();
                nc.e eVar = this.f69978b.f69963b;
                if (eVar == null || (imageView = eVar.f132052d) == null) {
                    return;
                }
                imageView.setColorFilter(bool.booleanValue() ? androidx.core.content.d.f(imageView.getContext(), R.color.text_secondary_1_color) : androidx.core.content.d.f(imageView.getContext(), R.color.text_secondary_2_color));
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.g.f32982n0, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool);
                return b2.f124493a;
            }
        }));
    }

    private final void l4() {
        BubbleTipPopup bubbleTipPopup;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.A, new Class[0], Void.TYPE).isSupported || (bubbleTipPopup = this.f69970i) == null) {
            return;
        }
        bubbleTipPopup.G();
    }

    private final boolean m4(ExpressionObj expressionObj, View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{expressionObj, view}, this, changeQuickRedirect, false, bb.c.g.f33221z, new Class[]{ExpressionObj.class, View.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Context context = getContext();
        if (context == null) {
            return false;
        }
        nc.h hVarC = nc.h.c(getLayoutInflater());
        f.i(expressionObj, hVarC.f132068c);
        hVarC.f132067b.setBackground(new com.max.hbcommon.component.bubble.a(androidx.core.content.d.f(context, R.color.background_layer_2_color), 3));
        hVarC.f132067b.setOutlineProvider(new b());
        f0.o(hVarC, "apply(...)");
        float fMeasureText = 13.0f;
        int iF = ViewUtils.f(context, 52.0f);
        TextPaint paint = hVarC.f132069d.getPaint();
        if (paint != null) {
            float f10 = iF;
            if (!(f10 < paint.measureText(expressionObj.getName()) && iF > 0)) {
                paint = null;
            }
            if (paint != null) {
                fMeasureText = 13.0f * (paint.measureText(expressionObj.getName()) / f10);
            }
        }
        BubbleTipPopup.a aVarI0 = new BubbleTipPopup.a(context).c(view).u(hVarC.b(), R.id.expression_name).i0(48);
        String name = expressionObj.getName();
        f0.o(name, "getName(...)");
        BubbleTipPopup bubbleTipPopupR = aVarI0.p1(name).s1(fMeasureText).p0(0.0f).t0(0.0f).n1(false).d(false).y(false).x(false).r();
        this.f69970i = bubbleTipPopupR;
        if (bubbleTipPopupR != null) {
            bubbleTipPopupR.O();
        }
        return true;
    }

    private final void n4(ExpressionPackViewObj expressionPackViewObj) {
        if (PatchProxy.proxy(new Object[]{expressionPackViewObj}, this, changeQuickRedirect, false, bb.c.g.E, new Class[]{ExpressionPackViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<ExpressionObj> expressions = expressionPackViewObj.getExpressions();
        lc.f fVar = expressionPackViewObj.isBigExpressionStyle() ? this.f69969h : this.f69968g;
        if (fVar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(fVar.p());
            fVar.w(expressions);
            com.max.hbcommon.base.adapter.d.a(fVar, arrayList, expressions, lc.a.f131302a);
        }
    }

    private final void o4(ExpressionPackViewObj expressionPackViewObj) {
        if (PatchProxy.proxy(new Object[]{expressionPackViewObj}, this, changeQuickRedirect, false, bb.c.g.D, new Class[]{ExpressionPackViewObj.class}, Void.TYPE).isSupported) {
            return;
        }
        p4(expressionPackViewObj.isBigExpressionStyle());
        n4(expressionPackViewObj);
        if (!expressionPackViewObj.isBigExpressionStyle()) {
            nc.e eVar = this.f69963b;
            TextView textView = eVar != null ? eVar.f132058j : null;
            if (textView != null) {
                textView.setText(expressionPackViewObj.getPackGroupName());
            }
        }
        this.f69966e = expressionPackViewObj.getPackGroupName();
    }

    private final void p4(boolean z10) {
        RecyclerView recyclerView;
        List<ExpressionObj> listP;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.g.F, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        lc.f fVar = this.f69967f;
        boolean z11 = (fVar == null || (listP = fVar.p()) == null || listP.isEmpty()) ? false : true;
        if (z10) {
            nc.e eVar = this.f69963b;
            LinearLayout linearLayout = eVar != null ? eVar.f132053e : null;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            nc.e eVar2 = this.f69963b;
            LinearLayout linearLayout2 = eVar2 != null ? eVar2.f132054f : null;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            nc.e eVar3 = this.f69963b;
            FrameLayout frameLayout = eVar3 != null ? eVar3.f132051c : null;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            nc.e eVar4 = this.f69963b;
            recyclerView = eVar4 != null ? eVar4.f132055g : null;
            if (recyclerView == null) {
                return;
            }
            recyclerView.setVisibility(0);
            return;
        }
        nc.e eVar5 = this.f69963b;
        LinearLayout linearLayout3 = eVar5 != null ? eVar5.f132053e : null;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(z11 ? 0 : 8);
        }
        nc.e eVar6 = this.f69963b;
        LinearLayout linearLayout4 = eVar6 != null ? eVar6.f132054f : null;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(0);
        }
        nc.e eVar7 = this.f69963b;
        FrameLayout frameLayout2 = eVar7 != null ? eVar7.f132051c : null;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        nc.e eVar8 = this.f69963b;
        recyclerView = eVar8 != null ? eVar8.f132055g : null;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setVisibility(8);
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @dl.d
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.G, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pack_name", this.f69966e);
        String string = jsonObject.toString();
        f0.o(string, "toString(...)");
        return string;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.g.f33101t, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater layoutInflater = this.mInflater;
        if (layoutInflater == null) {
            com.max.heybox.hblog.g.f74531b.v("[ExpressionPackGridFragmentV2-dbg][installViews] inflater is null");
            return;
        }
        FrameLayout frameLayout = ((com.max.hbcommon.base.d) this).mContainer;
        if (frameLayout == null) {
            com.max.heybox.hblog.g.f74531b.v("[ExpressionPackGridFragmentV2-dbg][installViews] container is null");
            return;
        }
        nc.e eVarD = nc.e.d(layoutInflater, frameLayout, false);
        this.f69963b = eVarD;
        setContentView(eVarD);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.g.f33081s, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f69965d = arguments != null ? arguments.getString(f69962n) : null;
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.g.f33121u, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        String str = this.f69965d;
        if (str == null || kotlin.text.u.V1(str)) {
            Log.e(f69959k, "[onViewCreated] invalid group code");
            return;
        }
        h4();
        k4();
        j4();
    }
}
