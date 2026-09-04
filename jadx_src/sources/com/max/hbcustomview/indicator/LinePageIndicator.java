package com.max.hbcustomview.indicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
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
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class LinePageIndicator extends View implements com.max.hbcustomview.indicator.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f69157w = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f69158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f69161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f69162f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f69163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f69164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ViewPager f69165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ViewPager.i f69166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f69168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f69169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f69172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f69173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f69174r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f69175s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f69176t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f69177u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private RectF f69178v;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f69179b;

        public class a implements Parcelable.Creator<SavedState> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public SavedState a(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.f.Ok, new Class[]{Parcel.class}, SavedState.class);
                return patchProxyResultProxy.isSupported ? (SavedState) patchProxyResultProxy.result : new SavedState(parcel);
            }

            public SavedState[] b(int i10) {
                return new SavedState[i10];
            }

            /* JADX WARN: Type inference failed for: r9v2, types: [com.max.hbcustomview.indicator.LinePageIndicator$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parcel}, this, changeQuickRedirect, false, c.f.Qk, new Class[]{Parcel.class}, Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(parcel);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [com.max.hbcustomview.indicator.LinePageIndicator$SavedState[], java.lang.Object[]] */
            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Pk, new Class[]{Integer.TYPE}, Object[].class);
                return patchProxyResultProxy.isSupported ? (Object[]) patchProxyResultProxy.result : b(i10);
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f69179b = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            if (PatchProxy.proxy(new Object[]{parcel, new Integer(i10)}, this, changeQuickRedirect, false, c.f.Nk, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f69179b);
        }
    }

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Paint paint = new Paint(1);
        this.f69162f = paint;
        Paint paint2 = new Paint(1);
        this.f69163g = paint2;
        Paint paint3 = new Paint(1);
        this.f69164h = paint3;
        this.f69175s = -1.0f;
        this.f69176t = -1;
        this.f69178v = new RectF();
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.T, i10, 0);
        this.f69172p = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_centered, z10);
        this.f69171o = typedArrayObtainStyledAttributes.getInt(R.styleable.CirclePageIndicator_android_orientation, integer);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_pageColor, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_strokeColor, color3));
        paint2.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_strokeWidth, dimension));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_fillColor, color2));
        this.f69158b = typedArrayObtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_radius1, dimension2);
        ic.a aVar = ic.a.f119343a;
        this.f69159c = aVar.b(getContext(), 6);
        this.f69160d = aVar.b(getContext(), 8);
        this.f69161e = aVar.b(getContext(), 2);
        this.f69173q = typedArrayObtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_snap, z11);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f69174r = v2.d(ViewConfiguration.get(context));
    }

    private int d(int i10) {
        ViewPager viewPager;
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Jk, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824 || (viewPager = this.f69165i) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f10 = this.f69158b;
        int i11 = (int) (paddingLeft + (count * 2 * f10) + ((count - 1) * f10) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }

    private int e(int i10) {
        Object[] objArr = {new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Kk, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f69158b * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public boolean b() {
        return this.f69172p;
    }

    public boolean c() {
        return this.f69173q;
    }

    public int getFillColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32545rk, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69164h.getColor();
    }

    public int getOrientation() {
        return this.f69171o;
    }

    public int getPageColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32500pk, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69162f.getColor();
    }

    public float getRadius() {
        return this.f69158b;
    }

    public int getStrokeColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32611uk, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f69163g.getColor();
    }

    public float getStrokeWidth() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.f32655wk, new Class[0], Float.TYPE);
        return patchProxyResultProxy.isSupported ? ((Float) patchProxyResultProxy.result).floatValue() : this.f69163g.getStrokeWidth();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void notifyDataSetChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Ek, new Class[0], Void.TYPE).isSupported) {
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
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.f32721zk, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onDraw(canvas);
        ViewPager viewPager = this.f69165i;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f69167k >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f69171o == 0) {
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
        float f12 = this.f69160d;
        float f13 = this.f69159c + f12;
        float strokeWidth = this.f69158b;
        float f14 = paddingLeft + strokeWidth;
        float f15 = paddingTop + (f12 / 2.0f);
        if (this.f69172p) {
            f15 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f13) / 2.0f);
        }
        if (this.f69163g.getStrokeWidth() > 0.0f) {
            strokeWidth -= this.f69163g.getStrokeWidth() / 2.0f;
        }
        for (int i10 = 0; i10 < count; i10++) {
            float f16 = (i10 * f13) + f15;
            if (this.f69171o == 0) {
                f11 = f14;
            } else {
                f11 = f16;
                f16 = f14;
            }
            RectF rectF = this.f69178v;
            float f17 = this.f69160d;
            rectF.left = f16 - (f17 / 2.0f);
            float f18 = this.f69161e;
            rectF.top = f11 - (f18 / 2.0f);
            rectF.right = f16 + (f17 / 2.0f);
            rectF.bottom = f11 + (f18 / 2.0f);
            if (this.f69162f.getAlpha() > 0) {
                RectF rectF2 = this.f69178v;
                float f19 = this.f69158b;
                canvas.drawRoundRect(rectF2, f19, f19, this.f69162f);
            }
            float f20 = this.f69158b;
            if (strokeWidth != f20) {
                canvas.drawRoundRect(this.f69178v, f20, f20, this.f69163g);
            }
        }
        boolean z10 = this.f69173q;
        float f21 = (z10 ? this.f69168l : this.f69167k) * f13;
        if (!z10) {
            f21 += this.f69169m * f13;
        }
        if (this.f69171o == 0) {
            float f22 = f15 + f21;
            f10 = f14;
            f14 = f22;
        } else {
            f10 = f15 + f21;
        }
        RectF rectF3 = this.f69178v;
        float f23 = this.f69160d;
        rectF3.left = f14 - (f23 / 2.0f);
        float f24 = this.f69161e;
        rectF3.top = f10 - (f24 / 2.0f);
        rectF3.right = f14 + (f23 / 2.0f);
        rectF3.bottom = f10 + (f24 / 2.0f);
        float f25 = this.f69158b;
        canvas.drawRoundRect(rectF3, f25, f25, this.f69164h);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Ik, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69171o == 0) {
            setMeasuredDimension(d(i10), e(i11));
        } else {
            setMeasuredDimension(e(i10), d(i11));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrollStateChanged(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Fk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69170n = i10;
        ViewPager.i iVar = this.f69166j;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i10);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageScrolled(int i10, float f10, int i11) {
        Object[] objArr = {new Integer(i10), new Float(f10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Gk, new Class[]{cls, Float.TYPE, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69167k = i10;
        this.f69169m = f10;
        invalidate();
        ViewPager.i iVar = this.f69166j;
        if (iVar != null) {
            iVar.onPageScrolled(i10, f10, i11);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.i
    public void onPageSelected(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Hk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69173q || this.f69170n == 0) {
            this.f69167k = i10;
            this.f69168l = i10;
            invalidate();
        }
        ViewPager.i iVar = this.f69166j;
        if (iVar != null) {
            iVar.onPageSelected(i10);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.proxy(new Object[]{parcelable}, this, changeQuickRedirect, false, c.f.Lk, new Class[]{Parcelable.class}, Void.TYPE).isSupported) {
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i10 = savedState.f69179b;
        this.f69167k = i10;
        this.f69168l = i10;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Mk, new Class[0], Parcelable.class);
        if (patchProxyResultProxy.isSupported) {
            return (Parcelable) patchProxyResultProxy.result;
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f69179b = this.f69167k;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int count;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{motionEvent}, this, changeQuickRedirect, false, c.f.Ak, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        ViewPager viewPager = this.f69165i;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f69176t = q0.h(motionEvent, 0);
            this.f69175s = motionEvent.getX();
        } else if (action == 1) {
            if (!this.f69177u) {
                count = this.f69165i.getAdapter().getCount();
                float width = getWidth();
                float f10 = width / 2.0f;
                float f11 = width / 6.0f;
                if (this.f69167k <= 0 && motionEvent.getX() < f10 - f11) {
                    if (action != 3) {
                        this.f69165i.setCurrentItem(this.f69167k - 1);
                    }
                    return true;
                }
                if (this.f69167k < count - 1 && motionEvent.getX() > f10 + f11) {
                    if (action != 3) {
                        this.f69165i.setCurrentItem(this.f69167k + 1);
                    }
                    return true;
                }
            }
            this.f69177u = false;
            this.f69176t = -1;
            if (this.f69165i.B()) {
                this.f69165i.r();
            }
        } else if (action == 2) {
            float fJ = q0.j(motionEvent, q0.a(motionEvent, this.f69176t));
            float f12 = fJ - this.f69175s;
            if (!this.f69177u && Math.abs(f12) > this.f69174r) {
                this.f69177u = true;
            }
            if (this.f69177u) {
                this.f69175s = fJ;
                if (this.f69165i.B() || this.f69165i.e()) {
                    this.f69165i.t(f12);
                }
            }
        } else if (action == 3) {
            if (!this.f69177u) {
                count = this.f69165i.getAdapter().getCount();
                float width2 = getWidth();
                float f13 = width2 / 2.0f;
                float f14 = width2 / 6.0f;
                if (this.f69167k <= 0) {
                }
                if (this.f69167k < count - 1) {
                    if (action != 3) {
                        this.f69165i.setCurrentItem(this.f69167k + 1);
                    }
                    return true;
                }
            }
            this.f69177u = false;
            this.f69176t = -1;
            if (this.f69165i.B()) {
                this.f69165i.r();
            }
        } else if (action == 5) {
            int iB = q0.b(motionEvent);
            this.f69175s = q0.j(motionEvent, iB);
            this.f69176t = q0.h(motionEvent, iB);
        } else if (action == 6) {
            int iB2 = q0.b(motionEvent);
            if (q0.h(motionEvent, iB2) == this.f69176t) {
                this.f69176t = q0.h(motionEvent, iB2 == 0 ? 1 : 0);
            }
            this.f69175s = q0.j(motionEvent, q0.a(motionEvent, this.f69176t));
        }
        return true;
    }

    public void setCentered(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.f32454nk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69172p = z10;
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setCurrentItem(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Dk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager viewPager = this.f69165i;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(i10);
        this.f69167k = i10;
        invalidate();
    }

    public void setFillColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.f32523qk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69164h.setColor(i10);
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setOnPageChangeListener(ViewPager.i iVar) {
        this.f69166j = iVar;
    }

    public void setOrientation(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.f32567sk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f69171o = i10;
        requestLayout();
    }

    public void setPageColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.f32477ok, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69162f.setColor(i10);
        invalidate();
    }

    public void setRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.f.f32677xk, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69158b = f10;
        invalidate();
    }

    public void setSnap(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.f32699yk, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69173q = z10;
        invalidate();
    }

    public void setStrokeColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.f32589tk, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69163g.setColor(i10);
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.f.f32633vk, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69163g.setStrokeWidth(f10);
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2;
        if (PatchProxy.proxy(new Object[]{viewPager}, this, changeQuickRedirect, false, c.f.Bk, new Class[]{ViewPager.class}, Void.TYPE).isSupported || (viewPager2 = this.f69165i) == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f69165i = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }

    @Override // com.max.hbcustomview.indicator.a
    public void setViewPager(ViewPager viewPager, int i10) {
        if (PatchProxy.proxy(new Object[]{viewPager, new Integer(i10)}, this, changeQuickRedirect, false, c.f.Ck, new Class[]{ViewPager.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setViewPager(viewPager);
        setCurrentItem(i10);
    }
}
