package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.d0;
import androidx.annotation.e1;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import com.google.android.material.R;
import com.google.android.material.sidesheet.c;

/* JADX INFO: compiled from: SheetDialog.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class f<C extends c> extends androidx.appcompat.app.i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f55248n = R.id.coordinator;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f55249o = R.id.touch_outside;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private b<C> f55250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private FrameLayout f55251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private FrameLayout f55252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f55253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f55254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f55256m;

    /* JADX INFO: compiled from: SheetDialog.java */
    public class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            if (!f.this.f55254k) {
                a0Var.i1(false);
            } else {
                a0Var.a(1048576);
                a0Var.i1(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                f fVar = f.this;
                if (fVar.f55254k) {
                    fVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    f(@n0 Context context, @e1 int i10, @androidx.annotation.f int i11, @e1 int i12) {
        super(context, u(context, i10, i11, i12));
        this.f55254k = true;
        this.f55255l = true;
        j(1);
    }

    private void m() {
        if (this.f55251h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), r(), null);
            this.f55251h = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(q());
            this.f55252i = frameLayout2;
            b<C> bVarO = o(frameLayout2);
            this.f55250g = bVarO;
            l(bVarO);
        }
    }

    @n0
    private FrameLayout p() {
        if (this.f55251h == null) {
            m();
        }
        return this.f55251h;
    }

    @n0
    private FrameLayout s() {
        if (this.f55252i == null) {
            m();
        }
        return this.f55252i;
    }

    private static int u(@n0 Context context, @e1 int i10, @androidx.annotation.f int i11, @e1 int i12) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i11, typedValue, true) ? typedValue.resourceId : i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        if (this.f55254k && isShowing() && y()) {
            cancel();
        }
    }

    private boolean y() {
        if (!this.f55256m) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.f55255l = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f55256m = true;
        }
        return this.f55255l;
    }

    private View z(int i10, @p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        m();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) p().findViewById(f55248n);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayoutS = s();
        frameLayoutS.removeAllViews();
        if (layoutParams == null) {
            frameLayoutS.addView(view);
        } else {
            frameLayoutS.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f55249o).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f55247b.w(view2);
            }
        });
        j1.B1(s(), new a());
        return this.f55251h;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        b<C> bVarN = n();
        if (!this.f55253j || bVarN.getState() == 5) {
            super.cancel();
        } else {
            bVarN.c(5);
        }
    }

    abstract void l(b<C> bVar);

    @n0
    b<C> n() {
        if (this.f55250g == null) {
            m();
        }
        return this.f55250g;
    }

    @n0
    abstract b<C> o(@n0 FrameLayout frameLayout);

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    protected void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.activity.k, android.app.Dialog
    protected void onStart() {
        super.onStart();
        b<C> bVar = this.f55250g;
        if (bVar == null || bVar.getState() != 5) {
            return;
        }
        this.f55250g.c(t());
    }

    @d0
    abstract int q();

    @i0
    abstract int r();

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f55254k != z10) {
            this.f55254k = z10;
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f55254k) {
            this.f55254k = true;
        }
        this.f55255l = z10;
        this.f55256m = true;
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public void setContentView(@i0 int i10) {
        super.setContentView(z(i10, null, null));
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public void setContentView(@p0 View view) {
        super.setContentView(z(0, view, null));
    }

    @Override // androidx.appcompat.app.i, androidx.activity.k, android.app.Dialog
    public void setContentView(@p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(z(0, view, layoutParams));
    }

    abstract int t();

    public boolean v() {
        return this.f55253j;
    }

    public void x(boolean z10) {
        this.f55253j = z10;
    }
}
