package com.max.video;

import af.p;
import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.j1;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.y;
import bb.c;
import com.max.hbvideo.R;
import com.max.heybox.hblog.g;
import com.max.video.impl.f;
import com.max.video.player.info.PlaybackState;
import com.max.video.player.info.WindowMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.mmkv.MMKV;
import com.tencent.rtmp.ui.TXCloudVideoView;
import dl.d;
import dl.e;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.z;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import kotlinx.coroutines.k;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: AbsVideoView.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nAbsVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsVideoView.kt\ncom/max/video/AbsVideoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,713:1\n1#2:714\n*E\n"})
public abstract class AbsVideoView extends FrameLayout implements j {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.max.video.device.b f75848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final kotlinx.coroutines.flow.j<Boolean> f75849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final u<Boolean> f75850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private WeakReference<Context> f75851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private WeakReference<ze.d> f75852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f75853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    private WeakReference<com.max.video.player.a> f75854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @e
    private ze.b f75855i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private ViewGroup f75856j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f75857k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    private final kotlinx.coroutines.flow.j<WindowMode> f75858l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    private final u<WindowMode> f75859m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f75860n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @d
    private final kotlinx.coroutines.flow.j<Boolean> f75861o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @d
    private final u<Boolean> f75862p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f75863q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @d
    private final z f75864r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @d
    private final z f75865s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @d
    private final z f75866t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @e
    private TXCloudVideoView f75867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @e
    private xe.a f75868v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e
    private xe.a f75869w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsVideoView(@d Context context) {
        super(context);
        f0.p(context, "context");
        Boolean bool = Boolean.FALSE;
        kotlinx.coroutines.flow.j<Boolean> jVarA = v.a(bool);
        this.f75849c = jVarA;
        this.f75850d = jVarA;
        this.f75852f = new WeakReference<>(null);
        this.f75853g = true;
        this.f75854h = new WeakReference<>(null);
        ze.b bVar = new ze.b();
        bVar.t(this);
        this.f75855i = bVar;
        kotlinx.coroutines.flow.j<WindowMode> jVarA2 = v.a(WindowMode.NORMAL);
        this.f75858l = jVarA2;
        this.f75859m = jVarA2;
        this.f75860n = 1.0f;
        kotlinx.coroutines.flow.j<Boolean> jVarA3 = v.a(bool);
        this.f75861o = jVarA3;
        this.f75862p = jVarA3;
        this.f75864r = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$uiLayer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Yj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75898b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setVisibility(8);
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Zj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f75865s = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$renderLayer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Wj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75897b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Xj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f75866t = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$extraLayerContainer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34893mj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75880b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34916nj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(getContext());
        tXCloudVideoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f75867u = tXCloudVideoView;
        setTag(R.id.window_mode, jVarA2.getValue());
        setBackgroundColor(j1.f21601t);
        getRenderLayer().addView(this.f75867u);
        addView(getRenderLayer());
        addView(getUiLayer());
        addView(getExtraLayerContainer());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsVideoView(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        Boolean bool = Boolean.FALSE;
        kotlinx.coroutines.flow.j<Boolean> jVarA = v.a(bool);
        this.f75849c = jVarA;
        this.f75850d = jVarA;
        this.f75852f = new WeakReference<>(null);
        this.f75853g = true;
        this.f75854h = new WeakReference<>(null);
        ze.b bVar = new ze.b();
        bVar.t(this);
        this.f75855i = bVar;
        kotlinx.coroutines.flow.j<WindowMode> jVarA2 = v.a(WindowMode.NORMAL);
        this.f75858l = jVarA2;
        this.f75859m = jVarA2;
        this.f75860n = 1.0f;
        kotlinx.coroutines.flow.j<Boolean> jVarA3 = v.a(bool);
        this.f75861o = jVarA3;
        this.f75862p = jVarA3;
        this.f75864r = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$uiLayer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Yj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75898b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setVisibility(8);
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Zj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f75865s = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$renderLayer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Wj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75897b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Xj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f75866t = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$extraLayerContainer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34893mj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75880b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34916nj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(getContext());
        tXCloudVideoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f75867u = tXCloudVideoView;
        setTag(R.id.window_mode, jVarA2.getValue());
        setBackgroundColor(j1.f21601t);
        getRenderLayer().addView(this.f75867u);
        addView(getRenderLayer());
        addView(getUiLayer());
        addView(getExtraLayerContainer());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsVideoView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        Boolean bool = Boolean.FALSE;
        kotlinx.coroutines.flow.j<Boolean> jVarA = v.a(bool);
        this.f75849c = jVarA;
        this.f75850d = jVarA;
        this.f75852f = new WeakReference<>(null);
        this.f75853g = true;
        this.f75854h = new WeakReference<>(null);
        ze.b bVar = new ze.b();
        bVar.t(this);
        this.f75855i = bVar;
        kotlinx.coroutines.flow.j<WindowMode> jVarA2 = v.a(WindowMode.NORMAL);
        this.f75858l = jVarA2;
        this.f75859m = jVarA2;
        this.f75860n = 1.0f;
        kotlinx.coroutines.flow.j<Boolean> jVarA3 = v.a(bool);
        this.f75861o = jVarA3;
        this.f75862p = jVarA3;
        this.f75864r = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$uiLayer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Yj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75898b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setVisibility(8);
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Zj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f75865s = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$renderLayer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Wj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75897b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Xj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        this.f75866t = b0.c(new yh.a<FrameLayout>() { // from class: com.max.video.AbsVideoView$extraLayerContainer$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            @d
            public final FrameLayout a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34893mj, new Class[0], FrameLayout.class);
                if (patchProxyResultProxy.isSupported) {
                    return (FrameLayout) patchProxyResultProxy.result;
                }
                FrameLayout frameLayout = new FrameLayout(this.f75880b.getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                return frameLayout;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.FrameLayout, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ FrameLayout invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34916nj, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        });
        TXCloudVideoView tXCloudVideoView = new TXCloudVideoView(getContext());
        tXCloudVideoView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f75867u = tXCloudVideoView;
        setTag(R.id.window_mode, jVarA2.getValue());
        setBackgroundColor(j1.f21601t);
        getRenderLayer().addView(this.f75867u);
        addView(getRenderLayer());
        addView(getUiLayer());
        addView(getExtraLayerContainer());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void A() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Qi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(r0.a(e1.e()), null, null, new AbsVideoView$initGestureV2$1(this, null), 3, null);
    }

    private final void B(LifecycleCoroutineScope lifecycleCoroutineScope) {
        if (PatchProxy.proxy(new Object[]{lifecycleCoroutineScope}, this, changeQuickRedirect, false, c.m.Ni, new Class[]{LifecycleCoroutineScope.class}, Void.TYPE).isSupported) {
            return;
        }
        getUiLayer().setVisibility(0);
        y();
        lifecycleCoroutineScope.f(new AbsVideoView$initUI$1(this, null));
        lifecycleCoroutineScope.f(new AbsVideoView$initUI$2(this, null));
        if (getUi() instanceof af.b) {
            lifecycleCoroutineScope.f(new AbsVideoView$initUI$3(this, null));
        }
        if (getUi() instanceof p) {
            lifecycleCoroutineScope.f(new AbsVideoView$initUI$4(this, null));
        }
    }

    private final void U() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ri, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getRenderLayer().removeView(this.f75867u);
        TXCloudVideoView tXCloudVideoView = this.f75867u;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.onDestroy();
        }
        TXCloudVideoView tXCloudVideoView2 = new TXCloudVideoView(getContext());
        tXCloudVideoView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f75867u = tXCloudVideoView2;
        getRenderLayer().addView(this.f75867u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t(LifecycleCoroutineScope lifecycleCoroutineScope) {
        if (PatchProxy.proxy(new Object[]{lifecycleCoroutineScope}, this, changeQuickRedirect, false, c.m.f34754gi, new Class[]{LifecycleCoroutineScope.class}, Void.TYPE).isSupported) {
            return;
        }
        B(lifecycleCoroutineScope);
        k.f(lifecycleCoroutineScope, null, null, new AbsVideoView$create$2(this, null), 3, null);
        k.f(lifecycleCoroutineScope, null, null, new AbsVideoView$create$3(this, null), 3, null);
        k.f(lifecycleCoroutineScope, null, null, new AbsVideoView$create$4(this, null), 3, null);
        ze.d ui2 = getUi();
        if (ui2 != 0) {
            if (!(ui2 instanceof View)) {
                throw new IllegalArgumentException("VideoUI must be a View");
            }
            getUiLayer().removeAllViews();
            View view = (View) ui2;
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            getUiLayer().addView(view, new FrameLayout.LayoutParams(-1, -1, 17));
            ui2.u(lifecycleCoroutineScope, this);
        }
    }

    private final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Oi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (MMKV.mmkvWithID("improve_ab_test").decodeInt(ad.a.f1195b) > 2) {
            A();
        } else {
            z();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void z() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Pi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        k.f(r0.a(e1.e()), null, null, new AbsVideoView$initGestureV1$1(this, null), 3, null);
    }

    public final boolean C() {
        Object objQ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Li, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.video.player.a player = getPlayer();
        if (player == null || (objQ = player.Q()) == null) {
            objQ = PlaybackState.IDLE;
        }
        return objQ == PlaybackState.COMPLETE;
    }

    public final boolean D() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Mi, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f75859m.getValue() == WindowMode.FULLSCREEN;
    }

