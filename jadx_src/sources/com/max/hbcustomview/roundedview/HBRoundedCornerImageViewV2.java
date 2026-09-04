package com.max.hbcustomview.roundedview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import bb.c;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HBRoundedCornerImageViewV2.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class HBRoundedCornerImageViewV2 extends AppCompatImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f69252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f69253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f69254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f69255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private final Path f69256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f69257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f69258h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerImageViewV2(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerImageViewV2(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerImageViewV2(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f69256f = new Path();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Y0);
            f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f69252b = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusTopLeft, 0.0f);
            this.f69253c = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusTopRight, 0.0f);
            this.f69254d = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusBottomRight, 0.0f);
            this.f69255e = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusBottomLeft, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ HBRoundedCornerImageViewV2(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    private final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.f.dn, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f69257g = 0;
        this.f69258h = 0;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.an, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        if (!this.f69256f.isEmpty()) {
            canvas.clipPath(this.f69256f);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.Zm, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == this.f69257g && i11 == this.f69258h) {
            return;
        }
        this.f69256f.reset();
        float f10 = this.f69252b;
        float f11 = this.f69253c;
        float f12 = this.f69254d;
        float f13 = this.f69255e;
        this.f69256f.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
        this.f69257g = i10;
        this.f69258h = i11;
    }

    public final void setCornerRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, c.f.f32202cn, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setCornerRadius(f10, f10, f10, f10);
    }

    public final void setCornerRadius(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.bn, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69252b = f10;
        this.f69253c = f11;
        this.f69254d = f12;
        this.f69255e = f13;
        d();
    }
}
