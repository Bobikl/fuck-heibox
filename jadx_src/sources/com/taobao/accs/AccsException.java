package com.taobao.accs;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class AccsException extends Exception {
    private int mErrorCode;

    public AccsException(int i10) {
        this.mErrorCode = i10;
    }

    public AccsException(String str) {
        super(str);
    }

    public AccsException(String str, int i10) {
        super(str);
        this.mErrorCode = i10;
    }

    public AccsException(String str, Throwable th2, int i10) {
        super(str, th2);
        this.mErrorCode = i10;
    }

    public AccsException(Throwable th2, int i10) {
        super(th2);
        this.mErrorCode = i10;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        printStream.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        printWriter.println("errorCode = " + this.mErrorCode);
        super.printStackTrace(printWriter);
    }
}
