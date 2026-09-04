package org.apache.tools.ant.util;

import java.lang.management.ManagementFactory;

/* JADX INFO: compiled from: ProcessUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class f1 {
    private f1() {
    }

    public static String a(String str) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        int iIndexOf = name.indexOf(64);
        if (iIndexOf < 1) {
            return str;
        }
        try {
            return Long.toString(Long.parseLong(name.substring(0, iIndexOf)));
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public static void b(String[] strArr) {
        System.out.println(a("<PID>"));
        try {
            Thread.sleep(120000L);
        } catch (Exception unused) {
        }
    }
}
