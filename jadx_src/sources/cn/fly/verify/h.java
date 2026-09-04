package cn.fly.verify;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.o0;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.max.xiaoheihe.module.account.AliVerifyDialogActivity;
import com.meituan.robust.Constants;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class h {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final h f36860a = new h();
    }

    private h() {
    }

    public static h a() {
        return a.f36860a;
    }

    private String a(int i10, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (sb2.length() > 0) {
                sb2.append("\u0001");
            }
            String strValueOf = obj == null ? "" : String.valueOf(obj);
            sb2.append(strValueOf);
            if (i10 == 1 || (i10 > 1 && i11 > 0)) {
                sb3.append(Constants.ARRAY_TYPE);
                sb3.append(i11 + i10);
                sb3.append("]");
                sb3.append(strValueOf);
            }
        }
        String string = sb2.toString();
        f.a().a("token " + ((Object) sb3));
        return string;
    }

    public HashMap<String, Object> a(c cVar) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            String strB = cVar.b();
            String strB2 = null;
            if (cVar.c().equals("preVerify")) {
                strB2 = ai.a().c();
            } else if (cVar.c().equals(AliVerifyDialogActivity.f77461k)) {
                strB2 = ai.a().b();
            }
            if (strB2 != null && !strB2.equals(strB)) {
                strB = strB + com.xiaomi.mipush.sdk.Constants.ACCEPT_TIME_SEPARATOR_SP + strB2;
            }
            map.put("serialId", strB);
            map.put("isFirstPre", Boolean.valueOf(cVar.a()));
            map.put("type", cVar.c());
            map.put("method", cVar.d());
            map.put("appkey", ax.d());
            map.put("plat", "1");
            map.put(com.taobao.accs.common.Constants.KEY_MODEL, fz.d.j());
            map.put("deviceName", fz.d.l());
            map.put(o0.P0, String.valueOf(fz.d.g()));
            map.put("duid", am.a());
            if (TextUtils.isEmpty(cVar.q())) {
                cVar.f(as.b());
            }
            map.put("operator", cVar.q());
            map.put(DispatchConstants.MNC, as.a());
            String strS = cVar.s();
            if (TextUtils.isEmpty(strS)) {
                strS = "-1";
            }
            map.put("pmask", strS);
            map.put("sdkver", FlyVerify.getVersion());
            map.put("pkg", fz.d.c());
            map.put("md5", al.a());
            map.put("time", Long.valueOf(cVar.i()));
            map.put("sdkMode", "noui1362");
            map.put("romVersion", al.g());
            map.put(WiseOpenHianalyticsData.UNION_COSTTIME, Long.valueOf(cVar.j()));
            map.put("stepTime", Long.valueOf(cVar.k()));
            map.put("removeTelcom", Boolean.valueOf(cVar.m()));
            map.put("isCache", Boolean.valueOf(cVar.l()));
            map.put("appId", cVar.n());
            map.put("isCdn", Boolean.valueOf(cVar.p()));
            map.put("isError", Boolean.valueOf(cVar.o()));
            map.put("resCode", Integer.valueOf(cVar.e()));
            map.put("innerCode", Integer.valueOf(cVar.g()));
            if (cVar.h() != null) {
                map.put("innerDesc", cVar.h());
            }
            if (cVar.f() != null) {
                map.put("resDesc", cVar.f());
            }
            if (!ai.a().g().contains("deviceId")) {
                map.put("deviceId", al.f());
            }
            map.put("oaid", al.k());
            map.put("slots", Integer.valueOf(as.b(false)));
            map.put("slots2", Integer.valueOf(as.c(false)));
            map.put("subids", as.d(false));
            map.put("factory", fz.d.k());
            map.put("brand", fz.d.l());
            if (cVar.r() != null) {
                map.put("auto", cVar.r());
            }
            map.put("ui", 0);
            if (cVar.d().equals("preVerify")) {
                map.put("netStatus", Integer.valueOf(as.h()));
                map.put(h5.b.f119111k, al.j());
            }
            if (cVar.t() != null) {
                map.put("multiFlag", cVar.t());
            }
            f.a().a("append: method = " + cVar.d() + ", isError = " + cVar.o() + ge.a((HashMap) map));
        } catch (Throwable th2) {
            f.a().c("[FlyVerify] ==>%s", "buildLogParams" + th2.getMessage());
        }
        return map;
    }

    public HashMap<String, Object> a(String str, String str2, String str3) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            map.put("appkey", ax.d());
            map.put(x9.b.A, ax.e());
            map.put("appVersion", fz.d.f());
            map.put("duid", am.a());
            map.put("plat", "1");
            map.put("sdkVersion", Integer.valueOf(FlyVerify.SDK_VERSION_CODE));
            map.put(x9.b.f141140e, fz.d.c());
            map.put("operator", str);
            map.put(g0.a.f118921e, str2);
            if (!ai.a().g().contains("simserial")) {
                map.put("simserial", al.h());
            }
            if (!ai.a().g().contains(com.taobao.accs.common.Constants.KEY_IMSI)) {
                map.put(com.taobao.accs.common.Constants.KEY_IMSI, al.e());
            }
            if (!ai.a().g().contains(DispatchConstants.MNC)) {
                map.put(DispatchConstants.MNC, as.a());
            }
            map.put("subid", Integer.valueOf(as.d()));
            map.put("oaid", al.k());
            map.put("udd", as.f());
            map.put("drd", as.g());
            map.put("fbt", String.valueOf(as.e(as.d("S4B9kH1Lj5WPkIGJS4h9j5BJhIF9gIGOSpCUkA=="))));
            map.put("fwt", String.valueOf(as.e(as.d("UoeEl4RSlpyWl4iQUpqEl4aLj4yWl4KWiJeXjJGKllGbkI8="))));
            map.put("fls", String.valueOf(as.e(as.d("S4B9kH1Lj5WPkIGJS4iLf4ePgZCQhYqDj0qAfg=="))));
            map.put("fda", String.valueOf(as.e(as.d("NGlmeWY="))));
            map.put("fsm", String.valueOf(as.e(as.d("O3BtgG07f4V/gHF5"))));
            map.put("fus", String.valueOf(as.e(as.d("QXZzhnNBhYuFhnd/QYeFd4SF"))));
            map.put("fsf", String.valueOf(as.e(as.d("XJGOoY5coKagoZKaXKKgkp+gXF1coJKhoZablKCMk5ablJKfnZ+Wm6FbpZqZ"))));
            map.put("finp", Build.FINGERPRINT);
            map.put(com.taobao.accs.common.Constants.KEY_MODEL, fz.d.j());
            map.put("factory", fz.d.k());
            map.put("sysverint", String.valueOf(fz.d.g()));
            if (!TextUtils.isEmpty(str3)) {
                map.put("serialId", str3);
            }
            f.a().a(map.toString());
            return map;
        } catch (Throwable th2) {
            f.a().b(th2, "[FlyVerify][%s][%s] ==>%s", "ParamBuilder", "buildCacheParams", th2.getMessage());
            return map;
        }
    }

    public String[] a(s sVar, String str, String str2, String str3) {
        Throwable th2;
        try {
            Object objA = am.a();
            Object objC = fz.d.c();
            Object objD = ax.d();
            Object objA2 = al.a();
            String strF = fz.d.f();
            if (strF.contains("#")) {
                try {
                    strF = strF.replace("#", lg.a.f131412e);
                } catch (Throwable th3) {
                    th2 = th3;
                    f.a().b(th2, "[FlyVerify][%s][%s] ==>%s", "ParamBuilder", "getOriginToken", th2.getMessage());
                    return null;
                }
            }
            String strE = !ai.a().g().contains(com.taobao.accs.common.Constants.KEY_IMSI) ? al.e() : "";
            if (TextUtils.isEmpty(strE)) {
                strE = "";
            }
            Object objK = al.k();
            String strF2 = !ai.a().g().contains("deviceId") ? al.f() : "";
            if (TextUtils.isEmpty(strF2)) {
                strF2 = "";
            }
            try {
                try {
                    String strA = a(1, objD, objA, "1", objC, strF, Integer.valueOf(FlyVerify.SDK_VERSION_CODE), "", objA2, strF2, Long.valueOf(System.currentTimeMillis()), strE, objK, "", "", as.a(), String.valueOf(sVar.f36985e), sVar.f36982b, String.valueOf(ai.a().e()), String.valueOf(ai.a().f()), String.valueOf(ai.a().d()), String.valueOf(as.d()), sVar.c() != null ? sVar.c().b() : "", TextUtils.isEmpty(str) ? "" : str);
                    Object objA3 = ao.a(str2 + strA + str3);
                    int iD = sVar.d();
                    Object objE = sVar.e();
                    Object objF = sVar.f();
                    int iB = as.b(false);
                    List<Integer> listD = as.d(false);
                    StringBuilder sb2 = new StringBuilder();
                    if (listD != null && !listD.isEmpty()) {
                        for (Integer num : listD) {
                            if (sb2.length() > 0) {
                                sb2.append(".");
                            }
                            sb2.append(num);
                        }
                    }
                    Object objH = fz.d.h();
                    Object objK2 = fz.d.k();
                    Object objL = fz.d.l();
                    Object objJ = fz.d.j();
                    int iG = fz.d.g();
                    Object objF2 = as.f();
                    Object objG = as.g();
                    long jE = as.e(as.d("S4B9kH1Lj5WPkIGJS4h9j5BJhIF9gIGOSpCUkA=="));
                    long jE2 = as.e(as.d("UoeEl4RSlpyWl4iQUpqEl4aLj4yWl4KWiJeXjJGKllGbkI8="));
                    long jE3 = as.e(as.d("S4B9kH1Lj5WPkIGJS4iLf4ePgZCQhYqDj0qAfg=="));
                    long jE4 = as.e(as.d("NGlmeWY="));
                    long jE5 = as.e(as.d("O3BtgG07f4V/gHF5"));
                    long jE6 = as.e(as.d("QXZzhnNBhYuFhnd/QYeFd4SF"));
                    long jE7 = as.e(as.d("XJGOoY5coKagoZKaXKKgkp+gXF1coJKhoZablKCMk5ablJKfnZ+Wm6FbpZqZ"));
                    return new String[]{a(23, strA, objA3, "", Integer.valueOf(iD), objE, objF, Integer.valueOf(iB), sb2.toString(), objH, objK2, objL, objJ, Integer.valueOf(iG), objF2, objG, Long.valueOf(jE), Long.valueOf(jE2), Long.valueOf(jE3), Long.valueOf(jE4), Long.valueOf(jE5), Long.valueOf(jE6), Long.valueOf(jE7), Build.FINGERPRINT) + "\u0001", objA3};
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    f.a().b(th2, "[FlyVerify][%s][%s] ==>%s", "ParamBuilder", "getOriginToken", th2.getMessage());
                    return null;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public HashMap<String, Object> b() {
        HashMap<String, Object> map = new HashMap<>();
        try {
            String strC = fz.d.c();
            map.put("appkey", ax.d());
            map.put("appVersion", fz.d.f());
            map.put("plat", "1");
            map.put("sdkVersion", Integer.valueOf(FlyVerify.SDK_VERSION_CODE));
            map.put(x9.b.f141140e, strC);
            map.put("old", Boolean.FALSE);
            map.put("duid", 0);
            map.put("md5", al.a());
            return map;
        } catch (Throwable th2) {
            f.a().b(th2, "[FlyVerify][%s][%s] ==>%s", "ParamBuilder", "buildInitParams", th2.getMessage());
            return map;
        }
    }
}
