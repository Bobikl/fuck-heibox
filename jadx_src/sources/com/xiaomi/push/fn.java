package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class fn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f107134a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Map<String, ix> f425a;

    public interface a {
        void uploader(Context context, ir irVar);
    }

    public static int a(int i10) {
        if (i10 > 0) {
            return i10 + 1000;
        }
        return -1;
    }

    public static int a(Enum r10) {
        if (r10 != null) {
            if (r10 instanceof in) {
                return r10.ordinal() + 1001;
            }
            if (r10 instanceof ix) {
                return r10.ordinal() + 2001;
            }
            if (r10 instanceof fy) {
                return r10.ordinal() + 3001;
            }
        }
        return -1;
    }

    public static Config a(Context context) {
        boolean zA = com.xiaomi.push.service.az.a(context).a(is.PerfUploadSwitch.a(), false);
        boolean zA2 = com.xiaomi.push.service.az.a(context).a(is.EventUploadNewSwitch.a(), false);
        return Config.getBuilder().setEventUploadSwitchOpen(zA2).setEventUploadFrequency(com.xiaomi.push.service.az.a(context).a(is.EventUploadFrequency.a(), 86400)).setPerfUploadSwitchOpen(zA).setPerfUploadFrequency(com.xiaomi.push.service.az.a(context).a(is.PerfUploadFrequency.a(), 86400)).build(context);
    }

    public static EventClientReport a(Context context, String str, String str2, int i10, long j10, String str3) {
        EventClientReport eventClientReportA = a(str);
        eventClientReportA.eventId = str2;
        eventClientReportA.eventType = i10;
        eventClientReportA.eventTime = j10;
        eventClientReportA.eventContent = str3;
        return eventClientReportA;
    }

    public static EventClientReport a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    public static PerfClientReport a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    public static PerfClientReport a(Context context, int i10, long j10, long j11) {
        PerfClientReport perfClientReportA = a();
        perfClientReportA.code = i10;
        perfClientReportA.perfCounts = j10;
        perfClientReportA.perfLatencies = j11;
        return perfClientReportA;
    }

    public static ir a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ir irVar = new ir();
        irVar.d("category_client_report_data");
        irVar.a("push_sdk_channel");
        irVar.a(1L);
        irVar.b(str);
        irVar.a(true);
        irVar.b(System.currentTimeMillis());
        irVar.g(context.getPackageName());
        irVar.e("com.xiaomi.xmsf");
        irVar.f(com.xiaomi.push.service.ca.a());
        irVar.c("quality_support");
        return irVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static ix m374a(String str) {
        if (f425a == null) {
            synchronized (ix.class) {
                if (f425a == null) {
                    f425a = new HashMap();
                    for (ix ixVar : ix.values()) {
                        f425a.put(ixVar.f623a.toLowerCase(), ixVar);
                    }
                }
            }
        }
        ix ixVar2 = f425a.get(str.toLowerCase());
        return ixVar2 != null ? ixVar2 : ix.Invalid;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m375a(int i10) {
        if (i10 == 1000) {
            return "E100000";
        }
        if (i10 == 3000) {
            return "E100002";
        }
        if (i10 == 2000) {
            return "E100001";
        }
        return i10 == 6000 ? "E100003" : "";
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m376a(Context context) {
        ClientReportClient.updateConfig(context, a(context));
    }

    public static void a(Context context, Config config) {
        ClientReportClient.init(context, config, new fl(context), new fm(context));
    }

    private static void a(Context context, ir irVar) {
        if (m377a(context.getApplicationContext())) {
            com.xiaomi.push.service.cb.a(context.getApplicationContext(), irVar);
            return;
        }
        a aVar = f107134a;
        if (aVar != null) {
            aVar.uploader(context, irVar);
        }
    }

    public static void a(Context context, List<String> list) {
        if (list == null) {
            return;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                ir irVarA = a(context, it.next());
                if (!com.xiaomi.push.service.ca.a(irVarA, false)) {
                    a(context, irVarA);
                }
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.d(th2.getMessage());
        }
    }

    public static void a(a aVar) {
        f107134a = aVar;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m377a(Context context) {
        return (context == null || TextUtils.isEmpty(context.getPackageName()) || !"com.xiaomi.xmsf".equals(context.getPackageName())) ? false : true;
    }
}
