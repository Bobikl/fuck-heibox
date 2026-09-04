package com.igexin.push.core.a;

import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.util.EncryptUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class r extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63497a = com.igexin.push.config.k.f63422a + "_RedirectServerAction";

    private void a(String str, JSONArray jSONArray) {
        try {
            com.igexin.a.a.c.b.a(f63497a + "|start fetch idc config, url : " + str, new Object[0]);
            com.igexin.a.a.b.c.b().a(new com.igexin.push.f.a.e(new com.igexin.push.core.c.a(str, jSONArray)), false, true);
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(f63497a + e10.toString(), new Object[0]);
        }
    }

    public static String[] a(JSONArray jSONArray) {
        String[] strArr = null;
        try {
            strArr = new String[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                strArr[i10] = "https://" + jSONArray.getString(i10);
            }
        } catch (Exception e10) {
            com.igexin.a.a.c.b.a(f63497a + "|parseIDCConfigURL exception" + e10.toString(), new Object[0]);
        }
        return strArr;
    }

    @Override // com.igexin.push.core.a.b
    public boolean a(Object obj, JSONObject jSONObject) {
        com.igexin.a.a.c.b.a(f63497a + "|redirect server resp data : " + jSONObject, new Object[0]);
        try {
            if (!jSONObject.has("action") || !jSONObject.getString("action").equals("redirect_server")) {
                return true;
            }
            long j10 = 0;
            long jOptLong = jSONObject.optLong("delay", 0L) * 1000;
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("address_list");
            com.igexin.a.a.c.b.a("redirect|" + jOptLong + "|" + jSONArray.toString(), new Object[0]);
            int i10 = 0;
            while (i10 < jSONArray.length()) {
                String string = jSONArray.getString(i10);
                int iIndexOf = string.indexOf(44);
                if (iIndexOf > 0) {
                    String strSubstring = string.substring(0, iIndexOf);
                    String strSubstring2 = string.substring(iIndexOf + 1);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    try {
                        long j11 = Long.parseLong(strSubstring2);
                        com.igexin.push.c.e eVar = new com.igexin.push.c.e();
                        eVar.f63356a = "socket://" + strSubstring;
                        Long.signum(j11);
                        eVar.f63357b = jCurrentTimeMillis + (j11 * 1000);
                        arrayList.add(eVar);
                    } catch (NumberFormatException unused) {
                    }
                }
                i10++;
                j10 = 0;
            }
            if (jOptLong >= j10) {
                com.igexin.push.core.d.D = jOptLong;
            }
            if (jSONObject.has("loc") && jSONObject.has("conf")) {
                try {
                    SDKUrlConfig.setLocation(jSONObject.getString("loc"));
                    StringBuilder sb2 = new StringBuilder();
                    String str = f63497a;
                    sb2.append(str);
                    sb2.append(" set group id : ");
                    sb2.append(com.igexin.push.core.d.f63668b);
                    com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
                    JSONArray jSONArray2 = jSONObject.getJSONArray("conf");
                    String[] strArrA = a(jSONArray2);
                    if (strArrA != null && strArrA.length > 1) {
                        String[] idcConfigUrl = SDKUrlConfig.getIdcConfigUrl();
                        if (idcConfigUrl != null && (idcConfigUrl.length <= 1 || strArrA[1].equals(idcConfigUrl[1]))) {
                            com.igexin.a.a.c.b.a(str + "|current idc config url == new idc config url, return", new Object[0]);
                        } else if (com.igexin.push.core.d.f63665aj != 0 && System.currentTimeMillis() - com.igexin.push.core.d.f63665aj <= 7200000) {
                            com.igexin.a.a.c.b.a(str + "|get idc cfg last time less than 2 hours return", new Object[0]);
                        } else {
                            String str2 = strArrA[1];
                            a(str2, jSONArray2);
                        }
                    }
                } catch (Exception e10) {
                    com.igexin.a.a.c.b.a(f63497a + e10.toString(), new Object[0]);
                }
            }
            com.igexin.push.c.i.a().d().a(arrayList);
            if (!EncryptUtils.isLoadSuccess()) {
                return true;
            }
            com.igexin.a.a.c.b.a(f63497a + "|redirect reInit so ~~~~~", new Object[0]);
            EncryptUtils.reset();
            return true;
        } catch (Exception e11) {
            com.igexin.a.a.c.b.a(f63497a + e11.toString(), new Object[0]);
            return true;
        }
    }
}
