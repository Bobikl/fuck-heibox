package com.starlightc.ucropplus.callback;

import android.net.Uri;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public interface BitmapCropCallback {
    void onBitmapCropped(@n0 Uri uri, int i10, int i11, int i12, int i13);

    void onCropFailure(@n0 Throwable th2);
}
