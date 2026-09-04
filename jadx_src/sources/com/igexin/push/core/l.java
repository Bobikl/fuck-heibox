package com.igexin.push.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public class l extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f63759a;

    private l() {
    }

    public static l a() {
        if (f63759a == null) {
            f63759a = new l();
        }
        return f63759a;
    }

    private void a(Intent intent) {
        try {
            com.igexin.a.a.c.b.a("----------------------------------------------------------------------------------", new Object[0]);
            com.igexin.a.a.c.b.a("InternalPublicReceiver|action = " + intent.getAction() + ", component = " + intent.getComponent(), new Object[0]);
            Bundle extras = intent.getExtras();
            if (extras == null) {
                com.igexin.a.a.c.b.a("InternalPublicReceiver|no extras", new Object[0]);
                return;
            }
            for (String str : extras.keySet()) {
                com.igexin.a.a.c.b.a("InternalPublicReceiver|key [" + str + "]: " + extras.get(str), new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            a(intent);
        }
        Object[] objArr = new Object[1];
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" InternalPublicReceiver:");
        sb2.append(intent != null ? intent.getAction() : "null");
        objArr[0] = sb2.toString();
        com.igexin.a.a.c.b.a("InternalPublicReceiver", objArr);
        if (c.a() != null) {
            Message message = new Message();
            message.what = CoreConsts.f63457g;
            message.obj = intent;
            c.a().a(message);
        }
    }
}
