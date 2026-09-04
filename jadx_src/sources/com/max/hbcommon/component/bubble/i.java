package com.max.hbcommon.component.bubble;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.k0;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;

/* JADX INFO: compiled from: BubbleTipPopup.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f67389a = R.attr.popupWindowStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f67390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f67391c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f67392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f67393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f67394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f67395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f67396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f67397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f67398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f67399k;

    static {
        int i10 = R.color.text_primary_1_color_alpha90;
        f67390b = i10;
        f67391c = R.color.background_layer_2_color;
        f67392d = R.dimen.bubbletip_popup_text_size;
        f67393e = i10;
        f67394f = R.dimen.bubbletip_popup_margin;
        f67395g = R.dimen.bubbletip_popup_padding;
        f67396h = R.dimen.bubbletip_popup_animation_padding;
        f67397i = 1200L;
        f67398j = R.dimen.bubbletip_popup_arrow_width;
        f67399k = R.dimen.bubbletip_popup_arrow_height;
    }

    @dl.d
    public static final RectF a(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.d.Jl, new Class[]{View.class}, RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        f0.p(view, "view");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], i10 + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    @dl.d
    public static final RectF b(@dl.d View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.d.Ql, new Class[]{View.class}, RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        f0.p(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        return new RectF(i10, iArr[1], i10 + view.getMeasuredWidth(), iArr[1] + view.getMeasuredHeight());
    }

    @k0
    public static final /* synthetic */ BubbleTipPopup c(Context context, l<? super BubbleTipPopup.a, b2> block) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, block}, null, changeQuickRedirect, true, bb.c.d.Rl, new Class[]{Context.class, l.class}, BubbleTipPopup.class);
        if (patchProxyResultProxy.isSupported) {
            return (BubbleTipPopup) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(block, "block");
        BubbleTipPopup.a aVar = new BubbleTipPopup.a(context);
        block.invoke(aVar);
        return aVar.r();
    }

    @dl.e
    public static final ViewGroup d(@dl.e View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.d.Pl, new Class[]{View.class}, ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        f0.n(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        if (viewGroup.getChildCount() != 1 || !(viewGroup.getChildAt(0) instanceof FrameLayout)) {
            return viewGroup;
        }
        View childAt = viewGroup.getChildAt(0);
        f0.n(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) childAt;
    }

    public static final long e() {
        return f67397i;
    }

    public static final int f() {
        return f67396h;
    }

    public static final int g() {
        return f67393e;
    }

    public static final int h() {
        return f67399k;
    }

    public static final int i() {
        return f67398j;
    }

    public static final int j() {
        return f67390b;
    }

    public static final int k() {
        return f67394f;
    }

    public static final int l() {
        return f67395g;
    }

    public static final int m() {
        return f67389a;
    }

    public static final int n() {
        return f67391c;
    }

    public static final int o() {
        return f67392d;
    }

    public static final void p(@dl.d View view, @dl.e ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (PatchProxy.proxy(new Object[]{view, onGlobalLayoutListener}, null, changeQuickRedirect, true, bb.c.d.Ol, new Class[]{View.class, ViewTreeObserver.OnGlobalLayoutListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        view.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static final void q(@dl.d View view, float f10) {
        if (PatchProxy.proxy(new Object[]{view, new Float(f10)}, null, changeQuickRedirect, true, bb.c.d.Kl, new Class[]{View.class, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams((int) f10, view.getHeight());
        } else {
            layoutParams.width = (int) f10;
        }
        view.setLayoutParams(layoutParams);
    }

    public static final void r(@dl.d View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.Ml, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        view.setX(i10);
    }

    public static final void s(@dl.d View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.d.Nl, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        view.setY(i10);
    }

    public static final int t(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.d.Ll, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (i10 == 17) {
            return 1;
        }
        if (i10 == 48) {
            return 3;
        }
        if (i10 == 80) {
            return 1;
        }
        if (i10 == 8388611) {
            return 2;
        }
        if (i10 == 8388613) {
            return 0;
        }
        throw new IllegalArgumentException("Gravity must have be CENTER, START, END, TOP or BOTTOM.");
    }
}
