package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Long> f108014a = new HashMap();

    private static void a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f108014a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (jElapsedRealtime - entry.getValue().longValue() > 60000) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f108014a.remove((String) it.next());
        }
    }

    public static boolean a(byte[] bArr, String str) {
        boolean z10 = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String strA = com.xiaomi.push.bp.a(bArr);
            if (!TextUtils.isEmpty(strA)) {
                Map<String, Long> map = f108014a;
                synchronized (map) {
                    if (map.get(strA + str) != null) {
                        z10 = true;
                    } else {
                        map.put(strA + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    a();
                }
            }
        }
        return z10;
    }
}
