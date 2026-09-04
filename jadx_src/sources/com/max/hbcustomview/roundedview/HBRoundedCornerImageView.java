package com.max.hbcustomview.roundedview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.annotation.n;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.AppCompatImageView;
import bb.c;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HBRoundedCornerImageView.kt */
/* JADX INFO: loaded from: classes10.dex */
public class HBRoundedCornerImageView extends AppCompatImageView {
    private static final int A = 0;
    private static final int B = 0;
    private static final int C = -1;
    private static final int D = 0;
    private static final boolean E = false;
    private static final boolean F = false;
    private static final int G = 50;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @d
    public static final a f69226w = new a(null);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    private static final ImageView.ScaleType f69227x = ImageView.ScaleType.CENTER_CROP;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @d
    private static final Bitmap.Config f69228y = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f69229z = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final RectF f69230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final RectF f69231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    private final Matrix f69232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    private final Paint f69233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final Paint f69234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private final Paint f69235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f69237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f69238j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69239k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @e
    private Bitmap f69240l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @e
    private BitmapShader f69241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f69243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f69244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f69245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f69246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @e
    private ColorFilter f69247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f69248t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f69249u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f69250v;

    /* JADX INFO: compiled from: HBRoundedCornerImageView.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: HBRoundedCornerImageView.kt */
    @w0(api = 21)
    public final class b extends ViewOutlineProvider {
        public static ChangeQuickRedirect changeQuickRedirect;

        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(@d View view, @d Outline outline) {
            if (PatchProxy.proxy(new Object[]{view, outline}, this, changeQuickRedirect, false, c.f.Ym, new Class[]{View.class, Outline.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(view, "view");
            f0.p(outline, "outline");
            Rect rect = new Rect();
            HBRoundedCornerImageView.this.f69231c.roundOut(rect);
            outline.setRoundRect(rect, rect.width() / 2.0f);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerImageView(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerImageView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerImageView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f69230b = new RectF();
        this.f69231c = new RectF();
        this.f69232d = new Matrix();
        this.f69233e = new Paint();
        this.f69234f = new Paint();
        this.f69235g = new Paint();
        this.f69236h = -1;
        this.f69238j = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.X0, i10, 0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f69237i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HBRoundedCornerImageView_hb_border_width, 0);
        this.f69236h = typedArrayObtainStyledAttributes.getColor(R.styleable.HBRoundedCornerImageView_hb_border_color, -1);
        this.f69250v = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HBRoundedCornerImageView_hb_border_overlay, false);
        this.f69239k = typedArrayObtainStyledAttributes.getColor(R.styleable.HBRoundedCornerImageView_hb_background_color, 0);
        this.f69238j = typedArrayObtainStyledAttributes.getBoolean(R.styleable.HBRoundedCornerImageView_hb_circle_mode, false);
        this.f69244p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.HBRoundedCornerImageView_hb_rounded_corner, 0);
        typedArrayObtainStyledAttributes.recycle();
        init();
    }

    public /* synthetic */ HBRoundedCornerImageView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Qm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69233e.setColorFilter(this.f69247s);
    }

