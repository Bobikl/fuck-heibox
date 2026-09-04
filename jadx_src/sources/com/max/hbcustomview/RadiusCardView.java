package com.max.hbcustomview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class RadiusCardView extends MaterialCardView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private float A;
    private float B;
    private float C;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float f68749z;

    public RadiusCardView(Context context) {
        this(context, null);
    }

    public RadiusCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public RadiusCardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setRadius(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68747z2);
        this.f68749z = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardView_rcv_topLeftRadiu, 0.0f);
        this.A = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardView_rcv_topRightRadiu, 0.0f);
        this.B = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardView_rcv_bottomRightRadiu, 0.0f);
        this.C = typedArrayObtainStyledAttributes.getDimension(R.styleable.RadiusCardView_rcv_bottomLeftRadiu, 0.0f);
        setBackground(new ColorDrawable());
    }

    private RectF getRectF() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.C9, new Class[0], RectF.class);
        if (patchProxyResultProxy.isSupported) {
            return (RectF) patchProxyResultProxy.result;
        }
        Rect rect = new Rect();
        getDrawingRect(rect);
        return new RectF(rect);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.B9, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        Path path = new Path();
        RectF rectF = getRectF();
        float f10 = this.f68749z;
        float f11 = this.A;
        float f12 = this.B;
        float f13 = this.C;
        path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.INTERSECT);
        super.onDraw(canvas);
    }

    public void setRadius(float f10, float f11, float f12, float f13) {
        this.f68749z = f10;
        this.A = f11;
        this.B = f12;
        this.C = f13;
    }
}
