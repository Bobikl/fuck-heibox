package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.l0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j1;
import androidx.core.view.n3;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.j0;
import com.google.android.material.shape.p;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private static final int U3 = 300;
    private static final float X3 = 0.2f;
    public static final int Y3 = 0;
    public static final int Z3 = 1;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final int f53182a4 = 0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final int f53183b4 = 1;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final int f53184c4 = 0;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final int f53185d4 = 1;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final int f53186e4 = 0;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final int f53187f4 = 1;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final int f53188g4 = -1;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final int f53189h4 = 0;
    private final boolean G2;
    private int G3;
    private ArrayList<j> J3;

    @l0
    private int K3;
    private boolean L3;
    private boolean M3;
    private Behavior N3;
    private int O3;
    private int P3;
    private int Q3;

    @n0
    AnimatorListenerAdapter R3;

    @n0
    com.google.android.material.animation.l<FloatingActionButton> S3;

    @p0
    private Integer T;
    private final com.google.android.material.shape.k U;

    @p0
    private Animator V;

    @p0
    private Animator W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f53190a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f53191b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f53192c0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final int f53193p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final boolean f53194p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private final boolean f53195p3;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @t0
    private int f53196x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private boolean f53197x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f53198y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private final boolean f53199y2;
    private static final int T3 = R.style.Widget_MaterialComponents_BottomAppBar;
    private static final int V3 = R.attr.motionDurationLong2;
    private static final int W3 = R.attr.motionEasingEmphasizedInterpolator;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @n0
        private final Rect f53200v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private WeakReference<BottomAppBar> f53201w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f53202x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private final View.OnLayoutChangeListener f53203y;

        public class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f53201w.get();
                if (bottomAppBar == null || !((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.l(Behavior.this.f53200v);
                    int iHeight = Behavior.this.f53200v.height();
                    bottomAppBar.d1(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f53200v)));
                    height = iHeight;
                }
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                if (Behavior.this.f53202x == 0) {
                    if (bottomAppBar.f53192c0 == 1) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                    if (j0.q(view)) {
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.f53193p1;
                    } else {
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.f53193p1;
                    }
                }
                bottomAppBar.c1();
            }
        }

        public Behavior() {
            this.f53203y = new a();
            this.f53200v = new Rect();
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f53203y = new a();
            this.f53200v = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 BottomAppBar bottomAppBar, int i10) {
            this.f53201w = new WeakReference<>(bottomAppBar);
            View viewK0 = bottomAppBar.K0();
            if (viewK0 != null && !j1.U0(viewK0)) {
                BottomAppBar.g1(bottomAppBar, viewK0);
                this.f53202x = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) viewK0.getLayoutParams())).bottomMargin;
                if (viewK0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewK0;
                    if (bottomAppBar.f53192c0 == 0 && bottomAppBar.f53194p2) {
                        j1.N1(floatingActionButton, 0.0f);
                        floatingActionButton.setCompatElevation(0.0f);
                    }
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                    }
                    bottomAppBar.A0(floatingActionButton);
                }
                viewK0.addOnLayoutChangeListener(this.f53203y);
                bottomAppBar.c1();
            }
            coordinatorLayout.K(bottomAppBar, i10);
            return super.p(coordinatorLayout, bottomAppBar, i10);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
        public boolean E(@n0 CoordinatorLayout coordinatorLayout, @n0 BottomAppBar bottomAppBar, @n0 View view, @n0 View view2, int i10, int i11) {
            return bottomAppBar.getHideOnScroll() && super.E(coordinatorLayout, bottomAppBar, view, view2, i10, i11);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f53206c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@n0 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@n0 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f53205b = parcel.readInt();
            this.f53206c = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f53205b);
            parcel.writeInt(this.f53206c ? 1 : 0);
        }
    }

    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.L3) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.R0(bottomAppBar.f53190a0, BottomAppBar.this.M3);
        }
    }

    public class b implements com.google.android.material.animation.l<FloatingActionButton> {
        b() {
        }

        @Override // com.google.android.material.animation.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(@n0 FloatingActionButton floatingActionButton) {
            BottomAppBar.this.U.p0((floatingActionButton.getVisibility() == 0 && BottomAppBar.this.f53192c0 == 1) ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.google.android.material.animation.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@n0 FloatingActionButton floatingActionButton) {
            if (BottomAppBar.this.f53192c0 != 1) {
                return;
            }
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().i() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().o(translationX);
                BottomAppBar.this.U.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().d() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().j(fMax);
                BottomAppBar.this.U.invalidateSelf();
            }
            BottomAppBar.this.U.p0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    public class c implements j0.e {
        c() {
        }

        @Override // com.google.android.material.internal.j0.e
        @n0
        public n3 a(View view, @n0 n3 n3Var, @n0 j0.f fVar) {
            boolean z10;
            if (BottomAppBar.this.f53199y2) {
                BottomAppBar.this.O3 = n3Var.o();
            }
            boolean z11 = false;
            if (BottomAppBar.this.G2) {
                z10 = BottomAppBar.this.Q3 != n3Var.p();
                BottomAppBar.this.Q3 = n3Var.p();
            } else {
                z10 = false;
            }
            if (BottomAppBar.this.f53195p3) {
                boolean z12 = BottomAppBar.this.P3 != n3Var.q();
                BottomAppBar.this.P3 = n3Var.q();
                z11 = z12;
            }
            if (z10 || z11) {
                BottomAppBar.this.C0();
                BottomAppBar.this.c1();
                BottomAppBar.this.b1();
            }
            return n3Var;
        }
    }

    public class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.H0();
            BottomAppBar.this.V = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.I0();
        }
    }

    public class e extends FloatingActionButton.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f53211a;

        public class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.H0();
            }
        }

        e(int i10) {
            this.f53211a = i10;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(@n0 FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.M0(this.f53211a));
            floatingActionButton.z(new a());
        }
    }

    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.H0();
            BottomAppBar.this.L3 = false;
            BottomAppBar.this.W = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.I0();
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f53215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f53216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f53217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f53218e;

        g(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f53216c = actionMenuView;
            this.f53217d = i10;
            this.f53218e = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f53215b = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f53215b) {
                return;
            }
            boolean z10 = BottomAppBar.this.K3 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.a1(bottomAppBar.K3);
            BottomAppBar.this.f1(this.f53216c, this.f53217d, this.f53218e, z10);
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ActionMenuView f53220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f53221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f53222d;

        h(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f53220b = actionMenuView;
            this.f53221c = i10;
            this.f53222d = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f53220b;
            actionMenuView.setTranslationX(BottomAppBar.this.L0(actionMenuView, this.f53221c, this.f53222d));
        }
    }

    public class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.R3.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonJ0 = BottomAppBar.this.J0();
            if (floatingActionButtonJ0 != null) {
                floatingActionButtonJ0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    public interface j {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface l {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface n {
    }

    public BottomAppBar(@n0 Context context) {
        this(context, null);
    }

    public BottomAppBar(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = T3;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k();
        this.U = kVar;
        this.G3 = 0;
        this.K3 = 0;
        this.L3 = false;
        this.M3 = true;
        this.R3 = new a();
        this.S3 = new b();
        Context context2 = getContext();
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.f52881v, i10, i11, new int[0]);
        ColorStateList colorStateListA = com.google.android.material.resources.c.a(context2, typedArrayK, R.styleable.BottomAppBar_backgroundTint);
        int i12 = R.styleable.BottomAppBar_navigationIconTint;
        if (typedArrayK.hasValue(i12)) {
            setNavigationIconTint(typedArrayK.getColor(i12, -1));
        }
        int dimensionPixelSize = typedArrayK.getDimensionPixelSize(R.styleable.BottomAppBar_elevation, 0);
        float dimensionPixelOffset = typedArrayK.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleMargin, 0);
        float dimensionPixelOffset2 = typedArrayK.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0);
        float dimensionPixelOffset3 = typedArrayK.getDimensionPixelOffset(R.styleable.BottomAppBar_fabCradleVerticalOffset, 0);
        this.f53190a0 = typedArrayK.getInt(R.styleable.BottomAppBar_fabAlignmentMode, 0);
        this.f53191b0 = typedArrayK.getInt(R.styleable.BottomAppBar_fabAnimationMode, 0);
        this.f53192c0 = typedArrayK.getInt(R.styleable.BottomAppBar_fabAnchorMode, 1);
        this.f53194p2 = typedArrayK.getBoolean(R.styleable.BottomAppBar_removeEmbeddedFabElevation, true);
        this.f53198y1 = typedArrayK.getInt(R.styleable.BottomAppBar_menuAlignmentMode, 0);
        this.f53197x2 = typedArrayK.getBoolean(R.styleable.BottomAppBar_hideOnScroll, false);
        this.f53199y2 = typedArrayK.getBoolean(R.styleable.BottomAppBar_paddingBottomSystemWindowInsets, false);
        this.G2 = typedArrayK.getBoolean(R.styleable.BottomAppBar_paddingLeftSystemWindowInsets, false);
        this.f53195p3 = typedArrayK.getBoolean(R.styleable.BottomAppBar_paddingRightSystemWindowInsets, false);
        this.f53196x1 = typedArrayK.getDimensionPixelOffset(R.styleable.BottomAppBar_fabAlignmentModeEndMargin, -1);
        boolean z10 = typedArrayK.getBoolean(R.styleable.BottomAppBar_addElevationShadow, true);
        typedArrayK.recycle();
        this.f53193p1 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        kVar.setShapeAppearanceModel(p.a().G(new com.google.android.material.bottomappbar.b(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).m());
        if (z10) {
            kVar.x0(2);
        } else {
            kVar.x0(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        kVar.r0(Paint.Style.FILL);
        kVar.Z(context2);
        setElevation(dimensionPixelSize);
        androidx.core.graphics.drawable.d.o(kVar, colorStateListA);
        j1.I1(this, kVar);
        j0.e(this, attributeSet, i10, i11, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(@n0 FloatingActionButton floatingActionButton) {
        floatingActionButton.f(this.R3);
        floatingActionButton.g(new i());
        floatingActionButton.h(this.S3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.V;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void F0(int i10, @n0 List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(J0(), "translationX", M0(i10));
        objectAnimatorOfFloat.setDuration(getFabAlignmentAnimationDuration());
        list.add(objectAnimatorOfFloat);
    }

    private void G0(int i10, boolean z10, @n0 List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        animatorOfFloat.setDuration((long) (0.8f * fabAlignmentAnimationDuration));
        if (Math.abs(actionMenuView.getTranslationX() - L0(actionMenuView, i10, z10)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.setDuration((long) (fabAlignmentAnimationDuration * 0.2f));
            objectAnimatorOfFloat.addListener(new g(actionMenuView, i10, z10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        ArrayList<j> arrayList;
        int i10 = this.G3 - 1;
        this.G3 = i10;
        if (i10 != 0 || (arrayList = this.J3) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        ArrayList<j> arrayList;
        int i10 = this.G3;
        this.G3 = i10 + 1;
        if (i10 != 0 || (arrayList = this.J3) == null) {
            return;
        }
        Iterator<j> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public FloatingActionButton J0() {
        View viewK0 = K0();
        if (viewK0 instanceof FloatingActionButton) {
            return (FloatingActionButton) viewK0;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @p0
    public View K0() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).t(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float M0(int i10) {
        boolean zQ = j0.q(this);
        if (i10 != 1) {
            return 0.0f;
        }
        View viewK0 = K0();
        return ((getMeasuredWidth() / 2) - ((zQ ? this.Q3 : this.P3) + ((this.f53196x1 == -1 || viewK0 == null) ? this.f53193p1 : (viewK0.getMeasuredWidth() / 2) + this.f53196x1))) * (zQ ? -1 : 1);
    }

    private boolean N0() {
        FloatingActionButton floatingActionButtonJ0 = J0();
        return floatingActionButtonJ0 != null && floatingActionButtonJ0.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R0(int i10, boolean z10) {
        if (!j1.U0(this)) {
            this.L3 = false;
            a1(this.K3);
            return;
        }
        Animator animator = this.W;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!N0()) {
            i10 = 0;
            z10 = false;
        }
        G0(i10, z10, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.W = animatorSet;
        animatorSet.addListener(new f());
        this.W.start();
    }

    private void S0(int i10) {
        if (this.f53190a0 == i10 || !j1.U0(this)) {
            return;
        }
        Animator animator = this.V;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f53191b0 == 1) {
            F0(i10, arrayList);
        } else {
            E0(i10, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(i9.a.g(getContext(), W3, com.google.android.material.animation.b.f52896a));
        this.V = animatorSet;
        animatorSet.addListener(new d());
        this.V.start();
    }

    @p0
    private Drawable T0(@p0 Drawable drawable) {
        if (drawable == null || this.T == null) {
            return drawable;
        }
        Drawable drawableR = androidx.core.graphics.drawable.d.r(drawable.mutate());
        androidx.core.graphics.drawable.d.n(drawableR, this.T.intValue());
        return drawableR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b1() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.W != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (N0()) {
            e1(actionMenuView, this.f53190a0, this.M3);
        } else {
            e1(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1() {
        getTopEdgeTreatment().o(getFabTranslationX());
        this.U.p0((this.M3 && N0() && this.f53192c0 == 1) ? 1.0f : 0.0f);
        View viewK0 = K0();
        if (viewK0 != null) {
            viewK0.setTranslationY(getFabTranslationY());
            viewK0.setTranslationX(getFabTranslationX());
        }
    }

    private void e1(@n0 ActionMenuView actionMenuView, int i10, boolean z10) {
        f1(actionMenuView, i10, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1(@n0 ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        h hVar = new h(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g1(BottomAppBar bottomAppBar, View view) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        fVar.f19804d = 17;
        int i10 = bottomAppBar.f53192c0;
        if (i10 == 1) {
            fVar.f19804d = 17 | 48;
        }
        if (i10 == 0) {
            fVar.f19804d |= 80;
        }
    }

    @p0
    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.O3;
    }

    private int getFabAlignmentAnimationDuration() {
        return i9.a.f(getContext(), V3, 300);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return M0(this.f53190a0);
    }

    private float getFabTranslationY() {
        if (this.f53192c0 == 1) {
            return -getTopEdgeTreatment().d();
        }
        View viewK0 = K0();
        return viewK0 != null ? (-((getMeasuredHeight() + getBottomInset()) - viewK0.getMeasuredHeight())) / 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.Q3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.P3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public com.google.android.material.bottomappbar.b getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.b) this.U.getShapeAppearanceModel().p();
    }

    public void B0(@n0 HideBottomViewOnScrollBehavior.b bVar) {
        getBehavior().K(bVar);
    }

    public void D0() {
        getBehavior().M();
    }

    protected void E0(int i10, List<Animator> list) {
        FloatingActionButton floatingActionButtonJ0 = J0();
        if (floatingActionButtonJ0 == null || floatingActionButtonJ0.q()) {
            return;
        }
        I0();
        floatingActionButtonJ0.o(new e(i10));
    }

    protected int L0(@n0 ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11 = 0;
        if (this.f53198y1 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean zQ = j0.q(this);
        int measuredWidth = zQ ? getMeasuredWidth() : 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f1602a & androidx.core.view.n.f21703d) == 8388611) {
                measuredWidth = zQ ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        int right = zQ ? actionMenuView.getRight() : actionMenuView.getLeft();
        int i13 = zQ ? this.P3 : -this.Q3;
        if (getNavigationIcon() == null) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            i11 = zQ ? dimensionPixelOffset : -dimensionPixelOffset;
        }
        return measuredWidth - ((right + i13) + i11);
    }

    public boolean O0() {
        return getBehavior().N();
    }

    public boolean P0() {
        return getBehavior().O();
    }

    public void U0() {
        V0(true);
    }

    public void V0(boolean z10) {
        getBehavior().S(this, z10);
    }

    public void W0() {
        X0(true);
    }

    public void X0(boolean z10) {
        getBehavior().U(this, z10);
    }

    void Y0(@n0 j jVar) {
        ArrayList<j> arrayList = this.J3;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(jVar);
    }

    public void Z0(@n0 HideBottomViewOnScrollBehavior.b bVar) {
        getBehavior().P(bVar);
    }

    public void a1(@l0 int i10) {
        if (i10 != 0) {
            this.K3 = 0;
            getMenu().clear();
            z(i10);
        }
    }

    boolean d1(@t0 int i10) {
        float f10 = i10;
        if (f10 == getTopEdgeTreatment().h()) {
            return false;
        }
        getTopEdgeTreatment().n(f10);
        this.U.invalidateSelf();
        return true;
    }

    @p0
    public ColorStateList getBackgroundTint() {
        return this.U.R();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @n0
    public Behavior getBehavior() {
        if (this.N3 == null) {
            this.N3 = new Behavior();
        }
        return this.N3;
    }

    @r
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().d();
    }

    public int getFabAlignmentMode() {
        return this.f53190a0;
    }

    @t0
    public int getFabAlignmentModeEndMargin() {
        return this.f53196x1;
    }

    public int getFabAnchorMode() {
        return this.f53192c0;
    }

    public int getFabAnimationMode() {
        return this.f53191b0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f();
    }

    @r
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().g();
    }

    public boolean getHideOnScroll() {
        return this.f53197x2;
    }

    public int getMenuAlignmentMode() {
        return this.f53198y1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.f(this, this.U);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            C0();
            c1();
            final View viewK0 = K0();
            if (viewK0 != null && j1.U0(viewK0)) {
                viewK0.post(new Runnable() { // from class: com.google.android.material.bottomappbar.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        viewK0.requestLayout();
                    }
                });
            }
        }
        b1();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f53190a0 = savedState.f53205b;
        this.M3 = savedState.f53206c;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @n0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f53205b = this.f53190a0;
        savedState.f53206c = this.M3;
        return savedState;
    }

    public void setBackgroundTint(@p0 ColorStateList colorStateList) {
        androidx.core.graphics.drawable.d.o(this.U, colorStateList);
    }

    public void setCradleVerticalOffset(@r float f10) {
        if (f10 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().j(f10);
            this.U.invalidateSelf();
            c1();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        this.U.n0(f10);
        getBehavior().Q(this, this.U.K() - this.U.J());
    }

    public void setFabAlignmentMode(int i10) {
        setFabAlignmentModeAndReplaceMenu(i10, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i10, @l0 int i11) {
        this.K3 = i11;
        this.L3 = true;
        R0(i10, this.M3);
        S0(i10);
        this.f53190a0 = i10;
    }

    public void setFabAlignmentModeEndMargin(@t0 int i10) {
        if (this.f53196x1 != i10) {
            this.f53196x1 = i10;
            c1();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f53192c0 = i10;
        c1();
        View viewK0 = K0();
        if (viewK0 != null) {
            g1(this, viewK0);
            viewK0.requestLayout();
            this.U.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f53191b0 = i10;
    }

    void setFabCornerSize(@r float f10) {
        if (f10 != getTopEdgeTreatment().e()) {
            getTopEdgeTreatment().k(f10);
            this.U.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@r float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().l(f10);
            this.U.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@r float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m(f10);
            this.U.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f53197x2 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f53198y1 != i10) {
            this.f53198y1 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                e1(actionMenuView, this.f53190a0, N0());
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@p0 Drawable drawable) {
        super.setNavigationIcon(T0(drawable));
    }

    public void setNavigationIconTint(@androidx.annotation.l int i10) {
        this.T = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    void z0(@n0 j jVar) {
        if (this.J3 == null) {
            this.J3 = new ArrayList<>();
        }
        this.J3.add(jVar);
    }
}
