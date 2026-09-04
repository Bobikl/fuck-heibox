package com.tencent.beacon.event;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;

/* JADX INFO: compiled from: EventReportCallback.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f99109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f99110b;

    e(f fVar, long j10) {
        this.f99110b = fVar;
        this.f99109a = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f99110b.f99111a.iterator();
        while (it.hasNext()) {
            sb2.append((Long) it.next());
            sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        com.tencent.beacon.base.util.c.a(this.f99110b.f99112b, 4, "delete: %s", Boolean.valueOf(this.f99110b.f99117g.a(this.f99110b.f99116f, sb2.substring(0, sb2.lastIndexOf(Constants.ACCEPT_TIME_SEPARATOR_SP)))));
        this.f99110b.f99115e.a(this.f99110b.f99111a);
        this.f99110b.f99115e.a(this.f99109a);
    }
}
