package com.alipay.deviceid.module.x;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: IOUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ba {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                Log.e("IOUtil", "", e10);
            }
        }
    }
}
