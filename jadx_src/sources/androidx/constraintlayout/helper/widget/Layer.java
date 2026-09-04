package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    private static final String C = "Layer";
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f18548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f18549l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f18550m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConstraintLayout f18551n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f18552o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f18553p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f18554q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f18555r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f18556s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected float f18557t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected float f18558u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected float f18559v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f18560w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    View[] f18561x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f18562y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f18563z;

    public Layer(Context context) {
        super(context);
        this.f18548k = Float.NaN;
        this.f18549l = Float.NaN;
        this.f18550m = Float.NaN;
        this.f18552o = 1.0f;
        this.f18553p = 1.0f;
        this.f18554q = Float.NaN;
        this.f18555r = Float.NaN;
        this.f18556s = Float.NaN;
        this.f18557t = Float.NaN;
        this.f18558u = Float.NaN;
        this.f18559v = Float.NaN;
        this.f18560w = true;
        this.f18561x = null;
        this.f18562y = 0.0f;
        this.f18563z = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18548k = Float.NaN;
        this.f18549l = Float.NaN;
        this.f18550m = Float.NaN;
        this.f18552o = 1.0f;
        this.f18553p = 1.0f;
        this.f18554q = Float.NaN;
        this.f18555r = Float.NaN;
        this.f18556s = Float.NaN;
        this.f18557t = Float.NaN;
        this.f18558u = Float.NaN;
        this.f18559v = Float.NaN;
        this.f18560w = true;
        this.f18561x = null;
        this.f18562y = 0.0f;
        this.f18563z = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18548k = Float.NaN;
        this.f18549l = Float.NaN;
        this.f18550m = Float.NaN;
        this.f18552o = 1.0f;
        this.f18553p = 1.0f;
        this.f18554q = Float.NaN;
        this.f18555r = Float.NaN;
        this.f18556s = Float.NaN;
        this.f18557t = Float.NaN;
        this.f18558u = Float.NaN;
        this.f18559v = Float.NaN;
        this.f18560w = true;
        this.f18561x = null;
        this.f18562y = 0.0f;
        this.f18563z = 0.0f;
    }

    private void K() {
        int i10;
        if (this.f18551n == null || (i10 = this.f19249c) == 0) {
            return;
        }
        View[] viewArr = this.f18561x;
        if (viewArr == null || viewArr.length != i10) {
            this.f18561x = new View[i10];
        }
        for (int i11 = 0; i11 < this.f19249c; i11++) {
            this.f18561x[i11] = this.f18551n.p(this.f19248b[i11]);
        }
    }

    private void L() {
        if (this.f18551n == null) {
            return;
        }
        if (this.f18561x == null) {
            K();
        }
        J();
        double radians = Float.isNaN(this.f18550m) ? 0.0d : Math.toRadians(this.f18550m);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f10 = this.f18552o;
        float f11 = f10 * fCos;
        float f12 = this.f18553p;
        float f13 = (-f12) * fSin;
        float f14 = f10 * fSin;
        float f15 = f12 * fCos;
        for (int i10 = 0; i10 < this.f19249c; i10++) {
            View view = this.f18561x[i10];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f16 = left - this.f18554q;
            float f17 = top - this.f18555r;
            float f18 = (((f11 * f16) + (f13 * f17)) - f16) + this.f18562y;
            float f19 = (((f16 * f14) + (f15 * f17)) - f17) + this.f18563z;
            view.setTranslationX(f18);
            view.setTranslationY(f19);
            view.setScaleY(this.f18553p);
            view.setScaleX(this.f18552o);
            if (!Float.isNaN(this.f18550m)) {
                view.setRotation(this.f18550m);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void D(ConstraintLayout constraintLayout) {
        K();
        this.f18554q = Float.NaN;
        this.f18555r = Float.NaN;
        ConstraintWidget constraintWidgetB = ((ConstraintLayout.LayoutParams) getLayoutParams()).b();
        constraintWidgetB.W1(0);
        constraintWidgetB.s1(0);
        J();
        layout(((int) this.f18558u) - getPaddingLeft(), ((int) this.f18559v) - getPaddingTop(), ((int) this.f18556s) + getPaddingRight(), ((int) this.f18557t) + getPaddingBottom());
        L();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void F(ConstraintLayout constraintLayout) {
        this.f18551n = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f18550m = rotation;
        } else {
            if (Float.isNaN(this.f18550m)) {
                return;
            }
            this.f18550m = rotation;
        }
    }

    protected void J() {
        if (this.f18551n == null) {
            return;
        }
        if (this.f18560w || Float.isNaN(this.f18554q) || Float.isNaN(this.f18555r)) {
            if (!Float.isNaN(this.f18548k) && !Float.isNaN(this.f18549l)) {
                this.f18555r = this.f18549l;
                this.f18554q = this.f18548k;
                return;
            }
            View[] viewArrW = w(this.f18551n);
            int left = viewArrW[0].getLeft();
            int top = viewArrW[0].getTop();
            int right = viewArrW[0].getRight();
            int bottom = viewArrW[0].getBottom();
            for (int i10 = 0; i10 < this.f19249c; i10++) {
                View view = viewArrW[i10];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.f18556s = right;
            this.f18557t = bottom;
            this.f18558u = left;
            this.f18559v = top;
            if (Float.isNaN(this.f18548k)) {
                this.f18554q = (left + right) / 2;
            } else {
                this.f18554q = this.f18548k;
            }
            if (Float.isNaN(this.f18549l)) {
                this.f18555r = (top + bottom) / 2;
            } else {
                this.f18555r = this.f18549l;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18551n = (ConstraintLayout) getParent();
        if (this.A || this.B) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f19249c; i10++) {
                View viewP = this.f18551n.p(this.f19248b[i10]);
                if (viewP != null) {
                    if (this.A) {
                        viewP.setVisibility(visibility);
                    }
                    if (this.B && elevation > 0.0f) {
                        viewP.setTranslationZ(viewP.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void r(ConstraintLayout constraintLayout) {
        q(constraintLayout);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        p();
    }

    @Override // android.view.View
    public void setPivotX(float f10) {
        this.f18548k = f10;
        L();
    }

    @Override // android.view.View
    public void setPivotY(float f10) {
        this.f18549l = f10;
        L();
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        this.f18550m = f10;
        L();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        this.f18552o = f10;
        L();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        this.f18553p = f10;
        L();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        this.f18562y = f10;
        L();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        this.f18563z = f10;
        L();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        p();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    protected void y(AttributeSet attributeSet) {
        super.y(attributeSet);
        this.f19252f = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f19429u);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == R.styleable.ConstraintLayout_Layout_android_visibility) {
                    this.A = true;
                } else if (index == R.styleable.ConstraintLayout_Layout_android_elevation) {
                    this.B = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
