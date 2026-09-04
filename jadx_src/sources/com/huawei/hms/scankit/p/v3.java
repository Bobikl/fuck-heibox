package com.huawei.hms.scankit.p;

import android.os.Bundle;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.TimeZone;
import java.util.UUID;

/* JADX INFO: compiled from: HaLog60000.java */
/* JADX INFO: loaded from: classes7.dex */
public final class v3 extends u3 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f62436o = "AiDetect";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static String f62437p = "defaultDetect";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f62438h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f62439i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected String f62440j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected long f62441k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long f62442l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected long f62443m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f62444n;

    /* JADX INFO: compiled from: HaLog60000.java */
    public class a extends SimpleDateFormat {
        a(String str) {
            super(str);
            setTimeZone(TimeZone.getTimeZone("UTC"));
        }
    }

    /* JADX INFO: compiled from: HaLog60000.java */
    public class b extends LinkedHashMap<String, String> {
        b() {
            v3.this.g();
            putAll(v3.this.f62406b);
        }
    }

    public v3(Bundle bundle, String str) {
        super(bundle, DynamicModuleInitializer.getContext().getApplicationContext());
        this.f62438h = -1001;
        this.f62439i = u3.f62401d;
        this.f62440j = u3.f62402e;
        this.f62406b.put("callTime", new a("yyyyMMddHHmmss.SSS").format(Long.valueOf(System.currentTimeMillis())));
        this.f62406b.put(HiAnalyticsConstant.HaKey.BI_KEY_TRANSID, UUID.randomUUID().toString());
        this.f62406b.put("apiName", str);
    }

    private void j() {
        this.f62438h = -1001;
        this.f62439i = u3.f62401d;
        this.f62440j = u3.f62402e;
    }

    public void a(long j10) {
        this.f62441k = j10;
    }

    public void a(long j10, long j11, boolean z10) {
        this.f62442l = j10;
        this.f62443m = j11;
        this.f62444n = z10;
    }

    public void a(HmsScan[] hmsScanArr) {
        if (hmsScanArr != null) {
            this.f62438h = hmsScanArr.length;
            for (HmsScan hmsScan : hmsScanArr) {
                this.f62439i = u3.a(hmsScan.scanType);
                this.f62440j = u3.b(hmsScan.scanTypeForm);
            }
        }
    }

    public void c(int i10) {
        this.f62438h = i10;
    }

    public void h() {
        this.f62407c = System.currentTimeMillis();
    }

    public void i() {
        try {
            if (a()) {
                b bVar = new b();
                bVar.put("result", String.valueOf(this.f62438h));
                bVar.put(WiseOpenHianalyticsData.UNION_COSTTIME, String.valueOf(System.currentTimeMillis() - this.f62407c));
                bVar.put("scanType", this.f62439i);
                bVar.put("sceneType", this.f62440j);
                if (this.f62442l != 0 && this.f62443m != 0) {
                    if (this.f62444n) {
                        bVar.put("recognizeMode", f62436o);
                        bVar.put("defaultDetectTime", String.valueOf(this.f62442l - this.f62441k));
                        bVar.put("aiDetectTime", String.valueOf(this.f62443m - this.f62442l));
                    } else {
                        bVar.put("recognizeMode", f62437p);
                        bVar.put("defaultDetectTime", String.valueOf(this.f62442l - this.f62441k));
                    }
                    bVar.put("recognizeSuccessTime", String.valueOf(this.f62443m - this.f62441k));
                }
                a4.b().b("60000", bVar);
                j();
            }
        } catch (NullPointerException unused) {
            o4.b("HaLog60000", "nullPoint");
        } catch (Exception unused2) {
            o4.b("HaLog60000", "logEnd Exception");
        }
    }
}
