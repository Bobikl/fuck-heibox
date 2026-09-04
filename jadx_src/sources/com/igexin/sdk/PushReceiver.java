package com.igexin.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.igexin.push.core.x;

/* JADX INFO: loaded from: classes6.dex */
public class PushReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f64082a = PushReceiver.class.getName();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) || PushConsts.ACTION_BROADCAST_USER_PRESENT.equals(action)) {
                Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) com.igexin.push.core.a.e.a().a(context));
                intent2.putExtra("action", action);
                x.a().a(context, intent2);
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f64082a + "|" + th2.toString(), new Object[0]);
        }
    }
}
