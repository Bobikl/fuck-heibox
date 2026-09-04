package com.max.xiaoheihe.module.account.utils;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.webkit.WebView;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.network.q;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.Iterator;
import java.util.List;
import org.android.agoo.common.AgooConstants;

/* JADX INFO: compiled from: MobileInfoUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: MobileInfoUtils.java */
    public class a implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f79297b;

        a(BaseActivity baseActivity) {
            this.f79297b = baseActivity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25406, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            this.f79297b.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MobileInfoUtils.java */
    public class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 25407, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: MobileInfoUtils.java */
    public class c extends q {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BaseActivity f79298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f79299c;

        c(BaseActivity baseActivity, WebView webView) {
            this.f79298b = baseActivity;
            this.f79299c = webView;
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            WebView webView;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 25408, new Class[]{Result.class}, Void.TYPE).isSupported || !this.f79298b.isActive() || (webView = this.f79299c) == null) {
                return;
            }
            webView.reload();
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 25409, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public static boolean a(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25401, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<UsageStats> listQueryUsageStats = ((UsageStatsManager) context.getApplicationContext().getSystemService("usagestats")).queryUsageStats(4, 0L, System.currentTimeMillis());
        if (listQueryUsageStats == null || listQueryUsageStats.isEmpty()) {
            return d(context);
        }
        return true;
    }

    public static String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 25404, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        long jR = n.r(str);
        if (jR >= 3600) {
            float f10 = jR / 3600.0f;
            return f10 > 100.0f ? String.format("%.0fh", Float.valueOf(f10)) : String.format("%.1fh", Float.valueOf(f10));
        }
        return (jR / 60) + "分钟";
    }

    public static void c(BaseActivity baseActivity, WebView webView, long j10, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{baseActivity, webView, new Long(j10), str, str2}, null, changeQuickRedirect, true, 25399, new Class[]{BaseActivity.class, WebView.class, Long.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        List<UsageStats> listQueryUsageStats = ((UsageStatsManager) baseActivity.getApplicationContext().getSystemService("usagestats")).queryUsageStats(4, j10, System.currentTimeMillis());
        if (listQueryUsageStats == null || listQueryUsageStats.isEmpty()) {
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.d("无法获取应用使用信息");
            return;
        }
        Iterator<UsageStats> it = listQueryUsageStats.iterator();
        while (it.hasNext()) {
            if (!str.equals(it.next().getPackageName())) {
                it.remove();
            }
        }
        long totalTimeInForeground = 0;
        Iterator<UsageStats> it2 = listQueryUsageStats.iterator();
        while (it2.hasNext()) {
            totalTimeInForeground += it2.next().getTotalTimeInForeground();
        }
        Log.d("zzzzmobileupload", "package_name==" + str);
        Log.d("zzzzmobileupload", "start_time==" + j10);
        Log.d("zzzzmobileupload", "play_time ==" + totalTimeInForeground);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("package_name", str);
        jsonObject.addProperty(com.umeng.analytics.pro.d.f104709p, Long.valueOf(j10));
        jsonObject.addProperty("play_time", Long.valueOf(totalTimeInForeground));
        jsonObject.addProperty(AgooConstants.MESSAGE_TASK_ID, str2);
        h(baseActivity, webView, com.max.hbutils.utils.k.p(jsonObject));
    }

    public static boolean d(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25403, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return context.getApplicationContext().getPackageManager().queryIntentActivities(new Intent("android.settings.USAGE_ACCESS_SETTINGS"), 65536).size() > 0;
    }

    public static boolean e(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 25402, new Class[]{Context.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return !com.max.hbcommon.utils.c.w(((UsageStatsManager) context.getApplicationContext().getSystemService("usagestats")).queryUsageStats(4, 0L, System.currentTimeMillis()));
    }

    public static boolean f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 25405, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (!"1".equals(com.max.hbcache.c.j("show_mobile_game_center_icon")) || "heybox_oppo".equals(com.max.xiaoheihe.utils.d.t0()) || com.max.xiaoheihe.a.f76429f.equals(com.max.xiaoheihe.utils.d.t0())) ? false : true;
    }

    public static void g(BaseActivity baseActivity, WebView webView, long j10, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{baseActivity, webView, new Long(j10), str, str2}, null, changeQuickRedirect, true, 25398, new Class[]{BaseActivity.class, WebView.class, Long.TYPE, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (e(baseActivity)) {
            c(baseActivity, webView, j10, str, str2);
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(baseActivity);
        fVar.y("游戏时长统计");
        fVar.l("时长统计需要在系统【有权查看使用情况的应用】设置中开启权限");
        com.max.hbcommon.view.a aVarD = fVar.d();
        aVarD.u("去设置", new a(baseActivity));
        aVarD.r(com.max.xiaoheihe.utils.d.n0(R.string.cancel), new b());
        aVarD.show();
    }

    private static void h(BaseActivity baseActivity, WebView webView, String str) {
        if (PatchProxy.proxy(new Object[]{baseActivity, webView, str}, null, changeQuickRedirect, true, 25400, new Class[]{BaseActivity.class, WebView.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        PostEncryptParamsObj postEncryptParamsObjU0 = com.max.xiaoheihe.utils.d.u0(str);
        baseActivity.V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().H1(postEncryptParamsObjU0.getData(), postEncryptParamsObjU0.getKey(), postEncryptParamsObjU0.getSid(), postEncryptParamsObjU0.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(baseActivity, webView)));
    }
}
