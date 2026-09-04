package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.b4;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @w0(16)
    public static final int f54513a = 768;

    /* JADX INFO: compiled from: ViewUtils.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54514b;

        a(View view) {
            this.f54514b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((InputMethodManager) this.f54514b.getContext().getSystemService("input_method")).showSoftInput(this.f54514b, 1);
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f54515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f54516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f54517c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f54518d;

        b(boolean z10, boolean z11, boolean z12, e eVar) {
            this.f54515a = z10;
            this.f54516b = z11;
            this.f54517c = z12;
            this.f54518d = eVar;
        }

        @Override // com.google.android.material.internal.j0.e
        @n0
        public n3 a(View view, @n0 n3 n3Var, @n0 f fVar) {
            if (this.f54515a) {
                fVar.f54524d += n3Var.o();
            }
            boolean zQ = j0.q(view);
            if (this.f54516b) {
                if (zQ) {
                    fVar.f54523c += n3Var.p();
                } else {
                    fVar.f54521a += n3Var.p();
                }
            }
            if (this.f54517c) {
                if (zQ) {
                    fVar.f54521a += n3Var.q();
                } else {
                    fVar.f54523c += n3Var.q();
                }
            }
            fVar.a(view);
            e eVar = this.f54518d;
            return eVar != null ? eVar.a(view, n3Var, fVar) : n3Var;
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class c implements z0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e f54519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f54520c;

        c(e eVar, f fVar) {
            this.f54519b = eVar;
            this.f54520c = fVar;
        }

        @Override // androidx.core.view.z0
        public n3 a(View view, n3 n3Var) {
            return this.f54519b.a(view, n3Var, new f(this.f54520c));
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public class d implements View.OnAttachStateChangeListener {
        d() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@n0 View view) {
            view.removeOnAttachStateChangeListener(this);
            j1.v1(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public interface e {
        n3 a(View view, n3 n3Var, f fVar);
    }

    /* JADX INFO: compiled from: ViewUtils.java */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f54521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f54522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f54523c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f54524d;

        public f(int i10, int i11, int i12, int i13) {
            this.f54521a = i10;
            this.f54522b = i11;
            this.f54523c = i12;
            this.f54524d = i13;
        }

        public f(@n0 f fVar) {
            this.f54521a = fVar.f54521a;
            this.f54522b = fVar.f54522b;
            this.f54523c = fVar.f54523c;
            this.f54524d = fVar.f54524d;
        }

        public void a(View view) {
            j1.d2(view, this.f54521a, this.f54522b, this.f54523c, this.f54524d);
        }
    }

    private j0() {
    }

    public static void a(@p0 View view, @n0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    @n0
    public static Rect b(@n0 View view) {
        return c(view, 0);
    }

    @n0
    public static Rect c(@n0 View view, int i10) {
        return new Rect(view.getLeft(), view.getTop() + i10, view.getRight(), view.getBottom() + i10);
    }

    public static void d(@n0 View view, @p0 AttributeSet attributeSet, int i10, int i11) {
        e(view, attributeSet, i10, i11, null);
    }

    public static void e(@n0 View view, @p0 AttributeSet attributeSet, int i10, int i11, @p0 e eVar) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.f52840h0, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        f(view, new b(z10, z11, z12, eVar));
    }

    public static void f(@n0 View view, @n0 e eVar) {
        j1.a2(view, new c(eVar, new f(j1.k0(view), view.getPaddingTop(), j1.j0(view), view.getPaddingBottom())));
        u(view);
    }

    public static float g(@n0 Context context, @androidx.annotation.r(unit = 0) int i10) {
        return TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    @p0
    public static Integer h(@n0 View view) {
        if (view.getBackground() instanceof ColorDrawable) {
            return Integer.valueOf(((ColorDrawable) view.getBackground()).getColor());
        }
        return null;
    }

    @n0
    public static List<View> i(@p0 View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                arrayList.add(viewGroup.getChildAt(i10));
            }
        }
        return arrayList;
    }

    @p0
    public static ViewGroup j(@p0 View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(android.R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @p0
    public static i0 k(@n0 View view) {
        return m(j(view));
    }

    @p0
    private static InputMethodManager l(@n0 View view) {
        return (InputMethodManager) androidx.core.content.d.o(view.getContext(), InputMethodManager.class);
    }

    @p0
    public static i0 m(@p0 View view) {
        if (view == null) {
            return null;
        }
        return new h0(view);
    }

    public static float n(@n0 View view) {
        float fR = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fR += j1.R((View) parent);
        }
        return fR;
    }

    public static void o(@n0 View view) {
        p(view, true);
    }

    public static void p(@n0 View view, boolean z10) {
        b4 b4VarB0;
        if (z10 && (b4VarB0 = j1.B0(view)) != null) {
            b4VarB0.d(n3.m.d());
            return;
        }
        InputMethodManager inputMethodManagerL = l(view);
        if (inputMethodManagerL != null) {
            inputMethodManagerL.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static boolean q(View view) {
        return j1.Z(view) == 1;
    }

    public static PorterDuff.Mode r(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void s(@p0 View view, @n0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            t(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void t(@n0 ViewTreeObserver viewTreeObserver, @n0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void u(@n0 View view) {
        if (j1.O0(view)) {
            j1.v1(view);
        } else {
            view.addOnAttachStateChangeListener(new d());
        }
    }

    public static void v(@n0 View view) {
        view.requestFocus();
        view.post(new a(view));
    }

    public static void w(@n0 View view, @n0 Rect rect) {
        view.setLeft(rect.left);
        view.setTop(rect.top);
        view.setRight(rect.right);
        view.setBottom(rect.bottom);
    }

    public static void x(@n0 View view) {
        y(view, true);
    }

    public static void y(@n0 View view, boolean z10) {
        b4 b4VarB0;
        if (!z10 || (b4VarB0 = j1.B0(view)) == null) {
            l(view).showSoftInput(view, 1);
        } else {
            b4VarB0.k(n3.m.d());
        }
    }
}
