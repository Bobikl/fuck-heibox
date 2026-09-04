package com.max.hbcommon.utils;

import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import androidx.annotation.p0;
import androidx.work.WorkManager;
import com.google.gson.JsonObject;
import com.max.hbcommon.analytics.ReportLinkViewTimeWorker;
import com.max.hbcommon.bean.DeviceInfoObj;
import com.max.hbcommon.bean.GeneralSearchReportInfo;
import com.max.hbcommon.bean.PostEncryptParamsObj;
import com.max.hbcommon.bean.ads.ADReportItem;
import com.max.hbcommon.bean.analytics.AnalyticsReportObj;
import com.max.hbcommon.bean.analytics.BBSLinkViewTimeObj;
import com.max.hbcommon.bean.analytics.GeneralSearchReportDataWrapper;
import com.max.hbcommon.bean.analytics.PageEventReportObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import io.reactivex.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.d0;

/* JADX INFO: compiled from: ReportUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f68248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static com.max.hbcache.disk.a f68249b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: compiled from: ReportUtils.java */
    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }
    }

    /* JADX INFO: compiled from: ReportUtils.java */
    public class b extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }
    }

    /* JADX INFO: compiled from: ReportUtils.java */
    public class c extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }
    }

    /* JADX INFO: compiled from: ReportUtils.java */
    public class d extends com.max.hbcommon.network.d<d0> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.f.f32504q1, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzztest", "onError");
        }
    }

    static {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        f68248a = executorServiceNewCachedThreadPool;
        f68249b = new com.max.hbcache.disk.b(BaseApplication.a(), executorServiceNewCachedThreadPool);
    }

    public static void a(String str) {
        com.max.hbcommon.network.c cVarB;
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32205d1, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        String strJ = j(str);
        String strN = n(str);
        if (strJ == null || !(strJ.contains(com.max.xiaoheihe.a.f76428e) || strJ.contains("heybox"))) {
            cVarB = com.max.hbcommon.network.e.b(false);
        } else if (strN.contains("heybox/ad/redirect")) {
            String strA = com.max.hbcommon.utils.a.a();
            ob.a aVar = ob.a.f132240a;
            String strA2 = ob.a.c().a();
            str = str.replaceAll("__version__", strA).replaceAll("__os_type__", "Android").replaceAll("__os_version__", Build.VERSION.RELEASE.trim()).replaceAll("__android_id__", ob.a.c().getDeviceId());
            if (!com.max.hbcommon.utils.c.u(strA2)) {
                str = str.replaceAll("__oaid__", strA2).replaceAll("__oaid_m__", e.j(strA2));
            }
            cVarB = com.max.hbcommon.network.e.b(false);
        } else {
            cVarB = com.max.hbcommon.network.e.a();
        }
        cVarB.a(new HashMap(16), str, new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new d());
    }

    public static void b(@p0 ADReportItem aDReportItem) {
        if (PatchProxy.proxy(new Object[]{aDReportItem}, null, changeQuickRedirect, true, bb.c.f.f32181c1, new Class[]{ADReportItem.class}, Void.TYPE).isSupported || aDReportItem == null) {
            return;
        }
        List<String> ad_cm = aDReportItem.getAd_cm();
        if (!com.max.hbcommon.utils.c.w(ad_cm)) {
            Iterator<String> it = ad_cm.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
        String ad_cm_pro = aDReportItem.getAd_cm_pro();
        if (!com.max.hbcommon.utils.c.u(ad_cm_pro)) {
            ob.a aVar = ob.a.f132240a;
            ob.a.p().c(BaseApplication.a().getApplicationContext(), ad_cm_pro);
        }
        com.max.hbcommon.analytics.d.d("4", lb.d.f131273v5, null, aDReportItem.reportAddition());
    }

    public static void c(@p0 ADReportItem aDReportItem) {
        if (PatchProxy.proxy(new Object[]{aDReportItem}, null, changeQuickRedirect, true, bb.c.f.f32158b1, new Class[]{ADReportItem.class}, Void.TYPE).isSupported || aDReportItem == null) {
            return;
        }
        List<String> ad_pm = aDReportItem.getAd_pm();
        if (!com.max.hbcommon.utils.c.w(ad_pm)) {
            Iterator<String> it = ad_pm.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
        String ad_pm_pro = aDReportItem.getAd_pm_pro();
        if (!com.max.hbcommon.utils.c.u(ad_pm_pro)) {
            ob.a aVar = ob.a.f132240a;
            ob.a.p().c(BaseApplication.a().getApplicationContext(), ad_pm_pro);
        }
        com.max.hbcommon.analytics.d.d("3", lb.d.f131266u5, null, aDReportItem.reportAddition());
    }

    public static void d(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.Z0, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.network.e.a().x8(str, new HashMap(16)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new b());
    }

    public static void e(String str, Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{str, map}, null, changeQuickRedirect, true, bb.c.f.f32135a1, new Class[]{String.class, Map.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.network.e.a().x8(str, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new c());
    }

    public static void f(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, null, changeQuickRedirect, true, bb.c.f.f32297h1, new Class[]{String.class, String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzsearchreport", "generalSearchReport  reportID = " + str + "    type = " + str2 + "    index = " + str3 + "   suggested_from = " + str4);
        com.max.hbcommon.analytics.d.n().add(new GeneralSearchReportInfo(str, str2, Long.valueOf(System.currentTimeMillis() / 1000), str3, str4));
        if (com.max.hbcommon.analytics.d.n().size() >= 10) {
            com.max.hbcommon.analytics.d.g(com.max.hbcommon.analytics.d.n());
            com.max.hbcommon.analytics.d.n().clear();
        }
    }

    public static String g() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32366k1, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.analytics.d.m().size() <= 0) {
            return null;
        }
        AnalyticsReportObj analyticsReportObj = new AnalyticsReportObj();
        analyticsReportObj.setItems(com.max.hbcommon.analytics.d.m());
        String strP = com.max.hbutils.utils.k.p(analyticsReportObj);
        com.max.hbcommon.analytics.d.m().clear();
        return strP;
    }

    public static String h() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32389l1, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.analytics.d.n().size() <= 0) {
            return null;
        }
        String strP = com.max.hbutils.utils.k.p(new GeneralSearchReportDataWrapper("action_count", com.max.hbcommon.analytics.d.n()));
        com.max.hbcommon.analytics.d.n().clear();
        return strP;
    }

    public static z<Result> i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.Y0, new Class[]{String.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        PostEncryptParamsObj postEncryptParamsObjH = e.h(str, true);
        return com.max.hbcommon.network.e.a().z(postEncryptParamsObjH.getData(), postEncryptParamsObjH.getSid(), postEncryptParamsObjH.getKey(), postEncryptParamsObjH.getTime()).I5(io.reactivex.schedulers.b.d());
    }

    public static String j(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32228e1, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getHost();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static z<Result> k(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.X0, new Class[]{String.class}, z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        PostEncryptParamsObj postEncryptParamsObjH = e.h(com.max.hbutils.utils.k.p((JsonObject) com.max.hbutils.utils.k.a(str, JsonObject.class)), true);
        return com.max.hbcommon.network.e.a().h0(postEncryptParamsObjH.getData(), postEncryptParamsObjH.getKey(), postEncryptParamsObjH.getSid(), postEncryptParamsObjH.getTime()).I5(io.reactivex.schedulers.b.d());
    }

    public static String l() {
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32343j1, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        BBSLinkViewTimeObj bBSLinkViewTimeObjK = com.max.hbcommon.analytics.d.k();
        if (bBSLinkViewTimeObjK != null && bBSLinkViewTimeObjK.getDuration().size() + bBSLinkViewTimeObjK.getShows().size() > 0) {
            z10 = true;
        }
        if (!z10) {
            return null;
        }
        String strP = com.max.hbutils.utils.k.p(bBSLinkViewTimeObjK);
        bBSLinkViewTimeObjK.clear();
        return strP;
    }

    public static Pair<String, Boolean> m() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32412m1, new Class[0], Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.analytics.d.v().size() <= 0) {
            return null;
        }
        PageEventReportObj pageEventReportObj = new PageEventReportObj();
        pageEventReportObj.setEvents(com.max.hbcommon.analytics.d.v());
        String strP = com.max.hbutils.utils.k.p(pageEventReportObj);
        com.max.hbcommon.analytics.d.v().clear();
        return Pair.create(strP, Boolean.valueOf(pageEventReportObj.isAppEvent()));
    }

    public static String n(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.f32251f1, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (com.max.hbcommon.utils.c.u(str)) {
            return null;
        }
        try {
            return Uri.parse(str).getPath();
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static void o() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32320i1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        bb.a.f30448c = Boolean.TRUE;
    }

    public static void p(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.f.W0, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzreporttest", "postLinkViewTime =" + str);
        k(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a());
    }

    public static void q() {
        byte[] bArrA;
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32435n1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.work.e.a aVar = new androidx.work.e.a();
        aVar.q("data", l()).q(ReportLinkViewTimeWorker.f66522h, g()).q(ReportLinkViewTimeWorker.f66523i, h());
        Pair<String, Boolean> pairM = m();
        if (pairM != null && (bArrA = h.a((String) pairM.first)) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strD = s.d("key_page_event_" + jCurrentTimeMillis);
            f68249b.b(strD, bArrA);
            com.max.heybox.hblog.g.W("ReportUtils, reportEventAndLinkViewTime, key = " + strD + ", page_event = " + ((String) pairM.first) + ", spend = " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            aVar.q(ReportLinkViewTimeWorker.f66525k, strD);
            aVar.e(ReportLinkViewTimeWorker.f66526l, ((Boolean) pairM.second).booleanValue());
        }
        WorkManager.p().j(new androidx.work.o.a(ReportLinkViewTimeWorker.class).w(aVar.a()).b());
    }

    public static void r() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.f.f32458o1, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String strL = l();
        String strG = g();
        String strH = h();
        Pair<String, Boolean> pairM = m();
        com.max.hbcommon.analytics.d.D();
        s(strL, strG, strH, pairM);
    }

    public static void s(String str, String str2, String str3, Pair<String, Boolean> pair) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, pair}, null, changeQuickRedirect, true, bb.c.f.f32481p1, new Class[]{String.class, String.class, String.class, Pair.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.u(str)) {
            k(str).g(new com.max.hbcommon.network.p());
        }
        if (!com.max.hbcommon.utils.c.u(str3)) {
            i(str3).g(new com.max.hbcommon.network.p());
        }
        if (pair == null || com.max.hbcommon.utils.c.u((String) pair.first)) {
            return;
        }
        com.max.hbcommon.analytics.d.p((String) pair.first, ((Boolean) pair.second).booleanValue()).g(new com.max.hbcommon.network.p());
    }

    public static void t(DeviceInfoObj deviceInfoObj) {
        if (PatchProxy.proxy(new Object[]{deviceInfoObj}, null, changeQuickRedirect, true, bb.c.f.f32274g1, new Class[]{DeviceInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (!com.max.hbcommon.utils.c.u(deviceInfoObj.getOaid())) {
            jsonObject.addProperty("oaid", deviceInfoObj.getOaid());
        }
        if (!com.max.hbcommon.utils.c.u(deviceInfoObj.getAndroid_id())) {
            jsonObject.addProperty(SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID, deviceInfoObj.getAndroid_id());
        }
        if (!com.max.hbcommon.utils.c.u(deviceInfoObj.getUseragent())) {
            jsonObject.addProperty(j5.b.f124277b, deviceInfoObj.getUseragent());
        }
        PostEncryptParamsObj postEncryptParamsObjH = e.h(com.max.hbutils.utils.k.p(jsonObject), true);
        com.max.hbcommon.network.e.a().E1("21", postEncryptParamsObjH.getData(), postEncryptParamsObjH.getKey(), postEncryptParamsObjH.getSid(), postEncryptParamsObjH.getTime()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.schedulers.b.d()).J5(new com.max.hbcommon.network.p());
    }
}
