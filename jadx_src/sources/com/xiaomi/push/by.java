package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class by extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106899a;

    public by(Context context) {
        this.f106899a = context;
    }

    private boolean a() {
        return com.xiaomi.clientreport.manager.a.a(this.f106899a).m72a().isEventUploadSwitchOpen();
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public String mo195a() {
        return "100886";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                com.xiaomi.channel.commonutils.logger.b.c(this.f106899a.getPackageName() + " begin upload event");
                com.xiaomi.clientreport.manager.a.a(this.f106899a).m74b();
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
    }
}
