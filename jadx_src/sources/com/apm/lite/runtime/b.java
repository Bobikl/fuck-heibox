package com.apm.lite.runtime;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f40167a = -30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f40168b;

    public static String a(long j10, String str) {
        try {
            return com.apm.lite.k.i.y(new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/TrackInfo/" + ((j10 - (j10 % 86400000)) / 86400000) + "/" + str));
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    public static void b() {
        File file = new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 5; i10++) {
                com.apm.lite.k.i.r(new File(file, list[i10]));
            }
        }
    }

    public static void c(long j10) throws Throwable {
        if (j10 - f40167a < 30000) {
            return;
        }
        f40167a = j10;
        try {
            com.apm.lite.k.i.j(d(), String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    private static File d() {
        if (f40168b == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            f40168b = new File(com.apm.lite.k.o.E(com.apm.lite.e.m()), "apmlite/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + "/" + com.apm.lite.e.l());
        }
        return f40168b;
    }
}
