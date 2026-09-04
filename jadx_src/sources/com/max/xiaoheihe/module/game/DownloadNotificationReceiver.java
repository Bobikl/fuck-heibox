package com.max.xiaoheihe.module.game;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadNotificationReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 32348, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) AppMgrActivity.class);
        intent2.setFlags(268435456);
        context.startActivity(intent2);
    }
}
