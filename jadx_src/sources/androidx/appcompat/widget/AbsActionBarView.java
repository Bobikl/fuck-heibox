package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.core.view.c3;
import androidx.core.view.d3;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsActionBarView extends ViewGroup {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f2262j = 200;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final b f2263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f2264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ActionMenuView f2265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected ActionMenuPresenter f2266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f2267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected c3 f2268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2270i;

    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsActionBarView.this.o();
        }
    }

    public class b implements d3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2272a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2273b;

        protected b() {
        }

        @Override // androidx.core.view.d3
        public void a(View view) {
            this.f2272a = true;
        }

        @Override // androidx.core.view.d3
        public void b(View view) {
            if (this.f2272a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f2268g = null;
            AbsActionBarView.super.setVisibility(this.f2273b);
        }

        @Override // androidx.core.view.d3
        public void c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f2272a = false;
        }

        public b d(c3 c3Var, int i10) {
            AbsActionBarView.this.f2268g = c3Var;
            this.f2273b = i10;
            return this;
        }
    }

    AbsActionBarView(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    AbsActionBarView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    AbsActionBarView(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2263b = new b();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2264c = context;
        } else {
            this.f2264c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int k(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public void c(int i10) {
        n(i10, 200L).y();
    }

    public boolean d() {
        return i() && getVisibility() == 0;
    }

    public void e() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    public boolean g() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.G();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f2268g != null ? this.f2263b.f2273b : getVisibility();
    }

    public int getContentHeight() {
        return this.f2267f;
    }

    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    public boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        return actionMenuPresenter != null && actionMenuPresenter.I();
    }

    protected int j(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int l(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public void m() {
        post(new a());
    }

    public c3 n(int i10, long j10) {
        c3 c3Var = this.f2268g;
        if (c3Var != null) {
            c3Var.d();
        }
        if (i10 != 0) {
            c3 c3VarB = j1.g(this).b(0.0f);
            c3VarB.s(j10);
            c3VarB.u(this.f2263b.d(c3VarB, i10));
            return c3VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        c3 c3VarB2 = j1.g(this).b(1.0f);
        c3VarB2.s(j10);
        c3VarB2.u(this.f2263b.d(c3VarB2, i10));
        return c3VarB2;
    }

    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, R.styleable.f1568a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f2266e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.J(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2270i = false;
        }
        if (!this.f2270i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f2270i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2270i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2269h = false;
        }
        if (!this.f2269h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f2269h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2269h = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f2267f = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            c3 c3Var = this.f2268g;
            if (c3Var != null) {
                c3Var.d();
            }
            super.setVisibility(i10);
        }
    }
}
