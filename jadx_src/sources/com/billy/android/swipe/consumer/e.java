package com.billy.android.swipe.consumer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: compiled from: DoorConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends g {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f40361p3 = 2;

    public e() {
        this.f40372p1 = 2;
        B1(1000);
    }

    @Override // com.billy.android.swipe.consumer.g
    public g p2(int i10) {
        return this;
    }

    @Override // com.billy.android.swipe.consumer.g, com.billy.android.swipe.f
    public void s(Canvas canvas) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap[] bitmapArr = this.f40370b0;
        if (this.f40408c == 0 || bitmapArr == null || bitmapArr.length != 2 || (bitmap = bitmapArr[0]) == null || bitmap.isRecycled() || (bitmap2 = bitmapArr[1]) == null || bitmap2.isRecycled()) {
            return;
        }
        int i10 = this.D;
        int i11 = i10 >> 1;
        int i12 = this.E;
        int i13 = i12 >> 1;
        if (this.f40371c0 != 0 && this.Y != 0) {
            if (this.X) {
                float f10 = i11;
                float f11 = this.f40418m;
                canvas.drawRect((1.0f - f11) * f10, 0.0f, f10 * (f11 + 1.0f), i12, this.W);
            } else {
                float f12 = i13;
                float f13 = this.f40418m;
                canvas.drawRect(0.0f, (1.0f - f13) * f12, i10, f12 * (f13 + 1.0f), this.W);
            }
        }
        canvas.save();
        if (this.X) {
            canvas.translate((-i11) * this.f40418m, 0.0f);
            canvas.drawBitmap(bitmapArr[0], 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.translate(i11 * (this.f40418m + 1.0f), 0.0f);
            canvas.drawBitmap(bitmapArr[1], 0.0f, 0.0f, (Paint) null);
        } else {
            canvas.translate(0.0f, (-i13) * this.f40418m);
            canvas.drawBitmap(bitmapArr[0], 0.0f, 0.0f, (Paint) null);
            canvas.restore();
            canvas.save();
            canvas.translate(0.0f, i13 * (this.f40418m + 1.0f));
            canvas.drawBitmap(bitmapArr[1], 0.0f, 0.0f, (Paint) null);
        }
        canvas.restore();
    }
}
