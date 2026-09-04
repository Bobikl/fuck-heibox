package org.aspectj.lang;

import zj.z;

/* JADX INFO: compiled from: JoinPoint.java */
/* JADX INFO: loaded from: classes5.dex */
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f137679a = "method-execution";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f137680b = "method-call";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f137681c = "constructor-execution";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f137682d = "constructor-call";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f137683e = "field-get";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f137684f = "field-set";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f137685g = "staticinitialization";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f137686h = "preinitialization";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f137687i = "initialization";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f137688j = "exception-handler";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f137689k = "lock";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f137690l = "unlock";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f137691m = "adviceexecution";

    /* JADX INFO: compiled from: JoinPoint.java */
    public interface a extends b {
    }

    /* JADX INFO: compiled from: JoinPoint.java */
    public interface b {
        String b();

        String d();

        String f();

        z g();

        int getId();

        f h();

        String toString();
    }

    String b();

    Object c();

    String d();

    Object[] e();

    String f();

    z g();

    Object getTarget();

    f h();

    b j();

    String toString();
}
