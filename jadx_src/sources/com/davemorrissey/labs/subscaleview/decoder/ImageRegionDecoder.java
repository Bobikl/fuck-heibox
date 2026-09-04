package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes6.dex */
public interface ImageRegionDecoder {
    @n0
    Bitmap decodeRegion(@n0 Rect rect, int i10);

    @n0
    Point init(Context context, @n0 Uri uri) throws Exception;

    boolean isReady();

    void recycle();
}
