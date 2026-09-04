package com.efs.sdk.memoryinfo;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final EfsReporter f42639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42640b = false;
    final Context mContext;

    public b(Context context, EfsReporter efsReporter) {
        this.mContext = context.getApplicationContext();
        this.f42639a = efsReporter;
    }

    static /* synthetic */ void a(b bVar, e eVar, String str) {
        c cVar = new c(bVar.mContext);
        EfsJSONLog efsJSONLog = new EfsJSONLog("memperf");
        efsJSONLog.put("w_pgid", str);
        efsJSONLog.put("crver", "0.0.3.umeng");
        efsJSONLog.put("k_st", cVar.f42655bg);
        efsJSONLog.put("w_url", cVar.activity);
        efsJSONLog.put("wl_tpss", Long.valueOf(cVar.f42656n));
        efsJSONLog.put("wl_jpss", Long.valueOf(cVar.f42657o));
        efsJSONLog.put("wl_npss", Long.valueOf(cVar.f42658p));
        efsJSONLog.put("wl_heap", Long.valueOf(cVar.f42659q));
        efsJSONLog.put("wf_heap_used_rate", Float.valueOf(cVar.f42660r));
        efsJSONLog.put("wl_graphics", Long.valueOf(cVar.f42661s));
        efsJSONLog.put("wl_vmsize", Long.valueOf(cVar.f42662t));
        synchronized (e.class) {
            if (eVar.C) {
                eVar.a(efsJSONLog);
            } else {
                eVar.B.add(efsJSONLog);
            }
        }
    }
}
