package com.bytedance.realx.base;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes6.dex */
public class ExceptionUtils {
    public static String stackTrace(Throwable th2) {
        th2.printStackTrace(new PrintWriter(new StringWriter()));
        return th2.toString();
    }
}
