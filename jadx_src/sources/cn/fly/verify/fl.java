package cn.fly.verify;

import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadLocal<Boolean> f36579a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ThreadLocal<Boolean> f36580b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static ThreadLocal<Boolean> f36581c = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile String f36583e = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<String> f36582d = Arrays.asList("bgmdl", "gmnft", "gbrd", "govsit", "govsnm", "golgu", "gocnty", "galgu", "gtmne", "gsnmd", "gpgnm", "gpnmmt", "gpvsnm", "gpvsme", "cinmnps", "ckpmsi", "gaplcn", "gpgif", "gpgiffist", "gcrtpcnm", "gscpt", "cird", "cknavbl", "ipgist", "ckua", "ubenbl", "dvenbl", "vnmt", "iwpxy", "cx", "degb", "gdtlnktpfs", "gpgiffcin", "gpgifstrg", "gtaif", "gtaifprm", "rsaciy", "gsnmdfp", "gcrie", "gcriefce", "gdvk", "gdvkfc", "godhm", "godm", "gmpfis");

    private static fa a() {
        return fd.c() ? fc.a(ax.g()).e() : fc.a(ax.g()).c();
    }

    private static fa a(String str) {
        CountDownLatch countDownLatchD;
        CountDownLatch countDownLatchD2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            es.a().b("WARNING: Call in main: key = " + str);
            b();
        }
        try {
            if (f36579a.get() == null ? false : f36579a.get().booleanValue()) {
                boolean zBooleanValue = f36580b.get() == null ? false : f36580b.get().booleanValue();
                boolean zBooleanValue2 = f36581c.get() == null ? false : f36581c.get().booleanValue();
                if (zBooleanValue) {
                    es.a().a("isGCFThread true", new Object[0]);
                }
                if (!zBooleanValue && !zBooleanValue2 && !fd.c() && (countDownLatchD = fd.a(ax.g()).d()) != null) {
                    es.a().a("dhs_ivkr_new k: " + str + ", cdl: " + countDownLatchD, new Object[0]);
                    countDownLatchD.await(3500L, TimeUnit.MILLISECONDS);
                }
            } else if (!f36582d.contains(str) && !fd.c() && (countDownLatchD2 = fd.a(ax.g()).d()) != null) {
                es.a().a("dhs_ivkr k: " + str + ", cdl: " + countDownLatchD2, new Object[0]);
                countDownLatchD2.await(3500L, TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
        return a();
    }

    @fm
    public static Object a(String str, ArrayList<Object> arrayList) {
        try {
            return b(str, arrayList);
        } catch (Throwable th2) {
            es.a().a(th2);
            return null;
        }
    }

    private static Object b(String str, ArrayList<Object> arrayList) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        fa faVarA = a(str);
        if ("gmpfis".equals(str)) {
            if (arrayList != null && arrayList.size() == 4) {
                return faVarA.b(((Boolean) arrayList.get(0)).booleanValue(), ((Integer) arrayList.get(1)).intValue(), (String) arrayList.get(2), ((Integer) arrayList.get(3)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("cird".equals(str)) {
            return Boolean.valueOf(faVarA.a());
        }
        if ("cx".equals(str)) {
            return Boolean.valueOf(faVarA.b());
        }
        if ("ckpd".equals(str)) {
            return Boolean.valueOf(faVarA.c());
        }
        if ("degb".equals(str)) {
            return Boolean.valueOf(faVarA.d());
        }
        if ("vnmt".equals(str)) {
            return Boolean.valueOf(faVarA.e());
        }
        if ("ckua".equals(str)) {
            return Boolean.valueOf(faVarA.f());
        }
        if ("dvenbl".equals(str)) {
            return Boolean.valueOf(faVarA.g());
        }
        if ("ubenbl".equals(str)) {
            return Boolean.valueOf(faVarA.h());
        }
        if ("iwpxy".equals(str)) {
            return Boolean.valueOf(faVarA.i());
        }
        if ("gavti".equals(str)) {
            return faVarA.j();
        }
        if ("gsimt".equals(str)) {
            return faVarA.a(false);
        }
        if ("gsimtfce".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.a(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gbsi".equals(str)) {
            return faVarA.b(false);
        }
        if ("gbsifce".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.b(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gcrie".equals(str)) {
            return faVarA.c(false);
        }
        if ("gcriefce".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.c(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gcrnmfce".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.d(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gcrnm".equals(str)) {
            return faVarA.d(false);
        }
        if ("gmivsn".equals(str)) {
            return faVarA.k();
        }
        if ("bgmdl".equals(str)) {
            return faVarA.l();
        }
        if ("gmnft".equals(str)) {
            return faVarA.m();
        }
        if ("gbrd".equals(str)) {
            return faVarA.n();
        }
        if ("gdvtp".equals(str)) {
            return faVarA.o();
        }
        if ("gtecloc".equals(str)) {
            return faVarA.p();
        }
        if ("gnbclin".equals(str)) {
            return faVarA.q();
        }
        if ("wmcwi".equals(str)) {
            return faVarA.e(false);
        }
        if ("wmcwifce".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.e(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("govsit".equals(str)) {
            return Integer.valueOf(faVarA.s());
        }
        if ("govsnm".equals(str)) {
            return faVarA.t();
        }
        if ("golgu".equals(str)) {
            return faVarA.u();
        }
        if ("gocnty".equals(str)) {
            return faVarA.v();
        }
        if ("gcuin".equals(str)) {
            return faVarA.w();
        }
        if ("gtydvin".equals(str)) {
            return faVarA.x();
        }
        if ("gqmkn".equals(str)) {
            return faVarA.y();
        }
        if ("gszin".equals(str)) {
            return faVarA.z();
        }
        if ("gmrin".equals(str)) {
            return faVarA.A();
        }
        if ("galgu".equals(str)) {
            return faVarA.B();
        }
        if ("gscsz".equals(str)) {
            return faVarA.C();
        }
        if ("gneyp".equals(str)) {
            return faVarA.f(false);
        }
        if ("gneypnw".equals(str)) {
            return faVarA.D();
        }
        if ("gneypfce".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.f(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gnktpfs".equals(str)) {
            return faVarA.E();
        }
        if ("gdtlnktpfs".equals(str)) {
            return faVarA.F();
        }
        if ("cknavbl".equals(str)) {
            return Boolean.valueOf(faVarA.G());
        }
        if ("gdntp".equals(str)) {
            return Integer.valueOf(faVarA.H());
        }
        if ("gtmne".equals(str)) {
            return faVarA.I();
        }
        if ("gflv".equals(str)) {
            return faVarA.J();
        }
        if ("gbsbd".equals(str)) {
            return faVarA.K();
        }
        if ("gbfspy".equals(str)) {
            return faVarA.L();
        }
        if ("gbplfo".equals(str)) {
            return faVarA.M();
        }
        if ("giads".equals(str)) {
            return faVarA.N();
        }
        if ("gia".equals(str)) {
            if (!by.a(ba.a("003fii")) || bv.a().h() == 42) {
                return new ArrayList();
            }
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.a(((Boolean) arrayList.get(0)).booleanValue(), false);
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("giafce".equals(str)) {
            if (!by.a(ba.a("003fii")) || bv.a().h() == 42) {
                return new ArrayList();
            }
            if (arrayList != null && arrayList.size() == 2) {
                return faVarA.a(((Boolean) arrayList.get(0)).booleanValue(), ((Boolean) arrayList.get(1)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gal".equals(str)) {
            return (!by.a(ba.a("003fii")) || bv.a().h() == 42) ? new ArrayList() : faVarA.O();
        }
        if ("gsl".equals(str)) {
            return (!by.a(ba.a("003fii")) || bv.a().h() == 42) ? new ArrayList() : faVarA.P();
        }
        if ("glctn".equals(str)) {
            if (arrayList != null && arrayList.size() == 3) {
                return faVarA.a(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue(), ((Boolean) arrayList.get(2)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gstmpts".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.a((String) arrayList.get(0));
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gdvk".equals(str)) {
            return faVarA.Q();
        }
        if ("gdvkfc".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.g(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("ipgist".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return Boolean.valueOf(faVarA.b((String) arrayList.get(0)));
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gscpt".equals(str)) {
            return faVarA.R();
        }
        if ("gsnmd".equals(str)) {
            return faVarA.S();
        }
        if ("gsnmdfp".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.c((String) arrayList.get(0));
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gpgnm".equals(str)) {
            return faVarA.T();
        }
        if ("gpnmmt".equals(str)) {
            return faVarA.U();
        }
        if ("gpnmfp".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.d((String) arrayList.get(0));
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gpvsnm".equals(str)) {
            return Integer.valueOf(faVarA.V());
        }
        if ("gpvsme".equals(str)) {
            return faVarA.W();
        }
        if ("cinmnps".equals(str)) {
            return Boolean.valueOf(faVarA.X());
        }
        if ("gcrtpcnm".equals(str)) {
            return faVarA.Y();
        }
        if ("ciafgd".equals(str)) {
            return Boolean.valueOf(faVarA.Z());
        }
        if ("ckpmsi".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return Boolean.valueOf(faVarA.e((String) arrayList.get(0)));
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gaplcn".equals(str)) {
            return faVarA.aa();
        }
        if ("qritsvc".equals(str)) {
            if (arrayList != null && arrayList.size() == 2) {
                return faVarA.a((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("rsaciy".equals(str)) {
            if (arrayList != null && arrayList.size() == 2) {
                return faVarA.b((Intent) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gpgif".equals(str)) {
            if (arrayList != null && arrayList.size() == 2) {
                return faVarA.a(false, 0, (String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gpgiffcin".equals(str)) {
            if (arrayList != null && arrayList.size() == 3) {
                return faVarA.a(((Boolean) arrayList.get(0)).booleanValue(), 0, (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gpgifstrg".equals(str)) {
            if (arrayList != null && arrayList.size() == 3) {
                return faVarA.a(false, ((Integer) arrayList.get(0)).intValue(), (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gpgiffist".equals(str)) {
            if (arrayList != null && arrayList.size() == 4) {
                return faVarA.a(((Boolean) arrayList.get(0)).booleanValue(), ((Integer) arrayList.get(1)).intValue(), (String) arrayList.get(2), ((Integer) arrayList.get(3)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gdvda".equals(str)) {
            return faVarA.ab();
        }
        if ("gdvdtnas".equals(str)) {
            return faVarA.ac();
        }
        if ("galtut".equals(str)) {
            return Long.valueOf(faVarA.ad());
        }
        if ("gcrup".equals(str)) {
            return faVarA.af();
        }
        if ("gcifm".equals(str)) {
            return faVarA.ag();
        }
        if ("godm".equals(str)) {
            String strAh = faVarA.ah();
            if (TextUtils.isEmpty(f36583e)) {
                f36583e = bv.a().b("key_ched_od", (String) null);
            }
            if (TextUtils.isEmpty(strAh) || az.a().b().a()) {
                return TextUtils.isEmpty(f36583e) ? strAh : f36583e;
            }
            if (TextUtils.equals(f36583e, strAh)) {
                return strAh;
            }
            f36583e = strAh;
            bv.a().a("key_ched_od", strAh);
            return strAh;
        }
        if ("godhm".equals(str)) {
            return faVarA.ai();
        }
        if ("galdm".equals(str)) {
            return faVarA.aj();
        }
        if ("gtaif".equals(str)) {
            return faVarA.ak();
        }
        if ("gtaifok".equals(str)) {
            return faVarA.al();
        }
        if ("gtaifprm".equals(str)) {
            if (arrayList != null && arrayList.size() == 2) {
                return faVarA.a((String) arrayList.get(0), ((Integer) arrayList.get(1)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gtaifprmfce".equals(str)) {
            if (arrayList != null && arrayList.size() == 3) {
                return faVarA.a(((Boolean) arrayList.get(0)).booleanValue(), (String) arrayList.get(1), ((Integer) arrayList.get(2)).intValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gtbdt".equals(str)) {
            return Long.valueOf(faVarA.am());
        }
        if ("gtscnin".equals(str)) {
            return Double.valueOf(faVarA.an());
        }
        if ("gtscnppi".equals(str)) {
            return Integer.valueOf(faVarA.ao());
        }
        if ("ishmos".equals(str)) {
            return Boolean.valueOf(faVarA.ap());
        }
        if ("gthmosv".equals(str)) {
            return faVarA.aq();
        }
        if ("gthmosdtlv".equals(str)) {
            return faVarA.ar();
        }
        if ("gthmpmst".equals(str)) {
            return Integer.valueOf(faVarA.as());
        }
        if ("gthmepmst".equals(str)) {
            return Integer.valueOf(faVarA.at());
        }
        if ("gtinnerlangmt".equals(str)) {
            return faVarA.au();
        }
        if ("gtgramgendt".equals(str)) {
            return Integer.valueOf(faVarA.av());
        }
        if ("ctedebbing".equals(str)) {
            return Boolean.valueOf(faVarA.aw());
        }
        if ("gtelcmefce".equals(str)) {
            if (arrayList != null && arrayList.size() == 4) {
                return faVarA.a(((Integer) arrayList.get(0)).intValue(), ((Integer) arrayList.get(1)).intValue(), ((Boolean) arrayList.get(2)).booleanValue(), ((Boolean) arrayList.get(3)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if ("gteacifo".equals(str)) {
            return faVarA.ax();
        }
        if ("gtdm".equals(str)) {
            if (arrayList != null && arrayList.size() == 1) {
                return faVarA.h(((Boolean) arrayList.get(0)).booleanValue());
            }
            throw new Throwable("array illegal: " + arrayList);
        }
        if (!"gtlstactme".equals(str)) {
            es.a().a("Not found: " + str, new Object[0]);
            return null;
        }
        if (arrayList != null && arrayList.size() == 1) {
            return Long.valueOf(faVarA.f((String) arrayList.get(0)));
        }
        throw new Throwable("array illegal: " + arrayList);
    }

    private static void b() {
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace != null) {
                String str = "";
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (stackTraceElement != null) {
                        str = str + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")\n";
                    }
                }
                es.a().a(str, new Object[0]);
            }
        } catch (Throwable th2) {
            es.a().a(th2);
        }
    }
}
