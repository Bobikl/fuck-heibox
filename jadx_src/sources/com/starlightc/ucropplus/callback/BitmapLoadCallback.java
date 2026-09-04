package com.starlightc.ucropplus.callback;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.starlightc.ucropplus.model.ExifInfo;

/* JADX INFO: loaded from: classes4.dex */
public interface BitmapLoadCallback {
    void onBitmapLoaded(@n0 Bitmap bitmap, @n0 ExifInfo exifInfo, @n0 Uri uri, @p0 Uri uri2);

    void onFailure(@n0 Exception exc);
}
