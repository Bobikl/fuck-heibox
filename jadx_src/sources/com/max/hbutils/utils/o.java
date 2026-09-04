package com.max.hbutils.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: OEMManager.java */
/* JADX INFO: loaded from: classes13.dex */
public class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f73556b = "unknown";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f73557c = "Xiaomi";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f73558d = "Huawei";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f73559e = "OPPO";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f73560f = "VIVO";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f73561g = "smartisan";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile o f73562h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f73563a;

    /* JADX INFO: compiled from: OEMManager.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private static o a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Tp, new Class[0], o.class);
        if (patchProxyResultProxy.isSupported) {
            return (o) patchProxyResultProxy.result;
        }
        if (f73562h == null) {
            synchronized (o.class) {
                if (f73562h == null) {
                    f73562h = new o();
                }
            }
        }
        return f73562h;
    }

    private String b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Vp, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.f73563a == null) {
            if ("Xiaomi".equalsIgnoreCase(Build.MANUFACTURER)) {
                this.f73563a = "Xiaomi";
            } else {
                try {
                    if (!TextUtils.isEmpty(d(r4.a.f138781a))) {
                        this.f73563a = f73558d;
                    } else if (!TextUtils.isEmpty(d("ro.build.version.opporom"))) {
                        this.f73563a = f73559e;
                    } else if (!TextUtils.isEmpty(d("ro.vivo.os.version"))) {
                        this.f73563a = f73560f;
                    } else if (TextUtils.isEmpty(d("ro.smartisan.version"))) {
                        this.f73563a = "unknown";
                    } else {
                        this.f73563a = f73561g;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                    this.f73563a = "unknown";
                }
            }
        }
        return this.f73563a;
    }

    public static String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.k.Up, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a().b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    private String d(String str) throws Throwable {
        BufferedReader bufferedReader;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.k.Wp, new Class[]{String.class}, String.class);
        ?? r10 = patchProxyResultProxy.isSupported;
        if (r10 != 0) {
            return (String) patchProxyResultProxy.result;
        }
        String string = null;
        string = null;
        string = null;
        ?? r11 = 0;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop " + str).getInputStream()));
                    try {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb2.append(line);
                        }
                        string = sb2.toString();
                        bufferedReader.close();
                    } catch (Exception e10) {
                        e = e10;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        return string;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Exception e12) {
                e = e12;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                if (r11 != 0) {
                    try {
                        r11.close();
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                }
                throw th;
            }
            return string;
        } catch (Throwable th3) {
            th = th3;
            r11 = r10;
        }
    }
}
