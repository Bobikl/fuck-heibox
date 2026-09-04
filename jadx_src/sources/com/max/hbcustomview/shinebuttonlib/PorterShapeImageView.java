package com.max.hbcustomview.shinebuttonlib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class PorterShapeImageView extends PorterImageView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f69399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Matrix f69400w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Matrix f69401x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private PorterDuffXfermode f69402y;

    public PorterShapeImageView(Context context) {
        super(context);
        this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        i(context, null, 0);
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        i(context, attributeSet, 0);
    }

    public PorterShapeImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        i(context, attributeSet, i10);
    }

    private void i(Context context, AttributeSet attributeSet, int i10) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.Ep, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68702q2, i10, 0);
            this.f69399v = typedArrayObtainStyledAttributes.getDrawable(R.styleable.PorterImageView_siShape);
            int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.PorterImageView_siPorterDuff, 6);
            if (i11 == 1) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.SRC);
            } else if (i11 == 2) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST);
            } else if (i11 == 3) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
            } else if (i11 == 4) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_OVER);
            } else if (i11 == 5) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
            } else if (i11 == 6) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
            } else if (i11 == 7) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
            } else if (i11 == 8) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            } else if (i11 == 9) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
            } else if (i11 == 10) {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP);
            } else {
                this.f69402y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f69400w = new Matrix();
    }

    private void j(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Ip, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f69401x = null;
        int intrinsicWidth = this.f69399v.getIntrinsicWidth();
        int intrinsicHeight = this.f69399v.getIntrinsicHeight();
        boolean z10 = i10 == intrinsicWidth && i11 == intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z10) {
            return;
        }
        this.f69399v.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        float f10 = i10;
        float f11 = intrinsicWidth;
        float f12 = i11;
        float f13 = intrinsicHeight;
        float fMin = Math.min(f10 / f11, f12 / f13);
        this.f69400w.setScale(fMin, fMin);
        this.f69400w.postTranslate((int) (((f10 - (f11 * fMin)) * 0.5f) + 0.5f), (int) (((f12 - (f13 * fMin)) * 0.5f) + 0.5f));
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView
    public void g(Canvas canvas, Paint paint, int i10, int i11) {
        Drawable drawable;
        Object[] objArr = {canvas, paint, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Hp, new Class[]{Canvas.class, Paint.class, cls, cls}, Void.TYPE).isSupported || (drawable = this.f69399v) == null) {
            return;
        }
        if (drawable instanceof BitmapDrawable) {
            j(getWidth(), getHeight());
            if (this.f69401x != null) {
                int saveCount = canvas.getSaveCount();
                canvas.save();
                canvas.concat(this.f69400w);
                this.f69399v.draw(canvas);
                canvas.restoreToCount(saveCount);
                return;
            }
        }
        this.f69399v.setBounds(0, 0, getWidth(), getHeight());
        this.f69399v.draw(canvas);
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView
    public PorterDuffXfermode getPorterDuffXfermode() {
        return this.f69402y;
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView
    public void setCoverDrawable(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.Gp, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = this.f69399v;
        if (drawable == null) {
            super.setCoverDrawable(i10, i11);
        } else {
            this.f69391m = drawable;
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setShape(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.f.Fp, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f69399v = drawable;
        h();
        invalidate();
    }
}
