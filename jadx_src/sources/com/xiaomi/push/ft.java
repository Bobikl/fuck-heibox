package com.xiaomi.push;

import android.util.Pair;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Vector<Pair<String, Long>> f107145a = new Vector<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static ConcurrentHashMap<String, Long> f439a = new ConcurrentHashMap<>();

    public static String a() {
        StringBuilder sb2 = new StringBuilder();
        synchronized (f107145a) {
            for (int i10 = 0; i10 < f107145a.size(); i10++) {
                Pair<String, Long> pairElementAt = f107145a.elementAt(i10);
                sb2.append((String) pairElementAt.first);
                sb2.append(":");
                sb2.append(pairElementAt.second);
                if (i10 < f107145a.size() - 1) {
                    sb2.append(";");
                }
            }
            f107145a.clear();
        }
        return sb2.toString();
    }
}
