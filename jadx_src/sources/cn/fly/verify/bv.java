package cn.fly.verify;

import android.text.TextUtils;
import android.util.Base64;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class bv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f35905a = bq.a("009Ofi!gYfdeiedejfk@ek");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f35906b = bq.a("010Kfi9gVfdei4f!eh]k]ek'd<ed");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f35907c = bq.a("009Afi(g?fdei fQeh!heh");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f35908d = bq.a("010_fi*g!fdeigjZf)eh'heh");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f35909e = bq.a("011-fiGg?fdei_kk@eifkek$j,ed");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f35910f = bq.a("031<fi2g]fdeiCfg0fj@jWeieh-khEelOeIedeiKekkWei@edj-ejee:g<eiSjRejeg>g");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f35911g = bq.a("025Rfi.gVfdeiggehfgfg3gLek1gUedei_hKel>dej!ejelHf4eiegedij");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f35912h = bq.a("038IfiRgTfdeiCfg7fjXj>eieh4khPelKeZedeiggehfgfg4g;ekZg)edei)hCelGdejHejelYf0ei6jZejegIg");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f35913i = bq.a("014^ghejfgejeiPhe1gjMj-eiej;f9fgel");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f35914j = bq.a("018]fi9gJfdeighejfgejei%hDejgj%j=ei3ieBgjRi");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f35915k = bq.a("030Ofi_gVfdei7fg fj;jOeieh5kh'elVeZedeighejfgejeiOh!ejgjKjPeiFj5ejeg>g");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f35916l = bq.a("012Cfi%g=fdeigjghejZjdig)gj");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f35917m = bq.a("022.fi-gOfdeigjghej^jdigOgjeiNjMejeg<g*gj2je=egWk");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f35918n = bq.a("019CfiWg?fdeiAekkIeiWedjZejeeSg:eiLjAejeg1g");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f35919o = bq.a("012]fi?g?fdeiRdieffgh3gj");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static AtomicBoolean f35920p = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static AtomicBoolean f35921q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static bv f35922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private gl f35923s;

    private bv() {
        if (this.f35923s == null) {
            gl glVar = new gl(ax.g());
            this.f35923s = glVar;
            glVar.a("fvv_cms", 1);
        }
    }

    public static synchronized bv a() {
        if (f35922r == null) {
            f35922r = new bv();
        }
        return f35922r;
    }

    public static boolean b() {
        if (ax.g() == null) {
            return false;
        }
        if (gl.b(ax.g(), "fvv_cms", 1)) {
            return true;
        }
        boolean zA = gl.a(ax.g(), "fvv_cms", 1);
        if (zA) {
            return zA;
        }
        return go.a() || go.b();
    }

    public static void r() {
        if (f35920p.compareAndSet(false, true)) {
            new gv(bq.a("004Wgmjmilhg")) { // from class: cn.fly.verify.bv.1
                @Override // cn.fly.verify.gv
                protected void a() {
                    Object obj = ef.f36252i;
                    synchronized (obj) {
                        try {
                            obj.wait(600000L);
                            dx.a().a(11);
                            ConcurrentHashMap<String, Object> concurrentHashMapE = by.e();
                            if (concurrentHashMapE != null && concurrentHashMapE.size() > 0) {
                                dx.a().a(12);
                                Object obj2 = concurrentHashMapE.get(RXScreenCaptureService.KEY_HEIGHT);
                                Object obj3 = concurrentHashMapE.get("k");
                                Object obj4 = concurrentHashMapE.get(bq.a("001Pgg"));
                                Object obj5 = concurrentHashMapE.get(com.umeng.analytics.pro.ak.aB);
                                Object obj6 = concurrentHashMapE.get(bq.a("002df"));
                                Object obj7 = concurrentHashMapE.get(bq.a("002Pfg6f"));
                                concurrentHashMapE.clear();
                                cr.a(obj2, obj3, obj4, obj5, obj6, obj7);
                            }
                        } catch (Throwable th2) {
                            dx.a().a(3, th2);
                        }
                    }
                }
            }.start();
        }
        t();
    }

    private static String s() {
        return ga.b(fz.d.j());
    }

    private static void t() {
        if (f35921q.compareAndSet(false, true)) {
            new gv("DS-W") { // from class: cn.fly.verify.bv.2
                @Override // cn.fly.verify.gv
                protected void a() {
                    Object obj = ef.f36253j;
                    synchronized (obj) {
                        try {
                            obj.wait();
                            ConcurrentHashMap<String, Object> concurrentHashMapF = by.f();
                            ArrayList arrayList = (ArrayList) concurrentHashMapF.get(bq.a("002hj"));
                            concurrentHashMapF.clear();
                            cr.a((ArrayList<HashMap<String, Object>>) arrayList, new gq<Void>() { // from class: cn.fly.verify.bv.2.1
                                @Override // cn.fly.verify.gq
                                public void a(Void r10) {
                                }
                            });
                        } catch (Throwable th2) {
                            es.a().a(th2);
                        }
                    }
                }
            }.start();
        }
    }

    public Object a(String str) {
        return this.f35923s.i(str);
    }

    public void a(long j10) {
        a("key_fst_lnch_tm", j10);
    }

    public void a(ay.b bVar) {
        String strA = null;
        if (bVar != null) {
            try {
                strA = bVar.a();
            } catch (Throwable th2) {
                es.a().a(th2);
                return;
            }
        }
        a("key_duid_entity", Base64.encodeToString(ga.c(fz.d.j(), strA), 0));
    }

    public void a(ay.d dVar) {
        a("key_duid_param_blacklist", dVar != null ? dVar.a() : null);
    }

    public void a(String str, int i10) {
        this.f35923s.a(str, Integer.valueOf(i10));
    }

    public void a(String str, long j10) {
        this.f35923s.a(str, Long.valueOf(j10));
    }

    public void a(String str, Object obj) {
        this.f35923s.a(str, obj);
    }

    public void a(String str, String str2) {
        if (str2 == null) {
            this.f35923s.k(str);
        } else {
            this.f35923s.a(str, str2);
        }
    }

    public void a(ArrayList<String> arrayList) {
        a("key_chd_prx_dm", (arrayList == null || arrayList.isEmpty()) ? null : ge.a((Object) arrayList));
    }

    public void a(HashMap<Long, Long> map) {
        if (map == null || map.isEmpty()) {
            this.f35923s.k(f35918n);
            return;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<Long, Long> entry : map.entrySet()) {
            if (entry != null) {
                map2.put(String.valueOf(entry.getKey()), entry.getValue());
            }
        }
        this.f35923s.a(f35918n, ge.a(map2));
    }

    public int b(String str, int i10) {
        return this.f35923s.b(str, i10);
    }

    public long b(String str, long j10) {
        return this.f35923s.a(str, j10);
    }

    public String b(String str, String str2) {
        return this.f35923s.b(str, str2);
    }

    public void b(String str) {
        this.f35923s.k(str);
    }

    public void b(String str, Object obj) {
        this.f35923s.a(str, obj);
    }

    public void b(HashMap<String, HashMap<String, ArrayList<String>>> map) {
        a("key_chd_busi_dm", ge.a((HashMap) map));
    }

    public Object c(String str, Object obj) {
        return this.f35923s.b(str, obj);
    }

    public String c() {
        String strB = b(f35916l, (String) null);
        if (TextUtils.isEmpty(strB)) {
            return strB;
        }
        try {
            String strS = s();
            return ga.c(strS.getBytes("UTF-8"), Base64.decode(strB, 0));
        } catch (Throwable th2) {
            es.a().a(th2);
            return strB;
        }
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(ga.a(s(), str), 0);
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        a(f35916l, str);
    }

    public void c(HashMap<String, String> map) {
        a("key_ckd_busi_dm", ge.a((HashMap) map));
    }

    public String d() {
        String strB = b("key_gfrt", (String) null);
        if (TextUtils.isEmpty(strB)) {
            return strB;
        }
        try {
            String strS = s();
            return ga.c(strS.getBytes("UTF-8"), Base64.decode(strB, 0));
        } catch (Throwable th2) {
            es.a().a(th2);
            return strB;
        }
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = Base64.encodeToString(ga.a(s(), str), 0);
                a(f35917m, System.currentTimeMillis());
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        a("key_gfrt", str);
    }

    public void d(HashMap<String, Long> map) {
        a("key_dm_ck_tm", ge.a((HashMap) map));
    }

    public void e() {
        c((String) null);
        d((String) null);
    }

    public void e(String str) {
        a("key_chd_ak", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HashMap<Long, Long> f() {
        HashMap mapA;
        String strA = this.f35923s.a(f35918n);
        HashMap<Long, Long> map = new HashMap<>();
        if (!TextUtils.isEmpty(strA) && (mapA = ge.a(strA)) != null && !mapA.isEmpty()) {
            for (Map.Entry entry : mapA.entrySet()) {
                if (entry != null) {
                    map.put(Long.valueOf(Long.parseLong((String) entry.getKey())), entry.getValue());
                }
            }
        }
        return map;
    }

    public void f(String str) {
        a("key_chd_as", str);
    }

    public HashMap<String, Object> g() {
        String strB = b(f35919o, (String) null);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        return ge.a(strB);
    }

    public int h() {
        return b("key_mstrgy", 0);
    }

    public ay.d i() {
        return ay.d.a(b("key_duid_param_blacklist", (String) null));
    }

    public ay.b j() {
        try {
            String strB = b("key_duid_entity", (String) null);
            if (!TextUtils.isEmpty(strB)) {
                return ay.b.a(ga.a(fz.d.j(), Base64.decode(strB, 0)));
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return null;
    }

    public String k() {
        return b("key_chd_ak", (String) null);
    }

    public String l() {
        return b("key_chd_as", (String) null);
    }

    public HashMap<String, HashMap<String, ArrayList<String>>> m() {
        return ge.a(b("key_chd_busi_dm", (String) null));
    }

    public HashMap<String, String> n() {
        return ge.a(b("key_ckd_busi_dm", (String) null));
    }

    public ArrayList<String> o() {
        HashMap mapA = ge.a(b("key_chd_prx_dm", (String) null));
        return (mapA == null || mapA.isEmpty()) ? new ArrayList<>() : (ArrayList) mapA.get(bq.a("0082fgWe(fiKgh8ejgj8j"));
    }

    public HashMap<String, Long> p() {
        return ge.a(b("key_dm_ck_tm", (String) null));
    }

    public long q() {
        return b("key_fst_lnch_tm", 0L);
    }
}
