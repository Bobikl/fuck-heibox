package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
public class CircleShapeRenderer implements IShapeRenderer {
    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f10, float f11, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f12 = scatterShapeSize / 2.0f;
        float fConvertDpToPixel = Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius());
        float f13 = (scatterShapeSize - (fConvertDpToPixel * 2.0f)) / 2.0f;
        float f14 = f13 / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        if (scatterShapeSize <= 0.0d) {
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f10, f11, f12, paint);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f13);
        canvas.drawCircle(f10, f11, f14 + fConvertDpToPixel, paint);
        if (scatterShapeHoleColor != 1122867) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(scatterShapeHoleColor);
            canvas.drawCircle(f10, f11, fConvertDpToPixel, paint);
        }
    }
}
