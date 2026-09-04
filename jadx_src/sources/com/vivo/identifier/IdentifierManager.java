package com.vivo.identifier;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class IdentifierManager {
    public static native String getAAID(Context context);

    public static native String getAAID(Context context, String str);

    public static native String getOAID(Context context);

    public static native String getOAIDStatus(Context context);

    public static native String getVAID(Context context);

    public static native String getVAID(Context context, String str);

    public static native String isLimited(Context context);

    public static native boolean isSupported(Context context);

    public static native boolean requestOaidStatePermission(Activity activity, int i10);

    public static native boolean setDebuggable(boolean z10);
}
