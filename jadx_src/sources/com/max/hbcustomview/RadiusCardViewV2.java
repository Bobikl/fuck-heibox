package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class RadiusCardViewV2 extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f68750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f68751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f68752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f68753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Path f68754o;

    public RadiusCardViewV2(Context context) {
        this(context, null);
    }

    public RadiusCardViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public RadiusCardViewV2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68754o = null;
        setRadius(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.A2);
        this.f68750k = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardViewV2_rcv_topLeftRadius, 0.0f);
        this.f68751l = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardViewV2_rcv_topRightRadius, 0.0f);
        this.f68752m = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardViewV2_rcv_bottomRightRadius, 0.0f);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardViewV2_rcv_bottomLeftRadius, 0.0f);
        this.f68753n = dimension;
        setRadius(this.f68750k, this.f68751l, this.f68752m, dimension);
        typedArrayObtainStyledAttributes.recycle();
    }

    private RectF getRectF() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.F9, new Class[0], RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        Rect rect = new Rect();
        getDrawingRect(rect);
        return new RectF(rect);
    }

    private Path h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.D9, new Class[0], Path.class);
        if (patchProxyResultProxy.isSupported) {
            return (Path) patchProxyResultProxy.result;
        }
        Path path = this.f68754o;
        if (path != null) {
            return path;
        }
        this.f68754o = new Path();
        RectF rectF = getRectF();
        float f10 = this.f68750k;
        float f11 = this.f68751l;
        float f12 = this.f68752m;
        float f13 = this.f68753n;
        this.f68754o.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
        return this.f68754o;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.E9, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        canvas.clipPath(h(), Region.Op.INTERSECT);
        super.onDraw(canvas);
    }

    public void setRadius(float f10, float f11, float f12, float f13) {
        this.f68750k = f10;
        this.f68751l = f11;
        this.f68752m = f12;
        this.f68753n = f13;
        this.f68754o = null;
    }
}
