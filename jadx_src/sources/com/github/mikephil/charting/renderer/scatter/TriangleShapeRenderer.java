package com.github.mikephil.charting.renderer.scatter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

/* JADX INFO: loaded from: classes6.dex */
public class TriangleShapeRenderer implements IShapeRenderer {
    protected Path mTrianglePathBuffer = new Path();

    @Override // com.github.mikephil.charting.renderer.scatter.IShapeRenderer
    public void renderShape(Canvas canvas, IScatterDataSet iScatterDataSet, ViewPortHandler viewPortHandler, float f10, float f11, Paint paint) {
        float scatterShapeSize = iScatterDataSet.getScatterShapeSize();
        float f12 = scatterShapeSize / 2.0f;
        float fConvertDpToPixel = (scatterShapeSize - (Utils.convertDpToPixel(iScatterDataSet.getScatterShapeHoleRadius()) * 2.0f)) / 2.0f;
        int scatterShapeHoleColor = iScatterDataSet.getScatterShapeHoleColor();
        paint.setStyle(Paint.Style.FILL);
        Path path = this.mTrianglePathBuffer;
        path.reset();
        float f13 = f11 - f12;
        path.moveTo(f10, f13);
        float f14 = f10 + f12;
        float f15 = f11 + f12;
        path.lineTo(f14, f15);
        float f16 = f10 - f12;
        path.lineTo(f16, f15);
        double d10 = scatterShapeSize;
        if (d10 > 0.0d) {
            path.lineTo(f10, f13);
            float f17 = f16 + fConvertDpToPixel;
            float f18 = f15 - fConvertDpToPixel;
            path.moveTo(f17, f18);
            path.lineTo(f14 - fConvertDpToPixel, f18);
            path.lineTo(f10, f13 + fConvertDpToPixel);
            path.lineTo(f17, f18);
        }
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
        if (d10 <= 0.0d || scatterShapeHoleColor == 1122867) {
            return;
        }
        paint.setColor(scatterShapeHoleColor);
        path.moveTo(f10, f13 + fConvertDpToPixel);
        float f19 = f15 - fConvertDpToPixel;
        path.lineTo(f14 - fConvertDpToPixel, f19);
        path.lineTo(f16 + fConvertDpToPixel, f19);
        path.close();
        canvas.drawPath(path, paint);
        path.reset();
    }
}
