package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: AIScanException.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final boolean f61503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final StackTraceElement[] f61504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f61505c;

    static {
        f61503a = System.getProperty("surefire.test.class.path") != null;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[0];
        f61504b = stackTraceElementArr;
        a aVar = new a();
        f61505c = aVar;
        aVar.setStackTrace(stackTraceElementArr);
    }

    private a() {
    }

    private a(String str) {
        super(str);
    }

    public static a a() {
        return f61503a ? new a() : f61505c;
    }

    public static a a(String str) {
        return new a(str);
    }
}
