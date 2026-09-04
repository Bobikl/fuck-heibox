package cn.fly.verify;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class by {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicBoolean f35937b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f35938c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f35939d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile HashMap<String, Object> f35940e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f35941f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, Object> f35942g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static CountDownLatch f35943h = new CountDownLatch(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static CountDownLatch f35944i = new CountDownLatch(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile boolean f35936a = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile boolean f35945j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final AtomicBoolean f35946k = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static volatile boolean f35947l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile AtomicBoolean f35948m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AtomicInteger f35949n = new AtomicInteger(3);

    public static <T> T a(String str, T t10) {
        if (TextUtils.isEmpty(str) || f35940e == null || !az.a().j()) {
            return t10;
        }
        if (b(f35940e)) {
            f35940e.clear();
            f35940e = new HashMap<>();
            c(2);
        }
        return (T) gj.a(f35940e.get(str), t10);
    }

    private static <T> T a(HashMap<String, Object> map, String str, T t10) {
        return (TextUtils.isEmpty(str) || b(map) || !a(map)) ? t10 : (T) gj.a(map.get(str), t10);
    }

    private static void a(HashMap<String, Object> map, HashMap<String, Object> map2, HashMap<String, Object> map3, HashMap<String, Object> map4, HashMap<String, Object> map5, Integer num, CountDownLatch countDownLatch) {
        if (num != null && num.intValue() == 2) {
            fl.f36580b.set(Boolean.FALSE);
            try {
                countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
                es.a().a("dhs wt geot.2 ovr", new Object[0]);
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        boolean zA = dz.a().a(true);
        dz.a().c().put(ei.a("006fMdfdhdj)f[fi"), Boolean.valueOf(zA));
        if (map3 != null && map3.size() > 0 && !zA) {
            es.a().a("dhs em dg", new Object[0]);
            map2.clear();
            map2.putAll(map);
            map2.putAll(map3);
            return;
        }
        if (map4 == null || map4.size() <= 0 || dz.a().a(map5)) {
            map2.remove(ei.a("0026ej7j"));
            map2.remove(ei.a("002fGdf"));
        } else {
            es.a().a("dhs gpe dg", new Object[0]);
            map2.clear();
            map2.putAll(map);
            map2.putAll(map4);
        }
    }

    private static void a(HashMap<String, Object> map, boolean z10) {
        CountDownLatch countDownLatch;
        f35940e = new HashMap<>();
        if (map != null) {
            f35940e.putAll(map);
        }
        try {
            if (z10) {
                f35943h.countDown();
                countDownLatch = f35944i;
            } else {
                countDownLatch = f35943h;
            }
            countDownLatch.countDown();
        } catch (Throwable unused) {
        }
    }

    public static void a(CountDownLatch countDownLatch) {
        b(countDownLatch);
    }

    private static void a(final boolean z10, final boolean z11, final boolean z12, final int i10) {
        new gv("PY-B" + i10) { // from class: cn.fly.verify.by.3
            @Override // cn.fly.verify.gv
            protected void a() {
                es.a().a("b enter:" + Process.myPid() + ", lbms: " + by.f35945j + ", fc" + z10 + ", ol: " + z11 + ", gf: " + z12 + ", in: " + i10, new Object[0]);
                if (!by.f35945j) {
                    es.a().a("b lk st: " + Process.myPid(), new Object[0]);
                    ef.a(ef.a(ef.f36249f), new ee() { // from class: cn.fly.verify.by.3.1
                        @Override // cn.fly.verify.ee
                        public boolean a(gb gbVar) {
                            boolean unused = by.f35945j = true;
                            es.a().a("b lk: " + Process.myPid() + ", proc st", new Object[0]);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            by.c(z11);
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            if (!z10 || z12) {
                                by.b(i10);
                            }
                            es.a().a("b lk: " + Process.myPid() + ", proc ed, dur: " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", release: n", new Object[0]);
                            Looper.prepare();
                            Looper.loop();
                            return true;
                        }
                    });
                    return;
                }
                es.a().a("b lked already: " + Process.myPid(), new Object[0]);
                by.c(z11);
                if (!z10 || z12) {
                    by.b(i10);
                }
            }
        }.start();
    }

    private static void a(String... strArr) {
        File filesDir = ax.g().getFilesDir();
        for (String str : strArr) {
            try {
                el.a(new File(filesDir, str));
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
    }

    public static boolean a() {
        return ((Integer) a(ei.a("002iSdk"), 0)).intValue() == 0;
    }

    public static boolean a(String str) {
        return !TextUtils.isEmpty(str) && a() && b() && ((Integer) a(str, 0)).intValue() != 0;
    }

    private static boolean a(HashMap<String, Object> map) {
        return map == null || ((Integer) gj.a(map.get(ei.a("002i.dk")), 0)).intValue() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static gu b(final String str, final int i10) {
        return new gu() { // from class: cn.fly.verify.by.4
            @Override // cn.fly.verify.gu
            protected void a() {
                fl.f36580b.set(Boolean.TRUE);
                if (!TextUtils.isEmpty("M-")) {
                    Thread.currentThread().setName("M-" + str);
                }
                by.b(new gq<HashMap<String, Object>>() { // from class: cn.fly.verify.by.4.1
                    @Override // cn.fly.verify.gq
                    public void a(HashMap<String, Object> map) {
                        try {
                            by.b(map, i10);
                            if (map == null) {
                                bq bqVarA = bq.a();
                                AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                                bqVarA.e(300000L, by.b(str, i10));
                            }
                        } finally {
                            by.f35939d.set(false);
                        }
                    }
                });
                fl.f36580b.set(Boolean.FALSE);
            }
        };
    }

    public static <T> T b(String str, T t10) {
        if (TextUtils.isEmpty(str)) {
            return t10;
        }
        return (T) a(f35940e != null ? f35940e : ge.a(bv.a().c()), str, t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashMap<String, Object> b(fz.b bVar) {
        try {
            String strC = fz.d.c();
            String strA = ek.a();
            HashMap<String, String> map = new HashMap<>();
            map.put(ei.a("003Peh!fGec"), strA);
            map.put(ei.a("0137ekfi[f:djhkeedc9fei7di:i-ec"), bu.f());
            map.put(ei.a("004?dfdkdidc"), bVar.B());
            HashMap<String, Object> mapA = ek.a(bVar.h());
            mapA.put(ei.a("002iSfi"), String.valueOf(System.currentTimeMillis()));
            int i10 = 1;
            mapA.put("nbs", 1);
            int i11 = ax.i();
            if (i11 != -1) {
                mapA.put(ei.a("0092dififdejdjEff?glVj"), String.valueOf(i11 == 1));
            }
            String strA2 = ei.a("002]ddhh");
            if (!ax.c()) {
                i10 = -1;
            }
            mapA.put(strA2, String.valueOf(i10));
            mapA.put("ait", Long.valueOf(bv.a().q()));
            String strB = du.b();
            if (!TextUtils.isEmpty(strB)) {
                mapA.put("psid", strB + strC);
            }
            String strA3 = new fu().a(dy.a().a("gcfg") + "/v6/gcf", mapA, map);
            HashMap mapA2 = ge.a(strA3);
            if (mapA2.isEmpty()) {
                return null;
            }
            if (!"200".equals(String.valueOf(mapA2.get(ei.a("006)fiRidiCdgfi"))))) {
                throw new Throwable("RS is illegal: " + strA3);
            }
            byte[] bArrE = ga.e((strA + ":" + strC + ":" + mapA2.get(ei.a("009iKdidfUfKfi_id(dfZj"))).getBytes("utf-8"));
            String str = (String) gj.a(mapA2.get(ei.a("002ZfiJc")));
            if (str == null) {
                throw new Throwable("RS is illegal: " + strA3);
            }
            String str2 = new String(ga.b(bArrE, Base64.decode(str, 2)), "utf-8");
            es.a().a("sw: " + str2, new Object[0]);
            HashMap<String, Object> mapA3 = ge.a(str2);
            if (!mapA3.isEmpty()) {
                mapA3.put(ei.a("010?dcUf+dddiHcf,fcdidfFf"), Long.valueOf(SystemClock.elapsedRealtime()));
                bv.a().d(ge.a((HashMap) mapA3));
                return mapA3;
            }
            throw new Throwable("RS is illegal: " + strA3);
        } catch (Throwable th2) {
            es.a().b(th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i10) {
        es.a().a("b ob st", new Object[0]);
        if (!a() || !b()) {
            if (i10 == 3 || en.b()) {
                p();
            }
            o();
            return;
        }
        final String str = (String) a(ei.a("003SefIec"), (Object) null);
        if (TextUtils.isEmpty(str)) {
            if (i10 == 3 || en.b()) {
                p();
            }
            o();
        } else if (i10 == 3 || f35937b.compareAndSet(false, true)) {
            new gv(ei.a("003Aflilhk") + i10) { // from class: cn.fly.verify.by.1
                @Override // cn.fly.verify.gv
                protected void a() {
                    ef.a(ef.a(ef.f36247d), false, new ee() { // from class: cn.fly.verify.by.1.1
                        @Override // cn.fly.verify.ee
                        public boolean a(gb gbVar) {
                            synchronized (by.f35941f) {
                                by.d(str);
                            }
                            return false;
                        }
                    });
                }
            }.start();
        }
        if (!a() || !b()) {
            q();
            n();
            return;
        }
        final String str2 = (String) a("sbr", (Object) null);
        if (TextUtils.isEmpty(str2)) {
            n();
            q();
        } else if (i10 == 3 || f35938c.compareAndSet(false, true)) {
            new gv("DS-" + i10) { // from class: cn.fly.verify.by.2
                @Override // cn.fly.verify.gv
                protected void a() {
                    ef.a(ef.a(ef.f36248e), false, new ee() { // from class: cn.fly.verify.by.2.1
                        @Override // cn.fly.verify.ee
                        public boolean a(gb gbVar) {
                            synchronized (by.f35942g) {
                                by.e(str2);
                            }
                            return false;
                        }
                    });
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final gq<HashMap<String, Object>> gqVar) {
        fl.f36580b.set(Boolean.TRUE);
        fz.a(ax.g()).h().C().a(new fz.a() { // from class: cn.fly.verify.by.5
            @Override // cn.fly.verify.fz.a
            public void a(fz.b bVar) {
                fl.f36580b.set(Boolean.TRUE);
                try {
                    HashMap mapB = by.b(bVar);
                    long j10 = 1;
                    while (by.f35949n.get() > 0 && (mapB == null || mapB.isEmpty())) {
                        try {
                            Thread.sleep(1000 * j10);
                        } catch (Throwable th2) {
                            es.a().a(th2);
                        }
                        mapB = by.b(bVar);
                        if (mapB == null || mapB.isEmpty()) {
                            by.f35949n.getAndDecrement();
                            j10 *= 2;
                        }
                    }
                    gqVar.a(mapB);
                } catch (Throwable th3) {
                    es.a().a(th3);
                    gqVar.a(null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(HashMap<String, Object> map, int i10) {
        if (map == null) {
            HashMap<String, Object> mapA = ge.a(bv.a().d());
            if (!b(mapA)) {
                map = mapA;
            }
            bv.a().e();
        }
        CountDownLatch countDownLatchA = null;
        if (map != null && !map.isEmpty()) {
            countDownLatchA = c(map);
        }
        a(map, true);
        fl.f36580b.set(Boolean.FALSE);
        if (((Integer) a("dm", 1)).intValue() == 1 && f35948m.compareAndSet(false, true)) {
            dy.a().b();
        }
        if (!f35947l) {
            s();
        }
        if (countDownLatchA == null) {
            countDownLatchA = fd.a(ax.g()).a();
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            es.a().a("ge dhs_w cdl: " + countDownLatchA, new Object[0]);
            countDownLatchA.await(3500L, TimeUnit.MILLISECONDS);
            es.a().a("ge dhs_w end, dur: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        a(false, true, true, i10);
    }

    private static void b(CountDownLatch countDownLatch) {
        HashMap mapA = ge.a(bv.a().c());
        if (b((HashMap<String, Object>) mapA)) {
            bv.a().c((String) null);
            mapA = null;
        }
        if (a()) {
            a((HashMap<String, Object>) mapA, false);
            if (mapA == null || mapA.isEmpty()) {
                es.a().a("g ch: n", new Object[0]);
                c(1);
                return;
            }
            es.a().a("g ch: y", new Object[0]);
            boolean z10 = System.currentTimeMillis() - bv.a().b(bv.f35917m, 0L) < 2000;
            es.a().a("g ch fre: " + z10, new Object[0]);
            if (!z10) {
                c(2);
            }
            if (countDownLatch != null) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    es.a().a("g dhs_w cdl: " + countDownLatch, new Object[0]);
                    countDownLatch.await(3500L, TimeUnit.MILLISECONDS);
                    es.a().a("g dhs_w end, dur: " + (System.currentTimeMillis() - jCurrentTimeMillis), new Object[0]);
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
            a(true, false, z10, 2);
        }
    }

    public static boolean b() {
        return ((Integer) a(ei.a("004c^dk.ee"), 0)).intValue() == 1;
    }

    private static boolean b(HashMap<String, Object> map) {
        if (map != null) {
            long jLongValue = ((Long) gj.a(map.get(ei.a("010%dcLf.dddiLcfMfcdidf1f")), 0L)).longValue();
            long jIntValue = ((long) ((Integer) gj.a(map.get(ei.a("004(djejEc'ef")), 86400)).intValue()) * 1000;
            if (jLongValue != 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jIntValue > 0) {
                    return jCurrentTimeMillis - jLongValue >= jIntValue;
                }
                if (jIntValue == 0) {
                    return jCurrentTimeMillis - jLongValue >= 86400000;
                }
                return !el.a(jCurrentTimeMillis, jLongValue);
            }
        }
        return false;
    }

    private static CountDownLatch c(HashMap<String, Object> map) {
        CountDownLatch countDownLatch;
        String str = (String) gj.a(map.get(ei.a("002Ofifi")), (Object) null);
        CountDownLatch countDownLatchA = fd.a(ax.g()).a(str);
        try {
            HashMap<String, Object> map2 = (HashMap) map.get(ei.a("002f3df"));
            countDownLatch = countDownLatchA;
            try {
                String str2 = (String) gj.a(map.get(ei.a("002cGdc")), ei.a("0068hehehfhfhfhf"));
                long jLongValue = ((Long) gj.a(map.get(ei.a("004fcf]ei")), 5L)).longValue();
                HashMap<String, Object> map3 = (HashMap) map.get(ei.a("0024ej$j"));
                HashMap map4 = (HashMap) map.get(ei.a("004Xej[jc'dc"));
                Integer num = (Integer) map.get(ei.a("004Rej*f@dk*i"));
                HashMap map5 = new HashMap();
                map5.put(ei.a("002@dk4h"), map.get(ei.a("002@dk4h")));
                map5.put(ei.a("002Wfifi"), str);
                map5.put(ei.a("002f,df"), map2);
                map5.put(ei.a("002cGdc"), str2);
                map5.put(ei.a("004fcf9ei"), Long.valueOf(jLongValue));
                map5.put(ei.a("004Qej_fAdk:i"), num);
                map5.put(ei.a("003?djdidc"), gj.a(map.get(ei.a("003?djdidc")), (Object) null));
                map5.put(ei.a("0030fidk'c"), map.get(ei.a("0030fidk'c")));
                map5.put(ei.a("003Ifidi:i"), map.get(ei.a("003Ifidi:i")));
                map5.put("aps", map.get("aps"));
                map5.put(ei.a("005WfiCgUdi-i-fi"), map.get(ei.a("005WfiCgUdi-i-fi")));
                map5.put(ei.a("003=djOji"), map.get(ei.a("003=djOji")));
                map5.put("ndi", map.get("ndi"));
                map5.put("dm", map.get("dm"));
                map5.put("sti", map.get("sti"));
                map5.put(ei.a("004'djej4cOef"), gj.a(map.get(ei.a("004'djej4cOef")), 86400));
                if ((map2 != null && map2.size() > 0 && !TextUtils.isEmpty(str2)) || (map3 != null && map3.size() > 0 && map4 != null && map4.size() > 0)) {
                    a(map5, map, map2, map3, map4, num, countDownLatch);
                    dz.a().a(map, map2, map3);
                }
                map.put(ei.a("0100dc8fWdddiMcfHfcdidfMf"), Long.valueOf(System.currentTimeMillis()));
                bv.a().c(ge.a((HashMap) map));
                r();
            } catch (Throwable th2) {
                th = th2;
                es.a().a(th);
            }
        } catch (Throwable th3) {
            th = th3;
            countDownLatch = countDownLatchA;
        }
        return countDownLatch;
    }

    private static void c(int i10) {
        if (f35939d.compareAndSet(false, true)) {
            String str = String.format(ei.a("005Oedgchkjkfi"), Integer.valueOf(i10));
            if (i10 == 2) {
                ep.f36340c.execute(b(str, i10));
            } else {
                b(str, i10).run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(boolean z10) {
        if (b()) {
            es.a().a("b db st", new Object[0]);
            du.a((bd) null);
            if (z10) {
                bi.a().b();
            }
        }
    }

    public static boolean c() {
        return (((Integer) a(ei.a("002e0dj"), 0)).intValue() == 1) || en.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str) {
        File file = null;
        Closeable closeable = null;
        Closeable closeable2 = null;
        try {
            dx.a().a(0);
            String strB = el.b(str);
            File file2 = new File(ax.g().getFilesDir(), ei.a("003SfiKcc"));
            try {
                if (!dz.a().b()) {
                    dx.a().a(18);
                    o();
                    return;
                }
                if (TextUtils.isEmpty(strB)) {
                    dx.a().a(1);
                    return;
                }
                try {
                    if (!c()) {
                        p();
                        return;
                    }
                    dx.a().a(2);
                    HashMap map = (HashMap) new ft(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").a(ek.d(), strB, false);
                    dx.a().a(3);
                    String str2 = (String) map.get(ei.a("0022ef;g"));
                    String str3 = (String) map.get("m");
                    Boolean bool = (Boolean) map.get(ei.a("002d$fi"));
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    String str4 = (String) map.get(ei.a("002d+eh"));
                    String str5 = (String) map.get(ei.a("002ce"));
                    String str6 = (String) map.get(ei.a("002%ef-e"));
                    if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str4)) {
                        dx.a().a(4);
                        gj.a(file2);
                    } else {
                        synchronized (ef.f36252i) {
                            f35941f.clear();
                            f35941f.put(RXScreenCaptureService.KEY_HEIGHT, str3);
                            f35941f.put("k", str4);
                            f35941f.put(ei.a("002ce"), str5);
                            f35941f.put(ei.a("002!efNe"), str6);
                            String strA = ft.a(str2);
                            if (zBooleanValue) {
                                dx.a().a(5);
                                File file3 = new File(file2, ei.a("008cXdk)e7efdlfiOcc"));
                                if (!file3.exists() || !str3.equals(ga.a(file3))) {
                                    dx.a().a(6);
                                    gj.a(file2);
                                    file2.mkdirs();
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            new fu().a(strA, fileOutputStream, (fu.a) null);
                                            dx.a().a(7);
                                            el.a(fileOutputStream);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            closeable = fileOutputStream;
                                            el.a(closeable);
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            } else {
                                dx.a().a(8);
                                gj.a(file2);
                                final byte[][] bArr = new byte[1][];
                                final int[] iArr = new int[1];
                                try {
                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream() { // from class: cn.fly.verify.by.6
                                        @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                                        public void close() throws IOException {
                                            super.close();
                                            bArr[0] = ((ByteArrayOutputStream) this).buf;
                                            iArr[0] = ((ByteArrayOutputStream) this).count;
                                        }
                                    };
                                    try {
                                        new fu().a(strA, byteArrayOutputStream, (fu.a) null);
                                        dx.a().a(9);
                                        el.a(byteArrayOutputStream);
                                        f35941f.put(ei.a("001Sff"), bArr[0]);
                                        f35941f.put(com.umeng.analytics.pro.ak.aB, Integer.valueOf(iArr[0]));
                                    } catch (Throwable th4) {
                                        th = th4;
                                        closeable2 = byteArrayOutputStream;
                                        el.a(closeable2);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    }
                    p();
                } catch (Throwable th6) {
                    p();
                    throw th6;
                }
            } catch (Throwable th7) {
                th = th7;
                file = file2;
                gj.a(file);
                dx.a().a(2, th);
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public static boolean d() {
        return c();
    }

    public static ConcurrentHashMap<String, Object> e() {
        return f35941f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(String str) {
        Throwable th2;
        File file;
        try {
            String strB = el.b(str);
            file = new File(ax.g().getFilesDir(), ei.a("003Ffiff.g"));
            try {
                File file2 = new File(ax.g().getFilesDir(), ei.a("0070dldjfi@g*ffdjAc"));
                if (!dz.a().b()) {
                    gj.a(file);
                    gj.a(file2);
                } else {
                    if (!TextUtils.isEmpty(strB)) {
                        if (!c()) {
                            q();
                            return;
                        }
                        HashMap<String, Object> mapD = ek.d();
                        mapD.put(ei.a("007,dd2fCdjfididkJe"), String.valueOf(cs.a()));
                        ArrayList arrayList = (ArrayList) ((HashMap) new ft(1024, "9e87e8d4b8f52f2916d0fb4342aa6b54a81a05666d0bdb23cc5ebf3a07440bc3976adff1ce11c64ddcdbfc017920648217196d51e3165e780e58b5460c525ee9", "13bda4b87eb42ab9e64e6b4f3d17cf8005a4ae94af37bc9fd76ebd91a828f017c81bd63cbe2924e361e20003b9e5f47cdac1f5fba5fca05730a32c5c65869590287207e79a604a2aac429e55f0d35c211367bd226dd5e57df7810f036071854aa1061a0f34b418b9178895a531107c652a428cfa6ecfa65333580ae7e0edf0e1").b(false, ft.a(), mapD, strB, true)).get(ei.a("004gNdifiLi"));
                        if (arrayList != null && !arrayList.isEmpty()) {
                            synchronized (ef.f36253j) {
                                f35942g.clear();
                                f35942g.put(ei.a("002gi"), arrayList);
                            }
                        }
                        gj.a(file);
                        gj.a(file2);
                        q();
                        return;
                    }
                    gj.a(file);
                }
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    dw.a().a(9, -1, th2, "-1");
                    gj.a(file);
                } finally {
                    q();
                }
            }
        } catch (Throwable th4) {
            th2 = th4;
            file = null;
        }
    }

    public static ConcurrentHashMap<String, Object> f() {
        return f35942g;
    }

    public static ArrayList<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ei.a("004_eleleefl"));
        arrayList.add(ei.a("005Ifjeleleefl"));
        arrayList.add(ei.a("005gf(dd+fg"));
        arrayList.add(ei.a("009:efdj;fIdedgEfec+ec"));
        arrayList.add(ei.a("010Tdhdhdh-cWdgdjeddkTee"));
        return (ArrayList) a(ei.a("004Afgdifi1c"), arrayList);
    }

    public static void h() {
        if (a()) {
            c(3);
        }
    }

    private static void n() {
        a(ei.a("003)fiff+g"), ei.a("007Zdldjfi.gNffdjPc"));
    }

    private static void o() {
        a(ei.a("003Mfi)cc"), ei.a("0093hcdkffBl9dldfdfVcc"), ei.a("016ShcdkffJlc7dkdfdf]lHdcfffi?l;dfdc.c"), ei.a("005Khcdgfl1gEdd"), ei.a("0126dleh5iXhfhhhdikhehiikfhhd"));
    }

    private static void p() {
        Object obj = ef.f36252i;
        synchronized (obj) {
            dx.a().a(10);
            obj.notifyAll();
        }
    }

    private static void q() {
        Object obj = ef.f36253j;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    private static void r() {
        gt.a().a(ei.a("004Kdk=d didc"), (Integer) 1);
        gt.a().a(ei.a("003dgg"), (Integer) 1);
        gt.a().a(ei.a("003g.dkVc"), (Integer) 1);
        gt.a().a(ei.a("002)fgdi"), (Integer) 1);
        gt.a().a(ei.a("002Ifffi"), (Integer) 1);
    }

    private static void s() {
        if (en.h()) {
            f35946k.compareAndSet(false, true);
        }
    }
}
