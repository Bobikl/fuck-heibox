package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.c3;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends AbsActionBarView {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f2285k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f2286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f2287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f2288n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f2289o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LinearLayout f2290p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f2291q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f2292r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f2293s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f2294t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f2295u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f2296v;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f2297b;

        a(androidx.appcompat.view.b bVar) {
            this.f2297b = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f2297b.c();
        }
    }

    public ActionBarContextView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public ActionBarContextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        x0 x0VarG = x0.G(context, attributeSet, R.styleable.f1572e, i10, 0);
        j1.I1(this, x0VarG.h(R.styleable.ActionMode_background));
        this.f2293s = x0VarG.u(R.styleable.ActionMode_titleTextStyle, 0);
        this.f2294t = x0VarG.u(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.f2267f = x0VarG.q(R.styleable.ActionMode_height, 0);
        this.f2296v = x0VarG.u(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        x0VarG.I();
    }

    private void r() {
        if (this.f2290p == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2290p = linearLayout;
            this.f2291q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f2292r = (TextView) this.f2290p.findViewById(R.id.action_bar_subtitle);
            if (this.f2293s != 0) {
                this.f2291q.setTextAppearance(getContext(), this.f2293s);
            }
            if (this.f2294t != 0) {
                this.f2292r.setTextAppearance(getContext(), this.f2294t);
            }
        }
        this.f2291q.setText(this.f2285k);
        this.f2292r.setText(this.f2286l);
        boolean z10 = !TextUtils.isEmpty(this.f2285k);
        boolean z11 = !TextUtils.isEmpty(this.f2286l);
        int i10 = 0;
        this.f2292r.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f2290p;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f2290p.getParent() == null) {
            addView(this.f2290p);
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void c(int i10) {
        super.c(i10);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2286l;
    }

    public CharSequence getTitle() {
        return this.f2285k;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public /* bridge */ /* synthetic */ c3 n(int i10, long j10) {
        return super.n(i10, j10);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.E();
            this.f2266e.F();
        }
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = h1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2287m;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2287m.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iK = AbsActionBarView.k(paddingRight, i14, zB);
            paddingRight = AbsActionBarView.k(iK + l(this.f2287m, iK, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iL = paddingRight;
        LinearLayout linearLayout = this.f2290p;
        if (linearLayout != null && this.f2289o == null && linearLayout.getVisibility() != 8) {
            iL += l(this.f2290p, iL, paddingTop, paddingTop2, zB);
        }
        int i16 = iL;
        View view2 = this.f2289o;
        if (view2 != null) {
            l(view2, i16, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f2265d;
        if (actionMenuView != null) {
            l(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f2267f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f2287m;
        if (view != null) {
            int iJ = j(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2287m.getLayoutParams();
            paddingLeft = iJ - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f2265d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = j(this.f2265d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f2290p;
        if (linearLayout != null && this.f2289o == null) {
            if (this.f2295u) {
                this.f2290p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f2290p.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f2290p.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = j(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f2289o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f2289o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f2267f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f2287m == null) {
            t();
        }
    }

    public void q(androidx.appcompat.view.b bVar) {
        View view = this.f2287m;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f2296v, (ViewGroup) this, false);
            this.f2287m = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f2287m);
        }
        View viewFindViewById = this.f2287m.findViewById(R.id.action_mode_close_button);
        this.f2288n = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f2266e = actionMenuPresenter2;
        actionMenuPresenter2.O(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f2266e, this.f2264c);
        ActionMenuView actionMenuView = (ActionMenuView) this.f2266e.m(this);
        this.f2265d = actionMenuView;
        j1.I1(actionMenuView, null);
        addView(this.f2265d, layoutParams);
    }

    public boolean s() {
        return this.f2295u;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i10) {
        this.f2267f = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2289o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2289o = view;
        if (view != null && (linearLayout = this.f2290p) != null) {
            removeView(linearLayout);
            this.f2290p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2286l = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2285k = charSequence;
        r();
        j1.E1(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f2295u) {
            requestLayout();
        }
        this.f2295u = z10;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.f2289o = null;
        this.f2265d = null;
        this.f2266e = null;
        View view = this.f2288n;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }
}
