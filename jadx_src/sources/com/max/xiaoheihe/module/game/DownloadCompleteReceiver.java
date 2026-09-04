package com.max.xiaoheihe.module.game;

import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class DownloadCompleteReceiver extends BroadcastReceiver {
    public static ChangeQuickRedirect changeQuickRedirect;

    private void a(Context context, Uri uri) {
        if (PatchProxy.proxy(new Object[]{context, uri}, this, changeQuickRedirect, false, 32347, new Class[]{Context.class, Uri.class}, Void.TYPE).isSupported) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.setFlags(268435457);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(context.getString(R.string.download_completed));
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 32346, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        long longExtra = intent.getLongExtra("extra_download_id", -1L);
        com.max.hbcommon.utils.d.b("downloaddebug", "onReceive    downId==" + longExtra);
        if (com.max.hbcache.c.u(longExtra)) {
            com.max.hbcommon.utils.d.b("downloaddebug", "onReceive    hasDownloadId");
            a(context, ((DownloadManager) context.getSystemService(ChannelsDetailActivity.f79595e4)).getUriForDownloadedFile(longExtra));
        }
    }
}
