package com.davemorrissey.labs.subscaleview.decoder;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes6.dex */
public interface ImageDecoder {
    @n0
    Bitmap decode(Context context, @n0 Uri uri) throws Exception;
}
