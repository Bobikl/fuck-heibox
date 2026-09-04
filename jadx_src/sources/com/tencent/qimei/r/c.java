package com.tencent.qimei.r;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.qimei.sdk.Qimei;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: QimeiComp.java */
/* JADX INFO: loaded from: classes4.dex */
public class c {
    public static synchronized com.tencent.qimei.k.e a(Context context) {
        com.tencent.qimei.k.e eVarA;
        eVarA = null;
        try {
            eVarA = com.tencent.qimei.k.e.a(context, "Q_V3");
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a("[qimei] qimeiFile create error: " + e10.getMessage(), new Object[0]);
        }
        return eVarA;
    }

    public static synchronized Qimei a() {
        String strB = b(com.tencent.qimei.u.d.b().F());
        if (strB != null && !strB.isEmpty()) {
            com.tencent.qimei.n.a.a("[qimei] final jceRequest qimeiJson: " + strB, new Object[0]);
            HashMap<String, String> mapA = a(strB);
            if (mapA == null) {
                return null;
            }
            String str = mapA.get("A3");
            String str2 = mapA.get("A153");
            if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                return null;
            }
            Qimei qimei = new Qimei();
            if (!TextUtils.isEmpty(str)) {
                qimei.a(str);
            }
            if (!TextUtils.isEmpty(str2)) {
                qimei.b(str2);
            }
            return qimei;
        }
        return null;
    }

    public static HashMap<String, String> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>(3);
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
                return map;
            }
        } catch (JSONException e10) {
            com.tencent.qimei.n.a.a("[qimei] jsonToMap error: " + e10.getMessage(), new Object[0]);
            map.put("A3", str);
        }
        return map;
    }

    public static String b(Context context) {
        if (context == null) {
            return "";
        }
        com.tencent.qimei.k.e eVarA = a(context);
        if (eVarA != null) {
            String str = (String) eVarA.a("Q_V3", "");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        com.tencent.qimei.k.b bVarB = com.tencent.qimei.k.b.b();
        String strA = bVarB.a("QIMEI_DENGTA", "qimei_v2", "");
        if (TextUtils.isEmpty(strA)) {
            strA = bVarB.a("BEACON_QIMEI_1", "");
        }
        return TextUtils.isEmpty(strA) ? bVarB.a("QIMEI_DENGTA", "") : strA;
    }
}
