package com.max.hbcustomview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.t0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: RadiusLayout.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class RadiusLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Path f68755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f68756c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public RadiusLayout(@dl.d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public RadiusLayout(@dl.d Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public RadiusLayout(@dl.d Context context, @dl.e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f68755b = new Path();
    }

    public /* synthetic */ RadiusLayout(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@dl.d Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.I9, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(canvas, "canvas");
        canvas.clipPath(this.f68755b);
        super.dispatchDraw(canvas);
    }

    @t0
    public final float getRadius() {
        return this.f68756c;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.H9, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        this.f68755b.reset();
        Path path = this.f68755b;
        RectF rectF = new RectF(0.0f, 0.0f, i10, i11);
        float f10 = this.f68756c;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
    }

    public final void setRadius(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, bb.c.f.G9, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68756c = f10;
        invalidate();
    }
}
