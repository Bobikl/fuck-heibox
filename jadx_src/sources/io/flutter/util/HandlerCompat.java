package io.flutter.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class HandlerCompat {
    public static Handler createAsyncHandler(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(looper) : new Handler(looper);
    }
}
