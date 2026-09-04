package com.tencent.qcloud.core.auth;

import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class STSCredentialScope {
    static final STSCredentialScope NONE = new STSCredentialScope(null, null, null, null);
    public final String action;
    public final String bucket;
    public final String prefix;
    public final String region;

    public STSCredentialScope(String str, String str2, String str3, String str4) {
        this.action = str;
        this.bucket = str2;
        this.region = str3;
        if (str4 == null || str4.charAt(0) != '/') {
            this.prefix = str4;
        } else {
            this.prefix = str4.substring(1);
        }
    }

    public static String jsonify(STSCredentialScope[] sTSCredentialScopeArr) {
        JSONArray jSONArray = new JSONArray();
        for (STSCredentialScope sTSCredentialScope : sTSCredentialScopeArr) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", sTSCredentialScope.action);
                jSONObject.put("bucket", sTSCredentialScope.bucket);
                jSONObject.put("prefix", sTSCredentialScope.prefix);
                jSONObject.put("region", sTSCredentialScope.region);
                jSONArray.put(jSONObject);
            } catch (JSONException unused) {
            }
        }
        return jSONArray.toString();
    }

    public static STSCredentialScope[] toArray(STSCredentialScope... sTSCredentialScopeArr) {
        return sTSCredentialScopeArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof STSCredentialScope)) {
            return false;
        }
        STSCredentialScope sTSCredentialScope = (STSCredentialScope) obj;
        return TextUtils.equals(this.action, sTSCredentialScope.action) && TextUtils.equals(this.bucket, sTSCredentialScope.bucket) && TextUtils.equals(this.prefix, sTSCredentialScope.prefix) && TextUtils.equals(this.region, sTSCredentialScope.region);
    }

    public STSCredentialScope[] toArray() {
        return toArray(this);
    }
}
