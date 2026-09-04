package k;

import android.content.Context;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.util.ArraySet;
import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.MSDKDnsResolver;
import com.tencent.msdk.dns.base.executor.DnsExecutors;
import com.tencent.msdk.dns.core.IStatisticsMerge;
import com.tencent.msdk.dns.core.IpSet;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.local.LocalDns;
import com.tencent.msdk.dns.core.rest.share.AbsRestDns;
import com.tencent.msdk.dns.core.stat.StatisticsMerge;
import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DnsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, b> f124368a = new ArrayMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<m, c> f124369b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static j.a f124370c = new u.a.C1269a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static i f124371d = new t.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static IStatisticsMerge.IFactory f124372e = new v.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile h f124373f = null;

    /* JADX INFO: compiled from: DnsManager.java */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LookupResult f124374b;

        public a(LookupResult lookupResult) {
            this.f124374b = lookupResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.c.a(this.f124374b);
        }
    }

    /* JADX INFO: compiled from: DnsManager.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public g f124375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f124376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public g f124377c;
    }

    /* JADX INFO: compiled from: DnsManager.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f124378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f124379b;

        public c(CountDownLatch countDownLatch, d dVar) {
            this.f124378a = countDownLatch;
            this.f124379b = dVar;
        }
    }

    /* JADX INFO: compiled from: DnsManager.java */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public LookupResult<IStatisticsMerge> f124380a = null;
    }

    static {
        d(new LocalDns());
        d(new p.a(1));
        d(new p.a(2));
        d(new p.a(3));
        d(new o.a(1));
        d(new o.a(2));
        d(new o.a(3));
        d(new q.a(1));
        d(new q.a(2));
        d(new q.a(3));
    }

    /* JADX WARN: Code duplicated, block: B:99:0x0241  */
    public static <LookupExtraT extends g.a> LookupResult<IStatisticsMerge> a(CountDownLatch countDownLatch, k kVar, m mVar, d dVar, List<g.b> list, long j10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        m mVar2 = mVar;
        long j11 = j10;
        Selector selector = kVar.f124388g;
        if (selector == null) {
            f124371d.getClass();
            int i15 = mVar2.f124395c;
            int iElapsedRealtime = (i15 - ((int) (SystemClock.elapsedRealtime() - j11))) / 2;
            f.b.b("selector is null", new Object[0]);
            int i16 = 0;
            while (countDownLatch.getCount() > 0 && SystemClock.elapsedRealtime() - j11 < i15) {
                try {
                    countDownLatch.await(iElapsedRealtime, TimeUnit.MILLISECONDS);
                } catch (Exception e10) {
                    f.b.a(3, e10, "sessions not empty, but exception", new Object[0]);
                }
                if (countDownLatch.getCount() > 0 && g(j11, i15, 1, i16)) {
                    i16++;
                    m.a aVarA = new m.a(mVar2).a(i15 - ((int) (SystemClock.elapsedRealtime() - j11)));
                    if (i16 < 0) {
                        throw new IllegalArgumentException("curRetryTime".concat(" can not less than 0"));
                    }
                    aVarA.f124420m = i16;
                    k kVarE = kVar.e(aVarA.e());
                    m<LookupExtra> mVar3 = kVarE.f124382a;
                    f.b.b("Retry lookup for %s(%d) block", mVar3.f124394b, Integer.valueOf(mVar3.f124401i));
                    Set<g> setH = kVarE.h();
                    synchronized (setH) {
                        Iterator<g> it = setH.iterator();
                        while (it.hasNext()) {
                            b.a.m(it.next(), kVarE);
                        }
                    }
                    kVarE.p().a();
                }
            }
            j jVarN = kVar.n();
            StatisticsMerge statisticsMerge = (StatisticsMerge) kVar.o();
            IpSet ipSetA = ((u.a) jVarN).a();
            statisticsMerge.statResult(ipSetA);
            LookupResult<IStatisticsMerge> lookupResult = new LookupResult<>(ipSetA, statisticsMerge);
            dVar.f124380a = lookupResult;
            return lookupResult;
        }
        f124371d.getClass();
        int i17 = mVar2.f124395c;
        int iElapsedRealtime2 = (i17 - ((int) (SystemClock.elapsedRealtime() - j11))) / 2;
        int i18 = 0;
        while (!list.isEmpty() && SystemClock.elapsedRealtime() - j11 < i17) {
            try {
                Thread.sleep(10L);
                i11 = 0;
            } catch (Exception e11) {
                i11 = 0;
                f.b.e("exception: %s", e11);
            }
            try {
                Object[] objArr = new Object[3];
                objArr[i11] = selector;
                try {
                    objArr[1] = Integer.valueOf(list.size());
                    objArr[2] = Integer.valueOf(iElapsedRealtime2);
                    f.b.b("selector %s wait for sessions:%d, mills:%d", objArr);
                    selector.select(iElapsedRealtime2);
                } catch (Exception e12) {
                    e = e12;
                    i12 = 0;
                    f.b.a(3, e, "sessions not empty, but exception", new Object[i12]);
                }
            } catch (Exception e13) {
                e = e13;
                i12 = i11;
            }
            Iterator<g.b> it2 = kVar.m().iterator();
            while (it2.hasNext()) {
                g.b next = it2.next();
                if (!next.e()) {
                    r.a.C1258a.C1259a c1259a = (r.a.C1258a.C1259a) next.d();
                    if (c1259a.a()) {
                        f.b.b("%s event readable", next.h().a());
                        String[] strArrA = next.a();
                        g.c cVarG = next.g();
                        if (cVarG.lookupSuccess() || cVarG.lookupFailed()) {
                            g gVarH = next.h();
                            it2.remove();
                            kVar.h().remove(gVarH);
                            b.a.n(kVar, gVarH, cVarG, strArrA);
                        }
                    } else if (c1259a.b()) {
                        f.b.b("%s event writable", next.h().a());
                        next.c();
                    } else {
                        AbsRestDns.a aVar = AbsRestDns.a.this;
                        SelectionKey selectionKey = aVar.f100958d;
                        if (selectionKey != null) {
                            i13 = 1;
                            if (selectionKey.isValid()) {
                                AbsRestDns.a aVar2 = AbsRestDns.a.this;
                                if (1 == aVar2.f100955a && aVar2.f100958d.isConnectable()) {
                                    i14 = i13;
                                }
                            } else {
                                AbsRestDns.a.this.b();
                            }
                            i14 = 0;
                        } else if (1 == aVar.f100955a) {
                            i13 = 1;
                            i14 = i13;
                        } else {
                            i13 = 1;
                            i14 = 0;
                        }
                        if (i14 != 0) {
                            Object[] objArr2 = new Object[i13];
                            objArr2[0] = next.h().a();
                            f.b.b("%s event connectable", objArr2);
                            next.f();
                        }
                        f.b.b("%s event finishConnect:%b", next.h().a(), Boolean.valueOf(c1259a.c()));
                    }
                    AbsRestDns.a aVar3 = AbsRestDns.a.this;
                    SelectionKey selectionKey2 = aVar3.f100958d;
                    if (selectionKey2 == null) {
                        if (aVar3.f100955a == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if (selectionKey2.isValid()) {
                        z10 = true;
                    } else {
                        AbsRestDns.a.this.b();
                        z10 = false;
                    }
                    if (!z10) {
                        f.b.b("%s event not available, maybe closed", next.h().a());
                        g gVarH2 = next.h();
                        it2.remove();
                        kVar.h().remove(gVarH2);
                    }
                }
            }
            if (!list.isEmpty() && g(j11, i17, 1, i18)) {
                f.b.b("sessions is not empty, sessions:%d, enter retry", Integer.valueOf(list.size()));
                i18++;
                Context context = mVar2.f124393a;
                String str = mVar2.f124394b;
                int i19 = mVar2.f124395c;
                String str2 = mVar2.f124396d;
                LookupExtra lookupextra = mVar2.f124397e;
                String str3 = mVar2.f124398f;
                boolean z11 = mVar2.f124399g;
                boolean z12 = mVar2.f124400h;
                int i20 = mVar2.f124401i;
                boolean z13 = mVar2.f124402j;
                int i21 = mVar2.f124403k;
                boolean z14 = mVar2.f124404l;
                boolean z15 = mVar2.f124406n;
                if (i18 < 0) {
                    throw new IllegalArgumentException("curRetryTime".concat(" can not less than 0"));
                }
                if (context == null) {
                    throw new IllegalStateException("mAppContext".concat(" is not initialized yet"));
                }
                if (str == null) {
                    throw new IllegalStateException("mHostname".concat(" is not initialized yet"));
                }
                if (-1 == i19) {
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
                k kVarE2 = kVar.e(new m(context, str, i19, str2, lookupextra, str3, z11, z12, i20, z13, i21, z14, i18, z15));
                List<g.b> listM = kVarE2.m();
                m<LookupExtra> mVar4 = kVarE2.f124382a;
                f.b.b("Retry lookup for %s(%d) nonBlock session:%d  start", mVar4.f124394b, Integer.valueOf(mVar4.f124401i), Integer.valueOf(listM.size()));
                Iterator<g.b> it3 = listM.iterator();
                while (it3.hasNext()) {
                    b.a.l(it3.next().i(), kVarE2, true);
                }
                m<LookupExtra> mVar5 = kVarE2.f124382a;
                f.b.b("Retry lookup for %s(%d) nonBlock session:%d finish.", mVar5.f124394b, Integer.valueOf(mVar5.f124401i), Integer.valueOf(listM.size()));
            }
            mVar2 = mVar;
            j11 = j10;
            selector = selector;
            iElapsedRealtime2 = iElapsedRealtime2;
            i17 = i17;
        }
        int i22 = iElapsedRealtime2;
        int iElapsedRealtime3 = i17 - ((int) (SystemClock.elapsedRealtime() - j10));
        try {
            if (list.size() > 0) {
                Object[] objArr3 = new Object[2];
                objArr3[0] = Integer.valueOf(list.size());
                try {
                    objArr3[1] = Integer.valueOf(i22);
                    f.b.b("selector wait for last timeout if sessions is not empty, sessions:%d, mills:%d", objArr3);
                } catch (Exception e14) {
                    e = e14;
                    i10 = 1;
                    Object[] objArr4 = new Object[i10];
                    objArr4[0] = e;
                    f.b.e("exception: %s", objArr4);
                }
            }
            countDownLatch.await(iElapsedRealtime3, TimeUnit.MILLISECONDS);
        } catch (Exception e15) {
            e = e15;
            i10 = 1;
        }
        j jVarN2 = kVar.n();
        StatisticsMerge statisticsMerge2 = (StatisticsMerge) kVar.o();
        IpSet ipSetA2 = ((u.a) jVarN2).a();
        statisticsMerge2.statResult(ipSetA2);
        LookupResult<IStatisticsMerge> lookupResult2 = new LookupResult<>(ipSetA2, statisticsMerge2);
        dVar.f124380a = lookupResult2;
        return lookupResult2;
    }

    public static <LookupExtraT extends g.a> LookupResult<IStatisticsMerge> b(m<LookupExtraT> mVar) {
        g gVar;
        int i10;
        b bVar = f124368a.get(mVar.f124398f);
        if (bVar == null) {
            return new LookupResult<>(IpSet.EMPTY, new StatisticsMerge(mVar.f124393a));
        }
        LookupExtra lookupextra = mVar.f124397e;
        k kVar = new k(mVar);
        if (b.a.x(mVar.f124403k) || (i10 = mVar.f124403k) <= 0) {
            kVar.b(b.a.t());
        } else {
            kVar.b(i10);
        }
        int iF = kVar.f();
        ((u.a.C1269a) f124370c).getClass();
        u.a aVar = new u.a(iF);
        kVar.d(aVar);
        IStatisticsMerge<LookupExtraT> iStatisticsMergeA = f124372e.a(lookupextra.getClass(), mVar.f124393a);
        kVar.c(iStatisticsMergeA);
        if (iF != 1) {
            gVar = iF != 2 ? bVar.f124375a : bVar.f124377c;
        } else {
            gVar = bVar.f124376b;
        }
        LookupResult lookupResultB = gVar.b(mVar);
        iStatisticsMergeA.statContext(kVar);
        if (!lookupResultB.stat.lookupSuccess() && !lookupResultB.stat.lookupPartCached()) {
            return new LookupResult<>(IpSet.EMPTY, iStatisticsMergeA);
        }
        ((u.a) kVar.n()).c(gVar, lookupResultB.ipSet.ips);
        kVar.o().merge(gVar, lookupResultB.stat);
        IpSet ipSetA = aVar.a();
        iStatisticsMergeA.statResult(ipSetA);
        LookupResult<IStatisticsMerge> lookupResult = new LookupResult<>(ipSetA, iStatisticsMergeA);
        f.b.b("getResultFromCache by httpdns cache:" + lookupResult.ipSet + "; " + lookupResult.stat, new Object[0]);
        return lookupResult;
    }

    public static <LookupExtraT extends g.a> void c(b bVar, k<LookupExtraT> kVar) {
        int iF = kVar.f();
        boolean z10 = kVar.f124382a.f124402j;
        g gVar = bVar.f124375a;
        if (gVar != null && (z10 || iF == 3 || (gVar instanceof LocalDns))) {
            e(gVar, kVar);
            return;
        }
        g gVar2 = bVar.f124376b;
        if (gVar2 != null && (z10 || iF == 1)) {
            e(gVar2, kVar);
            return;
        }
        g gVar3 = bVar.f124377c;
        if (gVar3 != null) {
            if (z10 || iF == 2) {
                e(gVar3, kVar);
            }
        }
    }

    public static synchronized void d(g gVar) {
        b bVar;
        String str = gVar.a().f124366a;
        Map<String, b> map = f124368a;
        if (map.containsKey(str)) {
            bVar = map.get(str);
        } else {
            b bVar2 = new b();
            map.put(str, bVar2);
            bVar = bVar2;
        }
        int i10 = gVar.a().f124367b;
        if (i10 == 1) {
            bVar.f124376b = gVar;
        } else if (i10 == 2) {
            bVar.f124377c = gVar;
        } else if (i10 == 3) {
            bVar.f124375a = gVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Multi-variable type inference failed */
    public static <LookupExtraT extends g.a> void e(g<LookupExtraT> gVar, k<LookupExtraT> kVar) {
        g.b bVarA;
        f.b.b("prepareTask:" + gVar, new Object[0]);
        kVar.h().add(gVar);
        if (kVar.f124382a.f124400h || "Local".equals(gVar.a().f124366a)) {
            b.a.m(gVar, kVar);
            return;
        }
        if (!MSDKDnsResolver.HTTPS_CHANNEL.equals(kVar.f124382a.f124398f)) {
            if (kVar.f124388g == null) {
                boolean z10 = true;
                try {
                    Selector selectorOpen = Selector.open();
                    kVar.f124388g = selectorOpen;
                    f.b.b("%s opened", selectorOpen);
                } catch (Exception e10) {
                    f.b.a(3, e10, "Open selector failed", new Object[0]);
                    z10 = false;
                }
                if (z10) {
                    bVarA = gVar.a(kVar);
                    if (bVarA != null) {
                        b.a.l(bVarA, kVar, false);
                        return;
                    }
                }
            } else {
                bVarA = gVar.a(kVar);
                if (bVarA != null) {
                    b.a.l(bVarA, kVar, false);
                    return;
                }
            }
        }
        b.a.m(gVar, kVar);
    }

    public static void f(k kVar) {
        Iterator<g.b> it = kVar.m().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                it.remove();
            }
        }
    }

    public static boolean g(long j10, int i10, int i11, int i12) {
        return i12 < i11 && ((int) (SystemClock.elapsedRealtime() - j10)) > (i10 * (i12 + 1)) / (i11 + 1);
    }

    public static <LookupExtraT extends g.a> LookupResult<IStatisticsMerge> h(m<LookupExtraT> mVar) {
        int i10;
        long j10;
        int i11;
        int i12;
        int i13;
        LookupResult<IStatisticsMerge> lookupResult;
        if (mVar == null) {
            throw new IllegalArgumentException("lookupParams".concat(" can not be null"));
        }
        f.b.f("DnsManager.lookup(%s) called", mVar);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<m, c> map = f124369b;
        c cVar = map.get(mVar);
        if (cVar != null) {
            f.b.b("The same lookup task(for %s) is running, just wait for it", mVar);
            try {
                if (cVar.f124378a.await((long) (mVar.f124395c * 1.2f), TimeUnit.MILLISECONDS)) {
                    lookupResult = cVar.f124379b.f124380a;
                } else {
                    f.b.b("Await for running lookup for %s timeout", mVar);
                    lookupResult = new LookupResult<>(IpSet.EMPTY, new StatisticsMerge(mVar.f124393a));
                }
                return lookupResult;
            } catch (Exception e10) {
                f.b.a(5, e10, "Await for running lookup for %s failed", mVar);
                int iElapsedRealtime = (int) (((long) mVar.f124395c) - (SystemClock.elapsedRealtime() - jElapsedRealtime));
                return iElapsedRealtime > 0 ? h(new m.a(mVar).a(iElapsedRealtime).e()) : new LookupResult<>(IpSet.EMPTY, new StatisticsMerge(mVar.f124393a));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        d dVar = new d();
        map.put(mVar, new c(countDownLatch, dVar));
        LookupExtra lookupextra = mVar.f124397e;
        String str = mVar.f124398f;
        boolean z10 = mVar.f124399g;
        k kVar = new k(mVar);
        b bVar = null;
        b bVar2 = z10 ? f124368a.get("Local") : null;
        if ("Local".equals(str)) {
            bVar2 = f124368a.get("Local");
        } else {
            bVar = f124368a.get(str);
        }
        if (b.a.x(mVar.f124403k) || (i13 = mVar.f124403k) <= 0) {
            kVar.b(b.a.t());
        } else {
            kVar.b(i13);
        }
        j.a aVar = f124370c;
        int iF = kVar.f();
        ((u.a.C1269a) aVar).getClass();
        kVar.d(new u.a(iF));
        IStatisticsMerge<LookupExtraT> iStatisticsMergeA = f124372e.a(lookupextra.getClass(), mVar.f124393a);
        kVar.c(iStatisticsMergeA);
        k.d dVar2 = new k.d();
        kVar.f124386e = dVar2;
        Set<g> setSynchronizedSet = Collections.synchronizedSet(new ArraySet());
        if (setSynchronizedSet == null) {
            throw new IllegalArgumentException("dnses".concat(" can not be null"));
        }
        kVar.f124389h = setSynchronizedSet;
        ArrayList arrayList = new ArrayList();
        kVar.f124390i = arrayList;
        try {
            if (bVar != null) {
                LookupResult<IStatisticsMerge> lookupResultB = b(mVar);
                j10 = jElapsedRealtime;
                f.b.b("getResultFromCache: " + lookupResultB, new Object[0]);
                if (((IStatisticsMerge) lookupResultB.stat).lookupSuccess()) {
                    if (!((IStatisticsMerge) lookupResultB.stat).lookupPartCached()) {
                        dVar.f124380a = lookupResultB;
                        f.b.b("DnsManager lookup getResultFromCache success", new Object[0]);
                        i(kVar);
                        countDownLatch.countDown();
                        map.remove(mVar);
                        f.b.b("FINALLY statMerge: %s", iStatisticsMergeA.toJsonResult());
                        f(kVar);
                        setSynchronizedSet.clear();
                        Selector selector = kVar.f124388g;
                        if (selector != null) {
                            try {
                                selector.close();
                                try {
                                    Object[] objArr = new Object[1];
                                    objArr[0] = selector;
                                    f.b.b("%s closed", objArr);
                                } catch (IOException e11) {
                                    e = e11;
                                    i12 = 1;
                                    Object[] objArr2 = new Object[i12];
                                    objArr2[0] = e;
                                    f.b.e("exception: %s", objArr2);
                                }
                            } catch (IOException e12) {
                                e = e12;
                                i12 = 1;
                            }
                        }
                        return lookupResultB;
                    }
                    j jVarN = kVar.n();
                    IpSet ipSet = lookupResultB.ipSet;
                    u.a aVar2 = (u.a) jVarN;
                    synchronized (aVar2) {
                        String[] strArr = ipSet.v4Ips;
                        String[] strArr2 = ipSet.v6Ips;
                        if (strArr != null && strArr.length > 0) {
                            aVar2.f140736f = Arrays.asList(strArr);
                        }
                        if (strArr2 != null && strArr2.length > 0) {
                            aVar2.f140737g = Arrays.asList(strArr2);
                        }
                    }
                    DnsExecutors.f100946c.execute(new a(lookupResultB));
                }
                iStatisticsMergeA.statContext(kVar);
                c(bVar, kVar);
                Set<g> set = kVar.f124389h;
                if (set == null) {
                    throw new IllegalStateException("mDnses".concat(" is not initialized yet"));
                }
                if (!set.isEmpty() && bVar2 != null) {
                    c(bVar2, kVar);
                }
            } else {
                j10 = jElapsedRealtime;
                if (bVar2 != null) {
                    c(bVar2, kVar);
                }
            }
            CountDownLatch countDownLatchA = dVar2.a();
            kVar.f124387f = countDownLatchA;
            LookupResult<IStatisticsMerge> lookupResultA = a(countDownLatchA, kVar, mVar, dVar, arrayList, j10);
            i(kVar);
            countDownLatch.countDown();
            map.remove(mVar);
            f.b.b("FINALLY statMerge: %s", iStatisticsMergeA.toJsonResult());
            f(kVar);
            setSynchronizedSet.clear();
            Selector selector2 = kVar.f124388g;
            if (selector2 != null) {
                try {
                    selector2.close();
                    try {
                        Object[] objArr3 = new Object[1];
                        objArr3[0] = selector2;
                        f.b.b("%s closed", objArr3);
                    } catch (IOException e13) {
                        e = e13;
                        i11 = 1;
                        Object[] objArr4 = new Object[i11];
                        objArr4[0] = e;
                        f.b.e("exception: %s", objArr4);
                    }
                } catch (IOException e14) {
                    e = e14;
                    i11 = 1;
                }
            }
            return lookupResultA;
        } catch (Throwable th2) {
            i(kVar);
            countDownLatch.countDown();
            f124369b.remove(mVar);
            f.b.b("FINALLY statMerge: %s", iStatisticsMergeA.toJsonResult());
            f(kVar);
            setSynchronizedSet.clear();
            Selector selector3 = kVar.f124388g;
            if (selector3 == null) {
                throw th2;
            }
            try {
                selector3.close();
                try {
                    Object[] objArr5 = new Object[1];
                    objArr5[0] = selector3;
                    f.b.b("%s closed", objArr5);
                    throw th2;
                } catch (IOException e15) {
                    e = e15;
                    i10 = 1;
                    Object[] objArr6 = new Object[i10];
                    objArr6[0] = e;
                    f.b.e("exception: %s", objArr6);
                    throw th2;
                }
            } catch (IOException e16) {
                e = e16;
                i10 = 1;
            }
        }
    }

    public static <LookupExtraT extends g.a> void i(k<LookupExtraT> kVar) {
        for (g.b bVar : kVar.m()) {
            bVar.b();
            kVar.o().merge(bVar.h(), bVar.g());
        }
    }

    public static <LookupExtraT extends g.a> LookupResult<IStatisticsMerge> j(m<LookupExtraT> mVar) {
        LookupResult<IStatisticsMerge> lookupResultH = h(mVar);
        f.b.b("LookupResult %s", lookupResultH.ipSet);
        if (f124373f != null) {
            DnsService.f fVar = (DnsService.f) f124373f;
            fVar.getClass();
            String str = mVar.f124394b;
            Statistics statistics = lookupResultH.stat;
            if (statistics instanceof StatisticsMerge) {
                LookupResult<StatisticsMerge> lookupResult = new LookupResult<>(lookupResultH.ipSet, (StatisticsMerge) statistics);
                if (!mVar.f124402j) {
                    fVar.f100936a.onLookedUp(str, lookupResult);
                } else if (3 == mVar.f124401i) {
                    fVar.f100936a.onPreLookedUp(str, lookupResult);
                } else {
                    fVar.f100936a.onAsyncLookedUp(str, lookupResult);
                }
            } else {
                f.b.b("Looked up for %s may be by LocalDns", str);
            }
        }
        return lookupResultH;
    }
}
