package com.ishumei.smantifraud.l111l11111I1l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.huawei.hms.feature.dynamic.f.e;
import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l11111lIl {
    public static int l1111l111111Il() {
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return 0;
        }
        return context.getApplicationInfo().targetSdkVersion;
    }

    public static String l1111l111111Il(Object obj) {
        if (obj == null) {
            return "";
        }
        try {
            return ((X509Certificate) CertificateFactory.getInstance(e.f60731b).generateCertificate(new ByteArrayInputStream((byte[]) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(obj, "toByteArray")))).getSubjectDN().toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static Map<String, String> l1111l111111Il(Context context) {
        HashMap map = new HashMap();
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            map.put("pkg", str);
            if (str != null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) packageManager.getApplicationLabel(applicationInfo));
                map.put(BasePuzzleInfo.PUZZLE_TYPE_LABEL, sb2.toString());
                map.put("ver", packageManager.getPackageInfo(str, 0).versionName);
            }
        } catch (Throwable unused) {
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    private static Object[] l1111l111111Il(String str) {
        Object[] objArr;
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null) {
            return null;
        }
        try {
            Object objL1111l111111Il = com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(context.getPackageManager(), "getPackageInfo", new Class[]{String.class, Integer.TYPE}, new Object[]{str, 64});
            if (objL1111l111111Il == null || (objArr = (Object[]) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l111l11111lIl(objL1111l111111Il, "signatures")) == null || objArr.length <= 0) {
                return null;
            }
            return objArr;
        } catch (Throwable unused) {
        }
    }

    public static String l111l11111I1l() {
        Context contextL1111l111111Il = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (contextL1111l111111Il == null && (contextL1111l111111Il = com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il()) == null) {
            return null;
        }
        try {
            return (String) com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il.l1111l111111Il.l111l11111lIl.l1111l111111Il(contextL1111l111111Il, "getPackageName");
        } catch (Exception unused) {
            return "";
        }
    }

    public static Object l111l11111Il() {
        Object[] objArrL1111l111111Il;
        Context context = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (context == null || (objArrL1111l111111Il = l1111l111111Il(context.getPackageName())) == null || objArrL1111l111111Il.length <= 0) {
            return null;
        }
        return objArrL1111l111111Il[0];
    }

    public static String l111l11111lIl() {
        Context contextL1111l111111Il = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il;
        if (contextL1111l111111Il == null && (contextL1111l111111Il = com.ishumei.smantifraud.l111l1111llIl.l111l1111llIl.l1111l111111Il()) == null) {
            return null;
        }
        try {
            String str = contextL1111l111111Il.getPackageManager().getPackageInfo(l111l11111I1l(), 0).versionName;
            return str == null ? "" : str;
        } catch (Exception unused) {
            return "";
        }
    }

    private static String l111l11111lIl(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null) {
            return resolveInfoResolveActivity.activityInfo.packageName;
        }
        return null;
    }

    public static int l111l1111l1Il() {
        return (com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getApplicationInfo().flags & 2) > 0 ? 1 : 0;
    }

    public static Map<String, String> l111l1111lI1l() {
        try {
            HashMap map = new HashMap();
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("getPackageManager", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(cls, new Object[0]);
            Class<?> cls2 = objInvoke instanceof Proxy ? Proxy.getInvocationHandler(objInvoke).getClass() : null;
            if (objInvoke != null && !objInvoke.getClass().getName().equals("android.content.pm.IPackageManager$Stub$Proxy")) {
                map.put("pm", objInvoke.getClass().getName());
            }
            if (cls2 != null) {
                map.put(WebviewFragment.A4, cls2.getName());
            }
            if (map.isEmpty()) {
                return null;
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Map<String, Long> l111l1111llIl() {
        try {
            PackageInfo packageInfo = com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l1111l111111Il.getPackageManager().getPackageInfo(l111l11111I1l(), 0);
            HashMap map = new HashMap();
            map.put("fit", Long.valueOf(packageInfo.firstInstallTime));
            map.put("lut", Long.valueOf(packageInfo.lastUpdateTime));
            return map;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}
