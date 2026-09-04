package com.taobao.agoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class AgooCommondReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            context.getPackageName();
            String strB = com.taobao.accs.client.a.b();
            intent.setFlags(0);
            intent.setClassName(context, strB);
            com.taobao.accs.a.a.a(context, intent);
        } catch (Throwable unused) {
        }
    }
}