    public final boolean E() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34915ni, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            return player.y();
        }
        return false;
    }

    public final boolean F() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ci, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            return player.isPlayable();
        }
        return false;
    }

    public final boolean G() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Bi, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            return player.isPlaying();
        }
        return false;
    }

    public final void H() {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Di, new Class[0], Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.x();
    }

    public void I() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34869li, new Class[0], Void.TYPE).isSupported && this.f75853g) {
            this.f75861o.setValue(Boolean.TRUE);
        }
    }

    public void J() {
        ze.d ui2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34846ki, new Class[0], Void.TYPE).isSupported || (ui2 = getUi()) == null) {
            return;
        }
        ui2.l();
    }

    public final void K() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35116wi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f75857k = true;
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.pause();
        }
    }

    public final void L(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.f35138xi, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75857k = z10;
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.pause();
        }
    }

    public final void M() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35072ui, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.play();
        }
        this.f75857k = false;
    }

    public final void N(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35094vi, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.z(i10);
        }
        this.f75857k = false;
    }

    public final void O() {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35006ri, new Class[0], Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.prepare();
    }

    public final void P(int i10) {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35028si, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.U(i10);
    }

    public final void Q() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ii, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getRenderLayer().removeAllViews();
        TXCloudVideoView tXCloudVideoView = this.f75867u;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.onDestroy();
        }
        this.f75867u = null;
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.release();
        }
        this.f75854h.clear();
    }

    public final void R() {
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Fi, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WeakReference<Context> weakReference = this.f75851e;
        if (weakReference == null || (context = weakReference.get()) == null) {
            context = getContext();
        }
        f0.m(context);
        S(context);
    }

    public final void S(@d Context ctx) {
        if (PatchProxy.proxy(new Object[]{ctx}, this, changeQuickRedirect, false, c.m.Gi, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(ctx, "ctx");
        U();
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.release();
        }
        ze.d ui2 = getUi();
        if (ui2 != null) {
            ui2.reset();
        }
        this.f75854h.clear();
        o(new f(ctx));
        ze.b bVar = this.f75855i;
        if (bVar != null) {
            bVar.q(false);
        }
        ze.b bVar2 = this.f75855i;
        if (bVar2 != null) {
            bVar2.u(false);
        }
        s(ctx);
    }

    public final void T(@e Context context, @e ze.d dVar) {
        if (PatchProxy.proxy(new Object[]{context, dVar}, this, changeQuickRedirect, false, c.m.Hi, new Class[]{Context.class, ze.d.class}, Void.TYPE).isSupported) {
            return;
        }
        if (context == null) {
            WeakReference<Context> weakReference = this.f75851e;
            context = weakReference != null ? weakReference.get() : null;
            if (context == null) {
                context = getContext();
            }
        }
        U();
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.release();
        }
        this.f75854h.clear();
        ze.b bVar = this.f75855i;
        if (bVar != null) {
            bVar.q(false);
        }
        ze.b bVar2 = this.f75855i;
        if (bVar2 != null) {
            bVar2.u(false);
        }
        f0.m(context);
        o(new f(context));
        p(dVar);
        s(context);
    }

    public final void V(int i10) {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35182zi, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.B(i10);
    }

    public final void W(float f10) {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.Ai, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        com.max.video.player.a player = getPlayer();
        int duration = player != null ? player.getDuration() : 0;
        com.max.video.player.a player2 = getPlayer();
        if (player2 != null) {
            int currentPosition = player2.getCurrentPosition();
            if (duration != 0) {
                int i11 = currentPosition + ((int) (f10 * duration));
                if (i11 > duration) {
                    i10 = duration;
                } else if (i11 >= 0) {
                    i10 = i11;
                }
                com.max.video.player.a player3 = getPlayer();
                if (player3 != null) {
                    player3.B(i10);
                }
            }
        }
    }

    @d
    public final AbsVideoView X(@d ze.b handler) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{handler}, this, changeQuickRedirect, false, c.m.f34685di, new Class[]{ze.b.class}, AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        f0.p(handler, "handler");
        this.f75855i = handler;
        return this;
    }

    public final void Y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35050ti, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.start();
        }
        this.f75857k = false;
    }

    public final void Z() {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f35160yi, new Class[0], Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.stop();
    }

    public final void a0() {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ei, new Class[0], Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.v();
    }

    public void b0(@d WindowMode mode) {
        if (PatchProxy.proxy(new Object[]{mode}, this, changeQuickRedirect, false, c.m.f34823ji, new Class[]{WindowMode.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mode, "mode");
        this.f75858l.setValue(mode);
    }

    public final int getCurrentPosition() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ji, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            return player.getCurrentPosition();
        }
        return 0;
    }

    public final int getDuration() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ki, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            return player.getDuration();
        }
        return 0;
    }

    @d
    public final FrameLayout getExtraLayerContainer() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Xh, new Class[0], FrameLayout.class);
        return patchProxyResultProxy.isSupported ? (FrameLayout) patchProxyResultProxy.result : (FrameLayout) this.f75866t.getValue();
    }

    @d
    public final u<Boolean> getFastPlayState() {
        return this.f75862p;
    }

    @e
    public final ze.b getGestureHandler() {
        return this.f75855i;
    }

    @d
    public final u<Boolean> getMuteState() {
        return this.f75850d;
    }

    @e
    public final ViewGroup getOriginContainer() {
        return this.f75856j;
    }

    @e
    public final xe.a getPlaybackStateChangeListener() {
        return this.f75868v;
    }

    @e
    public final com.max.video.player.a getPlayer() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Uh, new Class[0], com.max.video.player.a.class);
        return patchProxyResultProxy.isSupported ? (com.max.video.player.a) patchProxyResultProxy.result : this.f75854h.get();
    }

    @d
    public final FrameLayout getRenderLayer() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Wh, new Class[0], FrameLayout.class);
        return patchProxyResultProxy.isSupported ? (FrameLayout) patchProxyResultProxy.result : (FrameLayout) this.f75865s.getValue();
    }

    @e
    public final xe.a getTargetStateChangeListener() {
        return this.f75869w;
    }

    @e
    public final ze.d getUi() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Th, new Class[0], ze.d.class);
        return patchProxyResultProxy.isSupported ? (ze.d) patchProxyResultProxy.result : this.f75852f.get();
    }

    @d
    public final FrameLayout getUiLayer() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Vh, new Class[0], FrameLayout.class);
        return patchProxyResultProxy.isSupported ? (FrameLayout) patchProxyResultProxy.result : (FrameLayout) this.f75864r.getValue();
    }

    @d
    public final u<WindowMode> getWindowMode() {
        return this.f75859m;
    }

    @Override // androidx.lifecycle.j
    public void j(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.Yh, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        i.d(this, owner);
        if (!F() || this.f75857k) {
            return;
        }
        M();
    }

    @Override // androidx.lifecycle.j
    public void l(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.Zh, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        i.c(this, owner);
        if (this.f75857k) {
            return;
        }
        L(false);
    }

    public final void m(@d View layer) {
        if (PatchProxy.proxy(new Object[]{layer}, this, changeQuickRedirect, false, c.m.f34777hi, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(layer, "layer");
        getExtraLayerContainer().addView(layer, new FrameLayout.LayoutParams(-1, -1, 17));
    }

    @d
    public final AbsVideoView n(@d y owner) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.f34708ei, new Class[]{y.class}, AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        f0.p(owner, "owner");
        owner.getLifecycle().a(this);
        return this;
    }

    @d
    public final AbsVideoView o(@d com.max.video.player.a vp) {
        com.max.video.player.a player;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{vp}, this, changeQuickRedirect, false, c.m.f34638bi, new Class[]{com.max.video.player.a.class}, AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        f0.p(vp, "vp");
        if (getPlayer() != null) {
            U();
        }
        this.f75854h = new WeakReference<>(vp);
        TXCloudVideoView tXCloudVideoView = this.f75867u;
        if (tXCloudVideoView != null && (player = getPlayer()) != null) {
            player.A(tXCloudVideoView);
        }
        return this;
    }

    @Override // androidx.lifecycle.j
    public void onDestroy(@d y owner) {
        if (PatchProxy.proxy(new Object[]{owner}, this, changeQuickRedirect, false, c.m.f34615ai, new Class[]{y.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(owner, "owner");
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            player.release();
        }
        this.f75854h.clear();
        TXCloudVideoView tXCloudVideoView = this.f75867u;
        if (tXCloudVideoView != null) {
            tXCloudVideoView.onDestroy();
        }
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStart(y yVar) {
        i.e(this, yVar);
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void onStop(y yVar) {
        i.f(this, yVar);
    }

    @d
    public final AbsVideoView p(@e ze.d dVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, c.m.f34661ci, new Class[]{ze.d.class}, AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        this.f75852f = new WeakReference<>(dVar);
        return this;
    }

    @Override // androidx.lifecycle.j
    public /* synthetic */ void q(y yVar) {
        i.a(this, yVar);
    }

    public final void r() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34799ii, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getExtraLayerContainer().removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(@d Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, c.m.f34731fi, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        com.max.video.device.b bVar = null;
        this.f75848b = new com.max.video.device.b(context, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
        com.max.video.player.a player = getPlayer();
        if (player != null) {
            com.max.video.device.b bVar2 = this.f75848b;
            if (bVar2 == null) {
                f0.S("audioManager");
            } else {
                bVar = bVar2;
            }
            bVar.b(context, player);
        }
        LifecycleCoroutineScope lifecycleCoroutineScopeC = ye.a.f141789a.c(context);
        if (lifecycleCoroutineScopeC != null) {
            t(lifecycleCoroutineScopeC);
        } else {
            g gVarH = g.f74531b.H();
            if (gVarH != null) {
                gVarH.L("Create时获取LifecycleOwner失败");
            }
        }
        this.f75851e = new WeakReference<>(context);
    }

    public final void setEndTime(int i10) {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34984qi, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.d0(i10);
    }

    public final void setFillMode(boolean z10) {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.Ti, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.a0(z10);
    }

    public final void setGestureHandler(@e ze.b bVar) {
        this.f75855i = bVar;
    }

    public final void setOriginContainer(@e ViewGroup viewGroup) {
        this.f75856j = viewGroup;
    }

    public final void setPlayOnReady(boolean z10) {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.m.f34892mi, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.F(z10);
    }

    public final void setPlaybackStateChangeListener(@e xe.a aVar) {
        this.f75868v = aVar;
    }

    public final void setTargetStateChangeListener(@e xe.a aVar) {
        this.f75869w = aVar;
    }

    public final void setVideoRes(@e String str) {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.m.f34938oi, new Class[]{String.class}, Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.M(str);
    }

    public final void setVideoRes(@e String str, @e Map<String, String> map) {
        com.max.video.player.a player;
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, c.m.f34961pi, new Class[]{String.class, Map.class}, Void.TYPE).isSupported || (player = getPlayer()) == null) {
            return;
        }
        player.V(str, map);
    }

    public final void u() {
        this.f75853g = false;
    }

    public abstract boolean v(@d MotionEvent motionEvent);

    public final void w() {
        this.f75853g = true;
    }

    public final boolean x() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Si, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        com.max.video.player.a player = getPlayer();
        return (player != null ? player.s() : null) != null;
    }
}
