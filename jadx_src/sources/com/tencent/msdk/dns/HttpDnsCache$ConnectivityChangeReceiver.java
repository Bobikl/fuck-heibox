package com.tencent.msdk.dns;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import f.b;

/* JADX INFO: loaded from: classes4.dex */
public class HttpDnsCache$ConnectivityChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b.b("Network change.", new Object[0]);
    }
}
