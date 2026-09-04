package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d extends a {
    public d(Context context, String str, boolean z10) {
        this.f60783d = z10;
        if (a(TextUtils.isEmpty(str) ? "grs_app_global_route_config.json" : str, context) == 0) {
            this.f60782c = true;
        }
    }

    public d(boolean z10, boolean z11) {
        this.f60783d = z11;
        this.f60782c = z10;
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int b(String str) {
        this.f60780a = new com.huawei.hms.framework.network.grs.local.model.a();
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONArray("applications").getJSONObject(0);
            this.f60780a.b(jSONObject.getString("name"));
            JSONArray jSONArray = jSONObject.getJSONArray("services");
            if (jSONArray != null && jSONArray.length() != 0) {
                if (jSONObject.has("customservices")) {
                    b(jSONObject.getJSONArray("customservices"));
                }
                return 0;
            }
            return -1;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV2", "parse appbean failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int c(String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        this.f60781b = new ArrayList(16);
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("countryOrAreaGroups")) {
                jSONArray = jSONObject.getJSONArray("countryOrAreaGroups");
            } else if (jSONObject.has("countryGroups")) {
                jSONArray = jSONObject.getJSONArray("countryGroups");
            } else {
                Logger.e("LocalManagerV2", "maybe local config json is wrong because the default countryOrAreaGroups isn't config.");
                jSONArray = null;
            }
            if (jSONArray == null) {
                return -1;
            }
            if (jSONArray.length() != 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    com.huawei.hms.framework.network.grs.local.model.b bVar = new com.huawei.hms.framework.network.grs.local.model.b();
                    bVar.b(jSONObject2.getString("id"));
                    bVar.c(jSONObject2.getString("name"));
                    bVar.a(jSONObject2.getString("description"));
                    if (jSONObject2.has("countriesOrAreas")) {
                        jSONArray2 = jSONObject2.getJSONArray("countriesOrAreas");
                    } else if (jSONObject2.has("countries")) {
                        jSONArray2 = jSONObject2.getJSONArray("countries");
                    } else {
                        Logger.w("LocalManagerV2", "current country or area group has not config countries or areas.");
                        jSONArray2 = null;
                    }
                    HashSet hashSet = new HashSet(16);
                    if (jSONArray2 != null && jSONArray2.length() != 0) {
                        for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                            hashSet.add((String) jSONArray2.get(i11));
                        }
                        bVar.a(hashSet);
                        this.f60781b.add(bVar);
                    }
                    return -1;
                }
            }
            return 0;
        } catch (JSONException e10) {
            Logger.w("LocalManagerV2", "parse countrygroup failed maybe json style is wrong. %s", StringUtils.anonymizeMessage(e10.getMessage()));
            return -1;
        }
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int f(String str) {
        return e(str);
    }
}
