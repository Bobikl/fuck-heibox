package com.bun.miitmdid.core;

import android.content.Context;
import com.bun.miitmdid.e;
import com.bun.miitmdid.interfaces.IIdentifierListener;
import com.bun.miitmdid.interfaces.IPermissionCallbackListener;

/* JADX INFO: loaded from: classes6.dex */
public class MdidSdkHelper {
    public static final int SDK_VERSION_CODE = e.b();
    public static final String SDK_VERSION = e.a();
    private static long globalTimeout = 5000;

    public static boolean InitCert(Context context, String str) {
        try {
            return e.a(context, str);
        } catch (AbstractMethodError | Error | Exception unused) {
            return false;
        }
    }

    public static int InitSdk(Context context, boolean z10, IIdentifierListener iIdentifierListener) {
        try {
            return new e(z10, globalTimeout).a(context, iIdentifierListener);
        } catch (UnsatisfiedLinkError | Error | Exception unused) {
            return 1008615;
        }
    }

    public static int InitSdk(Context context, boolean z10, boolean z11, boolean z12, boolean z13, IIdentifierListener iIdentifierListener) {
        try {
            return new e(z10, globalTimeout, z11, z12, z13).a(context, iIdentifierListener);
        } catch (UnsatisfiedLinkError | Error | Exception unused) {
            return 1008615;
        }
    }

    public static void requestOAIDPermission(Context context, IPermissionCallbackListener iPermissionCallbackListener) {
        e.a(context, iPermissionCallbackListener);
    }

    public static boolean setGlobalTimeout(long j10) {
        if (j10 <= 0) {
            return false;
        }
        globalTimeout = j10;
        return true;
    }
}
