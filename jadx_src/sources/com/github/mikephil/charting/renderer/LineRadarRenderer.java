package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
public abstract class LineRadarRenderer extends LineScatterCandleRadarRenderer {
    public LineRadarRenderer(ChartAnimator chartAnimator, ViewPortHandler viewPortHandler) {
        super(chartAnimator, viewPortHandler);
    }

    private boolean clipPathSupported() {
        return Utils.getSDKInt() >= 18;
    }

    protected void drawFilledPath(Canvas canvas, Path path, int i10, int i11) {
        int i12 = (i10 & 16777215) | (i11 << 24);
        if (clipPathSupported()) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            canvas.drawColor(i12);
            canvas.restoreToCount(iSave);
            return;
        }
        Paint.Style style = this.mRenderPaint.getStyle();
        int color = this.mRenderPaint.getColor();
        this.mRenderPaint.setStyle(Paint.Style.FILL);
        this.mRenderPaint.setColor(i12);
        canvas.drawPath(path, this.mRenderPaint);
        this.mRenderPaint.setColor(color);
        this.mRenderPaint.setStyle(style);
    }

    protected void drawFilledPath(Canvas canvas, Path path, Drawable drawable) {
        if (!clipPathSupported()) {
            throw new RuntimeException("Fill-drawables not (yet) supported below API level 18, this code was run on API level " + Utils.getSDKInt() + ".");
        }
        int iSave = canvas.save();
        canvas.clipPath(path);
        drawable.setBounds((int) this.mViewPortHandler.contentLeft(), (int) this.mViewPortHandler.contentTop(), (int) this.mViewPortHandler.contentRight(), (int) this.mViewPortHandler.contentBottom());
        drawable.draw(canvas);
        canvas.restoreToCount(iSave);
    }
}
