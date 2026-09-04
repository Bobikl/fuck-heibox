package cn.fly.verify;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: cn.fly.verify.do, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class Cdo extends RuntimeException {
    public Cdo(String str, Throwable th2) {
        super(str, th2);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStream.println("" + getMessage());
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printWriter.println("" + getMessage());
    }
}
