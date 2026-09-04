package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.huawei.hms.framework.network.grs.local.model.a f60780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List<com.huawei.hms.framework.network.grs.local.model.b> f60781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f60782c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f60783d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Set<String> f60784e = new HashSet(16);

    private Map<String, String> a(List<com.huawei.hms.framework.network.grs.local.model.b> list, GrsBaseInfo grsBaseInfo, String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
        concurrentHashMap.put("no_route_country", "no-country");
        for (com.huawei.hms.framework.network.grs.local.model.b bVar : list) {
            if (bVar.a().contains(grsBaseInfo.getIssueCountry())) {
                concurrentHashMap.put(grsBaseInfo.getIssueCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getRegCountry())) {
                concurrentHashMap.put(grsBaseInfo.getRegCountry(), bVar.b());
            }
            if (bVar.a().contains(grsBaseInfo.getSerCountry())) {
                concurrentHashMap.put(grsBaseInfo.getSerCountry(), bVar.b());
            }
            if (bVar.a().contains(str)) {
                Logger.v("AbstractLocalManager", "get countryGroupID from geoIp");
                concurrentHashMap.put(str, bVar.b());
            }
        }
        return concurrentHashMap;
    }

    private int b(String str, Context context) {
        if (g(com.huawei.hms.framework.network.grs.h.c.a(str, context)) != 0) {
            return -1;
        }
        Logger.i("AbstractLocalManager", "load APP_CONFIG_FILE success{%s}.", str);
        return 0;
    }

    private int g(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (this.f60783d && (iC = c(str)) != 0) {
            return iC;
        }
        int iB = b(str);
        return iB != 0 ? iB : f(str);
    }

    private int h(String str) {
        List<com.huawei.hms.framework.network.grs.local.model.b> list;
        int iD;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return (!this.f60783d || !((list = this.f60781b) == null || list.isEmpty()) || (iD = d(str)) == 0) ? e(str) : iD;
    }

    int a(String str, Context context) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(GrsApp.getInstance().getBrand("/"));
        sb2.append(str);
        return b(sb2.toString(), context) != 0 ? -1 : 0;
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f60780a;
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z10) {
        Map<String, String> mapA = a(context, aVar, grsBaseInfo, str, z10);
        if (mapA != null) {
            return mapA.get(str2);
        }
        Logger.w("AbstractLocalManager", "addresses not found by routeby in local config{%s}", str);
        return null;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if ("no_route_country".equals(str)) {
            return "no-country";
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> list = this.f60781b;
        if (list != null && !list.isEmpty()) {
            for (com.huawei.hms.framework.network.grs.local.model.b bVar : this.f60781b) {
                if (bVar.a().contains(str)) {
                    return bVar.b();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0075 A[Catch: JSONException -> 0x0091, LOOP:1: B:25:0x006f->B:27:0x0075, LOOP_END, TryCatch #0 {JSONException -> 0x0091, blocks: (B:8:0x0011, B:9:0x0019, B:11:0x001f, B:13:0x004a, B:19:0x0060, B:21:0x0067, B:25:0x006f, B:27:0x0075, B:28:0x0081, B:29:0x008a, B:15:0x0050, B:17:0x0056, B:18:0x005b), top: B:37:0x0011 }] */
    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray) {
        JSONArray jSONArray2;
        HashSet hashSet;
        int i10;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i11);
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(jSONObject.getString("id"));
                bVar.c(jSONObject.getString("name"));
                bVar.a(jSONObject.getString("description"));
                JSONArray jSONArray3 = null;
                if (!jSONObject.has("countriesOrAreas")) {
                    if (jSONObject.has("countries")) {
                        jSONArray2 = jSONObject.getJSONArray("countries");
                    } else {
                        Logger.w("AbstractLocalManager", "current country or area group has not config countries or areas.");
                    }
                    hashSet = new HashSet(16);
                    if (jSONArray3 != null && jSONArray3.length() != 0) {
                        for (i10 = 0; i10 < jSONArray3.length(); i10++) {
                            hashSet.add((String) jSONArray3.get(i10));
                        }
                        bVar.a(hashSet);
                        arrayList.add(bVar);
                    }
                    return new ArrayList();
                }
                jSONArray2 = jSONObject.getJSONArray("countriesOrAreas");
                jSONArray3 = jSONArray2;
                hashSet = new HashSet(16);
                if (jSONArray3 != null) {
                    while (i10 < jSONArray3.length()) {
                        hashSet.add((String) jSONArray3.get(i10));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e10) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return new ArrayList();
        }
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z10) {
        com.huawei.hms.framework.network.grs.local.model.a aVar2 = this.f60780a;
        if (aVar2 == null) {
            Logger.w("AbstractLocalManager", "application data is null.");
            return null;
        }
        com.huawei.hms.framework.network.grs.local.model.c cVarA = aVar2.a(str);
        if (cVarA == null) {
            Logger.w("AbstractLocalManager", "service not found in local config{%s}", str);
            return null;
        }
        String strB = e.b(context, aVar, cVarA.b(), grsBaseInfo, z10);
        if (strB == null) {
            Logger.w("AbstractLocalManager", "country not found by routeby in local config{%s}", cVarA.b());
            return null;
        }
        List<com.huawei.hms.framework.network.grs.local.model.b> listA = cVarA.a();
        com.huawei.hms.framework.network.grs.local.model.d dVarA = cVarA.a((listA == null || listA.size() == 0) ? a(strB) : a(listA, grsBaseInfo, strB).get(strB));
        if (dVarA == null) {
            return null;
        }
        return dVarA.a();
    }

    public void a(Context context, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            Logger.d("AbstractLocalManager", "getBatchLoadSdkSuccessFlag file:" + str);
            if (TextUtils.isEmpty(str) || !Pattern.matches("^grs_sdk_global_route_config_[a-zA-Z]+\\.json$", str)) {
                Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, skipped.", str);
            } else {
                if (h(com.huawei.hms.framework.network.grs.h.c.a(GrsApp.getInstance().getBrand("/") + str, context)) == 0) {
                    Logger.d("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, sucess.", str);
                } else {
                    Logger.w("AbstractLocalManager", "load SDK_CONFIG_FILE: %s, failure.", str);
                }
            }
        }
    }

    public abstract int b(String str);

    public Set<String> b() {
        return this.f60784e;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[PHI: r10
  0x0060: PHI (r10v6 java.lang.String) = (r10v0 java.lang.String), (r10v1 java.lang.String) binds: [B:17:0x005e, B:20:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8 A[PHI: r6
  0x00c8: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v3 java.lang.String) binds: [B:33:0x00c6, B:36:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    protected void b(JSONArray jSONArray) throws JSONException {
        String string;
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            com.huawei.hms.framework.network.grs.local.model.c cVar = new com.huawei.hms.framework.network.grs.local.model.c();
            String string2 = jSONObject.getString("name");
            cVar.b(string2);
            if (!this.f60784e.contains(string2)) {
                this.f60784e.add(string2);
                if (this.f60783d) {
                    cVar.c(jSONObject.getString("routeBy"));
                    JSONArray jSONArray2 = jSONObject.getJSONArray("servings");
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray2.get(i11);
                        com.huawei.hms.framework.network.grs.local.model.d dVar = new com.huawei.hms.framework.network.grs.local.model.d();
                        String str = "countryOrAreaGroup";
                        if (jSONObject2.has("countryOrAreaGroup")) {
                            string = jSONObject2.getString(str);
                        } else {
                            str = "countryGroup";
                            if (jSONObject2.has("countryGroup")) {
                                string = jSONObject2.getString(str);
                            } else {
                                Logger.v("AbstractLocalManager", "maybe this service{%s} routeBy is unconditional.", string2);
                                string = "no-country";
                            }
                        }
                        dVar.a(string);
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("addresses");
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String string3 = jSONObject3.getString(next);
                            if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string3)) {
                                concurrentHashMap.put(next, jSONObject3.getString(next));
                            }
                        }
                        dVar.a(concurrentHashMap);
                        cVar.a(dVar.b(), dVar);
                    }
                    List<com.huawei.hms.framework.network.grs.local.model.b> listA = null;
                    String str2 = "countryOrAreaGroups";
                    if (jSONObject.has("countryOrAreaGroups")) {
                        listA = a(jSONObject.getJSONArray(str2));
                    } else {
                        str2 = "countryGroups";
                        if (jSONObject.has("countryGroups")) {
                            listA = a(jSONObject.getJSONArray(str2));
                        } else {
                            Logger.i("AbstractLocalManager", "service use default countryOrAreaGroup");
                        }
                    }
                    cVar.a(listA);
                    if (this.f60780a == null) {
                        this.f60780a = new com.huawei.hms.framework.network.grs.local.model.a();
                    }
                    this.f60780a.a(string2, cVar);
                }
            }
        }
    }

    public abstract int c(String str);

    public boolean c() {
        return this.f60782c;
    }

    public int d(String str) {
        this.f60781b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = null;
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("AbstractLocalManager", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
            }
            if (jSONArray == null) {
                return -1;
            }
            this.f60781b.addAll(a(jSONArray));
            return 0;
        } catch (JSONException e10) {
            Logger.w("AbstractLocalManager", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    public int e(String str) {
        try {
            b(new JSONObject(str).getJSONArray("services"));
            return 0;
        } catch (JSONException e10) {
            Logger.w("AbstractLocalManager", "parse 2.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    public abstract int f(String str);
}
