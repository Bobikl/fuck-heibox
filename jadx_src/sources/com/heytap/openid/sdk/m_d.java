package com.heytap.openid.sdk;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class m_d {
    public static boolean m_a = false;
    public static boolean m_b = false;
    public static boolean m_c = false;
    public static Context m_d;

    public static HashMap<String, String> m_a(int i10) {
        String str;
        String str2;
        m_f m_fVar;
        int iM_a = m_a.m_a(i10);
        if (iM_a != 10000) {
            throw new RuntimeException(iM_a + "");
        }
        ArrayList<String> arrayList = new ArrayList();
        if ((i10 & 8) == 8) {
            arrayList.add("OUID");
            arrayList.add("OUID_STATUS");
        }
        if ((i10 & 32) == 32 && !arrayList.contains("OUID_STATUS")) {
            arrayList.add("OUID_STATUS");
        }
        if ((i10 & 2) == 2) {
            arrayList.add("AUID");
        }
        if ((i10 & 16) == 16) {
            arrayList.add("GUID");
        }
        if ((i10 & 1) == 1) {
            arrayList.add("APID");
        }
        if ((i10 & 4) == 4) {
            arrayList.add("DUID");
        }
        if (!m_a()) {
            HashMap<String, String> map = new HashMap<>();
            for (String str3 : arrayList) {
                map.put(str3, str3 == "OUID_STATUS" ? "FALSE" : "");
            }
            return map;
        }
        m_b m_bVar = m_b.C0501m_b.m_a;
        Context context = m_d;
        HashMap<String, String> mapM_a = m_bVar.m_a(context, arrayList);
        if (arrayList.isEmpty()) {
            str = "2040";
        } else {
            ArrayList arrayList2 = new ArrayList();
            if (m_bVar.m_a.isEmpty()) {
                m_a.m_a(context, m_bVar.m_a);
            }
            for (String str4 : arrayList) {
                String str5 = null;
                if (m_bVar.m_a.containsKey(str4) && (m_fVar = m_bVar.m_a.get(str4)) != null) {
                    try {
                        if (!m_fVar.m_a(str4)) {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(str4);
                            m_h.m_a("1025");
                            m_a.m_a.execute(new com.heytap.openid.base.m_a(m_bVar, context, arrayList3));
                        }
                        str5 = m_fVar.m_a;
                    } catch (Exception e10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("1095: ");
                        sb2.append(e10.getMessage() != null ? e10.getMessage() : e10.getLocalizedMessage());
                        Log.e("IDHelper", sb2.toString());
                    }
                }
                if (str5 == null) {
                    arrayList2.add(str4);
                }
            }
            if (!arrayList2.isEmpty()) {
                m_h.m_a("1026");
                m_bVar.m_a(context, (List<String>) arrayList2, false);
            }
            for (String str6 : arrayList) {
                m_f m_fVar2 = m_bVar.m_a.get(str6);
                if (m_fVar2 == null) {
                    str2 = str6 == "OUID_STATUS" ? "FALSE" : "";
                } else {
                    if (str6.equals("OUID") || str6.equals("OUID_STATUS")) {
                        m_bVar.m_a.remove(str6);
                    }
                    str2 = m_fVar2.m_a;
                }
                mapM_a.put(str6, str2);
            }
            str = "2025";
        }
        m_h.m_a(str);
        return mapM_a;
    }

    public static boolean m_a() {
        String str;
        if (!m_a) {
            str = "1001";
        } else if (!m_b && !m_c) {
            str = "1002";
        } else {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                return true;
            }
            str = "1003";
        }
        Log.e("IDHelper", str);
        return false;
    }
}
