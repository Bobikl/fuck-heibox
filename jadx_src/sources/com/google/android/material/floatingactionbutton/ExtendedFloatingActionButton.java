package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.c0;
import com.google.android.material.shape.p;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    private static final int U = 0;
    private static final int V = 1;
    private static final int W = 2;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f54196a0 = 0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f54197b0 = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f54198c0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f54199p1 = 3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f54200p2 = 2;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f54202x1 = 0;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f54204y1 = 1;
    private int C;
    private final com.google.android.material.floatingactionbutton.a D;

    @n0
    private final com.google.android.material.floatingactionbutton.f E;

    @n0
    private final com.google.android.material.floatingactionbutton.f F;
    private final com.google.android.material.floatingactionbutton.f G;
    private final com.google.android.material.floatingactionbutton.f H;
    private final int I;
    private int J;
    private int K;

    @n0
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> L;
    private boolean M;
    private boolean N;
    private boolean O;

    @n0
    protected ColorStateList P;
    private int Q;
    private int R;
    private final int S;
    private static final int T = R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final Property<View, Float> f54203x2 = new f(Float.class, "width");

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    static final Property<View, Float> f54205y2 = new g(Float.class, "height");
    static final Property<View, Float> G2 = new h(Float.class, "paddingStart");

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    static final Property<View, Float> f54201p3 = new i(Float.class, "paddingEnd");

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final boolean f54206k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final boolean f54207l = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Rect f54208f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private l f54209g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @p0
        private l f54210h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f54211i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f54212j;

        public ExtendedFloatingActionButtonBehavior() {
            this.f54211i = false;
            this.f54212j = true;
        }

        public ExtendedFloatingActionButtonBehavior(@n0 Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.V);
            this.f54211i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f54212j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private static boolean N(@n0 View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean U(@n0 View view, @n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f54211i || this.f54212j) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean W(CoordinatorLayout coordinatorLayout, @n0 AppBarLayout appBarLayout, @n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!U(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f54208f == null) {
                this.f54208f = new Rect();
            }
            Rect rect = this.f54208f;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                V(extendedFloatingActionButton);
                return true;
            }
            J(extendedFloatingActionButton);
            return true;
        }

        private boolean X(@n0 View view, @n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!U(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                V(extendedFloatingActionButton);
                return true;
            }
            J(extendedFloatingActionButton);
            return true;
        }

        protected void J(@n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f54212j;
            extendedFloatingActionButton.M(z10 ? 3 : 0, z10 ? this.f54210h : this.f54209g);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public boolean e(@n0 CoordinatorLayout coordinatorLayout, @n0 ExtendedFloatingActionButton extendedFloatingActionButton, @n0 Rect rect) {
            return super.e(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        public boolean L() {
            return this.f54211i;
        }

        public boolean M() {
            return this.f54212j;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public boolean l(CoordinatorLayout coordinatorLayout, @n0 ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                W(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!N(view)) {
                return false;
            }
            X(view, extendedFloatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public boolean p(@n0 CoordinatorLayout coordinatorLayout, @n0 ExtendedFloatingActionButton extendedFloatingActionButton, int i10) {
            List<View> listS = coordinatorLayout.s(extendedFloatingActionButton);
            int size = listS.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listS.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (N(view) && X(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (W(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.K(extendedFloatingActionButton, i10);
            return true;
        }

        public void Q(boolean z10) {
            this.f54211i = z10;
        }

        public void R(boolean z10) {
            this.f54212j = z10;
        }

        @j1
        void S(@p0 l lVar) {
            this.f54209g = lVar;
        }

        @j1
        void T(@p0 l lVar) {
            this.f54210h = lVar;
        }

        protected void V(@n0 ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10 = this.f54212j;
            extendedFloatingActionButton.M(z10 ? 2 : 1, z10 ? this.f54210h : this.f54209g);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void k(@n0 CoordinatorLayout.f fVar) {
            if (fVar.f19808h == 0) {
                fVar.f19808h = 80;
            }
        }
    }

    public class a implements n {
        a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    public class b implements n {
        b() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.K;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.J;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.J + ExtendedFloatingActionButton.this.K;
        }
    }

    public class c implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f54215a;

        c(n nVar) {
            this.f54215a = nVar;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(-1, ExtendedFloatingActionButton.this.R == 0 ? -2 : ExtendedFloatingActionButton.this.R);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (ExtendedFloatingActionButton.this.R != -1) {
                return (ExtendedFloatingActionButton.this.R == 0 || ExtendedFloatingActionButton.this.R == -2) ? this.f54215a.getHeight() : ExtendedFloatingActionButton.this.R;
            }
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f54215a.getHeight();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height == -2) {
                return this.f54215a.getHeight();
            }
            int i10 = 0;
            int paddingTop = view.getPaddingTop() + view.getPaddingBottom() + 0;
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i10 = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            return (view.getHeight() - i10) - paddingTop;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.K;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.J;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            if (!(ExtendedFloatingActionButton.this.getParent() instanceof View)) {
                return this.f54215a.getWidth();
            }
            View view = (View) ExtendedFloatingActionButton.this.getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.width == -2) {
                return this.f54215a.getWidth();
            }
            int i10 = 0;
            int paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + 0;
            if ((ExtendedFloatingActionButton.this.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ExtendedFloatingActionButton.this.getLayoutParams()) != null) {
                i10 = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
            return (view.getWidth() - i10) - paddingLeft;
        }
    }

    public class d implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f54217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f54218b;

        d(n nVar, n nVar2) {
            this.f54217a = nVar;
            this.f54218b = nVar2;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public ViewGroup.LayoutParams a() {
            return new ViewGroup.LayoutParams(ExtendedFloatingActionButton.this.Q == 0 ? -2 : ExtendedFloatingActionButton.this.Q, ExtendedFloatingActionButton.this.R != 0 ? ExtendedFloatingActionButton.this.R : -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getHeight() {
            if (ExtendedFloatingActionButton.this.R == -1) {
                return this.f54217a.getHeight();
            }
            return (ExtendedFloatingActionButton.this.R == 0 || ExtendedFloatingActionButton.this.R == -2) ? this.f54218b.getHeight() : ExtendedFloatingActionButton.this.R;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.K;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getPaddingStart() {
            return ExtendedFloatingActionButton.this.J;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.n
        public int getWidth() {
            if (ExtendedFloatingActionButton.this.Q == -1) {
                return this.f54217a.getWidth();
            }
            return (ExtendedFloatingActionButton.this.Q == 0 || ExtendedFloatingActionButton.this.Q == -2) ? this.f54218b.getWidth() : ExtendedFloatingActionButton.this.Q;
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f54220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.f f54221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f54222d;

        e(com.google.android.material.floatingactionbutton.f fVar, l lVar) {
            this.f54221c = fVar;
            this.f54222d = lVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f54220b = true;
            this.f54221c.j();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54221c.a();
            if (this.f54220b) {
                return;
            }
            this.f54221c.h(this.f54222d);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f54221c.onAnimationStart(animator);
            this.f54220b = false;
        }
    }

    public class f extends Property<View, Float> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@n0 View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@n0 View view, @n0 Float f10) {
            view.getLayoutParams().width = f10.intValue();
            view.requestLayout();
        }
    }

    public class g extends Property<View, Float> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@n0 View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@n0 View view, @n0 Float f10) {
            view.getLayoutParams().height = f10.intValue();
            view.requestLayout();
        }
    }

    public class h extends Property<View, Float> {
        h(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@n0 View view) {
            return Float.valueOf(androidx.core.view.j1.k0(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@n0 View view, @n0 Float f10) {
            androidx.core.view.j1.d2(view, f10.intValue(), view.getPaddingTop(), androidx.core.view.j1.j0(view), view.getPaddingBottom());
        }
    }

    public class i extends Property<View, Float> {
        i(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @n0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(@n0 View view) {
            return Float.valueOf(androidx.core.view.j1.j0(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@n0 View view, @n0 Float f10) {
            androidx.core.view.j1.d2(view, androidx.core.view.j1.k0(view), view.getPaddingTop(), f10.intValue(), view.getPaddingBottom());
        }
    }

    public class j extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final n f54224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f54225h;

        j(com.google.android.material.floatingactionbutton.a aVar, n nVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f54224g = nVar;
            this.f54225h = z10;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.N = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f54224g.a().width;
            layoutParams.height = this.f54224g.a().height;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return this.f54225h == ExtendedFloatingActionButton.this.M || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return this.f54225h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        @n0
        public AnimatorSet g() {
            com.google.android.material.animation.i iVarB = b();
            if (iVarB.j("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrG = iVarB.g("width");
                propertyValuesHolderArrG[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f54224g.getWidth());
                iVarB.l("width", propertyValuesHolderArrG);
            }
            if (iVarB.j("height")) {
                PropertyValuesHolder[] propertyValuesHolderArrG2 = iVarB.g("height");
                propertyValuesHolderArrG2[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f54224g.getHeight());
                iVarB.l("height", propertyValuesHolderArrG2);
            }
            if (iVarB.j("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrG3 = iVarB.g("paddingStart");
                propertyValuesHolderArrG3[0].setFloatValues(androidx.core.view.j1.k0(ExtendedFloatingActionButton.this), this.f54224g.getPaddingStart());
                iVarB.l("paddingStart", propertyValuesHolderArrG3);
            }
            if (iVarB.j("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrG4 = iVarB.g("paddingEnd");
                propertyValuesHolderArrG4[0].setFloatValues(androidx.core.view.j1.j0(ExtendedFloatingActionButton.this), this.f54224g.getPaddingEnd());
                iVarB.l("paddingEnd", propertyValuesHolderArrG4);
            }
            if (iVarB.j("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrG5 = iVarB.g("labelOpacity");
                boolean z10 = this.f54225h;
                propertyValuesHolderArrG5[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
                iVarB.l("labelOpacity", propertyValuesHolderArrG5);
            }
            return super.o(iVarB);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void h(@p0 l lVar) {
            if (lVar == null) {
                return;
            }
            if (this.f54225h) {
                lVar.a(ExtendedFloatingActionButton.this);
            } else {
                lVar.d(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void i() {
            ExtendedFloatingActionButton.this.M = this.f54225h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!this.f54225h) {
                ExtendedFloatingActionButton.this.Q = layoutParams.width;
                ExtendedFloatingActionButton.this.R = layoutParams.height;
            }
            layoutParams.width = this.f54224g.a().width;
            layoutParams.height = this.f54224g.a().height;
            androidx.core.view.j1.d2(ExtendedFloatingActionButton.this, this.f54224g.getPaddingStart(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f54224g.getPaddingEnd(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.M = this.f54225h;
            ExtendedFloatingActionButton.this.N = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    public class k extends com.google.android.material.floatingactionbutton.b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f54227g;

        public k(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.C = 0;
            if (this.f54227g) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.K();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void h(@p0 l lVar) {
            if (lVar != null) {
                lVar.b(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void i() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void j() {
            super.j();
            this.f54227g = true;
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f54227g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.C = 1;
        }
    }

    public static abstract class l {
        public void a(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void b(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void c(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void d(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    public class m extends com.google.android.material.floatingactionbutton.b {
        public m(com.google.android.material.floatingactionbutton.a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void a() {
            super.a();
            ExtendedFloatingActionButton.this.C = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public boolean d() {
            return ExtendedFloatingActionButton.this.L();
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public int f() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void h(@p0 l lVar) {
            if (lVar != null) {
                lVar.c(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.f
        public void i() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        @Override // com.google.android.material.floatingactionbutton.b, com.google.android.material.floatingactionbutton.f
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.C = 2;
        }
    }

    public interface n {
        ViewGroup.LayoutParams a();

        int getHeight();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(@n0 Context context) {
        this(context, null);
    }

    public ExtendedFloatingActionButton(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = T;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.C = 0;
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a();
        this.D = aVar;
        m mVar = new m(aVar);
        this.G = mVar;
        k kVar = new k(aVar);
        this.H = kVar;
        this.M = true;
        this.N = false;
        this.O = false;
        Context context2 = getContext();
        this.L = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayK = c0.k(context2, attributeSet, R.styleable.U, i10, i11, new int[0]);
        com.google.android.material.animation.i iVarC = com.google.android.material.animation.i.c(context2, typedArrayK, R.styleable.ExtendedFloatingActionButton_showMotionSpec);
        com.google.android.material.animation.i iVarC2 = com.google.android.material.animation.i.c(context2, typedArrayK, R.styleable.ExtendedFloatingActionButton_hideMotionSpec);
        com.google.android.material.animation.i iVarC3 = com.google.android.material.animation.i.c(context2, typedArrayK, R.styleable.ExtendedFloatingActionButton_extendMotionSpec);
        com.google.android.material.animation.i iVarC4 = com.google.android.material.animation.i.c(context2, typedArrayK, R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec);
        this.I = typedArrayK.getDimensionPixelSize(R.styleable.ExtendedFloatingActionButton_collapsedSize, -1);
        int i12 = typedArrayK.getInt(R.styleable.ExtendedFloatingActionButton_extendStrategy, 1);
        this.S = i12;
        this.J = androidx.core.view.j1.k0(this);
        this.K = androidx.core.view.j1.j0(this);
        com.google.android.material.floatingactionbutton.a aVar2 = new com.google.android.material.floatingactionbutton.a();
        j jVar = new j(aVar2, G(i12), true);
        this.F = jVar;
        j jVar2 = new j(aVar2, new a(), false);
        this.E = jVar2;
        mVar.l(iVarC);
        kVar.l(iVarC2);
        jVar.l(iVarC3);
        jVar2.l(iVarC4);
        typedArrayK.recycle();
        setShapeAppearanceModel(p.g(context2, attributeSet, i10, i11, p.f55125m).m());
        R();
    }

    private n G(int i10) {
        b bVar = new b();
        c cVar = new c(bVar);
        d dVar = new d(cVar, bVar);
        if (i10 != 1) {
            return i10 != 2 ? dVar : cVar;
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        if (getVisibility() == 0) {
            return this.C == 1;
        }
        return this.C != 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean L() {
        if (getVisibility() != 0) {
            return this.C == 2;
        }
        return this.C != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i10, @p0 l lVar) {
        com.google.android.material.floatingactionbutton.f fVar;
        if (i10 == 0) {
            fVar = this.G;
        } else if (i10 == 1) {
            fVar = this.H;
        } else if (i10 == 2) {
            fVar = this.E;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("Unknown strategy type: " + i10);
            }
            fVar = this.F;
        }
        if (fVar.d()) {
            return;
        }
        if (!S()) {
            fVar.i();
            fVar.h(lVar);
            return;
        }
        if (i10 == 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                this.Q = layoutParams.width;
                this.R = layoutParams.height;
            } else {
                this.Q = getWidth();
                this.R = getHeight();
            }
        }
        measure(0, 0);
        AnimatorSet animatorSetG = fVar.g();
        animatorSetG.addListener(new e(fVar, lVar));
        Iterator<Animator.AnimatorListener> it = fVar.m().iterator();
        while (it.hasNext()) {
            animatorSetG.addListener(it.next());
        }
        animatorSetG.start();
    }

    private void R() {
        this.P = getTextColors();
    }

    private boolean S() {
        return (androidx.core.view.j1.U0(this) || (!L() && this.O)) && !isInEditMode();
    }

    public void A(@n0 Animator.AnimatorListener animatorListener) {
        this.F.k(animatorListener);
    }

    public void B(@n0 Animator.AnimatorListener animatorListener) {
        this.H.k(animatorListener);
    }

    public void C(@n0 Animator.AnimatorListener animatorListener) {
        this.G.k(animatorListener);
    }

    public void D(@n0 Animator.AnimatorListener animatorListener) {
        this.E.k(animatorListener);
    }

    public void E() {
        M(3, null);
    }

    public void F(@n0 l lVar) {
        M(3, lVar);
    }

    public void H() {
        M(1, null);
    }

    public void I(@n0 l lVar) {
        M(1, lVar);
    }

    public final boolean J() {
        return this.M;
    }

    public void N(@n0 Animator.AnimatorListener animatorListener) {
        this.F.e(animatorListener);
    }

    public void O(@n0 Animator.AnimatorListener animatorListener) {
        this.H.e(animatorListener);
    }

    public void P(@n0 Animator.AnimatorListener animatorListener) {
        this.G.e(animatorListener);
    }

    public void Q(@n0 Animator.AnimatorListener animatorListener) {
        this.E.e(animatorListener);
    }

    public void T() {
        M(0, null);
    }

    public void U(@n0 l lVar) {
        M(0, lVar);
    }

    public void V() {
        M(2, null);
    }

    public void W(@n0 l lVar) {
        M(2, lVar);
    }

    protected void X(@n0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @n0
    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.L;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @j1
    int getCollapsedSize() {
        int i10 = this.I;
        return i10 < 0 ? (Math.min(androidx.core.view.j1.k0(this), androidx.core.view.j1.j0(this)) * 2) + getIconSize() : i10;
    }

    @p0
    public com.google.android.material.animation.i getExtendMotionSpec() {
        return this.F.c();
    }

    @p0
    public com.google.android.material.animation.i getHideMotionSpec() {
        return this.H.c();
    }

    @p0
    public com.google.android.material.animation.i getShowMotionSpec() {
        return this.G.c();
    }

    @p0
    public com.google.android.material.animation.i getShrinkMotionSpec() {
        return this.E.c();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.M && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.M = false;
            this.E.i();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.O = z10;
    }

    public void setExtendMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.F.l(iVar);
    }

    public void setExtendMotionSpecResource(@androidx.annotation.b int i10) {
        setExtendMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (this.M == z10) {
            return;
        }
        com.google.android.material.floatingactionbutton.f fVar = z10 ? this.F : this.E;
        if (fVar.d()) {
            return;
        }
        fVar.i();
    }

    public void setHideMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.H.l(iVar);
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int i10) {
        setHideMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (!this.M || this.N) {
            return;
        }
        this.J = androidx.core.view.j1.k0(this);
        this.K = androidx.core.view.j1.j0(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (!this.M || this.N) {
            return;
        }
        this.J = i10;
        this.K = i12;
    }

    public void setShowMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.G.l(iVar);
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int i10) {
        setShowMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    public void setShrinkMotionSpec(@p0 com.google.android.material.animation.i iVar) {
        this.E.l(iVar);
    }

    public void setShrinkMotionSpecResource(@androidx.annotation.b int i10) {
        setShrinkMotionSpec(com.google.android.material.animation.i.d(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        R();
    }

    @Override // android.widget.TextView
    public void setTextColor(@n0 ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        R();
    }
}
