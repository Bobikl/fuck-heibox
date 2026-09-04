package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f60828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f60829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f60830c;

        a(long j10, ArrayList arrayList, JSONArray jSONArray) {
            this.f60828a = j10;
            this.f60829b = arrayList;
            this.f60830c = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            com.huawei.hms.framework.network.grs.g.j.a aVar = new com.huawei.hms.framework.network.grs.g.j.a();
            aVar.put("total_time", this.f60828a);
            Iterator it = this.f60829b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                d dVar = (d) it.next();
                if (dVar.o() || dVar.m()) {
                    aVar.put(e.b(dVar));
                    it.remove();
                    z10 = true;
                    break;
                }
            }
            if (!z10 && this.f60829b.size() > 0) {
                ArrayList arrayList = this.f60829b;
                d dVar2 = (d) arrayList.get(arrayList.size() - 1);
                aVar.put(e.b(dVar2));
                this.f60829b.remove(dVar2);
            }
            if (this.f60829b.size() > 0) {
                Iterator it2 = this.f60829b.iterator();
                while (it2.hasNext()) {
                    this.f60830c.put(new JSONObject(e.b((d) it2.next())));
                }
            }
            if (this.f60830c.length() > 0) {
                aVar.put("failed_info", this.f60830c.toString());
            }
            Logger.d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(aVar.get()));
            HianalyticsHelper.getInstance().onEvent(aVar.get(), "grs_request");
        }
    }

    public static void a(ArrayList<d> arrayList, long j10, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReport(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j10, arrayList, jSONArray));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<String, String> b(d dVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception excD = dVar.d();
        if (excD != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(excD));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, excD.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(excD.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", dVar.b());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, dVar.c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(dVar.l()).getHost());
        } catch (MalformedURLException e10) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e10);
        }
        linkedHashMapPack.put("req_start_time", dVar.h());
        linkedHashMapPack.put("req_end_time", dVar.g());
        linkedHashMapPack.put("req_total_time", dVar.i());
        return linkedHashMapPack.getAll();
    }
}
