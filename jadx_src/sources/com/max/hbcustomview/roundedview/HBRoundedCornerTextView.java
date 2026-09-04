package com.max.hbcustomview.roundedview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import bb.c;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HBRoundedCornerTextView.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nHBRoundedCornerTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBRoundedCornerTextView.kt\ncom/max/hbcustomview/roundedview/HBRoundedCornerTextView\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,141:1\n233#2,3:142\n*S KotlinDebug\n*F\n+ 1 HBRoundedCornerTextView.kt\ncom/max/hbcustomview/roundedview/HBRoundedCornerTextView\n*L\n37#1:142,3\n*E\n"})
public final class HBRoundedCornerTextView extends AppCompatTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Paint f69266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f69269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f69270f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private Drawable f69271g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private Shader f69272h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerTextView(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerTextView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerTextView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        Paint paint = new Paint(1);
        this.f69266b = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Y0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f69267c = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusTopLeft, 0.0f);
        this.f69268d = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusTopRight, 0.0f);
        this.f69269e = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusBottomRight, 0.0f);
        this.f69270f = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusBottomLeft, 0.0f);
        b2 b2Var = b2.f124493a;
        typedArrayObtainStyledAttributes.recycle();
        paint.setAntiAlias(true);
    }

    public /* synthetic */ HBRoundedCornerTextView(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void f(Canvas canvas, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, c.f.kn, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float[] cornerRadii = getCornerRadii();
        Path path = new Path();
        path.addRoundRect(rectF, cornerRadii, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    private final void g(Canvas canvas, GradientDrawable gradientDrawable) {
        if (PatchProxy.proxy(new Object[]{canvas, gradientDrawable}, this, changeQuickRedirect, false, c.f.jn, new Class[]{Canvas.class, GradientDrawable.class}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = this.f69267c;
        float f11 = this.f69268d;
        float f12 = this.f69269e;
        float f13 = this.f69270f;
        gradientDrawable.setCornerRadii(new float[]{f10, f10, f11, f11, f12, f12, f13, f13});
        gradientDrawable.setBounds(0, 0, getWidth(), getHeight());
        canvas.save();
        gradientDrawable.draw(canvas);
        canvas.restore();
    }

    private final float[] getCornerRadii() {
        float f10 = this.f69267c;
        float f11 = this.f69268d;
        float f12 = this.f69269e;
        float f13 = this.f69270f;
        return new float[]{f10, f10, f11, f11, f12, f12, f13, f13};
    }

    private final void h(Canvas canvas, Paint paint) {
        if (PatchProxy.proxy(new Object[]{canvas, paint}, this, changeQuickRedirect, false, c.f.ln, new Class[]{Canvas.class, Paint.class}, Void.TYPE).isSupported) {
            return;
        }
        RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        float[] cornerRadii = getCornerRadii();
        Path path = new Path();
        path.addRoundRect(rectF, cornerRadii, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.nn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.drawableStateChanged();
        postInvalidateOnAnimation();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 5650, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        Drawable drawable = this.f69271g;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
        }
        Drawable drawable2 = this.f69271g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = this.f69271g;
        if (drawable3 instanceof ColorDrawable) {
            this.f69266b.setColor(((ColorDrawable) drawable3).getColor());
            f(canvas, this.f69266b);
        } else if (drawable3 instanceof GradientDrawable) {
            g(canvas, (GradientDrawable) drawable3);
        } else if (drawable3 instanceof BitmapDrawable) {
            this.f69266b.setShader(this.f69272h);
            h(canvas, this.f69266b);
        } else {
            super.onDraw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.mn, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.hn, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!f0.g(this.f69271g, drawable) && (drawable instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f69272h = new BitmapShader(bitmap, tileMode, tileMode);
        }
        this.f69271g = drawable;
        postInvalidateOnAnimation();
    }
}
