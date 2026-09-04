package com.max.hbexpression.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.q0;
import androidx.core.view.v2;
import androidx.viewpager.widget.ViewPager;
import bb.c;
import com.max.hbexpression.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class CirclePageIndicator extends View implements com.max.hbcustomview.indicator.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f70229s = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f70230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f70231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f70232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f70233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ViewPager f70234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewPager.i f70235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f70236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f70237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f70238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f70239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f70240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f70241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f70242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f70243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f70244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f70245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f70246r;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f70247b;

        public class a implements Parcelable.Creator<SavedState> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public SavedState a(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.g.R3, new Class[]{Parcel.class}, SavedState.class);
                return patchProxyResultProxy.isSupported ? (SavedState) patchProxyResultProxy.result : new SavedState(parcel);
            }

            public SavedState[] b(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbexpression.widget.CirclePageIndicator$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.g.T3, new Class[]{Parcel.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [com.max.hbexpression.widget.CirclePageIndicator$SavedState[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.S3, new Class[]{Integer.TYPE}, Object[].class);
                return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f70247b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.g.Q3, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f70247b);
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(1);
        this.f70231c = paint;
        Paint paint2 = new Paint(1);
        this.f70232d = paint2;
        Paint paint3 = new Paint(1);
        this.f70233e = paint3;
        this.f70244p = -1.0f;
        this.f70245q = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z10 = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z11 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.V, i10, 0);
        this.f70241m = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_centered, z10);
        this.f70240l = typedArrayObtainStyledAttributes.getInt(R.styleable.CirclePageIndicator_android_orientation, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_pageColor, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_strokeColor, color3));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_strokeWidth, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_fillColor, color2));
        this.f70230b = typedArrayObtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_radius1, dimension2);
        this.f70242n = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_snap, z11);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f70243o = v2.d(ViewConfiguration.get(context));
    }

    private int d(int i10) {
        ViewPager viewPager;
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.M3, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 || (viewPager = this.f70234f) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f10 = this.f70230b;
        int i11 = (int) (paddingLeft + (count * 2 * f10) + ((count - 1) * f10) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }

    private int e(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.N3, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f70230b * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public boolean b() {
        return this.f70241m;
    }

    public boolean c() {
        return this.f70242n;
    }

    public int getFillColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33125u3, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f70233e.getColor();
    }

    public int getOrientation() {
        return this.f70240l;
    }

    public int getPageColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33085s3, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f70231c.getColor();
    }

    public float getRadius() {
        return this.f70230b;
    }

    public int getStrokeColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33185x3, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f70232d.getColor();
    }

    public float getStrokeWidth() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.f33225z3, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f70232d.getStrokeWidth();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void notifyDataSetChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.H3, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f10;
        float f11;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.g.C3, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        ViewPager viewPager = this.f70234f;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f70236h >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f70240l == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float strokeWidth = this.f70230b;
        float f12 = 4.0f * strokeWidth;
        float f13 = paddingLeft + strokeWidth;
        float f14 = paddingTop + strokeWidth;
        if (this.f70241m) {
            f14 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f12) / 2.0f);
        }
        if (this.f70232d.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f70232d.getStrokeWidth() / 2.0f;
        }
        for (int i10 = 0; i10 < count; i10++) {
            float f15 = (i10 * f12) + f14;
            if (this.f70240l == 0) {
                f11 = f13;
            } else {
                f11 = f15;
                f15 = f13;
            }
            if (this.f70231c.getAlpha() > 0) {
                canvas.drawCircle(f15, f11, strokeWidth, this.f70231c);
            }
            float f16 = this.f70230b;
            if (strokeWidth != f16) {
                canvas.drawCircle(f15, f11, f16, this.f70232d);
            }
        }
        boolean z10 = this.f70242n;
        float f17 = (z10 ? this.f70237i : this.f70236h) * f12;
        if (!z10) {
            f17 += this.f70238j * f12;
        }
        if (this.f70240l == 0) {
            float f18 = f14 + f17;
            f10 = f13;
            f13 = f18;
        } else {
            f10 = f14 + f17;
        }
        canvas.drawCircle(f13, f10, this.f70230b, this.f70233e);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.L3, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f70240l == 0) {
            setMeasuredDimension(d(i10), e(i11));
        } else {
            setMeasuredDimension(e(i10), d(i11));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrollStateChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.I3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70239k = i10;
        ViewPager.i iVar = this.f70235g;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrolled(int i10, float f10, int i11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.g.J3, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f70236h = i10;
        this.f70238j = f10;
        invalidate();
        ViewPager.i iVar = this.f70235g;
        if (iVar != null) {
            iVar.onPageScrolled(i10, f10, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageSelected(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.K3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f70242n || this.f70239k == 0) {
            this.f70236h = i10;
            this.f70237i = i10;
            invalidate();
        }
        ViewPager.i iVar = this.f70235g;
        if (iVar != null) {
            iVar.onPageSelected(i10);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, c.g.O3, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i10 = savedState.f70247b;
        this.f70236h = i10;
        this.f70237i = i10;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.g.P3, new Class[0], Parcelable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Parcelable) patchProxyResultProxy.result;
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f70247b = this.f70236h;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int count;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.g.D3, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f70234f;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f70245q = q0.h(motionEvent, 0);
            this.f70244p = motionEvent.getX();
        } else if (action == 1) {
            if (!this.f70246r) {
                count = this.f70234f.getAdapter().getCount();
                float width = getWidth();
                float f10 = width / 2.0f;
                float f11 = width / 6.0f;
                if (this.f70236h <= 0 && motionEvent.getX() < f10 - f11) {
                    if (action != 3) {
                        this.f70234f.setCurrentItem(this.f70236h - 1);
                    }
                    return true;
                }
                if (this.f70236h < count - 1 && motionEvent.getX() > f10 + f11) {
                    if (action != 3) {
                        this.f70234f.setCurrentItem(this.f70236h + 1);
                    }
                    return true;
                }
            }
            this.f70246r = false;
            this.f70245q = -1;
            if (this.f70234f.B()) {
                this.f70234f.r();
            }
        } else if (action == 2) {
            float fJ = q0.j(motionEvent, q0.a(motionEvent, this.f70245q));
            float f12 = fJ - this.f70244p;
            if (!this.f70246r && Math.abs(f12) > this.f70243o) {
                this.f70246r = true;
            }
            if (this.f70246r) {
                this.f70244p = fJ;
                if (this.f70234f.B() || this.f70234f.e()) {
                    this.f70234f.t(f12);
                }
            }
        } else if (action == 3) {
            if (!this.f70246r) {
                count = this.f70234f.getAdapter().getCount();
                float width2 = getWidth();
                float f13 = width2 / 2.0f;
                float f14 = width2 / 6.0f;
                if (this.f70236h <= 0) {
                }
                if (this.f70236h < count - 1) {
                    if (action != 3) {
                        this.f70234f.setCurrentItem(this.f70236h + 1);
                    }
                    return true;
                }
            }
            this.f70246r = false;
            this.f70245q = -1;
            if (this.f70234f.B()) {
                this.f70234f.r();
            }
        } else if (action == 5) {
            int iB = q0.b(motionEvent);
            this.f70244p = q0.j(motionEvent, iB);
            this.f70245q = q0.h(motionEvent, iB);
        } else if (action == 6) {
            int iB2 = q0.b(motionEvent);
            if (q0.h(motionEvent, iB2) == this.f70245q) {
                this.f70245q = q0.h(motionEvent, iB2 == 0 ? 1 : 0);
            }
            this.f70244p = q0.j(motionEvent, q0.a(motionEvent, this.f70245q));
        }
        return true;
    }

    public void setCentered(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.g.f33045q3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70241m = z10;
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setCurrentItem(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.G3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager viewPager = this.f70234f;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(i10);
        this.f70236h = i10;
        invalidate();
    }

    public void setFillColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.f33105t3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70233e.setColor(i10);
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setOnPageChangeListener(ViewPager.i iVar) {
        this.f70235g = iVar;
    }

    public void setOrientation(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.f33145v3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f70240l = i10;
        requestLayout();
    }

    public void setPageColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.f33065r3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70231c.setColor(i10);
        invalidate();
    }

    public void setRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.g.A3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70230b = f10;
        invalidate();
    }

    public void setSnap(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.g.B3, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70242n = z10;
        invalidate();
    }

    public void setStrokeColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.g.f33165w3, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70232d.setColor(i10);
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.g.f33205y3, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f70232d.setStrokeWidth(f10);
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2;
        if (PatchProxy.proxy(new Object[]{viewPager}, this, changeQuickRedirect, false, c.g.E3, new Class[]{ViewPager.class}, Void.TYPE).isSupported || (viewPager2 = this.f70234f) == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f70234f = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setViewPager(ViewPager viewPager, int i10) {
        if (PatchProxy.proxy(new Object[]{viewPager, new Integer(i10)}, this, changeQuickRedirect, false, c.g.F3, new Class[]{ViewPager.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setViewPager(viewPager);
        setCurrentItem(i10);
    }
}
