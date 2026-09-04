package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.n;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R;
import com.google.android.material.resources.c;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.google.android.material.shape.q;
import com.google.android.material.shape.t;

/* JADX INFO: loaded from: classes7.dex */
public class ShapeableImageView extends AppCompatImageView implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f54346t = R.style.Widget_MaterialComponents_ShapeableImageView;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f54347u = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q f54348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RectF f54349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f54350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f54351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f54352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f54353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private ColorStateList f54354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private k f54355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p f54356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @r
    private float f54357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Path f54358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @r
    private int f54359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @r
    private int f54360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @r
    private int f54361o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @r
    private int f54362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @r
    private int f54363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @r
    private int f54364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f54365s;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f54366a = new Rect();

        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f54356j == null) {
                return;
            }
            if (ShapeableImageView.this.f54355i == null) {
                ShapeableImageView.this.f54355i = new k(ShapeableImageView.this.f54356j);
            }
            ShapeableImageView.this.f54349c.round(this.f54366a);
            ShapeableImageView.this.f54355i.setBounds(this.f54366a);
            ShapeableImageView.this.f54355i.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    public ShapeableImageView(Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ShapeableImageView(Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f54346t;
        super(j9.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f54348b = q.k();
        this.f54353g = new Path();
        this.f54365s = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f54352f = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f54349c = new RectF();
        this.f54350d = new RectF();
        this.f54358l = new Path();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, R.styleable.f52853l1, i10, i11);
        setLayerType(2, null);
        this.f54354h = c.a(context2, typedArrayObtainStyledAttributes, R.styleable.ShapeableImageView_strokeColor);
        this.f54357k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_strokeWidth, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPadding, 0);
        this.f54359m = dimensionPixelSize;
        this.f54360n = dimensionPixelSize;
        this.f54361o = dimensionPixelSize;
        this.f54362p = dimensionPixelSize;
        this.f54359m = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingLeft, dimensionPixelSize);
        this.f54360n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingTop, dimensionPixelSize);
        this.f54361o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingRight, dimensionPixelSize);
        this.f54362p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingBottom, dimensionPixelSize);
        this.f54363q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingStart, Integer.MIN_VALUE);
        this.f54364r = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ShapeableImageView_contentPaddingEnd, Integer.MIN_VALUE);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.f54351e = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.f54356j = p.e(context2, attributeSet, i10, i11).m();
        setOutlineProvider(new a());
    }

    private void j(Canvas canvas) {
        if (this.f54354h == null) {
            return;
        }
        this.f54351e.setStrokeWidth(this.f54357k);
        int colorForState = this.f54354h.getColorForState(getDrawableState(), this.f54354h.getDefaultColor());
        if (this.f54357k <= 0.0f || colorForState == 0) {
            return;
        }
        this.f54351e.setColor(colorForState);
        canvas.drawPath(this.f54353g, this.f54351e);
    }

    private boolean k() {
        return (this.f54363q == Integer.MIN_VALUE && this.f54364r == Integer.MIN_VALUE) ? false : true;
    }

    private boolean l() {
        return getLayoutDirection() == 1;
    }

    private void m(int i10, int i11) {
        this.f54349c.set(getPaddingLeft(), getPaddingTop(), i10 - getPaddingRight(), i11 - getPaddingBottom());
        this.f54348b.d(this.f54356j, 1.0f, this.f54349c, this.f54353g);
        this.f54358l.rewind();
        this.f54358l.addPath(this.f54353g);
        this.f54350d.set(0.0f, 0.0f, i10, i11);
        this.f54358l.addRect(this.f54350d, Path.Direction.CCW);
    }

    @r
    public int getContentPaddingBottom() {
        return this.f54362p;
    }

    @r
    public final int getContentPaddingEnd() {
        int i10 = this.f54364r;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return l() ? this.f54359m : this.f54361o;
    }

    @r
    public int getContentPaddingLeft() {
        int i10;
        int i11;
        if (k()) {
            if (l() && (i11 = this.f54364r) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!l() && (i10 = this.f54363q) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f54359m;
    }

    @r
    public int getContentPaddingRight() {
        int i10;
        int i11;
        if (k()) {
            if (l() && (i11 = this.f54363q) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!l() && (i10 = this.f54364r) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f54361o;
    }

    @r
    public final int getContentPaddingStart() {
        int i10 = this.f54363q;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        return l() ? this.f54361o : this.f54359m;
    }

    @r
    public int getContentPaddingTop() {
        return this.f54360n;
    }

    @Override // android.view.View
    @r
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @r
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @r
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @r
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @r
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @r
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // com.google.android.material.shape.t
    @n0
    public p getShapeAppearanceModel() {
        return this.f54356j;
    }

    @p0
    public ColorStateList getStrokeColor() {
        return this.f54354h;
    }

    @r
    public float getStrokeWidth() {
        return this.f54357k;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f54358l, this.f54352f);
        j(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f54365s && isLayoutDirectionResolved()) {
            this.f54365s = true;
            if (isPaddingRelative() || k()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        m(i10, i11);
    }

    public void setContentPadding(@r int i10, @r int i11, @r int i12, @r int i13) {
        this.f54363q = Integer.MIN_VALUE;
        this.f54364r = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f54359m) + i10, (super.getPaddingTop() - this.f54360n) + i11, (super.getPaddingRight() - this.f54361o) + i12, (super.getPaddingBottom() - this.f54362p) + i13);
        this.f54359m = i10;
        this.f54360n = i11;
        this.f54361o = i12;
        this.f54362p = i13;
    }

    @w0(17)
    public void setContentPaddingRelative(@r int i10, @r int i11, @r int i12, @r int i13) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i10, (super.getPaddingTop() - this.f54360n) + i11, (super.getPaddingEnd() - getContentPaddingEnd()) + i12, (super.getPaddingBottom() - this.f54362p) + i13);
        this.f54359m = l() ? i12 : i10;
        this.f54360n = i11;
        if (!l()) {
            i10 = i12;
        }
        this.f54361o = i10;
        this.f54362p = i13;
    }

    @Override // android.view.View
    public void setPadding(@r int i10, @r int i11, @r int i12, @r int i13) {
        super.setPadding(i10 + getContentPaddingLeft(), i11 + getContentPaddingTop(), i12 + getContentPaddingRight(), i13 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@r int i10, @r int i11, @r int i12, @r int i13) {
        super.setPaddingRelative(i10 + getContentPaddingStart(), i11 + getContentPaddingTop(), i12 + getContentPaddingEnd(), i13 + getContentPaddingBottom());
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@n0 p pVar) {
        this.f54356j = pVar;
        k kVar = this.f54355i;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
        m(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@p0 ColorStateList colorStateList) {
        this.f54354h = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@n int i10) {
        setStrokeColor(b0.a.a(getContext(), i10));
    }

    public void setStrokeWidth(@r float f10) {
        if (this.f54357k != f10) {
            this.f54357k = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@androidx.annotation.q int i10) {
        setStrokeWidth(getResources().getDimensionPixelSize(i10));
    }
}
