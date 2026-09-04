package cn.fly.verify;

import android.os.Process;
import android.text.TextUtils;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public class en {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f36307a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static AtomicInteger f36308b = new AtomicInteger(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static AtomicBoolean f36309c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AtomicBoolean f36310d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static em f36311e = new em();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile String f36312f;

    public static void a(final CountDownLatch countDownLatch) {
        if (f36309c.compareAndSet(false, true)) {
            if (bv.a().q() == 0) {
                bv.a().a(System.currentTimeMillis());
            }
            eh.a(ax.g());
            k();
            l();
            bu.a();
            eg.a().b();
            new gv("PY-C") { // from class: cn.fly.verify.en.2
                @Override // cn.fly.verify.gv
                protected void a() {
                    fl.f36580b.set(Boolean.TRUE);
                    es.a().a("g lk st: " + Process.myPid(), new Object[0]);
                    boolean zA = ef.a(ef.a(ef.f36250g), new ee() { // from class: cn.fly.verify.en.2.1
                        @Override // cn.fly.verify.ee
                        public boolean a(gb gbVar) {
                            es.a().a("g lk pd: " + Process.myPid() + ", proc st", new Object[0]);
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            bv.r();
                            by.a(countDownLatch);
                            es.a().a("g lk pd: " + Process.myPid() + ", proc ed, dur: " + (System.currentTimeMillis() - jCurrentTimeMillis) + ", release: y", new Object[0]);
                            return false;
                        }
                    });
                    es.a().a("g lk res: " + zA + Process.myPid(), new Object[0]);
                    fl.f36580b.set(Boolean.FALSE);
                }
            }.start();
        }
    }

    public static void a(final boolean z10) {
        ep.f36340c.execute(new gu() { // from class: cn.fly.verify.en.1
            @Override // cn.fly.verify.gu
            protected void a() {
                fl.f36580b.set(Boolean.TRUE);
                ez.a();
                if (!TextUtils.isEmpty("M-")) {
                    Thread.currentThread().setName("M-" + ei.a("004%glilhkhf"));
                }
                int iB = bv.b() ? bv.a().b(bv.f35909e, -1) : -1;
                if (en.f36308b.get() == -1) {
                    en.f36308b.set(iB);
                }
                if (en.f36308b.get() == 1) {
                    en.b(true, z10);
                } else {
                    en.b(false, z10);
                }
                fn fnVarA = es.a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z10 ? ei.a("002(dj4f") : "");
                sb2.append("init cfg over. py ");
                sb2.append(en.f36308b.get());
                fnVarA.a(sb2.toString(), new Object[0]);
                fl.f36580b.set(Boolean.FALSE);
            }
        });
    }

    public static boolean a() {
        return f36307a;
    }

    public static void b(final boolean z10) {
        f36308b.set(z10 ? 1 : 0);
        es.a().a("submit py: " + z10, new Object[0]);
        new gv(ei.a("004^glilhkhe")) { // from class: cn.fly.verify.en.4
            @Override // cn.fly.verify.gv
            protected void a() {
                int iE = en.e();
                bv.a().a(bv.f35909e, z10 ? 1 : 0);
                if (!z10 || iE == 1) {
                    return;
                }
                CountDownLatch countDownLatchG = en.g();
                es.a().a(fz.d.b() ? "main" : "sub", new Object[0]);
                en.a(countDownLatchG);
                fz.a(ax.g()).h().a(new fz.a() { // from class: cn.fly.verify.en.4.1
                    @Override // cn.fly.verify.fz.a
                    public void a(fz.b bVar) {
                        try {
                            en.b(z10, bVar.h());
                        } catch (Throwable th2) {
                            es.a().a(th2);
                            try {
                                en.b(z10, bVar.h());
                            } catch (Throwable th3) {
                                es.a().a(th3);
                            }
                        }
                    }
                });
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z10, String str) throws Throwable {
        HashMap<String, Object> mapA = ek.a(str);
        mapA.put(ei.a("009_dififdejdj:ff5glEj"), String.valueOf(z10));
        String str2 = dy.a().a("gclg") + ei.a("036lj6djdiddMdc@ec?ljXdk.g2di+c@ec^ld=dgKihWdkdjdigd)diQdidk.el$fiIidiVdgfi");
        HashMap<String, String> map = new HashMap<>();
        map.put(ei.a("003$ehAf9ec"), ek.a());
        map.put(ei.a("013RekfiCfGdjhkeedc^fei5diPi,ec"), bu.f());
        String strA = new fu().a(str2, mapA, map);
        es.a().a("RS sp: " + strA, new Object[0]);
        HashMap mapA2 = ge.a(strA);
        if (mapA2 == null) {
            throw new Throwable("RS is illegal: " + strA);
        }
        if ("200".equals(String.valueOf(mapA2.get(ei.a("004cPdkdc_f"))))) {
            return;
        }
        throw new Throwable("RS code is not 200: " + strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(boolean z10, boolean z11) {
        if (!z11) {
            f36311e.a();
        }
        if (!z10) {
            if (z11) {
                return;
            }
            f36311e.b();
            return;
        }
        if (TextUtils.isEmpty(eh.f36277a)) {
            String strK = bv.a().k();
            if (TextUtils.isEmpty(strK)) {
                strK = i();
            }
            if (!TextUtils.isEmpty(strK)) {
                eh.f36279c = strK;
                bv.a().e(strK);
            }
        } else {
            eh.f36279c = eh.f36277a;
            bv.a().e(eh.f36277a);
        }
        if (TextUtils.isEmpty(eh.f36278b)) {
            String strL = bv.a().l();
            if (!TextUtils.isEmpty(strL)) {
                eh.f36280d = strL;
            }
        } else {
            eh.f36280d = eh.f36278b;
            bv.a().f(eh.f36278b);
        }
        CountDownLatch countDownLatchG = g();
        es.a().a(fz.d.b() ? "main" : "sub", new Object[0]);
        if (!z11) {
            a(countDownLatchG);
        } else {
            bu.a();
            by.h();
        }
    }

    public static boolean b() {
        return f36308b.get() == 1;
    }

    public static int c() {
        es.a().a("get py grtd status mem: " + f36308b.get(), new Object[0]);
        return f36308b.get();
    }

    public static int d() {
        int iC = c();
        return iC != -1 ? iC : e();
    }

    public static int e() {
        int iB = bv.b() ? bv.a().b(bv.f35909e, -1) : -1;
        es.a().a("get py grtd status cac: " + iB, new Object[0]);
        return iB;
    }

    public static String f() {
        return "ecpgnjvr<1fxsowaktq0{EKhPmziWUVCNdy2uDJFH|LYZQGTXRO:43l87;/6MI>\"@A?\\9[)_]5=.(S'~盺朼-";
    }

    public static CountDownLatch g() {
        return !f36310d.getAndSet(true) ? fc.a(ax.g()).a() : new CountDownLatch(0);
    }

    public static boolean h() {
        String strA = ek.a();
        return (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strA.trim()) || TextUtils.equals(strA, i())) ? false : true;
    }

    public static String i() {
        if (f36312f == null) {
            String strSubstring = null;
            try {
                String absolutePath = ax.g().getFilesDir().getAbsolutePath();
                if (!TextUtils.isEmpty(absolutePath)) {
                    String strSubstring2 = absolutePath.substring(0, absolutePath.lastIndexOf(ei.a("001l")));
                    if (!TextUtils.isEmpty(strSubstring2)) {
                        strSubstring = strSubstring2.substring(strSubstring2.lastIndexOf(ei.a("001l")) + 1);
                    }
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    String strF = ga.f(strSubstring.getBytes("utf-8"));
                    if (!TextUtils.isEmpty(strF)) {
                        String strB = ga.b(strF.getBytes());
                        if (!TextUtils.isEmpty(strB)) {
                            f36312f = com.umeng.analytics.pro.ak.aB + strB;
                        }
                    }
                }
            } catch (Throwable th2) {
                es.a().a(th2);
            }
        }
        return f36312f;
    }

    private static void k() {
        try {
            ServerSocketChannel serverSocketChannelOpen = ServerSocketChannel.open();
            serverSocketChannelOpen.configureBlocking(false);
            try {
                serverSocketChannelOpen.socket().bind(new InetSocketAddress(37926));
                eg.f36255a = false;
                serverSocketChannelOpen.close();
            } catch (Throwable unused) {
                eg.f36255a = true;
            }
        } catch (Throwable unused2) {
        }
    }

    private static void l() {
        ba.a().a(new ea() { // from class: cn.fly.verify.en.3
            @Override // cn.fly.verify.ea
            public void a(boolean z10, boolean z11, long j10) {
                if (z10) {
                    es.a().a("fg.", new Object[0]);
                    boolean unused = en.f36307a = true;
                } else {
                    es.a().a("bg.", new Object[0]);
                    boolean unused2 = en.f36307a = false;
                }
            }
        });
    }
}
