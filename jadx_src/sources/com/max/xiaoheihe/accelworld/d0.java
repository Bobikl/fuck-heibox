package com.max.xiaoheihe.accelworld;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.h0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: QMUIWindowInsetHelper.java */
/* JADX INFO: loaded from: classes3.dex */
public class d0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f76744a = new c() { // from class: com.max.xiaoheihe.accelworld.x
        @Override // com.max.xiaoheihe.accelworld.d0.c
        public final void a(View view, h0 h0Var) {
            d0.o(view, h0Var);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f76745b = new c() { // from class: com.max.xiaoheihe.accelworld.y
        @Override // com.max.xiaoheihe.accelworld.d0.c
        public final void a(View view, h0 h0Var) {
            d0.p(view, h0Var);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f76746c = new c() { // from class: com.max.xiaoheihe.accelworld.z
        @Override // com.max.xiaoheihe.accelworld.d0.c
        public final void a(View view, h0 h0Var) {
            d0.q(view, h0Var);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f76747d = new c() { // from class: com.max.xiaoheihe.accelworld.a0
        @Override // com.max.xiaoheihe.accelworld.d0.c
        public final void a(View view, h0 h0Var) {
            d0.r(view, h0Var);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z0 f76748e = new z0() { // from class: com.max.xiaoheihe.accelworld.b0
        @Override // androidx.core.view.z0
        public final n3 a(View view, n3 n3Var) {
            return d0.s(view, n3Var);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final z0 f76749f = new z0() { // from class: com.max.xiaoheihe.accelworld.c0
        @Override // androidx.core.view.z0
        public final n3 a(View view, n3 n3Var) {
            return d0.t(view, n3Var);
        }
    };

    /* JADX INFO: compiled from: QMUIWindowInsetHelper.java */
    public class a implements z0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f76750b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f76751c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f76752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f76753e;

        a(boolean z10, int i10, c cVar, boolean z11) {
            this.f76750b = z10;
            this.f76751c = i10;
            this.f76752d = cVar;
            this.f76753e = z11;
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, n3Var}, this, changeQuickRedirect, false, bb.c.m.xE, new Class[]{View.class, n3.class}, n3.class);
            if (patchProxyResultProxy.isSupported) {
                return (n3) patchProxyResultProxy.result;
            }
            Log.d("InsetHelper-dbg", "[onApplyWindowInsets] insets: " + n3Var);
            if (view.getFitsSystemWindows()) {
                this.f76752d.a(view, this.f76750b ? n3Var.g(this.f76751c) : n3Var.f(this.f76751c));
                if (this.f76753e) {
                    return n3.f21708c;
                }
            }
            return n3Var;
        }
    }

    /* JADX INFO: compiled from: QMUIWindowInsetHelper.java */
    public class b implements View.OnApplyWindowInsetsListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        n3 f76754a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        WindowInsets f76755b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f76756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f76757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ z0 f76758e;

        b(View view, boolean z10, z0 z0Var) {
            this.f76756c = view;
            this.f76757d = z10;
            this.f76758e = z0Var;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            boolean z10 = false;
            boolean z11 = true;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, windowInsets}, this, changeQuickRedirect, false, bb.c.m.yE, new Class[]{View.class, WindowInsets.class}, WindowInsets.class);
            if (patchProxyResultProxy.isSupported) {
                return (WindowInsets) patchProxyResultProxy.result;
            }
            n3 n3VarL = n3.L(windowInsets, view);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 30) {
                d0.g(windowInsets, this.f76756c);
                if (!n3VarL.equals(this.f76754a)) {
                    z10 = true;
                } else if (this.f76757d) {
                    return this.f76755b;
                }
                this.f76754a = n3VarL;
                z11 = z10;
            }
            n3 n3VarA = this.f76758e.a(view, n3VarL);
            if (i10 >= 30) {
                return n3VarA.J();
            }
            if (z11) {
                j1.v1(view);
            }
            WindowInsets windowInsetsJ = n3VarA.J();
            this.f76755b = windowInsetsJ;
            return windowInsetsJ;
        }
    }

    /* JADX INFO: compiled from: QMUIWindowInsetHelper.java */
    public interface c {
        void a(View view, h0 h0Var);
    }

    static /* synthetic */ void g(WindowInsets windowInsets, View view) {
        if (PatchProxy.proxy(new Object[]{windowInsets, view}, null, changeQuickRedirect, true, bb.c.m.wE, new Class[]{WindowInsets.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        i(windowInsets, view);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0087 A[PHI: r0 r1
  0x0087: PHI (r0v8 int) = (r0v5 int), (r0v10 int) binds: [B:42:0x0080, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r1v6 int) = (r1v3 int), (r1v8 int) binds: [B:42:0x0080, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[PHI: r0 r1 r10
  0x0088: PHI (r0v7 int) = (r0v5 int), (r0v5 int), (r0v8 int), (r0v10 int), (r0v10 int) binds: [B:40:0x007a, B:44:0x0084, B:46:0x0087, B:17:0x004c, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r1v5 int) = (r1v3 int), (r1v3 int), (r1v6 int), (r1v8 int), (r1v8 int) binds: [B:40:0x007a, B:44:0x0084, B:46:0x0087, B:17:0x004c, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r10v2 int) = (r10v1 int), (r10v1 int), (r10v3 int), (r10v1 int), (r10v1 int) binds: [B:40:0x007a, B:44:0x0084, B:46:0x0087, B:17:0x004c, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    public static h0 h(View view, h0 h0Var) {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, h0Var}, null, changeQuickRedirect, true, bb.c.m.rE, new Class[]{View.class, h0.class}, h0.class);
        if (patchProxyResultProxy.isSupported) {
            return (h0) patchProxyResultProxy.result;
        }
        int i11 = h0Var.f20742a;
        int i12 = h0Var.f20744c;
        int i13 = h0Var.f20743b;
        int i14 = h0Var.f20745d;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            if (((ViewGroup.MarginLayoutParams) layoutParams2).width == -2) {
                if (layoutParams2.f19292d == 0) {
                    i12 = 0;
                } else if (layoutParams2.f19298g == 0) {
                    i11 = 0;
                }
            }
            if (((ViewGroup.MarginLayoutParams) layoutParams2).height != -2) {
                i10 = i13;
            } else {
                if (layoutParams2.f19300h == 0) {
                    i14 = 0;
                } else if (layoutParams2.f19306k != 0) {
                }
                i10 = i13;
            }
        } else {
            int i15 = layoutParams instanceof FrameLayout.LayoutParams ? ((FrameLayout.LayoutParams) layoutParams).gravity : -1;
            if (i15 == -1) {
                i15 = 51;
            }
            if (layoutParams.width != -1) {
                int i16 = i15 & 7;
                if (i16 == 3) {
                    i12 = 0;
                } else if (i16 == 5) {
                    i11 = 0;
                }
            }
            if (layoutParams.height == -1) {
                i10 = i13;
            } else {
                int i17 = i15 & 112;
                if (i17 == 48) {
                    i14 = 0;
                } else if (i17 != 80) {
                }
                i10 = i13;
            }
        }
        return h0.d(i11, i10, i12, i14);
    }

    private static void i(@n0 WindowInsets windowInsets, @n0 View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        if (PatchProxy.proxy(new Object[]{windowInsets, view}, null, changeQuickRedirect, true, bb.c.m.qE, new Class[]{WindowInsets.class, View.class}, Void.TYPE).isSupported || (onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback)) == null) {
            return;
        }
        onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
    }

    public static void j(View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.m.iE, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        l(view, i10, false);
    }

    public static void k(View view, int i10, @n0 c cVar, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {view, new Integer(i10), cVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.mE, new Class[]{View.class, Integer.TYPE, c.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        v(view, new a(z11, i10, cVar, z12), z10);
    }

    public static void l(View view, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.jE, new Class[]{View.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        m(view, i10, z10, false);
    }

    public static void m(View view, int i10, boolean z10, boolean z11) {
        Object[] objArr = {view, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.kE, new Class[]{View.class, Integer.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        k(view, i10, f76747d, z10, z11, false);
    }

    public static void n(View view, int i10, boolean z10, boolean z11, boolean z12) {
        Object[] objArr = {view, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), new Byte(z12 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, bb.c.m.lE, new Class[]{View.class, Integer.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        k(view, i10, f76747d, z10, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void o(View view, h0 h0Var) {
        if (PatchProxy.proxy(new Object[]{view, h0Var}, null, changeQuickRedirect, true, bb.c.m.vE, new Class[]{View.class, h0.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setPadding(h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, h0Var.f20745d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void p(View view, h0 h0Var) {
        if (PatchProxy.proxy(new Object[]{view, h0Var}, null, changeQuickRedirect, true, bb.c.m.uE, new Class[]{View.class, h0.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setPadding(h0Var.f20742a, h0Var.f20743b, h0Var.f20744c, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void q(View view, h0 h0Var) {
        if (PatchProxy.proxy(new Object[]{view, h0Var}, null, changeQuickRedirect, true, bb.c.m.tE, new Class[]{View.class, h0.class}, Void.TYPE).isSupported) {
            return;
        }
        view.setPadding(h0Var.f20742a, 0, h0Var.f20744c, h0Var.f20745d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(View view, h0 h0Var) {
        if (PatchProxy.proxy(new Object[]{view, h0Var}, null, changeQuickRedirect, true, bb.c.m.sE, new Class[]{View.class, h0.class}, Void.TYPE).isSupported) {
            return;
        }
        h0 h0VarH = h(view, h0Var);
        view.setPadding(h0VarH.f20742a, h0VarH.f20743b, h0VarH.f20744c, h0VarH.f20745d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ n3 s(View view, n3 n3Var) {
        return n3.f21708c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ n3 t(View view, n3 n3Var) {
        return n3Var;
    }

    public static void u(View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.m.oE, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        v(view, f76749f, false);
    }

    public static void v(@n0 View view, @p0 z0 z0Var, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, z0Var, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.pE, new Class[]{View.class, z0.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, z0Var);
        }
        if (z0Var == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new b(view, z10, z0Var));
        }
    }

    public static void w(View view) {
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.m.nE, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        v(view, f76748e, true);
    }
}
