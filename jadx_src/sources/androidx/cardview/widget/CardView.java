package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.l;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.t0;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f3373i = {R.attr.colorBackground};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e f3374j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f3377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f3378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Rect f3379f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Rect f3380g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f3381h;

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f3382a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void b(int i10, int i11, int i12, int i13) {
            CardView.this.f3380g.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f3379f;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public void d(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.f3377d) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.f3378e) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        @Override // androidx.cardview.widget.d
        public void e(Drawable drawable) {
            this.f3382a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public Drawable f() {
            return this.f3382a;
        }

        @Override // androidx.cardview.widget.d
        public boolean g() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public View h() {
            return CardView.this;
        }
    }

    static {
        b bVar = new b();
        f3374j = bVar;
        bVar.n();
    }

    public CardView(@n0 Context context) {
        this(context, null);
    }

    public CardView(@n0 Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, androidx.cardview.R.attr.cardViewStyle);
    }

    public CardView(@n0 Context context, @p0 AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f3379f = rect;
        this.f3380g = new Rect();
        a aVar = new a();
        this.f3381h = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.f3372a, i10, androidx.cardview.R.style.CardView);
        int i11 = androidx.cardview.R.styleable.CardView_cardBackgroundColor;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f3373i);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(androidx.cardview.R.color.cardview_light_background) : getResources().getColor(androidx.cardview.R.color.cardview_dark_background));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardMaxElevation, 0.0f);
        this.f3375b = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardUseCompatPadding, false);
        this.f3376c = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f3377d = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minWidth, 0);
        this.f3378e = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        f3374j.l(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    @n0
    public ColorStateList getCardBackgroundColor() {
        return f3374j.j(this.f3381h);
    }

    public float getCardElevation() {
        return f3374j.d(this.f3381h);
    }

    @t0
    public int getContentPaddingBottom() {
        return this.f3379f.bottom;
    }

    @t0
    public int getContentPaddingLeft() {
        return this.f3379f.left;
    }

    @t0
    public int getContentPaddingRight() {
        return this.f3379f.right;
    }

    @t0
    public int getContentPaddingTop() {
        return this.f3379f.top;
    }

    public float getMaxCardElevation() {
        return f3374j.b(this.f3381h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f3376c;
    }

    public float getRadius() {
        return f3374j.a(this.f3381h);
    }

    public boolean getUseCompatPadding() {
        return this.f3375b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        e eVar = f3374j;
        if (eVar instanceof b) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.f(this.f3381h)), View.MeasureSpec.getSize(i10)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.c(this.f3381h)), View.MeasureSpec.getSize(i11)), mode2);
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(@l int i10) {
        f3374j.o(this.f3381h, ColorStateList.valueOf(i10));
    }

    public void setCardBackgroundColor(@p0 ColorStateList colorStateList) {
        f3374j.o(this.f3381h, colorStateList);
    }

    public void setCardElevation(float f10) {
        f3374j.i(this.f3381h, f10);
    }

    public void setContentPadding(@t0 int i10, @t0 int i11, @t0 int i12, @t0 int i13) {
        this.f3379f.set(i10, i11, i12, i13);
        f3374j.e(this.f3381h);
    }

    public void setMaxCardElevation(float f10) {
        f3374j.g(this.f3381h, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f3378e = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f3377d = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f3376c) {
            this.f3376c = z10;
            f3374j.k(this.f3381h);
        }
    }

    public void setRadius(float f10) {
        f3374j.h(this.f3381h, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f3375b != z10) {
            this.f3375b = z10;
            f3374j.m(this.f3381h);
        }
    }
}
