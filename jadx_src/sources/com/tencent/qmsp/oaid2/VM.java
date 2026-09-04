package com.tencent.qmsp.oaid2;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class VM {
    public static int getVendorInfo(Context context, IVendorCallback iVendorCallback) {
        return new VendorManager().getVendorInfo(context, iVendorCallback);
    }
}
