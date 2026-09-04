package w;

import android.text.TextUtils;
import com.tencent.msdk.dns.DnsConfig;
import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.MSDKDnsResolver;
import com.tencent.msdk.dns.base.executor.DnsExecutors;
import com.tencent.msdk.dns.base.report.IReporter;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.local.LocalDns;
import com.tencent.msdk.dns.core.rest.share.AbsRestDns;
import com.tencent.msdk.dns.core.stat.StatisticsMerge;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: ReportHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static DnsConfig f140916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f140917b = new a();

    /* JADX INFO: compiled from: ReportHelper.java */
    public static final class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            HashMap map;
            Map<String, Object[]> map2 = c.f140914a;
            synchronized (map2) {
                if (map2.isEmpty()) {
                    map = new HashMap();
                } else {
                    map = new HashMap(map2);
                    map2.clear();
                }
            }
            if (d.f140916a.enableReport && !map.isEmpty()) {
                for (Iterator it = map.entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object[] objArr = (Object[]) entry.getValue();
                    int iIntValue = ((Integer) objArr[1]).intValue();
                    int iIntValue2 = ((Integer) objArr[2]).intValue();
                    int iIntValue3 = ((Integer) objArr[0]).intValue() / (iIntValue + iIntValue2);
                    String strA = b.a(DnsService.getAppContext());
                    String strB = a.a.c().b();
                    if (iIntValue > 0) {
                        c.b bVar = DnsExecutors.f100945b;
                        DnsConfig dnsConfig = d.f140916a;
                        ((DnsExecutors.a) bVar).execute(new w.a(strA, "", dnsConfig.lookupExtra.f138703b, dnsConfig.appId, dnsConfig.channel, "HDNSLookupCached", System.currentTimeMillis(), strB, iIntValue3, 0L, (String) entry.getKey(), "", d.f140916a.timeoutMills, 3L, 0, true, iIntValue, null, null));
                    }
                    if (iIntValue2 > 0) {
                        c.b bVar2 = DnsExecutors.f100945b;
                        DnsConfig dnsConfig2 = d.f140916a;
                        ((DnsExecutors.a) bVar2).execute(new w.a(strA, "", dnsConfig2.lookupExtra.f138703b, dnsConfig2.appId, dnsConfig2.channel, "HDNSLookupCached", System.currentTimeMillis(), strB, iIntValue3, 0L, (String) entry.getKey(), "", d.f140916a.timeoutMills, 0L, 0, true, iIntValue2, null, null));
                    }
                }
            }
            c.b bVar3 = DnsExecutors.f100945b;
            Runnable runnable = d.f140917b;
            DnsExecutors.a aVar = (DnsExecutors.a) bVar3;
            aVar.a(runnable);
            aVar.a(runnable, 300000L);
        }
    }

    public static void a(DnsConfig dnsConfig) {
        if (dnsConfig == null) {
            throw new IllegalArgumentException("dnsConfig".concat(" can not be null"));
        }
        f140916a = dnsConfig;
        Random random = new Random();
        char[] cArr = new char[12];
        for (int i10 = 0; i10 < 12; i10++) {
            cArr[i10] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
        }
        b.a.f30355c = new String(cArr);
        ((DnsExecutors.a) DnsExecutors.f100945b).a(f140917b, 300000L);
        e eVar = new e();
        synchronized (e.c.class) {
            if (e.c.f118529b) {
                if (e.c.f118528a.isEmpty()) {
                    e.c.f118528a = new ArrayList();
                }
                e.c.f118528a.add(eVar);
            }
            boolean z10 = e.c.f118529b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x00db  */
    /* JADX WARN: Code duplicated, block: B:34:0x0155  */
    /* JADX WARN: Code duplicated, block: B:36:0x0158  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0050, please report this as an issue */
    public static void b(String str, LookupResult lookupResult) {
        String str2;
        String str3;
        DnsConfig dnsConfig;
        AbsRestDns.Statistics statistics;
        int i10;
        a.a aVar;
        if (lookupResult == null) {
            throw new IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        Statistics statistics2 = lookupResult.stat;
        if (!(statistics2 instanceof StatisticsMerge)) {
            f.b.g("lookupResult.stat is not instanceof StatisticsMerge", new Object[0]);
            return;
        }
        StatisticsMerge statisticsMerge = (StatisticsMerge) statistics2;
        a.a aVarC = a.a.c();
        String strA = b.a(DnsService.getAppContext());
        String strB = aVarC.b();
        int i11 = statisticsMerge.curNetStack;
        if (i11 == 1) {
            str2 = ak.av;
        } else {
            if (i11 != 2) {
                if (i11 != 3) {
                    str3 = null;
                } else {
                    str2 = "dual";
                }
                dnsConfig = f140916a;
                if (dnsConfig.enableReport) {
                    statistics = statisticsMerge.restDnsStat;
                    if (statistics.cached) {
                    }
                    i10 = statistics.errorCode;
                    if (i10 == 0) {
                        Integer num = 0;
                        aVarC.f1128a.set(num.intValue());
                        f.b.b(Thread.currentThread().getName() + " set mErrorCount: " + num, new Object[0]);
                        c.b bVar = DnsExecutors.f100945b;
                        String str4 = statisticsMerge.netType;
                        DnsConfig dnsConfig2 = f140916a;
                        String str5 = dnsConfig2.lookupExtra.f138703b;
                        String str6 = dnsConfig2.appId;
                        String str7 = dnsConfig2.channel;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        AbsRestDns.Statistics statistics3 = statisticsMerge.restDnsStat;
                        long j10 = statistics3.costTimeMills;
                        LocalDns.Statistics statistics4 = statisticsMerge.localDnsStat;
                        ((DnsExecutors.a) bVar).execute(new w.a(strA, str4, str5, str6, str7, str, jCurrentTimeMillis, strB, j10, statistics4.costTimeMills, statisticsMerge.requestHostname, str3, f140916a.timeoutMills, statistics3.errorCode, statistics3.statusCode, statistics3.cached, 1, b.a.h(statistics4.ips, Constants.ACCEPT_TIME_SEPARATOR_SP), b.a.h(statisticsMerge.restDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP)));
                        return;
                    }
                    if (i10 == 2 && (!MSDKDnsResolver.HTTPS_CHANNEL.equals(dnsConfig.channel) || statisticsMerge.restDnsStat.errorCode != 1)) {
                        c.b bVar2 = DnsExecutors.f100945b;
                        String str8 = statisticsMerge.netType;
                        DnsConfig dnsConfig3 = f140916a;
                        String str9 = dnsConfig3.lookupExtra.f138703b;
                        String str10 = dnsConfig3.appId;
                        String str11 = dnsConfig3.channel;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        AbsRestDns.Statistics statistics5 = statisticsMerge.restDnsStat;
                        long j11 = statistics5.costTimeMills;
                        LocalDns.Statistics statistics6 = statisticsMerge.localDnsStat;
                        ((DnsExecutors.a) bVar2).execute(new w.a(strA, str8, str9, str10, str11, str, jCurrentTimeMillis2, strB, j11, statistics6.costTimeMills, statisticsMerge.requestHostname, str3, f140916a.timeoutMills, statistics5.errorCode, statistics5.statusCode, statistics5.cached, 1, b.a.h(statistics6.ips, Constants.ACCEPT_TIME_SEPARATOR_SP), b.a.h(statisticsMerge.restDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP)));
                        return;
                    }
                    if (aVarC.f1128a.get() + 1 >= 3) {
                        c.b bVar3 = DnsExecutors.f100945b;
                        String str12 = statisticsMerge.netType;
                        DnsConfig dnsConfig4 = f140916a;
                        String str13 = dnsConfig4.lookupExtra.f138703b;
                        String str14 = dnsConfig4.appId;
                        String str15 = dnsConfig4.channel;
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        AbsRestDns.Statistics statistics7 = statisticsMerge.restDnsStat;
                        long j12 = statistics7.costTimeMills;
                        LocalDns.Statistics statistics8 = statisticsMerge.localDnsStat;
                        ((DnsExecutors.a) bVar3).execute(new w.a(strA, str12, str13, str14, str15, str, jCurrentTimeMillis3, strB, j12, statistics8.costTimeMills, statisticsMerge.requestHostname, str3, f140916a.timeoutMills, statistics7.errorCode, statistics7.statusCode, statistics7.cached, 1, b.a.h(statistics8.ips, Constants.ACCEPT_TIME_SEPARATOR_SP), b.a.h(statisticsMerge.restDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP)));
                        aVar = aVarC;
                    } else {
                        aVar = aVarC;
                    }
                    f.b.b(Thread.currentThread().getName() + " increment mErrorCount: " + Integer.valueOf(aVar.f1128a.incrementAndGet()), new Object[0]);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("dnsip连接失败, 当前失败次数：");
                    sb2.append(aVar.f1128a.get());
                    f.b.b(sb2.toString(), new Object[0]);
                }
            }
            str2 = "aaaa";
        }
        str3 = str2;
        dnsConfig = f140916a;
        if (dnsConfig.enableReport) {
            statistics = statisticsMerge.restDnsStat;
            if (statistics.cached) {
                i10 = statistics.errorCode;
                if (i10 == 0) {
                    Integer num2 = 0;
                    aVarC.f1128a.set(num2.intValue());
                    f.b.b(Thread.currentThread().getName() + " set mErrorCount: " + num2, new Object[0]);
                    c.b bVar4 = DnsExecutors.f100945b;
                    String str16 = statisticsMerge.netType;
                    DnsConfig dnsConfig5 = f140916a;
                    String str17 = dnsConfig5.lookupExtra.f138703b;
                    String str18 = dnsConfig5.appId;
                    String str19 = dnsConfig5.channel;
                    long jCurrentTimeMillis4 = System.currentTimeMillis();
                    AbsRestDns.Statistics statistics9 = statisticsMerge.restDnsStat;
                    long j13 = statistics9.costTimeMills;
                    LocalDns.Statistics statistics10 = statisticsMerge.localDnsStat;
                    ((DnsExecutors.a) bVar4).execute(new w.a(strA, str16, str17, str18, str19, str, jCurrentTimeMillis4, strB, j13, statistics10.costTimeMills, statisticsMerge.requestHostname, str3, f140916a.timeoutMills, statistics9.errorCode, statistics9.statusCode, statistics9.cached, 1, b.a.h(statistics10.ips, Constants.ACCEPT_TIME_SEPARATOR_SP), b.a.h(statisticsMerge.restDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP)));
                    return;
                }
                if (i10 == 2) {
                }
                if (aVarC.f1128a.get() + 1 >= 3) {
                    c.b bVar5 = DnsExecutors.f100945b;
                    String str110 = statisticsMerge.netType;
                    DnsConfig dnsConfig6 = f140916a;
                    String str111 = dnsConfig6.lookupExtra.f138703b;
                    String str112 = dnsConfig6.appId;
                    String str113 = dnsConfig6.channel;
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    AbsRestDns.Statistics statistics11 = statisticsMerge.restDnsStat;
                    long j14 = statistics11.costTimeMills;
                    LocalDns.Statistics statistics12 = statisticsMerge.localDnsStat;
                    ((DnsExecutors.a) bVar5).execute(new w.a(strA, str110, str111, str112, str113, str, jCurrentTimeMillis5, strB, j14, statistics12.costTimeMills, statisticsMerge.requestHostname, str3, f140916a.timeoutMills, statistics11.errorCode, statistics11.statusCode, statistics11.cached, 1, b.a.h(statistics12.ips, Constants.ACCEPT_TIME_SEPARATOR_SP), b.a.h(statisticsMerge.restDnsStat.ips, Constants.ACCEPT_TIME_SEPARATOR_SP)));
                    aVar = aVarC;
                } else {
                    aVar = aVarC;
                }
                f.b.b(Thread.currentThread().getName() + " increment mErrorCount: " + Integer.valueOf(aVar.f1128a.incrementAndGet()), new Object[0]);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("dnsip连接失败, 当前失败次数：");
                sb3.append(aVar.f1128a.get());
                f.b.b(sb3.toString(), new Object[0]);
            }
        }
    }

    public static void c(String str, Map<String, String> map) {
        List<IReporter> list = i.a.f119204a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f.b.d(2)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                f.b.b("%s: %s", entry.getKey(), entry.getValue());
            }
        }
        if ((i.a.f119204a.isEmpty() && i.a.f119205b.isEmpty()) ? false : true) {
            f.b.b("HTTPDNS_SDK_VER:4.9.0a, Try to report %s", str);
            for (IReporter iReporter : i.a.f119204a) {
                if (!iReporter.report(3, str, map)) {
                    f.b.b("%s report failed", iReporter.getName());
                }
            }
            for (IReporter iReporter2 : i.a.f119205b) {
                if (!iReporter2.report(3, str, map)) {
                    f.b.b("%s report failed", iReporter2.getName());
                }
            }
        }
    }

    public static void d(Map<String, String> map) {
        map.put("sdk_Version", "4.9.0a");
        map.put(x9.b.f141156u, f140916a.appId);
        map.put("id", f140916a.lookupExtra.f138703b);
    }
}