    private final RectF h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Um, new Class[0], RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        if (!this.f69238j) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            return new RectF(paddingLeft, paddingTop, width + paddingLeft, height + paddingTop);
        }
        int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int iB = fi.u.B(width2, height2);
        float paddingLeft2 = getPaddingLeft() + ((width2 - iB) / 2.0f);
        float paddingTop2 = getPaddingTop() + ((height2 - iB) / 2.0f);
        float f10 = iB;
        return new RectF(paddingLeft2, paddingTop2, paddingLeft2 + f10, f10 + paddingTop2);
    }

    private final void i(Canvas canvas, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, c.f.Am, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.drawCircle(this.f69230b.centerX(), this.f69230b.centerY(), this.f69245q, paint);
    }

    private final void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.um, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.setScaleType(f69227x);
        this.f69248t = true;
        setOutlineProvider(new b());
        if (this.f69249u) {
            q();
            this.f69249u = false;
        }
    }

    private final void j(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.zm, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69239k != 0) {
            i(canvas, this.f69235g);
        }
        i(canvas, this.f69233e);
        if (this.f69237i > 0) {
            i(canvas, this.f69234f);
        }
    }

    private final void k(Canvas canvas, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, c.f.Bm, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        RectF rectF = this.f69230b;
        int i10 = this.f69244p;
        canvas.drawRoundRect(rectF, i10, i10, paint);
    }

    private final void l(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.ym, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f69239k != 0) {
            k(canvas, this.f69235g);
        }
        k(canvas, this.f69233e);
        if (this.f69237i > 0) {
            k(canvas, this.f69234f);
        }
    }

    private final Bitmap m(Drawable drawable) {
        Bitmap bitmapCreateBitmap;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.Rm, new Class[]{Drawable.class}, Bitmap.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bitmap) patchProxyResultProxy.result;
        }
        Bitmap bitmap = null;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                bitmapCreateBitmap = Bitmap.createBitmap(2, 2, f69228y);
                f0.m(bitmapCreateBitmap);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f69228y);
                f0.m(bitmapCreateBitmap);
            }
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmap = bitmapCreateBitmap;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return bitmap;
    }

    private final boolean n(float f10, float f11) {
        Object[] objArr = {new Float(f10), new Float(f11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Xm, new Class[]{cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return this.f69231c.isEmpty() || Math.pow((double) (f10 - this.f69231c.centerX()), 2.0d) + Math.pow((double) (f11 - this.f69231c.centerY()), 2.0d) <= Math.pow((double) this.f69246r, 2.0d);
    }

    private final void o() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Sm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69240l = m(getDrawable());
        q();
    }

    private final void q() {
        int i10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Tm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.f69248t) {
            this.f69249u = true;
            return;
        }
        if (getWidth() == 0 && getHeight() == 0) {
            return;
        }
        if (this.f69240l == null) {
            invalidate();
            return;
        }
        Bitmap bitmap = this.f69240l;
        f0.m(bitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f69241m = new BitmapShader(bitmap, tileMode, tileMode);
        Paint paint = this.f69233e;
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setShader(this.f69241m);
        Paint paint2 = this.f69234f;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.f69236h);
        paint2.setStrokeWidth(this.f69237i);
        Paint paint3 = this.f69235g;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        paint3.setColor(this.f69239k);
        Bitmap bitmap2 = this.f69240l;
        this.f69243o = bitmap2 != null ? bitmap2.getHeight() : 0;
        Bitmap bitmap3 = this.f69240l;
        this.f69242n = bitmap3 != null ? bitmap3.getWidth() : 0;
        this.f69231c.set(h());
        this.f69246r = fi.u.A((this.f69231c.height() - this.f69237i) / 2.0f, (this.f69231c.width() - this.f69237i) / 2.0f);
        this.f69230b.set(this.f69231c);
        if (!this.f69250v && (i10 = this.f69237i) > 0) {
            this.f69230b.inset(i10 - 1.0f, i10 - 1.0f);
        }
        this.f69245q = fi.u.A(this.f69230b.height() / 2.0f, this.f69230b.width() / 2.0f);
        g();
        r();
        invalidate();
    }

    private final void r() {
        float fWidth;
        float fHeight;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.Vm, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69232d.set(null);
        float fWidth2 = 0.0f;
        if (this.f69242n * this.f69230b.height() > this.f69230b.width() * this.f69243o) {
            fWidth = this.f69230b.height() / this.f69243o;
            fHeight = 0.0f;
            fWidth2 = (this.f69230b.width() - (this.f69242n * fWidth)) * 0.5f;
        } else {
            fWidth = this.f69230b.width() / this.f69242n;
            fHeight = (this.f69230b.height() - (this.f69243o * fWidth)) * 0.5f;
        }
        if (this.f69238j) {
            this.f69232d.setScale(fWidth, fWidth);
            this.f69232d.postTranslate(fi.u.A(((int) (fWidth2 + 0.5f)) + this.f69230b.left, 50.0f), fi.u.A(((int) (fHeight + 0.5f)) + this.f69230b.top, 50.0f));
            BitmapShader bitmapShader = this.f69241m;
            if (bitmapShader != null) {
                bitmapShader.setLocalMatrix(this.f69232d);
                return;
            }
            return;
        }
        this.f69232d.setScale(fWidth, fWidth);
        Matrix matrix = this.f69232d;
        RectF rectF = this.f69230b;
        matrix.postTranslate(((int) (fWidth2 + 0.5f)) + rectF.left, ((int) (fHeight + 0.5f)) + rectF.top);
        BitmapShader bitmapShader2 = this.f69241m;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(this.f69232d);
        }
    }

    public final int getBorderColor() {
        return this.f69236h;
    }

    public final int getBorderWidth() {
        return this.f69237i;
    }

    public final int getCircleBackgroundColor() {
        return this.f69239k;
    }

    @Override // android.widget.ImageView
    @e
    public ColorFilter getColorFilter() {
        return this.f69247s;
    }

    public final int getCornerRadius() {
        return this.f69244p;
    }

    @Override // android.widget.ImageView
    @d
    public ImageView.ScaleType getScaleType() {
        return f69227x;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.xm, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        if (this.f69240l == null) {
            return;
        }
        if (this.f69238j) {
            j(canvas);
        } else {
            l(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Cm, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        q();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@d MotionEvent event) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{event}, this, changeQuickRedirect, false, c.f.Wm, new Class[]{MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(event, "event");
        return n(event.getX(), event.getY()) && super.onTouchEvent(event);
    }

    public final boolean p() {
        return this.f69250v;
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.wm, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setAdjustViewBounds(false);
    }

    public final void setBorderColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Fm, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || i10 == this.f69236h) {
            return;
        }
        this.f69236h = i10;
        this.f69234f.setColor(i10);
        q();
    }

    public final void setBorderOverlay(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.f.Km, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || z10 == this.f69250v) {
            return;
        }
        this.f69250v = z10;
        q();
    }

    public final void setBorderWidth(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Jm, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || i10 == this.f69237i) {
            return;
        }
        this.f69237i = i10;
        q();
    }

    public final void setCircleBackgroundColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Gm, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || i10 == this.f69239k) {
            return;
        }
        this.f69239k = i10;
        this.f69235g.setColor(i10);
        q();
    }

    public final void setCircleBackgroundColorResource(@n int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Im, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setCircleBackgroundColor(getContext().getResources().getColor(i10));
    }

    @Override // android.widget.ImageView
    public void setColorFilter(@d ColorFilter cf2) {
        if (PatchProxy.proxy(new Object[]{cf2}, this, changeQuickRedirect, false, c.f.Pm, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cf2, "cf");
        if (cf2 == this.f69247s) {
            return;
        }
        this.f69247s = cf2;
        g();
        invalidate();
    }

    public final void setCornerRadius(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Hm, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || i10 == this.f69244p) {
            return;
        }
        this.f69244p = i10;
        q();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(@d Bitmap bm) {
        if (PatchProxy.proxy(new Object[]{bm}, this, changeQuickRedirect, false, c.f.Lm, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bm, "bm");
        super.setImageBitmap(bm);
        o();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.Mm, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageDrawable(drawable);
        o();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@v int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.f.Nm, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageResource(i10);
        o();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(@e Uri uri) {
        if (PatchProxy.proxy(new Object[]{uri}, this, changeQuickRedirect, false, c.f.Om, new Class[]{Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setImageURI(uri);
        o();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Dm, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.setPadding(i10, i11, i12, i13);
        q();
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Em, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.setPaddingRelative(i10, i11, i12, i13);
        q();
    }

    @Override // android.widget.ImageView
    public void setScaleType(@d ImageView.ScaleType scaleType) {
        if (PatchProxy.proxy(new Object[]{scaleType}, this, changeQuickRedirect, false, c.f.vm, new Class[]{ImageView.ScaleType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(scaleType, "scaleType");
        super.setScaleType(f69227x);
    }
}
