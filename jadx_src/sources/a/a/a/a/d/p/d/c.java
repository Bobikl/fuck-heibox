package a.a.a.a.d.p.d;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.base.executor.DnsExecutors;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.rank.IpRankItem;
import com.tencent.msdk.dns.core.rest.share.AbsRestDns;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import k.f;
import k.g;
import k.m;
import r.e;

/* JADX INFO: compiled from: CacheHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g<e> f1140d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Runnable> f1137a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, d> f1138b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<m<e>> f1139c = Collections.synchronizedSet(b.a.i());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l.a f1141e = l.a.d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n.c f1142f = new n.c();

    /* JADX INFO: compiled from: CacheHelper.java */
    public class a extends HashMap<String, Integer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f1143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f1144c;

        public a(c cVar, String str, int i10) {
            this.f1143b = str;
            this.f1144c = i10;
            put(str, Integer.valueOf(i10));
        }
    }

    /* JADX INFO: compiled from: CacheHelper.java */
    public class b implements n.a {
        public b() {
        }

        @Override // n.a
        public void a(String str, String[] strArr) {
            LookupResult lookupResultD = c.this.d(str);
            if (lookupResultD != null) {
                c.this.f1142f.getClass();
                String[] strArr2 = lookupResultD.ipSet.ips;
                ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
                for (String str2 : strArr2) {
                    if (j.c.b(str2)) {
                        arrayList.add(str2);
                    }
                }
                String[] strArr3 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                AbsRestDns.Statistics statistics = (AbsRestDns.Statistics) lookupResultD.stat;
                statistics.ips = strArr3;
                LookupResult lookupResult = new LookupResult(strArr3, statistics);
                c cVar = c.this;
                cVar.getClass();
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("hostname".concat(" can not be empty"));
                }
                cVar.f1141e.e(str);
                cVar.f1141e.c(str, lookupResult);
            }
        }
    }

    /* JADX INFO: renamed from: a.a.a.a.d.p.d.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CacheHelper.java */
    public class C0001c implements g.b {

        /* JADX INFO: renamed from: a.a.a.a.d.p.d.c$c$a */
        /* JADX INFO: compiled from: CacheHelper.java */
        public class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f1147b;

            public a(C0001c c0001c, m mVar) {
                this.f1147b = mVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                w.d.b("HDNSLookupAsync", f.j(this.f1147b));
            }
        }

        public C0001c() {
        }

        @Override // g.b
        public void a() {
            char c10 = 0;
            if (!DnsService.getDnsConfig().useExpiredIpEnable) {
                f.b.b("Network changed, clear caches", new Object[0]);
                c.this.f1141e.a();
            }
            synchronized (c.this.f1137a) {
                Iterator<Runnable> it = c.this.f1137a.iterator();
                while (it.hasNext()) {
                    ((DnsExecutors.a) DnsExecutors.f100945b).a(it.next());
                }
            }
            f.b.b("Network changed, refetch server Ips", new Object[0]);
            a.a.c().d();
            if (DnsService.getDnsConfig().enablePersistentCache) {
                synchronized (c.this.f1139c) {
                    f.b.b("Network changed, enable persistent async lookup", new Object[0]);
                    Iterator<m<e>> it2 = c.this.f1139c.iterator();
                    while (it2.hasNext()) {
                        m<e> next = it2.next();
                        Object[] objArr = new Object[1];
                        objArr[c10] = next.f124394b;
                        f.b.b("Async lookup for %s start", objArr);
                        Context context = next.f124393a;
                        String str = next.f124394b;
                        int i10 = next.f124395c;
                        String str2 = next.f124396d;
                        LookupExtra lookupextra = next.f124397e;
                        String str3 = next.f124398f;
                        boolean z10 = next.f124399g;
                        boolean z11 = next.f124400h;
                        int i11 = next.f124401i;
                        boolean z12 = next.f124402j;
                        int i12 = next.f124403k;
                        boolean z13 = next.f124404l;
                        int i13 = next.f124405m;
                        if (context == null) {
                            throw new IllegalStateException("mAppContext".concat(" is not initialized yet"));
                        }
                        if (str == null) {
                            throw new IllegalStateException("mHostname".concat(" is not initialized yet"));
                        }
                        if (-1 == i10) {
                            throw new IllegalStateException("mTimeoutMills".concat(" is not initialized yet"));
                        }
                        if (str2 == null) {
                            throw new IllegalStateException("mDnsIp".concat(" is not initialized yet"));
                        }
                        if (lookupextra == 0) {
                            throw new IllegalStateException("mLookupExtra".concat(" is not initialized yet"));
                        }
                        if (str3 == null) {
                            throw new IllegalStateException("mChannel".concat(" is not initialized yet"));
                        }
                        DnsExecutors.f100946c.execute(new a(this, new m(context, str, i10, str2, lookupextra, str3, z10, z11, i11, z12, i12, z13, i13, true)));
                        it2.remove();
                        c10 = 0;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: CacheHelper.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Runnable f1148a;
    }

    public c(g<e> gVar) {
        this.f1140d = gVar;
        a();
    }

    public final void a() {
        C0001c c0001c = new C0001c();
        synchronized (g.c.class) {
            if (g.c.f118914a != null) {
                g.a aVar = g.c.f118914a;
                synchronized (aVar) {
                    aVar.f118913b.add(c0001c);
                }
            }
        }
    }

    public void b(String str) {
        if (DnsService.getDnsConfig().useExpiredIpEnable) {
            this.f1141e.b(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v2 */
    public void c(m<e> mVar, s.a aVar) {
        char c10;
        if (aVar == null) {
            throw new IllegalArgumentException(HiAnalyticsConstant.Direction.RESPONSE.concat(" can not be null"));
        }
        if (s.a.f139140e == aVar) {
            b(mVar.f124407o);
            return;
        }
        String[] strArrSplit = mVar.f124407o.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        HashMap map = new HashMap();
        char c11 = 2;
        ?? r10 = 1;
        int i10 = 0;
        if (strArrSplit.length > 1) {
            for (String str : aVar.f139143b) {
                String[] strArrSplit2 = str.split(":", 2);
                if (!map.containsKey(strArrSplit2[0])) {
                    map.put(strArrSplit2[0], new ArrayList());
                }
                ((List) map.get(strArrSplit2[0])).add(strArrSplit2[1]);
            }
        } else {
            map.put(strArrSplit[0], Arrays.asList(aVar.f139143b));
        }
        int length = strArrSplit.length;
        int i11 = 0;
        while (i11 < length) {
            String str2 = strArrSplit[i11];
            List list = (List) map.get(str2);
            if (list != null) {
                String[] strArr = (String[]) list.toArray(new String[i10]);
                int iIntValue = (strArrSplit.length > r10 ? aVar.f139144c.get(str2) : aVar.f139144c.get("onehost")).intValue();
                AbsRestDns.Statistics statistics = new AbsRestDns.Statistics(strArr, aVar.f139142a, new a(this, str2, iIntValue));
                statistics.errorCode = i10;
                this.f1141e.c(str2, new LookupResult(strArr, statistics));
                d dVar = this.f1138b.get(str2);
                IpRankItem ipRankItem = null;
                if (dVar != null) {
                    Runnable runnable = dVar.f1148a;
                    if (runnable != null) {
                        this.f1137a.remove(runnable);
                        ((DnsExecutors.a) DnsExecutors.f100945b).a(dVar.f1148a);
                        dVar.f1148a = null;
                    }
                } else {
                    dVar = new d();
                }
                Set<String> set = DnsService.getDnsConfig().persistentCacheDomains;
                if (DnsService.getDnsConfig().enablePersistentCache && set != null && set.contains(str2)) {
                    int i12 = this.f1140d.a().f124367b;
                    m.a aVarG = new m.a(mVar).g(str2);
                    aVarG.f124419l = r10;
                    aVarG.f124414g = i10;
                    if (((r10 == i12 || 2 == i12 || 3 == i12) ? i10 : 1) != 0) {
                        throw new IllegalArgumentException("family".concat(" is invalid"));
                    }
                    aVarG.f124416i = i12;
                    aVarG.f124421n = i10;
                    m<e> mVarE = aVarG.e();
                    this.f1139c.add(mVarE);
                    r.c cVar = new r.c(this, str2, i12, mVarE);
                    dVar.f1148a = cVar;
                    this.f1137a.add(cVar);
                    ((DnsExecutors.a) DnsExecutors.f100945b).a(cVar, (long) (iIntValue * 0.75f * 1000.0f));
                }
                if (!this.f1138b.containsKey(str2)) {
                    this.f1138b.put(str2, dVar);
                }
                n.c cVar2 = this.f1142f;
                b bVar = new b();
                Set<IpRankItem> set2 = cVar2.f131917a;
                if (set2 == null || set2.isEmpty()) {
                    c10 = 2;
                } else if (strArr.length < 2) {
                    c10 = 2;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : strArr) {
                        if (j.c.a(str3)) {
                            arrayList.add(str3);
                        }
                    }
                    c10 = 2;
                    if (arrayList.size() >= 2 && !n.c.f131916b.contains(str2)) {
                        n.c.f131916b.add(str2);
                        Set<IpRankItem> set3 = cVar2.f131917a;
                        if (set3 != null && set3.size() > 0) {
                            for (IpRankItem ipRankItem2 : cVar2.f131917a) {
                                if (str2.equals(ipRankItem2.getHostName())) {
                                    ipRankItem = ipRankItem2;
                                    break;
                                }
                            }
                        }
                        if (ipRankItem != null) {
                            DnsExecutors.f100946c.execute(new n.e(str2, (String[]) arrayList.toArray(new String[arrayList.size()]), ipRankItem, new n.b(cVar2, bVar)));
                        }
                    }
                }
            } else {
                c10 = c11;
                i11 = i11;
                b(str2);
            }
            i11++;
            c11 = c10;
            r10 = 1;
            i10 = 0;
        }
    }

    public LookupResult d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        l.a aVar = this.f1141e;
        aVar.getClass();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("hostname".concat(" can not be empty"));
        }
        LookupResult lookupResult = aVar.f130816a.get(str);
        if (lookupResult == null) {
            return null;
        }
        AbsRestDns.Statistics statistics = (AbsRestDns.Statistics) lookupResult.stat;
        if (DnsService.getDnsConfig().useExpiredIpEnable || statistics.expiredTime > SystemClock.elapsedRealtime()) {
            return lookupResult;
        }
        f.b.b("Cache of %s(%d) expired", str, Integer.valueOf(this.f1140d.a().f124367b));
        this.f1141e.e(str);
        return null;
    }
}
