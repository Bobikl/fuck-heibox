package com.max.hbcustomview.roundedview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import bb.c;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: HBRoundedCornerLinearLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nHBRoundedCornerLinearLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HBRoundedCornerLinearLayout.kt\ncom/max/hbcustomview/roundedview/HBRoundedCornerLinearLayout\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,72:1\n52#2,9:73\n*S KotlinDebug\n*F\n+ 1 HBRoundedCornerLinearLayout.kt\ncom/max/hbcustomview/roundedview/HBRoundedCornerLinearLayout\n*L\n26#1:73,9\n*E\n"})
public final class HBRoundedCornerLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final Path f69259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    private final RectF f69260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private Drawable f69261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f69262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f69263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f69264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f69265h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerLinearLayout(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerLinearLayout(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public HBRoundedCornerLinearLayout(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f69259b = new Path();
        this.f69260c = new RectF();
        int[] HBRoundedView = R.styleable.Y0;
        f0.o(HBRoundedView, "HBRoundedView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, HBRoundedView, 0, 0);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        this.f69262e = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusTopLeft, 0.0f);
        this.f69263f = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusTopRight, 0.0f);
        this.f69264g = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusBottomRight, 0.0f);
        this.f69265h = typedArrayObtainStyledAttributes.getDimension(R.styleable.HBRoundedView_cornerRadiusBottomLeft, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
    }

    public /* synthetic */ HBRoundedCornerLinearLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(@d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, c.f.fn, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        this.f69259b.reset();
        this.f69260c.set(0.0f, 0.0f, getWidth(), getHeight());
        float f10 = this.f69262e;
        float f11 = this.f69263f;
        float f12 = this.f69264g;
        float f13 = this.f69265h;
        this.f69259b.addRoundRect(this.f69260c, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
        canvas.clipPath(this.f69259b);
        Drawable drawable = this.f69261d;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.f.en, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69261d = drawable;
        super.setBackground(null);
    }

    public final void setCornerRadius(float f10, float f11, float f12, float f13) {
        Object[] objArr = {new Float(f10), new Float(f11), new Float(f12), new Float(f13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Float.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.f.gn, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69262e = f10;
        this.f69263f = f11;
        this.f69264g = f12;
        this.f69265h = f13;
        invalidate();
    }
}
