package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class bz extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106900a;

    public bz(Context context) {
        this.f106900a = context;
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f106900a).m72a().isPerfUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.clientreport.manager.a.a(this.f106900a).c();
                com.xiaomi.channel.commonutils.logger.b.c(this.f106900a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.d("fail to send perf data. " + e10);
        }
    }
}
