package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.core.view.j1;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f2466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f2467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f2468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f2469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f2470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TypedValue f2471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Rect f2472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f2473i;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(@androidx.annotation.n0 Context context) {
        this(context, null);
    }

    public ContentFrameLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(@androidx.annotation.n0 Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2472h = new Rect();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f2470f == null) {
            this.f2470f = new TypedValue();
        }
        return this.f2470f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f2471g == null) {
            this.f2471g = new TypedValue();
        }
        return this.f2471g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f2468d == null) {
            this.f2468d = new TypedValue();
        }
        return this.f2468d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f2469e == null) {
            this.f2469e = new TypedValue();
        }
        return this.f2469e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f2466b == null) {
            this.f2466b = new TypedValue();
        }
        return this.f2466b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f2467c == null) {
            this.f2467c = new TypedValue();
        }
        return this.f2467c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f2473i;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f2473i;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        float fraction;
        int i14;
        int i15;
        float fraction2;
        int i16;
        int i17;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z11 = true;
        boolean z12 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            z10 = false;
        } else {
            TypedValue typedValue = z12 ? this.f2469e : this.f2468d;
            if (typedValue == null || (i16 = typedValue.type) == 0) {
                z10 = false;
            } else {
                if (i16 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i16 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i18, i18);
                    } else {
                        i17 = 0;
                    }
                    if (i17 > 0) {
                        Rect rect = this.f2472h;
                        i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect.left + rect.right), View.MeasureSpec.getSize(i10)), 1073741824);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                i17 = (int) fraction3;
                if (i17 > 0) {
                    Rect rect2 = this.f2472h;
                    i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i17 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i10)), 1073741824);
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z12 ? this.f2470f : this.f2471g;
            if (typedValue2 != null && (i14 = typedValue2.type) != 0) {
                if (i14 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i19 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i19, i19);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        Rect rect3 = this.f2472h;
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                    }
                }
                i15 = (int) fraction2;
                if (i15 > 0) {
                    Rect rect4 = this.f2472h;
                    i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i11)), 1073741824);
                }
            }
        }
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z10 || mode != Integer.MIN_VALUE) {
            z11 = false;
        } else {
            TypedValue typedValue3 = z12 ? this.f2467c : this.f2466b;
            if (typedValue3 == null || (i12 = typedValue3.type) == 0) {
                z11 = false;
            } else {
                if (i12 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i20 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i20, i20);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        Rect rect5 = this.f2472h;
                        i13 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i13) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                    } else {
                        z11 = false;
                    }
                }
                i13 = (int) fraction;
                if (i13 > 0) {
                    Rect rect6 = this.f2472h;
                    i13 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i13) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                } else {
                    z11 = false;
                }
            }
        }
        if (z11) {
            super.onMeasure(iMakeMeasureSpec, i11);
        }
    }

    public void setAttachListener(a aVar) {
        this.f2473i = aVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDecorPadding(int i10, int i11, int i12, int i13) {
        this.f2472h.set(i10, i11, i12, i13);
        if (j1.U0(this)) {
            requestLayout();
        }
    }
}
