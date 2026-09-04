package com.tencent.beacon.event.open;

import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.c.j;
import com.tencent.beacon.base.util.c;

/* JADX INFO: compiled from: BeaconReport.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ BeaconConfig f99203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BeaconReport f99204b;

    b(BeaconReport beaconReport, BeaconConfig beaconConfig) {
        this.f99204b = beaconReport;
        this.f99203a = beaconConfig;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            j.a();
            j.h();
            this.f99204b.a(this.f99203a);
            this.f99204b.a();
            c.a("BeaconReport", "App: %s start success!", com.tencent.beacon.a.c.c.d().f());
        } catch (Throwable th2) {
            g.e().a("201", "sdk init error! package name: " + com.tencent.beacon.a.c.b.b() + " , msg:" + th2.getMessage(), th2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BeaconReport init error: ");
            sb2.append(th2.getMessage());
            c.b(sb2.toString(), new Object[0]);
            c.a(th2);
        }
    }
}
