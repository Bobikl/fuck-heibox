package com.umeng.commonsdk.internal.crash;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: UMCrashUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static String a(Throwable th2) {
        String string = null;
        if (th2 == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            for (Throwable cause = th2.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            string = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            return string;
        } catch (Exception unused) {
            return string;
        }
    }
}
