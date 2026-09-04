package com.alipay.deviceid.module.x;

import android.content.Context;
import com.alipay.deviceid.module.rpc.deviceFp.BugTrackMessageService;
import com.alipay.deviceid.module.rpc.report.open.OpenReportService;
import com.alipay.deviceid.module.rpc.report.open.model.ReportRequest;
import com.alipay.deviceid.module.rpc.report.open.model.ReportResult;
import org.json.JSONObject;

/* JADX INFO: compiled from: RPCUploaderV2.java */
/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static q f38360a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ReportResult f38361e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private bf f38362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BugTrackMessageService f38363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OpenReportService f38364d;

    private q(Context context, String str) {
        this.f38362b = null;
        this.f38363c = null;
        this.f38364d = null;
        bj bjVar = new bj();
        bjVar.f38313a = str;
        at atVar = new at(context);
        this.f38362b = atVar;
        this.f38363c = (BugTrackMessageService) atVar.a(BugTrackMessageService.class, bjVar);
        this.f38364d = (OpenReportService) this.f38362b.a(OpenReportService.class, bjVar);
    }

    public static q a(Context context, String str) {
        if (context == null || e.a(str)) {
            return null;
        }
        if (f38360a == null) {
            f38360a = new q(context, str);
        }
        return f38360a;
    }

    public final o a(Context context, p pVar) throws InterruptedException {
        ReportResult reportResult;
        final ReportRequest reportRequestA = n.a(context, pVar);
        if (this.f38364d == null) {
            return null;
        }
        f38361e = null;
        new Thread(new Runnable() { // from class: com.alipay.deviceid.module.x.q.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ReportResult unused = q.f38361e = q.this.f38364d.reportData(reportRequestA);
                } catch (Throwable th2) {
                    ReportResult unused2 = q.f38361e = new ReportResult();
                    q.f38361e.success = false;
                    q.f38361e.resultCode = "static data rpc upload error, " + e.a(th2);
                    x.a("Rpc failed.");
                    x.a(e.a(th2));
                }
            }
        }).start();
        int i10 = w4.a.f140984a;
        while (true) {
            reportResult = f38361e;
            if (reportResult != null || i10 < 0) {
                break;
            }
            Thread.sleep(50L);
            i10 -= 50;
        }
        return n.a(reportResult);
    }

    public final boolean a(String str) {
        BugTrackMessageService bugTrackMessageService;
        if (e.a(str) || (bugTrackMessageService = this.f38363c) == null) {
            return false;
        }
        String strLogCollect = null;
        try {
            strLogCollect = bugTrackMessageService.logCollect(e.e(str));
        } catch (Exception unused) {
        }
        if (e.a(strLogCollect)) {
            return false;
        }
        return ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
    }
}
