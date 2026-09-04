package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.annotation.d0;
import androidx.annotation.f0;
import androidx.annotation.i0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.a0;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.core.view.z0;
import com.google.android.material.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.internal.k0;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = -2;
    public static final int D = -1;
    public static final int E = 0;
    static final int F = 250;
    static final int G = 180;
    private static final int I = 150;
    private static final int J = 75;
    private static final float M = 0.8f;
    static final int O = 0;
    static final int P = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f55331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f55332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f55333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f55334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    private final ViewGroup f55335g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f55336h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    protected final SnackbarBaseLayout f55337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    private final com.google.android.material.snackbar.a f55338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55339k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f55340l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private q f55341m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f55342n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @w0(29)
    private final Runnable f55343o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f55344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f55345q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f55346r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f55347s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f55348t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f55349u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f55350v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<s<B>> f55351w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Behavior f55352x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @p0
    private final AccessibilityManager f55353y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @n0
    com.google.android.material.snackbar.c.b f55354z;
    private static final TimeInterpolator H = com.google.android.material.animation.b.f52897b;
    private static final TimeInterpolator K = com.google.android.material.animation.b.f52896a;
    private static final TimeInterpolator L = com.google.android.material.animation.b.f52899d;
    private static final boolean Q = false;
    private static final int[] R = {R.attr.snackbarStyle};
    private static final String S = BaseTransientBottomBar.class.getSimpleName();

    @n0
    static final Handler N = new Handler(Looper.getMainLooper(), new h());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @n0
        private final t f55355z = new t(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(@n0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f55355z.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean K(View view) {
            return this.f55355z.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean o(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 MotionEvent motionEvent) {
            this.f55355z.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class SnackbarBaseLayout extends FrameLayout {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final View.OnTouchListener f55356m = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private BaseTransientBottomBar<?> f55357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        com.google.android.material.shape.p f55358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f55359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f55360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f55361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f55362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f55363h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ColorStateList f55364i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private PorterDuff.Mode f55365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        private Rect f55366k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f55367l;

        public class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected SnackbarBaseLayout(@n0 Context context) {
            this(context, null);
        }

        protected SnackbarBaseLayout(@n0 Context context, AttributeSet attributeSet) {
            super(j9.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.f52865p1);
            int i10 = R.styleable.SnackbarLayout_elevation;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                j1.N1(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f55359d = typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_animationMode, 0);
            if (typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_shapeAppearanceOverlay)) {
                this.f55358c = com.google.android.material.shape.p.e(context2, attributeSet, 0, 0).m();
            }
            this.f55360e = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
            setBackgroundTintList(com.google.android.material.resources.c.a(context2, typedArrayObtainStyledAttributes, R.styleable.SnackbarLayout_backgroundTint));
            setBackgroundTintMode(j0.r(typedArrayObtainStyledAttributes.getInt(R.styleable.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
            this.f55361f = typedArrayObtainStyledAttributes.getFloat(R.styleable.SnackbarLayout_actionTextColorAlpha, 1.0f);
            this.f55362g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.f55363h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f55356m);
            setFocusable(true);
            if (getBackground() == null) {
                j1.I1(this, d());
            }
        }

        @n0
        private Drawable d() {
            int iQ = com.google.android.material.color.m.q(this, R.attr.colorSurface, R.attr.colorOnSurface, getBackgroundOverlayColorAlpha());
            com.google.android.material.shape.p pVar = this.f55358c;
            Drawable drawableZ = pVar != null ? BaseTransientBottomBar.z(iQ, pVar) : BaseTransientBottomBar.y(iQ, getResources());
            if (this.f55364i == null) {
                return androidx.core.graphics.drawable.d.r(drawableZ);
            }
            Drawable drawableR = androidx.core.graphics.drawable.d.r(drawableZ);
            androidx.core.graphics.drawable.d.o(drawableR, this.f55364i);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f55366k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f55357b = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f55367l = true;
            viewGroup.addView(this);
            this.f55367l = false;
        }

        float getActionTextColorAlpha() {
            return this.f55361f;
        }

        int getAnimationMode() {
            return this.f55359d;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f55360e;
        }

        int getMaxInlineActionWidth() {
            return this.f55363h;
        }

        int getMaxWidth() {
            return this.f55362g;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f55357b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.V();
            }
            j1.v1(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f55357b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.W();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f55357b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.X();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f55362g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f55362g;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f55359d = i10;
        }

        @Override // android.view.View
        public void setBackground(@p0 Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@p0 Drawable drawable) {
            if (drawable != null && this.f55364i != null) {
                drawable = androidx.core.graphics.drawable.d.r(drawable.mutate());
                androidx.core.graphics.drawable.d.o(drawable, this.f55364i);
                androidx.core.graphics.drawable.d.p(drawable, this.f55365j);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
            this.f55364i = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.d.r(getBackground().mutate());
                androidx.core.graphics.drawable.d.o(drawableR, colorStateList);
                androidx.core.graphics.drawable.d.p(drawableR, this.f55365j);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
            this.f55365j = mode;
            if (getBackground() != null) {
                Drawable drawableR = androidx.core.graphics.drawable.d.r(getBackground().mutate());
                androidx.core.graphics.drawable.d.p(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f55367l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f55357b;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.t0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@p0 View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f55356m);
            super.setOnClickListener(onClickListener);
        }
    }

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f55368b;

        a(int i10) {
            this.f55368b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y(this.f55368b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f55337i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f55337i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f55337i.setScaleY(fFloatValue);
        }
    }

    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Z();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f55338j.a(BaseTransientBottomBar.this.f55331c - BaseTransientBottomBar.this.f55329a, BaseTransientBottomBar.this.f55329a);
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f55373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f55374c;

        e(int i10) {
            this.f55374c = i10;
            this.f55373b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.Q) {
                j1.f1(BaseTransientBottomBar.this.f55337i, iIntValue - this.f55373b);
            } else {
                BaseTransientBottomBar.this.f55337i.setTranslationY(iIntValue);
            }
            this.f55373b = iIntValue;
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f55376b;

        f(int i10) {
            this.f55376b = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Y(this.f55376b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f55338j.b(0, BaseTransientBottomBar.this.f55330b);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f55378b = 0;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@n0 ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.Q) {
                j1.f1(BaseTransientBottomBar.this.f55337i, iIntValue - this.f55378b);
            } else {
                BaseTransientBottomBar.this.f55337i.setTranslationY(iIntValue);
            }
            this.f55378b = iIntValue;
        }
    }

    public class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@n0 Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).n0();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).P(message.arg1);
            return true;
        }
    }

    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f55337i == null || baseTransientBottomBar.f55336h == null) {
                return;
            }
            int iHeight = (k0.b(BaseTransientBottomBar.this.f55336h).height() - BaseTransientBottomBar.this.N()) + ((int) BaseTransientBottomBar.this.f55337i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f55348t) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f55349u = baseTransientBottomBar2.f55348t;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f55337i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.S, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f55349u = baseTransientBottomBar3.f55348t;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f55348t - iHeight;
            BaseTransientBottomBar.this.f55337i.requestLayout();
        }
    }

    public class j implements z0 {
        j() {
        }

        @Override // androidx.core.view.z0
        @n0
        public n3 a(View view, @n0 n3 n3Var) {
            BaseTransientBottomBar.this.f55344p = n3Var.o();
            BaseTransientBottomBar.this.f55345q = n3Var.p();
            BaseTransientBottomBar.this.f55346r = n3Var.q();
            BaseTransientBottomBar.this.t0();
            return n3Var;
        }
    }

    public class k extends androidx.core.view.a {
        k() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @n0 a0 a0Var) {
            super.onInitializeAccessibilityNodeInfo(view, a0Var);
            a0Var.a(1048576);
            a0Var.i1(true);
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            BaseTransientBottomBar.this.A();
            return true;
        }
    }

    public class l implements com.google.android.material.snackbar.c.b {
        l() {
        }

        @Override // com.google.android.material.snackbar.c.b
        public void a(int i10) {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.c.b
        public void show() {
            Handler handler = BaseTransientBottomBar.N;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.Y(3);
        }
    }

    public class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(@n0 View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.B(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.c.c().l(BaseTransientBottomBar.this.f55354z);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.c.c().k(BaseTransientBottomBar.this.f55354z);
            }
        }
    }

    public class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SnackbarBaseLayout snackbarBaseLayout = BaseTransientBottomBar.this.f55337i;
            if (snackbarBaseLayout == null) {
                return;
            }
            if (snackbarBaseLayout.getParent() != null) {
                BaseTransientBottomBar.this.f55337i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f55337i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.p0();
            } else {
                BaseTransientBottomBar.this.r0();
            }
        }
    }

    public class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Z();
        }
    }

    public static class q implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @n0
        private final WeakReference<BaseTransientBottomBar> f55388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @n0
        private final WeakReference<View> f55389c;

        private q(@n0 BaseTransientBottomBar baseTransientBottomBar, @n0 View view) {
            this.f55388b = new WeakReference<>(baseTransientBottomBar);
            this.f55389c = new WeakReference<>(view);
        }

        static q a(@n0 BaseTransientBottomBar baseTransientBottomBar, @n0 View view) {
            q qVar = new q(baseTransientBottomBar, view);
            if (j1.O0(view)) {
                j0.a(view, qVar);
            }
            view.addOnAttachStateChangeListener(qVar);
            return qVar;
        }

        private boolean d() {
            if (this.f55388b.get() != null) {
                return false;
            }
            c();
            return true;
        }

        @p0
        View b() {
            return this.f55389c.get();
        }

        void c() {
            if (this.f55389c.get() != null) {
                this.f55389c.get().removeOnAttachStateChangeListener(this);
                j0.s(this.f55389c.get(), this);
            }
            this.f55389c.clear();
            this.f55388b.clear();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (d() || !this.f55388b.get().f55342n) {
                return;
            }
            this.f55388b.get().a0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (d()) {
                return;
            }
            j0.a(view, this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (d()) {
                return;
            }
            j0.s(view, this);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface r {
    }

    public static abstract class s<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f55390a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f55391b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f55392c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f55393d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f55394e = 4;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface a {
        }

        public void a(B b10, int i10) {
        }

        public void b(B b10) {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.material.snackbar.c.b f55395a;

        public t(@n0 SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.V(0.1f);
            swipeDismissBehavior.S(0.6f);
            swipeDismissBehavior.W(0);
        }

        public boolean a(View view) {
            return view instanceof SnackbarBaseLayout;
        }

        public void b(@n0 CoordinatorLayout coordinatorLayout, @n0 View view, @n0 MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.C(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.c.c().k(this.f55395a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.c.c().l(this.f55395a);
            }
        }

        public void c(@n0 BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f55395a = baseTransientBottomBar.f55354z;
        }
    }

    @Deprecated
    public interface u extends com.google.android.material.snackbar.a {
    }

    @f0(from = -2)
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface v {
    }

    protected BaseTransientBottomBar(@n0 Context context, @n0 ViewGroup viewGroup, @n0 View view, @n0 com.google.android.material.snackbar.a aVar) {
        this.f55342n = false;
        this.f55343o = new i();
        this.f55354z = new l();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f55335g = viewGroup;
        this.f55338j = aVar;
        this.f55336h = context;
        c0.a(context);
        SnackbarBaseLayout snackbarBaseLayout = (SnackbarBaseLayout) LayoutInflater.from(context).inflate(K(), viewGroup, false);
        this.f55337i = snackbarBaseLayout;
        snackbarBaseLayout.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(snackbarBaseLayout.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(snackbarBaseLayout.getMaxInlineActionWidth());
        }
        snackbarBaseLayout.addView(view);
        j1.D1(snackbarBaseLayout, 1);
        j1.R1(snackbarBaseLayout, 1);
        j1.O1(snackbarBaseLayout, true);
        j1.a2(snackbarBaseLayout, new j());
        j1.B1(snackbarBaseLayout, new k());
        this.f55353y = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = R.attr.motionDurationLong2;
        this.f55331c = i9.a.f(context, i10, 250);
        this.f55329a = i9.a.f(context, i10, 150);
        this.f55330b = i9.a.f(context, R.attr.motionDurationMedium1, 75);
        int i11 = R.attr.motionEasingEmphasizedInterpolator;
        this.f55332d = i9.a.g(context, i11, K);
        this.f55334f = i9.a.g(context, i11, L);
        this.f55333e = i9.a.g(context, i11, H);
    }

    protected BaseTransientBottomBar(@n0 ViewGroup viewGroup, @n0 View view, @n0 com.google.android.material.snackbar.a aVar) {
        this(viewGroup.getContext(), viewGroup, view, aVar);
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f55332d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    private ValueAnimator J(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f55334f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int L() {
        int height = this.f55337i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f55337i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int N() {
        int[] iArr = new int[2];
        this.f55337i.getLocationOnScreen(iArr);
        return iArr[1] + this.f55337i.getHeight();
    }

    private boolean U() {
        ViewGroup.LayoutParams layoutParams = this.f55337i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        this.f55347s = x();
        t0();
    }

    private void j0(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior<? extends View> swipeDismissBehaviorI = this.f55352x;
        if (swipeDismissBehaviorI == null) {
            swipeDismissBehaviorI = I();
        }
        if (swipeDismissBehaviorI instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorI).Z(this);
        }
        swipeDismissBehaviorI.T(new n());
        fVar.q(swipeDismissBehaviorI);
        if (D() == null) {
            fVar.f19807g = 80;
        }
    }

    private boolean l0() {
        return this.f55348t > 0 && !this.f55340l && U();
    }

    private void o0() {
        if (k0()) {
            v();
            return;
        }
        if (this.f55337i.getParent() != null) {
            this.f55337i.setVisibility(0);
        }
        Z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        ValueAnimator valueAnimatorC = C(0.0f, 1.0f);
        ValueAnimator valueAnimatorJ = J(M, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorC, valueAnimatorJ);
        animatorSet.setDuration(this.f55329a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void q0(int i10) {
        ValueAnimator valueAnimatorC = C(1.0f, 0.0f);
        valueAnimatorC.setDuration(this.f55330b);
        valueAnimatorC.addListener(new a(i10));
        valueAnimatorC.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        int iL = L();
        if (Q) {
            j1.f1(this.f55337i, iL);
        } else {
            this.f55337i.setTranslationY(iL);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iL, 0);
        valueAnimator.setInterpolator(this.f55333e);
        valueAnimator.setDuration(this.f55331c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e(iL));
        valueAnimator.start();
    }

    private void s0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, L());
        valueAnimator.setInterpolator(this.f55333e);
        valueAnimator.setDuration(this.f55331c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        ViewGroup.LayoutParams layoutParams = this.f55337i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(S, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f55337i.f55366k == null) {
            Log.w(S, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f55337i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f55337i.f55366k.bottom + (D() != null ? this.f55347s : this.f55344p);
        int i11 = this.f55337i.f55366k.left + this.f55345q;
        int i12 = this.f55337i.f55366k.right + this.f55346r;
        int i13 = this.f55337i.f55366k.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f55337i.requestLayout();
        }
        if ((z10 || this.f55349u != this.f55348t) && Build.VERSION.SDK_INT >= 29 && l0()) {
            this.f55337i.removeCallbacks(this.f55343o);
            this.f55337i.post(this.f55343o);
        }
    }

    private void w(int i10) {
        if (this.f55337i.getAnimationMode() == 1) {
            q0(i10);
        } else {
            s0(i10);
        }
    }

    private int x() {
        if (D() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        D().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f55335g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f55335g.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public static GradientDrawable y(@androidx.annotation.l int i10, @n0 Resources resources) {
        float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public static com.google.android.material.shape.k z(@androidx.annotation.l int i10, @n0 com.google.android.material.shape.p pVar) {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(pVar);
        kVar.o0(ColorStateList.valueOf(i10));
        return kVar;
    }

    public void A() {
        B(3);
    }

    protected void B(int i10) {
        com.google.android.material.snackbar.c.c().b(this.f55354z, i10);
    }

    @p0
    public View D() {
        q qVar = this.f55341m;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    public int E() {
        return this.f55337i.getAnimationMode();
    }

    public Behavior F() {
        return this.f55352x;
    }

    @n0
    public Context G() {
        return this.f55336h;
    }

    public int H() {
        return this.f55339k;
    }

    @n0
    protected SwipeDismissBehavior<? extends View> I() {
        return new Behavior();
    }

    @i0
    protected int K() {
        return O() ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar;
    }

    @n0
    public View M() {
        return this.f55337i;
    }

    protected boolean O() {
        TypedArray typedArrayObtainStyledAttributes = this.f55336h.obtainStyledAttributes(R);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void P(int i10) {
        if (k0() && this.f55337i.getVisibility() == 0) {
            w(i10);
        } else {
            Y(i10);
        }
    }

    public boolean Q() {
        return this.f55342n;
    }

    public boolean R() {
        return this.f55340l;
    }

    public boolean S() {
        return com.google.android.material.snackbar.c.c().e(this.f55354z);
    }

    public boolean T() {
        return com.google.android.material.snackbar.c.c().f(this.f55354z);
    }

    void V() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f55337i.getRootWindowInsets()) == null) {
            return;
        }
        this.f55348t = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        t0();
    }

    void W() {
        if (T()) {
            N.post(new m());
        }
    }

    void X() {
        if (this.f55350v) {
            o0();
            this.f55350v = false;
        }
    }

    void Y(int i10) {
        com.google.android.material.snackbar.c.c().i(this.f55354z);
        List<s<B>> list = this.f55351w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f55351w.get(size).a(this, i10);
            }
        }
        ViewParent parent = this.f55337i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f55337i);
        }
    }

    void Z() {
        com.google.android.material.snackbar.c.c().j(this.f55354z);
        List<s<B>> list = this.f55351w;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f55351w.get(size).b(this);
            }
        }
    }

    @n0
    public B b0(@p0 s<B> sVar) {
        List<s<B>> list;
        if (sVar == null || (list = this.f55351w) == null) {
            return this;
        }
        list.remove(sVar);
        return this;
    }

    @n0
    public B c0(@d0 int i10) {
        View viewFindViewById = this.f55335g.findViewById(i10);
        if (viewFindViewById != null) {
            return (B) d0(viewFindViewById);
        }
        throw new IllegalArgumentException("Unable to find anchor view with id: " + i10);
    }

    @n0
    public B d0(@p0 View view) {
        q qVar = this.f55341m;
        if (qVar != null) {
            qVar.c();
        }
        this.f55341m = view == null ? null : q.a(this, view);
        return this;
    }

    public void e0(boolean z10) {
        this.f55342n = z10;
    }

    @n0
    public B f0(int i10) {
        this.f55337i.setAnimationMode(i10);
        return this;
    }

    @n0
    public B g0(Behavior behavior) {
        this.f55352x = behavior;
        return this;
    }

    @n0
    public B h0(int i10) {
        this.f55339k = i10;
        return this;
    }

    @n0
    public B i0(boolean z10) {
        this.f55340l = z10;
        return this;
    }

    boolean k0() {
        AccessibilityManager accessibilityManager = this.f55353y;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void m0() {
        com.google.android.material.snackbar.c.c().n(H(), this.f55354z);
    }

    final void n0() {
        if (this.f55337i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f55337i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                j0((CoordinatorLayout.f) layoutParams);
            }
            this.f55337i.c(this.f55335g);
            a0();
            this.f55337i.setVisibility(4);
        }
        if (j1.U0(this.f55337i)) {
            o0();
        } else {
            this.f55350v = true;
        }
    }

    @n0
    public B u(@p0 s<B> sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f55351w == null) {
            this.f55351w = new ArrayList();
        }
        this.f55351w.add(sVar);
        return this;
    }

    void v() {
        this.f55337i.post(new o());
    }
}
