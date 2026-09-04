package org.apache.tools.ant.types;

/* JADX INFO: compiled from: LogLevel.java */
/* JADX INFO: loaded from: classes5.dex */
public class j0 extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j0 f136181c = new j0("error");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j0 f136182d = new j0("warn");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j0 f136183e = new j0("info");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j0 f136184f = new j0("verbose");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j0 f136185g = new j0("debug");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int[] f136186h = {0, 1, 1, 2, 3, 4};

    public j0() {
    }

    private j0(String str) {
        this();
        g(str);
    }

    @Override // org.apache.tools.ant.types.w
    public String[] e() {
        return new String[]{"error", "warn", "warning", "info", "verbose", "debug"};
    }

    public int h() {
        return f136186h[b()];
    }
}
