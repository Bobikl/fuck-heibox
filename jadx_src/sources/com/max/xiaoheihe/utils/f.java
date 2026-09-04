package com.max.xiaoheihe.utils;

import android.content.Context;
import android.os.Environment;
import android.text.format.Formatter;
import android.util.Log;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: DataCleanManager.java */
/* JADX INFO: loaded from: classes13.dex */
public class f {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48662, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        List<File> listN = n(context);
        for (int i10 = 0; i10 < listN.size(); i10++) {
            File file = listN.get(i10);
            if (file.exists()) {
                Log.d("delete...", file.getAbsolutePath());
                j(context, file);
            }
        }
    }

    public static void b(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48661, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        d.h(context);
        a(context);
        com.max.hbimage.b.e();
        HeyBoxApplication.C().getSharedPreferences("tabinfo", 0).edit().clear().apply();
    }

    public static void c(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48660, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        k(new File(str));
    }

    public static void d(Context context, String str) {
        if (PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48656, new Class[]{Context.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        context.deleteDatabase(str);
    }

    public static void e(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48654, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        k(l(context, "databases"));
    }

    public static void f(Context context) {
        if (!PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48659, new Class[]{Context.class}, Void.TYPE).isSupported && Environment.getExternalStorageState().equals("mounted")) {
            k(context.getExternalCacheDir());
        }
    }

    public static void g(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48658, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        k(context.getFilesDir());
    }

    public static void h(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48655, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        k(l(context, "shared_prefs"));
    }

    public static void i(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48657, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        j(context, l(context, "app_webview"));
    }

    private static void j(Context context, File file) {
        if (!PatchProxy.proxy(new Object[]{context, file}, null, changeQuickRedirect, true, 48663, new Class[]{Context.class, File.class}, Void.TYPE).isSupported && file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                com.max.hbcommon.utils.f.b(file2, m());
            }
        }
    }

    private static void k(File file) {
        if (!PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, 48668, new Class[]{File.class}, Void.TYPE).isSupported && file != null && file.exists() && file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                com.max.hbcommon.utils.f.b(file2, m());
            }
        }
    }

    private static File l(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 48665, new Class[]{Context.class, String.class}, File.class);
        if (patchProxyResultProxy.isSupported) {
            return (File) patchProxyResultProxy.result;
        }
        return new File("/data/data/" + context.getPackageName() + "/" + str);
    }

    private static String[] m() {
        return new String[]{"user.xml", "enterflag.xml", "webPack.xml", "debug_info.xml", com.max.xiaoheihe.module.webview.d0.f94670a};
    }

    public static List<File> n(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48664, new Class[]{Context.class}, List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(context.getCacheDir());
        arrayList.add(l(context, "app_webview"));
        if (Environment.getExternalStorageState().equals("mounted")) {
            arrayList.add(context.getExternalCacheDir());
        }
        return arrayList;
    }

    public static long o(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48666, new Class[]{Context.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        long j10 = 0;
        List<File> listN = n(context);
        for (int i10 = 0; i10 < listN.size(); i10++) {
            File file = listN.get(i10);
            if (file != null && file.exists()) {
                long jE = com.max.hbcommon.utils.f.e(file, m());
                p(file, "cachesize:" + Formatter.formatFileSize(context, jE));
                j10 += jE;
            }
        }
        return j10;
    }

    private static void p(File file, String str) {
        if (PatchProxy.proxy(new Object[]{file, str}, null, changeQuickRedirect, true, 48667, new Class[]{File.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        boolean zStartsWith = file.getAbsolutePath().startsWith("/data/data/");
        boolean zStartsWith2 = file.getAbsolutePath().startsWith("/storage/");
        String str2 = file.getName() + "||";
        if (zStartsWith) {
            str2 = str2 + "inernal";
        } else if (zStartsWith2) {
            str2 = str2 + "exernal";
        }
        Log.d("cachememeory", str2 + "||" + str);
    }
}
