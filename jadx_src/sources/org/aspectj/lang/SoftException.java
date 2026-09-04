package org.aspectj.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes5.dex */
public class SoftException extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f137665c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f137666b;

    static {
        boolean z10;
        try {
            Class.forName("java.nio.Buffer");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f137665c = z10;
    }

    public SoftException(Throwable th2) {
        this.f137666b = th2;
    }

    public Throwable a() {
        return this.f137666b;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f137666b;
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Throwable th2 = this.f137666b;
        if (f137665c || th2 == null) {
            return;
        }
        printStream.print("Caused by: ");
        th2.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Throwable th2 = this.f137666b;
        if (f137665c || th2 == null) {
            return;
        }
        printWriter.print("Caused by: ");
        th2.printStackTrace(printWriter);
    }
}
