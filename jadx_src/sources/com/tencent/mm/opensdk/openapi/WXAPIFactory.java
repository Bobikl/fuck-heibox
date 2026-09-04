package com.tencent.mm.opensdk.openapi;

import android.content.Context;
import com.tencent.mm.opensdk.utils.Log;

/* JADX INFO: loaded from: classes4.dex */
public class WXAPIFactory {
    private static final String TAG = "MicroMsg.PaySdk.WXFactory";

    private WXAPIFactory() {
        throw new RuntimeException(WXAPIFactory.class.getSimpleName() + " should not be instantiated");
    }

    public static IWXAPI createWXAPI(Context context, String str) {
        return createWXAPI(context, str, true);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z10) {
        Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z10);
        return createWXAPI(context, str, z10, 2);
    }

    public static IWXAPI createWXAPI(Context context, String str, boolean z10, int i10) {
        Log.d(TAG, "createWXAPI, appId = " + str + ", checkSignature = " + z10 + ", launchMode = " + i10);
        return new WXApiImplV10(context, str, z10, i10);
    }
}
