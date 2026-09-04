package com.xiaomi.push.service;

import android.content.Context;
import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.ix;
import com.xiaomi.push.jm;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ch implements XMPushService.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f107990a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final boolean f1079a = Log.isLoggable("UNDatas", 3);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Map<Integer, Map<String, List<String>>> f1078a = new HashMap();

    public ch(Context context) {
        f107990a = context;
    }

    private static jm a(String str, String str2, String str3, String str4) {
        jm jmVar = new jm();
        if (str3 != null) {
            jmVar.c(str3);
        }
        if (str != null) {
            jmVar.b(str);
        }
        if (str2 != null) {
            jmVar.a(str2);
        }
        if (str4 != null) {
            jmVar.d(str4);
        }
        jmVar.a(false);
        return jmVar;
    }

    private static void a(Context context, jm jmVar) {
        if (f1079a) {
            com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload message notification:" + jmVar);
        }
        com.xiaomi.push.ah.a(context).a(new ci(jmVar));
    }

    private static void b() {
        HashMap map = new HashMap();
        map.putAll(f1078a);
        if (map.size() > 0) {
            for (Integer num : map.keySet()) {
                Map map2 = (Map) map.get(num);
                if (map2 != null && map2.size() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    for (String str : map2.keySet()) {
                        sb2.append(str);
                        sb2.append(":");
                        List list = (List) map2.get(str);
                        if (!com.xiaomi.push.s.a(list)) {
                            for (int i10 = 0; i10 < list.size(); i10++) {
                                if (i10 != 0) {
                                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                }
                                sb2.append((String) list.get(i10));
                            }
                        }
                        sb2.append(";");
                    }
                    jm jmVarA = a(null, bc.a(), ix.NotificationRemoved.f623a, null);
                    jmVarA.a("removed_reason", String.valueOf(num));
                    jmVarA.a("all_delete_msgId_appId", sb2.toString());
                    com.xiaomi.channel.commonutils.logger.b.b("UNDatas upload all removed messages reason: " + num + " allIds: " + sb2.toString());
                    a(f107990a, jmVarA);
                }
                f1078a.remove(num);
            }
        }
    }

    @Override // com.xiaomi.push.service.XMPushService.n
    /* JADX INFO: renamed from: a */
    public void mo482a() {
        Map<Integer, Map<String, List<String>>> map = f1078a;
        if (map.size() > 0) {
            synchronized (map) {
                b();
            }
        }
    }
}
