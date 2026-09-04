package com.huawei.agconnect.config.impl;

import android.util.Log;
import com.umeng.socialize.common.SocializeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f60145a;

    h(InputStream inputStream, String str) {
        this.f60145a = a(inputStream);
        a(str);
    }

    private JSONObject a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(Utils.toString(inputStream, "UTF-8"));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    private void a(String str) {
        try {
            JSONObject jSONObjectB = b(str);
            if (jSONObjectB == null) {
                return;
            }
            String strA = a("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal("0.0");
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(strA));
            } catch (NumberFormatException unused) {
                Log.d("InputStreamReader", "configuration_version to double error");
            }
            if (bigDecimal.compareTo(new BigDecimal(org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d)) == 0) {
                this.f60145a.getJSONObject("client").put("app_id", jSONObjectB.getString("app_id"));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal(SocializeConstants.PROTOCOL_VERSON)) >= 0) {
                Iterator<String> itKeys = jSONObjectB.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"package_name".equals(next)) {
                        a(next, jSONObjectB.get(next), this.f60145a);
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.d("InputStreamReader", "JSONException when reading the 'appInfos' from InputStream.");
        }
    }

    private void a(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            a(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    private JSONObject b(String str) throws JSONException {
        JSONArray jSONArray = this.f60145a.getJSONArray("appInfos");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject.getString("package_name").equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // com.huawei.agconnect.config.impl.d
    public String a(String str, String str2) {
        if (str.endsWith("/")) {
            return str2;
        }
        String[] strArrSplit = str.split("/");
        try {
            JSONObject jSONObject = this.f60145a;
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                if (i10 == strArrSplit.length - 1) {
                    str = jSONObject.get(strArrSplit[i10]).toString();
                    return str;
                }
                jSONObject = jSONObject.getJSONObject(strArrSplit[i10]);
            }
        } catch (JSONException unused) {
            Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f60145a.toString().hashCode() + '}';
    }
}
