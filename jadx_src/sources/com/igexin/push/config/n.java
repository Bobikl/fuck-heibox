package com.igexin.push.config;

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class n {
    public static void a(String str, boolean z10) {
        JSONObject jSONObject;
        String[] strArrA;
        String[] strArrA2;
        String[] strArrA3;
        String[] strArrA4;
        String[] strArrA5;
        com.igexin.a.a.c.b.a("IDCConfigParse parse idc config data : " + str, new Object[0]);
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        if (jSONObject.has("N")) {
            try {
                SDKUrlConfig.setLocation(jSONObject.getString("N"));
            } catch (JSONException unused2) {
            }
        }
        if (jSONObject.has("X1") && (strArrA5 = a(jSONObject, "X1")) != null && strArrA5.length > 0 && !Arrays.equals(strArrA5, SDKUrlConfig.getXfrAddress())) {
            SDKUrlConfig.setXfrAddressIps(strArrA5);
            if (z10) {
                com.igexin.a.a.c.b.a("DT_IDCConfigParse xfr changed, reset and redetect ++++++", new Object[0]);
                com.igexin.push.c.i.a().e();
            }
        }
        if (jSONObject.has("X2") && (strArrA4 = a(jSONObject, "X2")) != null && strArrA4.length > 0) {
            SDKUrlConfig.XFR_ADDRESS_BAK = strArrA4;
        }
        if (jSONObject.has("B") && (strArrA3 = a(jSONObject, "B")) != null && strArrA3.length > 0) {
            SDKUrlConfig.BI_ADDRESS_IPS = strArrA3;
        }
        if (jSONObject.has("C") && (strArrA2 = a(jSONObject, "C")) != null && strArrA2.length > 0) {
            SDKUrlConfig.CONFIG_ADDRESS_IPS = strArrA2;
        }
        if (!jSONObject.has(androidx.exifinterface.media.a.R4) || (strArrA = a(jSONObject, androidx.exifinterface.media.a.R4)) == null || strArrA.length <= 0) {
            return;
        }
        SDKUrlConfig.STATE_ADDRESS_IPS = strArrA;
    }

    private static String[] a(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            int length = jSONArray.length();
            String[] strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                if (str.equals("X1") || str.equals("X2")) {
                    strArr[i10] = "socket://" + jSONArray.getString(i10);
                } else {
                    strArr[i10] = "https://" + jSONArray.getString(i10);
                }
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }
}
