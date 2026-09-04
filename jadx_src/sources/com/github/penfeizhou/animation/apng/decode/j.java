package com.github.penfeizhou.animation.apng.decode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.IOException;

/* JADX INFO: compiled from: StillFrame.java */
/* JADX INFO: loaded from: classes6.dex */
public class j extends com.github.penfeizhou.animation.decode.a<com.github.penfeizhou.animation.apng.io.a, com.github.penfeizhou.animation.apng.io.b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final /* synthetic */ boolean f43232g = false;

    public j(com.github.penfeizhou.animation.apng.io.a aVar) {
        super(aVar);
    }

    @Override // com.github.penfeizhou.animation.decode.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap a(Canvas canvas, Paint paint, int i10, Bitmap bitmap, com.github.penfeizhou.animation.apng.io.b bVar) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = i10;
        options.inMutable = true;
        options.inBitmap = bitmap;
        Bitmap bitmap2 = null;
        try {
            ((com.github.penfeizhou.animation.apng.io.a) this.f43274a).reset();
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(((com.github.penfeizhou.animation.apng.io.a) this.f43274a).a(), null, options);
            try {
                paint.setXfermode(null);
                canvas.drawBitmap(bitmapDecodeStream, 0.0f, 0.0f, paint);
                return bitmapDecodeStream;
            } catch (IOException e10) {
                e = e10;
                bitmap2 = bitmapDecodeStream;
                e.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }
}
