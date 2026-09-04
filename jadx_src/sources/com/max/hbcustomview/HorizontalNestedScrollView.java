package com.max.hbcustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.core.view.j1;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.w0;
import androidx.core.view.y0;
import androidx.core.widget.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.z;

/* JADX INFO: compiled from: HorizontalNestedScrollView.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HorizontalNestedScrollView extends FrameLayout implements s0, w0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final z f68513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f68514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final z f68515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final z f68516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final z f68517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private VelocityTracker f68518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final z f68519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final z f68520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f68521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final z f68522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final z f68523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f68526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f68527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68528q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalNestedScrollView(@dl.d Context context) {
        super(context);
        f0.p(context, "context");
        this.f68513b = b0.c(new yh.a<ViewConfiguration>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$viewConfiguration$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            public final ViewConfiguration a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.J7, new Class[0], ViewConfiguration.class);
                return patchProxyResultProxy.isSupported ? (ViewConfiguration) patchProxyResultProxy.result : ViewConfiguration.get(this.f68537b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewConfiguration, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ViewConfiguration invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.K7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68514c = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$touchSlop$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.H7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68536b).getScaledTouchSlop());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.I7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68515d = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$minVelocity$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.B7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68533b).getScaledMinimumFlingVelocity());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.C7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68516e = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$maxVelocity$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32708z7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68532b).getScaledMaximumFlingVelocity());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.A7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68517f = b0.c(new yh.a<OverScroller>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$scroller$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final OverScroller a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.F7, new Class[0], OverScroller.class);
                return patchProxyResultProxy.isSupported ? (OverScroller) patchProxyResultProxy.result : new OverScroller(this.f68535b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.OverScroller, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ OverScroller invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.G7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68519h = b0.c(new yh.a<EdgeEffect>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$edgeGlowStart$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final EdgeEffect a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32664x7, new Class[0], EdgeEffect.class);
                return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : new EdgeEffect(this.f68531b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.EdgeEffect, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ EdgeEffect invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32686y7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68520i = b0.c(new yh.a<EdgeEffect>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$edgeGlowEnd$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final EdgeEffect a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32620v7, new Class[0], EdgeEffect.class);
                return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : new EdgeEffect(this.f68530b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.EdgeEffect, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ EdgeEffect invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32642w7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68521j = true;
        this.f68522k = b0.c(new yh.a<y0>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$parentHelper$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final y0 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.D7, new Class[0], y0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0) patchProxyResultProxy.result;
                }
                y0 y0Var = new y0(this.f68534b);
                this.f68534b.setNestedScrollingEnabled(true);
                return y0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.view.y0, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.E7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68523l = b0.c(new yh.a<u0>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$childHelper$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final u0 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32576t7, new Class[0], u0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u0) patchProxyResultProxy.result;
                }
                u0 u0Var = new u0(this.f68529b);
                u0Var.p(true);
                return u0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.view.u0, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u0 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32598u7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68524m = -1;
        this.f68525n = -1;
        f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalNestedScrollView(@dl.d Context context, @dl.d AttributeSet attrs) {
        super(context, attrs);
        f0.p(context, "context");
        f0.p(attrs, "attrs");
        this.f68513b = b0.c(new yh.a<ViewConfiguration>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$viewConfiguration$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            public final ViewConfiguration a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.J7, new Class[0], ViewConfiguration.class);
                return patchProxyResultProxy.isSupported ? (ViewConfiguration) patchProxyResultProxy.result : ViewConfiguration.get(this.f68537b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewConfiguration, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ViewConfiguration invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.K7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68514c = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$touchSlop$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.H7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68536b).getScaledTouchSlop());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.I7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68515d = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$minVelocity$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.B7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68533b).getScaledMinimumFlingVelocity());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.C7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68516e = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$maxVelocity$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32708z7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68532b).getScaledMaximumFlingVelocity());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.A7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68517f = b0.c(new yh.a<OverScroller>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$scroller$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final OverScroller a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.F7, new Class[0], OverScroller.class);
                return patchProxyResultProxy.isSupported ? (OverScroller) patchProxyResultProxy.result : new OverScroller(this.f68535b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.OverScroller, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ OverScroller invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.G7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68519h = b0.c(new yh.a<EdgeEffect>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$edgeGlowStart$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final EdgeEffect a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32664x7, new Class[0], EdgeEffect.class);
                return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : new EdgeEffect(this.f68531b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.EdgeEffect, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ EdgeEffect invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32686y7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68520i = b0.c(new yh.a<EdgeEffect>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$edgeGlowEnd$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final EdgeEffect a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32620v7, new Class[0], EdgeEffect.class);
                return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : new EdgeEffect(this.f68530b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.EdgeEffect, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ EdgeEffect invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32642w7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68521j = true;
        this.f68522k = b0.c(new yh.a<y0>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$parentHelper$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final y0 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.D7, new Class[0], y0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0) patchProxyResultProxy.result;
                }
                y0 y0Var = new y0(this.f68534b);
                this.f68534b.setNestedScrollingEnabled(true);
                return y0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.view.y0, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.E7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68523l = b0.c(new yh.a<u0>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$childHelper$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final u0 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32576t7, new Class[0], u0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u0) patchProxyResultProxy.result;
                }
                u0 u0Var = new u0(this.f68529b);
                u0Var.p(true);
                return u0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.view.u0, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u0 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32598u7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68524m = -1;
        this.f68525n = -1;
        f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalNestedScrollView(@dl.d Context context, @dl.d AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        f0.p(context, "context");
        f0.p(attrs, "attrs");
        this.f68513b = b0.c(new yh.a<ViewConfiguration>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$viewConfiguration$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            public final ViewConfiguration a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.J7, new Class[0], ViewConfiguration.class);
                return patchProxyResultProxy.isSupported ? (ViewConfiguration) patchProxyResultProxy.result : ViewConfiguration.get(this.f68537b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewConfiguration, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ViewConfiguration invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.K7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68514c = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$touchSlop$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.H7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68536b).getScaledTouchSlop());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.I7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68515d = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$minVelocity$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.B7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68533b).getScaledMinimumFlingVelocity());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.C7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68516e = b0.c(new yh.a<Integer>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$maxVelocity$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final Integer a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32708z7, new Class[0], Integer.class);
                return patchProxyResultProxy.isSupported ? (Integer) patchProxyResultProxy.result : Integer.valueOf(HorizontalNestedScrollView.b(this.f68532b).getScaledMaximumFlingVelocity());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Integer, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ Integer invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.A7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68517f = b0.c(new yh.a<OverScroller>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$scroller$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final OverScroller a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.F7, new Class[0], OverScroller.class);
                return patchProxyResultProxy.isSupported ? (OverScroller) patchProxyResultProxy.result : new OverScroller(this.f68535b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.OverScroller, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ OverScroller invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.G7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68519h = b0.c(new yh.a<EdgeEffect>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$edgeGlowStart$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final EdgeEffect a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32664x7, new Class[0], EdgeEffect.class);
                return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : new EdgeEffect(this.f68531b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.EdgeEffect, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ EdgeEffect invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32686y7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68520i = b0.c(new yh.a<EdgeEffect>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$edgeGlowEnd$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final EdgeEffect a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32620v7, new Class[0], EdgeEffect.class);
                return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : new EdgeEffect(this.f68530b.getContext());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.EdgeEffect, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ EdgeEffect invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32642w7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68521j = true;
        this.f68522k = b0.c(new yh.a<y0>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$parentHelper$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final y0 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.D7, new Class[0], y0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (y0) patchProxyResultProxy.result;
                }
                y0 y0Var = new y0(this.f68534b);
                this.f68534b.setNestedScrollingEnabled(true);
                return y0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.view.y0, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ y0 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.E7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68523l = b0.c(new yh.a<u0>() { // from class: com.max.hbcustomview.HorizontalNestedScrollView$childHelper$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @dl.d
            public final u0 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32576t7, new Class[0], u0.class);
                if (patchProxyResultProxy.isSupported) {
                    return (u0) patchProxyResultProxy.result;
                }
                u0 u0Var = new u0(this.f68529b);
                u0Var.p(true);
                return u0Var;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.core.view.u0, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ u0 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32598u7, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f68524m = -1;
        this.f68525n = -1;
        f();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.V6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getScroller().abortAnimation();
    }

    public static final /* synthetic */ ViewConfiguration b(HorizontalNestedScrollView horizontalNestedScrollView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{horizontalNestedScrollView}, null, changeQuickRedirect, true, bb.c.f.f32554s7, new Class[]{HorizontalNestedScrollView.class}, ViewConfiguration.class);
        return patchProxyResultProxy.isSupported ? (ViewConfiguration) patchProxyResultProxy.result : horizontalNestedScrollView.getViewConfiguration();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.R6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68524m = -1;
        this.f68525n = -1;
        this.f68526o = false;
        m();
        getEdgeGlowStart().onRelease();
        getEdgeGlowEnd().onRelease();
        stopNestedScroll(0);
    }

    private final boolean e(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.W6, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollX = getScrollX();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() && i11 < childAt.getBottom() && i10 >= childAt.getLeft() - scrollX && i10 < childAt.getRight() - scrollX;
    }

    private final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.H6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setClickable(true);
        setFocusable(true);
        setWillNotDraw(false);
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.S6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VelocityTracker velocityTracker = this.f68518g;
        if (velocityTracker == null) {
            this.f68518g = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private final u0 getChildHelper() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.G6, new Class[0], u0.class);
        return patchProxyResultProxy.isSupported ? (u0) patchProxyResultProxy.result : (u0) this.f68523l.getValue();
    }

    private final EdgeEffect getEdgeGlowEnd() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.E6, new Class[0], EdgeEffect.class);
        return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : (EdgeEffect) this.f68520i.getValue();
    }

    private final EdgeEffect getEdgeGlowStart() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.D6, new Class[0], EdgeEffect.class);
        return patchProxyResultProxy.isSupported ? (EdgeEffect) patchProxyResultProxy.result : (EdgeEffect) this.f68519h.getValue();
    }

    private final int getMaxVelocity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.B6, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((Number) this.f68516e.getValue()).intValue();
    }

    private final int getMinVelocity() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.A6, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((Number) this.f68515d.getValue()).intValue();
    }

    private final y0 getParentHelper() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.F6, new Class[0], y0.class);
        return patchProxyResultProxy.isSupported ? (y0) patchProxyResultProxy.result : (y0) this.f68522k.getValue();
    }

    private final OverScroller getScroller() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.C6, new Class[0], OverScroller.class);
        return patchProxyResultProxy.isSupported ? (OverScroller) patchProxyResultProxy.result : (OverScroller) this.f68517f.getValue();
    }

    private final int getTouchSlop() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32707z6, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ((Number) this.f68514c.getValue()).intValue();
    }

    private final ViewConfiguration getViewConfiguration() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32685y6, new Class[0], ViewConfiguration.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewConfiguration) patchProxyResultProxy.result;
        }
        Object value = this.f68513b.getValue();
        f0.o(value, "getValue(...)");
        return (ViewConfiguration) value;
    }

    private final void h() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.T6, new Class[0], Void.TYPE).isSupported && this.f68518g == null) {
            this.f68518g = VelocityTracker.obtain();
        }
    }

    private final void i(int i10, int i11, int[] iArr) {
        Object[] objArr = {new Integer(i10), new Integer(i11), iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32257f7, new Class[]{cls, cls, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        int scrollX = getScrollX();
        l(i10, getScrollX(), getScrollRangeX());
        int scrollX2 = getScrollX() - scrollX;
        if (iArr != null) {
            iArr[0] = iArr[0] + scrollX2;
        }
        getChildHelper().e(scrollX2, 0, i10 - scrollX2, 0, null, i11, iArr);
    }

    private final void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.U6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VelocityTracker velocityTracker = this.f68518g;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f68518g = null;
    }

    private final void n(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.Q6, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            startNestedScroll(1, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f68527p = getScrollX();
        j1.n1(this);
    }

    @Override // androidx.core.view.v0
    public void G(@dl.d View target, int i10, int i11, int i12, int i13, int i14) {
        Object[] objArr = {target, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32234e7, new Class[]{View.class, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        i(i12, i14, null);
    }

    @Override // androidx.core.view.v0
    public void O(@dl.d View target, int i10, int i11, @dl.d int[] consumed, int i12) {
        Object[] objArr = {target, new Integer(i10), new Integer(i11), consumed, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32164b7, new Class[]{View.class, cls, cls, int[].class, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        f0.p(consumed, "consumed");
        dispatchNestedPreScroll(i10, i11, consumed, null, i12);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.M6, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (getChildCount() > 1) {
            throw new IllegalStateException("HorizontalNestedScrollView only support one child.".toString());
        }
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        if (getChildCount() == 0) {
            return width;
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int right = childAt.getRight() + (marginLayoutParams != null ? marginLayoutParams.getMarginEnd() : 0);
        int iMax = Math.max(0, right - width);
        int scrollX = getScrollX();
        if (scrollX < 0) {
            return right - scrollX;
        }
        return scrollX > iMax ? right + (scrollX - iMax) : right;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.L6, new Class[0], Void.TYPE).isSupported || getScroller().isFinished()) {
            return;
        }
        getScroller().computeScrollOffset();
        int currX = getScroller().getCurrX();
        int i10 = currX - this.f68527p;
        this.f68527p = currX;
        int[] iArr = new int[2];
        for (int i11 = 0; i11 < 2; i11++) {
            iArr[i11] = 0;
        }
        int i12 = dispatchNestedPreScroll(i10, 0, iArr, null, 1) ? i10 - iArr[0] : i10;
        if (i12 != 0) {
            int scrollX = getScrollX();
            l(i10, scrollX, getScrollRangeX());
            int scrollX2 = getScrollX() - scrollX;
            int i13 = i12 - scrollX2;
            iArr[0] = 0;
            dispatchNestedScroll(scrollX2, 0, i13, 0, null, 1, iArr);
            i12 = i13 - iArr[0];
        }
        if (i12 < 0) {
            if (getEdgeGlowStart().isFinished()) {
                getEdgeGlowStart().onAbsorb((int) getScroller().getCurrVelocity());
            }
            a();
        }
        if (i12 > 0) {
            if (getEdgeGlowEnd().isFinished()) {
                getEdgeGlowEnd().onAbsorb((int) getScroller().getCurrVelocity());
            }
            a();
        }
        if (getScroller().isFinished()) {
            stopNestedScroll(1);
        } else {
            j1.n1(this);
        }
    }

    public final void d(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.P6, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && getChildCount() > 0) {
            getScroller().fling(getScrollX(), getScrollY(), i10, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, 0, 0);
            n(true);
        }
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32418m7, new Class[]{cls, cls, cls2}, cls2);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.t0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32372k7, new Class[]{cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getChildHelper().b(f10, f11);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedPreScroll(int i10, int i11, @dl.e int[] iArr, @dl.e int[] iArr2, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), iArr, iArr2, new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32349j7, new Class[]{cls, cls, int[].class, int[].class, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.s0
    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, @dl.e int[] iArr, int i14, @dl.d int[] consumed) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), iArr, new Integer(i14), consumed};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32303h7, new Class[]{cls, cls, cls, cls, int[].class, cls, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(consumed, "consumed");
        getChildHelper().e(i10, i11, i12, i13, iArr, i14, consumed);
    }

    @Override // androidx.core.view.r0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @dl.e int[] iArr, int i14) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), iArr, new Integer(i14)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32326i7, new Class[]{cls, cls, cls, cls, int[].class, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View
    public void draw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.K6, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.draw(canvas);
        if (!getEdgeGlowStart().isFinished()) {
            int iSave = canvas.save();
            float width = getWidth();
            float height = getHeight();
            canvas.rotate(270.0f);
            canvas.translate(-height, Math.min(0.0f, getScrollX()));
            getEdgeGlowStart().setSize((int) height, (int) width);
            if (getEdgeGlowStart().draw(canvas)) {
                j1.n1(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (getEdgeGlowEnd().isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        float width2 = getWidth();
        float height2 = getHeight();
        canvas.rotate(90.0f);
        canvas.translate(0.0f, -(Math.max(getScrollRangeX(), getScrollX()) + width2));
        getEdgeGlowEnd().setSize((int) height2, (int) width2);
        if (getEdgeGlowEnd().draw(canvas)) {
            j1.n1(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    @dl.d
    public ViewGroup.LayoutParams generateLayoutParams(@dl.e ViewGroup.LayoutParams layoutParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutParams}, this, changeQuickRedirect, false, bb.c.f.X6, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
        return patchProxyResultProxy.isSupported ? (ViewGroup.LayoutParams) patchProxyResultProxy.result : new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32532r7, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : getParentHelper().a();
    }

    public final int getScrollRangeX() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.N6, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        View childAt = getChildAt(0);
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return Math.max(0, ((childAt.getWidth() + marginLayoutParams.leftMargin) + marginLayoutParams.rightMargin) - ((getWidth() - getPaddingLeft()) - getPaddingRight()));
    }

    @Override // androidx.core.view.w0
    public void h0(@dl.d View target, int i10, int i11, int i12, int i13, int i14, @dl.d int[] consumed) {
        Object[] objArr = {target, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14), consumed};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32211d7, new Class[]{View.class, cls, cls, cls, cls, cls, int[].class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        f0.p(consumed, "consumed");
        i(i12, i14, consumed);
    }

    @Override // androidx.core.view.r0
    public boolean hasNestedScrollingParent(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32487p7, new Class[]{Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getChildHelper().l(i10);
    }

    @Override // androidx.core.view.v0
    public void j(@dl.d View child, @dl.d View target, int i10, int i11) {
        Object[] objArr = {child, target, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32141a7, new Class[]{View.class, View.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(child, "child");
        f0.p(target, "target");
        getParentHelper().c(child, target, i10, i11);
        startNestedScroll(1, i11);
    }

    @Override // androidx.core.view.v0
    public boolean j0(@dl.d View child, @dl.d View target, int i10, int i11) {
        Object[] objArr = {child, target, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32187c7, new Class[]{View.class, View.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(child, "child");
        f0.p(target, "target");
        return (i10 & 1) != 0;
    }

    @Override // androidx.core.view.v0
    public void k(@dl.d View target, int i10) {
        if (PatchProxy.proxy(new Object[]{target, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32280g7, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(target, "target");
        getParentHelper().e(target, i10);
        stopNestedScroll(i10);
    }

    public final boolean l(int i10, int i11, int i12) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.O6, new Class[]{cls, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int i13 = i10 + i11;
        if (i12 < i13) {
            scrollTo(i12, 0);
        } else {
            if (i13 >= 0) {
                scrollTo(i13, 0);
                return false;
            }
            scrollTo(0, 0);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void measureChild(@dl.e View view, int i10, int i11) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Y6, new Class[]{View.class, cls, cls}, Void.TYPE).isSupported || view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) layoutParams).height));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(@dl.e View view, int i10, int i11, int i12, int i13) {
        Object[] objArr = {view, new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Z6, new Class[]{View.class, cls, cls, cls, cls}, Void.TYPE).isSupported || view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        view.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.leftMargin + marginLayoutParams.bottomMargin, 0), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@dl.e MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.I6, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2 && this.f68526o) {
            return true;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            int x10 = (int) (((double) motionEvent.getX()) + 0.5d);
            if (e(x10, (int) (((double) motionEvent.getY()) + 0.5d))) {
                this.f68524m = x10;
                this.f68525n = motionEvent.getPointerId(0);
                g();
                VelocityTracker velocityTracker = this.f68518g;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                getScroller().computeScrollOffset();
                this.f68526o = !getScroller().isFinished();
                startNestedScroll(1, 0);
                return this.f68526o;
            }
            this.f68526o = false;
            m();
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            int x11 = (int) (((double) motionEvent.getX(motionEvent.findPointerIndex(this.f68525n))) + 0.5d);
            if (Math.abs(this.f68524m - x11) > getTouchSlop() && (getNestedScrollAxes() & 1) == 0) {
                this.f68526o = true;
                this.f68524m = x11;
                h();
                VelocityTracker velocityTracker2 = this.f68518g;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                this.f68528q = 0;
                ViewParent parent = getParent();
                if (parent == null) {
                    return true;
                }
                parent.requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else {
            if ((numValueOf != null && numValueOf.intValue() == 3) || (numValueOf != null && numValueOf.intValue() == 1)) {
                this.f68526o = false;
                this.f68525n = -1;
                m();
                if (getScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRangeX(), 0, 0)) {
                    j1.n1(this);
                }
                stopNestedScroll(0);
            } else if (numValueOf != null && numValueOf.intValue() == 6) {
                int actionIndex = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex) == this.f68525n) {
                    int i10 = actionIndex != 0 ? 0 : 1;
                    this.f68525n = motionEvent.getPointerId(i10);
                    this.f68524m = (int) (((double) motionEvent.getX(i10)) + 0.5d);
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(@dl.d View target, float f10, float f11, boolean z10) {
        Object[] objArr = {target, new Float(f10), new Float(f11), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        Class cls2 = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32441n7, new Class[]{View.class, cls, cls, cls2}, cls2);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(target, "target");
        if (z10) {
            return false;
        }
        dispatchNestedFling(f10, f11, z10);
        d(-((int) f10));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(@dl.d View target, float f10, float f11) {
        Object[] objArr = {target, new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32395l7, new Class[]{View.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(target, "target");
        return dispatchNestedPreFling(f10, f11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(@dl.e MotionEvent motionEvent) {
        int i10;
        int i11;
        int xVelocity;
        VelocityTracker velocityTracker;
        boolean z10 = 1;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, bb.c.f.J6, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        h();
        if (motionEvent != null) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(motionEvent.getActionMasked() == 0 ? 0.0f : this.f68528q, 0.0f);
            int actionIndex = motionEvent.getActionIndex();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    VelocityTracker velocityTracker2 = this.f68518g;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000, getMaxVelocity());
                    }
                    xVelocity = velocityTracker2 != null ? (int) velocityTracker2.getXVelocity(this.f68525n) : 0;
                    if (Math.abs(xVelocity) > getMinVelocity()) {
                        float f10 = -xVelocity;
                        if (!dispatchNestedPreFling(f10, 0.0f)) {
                            dispatchNestedFling(f10, 0.0f, true);
                            d(-xVelocity);
                        }
                    } else if (getScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRangeX(), 0, 0)) {
                        j1.n1(this);
                    }
                    c();
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f68525n);
                    int x10 = (int) (((double) motionEvent.getX(iFindPointerIndex)) + 0.5d);
                    int touchSlop = this.f68524m - x10;
                    if (!this.f68526o && Math.abs(touchSlop) > getTouchSlop()) {
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f68526o = true;
                        touchSlop = touchSlop > 0 ? touchSlop - getTouchSlop() : touchSlop + getTouchSlop();
                    }
                    int i12 = touchSlop;
                    if (this.f68526o) {
                        int[] iArr = new int[2];
                        for (int i13 = 0; i13 < 2; i13++) {
                            iArr[i13] = 0;
                        }
                        int[] iArr2 = new int[2];
                        for (int i14 = 0; i14 < 2; i14++) {
                            iArr2[i14] = 0;
                        }
                        if (dispatchNestedPreScroll(i12, 0, iArr, iArr2, 0)) {
                            i12 -= iArr[0];
                            this.f68528q += iArr2[0];
                        }
                        this.f68524m = x10 - iArr2[0];
                        int scrollX = getScrollX();
                        if (l(i12, getScrollX(), getScrollRangeX()) && (velocityTracker = this.f68518g) != null) {
                            velocityTracker.clear();
                        }
                        int scrollX2 = getScrollX() - scrollX;
                        iArr[0] = 0;
                        int i15 = i12;
                        dispatchNestedScroll(scrollX2, 0, i12 - scrollX2, 0, iArr2, 0, iArr);
                        int i16 = this.f68524m;
                        int i17 = iArr2[0];
                        this.f68524m = i16 - i17;
                        this.f68528q += i17;
                        if (this.f68521j) {
                            int i18 = scrollX + i15;
                            if (i18 < 0) {
                                i.g(getEdgeGlowStart(), i15 / getWidth(), 1.0f - (motionEvent.getY(iFindPointerIndex) / getHeight()));
                                if (!getEdgeGlowEnd().isFinished()) {
                                    getEdgeGlowEnd().onRelease();
                                }
                            } else if (i18 > getScrollRangeX()) {
                                i.g(getEdgeGlowEnd(), i15 / getWidth(), motionEvent.getY(iFindPointerIndex) / getHeight());
                                if (!getEdgeGlowStart().isFinished()) {
                                    getEdgeGlowStart().onRelease();
                                }
                            }
                            if (!getEdgeGlowEnd().isFinished() || !getEdgeGlowStart().isFinished()) {
                                j1.n1(this);
                            }
                        }
                    }
                } else if (actionMasked == 3) {
                    if (this.f68526o && getChildCount() > 0 && getScroller().springBack(getScrollX(), getScrollY(), 0, getScrollRangeX(), 0, 0)) {
                        j1.n1(this);
                    }
                    c();
                } else if (actionMasked == 5) {
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    this.f68525n = pointerId;
                    this.f68524m = (int) (((double) motionEvent.getX(motionEvent.findPointerIndex(pointerId))) + 0.5d);
                } else if (actionMasked == 6 && motionEvent.getPointerId(actionIndex) == this.f68525n) {
                    xVelocity = actionIndex == 0 ? 1 : 0;
                    this.f68525n = motionEvent.getPointerId(xVelocity);
                    this.f68524m = (int) (((double) motionEvent.getX(xVelocity)) + 0.5d);
                }
                i11 = 1;
            } else {
                this.f68528q = 0;
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                this.f68525n = pointerId2;
                this.f68524m = (int) (((double) motionEvent.getX(motionEvent.findPointerIndex(pointerId2))) + 0.5d);
                if (getScroller().isFinished()) {
                    i10 = 1;
                } else {
                    ViewParent parent2 = getParent();
                    i10 = 1;
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    a();
                }
                int i19 = getChildCount() == 0 ? 0 : i10;
                startNestedScroll(i10, 0);
                i11 = i19;
            }
            VelocityTracker velocityTracker3 = this.f68518g;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEventObtain);
            }
            motionEventObtain.recycle();
            z10 = i11;
        }
        return z10;
    }

    @Override // androidx.core.view.r0
    public boolean startNestedScroll(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32510q7, new Class[]{cls, cls}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : getChildHelper().s(i10, i11);
    }

    @Override // androidx.core.view.r0
    public void stopNestedScroll(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32464o7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getChildHelper().u(i10);
    }
}
