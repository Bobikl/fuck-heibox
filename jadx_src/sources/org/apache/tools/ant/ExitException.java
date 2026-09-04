package org.apache.tools.ant;

/* JADX INFO: loaded from: classes5.dex */
public class ExitException extends SecurityException {
    private static final long serialVersionUID = 2772487854280543363L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f133034b;

    public ExitException(int i10) {
        super("ExitException: status " + i10);
        this.f133034b = i10;
    }

    public ExitException(String str, int i10) {
        super(str);
        this.f133034b = i10;
    }

    public int a() {
        return this.f133034b;
    }
}
