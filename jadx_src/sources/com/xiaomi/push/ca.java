package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;

/* JADX INFO: loaded from: classes4.dex */
public class ca implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f106903a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.clientreport.processor.c f229a;

    public void a(Context context) {
        this.f106903a = context;
    }

    public void a(com.xiaomi.clientreport.processor.c cVar) {
        this.f229a = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.xiaomi.clientreport.processor.c cVar = this.f229a;
            if (cVar != null) {
                cVar.a();
            }
            com.xiaomi.channel.commonutils.logger.b.c("begin read and send perf / event");
            com.xiaomi.clientreport.processor.c cVar2 = this.f229a;
            if (cVar2 instanceof IEventProcessor) {
                ce.a(this.f106903a).m220a("sp_client_report_status", "event_last_upload_time", System.currentTimeMillis());
            } else if (cVar2 instanceof IPerfProcessor) {
                ce.a(this.f106903a).m220a("sp_client_report_status", "perf_last_upload_time", System.currentTimeMillis());
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
        }
    }
}
