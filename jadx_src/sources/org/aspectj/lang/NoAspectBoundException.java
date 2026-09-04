package org.aspectj.lang;

/* JADX INFO: loaded from: classes5.dex */
public class NoAspectBoundException extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Throwable f137664b;

    public NoAspectBoundException() {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NoAspectBoundException(String str, Throwable th2) {
        if (th2 != null) {
            str = "Exception while initializing " + str + ": " + th2;
        }
        super(str);
        this.f137664b = th2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f137664b;
    }
}
