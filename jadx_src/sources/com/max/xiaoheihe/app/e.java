package com.max.xiaoheihe.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.max.hbutils.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: WebviewDirHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static ChangeQuickRedirect changeQuickRedirect;

    private static void a(File file, boolean z10) {
        if (!PatchProxy.proxy(new Object[]{file, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.m.NG, new Class[]{File.class, Boolean.TYPE}, Void.TYPE).isSupported && z10) {
            try {
                if (file.exists()) {
                    return;
                }
                file.createNewFile();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void b(Context context, String str) {
        if (!PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, bb.c.m.LG, new Class[]{Context.class, String.class}, Void.TYPE).isSupported && Build.VERSION.SDK_INT >= 28) {
            try {
                HashSet hashSet = new HashSet();
                String absolutePath = context.getDataDir().getAbsolutePath();
                com.max.hbcommon.utils.d.b("zzzzwebtest", "processName ==" + str);
                String strC = o.c();
                if (TextUtils.equals(context.getPackageName(), str)) {
                    String str2 = lg.a.f131412e + str;
                    hashSet.add(absolutePath + "/app_webview/webview_data.lock");
                    hashSet.add(absolutePath + "/app_webview" + str2 + "/webview_data.lock");
                    if (o.f73558d.equals(strC)) {
                        hashSet.add(absolutePath + "/app_hws_webview/webview_data.lock");
                        hashSet.add(absolutePath + "/app_hws_webview" + str2 + "/webview_data.lock");
                    }
                } else {
                    if (TextUtils.isEmpty(str)) {
                        str = context.getPackageName();
                    }
                    WebView.setDataDirectorySuffix(str);
                    String str3 = lg.a.f131412e + str;
                    hashSet.add(absolutePath + "/app_webview" + str3 + "/webview_data.lock");
                    if (o.f73558d.equals(strC)) {
                        hashSet.add(absolutePath + "/app_hws_webview" + str3 + "/webview_data.lock");
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    File file = new File((String) it.next());
                    if (file.exists()) {
                        c(file);
                        return;
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    @TargetApi(28)
    private static void c(File file) {
        if (PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, bb.c.m.MG, new Class[]{File.class}, Void.TYPE).isSupported) {
            return;
        }
        try {
            FileLock fileLockTryLock = new RandomAccessFile(file, "rw").getChannel().tryLock();
            if (fileLockTryLock != null) {
                fileLockTryLock.close();
            } else {
                a(file, file.delete());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            a(file, file.exists() ? file.delete() : false);
        }
    }
}
