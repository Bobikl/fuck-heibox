package com.max.xiaoheihe.view.slicegradeview;

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
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.shinebuttonlib.PorterImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MaskImageView.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class MaskImageView extends PorterImageView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f96111z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @e
    private Drawable f96112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e
    private Matrix f96113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @e
    private Matrix f96114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @d
    private PorterDuffXfermode f96115y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskImageView(@d Context context) {
        super(context);
        f0.p(context, "context");
        this.f96115y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        i(context, null, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskImageView(@d Context context, @e AttributeSet attributeSet) {
        super(context, attributeSet);
        f0.p(context, "context");
        this.f96115y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        i(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskImageView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        this.f96115y = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        i(context, attributeSet, i10);
    }

    private final void i(Context context, AttributeSet attributeSet, int i10) {
        PorterDuffXfermode porterDuffXfermode;
        if (PatchProxy.proxy(new Object[]{context, attributeSet, new Integer(i10)}, this, changeQuickRedirect, false, 49668, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f69386h = false;
        setAllowProcess(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f76262a3, i10, 0);
            f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…erImageView, defStyle, 0)");
            this.f96112v = typedArrayObtainStyledAttributes.getDrawable(1);
            switch (typedArrayObtainStyledAttributes.getInt(0, 6)) {
                case 1:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC);
                    break;
                case 2:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST);
                    break;
                case 3:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER);
                    break;
                case 4:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OVER);
                    break;
                case 5:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
                    break;
                case 6:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                    break;
                case 7:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT);
                    break;
                case 8:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
                    break;
                case 9:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
                    break;
                case 10:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP);
                    break;
                default:
                    porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                    break;
            }
            this.f96115y = porterDuffXfermode;
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f96113w = new Matrix();
    }

    private final void j(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49672, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f96114x = null;
        Drawable drawable = this.f96112v;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            boolean z10 = i10 == intrinsicWidth && i11 == intrinsicHeight;
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || z10) {
                return;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f10 = i10;
            float f11 = intrinsicWidth;
            float f12 = i11;
            float f13 = intrinsicHeight;
            float fMin = Math.min(f10 / f11, f12 / f13);
            getMatrix().setScale(fMin, fMin);
            getMatrix().postTranslate((int) (((f10 - (f11 * fMin)) * 0.5f) + 0.5f), (int) (((f12 - (f13 * fMin)) * 0.5f) + 0.5f));
        }
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView
    public void g(@d Canvas maskCanvas, @e Paint paint, int i10, int i11) {
        Object[] objArr = {maskCanvas, paint, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49671, new Class[]{Canvas.class, Paint.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(maskCanvas, "maskCanvas");
        Drawable drawable = this.f96112v;
        if (drawable != null) {
            if (drawable instanceof BitmapDrawable) {
                j(getWidth(), getHeight());
                if (this.f96114x != null) {
                    int saveCount = maskCanvas.getSaveCount();
                    maskCanvas.save();
                    maskCanvas.concat(getMatrix());
                    drawable.draw(maskCanvas);
                    maskCanvas.restoreToCount(saveCount);
                    return;
                }
            }
            drawable.setBounds(0, 0, getWidth(), getHeight());
            drawable.draw(maskCanvas);
        }
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView
    @e
    public PorterDuffXfermode getPorterDuffXfermode() {
        return this.f96115y;
    }

    public final float getProgressHeight() {
        return this.f69393o;
    }

    public final float getProgressWidth() {
        return this.f69394p;
    }

    @Override // com.max.hbcustomview.shinebuttonlib.PorterImageView
    public void setCoverDrawable(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 49670, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        Drawable drawable = this.f96112v;
        if (drawable == null) {
            super.setCoverDrawable(i10, i11);
        } else {
            this.f69391m = drawable;
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public final void setProgressHeight(float f10) {
        this.f69393o = f10;
    }

    public final void setProgressWidth(float f10) {
        this.f69394p = f10;
    }

    public final void setShape(@d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 49669, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawable, "drawable");
        this.f96112v = drawable;
        invalidate();
    }
}
