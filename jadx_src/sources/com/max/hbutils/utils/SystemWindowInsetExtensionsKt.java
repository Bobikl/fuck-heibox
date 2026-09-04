package com.max.hbutils.utils;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SystemWindowInsetExtensions.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class SystemWindowInsetExtensionsKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: SystemWindowInsetExtensions.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View v10) {
            if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, bb.c.k.Es, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
            v10.removeOnAttachStateChangeListener(this);
            v10.requestApplyInsets();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View v10) {
            if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, bb.c.k.Fs, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
        }
    }

    public static final void b(@dl.d final View view, final int i10, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final boolean z17) {
        Object[] objArr = {view, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0), new Byte(z13 ? (byte) 1 : (byte) 0), new Byte(z14 ? (byte) 1 : (byte) 0), new Byte(z15 ? (byte) 1 : (byte) 0), new Byte(z16 ? (byte) 1 : (byte) 0), new Byte(z17 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.zs, new Class[]{View.class, Integer.TYPE, cls, cls, cls, cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        d(view, new yh.r<View, n3, g, f, b2>() { // from class: com.max.hbutils.utils.SystemWindowInsetExtensionsKt$applySystemWindows$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.r
            public /* bridge */ /* synthetic */ b2 U0(View view2, n3 n3Var, g gVar, f fVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view2, n3Var, gVar, fVar}, this, changeQuickRedirect, false, bb.c.k.Ds, new Class[]{Object.class, Object.class, Object.class, Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(view2, n3Var, gVar, fVar);
                return b2.f124493a;
            }

            public final void a(@dl.d View view2, @dl.d n3 insets, @dl.d g initialPadding, @dl.d f initialMargin) {
                if (PatchProxy.proxy(new Object[]{view2, insets, initialPadding, initialMargin}, this, changeQuickRedirect, false, bb.c.k.Cs, new Class[]{View.class, n3.class, g.class, f.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(view2, "view");
                f0.p(insets, "insets");
                f0.p(initialPadding, "initialPadding");
                f0.p(initialMargin, "initialMargin");
                int i11 = z10 ? insets.f(i10).f20742a : 0;
                int i12 = z11 ? insets.f(i10).f20743b : 0;
                int i13 = z12 ? insets.f(i10).f20744c : 0;
                int i14 = z13 ? insets.f(i10).f20745d : 0;
                int i15 = z14 ? insets.f(i10).f20742a : 0;
                int i16 = z15 ? insets.f(i10).f20743b : 0;
                int i17 = z16 ? insets.f(i10).f20744c : 0;
                int i18 = z17 ? insets.f(i10).f20745d : 0;
                view2.setPadding(initialPadding.h() + i11, initialPadding.j() + i12, initialPadding.i() + i13, initialPadding.g() + i14);
                if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                    View view3 = view;
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = initialMargin.h() + i15;
                    marginLayoutParams.topMargin = initialMargin.j() + i16;
                    marginLayoutParams.rightMargin = initialMargin.i() + i17;
                    marginLayoutParams.bottomMargin = initialMargin.g() + i18;
                    view3.setLayoutParams(marginLayoutParams);
                    if (Build.VERSION.SDK_INT < 26) {
                        view2.getParent().requestLayout();
                    }
                }
            }
        });
    }

    public static /* synthetic */ void c(View view, int i10, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i11, Object obj) {
        boolean z18 = z10;
        boolean z19 = z11;
        boolean z20 = z12;
        boolean z21 = z13;
        boolean z22 = z14;
        Object[] objArr = {view, new Integer(i10), new Byte(z18 ? (byte) 1 : (byte) 0), new Byte(z19 ? (byte) 1 : (byte) 0), new Byte(z20 ? (byte) 1 : (byte) 0), new Byte(z21 ? (byte) 1 : (byte) 0), new Byte(z22 ? (byte) 1 : (byte) 0), new Byte(z15 ? (byte) 1 : (byte) 0), new Byte(z16 ? (byte) 1 : (byte) 0), new Byte(z17 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.k.As, new Class[]{View.class, cls, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls2, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            z18 = false;
        }
        if ((i11 & 4) != 0) {
            z19 = false;
        }
        if ((i11 & 8) != 0) {
            z20 = false;
        }
        if ((i11 & 16) != 0) {
            z21 = false;
        }
        if ((i11 & 32) != 0) {
            z22 = false;
        }
        b(view, i10, z18, z19, z20, z21, z22, (i11 & 64) != 0 ? false : z15 ? 1 : 0, (i11 & 128) != 0 ? false : z16 ? 1 : 0, (i11 & 256) == 0 ? z17 ? 1 : 0 : false);
    }

    public static final void d(@dl.d View view, @dl.d final yh.r<? super View, ? super n3, ? super g, ? super f, b2> function) {
        if (PatchProxy.proxy(new Object[]{view, function}, null, changeQuickRedirect, true, bb.c.k.ws, new Class[]{View.class, yh.r.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        f0.p(function, "function");
        final g gVarG = g(view);
        final f fVarF = f(view);
        j1.a2(view, new z0() { // from class: com.max.hbutils.utils.v
            @Override // androidx.core.view.z0
            public final n3 a(View view2, n3 n3Var) {
                return SystemWindowInsetExtensionsKt.e(function, gVarG, fVarF, view2, n3Var);
            }
        });
        h(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n3 e(yh.r function, g initialPadding, f initialMargin, View view, n3 windowInsets) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{function, initialPadding, initialMargin, view, windowInsets}, null, changeQuickRedirect, true, bb.c.k.Bs, new Class[]{yh.r.class, g.class, f.class, View.class, n3.class}, n3.class);
        if (patchProxyResultProxy.isSupported) {
            return (n3) patchProxyResultProxy.result;
        }
        f0.p(function, "$function");
        f0.p(initialPadding, "$initialPadding");
        f0.p(initialMargin, "$initialMargin");
        f0.p(view, "view");
        f0.p(windowInsets, "windowInsets");
        function.U0(view, windowInsets, initialPadding, initialMargin);
        return windowInsets;
    }

    private static final f f(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.ys, new Class[]{View.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new f(0, 0, 0, 0);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return new f(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }

    private static final g g(View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.xs, new Class[]{View.class}, g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : new g(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void h(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.vs, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new a());
        }
    }
}
