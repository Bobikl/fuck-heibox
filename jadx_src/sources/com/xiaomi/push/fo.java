package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;

/* JADX INFO: loaded from: classes4.dex */
public class fo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile fo f107135a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f426a;

    private fo(Context context) {
        this.f426a = context;
    }

    public static fo a(Context context) {
        if (f107135a == null) {
            synchronized (fo.class) {
                if (f107135a == null) {
                    f107135a = new fo(context);
                }
            }
        }
        return f107135a;
    }

    private void a(com.xiaomi.clientreport.data.a aVar) {
        if (aVar instanceof PerfClientReport) {
            ClientReportClient.reportPerf(this.f426a, (PerfClientReport) aVar);
        } else if (aVar instanceof EventClientReport) {
            ClientReportClient.reportEvent(this.f426a, (EventClientReport) aVar);
        }
    }

    public void a(String str, int i10, long j10, long j11) {
        if (i10 < 0 || j11 < 0 || j10 <= 0) {
            return;
        }
        PerfClientReport perfClientReportA = fn.a(this.f426a, i10, j10, j11);
        perfClientReportA.setAppPackageName(str);
        perfClientReportA.setSdkVersion(BuildConfig.VERSION_NAME);
        a(perfClientReportA);
    }

    public void a(String str, Intent intent, int i10, String str2) {
        if (intent == null) {
            return;
        }
        a(str, fn.m375a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), i10, System.currentTimeMillis(), str2);
    }

    public void a(String str, Intent intent, String str2) {
        if (intent == null) {
            return;
        }
        a(str, fn.m375a(intent.getIntExtra("eventMessageType", -1)), intent.getStringExtra("messageId"), 5001, System.currentTimeMillis(), str2);
    }

    public void a(String str, String str2, String str3, int i10, long j10, String str4) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        EventClientReport eventClientReportA = fn.a(this.f426a, str2, str3, i10, j10, str4);
        eventClientReportA.setAppPackageName(str);
        eventClientReportA.setSdkVersion(BuildConfig.VERSION_NAME);
        a(eventClientReportA);
    }

    public void a(String str, String str2, String str3, int i10, String str4) {
        a(str, str2, str3, i10, System.currentTimeMillis(), str4);
    }

    public void a(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5002, System.currentTimeMillis(), str4);
    }

    public void b(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 5001, System.currentTimeMillis(), str4);
    }

    public void c(String str, String str2, String str3, String str4) {
        a(str, str2, str3, 4002, System.currentTimeMillis(), str4);
    }
}
