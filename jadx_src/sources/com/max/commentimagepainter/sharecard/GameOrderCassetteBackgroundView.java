package com.max.commentimagepainter.sharecard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.annotation.l;
import androidx.appcompat.widget.AppCompatImageView;
import com.max.commentimagepainter.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: GameOrderCassetteBackgroundView.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GameOrderCassetteBackgroundView extends AppCompatImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f65282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f65283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f65284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f65285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final RectF f65286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final RectF f65287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final Paint f65288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final Paint f65289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final Paint f65290j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public GameOrderCassetteBackgroundView(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public GameOrderCassetteBackgroundView(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public GameOrderCassetteBackgroundView(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f65285e = ViewUtils.f(context, 75.0f);
        this.f65286f = new RectF();
        this.f65287g = new RectF();
        this.f65288h = new Paint(1);
        Paint paint = new Paint(1);
        this.f65289i = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(0);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f65290j = paint2;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.P0);
            f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f65282b = typedArrayObtainStyledAttributes.getDimension(R.styleable.GameOrderCassetteBackgroundView_clipRadius, 0.0f);
            this.f65283c = typedArrayObtainStyledAttributes.getColor(R.styleable.GameOrderCassetteBackgroundView_topColor, 0);
            this.f65284d = typedArrayObtainStyledAttributes.getColor(R.styleable.GameOrderCassetteBackgroundView_bottomColor, 0);
            this.f65285e = typedArrayObtainStyledAttributes.getDimension(R.styleable.GameOrderCassetteBackgroundView_bottomCreaseSpaceSize, ViewUtils.f(context, 75.0f));
            typedArrayObtainStyledAttributes.recycle();
        }
        paint.setColor(context.getColor(R.color.black));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ViewUtils.f(context, 1.5f));
        paint.setPathEffect(new DashPathEffect(new float[]{ViewUtils.f(context, 7.0f), ViewUtils.f(context, 4.0f)}, 0.0f));
    }

    public /* synthetic */ GameOrderCassetteBackgroundView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void d(Canvas canvas, float f10, float f11, float f12) {
        Object[] objArr = {canvas, new Float(f10), new Float(f11), new Float(f12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Uh, new Class[]{Canvas.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        canvas.drawCircle(f10, f11, f12, this.f65290j);
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.Qh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Paint paint = this.f65288h;
        RectF rectF = this.f65287g;
        paint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF.bottom, new int[]{this.f65283c, this.f65284d}, (float[]) null, Shader.TileMode.CLAMP));
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.b.Th, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        canvas.drawRect(this.f65287g, this.f65288h);
        super.onDraw(canvas);
        RectF rectF = this.f65287g;
        canvas.drawLine(0.0f, rectF.bottom - this.f65285e, rectF.width(), this.f65287g.bottom - this.f65285e, this.f65289i);
        RectF rectF2 = this.f65287g;
        d(canvas, rectF2.left, rectF2.top, this.f65282b);
        RectF rectF3 = this.f65287g;
        d(canvas, rectF3.right, rectF3.top, this.f65282b);
        RectF rectF4 = this.f65287g;
        d(canvas, rectF4.left, rectF4.bottom - this.f65285e, this.f65282b);
        RectF rectF5 = this.f65287g;
        d(canvas, rectF5.right, rectF5.bottom - this.f65285e, this.f65282b);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Sh, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        this.f65286f.set(0.0f, 0.0f, i10, i11);
        this.f65287g.set(this.f65286f.left + getPaddingLeft(), this.f65286f.top + getPaddingTop(), this.f65286f.right - getPaddingRight(), this.f65286f.bottom - getPaddingBottom());
        g();
    }

    public final void setBottomCreaseSpaceSize(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.b.Ph, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f65285e = ViewUtils.f(getContext(), f10);
    }

    public final void setDashLineColor(@l int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.b.Nh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f65289i.setColor(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.b.Rh, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.setPadding(i10, i11, i12, i13);
        g();
    }

    public final void setTopBottomColor(@l int i10, @l int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 1080, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f65283c = i10;
        this.f65284d = i11;
        g();
    }
}
