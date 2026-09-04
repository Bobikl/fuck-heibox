package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.local.model.CountryCodeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f60736e = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f60737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f60738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f60739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f60740d;

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.a$a, reason: collision with other inner class name */
    public static class C0507a implements com.huawei.hms.framework.network.grs.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f60741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Map<String, String> f60742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IQueryUrlsCallBack f60743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Context f60744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        GrsBaseInfo f60745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f60746f;

        C0507a(String str, Map<String, String> map, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f60741a = str;
            this.f60742b = map;
            this.f60743c = iQueryUrlsCallBack;
            this.f60744d = context;
            this.f60745e = grsBaseInfo;
            this.f60746f = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            Map<String, String> map = this.f60742b;
            if (map != null && !map.isEmpty()) {
                Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f60741a, StringUtils.anonymizeMessage(new JSONObject(this.f60742b).toString()));
                this.f60743c.onCallBackSuccess(this.f60742b);
                return;
            }
            if (this.f60742b != null) {
                Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f60741a);
                this.f60743c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
            Map<String, String> mapA = com.huawei.hms.framework.network.grs.f.b.a(this.f60744d.getPackageName()).a(this.f60744d, this.f60746f, this.f60745e, this.f60741a, true);
            if (mapA == null || mapA.isEmpty()) {
                Logger.e(a.f60736e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f60741a);
            }
            if (mapA == null) {
                mapA = new ConcurrentHashMap<>();
            }
            Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f60741a, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            this.f60743c.onCallBackSuccess(mapA);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            IQueryUrlsCallBack iQueryUrlsCallBack;
            String strJ = dVar.j();
            Map<String, String> mapA = a.a(strJ, this.f60741a);
            if (mapA.isEmpty()) {
                Map<String, String> map = this.f60742b;
                if (map == null || map.isEmpty()) {
                    if (this.f60742b != null) {
                        Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", this.f60741a);
                        this.f60743c.onCallBackFail(-5);
                        return;
                    }
                    if (!TextUtils.isEmpty(strJ)) {
                        Logger.e(a.f60736e, "The serviceName[%s] is not configured on the GRS server.", this.f60741a);
                    }
                    Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls: Get URL from Local JSON File");
                    Map<String, String> mapA2 = com.huawei.hms.framework.network.grs.f.b.a(this.f60744d.getPackageName()).a(this.f60744d, this.f60746f, this.f60745e, this.f60741a, true);
                    if (mapA2 == null || mapA2.isEmpty()) {
                        Logger.e(a.f60736e, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", this.f60741a);
                    }
                    if (mapA2 == null) {
                        mapA2 = new ConcurrentHashMap<>();
                    }
                    Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls: Return [%s] Urls: %s", this.f60741a, StringUtils.anonymizeMessage(new JSONObject(mapA2).toString()));
                    this.f60743c.onCallBackSuccess(mapA2);
                    return;
                }
                Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls: Return [%s][%s] Url: %s", this.f60741a, StringUtils.anonymizeMessage(new JSONObject(this.f60742b).toString()));
                iQueryUrlsCallBack = this.f60743c;
                mapA = this.f60742b;
            } else {
                Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", this.f60741a, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
                iQueryUrlsCallBack = this.f60743c;
            }
            iQueryUrlsCallBack.onCallBackSuccess(mapA);
        }
    }

    public static class b implements com.huawei.hms.framework.network.grs.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f60747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f60748b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        IQueryUrlCallBack f60749c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f60750d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Context f60751e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        GrsBaseInfo f60752f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        com.huawei.hms.framework.network.grs.e.a f60753g;

        b(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, String str3, Context context, GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar) {
            this.f60747a = str;
            this.f60748b = str2;
            this.f60749c = iQueryUrlCallBack;
            this.f60750d = str3;
            this.f60751e = context;
            this.f60752f = grsBaseInfo;
            this.f60753g = aVar;
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a() {
            if (!TextUtils.isEmpty(this.f60750d)) {
                Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f60747a, this.f60748b, StringUtils.anonymizeMessage(this.f60750d));
                this.f60749c.onCallBackSuccess(this.f60750d);
                return;
            }
            if (!TextUtils.isEmpty(this.f60750d)) {
                Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f60747a, this.f60748b);
                this.f60749c.onCallBackFail(-3);
                return;
            }
            Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
            String strA = com.huawei.hms.framework.network.grs.f.b.a(this.f60751e.getPackageName()).a(this.f60751e, this.f60753g, this.f60752f, this.f60747a, this.f60748b, true);
            if (strA == null || strA.isEmpty()) {
                Logger.e(a.f60736e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f60747a, this.f60748b);
            }
            Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f60747a, this.f60748b, StringUtils.anonymizeMessage(strA));
            this.f60749c.onCallBackSuccess(strA);
        }

        @Override // com.huawei.hms.framework.network.grs.b
        public void a(com.huawei.hms.framework.network.grs.g.d dVar) {
            IQueryUrlCallBack iQueryUrlCallBack;
            String str;
            String strJ = dVar.j();
            Map<String, String> mapA = a.a(strJ, this.f60747a);
            if (mapA.containsKey(this.f60748b)) {
                String str2 = a.f60736e;
                String str3 = this.f60748b;
                Logger.i(str2, "GrsClientManager.ayncGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", this.f60747a, str3, StringUtils.anonymizeMessage(mapA.get(str3)));
                iQueryUrlCallBack = this.f60749c;
                str = mapA.get(this.f60748b);
            } else {
                if (TextUtils.isEmpty(this.f60750d)) {
                    if (!TextUtils.isEmpty(this.f60750d)) {
                        Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", this.f60747a, this.f60748b);
                        this.f60749c.onCallBackFail(-5);
                        return;
                    }
                    if (!TextUtils.isEmpty(strJ)) {
                        Logger.e(a.f60736e, "The serviceName[%s][%s] is not configured on the GRS server.", this.f60747a, this.f60748b);
                    }
                    Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrl: Get URL from Local JSON File");
                    String strA = com.huawei.hms.framework.network.grs.f.b.a(this.f60751e.getPackageName()).a(this.f60751e, this.f60753g, this.f60752f, this.f60747a, this.f60748b, true);
                    if (strA == null || strA.isEmpty()) {
                        Logger.e(a.f60736e, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", this.f60747a, this.f60748b);
                    }
                    Logger.i(a.f60736e, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f60747a, this.f60748b, StringUtils.anonymizeMessage(strA));
                    this.f60749c.onCallBackSuccess(strA);
                    return;
                }
                String str4 = a.f60736e;
                String str5 = this.f60748b;
                Logger.i(str4, "GrsClientManager.ayncGetGrsUrl: Return [%s][%s] Url: %s", this.f60747a, str5, StringUtils.anonymizeMessage(mapA.get(str5)));
                iQueryUrlCallBack = this.f60749c;
                str = this.f60750d;
            }
            iQueryUrlCallBack.onCallBackSuccess(str);
        }
    }

    public a(GrsBaseInfo grsBaseInfo, com.huawei.hms.framework.network.grs.e.a aVar, g gVar, com.huawei.hms.framework.network.grs.e.c cVar) {
        this.f60737a = grsBaseInfo;
        this.f60738b = aVar;
        this.f60739c = gVar;
        this.f60740d = cVar;
    }

    public static CountryCodeBean a(Context context, boolean z10) {
        return new CountryCodeBean(context, z10);
    }

    public static Map<String, Map<String, String>> a(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        if (TextUtils.isEmpty(str)) {
            Logger.v(f60736e, "isSpExpire jsonValue is null.");
            return concurrentHashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                if (!TextUtils.isEmpty(next)) {
                    concurrentHashMap.put(next, a(jSONObject2));
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.w(f60736e, "getServicesUrlsMap occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    private Map<String, String> a(String str, com.huawei.hms.framework.network.grs.e.b bVar, Context context) {
        Map<String, String> mapA = this.f60738b.a(this.f60737a, str, bVar, context);
        if (mapA != null && !mapA.isEmpty()) {
            Logger.i(f60736e, "GrsClientManager.getUrlsLocal: Get URL from GRS Server Cache");
            return mapA;
        }
        Map<String, String> mapA2 = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f60738b, this.f60737a, str, false);
        Logger.i(f60736e, "GrsClientManager.getUrlsLocal: Get URL from Local JSON File");
        return mapA2 != null ? mapA2 : new HashMap();
    }

    public static Map<String, String> a(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            Logger.w(f60736e, "isSpExpire jsonValue from server is null.");
            return map;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.has(str2) ? jSONObject.getJSONObject(str2) : null;
            if (jSONObject2 == null) {
                Logger.w(f60736e, "getServiceNameUrls: paser null from server json data by {%s}.", str2);
                return map;
            }
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject2.get(next).toString());
            }
            return map;
        } catch (JSONException e10) {
            Logger.w(f60736e, "Method{getServiceNameUrls} query url from SP occur an JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return map;
        }
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String string = jSONObject.get(next).toString();
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string)) {
                    concurrentHashMap.put(next, string);
                }
            }
            return concurrentHashMap;
        } catch (JSONException e10) {
            Logger.w(f60736e, "getServiceUrls occur a JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return concurrentHashMap;
        }
    }

    public String a(Context context, String str, int i10) {
        com.huawei.hms.framework.network.grs.g.d dVarA = this.f60739c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f60737a, context), str, this.f60740d, i10);
        if (dVarA == null) {
            return "";
        }
        return dVarA.m() ? this.f60738b.a().a(this.f60737a.getGrsParasKey(true, true, context), "") : dVarA.j();
    }

    public String a(String str, String str2, Context context, int i10) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String strA = a(str, bVar, context).get(str2);
        if (bVar.a() && !TextUtils.isEmpty(strA)) {
            Logger.i(f60736e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strA));
            return strA;
        }
        String strA2 = a(context, str, i10);
        String str3 = a(strA2, str).get(str2);
        if (!TextUtils.isEmpty(str3)) {
            Logger.i(f60736e, "GrsClientManager.synGetGrsUrl: Get URL from Current Called GRS Server, Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            return str3;
        }
        if (TextUtils.isEmpty(strA)) {
            if (!TextUtils.isEmpty(strA2)) {
                Logger.e(f60736e, "The serviceName[%s][%s] is not configured on the GRS server.", str, str2);
            }
            String str4 = f60736e;
            Logger.i(str4, "GrsClientManager.synGetGrsUrl: Get URL from Local JSON File.");
            strA = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f60738b, this.f60737a, str, str2, true);
            if (strA == null || strA.isEmpty()) {
                Logger.e(str4, "The serviceName[%s][%s] is not configured in the JSON configuration files to reveal all the details", str, str2);
            }
        }
        Logger.i(f60736e, "GrsClientManager.synGetGrsUrl: Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(strA));
        return strA;
    }

    public Map<String, String> a(String str, Context context, int i10) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> mapA = a(str, bVar, context);
        if (bVar.a() && !mapA.isEmpty()) {
            Logger.i(f60736e, "Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            return mapA;
        }
        String strA = a(context, str, i10);
        Map<String, String> mapA2 = a(strA, str);
        if (!mapA2.isEmpty()) {
            Logger.i(f60736e, "GrsClientManager.synGetGrsUrls: Get URL from Current Called GRS Server Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA2).toString()));
            return mapA2;
        }
        if (mapA.isEmpty()) {
            if (!TextUtils.isEmpty(strA)) {
                Logger.e(f60736e, "The serviceName[%s] is not configured on the GRS server.", str);
            }
            String str2 = f60736e;
            Logger.i(str2, "GrsClientManager.synGetGrsUrls: Get URL from Local JSON File.");
            mapA = com.huawei.hms.framework.network.grs.f.b.a(context.getPackageName()).a(context, this.f60738b, this.f60737a, str, true);
            if (mapA == null || mapA.isEmpty()) {
                Logger.e(str2, "The serviceName[%s] is not configured in the JSON configuration files to reveal all the details", str);
            }
        }
        String str3 = f60736e;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = StringUtils.anonymizeMessage(mapA != null ? new JSONObject(mapA).toString() : "");
        Logger.i(str3, "GrsClientManager.synGetGrsUrls: Return [%s] Urls: %s", objArr);
        return mapA;
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, Context context, int i10) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        Map<String, String> mapA = a(str, bVar, context);
        if (!bVar.a()) {
            this.f60739c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f60737a, context), new C0507a(str, mapA, iQueryUrlsCallBack, context, this.f60737a, this.f60738b), str, this.f60740d, i10);
            return;
        }
        if (mapA.isEmpty()) {
            Logger.i(f60736e, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls is Empty", str);
            iQueryUrlsCallBack.onCallBackFail(-5);
        } else {
            String str2 = f60736e;
            Logger.i(str2, "GrsClientManager.ayncGetGrsUrls：Return [%s] Urls: %s", str, StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            Logger.i(str2, "ayncGetGrsUrls: %s", StringUtils.anonymizeMessage(new JSONObject(mapA).toString()));
            iQueryUrlsCallBack.onCallBackSuccess(mapA);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, Context context, int i10) {
        com.huawei.hms.framework.network.grs.e.b bVar = new com.huawei.hms.framework.network.grs.e.b();
        String str3 = a(str, bVar, context).get(str2);
        if (!bVar.a()) {
            this.f60739c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f60737a, context), new b(str, str2, iQueryUrlCallBack, str3, context, this.f60737a, this.f60738b), str, this.f60740d, i10);
        } else if (TextUtils.isEmpty(str3)) {
            Logger.i(f60736e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url is Empty", str, str2);
            iQueryUrlCallBack.onCallBackFail(-5);
        } else {
            Logger.i(f60736e, "GrsClientManager.ayncGetGrsUrl：Return [%s][%s] Url: %s", str, str2, StringUtils.anonymizeMessage(str3));
            iQueryUrlCallBack.onCallBackSuccess(str3);
        }
    }
}
