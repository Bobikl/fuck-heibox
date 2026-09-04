package com.apm.lite.k;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class l {
    public static int a(JSONObject jSONObject, int i10, String... strArr) {
        JSONObject jSONObjectJ = j(jSONObject, strArr);
        if (jSONObjectJ == null) {
            return i10;
        }
        int iOptInt = jSONObjectJ.optInt(strArr[strArr.length - 1], i10);
        q.c("JSONUtil", "normal get jsonInt: " + strArr[strArr.length - 1] + " : " + iOptInt);
        return iOptInt;
    }

    public static JSONArray b(int i10, int i11, JSONArray jSONArray) {
        int i12 = i11 + i10;
        if (jSONArray.length() <= i12) {
            return jSONArray;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i13 = 0; i13 < i10; i13++) {
            jSONArray2.put(jSONArray.opt(i13));
        }
        while (i10 < i12) {
            jSONArray2.put(jSONArray.opt(jSONArray.length() - (i12 - i10)));
            i10++;
        }
        return jSONArray2;
    }

    public static JSONArray c(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectJ = j(jSONObject, strArr);
        if (jSONObjectJ == null) {
            return null;
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectJ.optJSONArray(strArr[strArr.length - 1]);
        q.c("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + jSONArrayOptJSONArray);
        return jSONArrayOptJSONArray;
    }

    public static JSONArray d(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                if (!jSONObject.has(next)) {
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    public static boolean f(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static boolean g(JSONObject jSONObject) {
        return jSONObject == null || jSONObject.length() == 0;
    }

    public static boolean h(JSONObject jSONObject, String str) {
        return g(jSONObject) || f(jSONObject.optJSONArray(str));
    }

    public static String i(JSONObject jSONObject, String... strArr) {
        JSONObject jSONObjectJ = j(jSONObject, strArr);
        if (jSONObjectJ == null) {
            return null;
        }
        String strOptString = jSONObjectJ.optString(strArr[strArr.length - 1]);
        q.c("ApmConfig", "normal get configArray: " + strArr[strArr.length - 1] + " : " + strOptString);
        return strOptString;
    }

    public static JSONObject j(JSONObject jSONObject, String... strArr) {
        if (jSONObject == null) {
            q.d("JSONUtil", "err get JsonFromParent: null json", new RuntimeException());
            return null;
        }
        for (int i10 = 0; i10 < strArr.length - 1; i10++) {
            jSONObject = jSONObject.optJSONObject(strArr[i10]);
            if (jSONObject == null) {
                q.c("JSONUtil", "err get json: not found node:" + strArr[i10]);
                return null;
            }
        }
        return jSONObject;
    }
}
