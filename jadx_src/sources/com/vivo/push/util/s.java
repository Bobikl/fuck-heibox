package com.vivo.push.util;

/* JADX INFO: compiled from: OperateUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class s {
    public static int a(com.vivo.push.b.c cVar) {
        w wVarB = w.b();
        int iB = cVar.b();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA = wVarB.a("com.vivo.push_preferences.operate." + iB + "OPERATE_COUNT");
        long jB = jCurrentTimeMillis - wVarB.b("com.vivo.push_preferences.operate." + iB + "START_TIME", 0L);
        if (jB <= 86400000 && jB >= 0) {
            if (iA >= cVar.f()) {
                return 1001;
            }
            wVarB.a("com.vivo.push_preferences.operate." + iB + "OPERATE_COUNT", iA + 1);
            return 0;
        }
        wVarB.a("com.vivo.push_preferences.operate." + iB + "START_TIME", System.currentTimeMillis());
        wVarB.a("com.vivo.push_preferences.operate." + iB + "OPERATE_COUNT", 1);
        return 0;
    }
}
