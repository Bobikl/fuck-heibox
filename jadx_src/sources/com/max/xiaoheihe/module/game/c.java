package com.max.xiaoheihe.module.game;

import android.content.Context;
import android.content.pm.PackageManager;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Map;

/* JADX INFO: compiled from: AppDownloadUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void a(Context context, GameObj gameObj) {
        if (!PatchProxy.proxy(new Object[]{context, gameObj}, null, changeQuickRedirect, true, 32234, new Class[]{Context.class, GameObj.class}, Void.TYPE).isSupported && com.max.hbcommon.utils.i.e(context) && l(gameObj)) {
            k(gameObj);
        }
    }

    public static Map<String, com.lzy.okserver.download.b> b() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 32230, new Class[0], Map.class);
        return patchProxyResultProxy.isSupported ? (Map) patchProxyResultProxy.result : com.lzy.okserver.b.c().e();
    }

    public static com.lzy.okserver.download.b c(GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, null, changeQuickRedirect, true, 32226, new Class[]{GameObj.class}, com.lzy.okserver.download.b.class);
        return patchProxyResultProxy.isSupported ? (com.lzy.okserver.download.b) patchProxyResultProxy.result : d(g(gameObj));
    }

    public static com.lzy.okserver.download.b d(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 32227, new Class[]{String.class}, com.lzy.okserver.download.b.class);
        return patchProxyResultProxy.isSupported ? (com.lzy.okserver.download.b) patchProxyResultProxy.result : com.lzy.okserver.b.c().d(str);
    }

    public static String e(GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, null, changeQuickRedirect, true, 32228, new Class[]{GameObj.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : gameObj.getDownload_url_android();
    }

    public static String f(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 32231, new Class[]{Context.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 16384).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return "0";
        }
    }

    public static String g(GameObj gameObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, null, changeQuickRedirect, true, 32229, new Class[]{GameObj.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : r1.Z(gameObj);
    }

    public static long h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 32233, new Class[]{String.class}, Long.TYPE);
        return patchProxyResultProxy.isSupported ? ((Long) patchProxyResultProxy.result).longValue() : com.max.hbutils.utils.n.r(str.replaceAll("[^0-9]", ""));
    }

    public static boolean i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 32225, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return false;
        }
        return com.max.xiaoheihe.utils.d.H0(HeyBoxApplication.C(), str);
    }

    public static boolean j(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 32232, new Class[]{String.class, String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (str2 == null || str.equals(str2)) {
            return false;
        }
        String[] strArrSplit = str.split("[._]");
        String[] strArrSplit2 = str2.split("[._]");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        long jH = 0;
        int i10 = 0;
        while (i10 < iMin) {
            jH = h(strArrSplit[i10]) - h(strArrSplit2[i10]);
            if (jH != 0) {
                break;
            }
            i10++;
        }
        if (jH != 0) {
            return jH <= 0;
        }
        for (int i11 = i10; i11 < strArrSplit.length; i11++) {
            if (h(strArrSplit[i11]) > 0) {
                return false;
            }
        }
        while (i10 < strArrSplit2.length) {
            if (h(strArrSplit2[i10]) > 0) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public static void k(GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, null, changeQuickRedirect, true, 32236, new Class[]{GameObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().Y("start_download", r1.Z(gameObj), gameObj.getLast_release_time()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.p());
    }

    public static boolean l(GameObj gameObj) {
        int i10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameObj}, null, changeQuickRedirect, true, 32235, new Class[]{GameObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (gameObj != null) {
            com.lzy.okserver.download.b bVarC = c(gameObj);
            if (bVarC == null || bVarC.f64853b == null || com.lzy.okserver.b.c().d(bVarC.f64853b.f64776b) == null || com.lzy.okgo.db.g.Q().L(bVarC.f64853b.f64776b) == null || (i10 = bVarC.f64853b.f64785k) == 5 || i10 == 4) {
                String strG = g(gameObj);
                String download_url_android = gameObj.getDownload_url_android();
                if (!com.max.hbcommon.utils.c.u(download_url_android)) {
                    com.lzy.okserver.b.m(strG, com.lzy.okgo.b.h(download_url_android)).c(gameObj).q(new x1()).u().v();
                }
            } else {
                bVarC.v();
            }
            return true;
        }
        return false;
    }
}
