package com.github.mikephil.charting.data.filter;

import android.annotation.TargetApi;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class Approximator {

    public class Line {
        private float dx;
        private float dy;
        private float exsy;
        private float length;
        private float[] points;
        private float sxey;

        public Line(float f10, float f11, float f12, float f13) {
            float f14 = f10 - f12;
            this.dx = f14;
            float f15 = f11 - f13;
            this.dy = f15;
            this.sxey = f10 * f13;
            this.exsy = f12 * f11;
            this.length = (float) Math.sqrt((f14 * f14) + (f15 * f15));
            this.points = new float[]{f10, f11, f12, f13};
        }

        public float distance(float f10, float f11) {
            return Math.abs((((this.dy * f10) - (this.dx * f11)) + this.sxey) - this.exsy) / this.length;
        }

        public float[] getPoints() {
            return this.points;
        }
    }

    float[] concat(float[]... fArr) {
        int length = 0;
        for (float[] fArr2 : fArr) {
            length += fArr2.length;
        }
        float[] fArr3 = new float[length];
        int i10 = 0;
        for (float[] fArr4 : fArr) {
            for (float f10 : fArr4) {
                fArr3[i10] = f10;
                i10++;
            }
        }
        return fArr3;
    }

    @TargetApi(9)
    public float[] reduceWithDouglasPeucker(float[] fArr, float f10) {
        Line line = new Line(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1]);
        float f11 = 0.0f;
        int i10 = 0;
        for (int i11 = 2; i11 < fArr.length - 2; i11 += 2) {
            float fDistance = line.distance(fArr[i11], fArr[i11 + 1]);
            if (fDistance > f11) {
                i10 = i11;
                f11 = fDistance;
            }
        }
        if (f11 <= f10) {
            return line.getPoints();
        }
        float[] fArrReduceWithDouglasPeucker = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, 0, i10 + 2), f10);
        float[] fArrReduceWithDouglasPeucker2 = reduceWithDouglasPeucker(Arrays.copyOfRange(fArr, i10, fArr.length), f10);
        return concat(fArrReduceWithDouglasPeucker, Arrays.copyOfRange(fArrReduceWithDouglasPeucker2, 2, fArrReduceWithDouglasPeucker2.length));
    }
}
