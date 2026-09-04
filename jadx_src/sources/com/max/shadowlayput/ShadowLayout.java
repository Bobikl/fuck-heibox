package com.max.shadowlayput;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.j1;
import bb.c;
import com.max.shadowlayout.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import ue.a;

/* JADX INFO: compiled from: ShadowLayout.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nShadowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShadowLayout.kt\ncom/max/shadowlayput/ShadowLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,576:1\n1#2:577\n*E\n"})
public class ShadowLayout extends ViewGroup {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f75821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f75822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f75823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private Drawable f75824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final Rect f75825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final Rect f75826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f75827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f75828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f75829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private final Paint f75830k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f75831l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f75832m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f75833n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f75834o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f75835p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f75836q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f75837r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f75838s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f75839t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f75840u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f75841v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f75842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f75843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f75844y;

    /* JADX INFO: compiled from: ShadowLayout.kt */
    public static final class CustomMarginLayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @d
        public static final a f75845b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f75846c = -1;
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f75847a;

        /* JADX INFO: compiled from: ShadowLayout.kt */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(u uVar) {
                this();
            }
        }

        public CustomMarginLayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f75847a = -1;
        }

        public CustomMarginLayoutParams(int i10, int i11, int i12) {
            super(i10, i11);
            this.f75847a = i12;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomMarginLayoutParams(@d Context c10, @e AttributeSet attributeSet) {
            super(c10, attributeSet);
            f0.p(c10, "c");
            this.f75847a = -1;
            TypedArray typedArrayObtainStyledAttributes = c10.obtainStyledAttributes(attributeSet, R.styleable.f75778l1);
            f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f75847a = typedArrayObtainStyledAttributes.getInt(R.styleable.ShadowLayout_Layout_layout_gravity, -1);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomMarginLayoutParams(@d ViewGroup.LayoutParams source) {
            super(source);
            f0.p(source, "source");
            this.f75847a = -1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomMarginLayoutParams(@d ViewGroup.MarginLayoutParams source) {
            super(source);
            f0.p(source, "source");
            this.f75847a = -1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomMarginLayoutParams(@d CustomMarginLayoutParams source) {
            super((ViewGroup.MarginLayoutParams) source);
            f0.p(source, "source");
            this.f75847a = -1;
            this.f75847a = source.f75847a;
        }

        public final int a() {
            return this.f75847a;
        }

        public final void b(int i10) {
            this.f75847a = i10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f75821b = 8388659;
        this.f75822c = -1;
        this.f75825f = new Rect();
        this.f75826g = new Rect();
        this.f75827h = 119;
        this.f75828i = true;
        Paint paint = new Paint();
        this.f75830k = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f75775k1, i10, 0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setShadowColor(typedArrayObtainStyledAttributes.getColor(R.styleable.ShadowLayout_shadowColor, androidx.core.content.d.f(context, R.color.shadow_color_day_night)));
        setForegroundColor(typedArrayObtainStyledAttributes.getColor(R.styleable.ShadowLayout_foregroundColor, androidx.core.content.d.f(context, R.color.shadow_view_foreground_color_dark)));
        this.f75833n = typedArrayObtainStyledAttributes.getColor(R.styleable.ShadowLayout_backgroundColor, androidx.core.content.d.f(context, R.color.shadow_layout_background_day_night));
        setShadowDx(typedArrayObtainStyledAttributes.getFloat(R.styleable.ShadowLayout_shadowDx, 0.0f));
        setShadowDy(typedArrayObtainStyledAttributes.getFloat(R.styleable.ShadowLayout_shadowDy, 1.0f));
        setShadowRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_shadowRadius, this.f75823d));
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.ShadowLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_shadowMargin, -1);
        if (dimensionPixelSize >= 0) {
            setShadowMarginTop(dimensionPixelSize);
            setShadowMarginLeft(dimensionPixelSize);
            setShadowMarginRight(dimensionPixelSize);
            setShadowMarginBottom(dimensionPixelSize);
        } else {
            setShadowMarginTop(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_shadowMarginTop, this.f75823d));
            setShadowMarginLeft(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_shadowMarginLeft, this.f75823d));
            setShadowMarginRight(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_shadowMarginRight, this.f75823d));
            setShadowMarginBottom(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_shadowMarginBottom, this.f75823d));
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_cornerRadius, -1);
        if (dimensionPixelSize2 >= 0.0f) {
            setCornerRadiusTL(dimensionPixelSize2);
            setCornerRadiusTR(dimensionPixelSize2);
            setCornerRadiusBL(dimensionPixelSize2);
            setCornerRadiusBR(dimensionPixelSize2);
        } else {
            setCornerRadiusTL(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_cornerRadiusTL, this.f75823d));
            setCornerRadiusTR(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_cornerRadiusTR, this.f75823d));
            setCornerRadiusBL(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_cornerRadiusBL, this.f75823d));
            setCornerRadiusBR(typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShadowLayout_cornerRadiusBR, this.f75823d));
        }
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(this.f75833n);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        setLayerType(1, null);
        setWillNotDraw(false);
        j1.I1(this, null);
    }

    private final void a(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.m.Eh, new Class[]{Canvas.class}, Void.TYPE).isSupported || this.f75824e == null) {
            return;
        }
        if (this.f75829j) {
            this.f75829j = false;
            int right = getRight() - getLeft();
            int bottom = getBottom() - getTop();
            if (this.f75828i) {
                this.f75825f.set(0, 0, right, bottom);
            } else {
                this.f75825f.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
            }
            int i10 = this.f75827h;
            Drawable drawable = this.f75824e;
            int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
            Drawable drawable2 = this.f75824e;
            Gravity.apply(i10, intrinsicWidth, drawable2 != null ? drawable2.getIntrinsicHeight() : 0, this.f75825f, this.f75826g);
            Drawable drawable3 = this.f75824e;
            if (drawable3 != null) {
                drawable3.setBounds(this.f75826g);
            }
        }
        Drawable drawable4 = this.f75824e;
        if (drawable4 != null) {
            drawable4.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    @TargetApi(17)
    private final void b(int i10, int i11, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        int i22 = 3;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.f35159yh, new Class[]{cls, cls, cls, cls, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i12 - i10) - getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        int i23 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                CustomMarginLayoutParams customMarginLayoutParams = layoutParams instanceof CustomMarginLayoutParams ? (CustomMarginLayoutParams) layoutParams : null;
                if (customMarginLayoutParams != null) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    int iA = customMarginLayoutParams.a();
                    if (iA == -1) {
                        iA = this.f75821b;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(iA, getLayoutDirection());
                    int i24 = iA & 112;
                    int i25 = absoluteGravity & 7;
                    if (i25 != 1) {
                        if (i25 == i22 || i25 != 5) {
                            int i26 = ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).leftMargin + paddingLeft;
                            int i27 = this.f75842w;
                            i16 = i26 + i27;
                        } else if (z10) {
                            i16 = 0;
                        } else {
                            i14 = (paddingRight - measuredWidth) - ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).rightMargin;
                            i15 = this.f75843x;
                        }
                        if (i24 == 16) {
                            i17 = ((((((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).bottomMargin) + this.f75841v;
                            i18 = this.f75844y;
                        } else if (i24 == 48 && i24 == 80) {
                            i17 = (paddingBottom - measuredHeight) - ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).bottomMargin;
                            i18 = this.f75844y;
                        } else {
                            i20 = ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).topMargin + paddingTop;
                            i21 = this.f75841v;
                            i19 = i20 + i21;
                            childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                        }
                        i19 = i17 - i18;
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i14 = ((((((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft) + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).rightMargin) + this.f75842w;
                        i15 = this.f75843x;
                    }
                    i16 = i14 - i15;
                    if (i24 == 16) {
                        if (i24 == 48) {
                            i20 = ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).topMargin + paddingTop;
                            i21 = this.f75841v;
                        } else {
                            i20 = ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).topMargin + paddingTop;
                            i21 = this.f75841v;
                        }
                        i19 = i20 + i21;
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = ((((((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).bottomMargin) + this.f75841v;
                        i18 = this.f75844y;
                    }
                    i19 = i17 - i18;
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                }
            }
            i23++;
            i22 = 3;
        }
    }

    private final void c() {
        Drawable drawable;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Jh, new Class[0], Void.TYPE).isSupported || (drawable = this.f75824e) == null) {
            return;
        }
        RippleDrawable rippleDrawable = drawable instanceof RippleDrawable ? (RippleDrawable) drawable : null;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ColorStateList.valueOf(this.f75832m));
        }
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Bh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        e(getShadowRadius(), this.f75835p, this.f75836q, this.f75831l);
    }

    private final void e(float f10, float f11, float f12, int i10) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Integer(i10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Ch, new Class[]{cls, cls, cls, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75830k.setShadowLayer(f10, f11, f12, i10);
        invalidate();
    }

    private final float getShadowMarginMax() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Dh, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        float fT = 0.0f;
        Iterator it = CollectionsKt__CollectionsKt.L(Integer.valueOf(this.f75842w), Integer.valueOf(this.f75841v), Integer.valueOf(this.f75843x), Integer.valueOf(this.f75844y)).iterator();
        while (it.hasNext()) {
            fT = fi.u.t(fT, ((Number) it.next()).intValue());
        }
        return fT;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(@e ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof CustomMarginLayoutParams;
    }

    @Override // android.view.View
    public void draw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.m.Ah, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.draw(canvas);
        canvas.save();
        canvas.clipPath(a.f140794a.a(this.f75842w, this.f75841v, getMeasuredWidth() - this.f75843x, getMeasuredHeight() - this.f75844y, this.f75837r, this.f75838s, this.f75840u, this.f75839t));
        a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Kh, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f75824e;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Ih, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.drawableStateChanged();
        Drawable drawable = this.f75824e;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup
    @d
    public ViewGroup.LayoutParams generateLayoutParams(@e AttributeSet attributeSet) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, c.m.Oh, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup.LayoutParams) patchProxyResultProxy.result;
        }
        Context context = getContext();
        f0.o(context, "getContext(...)");
        return new CustomMarginLayoutParams(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    @e
    public ViewGroup.LayoutParams generateLayoutParams(@e ViewGroup.LayoutParams layoutParams) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutParams}, this, changeQuickRedirect, false, c.m.Ph, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup.LayoutParams) patchProxyResultProxy.result;
        }
        if (layoutParams == null) {
            return null;
        }
        return new CustomMarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    @e
    public CharSequence getAccessibilityClassName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Nh, new Class[0], CharSequence.class);
        return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : ShadowLayout.class.getName();
    }

    public final int getBackgroundColor() {
        return this.f75833n;
    }

    public final float getCornerRadiusBL() {
        return this.f75839t;
    }

    public final float getCornerRadiusBR() {
        return this.f75840u;
    }

    public final float getCornerRadiusTL() {
        return this.f75837r;
    }

    public final float getCornerRadiusTR() {
        return this.f75838s;
    }

    @Override // android.view.View
    @e
    public Drawable getForeground() {
        return this.f75824e;
    }

    public final int getForegroundColor() {
        return this.f75832m;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f75827h;
    }

    public final int getShadowColor() {
        return this.f75831l;
    }

    public final float getShadowDx() {
        return this.f75835p;
    }

    public final float getShadowDy() {
        return this.f75836q;
    }

    public final int getShadowMarginBottom() {
        return this.f75844y;
    }

    public final int getShadowMarginLeft() {
        return this.f75842w;
    }

    public final int getShadowMarginRight() {
        return this.f75843x;
    }

    public final int getShadowMarginTop() {
        return this.f75841v;
    }

    public final float getShadowRadius() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.f34845kh, new Class[0], Float.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Float) patchProxyResultProxy.result).floatValue();
        }
        if (this.f75834o > getShadowMarginMax()) {
            if (!(getShadowMarginMax() == 0.0f)) {
                return getShadowMarginMax();
            }
        }
        return this.f75834o;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.Hh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f75824e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.m.f35181zh, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        super.onDraw(canvas);
        Path pathA = a.f140794a.a(this.f75842w, this.f75841v, getMeasuredWidth() - this.f75843x, getMeasuredHeight() - this.f75844y, this.f75837r, this.f75838s, this.f75840u, this.f75839t);
        canvas.drawPath(pathA, this.f75830k);
        canvas.clipPath(pathA);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.f35137xh, new Class[]{Boolean.TYPE, cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        b(i10, i11, i12, i13, false);
        if (z10) {
            this.f75829j = z10;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMax;
        int iCombineMeasuredStates;
        int i12 = i10;
        int i13 = 0;
        Object[] objArr = {new Integer(i12), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.f35115wh, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        setMeasuredDimension(View.getDefaultSize(0, i12), View.getDefaultSize(0, i11));
        boolean z10 = layoutParams.width == -1;
        boolean z11 = layoutParams.height == -1;
        int iMakeMeasureSpec = z10 ? View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - this.f75843x) - this.f75842w, 1073741824) : i12;
        int iMakeMeasureSpec2 = z11 ? View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f75841v) - this.f75844y, 1073741824) : i11;
        View childAt = getChildAt(0);
        if (childAt != null) {
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, iMakeMeasureSpec, 0, iMakeMeasureSpec2, 0);
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                f0.n(layoutParams2, "null cannot be cast to non-null type com.max.shadowlayput.ShadowLayout.CustomMarginLayoutParams");
                CustomMarginLayoutParams customMarginLayoutParams = (CustomMarginLayoutParams) layoutParams2;
                int iMax2 = z10 ? Math.max(0, childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).rightMargin) : Math.max(0, childAt.getMeasuredWidth() + this.f75842w + this.f75843x + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).rightMargin);
                iMax = z11 ? Math.max(0, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).bottomMargin) : Math.max(0, childAt.getMeasuredHeight() + this.f75841v + this.f75844y + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).topMargin + ((ViewGroup.MarginLayoutParams) customMarginLayoutParams).bottomMargin);
                i13 = iMax2;
                iCombineMeasuredStates = View.combineMeasuredStates(0, childAt.getMeasuredState());
            } else {
                iMax = 0;
                iCombineMeasuredStates = 0;
            }
            int paddingLeft = i13 + getPaddingLeft() + getPaddingRight();
            int iU = fi.u.u(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
            int iU2 = fi.u.u(paddingLeft, getSuggestedMinimumWidth());
            Drawable foreground = getForeground();
            if (foreground != null) {
                iU = Math.max(iU, foreground.getMinimumHeight());
                iU2 = Math.max(iU2, foreground.getMinimumWidth());
            }
            if (!z10) {
                i12 = iMakeMeasureSpec;
            }
            int iResolveSizeAndState = View.resolveSizeAndState(iU2, i12, iCombineMeasuredStates);
            if (z11) {
                iMakeMeasureSpec2 = i11;
            }
            setMeasuredDimension(iResolveSizeAndState, View.resolveSizeAndState(iU, iMakeMeasureSpec2, iCombineMeasuredStates << 16));
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Mh, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        this.f75829j = true;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34822jh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75833n = i10;
        invalidate();
    }

    public final void setCornerRadius(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Rh, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setCornerRadiusTL(f10);
        setCornerRadiusTR(f11);
        setCornerRadiusBR(f12);
        setCornerRadiusBL(f13);
        invalidate();
    }

    public final void setCornerRadiusBL(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f34983qh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75839t = f10;
        invalidate();
    }

    public final void setCornerRadiusBR(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f35005rh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75840u = f10;
        invalidate();
    }

    public final void setCornerRadiusTL(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f34937oh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75837r = f10;
        invalidate();
    }

    public final void setCornerRadiusTR(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f34960ph, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75838s = f10;
        invalidate();
    }

    @Override // android.view.View
    public void setForeground(@d Drawable foreground) {
        if (PatchProxy.proxy(new Object[]{foreground}, this, changeQuickRedirect, false, c.m.Fh, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(foreground, "foreground");
        Drawable drawable = this.f75824e;
        if (drawable != null) {
            f0.m(drawable);
            drawable.setCallback(null);
            unscheduleDrawable(this.f75824e);
        }
        this.f75824e = foreground;
        c();
        setWillNotDraw(false);
        foreground.setCallback(this);
        if (foreground.isStateful()) {
            foreground.setState(getDrawableState());
        }
        if (this.f75827h == 119) {
            foreground.getPadding(new Rect());
        }
        requestLayout();
        invalidate();
    }

    public final void setForegroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34798ih, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75832m = i10;
        c();
    }

    @Override // android.view.View
    public void setForegroundGravity(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.Gh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || this.f75827h == i10) {
            return;
        }
        int i11 = (8388615 & i10) == 0 ? 8388611 | i10 : i10;
        if ((i10 & 112) == 0) {
            i11 = i10 | 48;
        }
        this.f75827h = i11;
        if (i11 == 119) {
            Rect rect = new Rect();
            Drawable drawable = this.f75824e;
            if (drawable != null) {
                drawable.getPadding(rect);
            }
        }
        requestLayout();
    }

    public final void setShadowColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f34776hh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75831l = i10;
        e(getShadowRadius(), this.f75835p, this.f75836q, i10);
    }

    public final void setShadowDx(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f34891mh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75835p = f10;
        e(getShadowRadius(), f10, this.f75836q, this.f75831l);
    }

    public final void setShadowDy(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f34914nh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75836q = f10;
        e(getShadowRadius(), this.f75835p, f10, this.f75831l);
    }

    public final void setShadowMargin(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.m.Qh, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setShadowMarginLeft(i10);
        setShadowMarginTop(i11);
        setShadowMarginRight(i12);
        setShadowMarginBottom(i13);
        requestLayout();
        invalidate();
    }

    public final void setShadowMarginBottom(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35093vh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75844y = i10;
        d();
    }

    public final void setShadowMarginLeft(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35049th, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75842w = i10;
        d();
    }

    public final void setShadowMarginRight(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35071uh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75843x = i10;
        d();
    }

    public final void setShadowMarginTop(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.m.f35027sh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f75841v = i10;
        d();
    }

    public final void setShadowRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.m.f34868lh, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (f10 > getShadowMarginMax()) {
            if (!(getShadowMarginMax() == 0.0f)) {
                f10 = getShadowMarginMax();
            }
        }
        this.f75834o = f10;
        e(f10, this.f75835p, this.f75836q, this.f75831l);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public boolean verifyDrawable(@d Drawable who) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{who}, this, changeQuickRedirect, false, c.m.Lh, new Class[]{Drawable.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(who, "who");
        return super.verifyDrawable(who) || who == this.f75824e;
    }
}
