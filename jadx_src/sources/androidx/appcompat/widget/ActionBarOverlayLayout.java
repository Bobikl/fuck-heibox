package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;
import androidx.core.view.n3;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements z, androidx.core.view.x0, androidx.core.view.v0, androidx.core.view.w0 {
    private static final String G = "ActionBarOverlayLayout";
    private static final int H = 600;
    static final int[] I = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    private OverScroller A;
    ViewPropertyAnimator B;
    final AnimatorListenerAdapter C;
    private final Runnable D;
    private final Runnable E;
    private final androidx.core.view.y0 F;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ContentFrameLayout f2301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ActionBarContainer f2302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a0 f2303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f2304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f2307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f2309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f2311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f2312o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f2313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f2314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f2315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f2316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f2317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Rect f2318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    private n3 f2319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    private n3 f2320w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    private n3 f2321x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    private n3 f2322y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private d f2323z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f2309l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = null;
            actionBarOverlayLayout.f2309l = false;
        }
    }

    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.s();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f2302e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.s();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.B = actionBarOverlayLayout.f2302e.animate().translationY(-ActionBarOverlayLayout.this.f2302e.getHeight()).setListener(ActionBarOverlayLayout.this.C);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();

        void e(boolean z10);

        void onWindowVisibilityChanged(int i10);
    }

    public ActionBarOverlayLayout(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2300c = 0;
        this.f2312o = new Rect();
        this.f2313p = new Rect();
        this.f2314q = new Rect();
        this.f2315r = new Rect();
        this.f2316s = new Rect();
        this.f2317t = new Rect();
        this.f2318u = new Rect();
        n3 n3Var = n3.f21708c;
        this.f2319v = n3Var;
        this.f2320w = n3Var;
        this.f2321x = n3Var;
        this.f2322y = n3Var;
        this.C = new a();
        this.D = new b();
        this.E = new c();
        t(context);
        this.F = new androidx.core.view.y0(this);
    }

    private boolean A(float f10) {
        this.A.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.A.getFinalY() > this.f2302e.getHeight();
    }

    private void a() {
        s();
        this.E.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean o(@androidx.annotation.n0 View view, @androidx.annotation.n0 Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private a0 r(View view) {
        if (view instanceof a0) {
            return (a0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void t(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(I);
        this.f2299b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f2304g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f2305h = context.getApplicationInfo().targetSdkVersion < 19;
        this.A = new OverScroller(context);
    }

    private void w() {
        s();
        postDelayed(this.E, 600L);
    }

    private void x() {
        s();
        postDelayed(this.D, 600L);
    }

    private void z() {
        s();
        this.D.run();
    }

    @Override // androidx.core.view.v0
    public void G(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // androidx.core.view.v0
    public void O(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.z
    public boolean b() {
        y();
        return this.f2303f.b();
    }

    @Override // androidx.appcompat.widget.z
    public boolean c() {
        y();
        return this.f2303f.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.z
    public boolean d() {
        y();
        return this.f2303f.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2304g == null || this.f2305h) {
            return;
        }
        int bottom = this.f2302e.getVisibility() == 0 ? (int) (this.f2302e.getBottom() + this.f2302e.getTranslationY() + 0.5f) : 0;
        this.f2304g.setBounds(0, bottom, getWidth(), this.f2304g.getIntrinsicHeight() + bottom);
        this.f2304g.draw(canvas);
    }

    @Override // androidx.appcompat.widget.z
    public boolean e() {
        y();
        return this.f2303f.e();
    }

    @Override // androidx.appcompat.widget.z
    public boolean f() {
        y();
        return this.f2303f.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.z
    public boolean g() {
        y();
        return this.f2303f.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2302e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.x0
    public int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // androidx.appcompat.widget.z
    public CharSequence getTitle() {
        y();
        return this.f2303f.getTitle();
    }

    @Override // androidx.appcompat.widget.z
    public boolean h() {
        y();
        return this.f2303f.h();
    }

    @Override // androidx.core.view.w0
    public void h0(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        G(view, i10, i11, i12, i13, i14);
    }

    @Override // androidx.appcompat.widget.z
    public void i(SparseArray<Parcelable> sparseArray) {
        y();
        this.f2303f.x(sparseArray);
    }

    @Override // androidx.core.view.v0
    public void j(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.v0
    public boolean j0(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // androidx.core.view.v0
    public void k(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.appcompat.widget.z
    public void l(SparseArray<Parcelable> sparseArray) {
        y();
        this.f2303f.P(sparseArray);
    }

    @Override // androidx.appcompat.widget.z
    public void m(int i10) {
        y();
        if (i10 == 2) {
            this.f2303f.q();
        } else if (i10 == 5) {
            this.f2303f.B();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.z
    public void n() {
        y();
        this.f2303f.t();
    }

    @Override // android.view.View
    @androidx.annotation.w0(21)
    public WindowInsets onApplyWindowInsets(@androidx.annotation.n0 WindowInsets windowInsets) {
        y();
        n3 n3VarL = n3.L(windowInsets, this);
        boolean zO = o(this.f2302e, new Rect(n3VarL.p(), n3VarL.r(), n3VarL.q(), n3VarL.o()), true, true, false, true);
        j1.o(this, n3VarL, this.f2312o);
        Rect rect = this.f2312o;
        n3 n3VarX = n3VarL.x(rect.left, rect.top, rect.right, rect.bottom);
        this.f2319v = n3VarX;
        boolean z10 = true;
        if (!this.f2320w.equals(n3VarX)) {
            this.f2320w = this.f2319v;
            zO = true;
        }
        if (this.f2313p.equals(this.f2312o)) {
            z10 = zO;
        } else {
            this.f2313p.set(this.f2312o);
        }
        if (z10) {
            requestLayout();
        }
        return n3VarL.a().c().b().J();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t(getContext());
        j1.v1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        y();
        measureChildWithMargins(this.f2302e, i10, 0, i11, 0);
        LayoutParams layoutParams = (LayoutParams) this.f2302e.getLayoutParams();
        int iMax = Math.max(0, this.f2302e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.f2302e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f2302e.getMeasuredState());
        boolean z10 = (j1.C0(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f2299b;
            if (this.f2307j && this.f2302e.getTabContainer() != null) {
                measuredHeight += this.f2299b;
            }
        } else {
            measuredHeight = this.f2302e.getVisibility() != 8 ? this.f2302e.getMeasuredHeight() : 0;
        }
        this.f2314q.set(this.f2312o);
        n3 n3Var = this.f2319v;
        this.f2321x = n3Var;
        if (this.f2306i || z10) {
            this.f2321x = new n3.b(this.f2321x).h(androidx.core.graphics.h0.d(n3Var.p(), this.f2321x.r() + measuredHeight, this.f2321x.q(), this.f2321x.o() + 0)).a();
        } else {
            Rect rect = this.f2314q;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f2321x = n3Var.x(0, measuredHeight, 0, 0);
        }
        o(this.f2301d, this.f2314q, true, true, true, true);
        if (!this.f2322y.equals(this.f2321x)) {
            n3 n3Var2 = this.f2321x;
            this.f2322y = n3Var2;
            j1.p(this.f2301d, n3Var2);
        }
        measureChildWithMargins(this.f2301d, i10, 0, i11, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f2301d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f2301d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f2301d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f2301d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f2308k || !z10) {
            return false;
        }
        if (A(f11)) {
            a();
        } else {
            z();
        }
        this.f2309l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f2310m + i11;
        this.f2310m = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.F.b(view, view2, i10);
        this.f2310m = getActionBarHideOffset();
        s();
        d dVar = this.f2323z;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f2302e.getVisibility() != 0) {
            return false;
        }
        return this.f2308k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.x0
    public void onStopNestedScroll(View view) {
        if (this.f2308k && !this.f2309l) {
            if (this.f2310m <= this.f2302e.getHeight()) {
                x();
            } else {
                w();
            }
        }
        d dVar = this.f2323z;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        y();
        int i11 = this.f2311n ^ i10;
        this.f2311n = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f2323z;
        if (dVar != null) {
            dVar.e(!z11);
            if (z10 || !z11) {
                this.f2323z.a();
            } else {
                this.f2323z.c();
            }
        }
        if ((i11 & 256) == 0 || this.f2323z == null) {
            return;
        }
        j1.v1(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f2300c = i10;
        d dVar = this.f2323z;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    void s() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.B;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void setActionBarHideOffset(int i10) {
        s();
        this.f2302e.setTranslationY(-Math.max(0, Math.min(i10, this.f2302e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f2323z = dVar;
        if (getWindowToken() != null) {
            this.f2323z.onWindowVisibilityChanged(this.f2300c);
            int i10 = this.f2311n;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                j1.v1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f2307j = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f2308k) {
            this.f2308k = z10;
            if (z10) {
                return;
            }
            s();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.z
    public void setIcon(int i10) {
        y();
        this.f2303f.setIcon(i10);
    }

    @Override // androidx.appcompat.widget.z
    public void setIcon(Drawable drawable) {
        y();
        this.f2303f.setIcon(drawable);
    }

    @Override // androidx.appcompat.widget.z
    public void setLogo(int i10) {
        y();
        this.f2303f.setLogo(i10);
    }

    @Override // androidx.appcompat.widget.z
    public void setMenu(Menu menu, androidx.appcompat.view.menu.m.a aVar) {
        y();
        this.f2303f.setMenu(menu, aVar);
    }

    @Override // androidx.appcompat.widget.z
    public void setMenuPrepared() {
        y();
        this.f2303f.setMenuPrepared();
    }

    public void setOverlayMode(boolean z10) {
        this.f2306i = z10;
        this.f2305h = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    @Override // androidx.appcompat.widget.z
    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.z
    public void setWindowCallback(Window.Callback callback) {
        y();
        this.f2303f.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.z
    public void setWindowTitle(CharSequence charSequence) {
        y();
        this.f2303f.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean u() {
        return this.f2308k;
    }

    public boolean v() {
        return this.f2306i;
    }

    void y() {
        if (this.f2301d == null) {
            this.f2301d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2302e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            this.f2303f = r(findViewById(R.id.action_bar));
        }
    }
}
