package com.taobao.accs;

import android.app.Notification;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ChannelService.KernelService f98155a;

    a(ChannelService.KernelService kernelService) {
        this.f98155a = kernelService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ChannelService channelService = ChannelService.getInstance();
            int i10 = this.f98155a.f98154b.getPackageManager().getPackageInfo(this.f98155a.getPackageName(), 0).applicationInfo.icon;
            if (i10 != 0) {
                Notification.Builder builder = new Notification.Builder(this.f98155a.f98154b);
                builder.setSmallIcon(i10);
                builder.setContentText("正在运行…");
                channelService.startForeground(bb.c.k.qs, builder.build());
                Notification.Builder builder2 = new Notification.Builder(this.f98155a.f98154b);
                builder2.setSmallIcon(i10);
                builder2.setContentText("正在运行…");
                ChannelService.KernelService.f98153a.startForeground(bb.c.k.qs, builder2.build());
                ChannelService.KernelService.f98153a.stopForeground(true);
            }
            ChannelService.KernelService.f98153a.stopSelf();
        } catch (Throwable th2) {
            ALog.e("ChannelService", " onStartCommand run", th2, new Object[0]);
        }
    }
}
