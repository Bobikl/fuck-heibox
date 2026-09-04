package cn.fly.verify;

import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class al {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f35738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f35739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f35740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f35741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f35742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f35743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f35744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f35745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f35746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f35747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f35748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f35749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static PackageInfo f35750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static String f35751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static String f35752o;

    public static String a() {
        if (TextUtils.isEmpty(f35738a)) {
            f35738a = as.e();
        }
        return f35738a;
    }

    public static void a(final ar arVar, final boolean z10, final e eVar) {
        fz.c cVarG;
        try {
            f.a().b("[FlyVerify] ==>%s", "DH request");
            final long jUptimeMillis = SystemClock.uptimeMillis();
            if (TextUtils.isEmpty(f35738a)) {
                cVarG = (z10 ? fz.a(ax.g()).b(true).a(true) : fz.a(ax.g()).b(true)).g();
            } else {
                cVarG = z10 ? fz.a(ax.g()).b(true).a(true) : fz.a(ax.g()).b(true);
            }
            if (cVarG != null) {
                cVarG.a(new fz.a() { // from class: cn.fly.verify.al.1
                    @Override // cn.fly.verify.fz.a
                    public void a(fz.b bVar) {
                        try {
                            f.a().b("[FlyVerify] ==>%s", "DH response");
                            if (TextUtils.isEmpty(al.f35738a)) {
                                String unused = al.f35738a = bVar.g();
                            }
                            String unused2 = al.f35747j = bVar.b(new int[0]);
                            if (z10) {
                                String unused3 = al.f35739b = bVar.a(new int[0]);
                            }
                            e eVar2 = eVar;
                            if (eVar2 != null) {
                                eVar2.a((String) null, (String) null, "dh", String.valueOf(SystemClock.uptimeMillis() - jUptimeMillis));
                            }
                            ar arVar2 = arVar;
                            if (arVar2 != null) {
                                arVar2.run();
                            }
                        } catch (Throwable th2) {
                            f.a().b("[FlyVerify] ==>%s", th2.getMessage());
                            ar arVar3 = arVar;
                            if (arVar3 != null) {
                                arVar3.a(th2);
                            }
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            if ((th2 instanceof ClassNotFoundException) || (th2 instanceof NoClassDefFoundError) || (th2 instanceof NoSuchMethodException) || (th2 instanceof NoSuchMethodError)) {
                Log.e("[FlyVerify] ==>%s", "本产品进行了架构升级优化，为保证正常使用SDK，请确保相关架包升级到了最新版本，或者可至官网联系技术支持");
            }
            f.a().b("[FlyVerify] ==>%s", th2.getMessage());
            if (arVar != null) {
                arVar.a(th2);
            }
        }
        as.b(true);
        as.c(true);
        as.d(true);
        try {
            fz.c cVarB = fz.a(ax.g()).x().m().i().r().f().j().A().b().y().a(fz.d.c(), 128).B();
            if (TextUtils.isEmpty(f35752o)) {
                cVarB = cVarB.e(true);
            }
            cVarB.a(new fz.a() { // from class: cn.fly.verify.al.2
                @Override // cn.fly.verify.fz.a
                public void a(fz.b bVar) {
                    try {
                        if (TextUtils.isEmpty(al.f35752o)) {
                            String unused = al.f35752o = bVar.M();
                        }
                        int unused2 = al.f35748k = bVar.x();
                        String unused3 = al.f35740c = bVar.m();
                        String unused4 = al.f35741d = bVar.i();
                        String unused5 = al.f35742e = bVar.r();
                        String unused6 = al.f35743f = bVar.f();
                        String unused7 = al.f35744g = bVar.j();
                        String unused8 = al.f35745h = bVar.z();
                        String unused9 = al.f35746i = bVar.b();
                        String unused10 = al.f35749l = bVar.y();
                        PackageInfo unused11 = al.f35750m = bVar.g(new int[0]);
                        String unused12 = al.f35751n = bVar.A();
                    } catch (Throwable th3) {
                        f.a().b("[FlyVerify] ==>%s", th3.getMessage());
                    }
                }
            });
        } catch (Throwable th3) {
            f.a().b("[FlyVerify] ==>%s", th3.getMessage());
        }
    }

    public static String b() {
        return f35752o;
    }

    public static int c() {
        return f35748k;
    }

    public static String d() {
        return f35739b;
    }

    public static String e() {
        return f35740c;
    }

    public static String f() {
        return f35741d;
    }

    public static String g() {
        return f35742e;
    }

    public static String h() {
        return f35743f;
    }

    public static String i() {
        return f35744g;
    }

    public static String j() {
        return f35747j;
    }

    public static String k() {
        return f35751n;
    }

    public static String l() {
        String simOperator = null;
        try {
            simOperator = ((TelephonyManager) ax.g().getSystemService(g0.a.f118921e)).getSimOperator();
            f.a().a("==== getCarrierImpl");
        } catch (Throwable unused) {
        }
        return TextUtils.isEmpty(simOperator) ? "-1" : simOperator;
    }

    public static String m() {
        Object objA;
        NetworkInfo activeNetworkInfo;
        try {
            if (!fz.d.b("android.permission.ACCESS_NETWORK_STATE") || (objA = fz.d.a("connectivity")) == null || (activeNetworkInfo = ((ConnectivityManager) objA).getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) {
                return "none";
            }
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                return type != 1 ? String.valueOf(type) : "wifi";
            }
            return "cell";
        } catch (Throwable th2) {
            es.a().b(th2);
            return "none";
        }
    }
}
