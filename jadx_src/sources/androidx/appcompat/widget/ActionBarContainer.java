package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f2276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f2277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f2278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f2279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f2280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Drawable f2281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f2282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f2283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f2284k;

    @androidx.annotation.w0(21)
    public static class a {
        private a() {
        }

        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j1.I1(this, new androidx.appcompat.widget.a(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f1568a);
        this.f2279f = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.f2280g = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.f2284k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        boolean z10 = true;
        if (getId() == R.id.split_action_bar) {
            this.f2282i = true;
            this.f2281h = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f2282i ? this.f2279f != null || this.f2280g != null : this.f2281h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2279f;
        if (drawable != null && drawable.isStateful()) {
            this.f2279f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2280g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2280g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2281h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2281h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2276c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2279f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2280g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2281h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2277d = findViewById(R.id.action_bar);
        this.f2278e = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2275b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[PHI: r0
  0x0048: PHI (r0v8 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00a5, B:33:0x00a9, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f2276c;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f2282i) {
            Drawable drawable2 = this.f2281h;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f2279f != null) {
                if (this.f2277d.getVisibility() == 0) {
                    this.f2279f.setBounds(this.f2277d.getLeft(), this.f2277d.getTop(), this.f2277d.getRight(), this.f2277d.getBottom());
                } else {
                    View view2 = this.f2278e;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f2279f.setBounds(0, 0, 0, 0);
                    } else {
                        this.f2279f.setBounds(this.f2278e.getLeft(), this.f2278e.getTop(), this.f2278e.getRight(), this.f2278e.getBottom());
                    }
                }
                z12 = true;
            }
            this.f2283j = z13;
            if (!z13 || (drawable = this.f2280g) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f2277d == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f2284k) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f2277d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f2276c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f2277d)) {
            iA = !b(this.f2278e) ? a(this.f2278e) : 0;
        } else {
            iA = a(this.f2277d);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f2276c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2279f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2279f);
        }
        this.f2279f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2277d;
            if (view != null) {
                this.f2279f.setBounds(view.getLeft(), this.f2277d.getTop(), this.f2277d.getRight(), this.f2277d.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f2282i ? this.f2279f != null || this.f2280g != null : this.f2281h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2281h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2281h);
        }
        this.f2281h = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2282i && (drawable2 = this.f2281h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2282i ? !(this.f2279f != null || this.f2280g != null) : this.f2281h == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2280g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2280g);
        }
        this.f2280g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2283j && (drawable2 = this.f2280g) != null) {
                drawable2.setBounds(this.f2276c.getLeft(), this.f2276c.getTop(), this.f2276c.getRight(), this.f2276c.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f2282i ? this.f2279f != null || this.f2280g != null : this.f2281h != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f2276c;
        if (view != null) {
            removeView(view);
        }
        this.f2276c = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f2275b = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f2279f;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f2280g;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f2281h;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f2279f && !this.f2282i) || (drawable == this.f2280g && this.f2283j) || ((drawable == this.f2281h && this.f2282i) || super.verifyDrawable(drawable));
    }
}
