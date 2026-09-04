package com.bun.miitmdid.provider.xiaodu;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class IdentifierManager {
    static {
        try {
            System.loadLibrary("xiaodu-identifier");
        } catch (Throwable unused) {
        }
    }

    public static native String getAAID(Context context);

    @Keep
    private static native String getNaAAID(Context context);

    @Keep
    private static native String getNaOAID(Context context);

    @Keep
    private static native String getNaVAID(Context context);

    public static native String getOAID(Context context);

    public static native String getVAID(Context context);

    public static native boolean isLimited(Context context);

    @Keep
    private static native boolean isNaLimited(Context context);

    @Keep
    private static native boolean isNaSupported(Context context);

    public static native boolean isSupported(Context context);
}
