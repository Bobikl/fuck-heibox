package com.starlightc.ucropplus.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes4.dex */
public class FastBitmapDrawable extends Drawable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Bitmap mBitmap;
    private int mHeight;
    private int mWidth;
    private final Paint mPaint = new Paint(2);
    private int mAlpha = 255;

    public FastBitmapDrawable(Bitmap bitmap) {
        setBitmap(bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, 50916, new Class[]{Canvas.class}, Void.TYPE).isSupported || (bitmap = this.mBitmap) == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.mBitmap, (Rect) null, getBounds(), this.mPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mAlpha;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.mHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.mWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 50919, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mAlpha = i10;
        this.mPaint.setAlpha(i10);
    }

    public void setBitmap(Bitmap bitmap) {
        if (PatchProxy.proxy(new Object[]{bitmap}, this, changeQuickRedirect, false, 50920, new Class[]{Bitmap.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mBitmap = bitmap;
        if (bitmap != null) {
            this.mWidth = bitmap.getWidth();
            this.mHeight = this.mBitmap.getHeight();
        } else {
            this.mHeight = 0;
            this.mWidth = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (PatchProxy.proxy(new Object[]{colorFilter}, this, changeQuickRedirect, false, 50917, new Class[]{ColorFilter.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mPaint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 50918, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mPaint.setFilterBitmap(z10);
    }
}
