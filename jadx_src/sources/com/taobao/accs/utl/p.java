package com.taobao.accs.utl;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        JSONObject f98517a = new JSONObject();

        public a a(String str, Integer num) {
            if (num == null) {
                return this;
            }
            try {
                this.f98517a.put(str, num);
            } catch (JSONException unused) {
            }
            return this;
        }

        public a a(String str, Long l10) {
            if (l10 == null) {
                return this;
            }
            try {
                this.f98517a.put(str, l10);
            } catch (JSONException unused) {
            }
            return this;
        }

        public a a(String str, String str2) {
            if (str2 != null && str != null) {
                try {
                    this.f98517a.put(str, str2);
                } catch (JSONException unused) {
                }
            }
            return this;
        }

        public JSONObject a() {
            return this.f98517a;
        }
    }

    public static String a(JSONObject jSONObject, String str, String str2) throws JSONException {
        return (jSONObject != null && jSONObject.has(str)) ? jSONObject.getString(str) : str2;
    }
}
