package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.appcompat.app.i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a0;
import androidx.core.view.g3;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.google.android.material.R;
import com.google.android.material.color.m;
import com.google.android.material.shape.k;

/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f53322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FrameLayout f53323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CoordinatorLayout f53324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private FrameLayout f53325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f53326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f53327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f53328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f53329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private f f53330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f53331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @n0
    private BottomSheetBehavior.f f53332q;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class C0417a implements z0 {
        C0417a() {
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            if (a.this.f53330o != null) {
                a.this.f53322g.P0(a.this.f53330o);
            }
            if (n3Var != null) {
                a aVar = a.this;
                aVar.f53330o = new f(aVar.f53325j, n3Var, null);
                a.this.f53330o.e(a.this.getWindow());
                a.this.f53322g.d0(a.this.f53330o);
            }
            return n3Var;
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            if (aVar.f53327l && aVar.isShowing() && a.this.v()) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            if (!a.this.f53327l) {
                a0Var.i1(false);
            } else {
                a0Var.a(1048576);
                a0Var.i1(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                a aVar = a.this;
                if (aVar.f53327l) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class e extends BottomSheetBehavior.f {
        e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@n0 View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@n0 View view, int i10) {
            if (i10 == 5) {
                a.this.cancel();
            }
        }
    }

    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public static class f extends BottomSheetBehavior.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Boolean f53338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final n3 f53339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Window f53340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f53341d;

        private f(@n0 View view, @n0 n3 n3Var) {
            this.f53339b = n3Var;
            k kVarX0 = BottomSheetBehavior.r0(view).x0();
            ColorStateList colorStateListY = kVarX0 != null ? kVarX0.y() : j1.N(view);
            if (colorStateListY != null) {
                this.f53338a = Boolean.valueOf(m.m(colorStateListY.getDefaultColor()));
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f53338a = Boolean.valueOf(m.m(((ColorDrawable) view.getBackground()).getColor()));
            } else {
                this.f53338a = null;
            }
        }

        /* synthetic */ f(View view, n3 n3Var, C0417a c0417a) {
            this(view, n3Var);
        }

        private void d(View view) {
            if (view.getTop() < this.f53339b.r()) {
                Window window = this.f53340c;
                if (window != null) {
                    Boolean bool = this.f53338a;
                    com.google.android.material.internal.e.g(window, bool == null ? this.f53341d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f53339b.r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f53340c;
                if (window2 != null) {
                    com.google.android.material.internal.e.g(window2, this.f53341d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        void a(@n0 View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@n0 View view, float f10) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@n0 View view, int i10) {
            d(view);
        }

        void e(@p0 Window window) {
            if (this.f53340c == window) {
                return;
            }
            this.f53340c = window;
            if (window != null) {
                this.f53341d = g3.a(window, window.getDecorView()).f();
            }
        }
    }

    public a(@n0 Context context) {
        this(context, 0);
        this.f53331p = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    public a(@n0 Context context, @e1 int i10) {
        super(context, h(context, i10));
        this.f53327l = true;
        this.f53328m = true;
        this.f53332q = new e();
        j(1);
        this.f53331p = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    protected a(@n0 Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.f53327l = true;
        this.f53328m = true;
        this.f53332q = new e();
        j(1);
        this.f53327l = z10;
        this.f53331p = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge}).getBoolean(0, false);
    }

    private static int h(@n0 Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
    }

    private FrameLayout o() {
        if (this.f53323h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f53323h = frameLayout;
            this.f53324i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f53323h.findViewById(R.id.design_bottom_sheet);
            this.f53325j = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorR0 = BottomSheetBehavior.r0(frameLayout2);
            this.f53322g = bottomSheetBehaviorR0;
            bottomSheetBehaviorR0.d0(this.f53332q);
            this.f53322g.c1(this.f53327l);
        }
        return this.f53323h;
    }

    @Deprecated
    public static void u(@n0 View view, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private View w(int i10, @p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        o();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f53323h.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f53331p) {
            j1.a2(this.f53325j, new C0417a());
        }
        this.f53325j.removeAllViews();
        if (layoutParams == null) {
            this.f53325j.addView(view);
        } else {
            this.f53325j.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new b());
        j1.B1(this.f53325j, new c());
        this.f53325j.setOnTouchListener(new d());
        return this.f53323h;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorP = p();
        if (!this.f53326k || bottomSheetBehaviorP.getState() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorP.c(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f53331p && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f53323h;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f53324i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            g3.c(window, !z10);
            f fVar = this.f53330o;
            if (fVar != null) {
                fVar.e(window);
            }
        }
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        f fVar = this.f53330o;
        if (fVar != null) {
            fVar.e(null);
        }
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f53322g;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f53322g.c(4);
    }

    @n0
    public BottomSheetBehavior<FrameLayout> p() {
        if (this.f53322g == null) {
            o();
        }
        return this.f53322g;
    }

    public boolean q() {
        return this.f53326k;
    }

    public boolean r() {
        return this.f53331p;
    }

    void s() {
        this.f53322g.P0(this.f53332q);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f53327l != z10) {
            this.f53327l = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f53322g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.c1(z10);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f53327l) {
            this.f53327l = true;
        }
        this.f53328m = z10;
        this.f53329n = true;
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public void setContentView(@i0 int i10) {
        super.setContentView(w(i10, null, null));
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(w(0, view, null));
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(w(0, view, layoutParams));
    }

    public void t(boolean z10) {
        this.f53326k = z10;
    }

    boolean v() {
        if (!this.f53329n) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f53328m = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f53329n = true;
        }
        return this.f53328m;
    }
}
