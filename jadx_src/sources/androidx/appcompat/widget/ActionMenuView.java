package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements androidx.appcompat.view.menu.g.b, androidx.appcompat.view.menu.n {
    private static final String O = "ActionMenuView";
    static final int P = 56;
    static final int Q = 4;
    private androidx.appcompat.view.menu.g C;
    private Context D;
    private int E;
    private boolean F;
    private ActionMenuPresenter G;
    private androidx.appcompat.view.menu.m.a H;
    androidx.appcompat.view.menu.g.a I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    d N;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f2353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public int f2354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f2356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f2357f;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f2352a = false;
        }

        LayoutParams(int i10, int i11, boolean z10) {
            super(i10, i11);
            this.f2352a = z10;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f2352a = layoutParams.f2352a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements androidx.appcompat.view.menu.m.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar) {
            return false;
        }
    }

    public class c implements androidx.appcompat.view.menu.g.a {
        c() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar, @androidx.annotation.n0 MenuItem menuItem) {
            d dVar = ActionMenuView.this.N;
            return dVar != null && dVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(@androidx.annotation.n0 androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.g.a aVar = ActionMenuView.this.I;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public ActionMenuView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.L = (int) (56.0f * f10);
        this.M = (int) (f10 * 4.0f);
        this.D = context;
        this.E = 0;
    }

    static int M(View view, int i10, int i11, int i12, int i13) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.f();
        int i14 = 2;
        if (i11 <= 0 || (z10 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z10 || i15 >= 2) {
                i14 = i15;
            }
        }
        layoutParams.f2355d = !layoutParams.f2352a && z10;
        layoutParams.f2353b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), iMakeMeasureSpec);
        return i14;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    private void N(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i14 = size - paddingLeft;
        int i15 = this.L;
        int i16 = i14 / i15;
        int i17 = i14 % i15;
        if (i16 == 0) {
            setMeasuredDimension(i14, 0);
            return;
        }
        int i18 = i15 + (i17 / i16);
        int childCount = getChildCount();
        int iMax = 0;
        int i19 = 0;
        boolean z12 = false;
        int i20 = 0;
        int iMax2 = 0;
        int i21 = 0;
        long j10 = 0;
        while (i19 < childCount) {
            View childAt = getChildAt(i19);
            int i22 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z13 = childAt instanceof ActionMenuItemView;
                int i23 = i20 + 1;
                if (z13) {
                    int i24 = this.M;
                    r14 = 0;
                    childAt.setPadding(i24, 0, i24, 0);
                } else {
                    r14 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.f2357f = r14;
                layoutParams.f2354c = r14;
                layoutParams.f2353b = r14;
                layoutParams.f2355d = r14;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r14;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r14;
                layoutParams.f2356e = z13 && ((ActionMenuItemView) childAt).f();
                int iM = M(childAt, i18, layoutParams.f2352a ? 1 : i16, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iM);
                if (layoutParams.f2355d) {
                    i21++;
                }
                if (layoutParams.f2352a) {
                    z12 = true;
                }
                i16 -= iM;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM == 1) {
                    j10 |= (long) (1 << i19);
                    iMax = iMax;
                }
                i20 = i23;
            }
            i19++;
            size2 = i22;
        }
        int i25 = size2;
        boolean z14 = z12 && i20 == 2;
        boolean z15 = false;
        while (true) {
            if (i21 <= 0 || i16 <= 0) {
                z10 = z15;
                i12 = iMax;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            int i27 = 0;
            int i28 = 0;
            long j11 = 0;
            while (i28 < childCount) {
                boolean z16 = z15;
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i28).getLayoutParams();
                int i29 = iMax;
                if (layoutParams2.f2355d) {
                    int i30 = layoutParams2.f2353b;
                    if (i30 < i26) {
                        j11 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        i27++;
                        j11 |= 1 << i28;
                    }
                }
                i28++;
                iMax = i29;
                z15 = z16;
            }
            z10 = z15;
            i12 = iMax;
            j10 |= j11;
            if (i27 > i16) {
                break;
            }
            int i31 = i26 + 1;
            int i32 = 0;
            while (i32 < childCount) {
                View childAt2 = getChildAt(i32);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                int i33 = i14;
                int i34 = mode;
                long j12 = 1 << i32;
                if ((j11 & j12) == 0) {
                    if (layoutParams3.f2353b == i31) {
                        j10 |= j12;
                    }
                    z14 = z14;
                } else {
                    if (z14 && layoutParams3.f2356e && i16 == 1) {
                        int i35 = this.M;
                        childAt2.setPadding(i35 + i18, 0, i35, 0);
                    }
                    layoutParams3.f2353b++;
                    layoutParams3.f2357f = true;
                    i16--;
                }
                i32++;
                mode = i34;
                i14 = i33;
                z14 = z14;
            }
            iMax = i12;
            z15 = true;
        }
        boolean z17 = !z12 && i20 == 1;
        if (i16 <= 0 || j10 == 0 || (i16 >= i20 - 1 && !z17 && iMax2 <= 1)) {
            i13 = 0;
            z11 = z10;
        } else {
            float fBitCount = Long.bitCount(j10);
            if (z17) {
                i13 = 0;
            } else {
                i13 = 0;
                if ((j10 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f2356e) {
                    fBitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j10 & ((long) (1 << i36))) != 0 && !((LayoutParams) getChildAt(i36).getLayoutParams()).f2356e) {
                    fBitCount -= 0.5f;
                }
            }
            int i37 = fBitCount > 0.0f ? (int) ((i16 * i18) / fBitCount) : i13;
            z11 = z10;
            for (int i38 = i13; i38 < childCount; i38++) {
                if ((j10 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f2354c = i37;
                        layoutParams4.f2357f = true;
                        if (i38 == 0 && !layoutParams4.f2356e) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i37) / 2;
                        }
                        z11 = true;
                    } else if (layoutParams4.f2352a) {
                        layoutParams4.f2354c = i37;
                        layoutParams4.f2357f = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i37) / 2;
                        z11 = true;
                    } else {
                        if (i38 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i37 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i39 = i13; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.f2357f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.f2353b * i18) + layoutParams5.f2354c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i14, mode != 1073741824 ? i12 : i25);
    }

    public void C() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public LayoutParams G() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f2352a = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected boolean H(int i10) {
        boolean zA = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            zA = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? zA : zA | ((a) childAt2).b();
    }

    public boolean I() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.E();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean J() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.G();
    }

    public boolean K() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.H();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean L() {
        return this.F;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.appcompat.view.menu.g O() {
        return this.C;
    }

    public boolean P() {
        ActionMenuPresenter actionMenuPresenter = this.G;
        return actionMenuPresenter != null && actionMenuPresenter.Q();
    }

    @Override // androidx.appcompat.view.menu.n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void a(androidx.appcompat.view.menu.g gVar) {
        this.C = gVar;
    }

    @Override // androidx.appcompat.view.menu.g.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean b(androidx.appcompat.view.menu.j jVar) {
        return this.C.O(jVar, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.C == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
            this.C = gVar;
            gVar.X(new c());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.G = actionMenuPresenter;
            actionMenuPresenter.O(true);
            ActionMenuPresenter actionMenuPresenter2 = this.G;
            androidx.appcompat.view.menu.m.a bVar = this.H;
            if (bVar == null) {
                bVar = new b();
            }
            actionMenuPresenter2.i(bVar);
            this.C.c(this.G, this.D);
            this.G.M(this);
        }
        return this.C;
    }

    @androidx.annotation.p0
    public Drawable getOverflowIcon() {
        getMenu();
        return this.G.D();
    }

    public int getPopupTheme() {
        return this.E;
    }

    @Override // androidx.appcompat.view.menu.n
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.G;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.e(false);
            if (this.G.H()) {
                this.G.E();
                this.G.Q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int paddingLeft;
        if (!this.J) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i14 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i15 = i12 - i10;
        int paddingRight = (i15 - getPaddingRight()) - getPaddingLeft();
        boolean zB = h1.b(this);
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f2352a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (H(i18)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i19 = i14 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i19, width, measuredHeight + i19);
                    paddingRight -= measuredWidth;
                    i16 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    H(i18);
                    i17++;
                }
            }
        }
        if (childCount == 1 && i16 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i20 = (i15 / 2) - (measuredWidth2 / 2);
            int i21 = i14 - (measuredHeight2 / 2);
            childAt2.layout(i20, i21, measuredWidth2 + i20, measuredHeight2 + i21);
            return;
        }
        int i22 = i17 - (i16 ^ 1);
        int iMax = Math.max(0, i22 > 0 ? paddingRight / i22 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i23 = 0; i23 < childCount; i23++) {
                View childAt3 = getChildAt(i23);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f2352a) {
                    int i24 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i25 = i14 - (measuredHeight3 / 2);
                    childAt3.layout(i24 - measuredWidth3, i25, i24, measuredHeight3 + i25);
                    width2 = i24 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt4 = getChildAt(i26);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f2352a) {
                int i27 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i28 = i14 - (measuredHeight4 / 2);
                childAt4.layout(i27, i28, i27 + measuredWidth4, measuredHeight4 + i28);
                paddingLeft2 = i27 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        androidx.appcompat.view.menu.g gVar;
        boolean z10 = this.J;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.J = z11;
        if (z10 != z11) {
            this.K = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.J && (gVar = this.C) != null && size != this.K) {
            this.K = size;
            gVar.N(true);
        }
        int childCount = getChildCount();
        if (this.J && childCount > 0) {
            N(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setExpandedActionViewsExclusive(boolean z10) {
        this.G.K(z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setMenuCallbacks(androidx.appcompat.view.menu.m.a aVar, androidx.appcompat.view.menu.g.a aVar2) {
        this.H = aVar;
        this.I = aVar2;
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.N = dVar;
    }

    public void setOverflowIcon(@androidx.annotation.p0 Drawable drawable) {
        getMenu();
        this.G.N(drawable);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverflowReserved(boolean z10) {
        this.F = z10;
    }

    public void setPopupTheme(@androidx.annotation.e1 int i10) {
        if (this.E != i10) {
            this.E = i10;
            if (i10 == 0) {
                this.D = getContext();
            } else {
                this.D = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.G = actionMenuPresenter;
        actionMenuPresenter.M(this);
    }
}
