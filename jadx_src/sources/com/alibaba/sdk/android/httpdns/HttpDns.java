package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.alibaba.sdk.android.utils.AMSConfigUtils;
import com.alibaba.sdk.android.utils.AMSDevReporter;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class HttpDns implements HttpDnsService {
    private boolean isExpiredIPEnabled = false;
    private static d hostManager = d.a();
    private static DegradationFilter degradationFilter = null;
    static HttpDns instance = null;
    private static boolean inited = false;
    private static String sAccountId = null;
    private static String sSecretKey = null;
    private static Context sContext = null;

    private HttpDns(Context context, String str) {
        f.c(str);
        com.alibaba.sdk.android.httpdns.a.a.a().c(context, str);
        com.alibaba.sdk.android.httpdns.a.a.a().a(com.alibaba.sdk.android.httpdns.d.b.a(context));
    }

    private static void disableReport() {
        com.alibaba.sdk.android.httpdns.d.b.a().k();
    }

    private static String getAccountId() {
        if (!TextUtils.isEmpty(sAccountId)) {
            return sAccountId;
        }
        String accountId = AMSConfigUtils.getAccountId(sContext);
        sAccountId = accountId;
        return accountId;
    }

    private String getIpByHost(String str) {
        if (!b.a()) {
            i.f("HttpDns service turned off");
            return null;
        }
        String[] ipsByHost = getIpsByHost(str);
        if (ipsByHost != null && ipsByHost.length > 0) {
            return ipsByHost[0];
        }
        return null;
    }

    private String[] getIpsByHost(String str) {
        if (!b.a()) {
            i.f("HttpDns service turned off");
        } else {
            if (!l.b(str)) {
                return f.f33c;
            }
            if (l.c(str)) {
                return new String[]{str};
            }
            DegradationFilter degradationFilter2 = degradationFilter;
            if (degradationFilter2 != null && degradationFilter2.shouldDegradeHttpDNS(str)) {
                return f.f33c;
            }
            if (u.e()) {
                return getIpsByHostAsync(str);
            }
            e eVarM15a = hostManager.m15a(str);
            if (eVarM15a != null && eVarM15a.m25b() && this.isExpiredIPEnabled) {
                if (!hostManager.m20a(str)) {
                    i.d("refresh host async: " + str);
                    c.a().submit(new q(str, s.QUERY_HOST));
                }
                return eVarM15a.getIps();
            }
            if (eVarM15a != null && !eVarM15a.m25b()) {
                return eVarM15a.getIps();
            }
            i.d("refresh host sync: " + str);
            try {
                return (String[]) c.a().submit(new q(str, s.QUERY_HOST)).get();
            } catch (Exception e10) {
                i.a(e10);
            }
        }
        return f.f33c;
    }

    private static String getSecretKey() {
        if (!TextUtils.isEmpty(sSecretKey)) {
            return sSecretKey;
        }
        String httpdnsSecretKey = AMSConfigUtils.getHttpdnsSecretKey(sContext);
        sSecretKey = httpdnsSecretKey;
        return httpdnsSecretKey;
    }

    public static synchronized HttpDnsService getService(Context context) {
        if (instance == null && context != null) {
            Context applicationContext = context.getApplicationContext();
            sContext = applicationContext;
            b.a(applicationContext);
            com.alibaba.sdk.android.httpdns.d.b.a(sContext).a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.3
                @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                public void crashDefendMessage(int i10, int i11) {
                    boolean unused = HttpDns.inited = true;
                    if (i10 > i11) {
                        b.b(true);
                    } else {
                        i.f("crash limit exceeds, httpdns disabled");
                        b.b(false);
                    }
                }
            });
            if (!inited) {
                i.f("sdk crash defend not returned");
            }
            if (b.a()) {
                initHttpDns(sContext, getAccountId(), getSecretKey());
            } else {
                instance = new HttpDns(sContext, getAccountId());
            }
        }
        return instance;
    }

    public static synchronized HttpDnsService getService(Context context, String str) {
        if (instance == null && context != null) {
            sContext = context.getApplicationContext();
            setAccountId(str);
            b.a(sContext);
            com.alibaba.sdk.android.httpdns.d.b.a(sContext).a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.1
                @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                public void crashDefendMessage(int i10, int i11) {
                    boolean unused = HttpDns.inited = true;
                    if (i10 > i11) {
                        b.b(true);
                    } else {
                        i.f("crash limit exceeds, httpdns disabled");
                        b.b(false);
                    }
                }
            });
            if (!inited) {
                i.f("sdk crash defend not returned");
            }
            if (b.a()) {
                initHttpDns(sContext, getAccountId(), getSecretKey());
            } else {
                instance = new HttpDns(sContext, getAccountId());
            }
        }
        return instance;
    }

    public static synchronized HttpDnsService getService(Context context, String str, String str2) {
        if (instance == null && context != null) {
            sContext = context.getApplicationContext();
            setAccountId(str);
            setSecretKey(str2);
            b.a(sContext);
            com.alibaba.sdk.android.httpdns.d.b.a(sContext).a(new SDKMessageCallback() { // from class: com.alibaba.sdk.android.httpdns.HttpDns.2
                @Override // com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback
                public void crashDefendMessage(int i10, int i11) {
                    boolean unused = HttpDns.inited = true;
                    if (i10 > i11) {
                        b.b(true);
                    } else {
                        i.f("crash limit exceeds, httpdns disabled");
                        b.b(false);
                    }
                }
            });
            if (!inited) {
                i.f("sdk crash defend not returned");
            }
            if (b.a()) {
                initHttpDns(sContext, getAccountId(), getSecretKey());
            } else {
                instance = new HttpDns(sContext, getAccountId());
            }
        }
        return instance;
    }

    private static void initHttpDns(Context context, String str, String str2) {
        if (instance == null) {
            HashMap map = new HashMap();
            map.put(AMSDevReporter.AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString(), "1.3.2.3-no-bssid-ssid");
            AMSDevReporter.asyncReport(context, AMSDevReporter.AMSSdkTypeEnum.AMS_HTTPDNS, map);
            p.setContext(context);
            q.setContext(context);
            com.alibaba.sdk.android.httpdns.b.b.a(context);
            com.alibaba.sdk.android.httpdns.b.b.b(context);
            u.a(context);
            n.a().a(context, str);
            if (!TextUtils.isEmpty(str2)) {
                a.setSecretKey(str2);
            }
            reportActive(context, str);
            instance = new HttpDns(context, str);
        }
    }

    private static void reportActive(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            i.f("report active failed due to missing context or accountid");
        } else {
            com.alibaba.sdk.android.httpdns.d.b.a(context).setAccountId(str);
            com.alibaba.sdk.android.httpdns.d.b.a(context).l();
        }
    }

    private static void reportHttpDnsSuccess(String str, int i10) {
        com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
        if (bVarA != null) {
            bVarA.a(str, i10, com.alibaba.sdk.android.httpdns.d.c.a(), com.alibaba.sdk.android.httpdns.b.b.m10a() ? 1 : 0);
        }
    }

    private static void reportUserGetIP(String str, int i10) {
        com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
        if (bVarA != null) {
            bVarA.b(str, i10, com.alibaba.sdk.android.httpdns.d.c.a(), com.alibaba.sdk.android.httpdns.b.b.m10a() ? 1 : 0);
        }
    }

    private static void setAccountId(String str) {
        sAccountId = str;
    }

    private static void setSecretKey(String str) {
        sSecretKey = str;
    }

    static synchronized void switchDnsService(boolean z10) {
        b.a(z10);
        if (!b.a()) {
            i.f("httpdns service disabled");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void clearSdnsGlobalParams() {
        f.clearSdnsGlobalParams();
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public void enableIPv6(boolean z10) {
        com.alibaba.sdk.android.httpdns.net64.a.a().enableIPv6(z10);
        try {
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                bVarA.e(z10 ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.net64.Net64Service
    public String getIPv6ByHostAsync(String str) {
        try {
            if (!b.a()) {
                i.f("HttpDns service turned off");
                return null;
            }
            if (com.alibaba.sdk.android.httpdns.net64.a.a().m29a()) {
                getIpsByHostAsync(str);
                e eVarM15a = hostManager.m15a(str);
                if (eVarM15a != null) {
                    String iPv6ByHostAsync = com.alibaba.sdk.android.httpdns.net64.a.a().getIPv6ByHostAsync(str);
                    if (this.isExpiredIPEnabled) {
                        i.d("ipv6 is expired enable, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                        return iPv6ByHostAsync;
                    }
                    if (!eVarM15a.m25b()) {
                        i.d("ipv6 is not expired, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                        return iPv6ByHostAsync;
                    }
                    if (!eVarM15a.c()) {
                        i.d("ipv6 is expired.");
                        return null;
                    }
                    i.d("ipv6 is from cache, hostName: " + str + " ipv6: " + iPv6ByHostAsync);
                    return iPv6ByHostAsync;
                }
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getIpByHostAsync(String str) {
        try {
            if (!b.a()) {
                i.f("HttpDns service turned off");
                return null;
            }
            String[] ipsByHostAsync = getIpsByHostAsync(str);
            if (ipsByHostAsync != null && ipsByHostAsync.length > 0) {
                return ipsByHostAsync[0];
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006a A[PHI: r4
  0x006a: PHI (r4v3 boolean) = (r4v1 boolean), (r4v5 boolean) binds: [B:29:0x0068, B:37:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[PHI: r4
  0x0093: PHI (r4v5 boolean) = (r4v1 boolean), (r4v6 boolean) binds: [B:27:0x0062, B:23:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0113  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x013f  */
    /* JADX WARN: Code duplicated, block: B:62:0x016f  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00a6, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0113, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x013f, please report this as an issue */
    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public HTTPDNSResult getIpsByHostAsync(String str, Map<String, String> map, String str2) {
        boolean zM25b;
        q qVar;
        Map<String, String> map2 = f.extra;
        map2.putAll(map);
        if (!b.a()) {
            i.f("HttpDns service turned off");
            return new HTTPDNSResult(str, f.f33c, map2);
        }
        if (!l.b(str)) {
            return new HTTPDNSResult(str, f.f33c, map2);
        }
        if (l.c(str)) {
            return new HTTPDNSResult(str, new String[]{str}, map2);
        }
        DegradationFilter degradationFilter2 = degradationFilter;
        if (degradationFilter2 != null && degradationFilter2.shouldDegradeHttpDNS(str)) {
            return new HTTPDNSResult(str, f.f33c, map2);
        }
        e eVarM15a = hostManager.m15a(str);
        if (eVarM15a != null) {
            zM25b = eVarM15a.m25b();
            if (!zM25b) {
                if (eVarM15a != null && !str2.equals(eVarM15a.getCacheKey())) {
                    if (u.e()) {
                        t.a().g(str);
                    } else {
                        i.d("refresh host async: " + str);
                        qVar = new q(str, s.QUERY_HOST, map2, str2);
                        c.a().submit(qVar);
                    }
                }
            }
            if (eVarM15a == null) {
                reportUserGetIP(str, 0);
                return new HTTPDNSResult(str, f.f33c, map2);
            }
            if (u.e()) {
                i.d("[HttpDns] disabled return Nil.");
                reportUserGetIP(str, 0);
                return new HTTPDNSResult(str, f.f33c, map2);
            }
            if (!str2.equals(eVarM15a.getCacheKey())) {
                return new HTTPDNSResult(str, f.f33c, map2);
            }
            if (this.isExpiredIPEnabled) {
                reportHttpDnsSuccess(str, 1);
                reportUserGetIP(str, 1);
                return new HTTPDNSResult(str, eVarM15a.getIps(), eVarM15a.m24a());
            }
            if (eVarM15a.c()) {
                i.d("[HttpDns] ips from cache:" + Arrays.toString(eVarM15a.getIps()));
                return new HTTPDNSResult(str, eVarM15a.getIps(), eVarM15a.m24a());
            }
            if (!zM25b) {
                i.f("[HttpDns] return Nil.");
                reportUserGetIP(str, 0);
                return new HTTPDNSResult(str, f.f33c, map2);
            }
            i.d("[HttpDns] not expired return " + Arrays.toString(eVarM15a.getIps()));
            reportHttpDnsSuccess(str, 1);
            reportUserGetIP(str, 1);
            return new HTTPDNSResult(str, eVarM15a.getIps(), eVarM15a.m24a());
        }
        zM25b = false;
        if (hostManager.m20a(str)) {
            if (eVarM15a != null) {
                if (u.e()) {
                    t.a().g(str);
                } else {
                    i.d("refresh host async: " + str);
                    qVar = new q(str, s.QUERY_HOST, map2, str2);
                    c.a().submit(qVar);
                }
            }
        } else if (u.e()) {
            t.a().g(str);
        } else {
            i.d("refresh host async: " + str);
            qVar = new q(str, s.QUERY_HOST, map2, str2);
            c.a().submit(qVar);
        }
        if (eVarM15a == null) {
            reportUserGetIP(str, 0);
            return new HTTPDNSResult(str, f.f33c, map2);
        }
        if (u.e()) {
            i.d("[HttpDns] disabled return Nil.");
            reportUserGetIP(str, 0);
            return new HTTPDNSResult(str, f.f33c, map2);
        }
        if (!str2.equals(eVarM15a.getCacheKey())) {
            return new HTTPDNSResult(str, f.f33c, map2);
        }
        if (this.isExpiredIPEnabled) {
            reportHttpDnsSuccess(str, 1);
            reportUserGetIP(str, 1);
            return new HTTPDNSResult(str, eVarM15a.getIps(), eVarM15a.m24a());
        }
        if (eVarM15a.c()) {
            i.d("[HttpDns] ips from cache:" + Arrays.toString(eVarM15a.getIps()));
            return new HTTPDNSResult(str, eVarM15a.getIps(), eVarM15a.m24a());
        }
        if (!zM25b) {
            i.f("[HttpDns] return Nil.");
            reportUserGetIP(str, 0);
            return new HTTPDNSResult(str, f.f33c, map2);
        }
        i.d("[HttpDns] not expired return " + Arrays.toString(eVarM15a.getIps()));
        reportHttpDnsSuccess(str, 1);
        reportUserGetIP(str, 1);
        return new HTTPDNSResult(str, eVarM15a.getIps(), eVarM15a.m24a());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051 A[PHI: r4
  0x0051: PHI (r4v3 boolean) = (r4v1 boolean), (r4v5 boolean) binds: [B:29:0x004f, B:37:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[PHI: r4
  0x007a: PHI (r4v5 boolean) = (r4v1 boolean), (r4v6 boolean) binds: [B:27:0x0049, B:23:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0089, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x00da, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x00fd, please report this as an issue */
    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String[] getIpsByHostAsync(String str) {
        boolean zM25b;
        q qVar;
        if (!b.a()) {
            i.f("HttpDns service turned off");
            return f.f33c;
        }
        if (!l.b(str)) {
            return f.f33c;
        }
        if (l.c(str)) {
            return new String[]{str};
        }
        DegradationFilter degradationFilter2 = degradationFilter;
        if (degradationFilter2 != null && degradationFilter2.shouldDegradeHttpDNS(str)) {
            return f.f33c;
        }
        e eVarM15a = hostManager.m15a(str);
        if (eVarM15a != null) {
            zM25b = eVarM15a.m25b();
            if (!zM25b) {
                if (eVarM15a != null && eVarM15a.getCacheKey() != null) {
                    if (u.e()) {
                        t.a().g(str);
                    } else {
                        i.d("refresh host async: " + str);
                        qVar = new q(str, s.QUERY_HOST);
                        c.a().submit(qVar);
                    }
                }
            }
            if (eVarM15a == null) {
                reportUserGetIP(str, 0);
                return f.f33c;
            }
            if (u.e()) {
                i.d("[HttpDns] disabled return Nil.");
                reportUserGetIP(str, 0);
                return f.f33c;
            }
            if (eVarM15a.getCacheKey() != null) {
                return f.f33c;
            }
            if (this.isExpiredIPEnabled) {
                reportHttpDnsSuccess(str, 1);
                reportUserGetIP(str, 1);
                return eVarM15a.getIps();
            }
            if (eVarM15a.c()) {
                i.d("[HttpDns] ips from cache:" + Arrays.toString(eVarM15a.getIps()));
                return eVarM15a.getIps();
            }
            if (!zM25b) {
                i.f("[HttpDns] return Nil.");
                reportUserGetIP(str, 0);
                return f.f33c;
            }
            i.d("[HttpDns] not expired return " + Arrays.toString(eVarM15a.getIps()));
            reportHttpDnsSuccess(str, 1);
            reportUserGetIP(str, 1);
            return eVarM15a.getIps();
        }
        zM25b = false;
        if (hostManager.m20a(str)) {
            if (eVarM15a != null) {
                if (u.e()) {
                    t.a().g(str);
                } else {
                    i.d("refresh host async: " + str);
                    qVar = new q(str, s.QUERY_HOST);
                    c.a().submit(qVar);
                }
            }
        } else if (u.e()) {
            t.a().g(str);
        } else {
            i.d("refresh host async: " + str);
            qVar = new q(str, s.QUERY_HOST);
            c.a().submit(qVar);
        }
        if (eVarM15a == null) {
            reportUserGetIP(str, 0);
            return f.f33c;
        }
        if (u.e()) {
            i.d("[HttpDns] disabled return Nil.");
            reportUserGetIP(str, 0);
            return f.f33c;
        }
        if (eVarM15a.getCacheKey() != null) {
            return f.f33c;
        }
        if (this.isExpiredIPEnabled) {
            reportHttpDnsSuccess(str, 1);
            reportUserGetIP(str, 1);
            return eVarM15a.getIps();
        }
        if (eVarM15a.c()) {
            i.d("[HttpDns] ips from cache:" + Arrays.toString(eVarM15a.getIps()));
            return eVarM15a.getIps();
        }
        if (!zM25b) {
            i.f("[HttpDns] return Nil.");
            reportUserGetIP(str, 0);
            return f.f33c;
        }
        i.d("[HttpDns] not expired return " + Arrays.toString(eVarM15a.getIps()));
        reportHttpDnsSuccess(str, 1);
        reportUserGetIP(str, 1);
        return eVarM15a.getIps();
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public String getSessionId() {
        return com.alibaba.sdk.android.httpdns.e.a.a().getSessionId();
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setAuthCurrentTime(long j10) {
        if (b.a()) {
            a.setAuthCurrentTime(j10);
        } else {
            i.f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setCachedIPEnabled(boolean z10) {
        setCachedIPEnabled(z10, true);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setCachedIPEnabled(boolean z10, boolean z11) {
        try {
            if (!b.a()) {
                i.f("HttpDns service turned off");
                return;
            }
            i.f("Httpdns DB cache enable = " + z10 + ". autoCleanCacheAfterLoad = " + z11);
            com.alibaba.sdk.android.httpdns.b.b.a(z10, z11);
            d.a().m17a();
            com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
            if (bVarA != null) {
                bVarA.c(z10 ? 1 : 0);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setDegradationFilter(DegradationFilter degradationFilter2) {
        if (b.a()) {
            degradationFilter = degradationFilter2;
        } else {
            i.f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setExpiredIPEnabled(boolean z10) {
        if (!b.a()) {
            i.f("HttpDns service turned off");
            return;
        }
        this.isExpiredIPEnabled = z10;
        com.alibaba.sdk.android.httpdns.d.b bVarA = com.alibaba.sdk.android.httpdns.d.b.a();
        if (bVarA != null) {
            bVarA.d(z10 ? 1 : 0);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setHTTPSRequestEnabled(boolean z10) {
        if (b.a()) {
            f.setHTTPSRequestEnabled(z10);
        } else {
            i.f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setIPProbeList(List<IPProbeItem> list) {
        if (b.a()) {
            f.a(list);
        } else {
            i.f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogEnabled(boolean z10) {
        i.setLogEnabled(z10);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setLogger(ILogger iLogger) {
        i.setLogger(iLogger);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveAfterNetworkChanged(boolean z10) {
        if (b.a()) {
            p.f37988i = z10;
        } else {
            i.f("HttpDns service turned off");
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setPreResolveHosts(ArrayList<String> arrayList) {
        if (!b.a()) {
            i.f("HttpDns service turned off");
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String str = arrayList.get(i10);
            if (l.b(str) && !hostManager.m20a(str)) {
                c.a().submit(new q(str, s.QUERY_HOST));
            }
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setRegion(String str) {
        if (!b.a()) {
            i.f("HttpDns service turned off");
        } else if (TextUtils.isEmpty(str)) {
            i.f("region cannot be empty");
        } else {
            n.a().b(sContext, str);
        }
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setSdnsGlobalParams(Map<String, String> map) {
        f.setSdnsGlobalParams(map);
    }

    @Override // com.alibaba.sdk.android.httpdns.HttpDnsService
    public void setTimeoutInterval(int i10) {
        if (b.a()) {
            f.setTimeoutInterval(i10);
        } else {
            i.f("HttpDns service turned off");
        }
    }
}
