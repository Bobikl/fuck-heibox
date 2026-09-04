package com.tencent.open.b;

import com.tencent.open.utils.i;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class f {
    public static int a() {
        int iA = i.a(com.tencent.open.utils.g.a(), (String) null).a("Common_HttpRetryCount");
        if (iA == 0) {
            return 2;
        }
        return iA;
    }

    public static int a(String str) {
        int iA;
        if (com.tencent.open.utils.g.a() == null || (iA = i.a(com.tencent.open.utils.g.a(), str).a("Common_BusinessReportFrequency")) == 0) {
            return 100;
        }
        return iA;
    }
}
