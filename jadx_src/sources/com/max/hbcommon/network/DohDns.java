package com.max.hbcommon.network;

import com.max.hbcommon.bean.DohDnsObj;
import com.max.hbmmkv.MMKVManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.umcrash.UMCrash;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import okhttp3.t;
import okhttp3.z;

/* JADX INFO: compiled from: DohDns.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nDohDns.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DohDns.kt\ncom/max/hbcommon/network/DohDns\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n1360#2:167\n1446#2,5:168\n1#3:173\n*S KotlinDebug\n*F\n+ 1 DohDns.kt\ncom/max/hbcommon/network/DohDns\n*L\n160#1:167\n160#1:168,5\n*E\n"})
public final class DohDns {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f68019b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f68020c = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f68021d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f68022e = 86400000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f68023f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final String f68024g = "DohDns";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final ArrayList<DohDnsObj> f68025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private static DohDns f68026i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private DohDnsObj f68027a;

    /* JADX INFO: compiled from: DohDns.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public final boolean a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31857jc, new Class[0], Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            MMKVManager mMKVManager = MMKVManager.f71329a;
            return mMKVManager.d(ad.c.f1243w, ad.c.f1245y, false, false) && mMKVManager.d(ad.c.f1243w, ad.c.f1244x, false, false);
        }

        public final int b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31756dc, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : DohDns.f68020c;
        }

        @dl.d
        public final ArrayList<DohDnsObj> c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31824hc, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : DohDns.f68025h;
        }

        @dl.d
        public final synchronized DohDns d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31841ic, new Class[0], DohDns.class);
            if (patchProxyResultProxy.isSupported) {
                return (DohDns) patchProxyResultProxy.result;
            }
            if (DohDns.f68026i == null) {
                DohDns.f68026i = new DohDns();
            }
            DohDns dohDns = DohDns.f68026i;
            f0.m(dohDns);
            return dohDns;
        }

        public final long e() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f31790fc, new Class[0], Long.TYPE);
            return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : DohDns.f68021d;
        }

        public final void f(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.e.f31773ec, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            DohDns.f68020c = i10;
        }

        public final void g(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, bb.c.e.f31807gc, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            DohDns.f68021d = j10;
        }
    }

    static {
        ArrayList<DohDnsObj> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("1.12.12.12");
        arrayList2.add("120.53.53.53");
        b2 b2Var = b2.f124493a;
        arrayList.add(new DohDnsObj("https://doh.pub/dns-query", arrayList2));
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add("223.5.5.5");
        arrayList3.add("223.6.6.6");
        arrayList.add(new DohDnsObj("https://dns.alidns.com/dns-query", arrayList3));
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add("123.6.48.18");
        arrayList4.add("112.65.69.15");
        arrayList4.add("101.199.254.118");
        arrayList.add(new DohDnsObj("https://doh.360.cn", arrayList4));
        f68025h = arrayList;
    }

    private final z i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Xb, new Class[0], z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : new z.a().f();
    }

    private final DohDnsObj j(List<DohDnsObj> list, String str) {
        Object next;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str}, this, changeQuickRedirect, false, bb.c.e.f31739cc, new Class[]{List.class, String.class}, DohDnsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DohDnsObj) patchProxyResultProxy.result;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((DohDnsObj) next).getIp_list().contains(str)) {
                return (DohDnsObj) next;
            }
        }
        next = null;
        return (DohDnsObj) next;
    }

    private final List<String> k(List<DohDnsObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.e.f31722bc, new Class[]{List.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            x.n0(arrayList, ((DohDnsObj) it.next()).getIp_list());
        }
        return arrayList;
    }

    private final String l(List<String> list, int i10, int i11, long j10) {
        Object[] objArr = {list, new Integer(i10), new Integer(i11), new Long(j10)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.Zb, new Class[]{List.class, cls, cls, Long.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : (String) kotlinx.coroutines.j.b(null, new DohDns$getFirstSuccessfulPing$1(j10, list, this, i10, i11, null), 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    @dl.e
    public final okhttp3.o h() {
        String strL;
        DohDnsObj dohDnsObjJ;
        String url;
        DohDnsObj dohDnsObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4196, new Class[0], okhttp3.o.class);
        if (patchProxyResultProxy.isSupported) {
            return (okhttp3.o) patchProxyResultProxy.result;
        }
        com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
        aVar.M("DohDns createDns " + com.max.hbutils.utils.k.p(this.f68027a));
        if (System.currentTimeMillis() - f68021d > 86400000 || (dohDnsObj = this.f68027a) == null) {
            ArrayList<DohDnsObj> arrayList = f68025h;
            strL = l(k(arrayList), 1, 1, 1200L);
            if (strL != null && (dohDnsObjJ = j(arrayList, strL)) != null && (url = dohDnsObjJ.getUrl()) != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(strL);
                b2 b2Var = b2.f124493a;
                this.f68027a = new DohDnsObj(url, arrayList2);
            }
            aVar.M("DohDns getFirstSuccessfulPing " + com.max.hbutils.utils.k.p(this.f68027a));
        } else {
            List<String> ip_list = dohDnsObj != null ? dohDnsObj.getIp_list() : null;
            if (ip_list == null || ip_list.isEmpty()) {
                ArrayList<DohDnsObj> arrayList3 = f68025h;
                strL = l(k(arrayList3), 1, 1, 1200L);
                if (strL != null) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(strL);
                    b2 b2Var2 = b2.f124493a;
                    this.f68027a = new DohDnsObj(url, arrayList4);
                }
                aVar.M("DohDns getFirstSuccessfulPing " + com.max.hbutils.utils.k.p(this.f68027a));
            }
        }
        List[] listArr = new List[1];
        DohDnsObj dohDnsObj2 = this.f68027a;
        listArr[0] = dohDnsObj2 != null ? dohDnsObj2.getIp_list() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            return null;
        }
        okhttp3.dnsoverhttps.b.a aVarD = new okhttp3.dnsoverhttps.b.a().d(i());
        t.Companion companion = t.INSTANCE;
        DohDnsObj dohDnsObj3 = this.f68027a;
        f0.m(dohDnsObj3);
        return aVarD.z(companion.h(dohDnsObj3.getUrl())).m(true).c();
    }

    public final boolean m(@dl.e String str, int i10, int i11) throws InterruptedException {
        Object[] objArr = {str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.e.f31705ac, new Class[]{String.class, cls, cls}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.max.heybox.hblog.g.a aVar = com.max.heybox.hblog.g.f74531b;
            aVar.M("DohDns ping before " + str + "  " + jCurrentTimeMillis);
            int iWaitFor = Runtime.getRuntime().exec("/system/bin/ping -c " + i10 + " -w " + i11 + ' ' + str).waitFor();
            aVar.M("DohDns ping receive " + str + " status== " + iWaitFor + " time =" + System.currentTimeMillis() + "  cost= " + (System.currentTimeMillis() - jCurrentTimeMillis));
            return iWaitFor == 0;
        } catch (IOException e10) {
            com.max.heybox.hblog.g.a aVar2 = com.max.heybox.hblog.g.f74531b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DohDns ");
            String message = e10.getMessage();
            if (message == null) {
                message = "error";
            }
            sb2.append(message);
            aVar2.v(sb2.toString());
            UMCrash.generateCustomLog(e10, "host ping exception");
            return false;
        }
    }
}
