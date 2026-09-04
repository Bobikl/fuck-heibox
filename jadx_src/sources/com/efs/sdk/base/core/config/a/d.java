package com.efs.sdk.base.core.config.a;

import androidx.annotation.n0;
import com.efs.sdk.base.core.util.Log;
import com.igexin.assist.sdk.AssistPushConsts;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SimpleDateFormat f42500a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);

    private static void a(Map<String, String> map, JSONArray jSONArray) {
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i10);
                if (jSONObject != null && jSONObject.length() >= 2) {
                    String strOptString = jSONObject.optString("opt");
                    Object objOpt = jSONObject.opt("set");
                    if (strOptString != null && objOpt != null) {
                        String strOptString2 = jSONObject.optString("lt", null);
                        String strOptString3 = jSONObject.optString(h5.b.f119111k, null);
                        if (strOptString2 != null) {
                            strOptString = strOptString + lg.a.f131412e + strOptString2;
                        }
                        if (strOptString3 != null) {
                            strOptString = strOptString + lg.a.f131412e + strOptString3;
                        }
                        map.put(strOptString, String.valueOf(objOpt));
                    }
                }
            } catch (Throwable th2) {
                Log.e("efs.config", "updateConfigCond error", th2);
                return;
            }
        }
    }

    public static boolean a(@n0 String str, @n0 b bVar) {
        try {
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("config");
            int i10 = jSONObject.getInt("cver");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("common");
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        map.put(next, jSONObjectOptJSONObject2.optString(next, ""));
                    }
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("app_configs");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArrayOptJSONArray.get(i11);
                        if (jSONObject2 != null && jSONObject2.length() == 2) {
                            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("conditions");
                            JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray(AssistPushConsts.MSG_TYPE_ACTIONS);
                            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                                a(map, jSONArrayOptJSONArray3);
                            }
                        }
                    }
                }
            }
            bVar.a(map);
            bVar.f42483a = i10;
            return true;
        } catch (Throwable th2) {
            Log.e("efs.config", "parseConfig error, data is ".concat(String.valueOf(str)), th2);
            return false;
        }
    }
}
