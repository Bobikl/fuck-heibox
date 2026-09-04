package com.umeng.commonsdk.debug;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class D implements UInterface {
    @Override // com.umeng.commonsdk.debug.UInterface
    public void log(String str, String str2) {
        Log.d(str, str2);
    }
}
