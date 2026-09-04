package com.ss.bytertc.base.utils;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes10.dex */
public class ExceptionUtils {
    public static String cause(Throwable th2) {
        String string = null;
        while (th2 != null && th2.getCause() != null) {
            string = th2.getCause().toString();
            th2 = th2.getCause();
        }
        return string;
    }

    public static String stackTrace(Throwable th2) {
        th2.printStackTrace(new PrintWriter(new StringWriter()));
        return th2.toString();
    }
}
