package com.heytap.openid.sdk;

import android.app.OplusNotificationManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.android.id.impl.IdProviderImpl;
import g0.a;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class m_b extends com.heytap.openid.base.m_b {

    public class m_a implements Runnable {
        public final /* synthetic */ Context m_a;

        public m_a(Context context) {
            this.m_a = context;
        }

        @Override // java.lang.Runnable
        public native void run();
    }

    /* JADX INFO: renamed from: com.heytap.openid.sdk.m_b$m_b, reason: collision with other inner class name */
    public static class C0501m_b {
        public static final m_b m_a = new m_b();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.heytap.openid.base.m_b
    public HashMap<String, String> m_a(Context context, List<String> list) {
        String openid;
        OplusNotificationManager oplusNotificationManager;
        HashMap<String, String> map = new HashMap<>();
        if (this.m_b.equals("OP_APP")) {
            if (list.contains("OUID_STATUS") && !m_c.m_b.m_a.m_k) {
                map.put("OUID_STATUS", Settings.Secure.getInt(context.getContentResolver(), com.heytap.openid.sdk.m_a.m_b.equals(a.f118921e) ? "openid_toggle" : "stdid_toggle", 1) != 1 ? "FALSE" : "TRUE");
                list.remove("OUID_STATUS");
                m_h.m_a("2041");
            }
            if (list.contains("OUID")) {
                if (com.heytap.openid.sdk.m_a.m_b.equals(a.f118921e)) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        com.heytap.openid.framework.m_a m_aVar = com.heytap.openid.framework.m_a.C0497m_a.m_a;
                        IdProviderImpl idProviderImpl = m_aVar.m_a;
                        if (idProviderImpl != null) {
                            try {
                                openid = idProviderImpl.getOpenid(context, "OUID");
                            } catch (Error | Exception e10) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("1086: ");
                                sb2.append(e10.getMessage() != null ? e10.getMessage() : e10.getLocalizedMessage());
                                Log.e("IDHelper", sb2.toString());
                                oplusNotificationManager = m_aVar.m_b;
                                if (oplusNotificationManager != null) {
                                    try {
                                        openid = oplusNotificationManager.getStdid(context.getPackageName(), Binder.getCallingUid(), "OUID");
                                    } catch (Error | Exception e11) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("1087: ");
                                        sb3.append(e11.getMessage() != null ? e11.getMessage() : e11.getLocalizedMessage());
                                        Log.e("IDHelper", sb3.toString());
                                        openid = "";
                                    }
                                } else {
                                    openid = "";
                                }
                            }
                        } else {
                            oplusNotificationManager = m_aVar.m_b;
                            if (oplusNotificationManager != null) {
                                openid = oplusNotificationManager.getStdid(context.getPackageName(), Binder.getCallingUid(), "OUID");
                            } else {
                                openid = "";
                            }
                        }
                        m_h.m_a("2042");
                        if (TextUtils.isEmpty(openid)) {
                            Log.e("IDHelper", "1088");
                        } else {
                            map.put("OUID", openid);
                            list.remove("OUID");
                        }
                    } else if (m_c.m_b.m_a.m_j) {
                        m_h.m_a("2046");
                        m_a(context, list, map);
                    }
                } else {
                    m_a(context, list, map);
                    m_h.m_a("2052");
                }
            }
        } else if (this.m_b.equals("MCS_APP")) {
            if (list.contains("OUID_STATUS")) {
                map.put("OUID_STATUS", "TRUE");
                list.remove("OUID_STATUS");
                m_h.m_a("2043");
            }
            if (list.contains("OUID")) {
                m_h.m_a("2044");
                if (m_i.m_b.m_a.m_j) {
                    m_a(context, list, map);
                }
            }
        }
        return map;
    }

    public final void m_a(Context context, List<String> list, HashMap<String, String> map) {
        String string = Settings.Secure.getString(context.getContentResolver(), "oplus_omes_stdid_ouid");
        if (TextUtils.isEmpty(string)) {
            m_h.m_a("2045");
            return;
        }
        map.put("OUID", string);
        list.remove("OUID");
        com.heytap.openid.sdk.m_a.m_a.execute(new m_a(context));
    }

    @Override // com.heytap.openid.base.m_b
    public void m_a(Context context, List<String> list, boolean z10) {
        (this.m_b.equals("OP_APP") ? m_c.m_b.m_a : m_i.m_b.m_a).m_a(context, list, z10);
    }
}
