package com.tencent.msdk.dns;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.tencent.msdk.dns.base.executor.DnsExecutors;
import com.tencent.msdk.dns.base.log.ILogNode;
import com.tencent.msdk.dns.base.report.IReporter;
import com.tencent.msdk.dns.core.IStatisticsMerge;
import com.tencent.msdk.dns.core.IpSet;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.rest.share.AbsRestDns;
import com.tencent.msdk.dns.core.stat.StatisticsMerge;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import k.h;
import k.m;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class DnsService {
    private static Context sAppContext = null;
    private static DnsConfig sConfig = null;
    private static volatile boolean sInited = false;

    public static final class a implements Runnable {
        /* JADX WARN: Code duplicated, block: B:51:0x012c  */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            String str;
            HttpURLConnection httpURLConnection;
            Exception e10;
            r.e eVar = DnsService.sConfig.lookupExtra;
            String str2 = DnsService.sConfig.channel;
            if (str2.equals(MSDKDnsResolver.HTTPS_CHANNEL)) {
                str = "https://119.29.29.99/conf?token=" + eVar.f138705d;
            } else {
                str = "http://119.29.29.98/conf?id=" + eVar.f138703b + "&alg=" + (str2.equals(MSDKDnsResolver.AES_HTTP_CHANNEL) ? "aes" : "des");
            }
            HttpURLConnection httpURLConnection2 = null;
            String str3 = "";
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    try {
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.connect();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            str3 = str3 + line;
                        }
                        bufferedReader.close();
                        httpURLConnection.disconnect();
                    } catch (Exception e11) {
                        e10 = e11;
                        e10.printStackTrace();
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e12) {
                httpURLConnection = null;
                e10 = e12;
            } catch (Throwable th3) {
                th = th3;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                throw th;
            }
            if (!str3.isEmpty()) {
                String strD = str2.equals(MSDKDnsResolver.HTTPS_CHANNEL) ? str3 : str2.equals(MSDKDnsResolver.AES_HTTP_CHANNEL) ? b.a.d(str3, eVar.f138704c) : b.a.v(str3, eVar.f138704c);
                f.b.b("lookup byUrl: %s, rsp: %s, raw: %s", str, strD, str3);
                for (String str4 : strD.split("\\|")) {
                    String[] strArrSplit = str4.split(":");
                    if (strArrSplit[0].contains("log")) {
                        b.a.f30354b = "1".equals(strArrSplit[1]);
                    } else if (strArrSplit[0].contains("domain")) {
                        b.a.f30353a = "1".equals(strArrSplit[1]);
                    }
                }
                DnsService.setDnsConfigFromServer(b.a.f30354b, b.a.f30353a);
            }
            a.a.c().d();
        }
    }

    public static final class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ArrayList<m.b> arrayList;
            l.a aVar = l.a.C1196a.f130818a;
            aVar.getClass();
            if (DnsService.getDnsConfig().cachedIpEnable) {
                m.a aVar2 = aVar.f130817b;
                aVar2.getClass();
                synchronized (m.a.f131430c) {
                    arrayList = new ArrayList();
                    Cursor cursorQuery = null;
                    try {
                        try {
                            cursorQuery = aVar2.a().query("lookupDB", null, null, null, null, null, null);
                            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                                cursorQuery.moveToFirst();
                                do {
                                    arrayList.add(new m.b(cursorQuery.getString(cursorQuery.getColumnIndex("host")), b.a.a(cursorQuery.getBlob(cursorQuery.getColumnIndex("result")))));
                                } while (cursorQuery.moveToNext());
                            }
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e10) {
                                    f.b.e("cursor close error " + e10, new Object[0]);
                                }
                            }
                        } catch (Exception e11) {
                            f.b.e("read from db fail " + e11, new Object[0]);
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e12) {
                                    f.b.e("cursor close error " + e12, new Object[0]);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                            } catch (Exception e13) {
                                f.b.e("cursor close error " + e13, new Object[0]);
                            }
                        }
                        throw th2;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (m.b bVar : arrayList) {
                    aVar.f130816a.put(bVar.f131432a, bVar.f131433b);
                    AbsRestDns.Statistics statistics = (AbsRestDns.Statistics) bVar.f131433b.stat;
                    if (statistics == null || SystemClock.elapsedRealtime() > statistics.expiredTime) {
                        arrayList2.add(bVar.f131432a);
                    }
                }
                aVar.f130817b.b((String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
    }

    public static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LookupResult f100933a;

        public c(LookupResult lookupResult) {
            this.f100933a = lookupResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.c.a(this.f100933a);
        }
    }

    public static final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f100934a;

        public d(String str) {
            this.f100934a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            DnsService.getAddrsByName(this.f100934a, false, true);
        }
    }

    public static final class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f100935a;

        public e(String str) {
            this.f100935a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.b.b("async look up send", new Object[0]);
            DnsService.getAddrsByName(this.f100935a, false, true);
        }
    }

    public static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ILookedUpListener f100936a;

        public f(ILookedUpListener iLookedUpListener) {
            this.f100936a = iLookedUpListener;
        }
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f100937a;

        public g(String str) {
            this.f100937a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            m.a aVarC = new m.a().b(DnsService.sAppContext).g(this.f100937a).a(DnsService.sConfig.timeoutMills).f(a.a.c().b()).d(DnsService.sConfig.lookupExtra).c(DnsService.sConfig.channel);
            aVarC.f124414g = false;
            aVarC.f124415h = DnsService.sConfig.blockFirst;
            aVarC.f124417j = true;
            aVarC.f124419l = true;
            LookupResult<IStatisticsMerge> lookupResultJ = k.f.j(aVarC.e());
            w.d.b("HDNSPreLookup", lookupResultJ);
            ArrayMap arrayMap = new ArrayMap(16);
            StatisticsMerge statisticsMerge = (StatisticsMerge) lookupResultJ.stat;
            arrayMap.put("channel", w.d.f140916a.channel);
            arrayMap.put(DispatchConstants.NET_TYPE, statisticsMerge.netType);
            arrayMap.put("domain", statisticsMerge.hostname);
            arrayMap.put("net_stack", String.valueOf(statisticsMerge.curNetStack));
            arrayMap.put("hdns_err_code", String.valueOf(statisticsMerge.restDnsStat.errorCode));
            arrayMap.put("hdns_err_msg", statisticsMerge.restDnsStat.errorMsg);
            arrayMap.put("hdns_ip", b.a.h(statisticsMerge.restDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP));
            arrayMap.put(RemoteMessageConst.TTL, String.valueOf(statisticsMerge.restDnsStat.ttl));
            arrayMap.put("clientIP", statisticsMerge.restDnsStat.clientIp);
            arrayMap.put("hdns_time", String.valueOf(statisticsMerge.restDnsStat.costTimeMills));
            arrayMap.put("hdns_retry", String.valueOf(statisticsMerge.restDnsStat.retryTimes));
            arrayMap.put("status_code", String.valueOf(statisticsMerge.restDnsStat.statusCode));
            w.d.d(arrayMap);
            w.d.c("HDNSPreLookup", arrayMap);
        }
    }

    private static void addLogNodes(List<ILogNode> list) {
        f.b.f("DnsService.addLogNodes(%s) called", b.a.g(list));
        if (list == null) {
            return;
        }
        for (ILogNode iLogNode : list) {
            synchronized (f.c.class) {
                List<ILogNode> list2 = f.c.f118733a;
                if (iLogNode != null) {
                    list2.add(iLogNode);
                }
            }
        }
    }

    private static void addReporters(List<IReporter> list) {
        f.b.f("DnsService.addReporters(%s) called", b.a.g(list));
        if (list == null) {
            return;
        }
        for (IReporter iReporter : list) {
            synchronized (i.a.class) {
                List<IReporter> list2 = i.a.f119204a;
                if (iReporter != null && iReporter.canReport()) {
                    if (i.a.f119205b.isEmpty()) {
                        i.a.f119205b = new ArrayList();
                    }
                    i.a.f119205b.add(iReporter);
                }
            }
        }
    }

    private static boolean enableAsyncLookup(String str) {
        Set<String> set = sConfig.persistentCacheDomains;
        return set != null && set.contains(str);
    }

    public static synchronized void enablePersistentCache(boolean z10) {
        if (!sInited) {
            throw new IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        sConfig.enablePersistentCache = z10;
    }

    public static IpSet getAddrsByName(String str) {
        return getAddrsByName(str, sConfig.channel, true, false);
    }

    private static IpSet getAddrsByName(String str, String str2, boolean z10, boolean z11) {
        if (!sInited) {
            throw new IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        if (!TextUtils.isEmpty(str)) {
            String strTrim = str.trim();
            if (!TextUtils.isEmpty(strTrim)) {
                if (j.c.a(strTrim)) {
                    f.b.b("Hostname %s is an v4 ip, just return it", strTrim);
                    return new IpSet(new String[]{strTrim}, k.a.f124360a);
                }
                if (j.c.b(strTrim)) {
                    f.b.b("Hostname %s is an v6 ip, just return it", strTrim);
                    return new IpSet(k.a.f124360a, new String[]{strTrim});
                }
                if (TextUtils.isEmpty(str2)) {
                    str2 = sConfig.channel;
                }
                String strB = a.a.c().b();
                f.b.f("DnsService.getAddrsByName(%s, %s, %b, %b) called", strTrim, str2, Boolean.valueOf(z10), Boolean.valueOf(z11));
                if (!sConfig.needProtect(strTrim)) {
                    if (!z10) {
                        return IpSet.EMPTY;
                    }
                    f.b.b("Hostname %s is not in protected domain list, just lookup by LocalDns", strTrim);
                    m.a aVarC = new m.a().b(sAppContext).g(strTrim).a(sConfig.timeoutMills).f(strB).d(k.g.a.f124381a).c("Local");
                    aVarC.f124414g = false;
                    aVarC.f124415h = sConfig.blockFirst;
                    return k.f.j(aVarC.e()).ipSet;
                }
                m.a aVarC2 = new m.a().b(sAppContext).g(strTrim).a(sConfig.timeoutMills).f(strB).d(sConfig.lookupExtra).c(str2);
                aVarC2.f124414g = z10;
                DnsConfig dnsConfig = sConfig;
                aVarC2.f124415h = dnsConfig.blockFirst;
                aVarC2.f124419l = z11;
                int i10 = dnsConfig.customNetStack;
                if (b.a.x(i10)) {
                    throw new IllegalArgumentException("customNetStack".concat(" is invalid"));
                }
                aVarC2.f124418k = i10;
                return k.f.j(aVarC2.e()).ipSet;
            }
        }
        f.b.b("Hostname is empty", new Object[0]);
        return IpSet.EMPTY;
    }

    public static IpSet getAddrsByName(String str, boolean z10) {
        return getAddrsByName(str, sConfig.channel, z10, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static IpSet getAddrsByName(String str, boolean z10, boolean z11) {
        return getAddrsByName(str, sConfig.channel, z10, z11);
    }

    public static IpSet getAddrsByNamesEnableExpired(String str) {
        if (!sInited) {
            throw new IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        String dnsDetail = MSDKDnsResolver.getInstance().getDnsDetail(str);
        IpSet ipSet = IpSet.EMPTY;
        if (dnsDetail.isEmpty()) {
            DnsExecutors.f100946c.execute(new d(str));
            return ipSet;
        }
        try {
            JSONObject jSONObject = new JSONObject(dnsDetail);
            String str2 = (String) jSONObject.get("request_name");
            if (!str2.isEmpty()) {
                DnsExecutors.f100946c.execute(new e(str2));
                if (!getDnsConfig().useExpiredIpEnable) {
                    return ipSet;
                }
            }
            String string = jSONObject.get("v4_ips").toString();
            String string2 = jSONObject.get("v6_ips").toString();
            return new IpSet(string.isEmpty() ? new String[0] : string.split(Constants.ACCEPT_TIME_SEPARATOR_SP), string2.isEmpty() ? new String[0] : string2.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
        } catch (JSONException e10) {
            e10.printStackTrace();
            return ipSet;
        }
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    public static Context getContext() {
        return sAppContext;
    }

    public static DnsConfig getDnsConfig() {
        return sConfig;
    }

    public static String getDnsDetail(String str) {
        m.a aVarC = new m.a().b(sAppContext).g(str).a(sConfig.timeoutMills).f(a.a.c().b()).d(sConfig.lookupExtra).c(sConfig.channel);
        aVarC.f124414g = true;
        DnsConfig dnsConfig = sConfig;
        aVarC.f124415h = dnsConfig.blockFirst;
        aVarC.f124419l = false;
        int i10 = dnsConfig.customNetStack;
        if (b.a.x(i10)) {
            throw new IllegalArgumentException("customNetStack".concat(" is invalid"));
        }
        aVarC.f124418k = i10;
        LookupResult<IStatisticsMerge> lookupResultB = k.f.b(aVarC.e());
        DnsExecutors.f100946c.execute(new c(lookupResultB));
        return ((StatisticsMerge) lookupResultB.stat).toJsonResult();
    }

    public static void init(Context context, DnsConfig dnsConfig) {
        try {
            if (context == null) {
                throw new IllegalArgumentException(com.umeng.analytics.pro.d.R.concat(" can not be null"));
            }
            if (dnsConfig == null) {
                dnsConfig = new DnsConfig.Builder().build();
            }
            f.b.f118732a = Math.min(dnsConfig.logLevel, f.b.f118732a);
            addLogNodes(dnsConfig.logNodes);
            f.b.f("DnsService.init(%s, %s) called, ver:%s", context, dnsConfig, "4.9.0a");
            Context applicationContext = context.getApplicationContext();
            sAppContext = applicationContext;
            sConfig = dnsConfig;
            Executor executor = DnsExecutors.f100946c;
            executor.execute(new a());
            a.a aVarC = a.a.c();
            aVarC.f1129b = sConfig;
            aVarC.f1128a = new AtomicInteger(0);
            aVarC.f1130c = aVarC.a();
            if (w.f.f140918a == null) {
                synchronized (a.a.class) {
                    if (w.f.f140918a == null) {
                        w.f.f140918a = new w.f();
                    }
                }
            }
            w.f.f140918a.getClass();
            g.c.a(applicationContext);
            List<e.a> list = e.c.f118528a;
            if (e.d.f118530a == null) {
                Application applicationA = e.d.a(applicationContext);
                e.d.f118530a = applicationA;
                if (applicationA == null) {
                    e.d.f118530a = e.d.a(h.a.f119077a.a());
                }
            }
            Application application = e.d.f118530a;
            if (application != null) {
                e.c.f118529b = true;
                application.registerActivityLifecycleCallbacks(new e.b());
            }
            executor.execute(new b());
            w.d.a(dnsConfig);
            DnsExecutors.f100947d = sConfig.executorSupplier;
            setLookedUpListener(dnsConfig.lookedUpListener);
            addReporters(dnsConfig.reporters);
            sInited = true;
            preLookupAndStartAsyncLookup();
        } catch (Exception e10) {
            f.b.g("DnsService.init failed: %s", e10);
        }
    }

    private static void preLookupAndStartAsyncLookup() {
        Set<String> set = sConfig.preLookupDomains;
        if (set == null || set.isEmpty()) {
            return;
        }
        DnsExecutors.f100946c.execute(new g(b.a.h((String[]) sConfig.preLookupDomains.toArray(new String[sConfig.preLookupDomains.size()]), Constants.ACCEPT_TIME_SEPARATOR_SP)));
    }

    public static synchronized void setCachedIpEnable(boolean z10) {
        if (!sInited) {
            throw new IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        sConfig.cachedIpEnable = z10;
    }

    public static void setDnsConfigFromServer(boolean z10, boolean z11) {
        if (!sInited) {
            throw new IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        DnsConfig dnsConfig = sConfig;
        dnsConfig.enableReport = z10;
        dnsConfig.enableDomainServer = z11;
    }

    private static void setLookedUpListener(ILookedUpListener iLookedUpListener) {
        f.b.f("DnsService.setLookedUpListener(%s) called", iLookedUpListener);
        if (iLookedUpListener == null) {
            return;
        }
        k.f.f124373f = new f(iLookedUpListener);
    }

    public static synchronized void setUseExpiredIpEnable(boolean z10) {
        if (!sInited) {
            throw new IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        sConfig.useExpiredIpEnable = z10;
    }

    public static synchronized void setUserId(String str) {
        if (!sInited) {
            throw new IllegalStateException("DnsService".concat(" is not initialized yet"));
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("userId".concat(" can not be empty"));
        }
        sConfig.userId = str;
    }
}
