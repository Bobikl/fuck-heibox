package cn.fly.verify;

import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class ef {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f36244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f36245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f36246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f36247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f36248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f36249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f36250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f36251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f36252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f36253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f36254k;

    static {
        String strA = bq.a("011d]elegeg:mhRelUdEfigjHm");
        f36254k = strA;
        f36244a = strA + ".mrlock";
        f36245b = strA + bq.a("007Temed?ihGelEd-fi");
        f36246c = strA + bq.a("011XemfkEh7elgg3ehAgfel9d]fi");
        f36247d = strA + bq.a("008LemedfdeiEhOel?d?fi");
        f36248e = strA + bq.a("008?emedgjeiXhMelTd;fi");
        f36249f = strA + ".cl_lock";
        f36250g = strA + ".gcf_lock";
        f36251h = strA + ".mp_lock";
        f36252i = new Object();
        f36253j = new Object();
    }

    public static synchronized File a(String str) {
        return gj.a(ax.g(), str, true);
    }

    public static boolean a(File file, ee eeVar) {
        return a(file, true, eeVar);
    }

    public static boolean a(File file, boolean z10, ee eeVar) {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            String absolutePath = file.getAbsolutePath();
            synchronized (b(absolutePath)) {
                gb gbVar = new gb();
                gbVar.a(absolutePath);
                if (!gbVar.a(z10)) {
                    return false;
                }
                try {
                    if (!eeVar.a(gbVar)) {
                        gbVar.b();
                    }
                } catch (Throwable unused) {
                    gbVar.b();
                }
                return true;
            }
        } catch (Throwable th2) {
            es.a().b(th2);
            return true;
        }
    }

    public static boolean a(String str, boolean z10, long j10, long j11, ee eeVar) {
        gb gbVar = new gb();
        try {
            gbVar.a(str);
            if (!gbVar.a(z10, j10, j11)) {
                return false;
            }
            try {
                if (!eeVar.a(gbVar)) {
                    gbVar.b();
                }
            } catch (Throwable unused) {
                gbVar.b();
            }
            return true;
        } catch (Throwable th2) {
            es.a().b(th2);
            gbVar.b();
            return true;
        }
    }

    private static String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = f36246c;
            if (str.endsWith(str2)) {
                return str2;
            }
            String str3 = f36245b;
            if (str.endsWith(str3)) {
                return str3;
            }
            String str4 = f36247d;
            if (str.endsWith(str4)) {
                return str4;
            }
            String str5 = f36248e;
            if (str.endsWith(str5)) {
                return str5;
            }
            String str6 = f36249f;
            if (str.endsWith(str6)) {
                return str6;
            }
            String str7 = f36250g;
            if (str.endsWith(str7)) {
                return str7;
            }
        }
        return str;
    }
}
