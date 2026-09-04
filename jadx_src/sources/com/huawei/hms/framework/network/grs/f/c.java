package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.y;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class c extends a {
    public c(Context context, boolean z10) {
        this.f60783d = z10;
        if (a("grs_sdk_global_route_config.json", context) == 0) {
            this.f60782c = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e A[Catch: JSONException -> 0x0088, LOOP:1: B:20:0x0068->B:22:0x006e, LOOP_END, TryCatch #0 {JSONException -> 0x0088, blocks: (B:3:0x0007, B:4:0x0012, B:6:0x0018, B:8:0x0043, B:14:0x0059, B:16:0x0060, B:20:0x0068, B:22:0x006e, B:23:0x007a, B:24:0x0081, B:10:0x0049, B:12:0x004f, B:13:0x0054), top: B:30:0x0007 }] */
    private List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONObject jSONObject) {
        JSONArray jSONArray;
        HashSet hashSet;
        int i10;
        try {
            ArrayList arrayList = new ArrayList(16);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                bVar.b(next);
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                bVar.c(jSONObject2.getString("name"));
                bVar.a(jSONObject2.getString("description"));
                JSONArray jSONArray2 = null;
                if (!jSONObject2.has("countriesOrAreas")) {
                    if (jSONObject2.has("countries")) {
                        jSONArray = jSONObject2.getJSONArray("countries");
                    } else {
                        Logger.w("LocalManagerV1", "current country or area group has not config countries or areas.");
                    }
                    hashSet = new HashSet(16);
                    if (jSONArray2 != null && jSONArray2.length() != 0) {
                        for (i10 = 0; i10 < jSONArray2.length(); i10++) {
                            hashSet.add((String) jSONArray2.get(i10));
                        }
                        bVar.a(hashSet);
                        arrayList.add(bVar);
                    }
                    return new ArrayList();
                }
                jSONArray = jSONObject2.getJSONArray("countriesOrAreas");
                jSONArray2 = jSONArray;
                hashSet = new HashSet(16);
                if (jSONArray2 != null) {
                    while (i10 < jSONArray2.length()) {
                        hashSet.add((String) jSONArray2.get(i10));
                    }
                    bVar.a(hashSet);
                    arrayList.add(bVar);
                }
                return new ArrayList();
            }
            return arrayList;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse countryGroups failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return new ArrayList();
        }
    }

    public List<com.huawei.hms.framework.network.grs.local.model.b> a(JSONArray jSONArray, JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? new ArrayList() : a(jSONObject);
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int b(String str) {
        this.f60780a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(y.f51568e);
            String string = jSONObject.getString("name");
            long j10 = jSONObject.getLong("cacheControl");
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            this.f60780a.b(string);
            this.f60780a.a(j10);
            return (jSONArray == null || jSONArray.length() == 0) ? -1 : 0;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int c(String str) {
        this.f60781b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = null;
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONObject2 = jSONObject.getJSONObject("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONObject2 = jSONObject.getJSONObject("countryGroups");
            } else {
                Logger.e("LocalManagerV1", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
            }
            if (jSONObject2 == null) {
                return -1;
            }
            if (jSONObject2.length() != 0) {
                this.f60781b.addAll(a(jSONObject2));
            }
            return 0;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a2 A[Catch: JSONException -> 0x0120, TryCatch #0 {JSONException -> 0x0120, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0023, B:8:0x0039, B:10:0x0042, B:11:0x0056, B:13:0x005c, B:15:0x006d, B:22:0x0086, B:23:0x009c, B:25:0x00a2, B:27:0x00b6, B:29:0x00bc, B:31:0x00cd, B:16:0x0072, B:18:0x0078, B:20:0x007f, B:32:0x00e1, B:34:0x00ec, B:38:0x00fb, B:40:0x0105, B:42:0x010c, B:43:0x0113, B:35:0x00f1, B:37:0x00f7, B:39:0x0100), top: B:50:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x010c A[Catch: JSONException -> 0x0120, TryCatch #0 {JSONException -> 0x0120, blocks: (B:3:0x000c, B:4:0x001d, B:6:0x0023, B:8:0x0039, B:10:0x0042, B:11:0x0056, B:13:0x005c, B:15:0x006d, B:22:0x0086, B:23:0x009c, B:25:0x00a2, B:27:0x00b6, B:29:0x00bc, B:31:0x00cd, B:16:0x0072, B:18:0x0078, B:20:0x007f, B:32:0x00e1, B:34:0x00ec, B:38:0x00fb, B:40:0x0105, B:42:0x010c, B:43:0x0113, B:35:0x00f1, B:37:0x00f7, B:39:0x0100), top: B:50:0x000c }] */
    @Override // com.huawei.hms.framework.network.grs.f.a
    public int f(String str) {
        JSONObject jSONObject;
        String str2;
        String string;
        JSONObject jSONObject2;
        Iterator<String> itKeys;
        String next;
        String str3 = "countryGroup";
        String str4 = "countryOrAreaGroup";
        try {
            JSONObject jSONObject3 = new JSONObject(str).getJSONObject("services");
            Iterator<String> itKeys2 = jSONObject3.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                com.huawei.hms.framework.network.grs.local.model.c cVar = new com.huawei.hms.framework.network.grs.local.model.c();
                cVar.b(next2);
                if (!this.f60784e.contains(next2)) {
                    this.f60784e.add(next2);
                    if (this.f60783d) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject(next2);
                        cVar.c(jSONObject4.getString("routeBy"));
                        JSONArray jSONArray = jSONObject4.getJSONArray("servings");
                        int i10 = 0;
                        while (i10 < jSONArray.length()) {
                            JSONObject jSONObject5 = (JSONObject) jSONArray.get(i10);
                            com.huawei.hms.framework.network.grs.local.model.d dVar = new com.huawei.hms.framework.network.grs.local.model.d();
                            if (jSONObject5.has(str4)) {
                                string = jSONObject5.getString(str4);
                            } else {
                                if (jSONObject5.has(str3)) {
                                    string = jSONObject5.getString(str3);
                                } else {
                                    Logger.v("LocalManagerV1", "maybe this service routeBy is unconditional.");
                                    str2 = "no-country";
                                }
                                dVar.a(str2);
                                jSONObject2 = jSONObject5.getJSONObject("addresses");
                                String str5 = str3;
                                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(16);
                                itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    itKeys = itKeys;
                                    next = itKeys.next();
                                    String string2 = jSONObject2.getString(next);
                                    if (TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                                        concurrentHashMap.put(next, jSONObject2.getString(next));
                                        str4 = str4;
                                    }
                                }
                                dVar.a(concurrentHashMap);
                                cVar.a(dVar.b(), dVar);
                                i10++;
                                str3 = str5;
                                str4 = str4;
                            }
                            str2 = string;
                            dVar.a(str2);
                            jSONObject2 = jSONObject5.getJSONObject("addresses");
                            String str6 = str3;
                            ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(16);
                            itKeys = jSONObject2.keys();
                            while (itKeys.hasNext()) {
                                itKeys = itKeys;
                                next = itKeys.next();
                                String string3 = jSONObject2.getString(next);
                                if (TextUtils.isEmpty(next)) {
                                }
                            }
                            dVar.a(concurrentHashMap2);
                            cVar.a(dVar.b(), dVar);
                            i10++;
                            str3 = str6;
                            str4 = str4;
                        }
                        String str7 = str3;
                        String str8 = str4;
                        List<com.huawei.hms.framework.network.grs.local.model.b> listA = null;
                        if (jSONObject4.has("countryOrAreaGroups")) {
                            jSONObject = jSONObject4.getJSONObject("countryOrAreaGroups");
                        } else {
                            if (jSONObject4.has("countryGroups")) {
                                jSONObject = jSONObject4.getJSONObject("countryGroups");
                            } else {
                                Logger.v("LocalManagerV1", "service use default countryOrAreaGroup");
                            }
                            cVar.a(listA);
                            if (this.f60780a == null) {
                                this.f60780a = new com.huawei.hms.framework.network.grs.local.model.a();
                            }
                            this.f60780a.a(next2, cVar);
                            str3 = str7;
                            str4 = str8;
                        }
                        listA = a((JSONArray) null, jSONObject);
                        cVar.a(listA);
                        if (this.f60780a == null) {
                            this.f60780a = new com.huawei.hms.framework.network.grs.local.model.a();
                        }
                        this.f60780a.a(next2, cVar);
                        str3 = str7;
                        str4 = str8;
                    }
                }
            }
            return 0;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV1", "parse 1.0 services failed maybe because of json style.please check! %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }
}
