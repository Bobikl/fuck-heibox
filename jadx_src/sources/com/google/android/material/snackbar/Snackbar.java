package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;

/* JADX INFO: loaded from: classes7.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    private static final int[] W;
    private static final int[] X;

    @p0
    private final AccessibilityManager T;
    private boolean U;

    @p0
    private BaseTransientBottomBar.s<Snackbar> V;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@p0 Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@p0 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@p0 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@p0 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public static class a extends BaseTransientBottomBar.s<Snackbar> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f55396f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f55397g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f55398h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f55399i = 3;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f55400j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i10) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i10 = R.attr.snackbarButtonStyle;
        W = new int[]{i10};
        X = new int[]{i10, R.attr.snackbarTextViewStyle};
    }

    private Snackbar(@n0 Context context, @n0 ViewGroup viewGroup, @n0 View view, @n0 com.google.android.material.snackbar.a aVar) {
        super(context, viewGroup, view, aVar);
        this.T = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    private static boolean A0(@n0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(X);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        B(1);
    }

    @n0
    public static Snackbar C0(@n0 Context context, @n0 View view, @n0 CharSequence charSequence, int i10) {
        return F0(context, view, charSequence, i10);
    }

    @n0
    public static Snackbar D0(@n0 View view, @d1 int i10, int i11) {
        return E0(view, view.getResources().getText(i10), i11);
    }

    @n0
    public static Snackbar E0(@n0 View view, @n0 CharSequence charSequence, int i10) {
        return F0(null, view, charSequence, i10);
    }

    @n0
    private static Snackbar F0(@p0 Context context, @n0 View view, @n0 CharSequence charSequence, int i10) {
        ViewGroup viewGroupV0 = v0(view);
        if (viewGroupV0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupV0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(A0(context) ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroupV0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupV0, snackbarContentLayout, snackbarContentLayout);
        snackbar.Q0(charSequence);
        snackbar.h0(i10);
        return snackbar;
    }

    @p0
    private static ViewGroup v0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private Button w0() {
        return x0().getActionView();
    }

    private SnackbarContentLayout x0() {
        return (SnackbarContentLayout) this.f55337i.getChildAt(0);
    }

    private TextView y0() {
        return x0().getMessageView();
    }

    @Deprecated
    protected static boolean z0(@n0 Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(W);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void A() {
        super.A();
    }

    @s9.a
    @n0
    public Snackbar G0(@d1 int i10, View.OnClickListener onClickListener) {
        return H0(G().getText(i10), onClickListener);
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int H() {
        int iH = super.H();
        if (iH == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.T.getRecommendedTimeoutMillis(iH, (this.U ? 4 : 0) | 1 | 2);
        }
        if (this.U && this.T.isTouchExplorationEnabled()) {
            return -2;
        }
        return iH;
    }

    @s9.a
    @n0
    public Snackbar H0(@p0 CharSequence charSequence, @p0 final View.OnClickListener onClickListener) {
        Button buttonW0 = w0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonW0.setVisibility(8);
            buttonW0.setOnClickListener(null);
            this.U = false;
        } else {
            this.U = true;
            buttonW0.setVisibility(0);
            buttonW0.setText(charSequence);
            buttonW0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.snackbar.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f55405b.B0(onClickListener, view);
                }
            });
        }
        return this;
    }

    @s9.a
    @n0
    public Snackbar I0(@l int i10) {
        w0().setTextColor(i10);
        return this;
    }

    @s9.a
    @n0
    public Snackbar J0(ColorStateList colorStateList) {
        w0().setTextColor(colorStateList);
        return this;
    }

    @s9.a
    @n0
    public Snackbar K0(@l int i10) {
        return L0(ColorStateList.valueOf(i10));
    }

    @s9.a
    @n0
    public Snackbar L0(@p0 ColorStateList colorStateList) {
        this.f55337i.setBackgroundTintList(colorStateList);
        return this;
    }

    @s9.a
    @n0
    public Snackbar M0(@p0 PorterDuff.Mode mode) {
        this.f55337i.setBackgroundTintMode(mode);
        return this;
    }

    @s9.a
    @n0
    @Deprecated
    public Snackbar N0(@p0 a aVar) {
        BaseTransientBottomBar.s<Snackbar> sVar = this.V;
        if (sVar != null) {
            b0(sVar);
        }
        if (aVar != null) {
            u(aVar);
        }
        this.V = aVar;
        return this;
    }

    @s9.a
    @n0
    public Snackbar O0(@r int i10) {
        x0().setMaxInlineActionWidth(i10);
        return this;
    }

    @s9.a
    @n0
    public Snackbar P0(@d1 int i10) {
        return Q0(G().getText(i10));
    }

    @s9.a
    @n0
    public Snackbar Q0(@n0 CharSequence charSequence) {
        y0().setText(charSequence);
        return this;
    }

    @s9.a
    @n0
    public Snackbar R0(@l int i10) {
        y0().setTextColor(i10);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean S() {
        return super.S();
    }

    @s9.a
    @n0
    public Snackbar S0(ColorStateList colorStateList) {
        y0().setTextColor(colorStateList);
        return this;
    }

    @s9.a
    @n0
    public Snackbar T0(int i10) {
        y0().setMaxLines(i10);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void m0() {
        super.m0();
    }
}
