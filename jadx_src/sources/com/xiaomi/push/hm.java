package com.xiaomi.push;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes4.dex */
public class hm extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private hv f107272a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hw f544a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Throwable f545a;

    public hm() {
        this.f107272a = null;
        this.f544a = null;
        this.f545a = null;
    }

    public hm(hv hvVar) {
        this.f544a = null;
        this.f545a = null;
        this.f107272a = hvVar;
    }

    public hm(String str) {
        super(str);
        this.f107272a = null;
        this.f544a = null;
        this.f545a = null;
    }

    public hm(String str, Throwable th2) {
        super(str);
        this.f107272a = null;
        this.f544a = null;
        this.f545a = th2;
    }

    public hm(Throwable th2) {
        this.f107272a = null;
        this.f544a = null;
        this.f545a = th2;
    }

    public Throwable a() {
        return this.f545a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        hv hvVar;
        hw hwVar;
        String message = super.getMessage();
        if (message != null || (hwVar = this.f544a) == null) {
            return (message != null || (hvVar = this.f107272a) == null) ? message : hvVar.toString();
        }
        return hwVar.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f545a != null) {
            printStream.println("Nested Exception: ");
            this.f545a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f545a != null) {
            printWriter.println("Nested Exception: ");
            this.f545a.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String message = super.getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(": ");
        }
        hw hwVar = this.f544a;
        if (hwVar != null) {
            sb2.append(hwVar);
        }
        hv hvVar = this.f107272a;
        if (hvVar != null) {
            sb2.append(hvVar);
        }
        if (this.f545a != null) {
            sb2.append("\n  -- caused by: ");
            sb2.append(this.f545a);
        }
        return sb2.toString();
    }
}
