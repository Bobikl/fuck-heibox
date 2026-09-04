package com.tencent.msdk.dns.core.rest.share;

import a.a.a.a.d.p.d.c;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.utl.BaseMonitor;
import com.tencent.msdk.dns.DnsService;
import com.tencent.msdk.dns.core.LookupResult;
import com.tencent.msdk.dns.core.stat.AbsStatistics;
import com.xiaomi.mipush.sdk.Constants;
import f.b;
import java.io.Serializable;
import java.nio.channels.SelectionKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k.g;
import k.k;
import k.m;
import r.e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AbsRestDns implements g<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f100954a = new c(this);

    public static class Statistics extends AbsStatistics implements Serializable {
        public static final Statistics NOT_LOOKUP;
        private static final long serialVersionUID = 8621285648054627787L;
        public boolean asyncLookup;
        public boolean cached;
        public String clientIp;
        public int errorCode;
        public String errorMsg;
        public long expiredTime;
        public boolean hadPartCachedIps;
        public boolean netChangeLookup;
        public int retryTimes;
        public int statusCode;
        public transient Map<String, Integer> ttl;

        static {
            Statistics statistics = new Statistics();
            NOT_LOOKUP = statistics;
            statistics.errorCode = 1;
        }

        public Statistics() {
            this.hadPartCachedIps = false;
            this.errorCode = 2;
            this.errorMsg = " ";
            this.clientIp = "0";
            this.ttl = new HashMap();
            this.expiredTime = 0L;
            this.retryTimes = 0;
            this.cached = false;
            this.asyncLookup = false;
            this.netChangeLookup = false;
        }

        public Statistics(String[] strArr, String str, Map<String, Integer> map) {
            this.hadPartCachedIps = false;
            this.errorCode = 2;
            this.errorMsg = " ";
            this.clientIp = "0";
            this.ttl = new HashMap();
            this.expiredTime = 0L;
            this.retryTimes = 0;
            this.cached = false;
            this.asyncLookup = false;
            this.netChangeLookup = false;
            if (strArr == null) {
                throw new IllegalArgumentException("ips".concat(" can not be null"));
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("clientIp".concat(" can not be empty"));
            }
            if (map.isEmpty()) {
                throw new IllegalArgumentException(RemoteMessageConst.TTL.concat(" is invalid"));
            }
            this.ips = strArr;
            this.clientIp = str;
            this.ttl = map;
            this.expiredTime = getExpiredTime(map);
        }

        public long getExpiredTime(Map<String, Integer> map) {
            if (map.isEmpty()) {
                return 0L;
            }
            int iMin = 6000;
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = map.get(it.next()).intValue();
                HashMap<String, Integer> map2 = s.a.f139139d;
                if (!(iIntValue < 0)) {
                    iMin = Math.min(iIntValue, iMin);
                }
            }
            return SystemClock.elapsedRealtime() + (((long) iMin) * 1000);
        }

        @Override // com.tencent.msdk.dns.core.stat.AbsStatistics, k.g.c
        public boolean lookupPartCached() {
            return this.hadPartCachedIps;
        }

        @Override // com.tencent.msdk.dns.core.stat.AbsStatistics, k.g.c
        public boolean lookupSuccess() {
            return k.a.f124360a != this.ips;
        }

        public String toString() {
            return "Statistics{errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + "', statusCode=" + this.statusCode + ", clientIp='" + this.clientIp + "', ttl=" + this.ttl + ", expiredTime=" + this.expiredTime + ", retryTimes=" + this.retryTimes + ", cached=" + this.cached + ", asyncLookup=" + this.asyncLookup + ", netChangeLookup=" + this.netChangeLookup + ", ips=" + Arrays.toString(this.ips) + ", costTimeMills=" + this.costTimeMills + ", startLookupTimeMills=" + this.startLookupTimeMills + '}';
        }
    }

    public abstract class a implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f100955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k<e> f100956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f100957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public SelectionKey f100958d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Statistics f100959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final a f100960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<a> f100961g;

        /* JADX INFO: renamed from: com.tencent.msdk.dns.core.rest.share.AbsRestDns$a$a, reason: collision with other inner class name */
        public class C0974a implements g.b.a {
            public C0974a() {
            }

            public boolean a() {
                a aVar = a.this;
                SelectionKey selectionKey = aVar.f100958d;
                if (selectionKey == null) {
                    return 3 == aVar.f100955a;
                }
                if (selectionKey.isValid()) {
                    a aVar2 = a.this;
                    return 3 == aVar2.f100955a && aVar2.f100958d.isReadable();
                }
                a.this.b();
                return false;
            }

            public boolean b() {
                a aVar = a.this;
                SelectionKey selectionKey = aVar.f100958d;
                if (selectionKey == null) {
                    return 2 == aVar.f100955a;
                }
                if (selectionKey.isValid()) {
                    a aVar2 = a.this;
                    return 2 == aVar2.f100955a && aVar2.f100958d.isWritable();
                }
                a.this.b();
                return false;
            }
        }

        public a(k<e> kVar, g gVar, a aVar) {
            this.f100955a = 0;
            Statistics statistics = new Statistics();
            this.f100959e = statistics;
            this.f100961g = Collections.emptyList();
            if (kVar == null) {
                throw new IllegalArgumentException("lookupContext".concat(" can not be null"));
            }
            if (gVar == null) {
                throw new IllegalArgumentException(BaseMonitor.COUNT_POINT_DNS.concat(" can not be null"));
            }
            statistics.startLookup();
            statistics.retryTimes = kVar.a();
            statistics.asyncLookup = kVar.i();
            statistics.netChangeLookup = kVar.k();
            this.f100956b = kVar;
            this.f100957c = gVar;
            this.f100960f = aVar;
            if (kVar.i() || AbsRestDns.this.f100954a.d(kVar.j()) == null) {
                return;
            }
            this.f100955a = 3;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004f A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:16:0x0046, B:18:0x004a, B:22:0x0057, B:24:0x005f, B:25:0x0068, B:27:0x006e, B:28:0x0075, B:20:0x004f), top: B:42:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0057 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:16:0x0046, B:18:0x004a, B:22:0x0057, B:24:0x005f, B:25:0x0068, B:27:0x006e, B:28:0x0075, B:20:0x004f), top: B:42:0x0046 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x005f A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:16:0x0046, B:18:0x004a, B:22:0x0057, B:24:0x005f, B:25:0x0068, B:27:0x006e, B:28:0x0075, B:20:0x004f), top: B:42:0x0046 }] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // k.g.b
        public final String[] a() throws Throwable {
            if (3 != this.f100955a) {
                b.b("HttpDns(%d) mState is not readable", Integer.valueOf(this.f100957c.a().f124367b));
                return this.f100959e.ips;
            }
            s.a aVar = s.a.f139140e;
            m<LookupExtra> mVar = this.f100956b.f124382a;
            try {
                if (AbsRestDns.this.a(mVar, this.f100959e)) {
                    String[] strArr = this.f100959e.ips;
                    if (aVar != s.a.f139141f) {
                        b();
                        o();
                    }
                    return strArr;
                }
                s.a aVarN = n();
                if (aVarN != aVar) {
                    try {
                        if (aVarN == s.a.f139141f || aVarN.f139143b.length == 0) {
                            if (this.f100959e.statusCode != 200) {
                                AbsRestDns.this.f100954a.b(mVar.f124407o);
                            } else if (this.f100959e.statusCode == 401) {
                                AbsRestDns.this.f100954a.b(mVar.f124407o);
                            }
                        } else if (this.f100959e.statusCode == 401) {
                            AbsRestDns.this.f100954a.b(mVar.f124407o);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        aVar = aVarN;
                        if (aVar != s.a.f139141f) {
                            b();
                            o();
                        }
                        throw th;
                    }
                } else if (this.f100959e.statusCode != 200) {
                    AbsRestDns.this.f100954a.b(mVar.f124407o);
                } else if (this.f100959e.statusCode == 401) {
                    AbsRestDns.this.f100954a.b(mVar.f124407o);
                }
                if (this.f100959e.errorCode == 0) {
                    AbsRestDns.this.f100954a.c(mVar, aVarN);
                }
                Statistics statistics = this.f100959e;
                statistics.clientIp = aVarN.f139142a;
                Map<String, Integer> map = aVarN.f139144c;
                statistics.ttl = map;
                statistics.expiredTime = statistics.getExpiredTime(map);
                this.f100959e.ips = aVarN.f139143b;
                if (aVarN != s.a.f139141f) {
                    b();
                    o();
                }
                return b.a.s(this.f100959e.ips, mVar);
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // k.g.b
        public final void b() {
            if (4 == this.f100955a) {
                return;
            }
            this.f100955a = 4;
            this.f100959e.endLookup();
            l();
        }

        @Override // k.g.b
        public final void c() {
            if (2 != this.f100955a) {
                return;
            }
            try {
                if (m() == 2 || 4 == this.f100955a) {
                    return;
                }
                this.f100955a = 3;
            } catch (Throwable th2) {
                if (4 != this.f100955a) {
                    this.f100955a = 3;
                }
                throw th2;
            }
        }

        @Override // k.g.b
        public final boolean e() {
            return 4 == this.f100955a;
        }

        @Override // k.g.b
        public void f() {
            if (1 != this.f100955a) {
                return;
            }
            try {
                if (j() == 2 || 4 == this.f100955a) {
                    return;
                }
                this.f100955a = 2;
            } catch (Throwable th2) {
                if (4 != this.f100955a) {
                    this.f100955a = 2;
                }
                throw th2;
            }
        }

        @Override // k.g.b
        public g.c g() {
            return this.f100959e;
        }

        @Override // k.g.b
        public final g h() {
            return this.f100957c;
        }

        @Override // k.g.b
        public final g.b i() {
            a aVarK = k();
            if (Collections.emptyList() == this.f100961g) {
                this.f100961g = new ArrayList();
            }
            this.f100961g.add(aVarK);
            return aVarK;
        }

        public abstract int j();

        public abstract a k();

        public abstract void l();

        public abstract int m();

        public abstract s.a n();

        public final void o() {
            if (4 != this.f100955a) {
                return;
            }
            a aVar = this.f100960f;
            if (aVar != null) {
                aVar.b();
            }
            Iterator<a> it = this.f100961g.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    public boolean a(m<e> mVar, Statistics statistics) {
        String[] strArr;
        if (mVar == null) {
            throw new IllegalArgumentException("lookupParams".concat(" can not be empty"));
        }
        if (statistics == null) {
            throw new IllegalArgumentException("stat".concat(" can not be null"));
        }
        if (mVar.f124404l) {
            return false;
        }
        String[] strArrSplit = mVar.f124394b.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        String[] strArr2 = k.a.f124360a;
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int length = strArrSplit.length;
        int i10 = 1;
        int i11 = 0;
        boolean z10 = true;
        while (i11 < length) {
            String str = strArrSplit[i11];
            LookupResult lookupResultD = this.f100954a.d(str);
            if (lookupResultD != null) {
                String[] strArr3 = lookupResultD.ipSet.ips;
                if (b.a.q(strArr3)) {
                    strArr = strArrSplit;
                    sb2.append(str);
                    sb2.append(',');
                    z10 = false;
                } else {
                    if (strArrSplit.length > i10) {
                        int i12 = 0;
                        for (int length2 = strArr3.length; i12 < length2; length2 = length2) {
                            arrayList.add(str + ":" + strArr3[i12]);
                            i12++;
                            strArrSplit = strArrSplit;
                        }
                        strArr = strArrSplit;
                    } else {
                        strArr = strArrSplit;
                        strArr2 = strArr3;
                    }
                    Statistics statistics2 = (Statistics) lookupResultD.stat;
                    if (DnsService.getDnsConfig().useExpiredIpEnable && statistics2.expiredTime < SystemClock.elapsedRealtime()) {
                        sb2.append(str);
                        sb2.append(',');
                    }
                }
            } else {
                strArr = strArrSplit;
                sb2.append(str);
                sb2.append(',');
                z10 = false;
            }
            i11++;
            strArrSplit = strArr;
            i10 = 1;
        }
        StringBuilder sb3 = new StringBuilder(sb2.length() > 0 ? sb2.substring(0, sb2.length() - 1) : "");
        if (arrayList.size() > 0) {
            strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        HashMap map = new HashMap();
        map.put("requestHostname", sb3);
        map.put("ips", strArr2);
        map.put("cached", Boolean.valueOf(z10));
        String[] strArr4 = (String[]) map.get("ips");
        StringBuilder sb4 = (StringBuilder) map.get("requestHostname");
        boolean zBooleanValue = ((Boolean) map.get("cached")).booleanValue();
        statistics.ips = strArr4;
        if (DnsService.getDnsConfig().useExpiredIpEnable || sb4.length() > 0) {
            mVar.f124407o = sb4.toString();
        }
        if (!zBooleanValue) {
            if (strArr4.length > 0) {
                statistics.hadPartCachedIps = true;
            }
            return false;
        }
        statistics.cached = true;
        statistics.errorCode = 0;
        b.b("Lookup for %s, cache hit", mVar.f124394b);
        return true;
    }

    @Override // k.g
    public LookupResult b(m<e> mVar) {
        Statistics statistics = new Statistics();
        statistics.retryTimes = mVar.f124405m;
        statistics.asyncLookup = mVar.f124404l;
        statistics.netChangeLookup = mVar.f124406n;
        statistics.startLookup();
        a(mVar, statistics);
        statistics.endLookup();
        return new LookupResult(statistics.ips, statistics);
    }
}
