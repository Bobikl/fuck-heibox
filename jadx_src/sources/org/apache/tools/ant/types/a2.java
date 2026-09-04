package org.apache.tools.ant.types;

import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: TimeComparison.java */
/* JADX INFO: loaded from: classes5.dex */
public class a2 extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f136099c = {com.google.android.exoplayer2.text.ttml.d.f49784c0, com.google.android.exoplayer2.text.ttml.d.f49785d0, "equal"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final org.apache.tools.ant.util.j0 f136100d = org.apache.tools.ant.util.j0.O();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a2 f136101e = new a2(com.google.android.exoplayer2.text.ttml.d.f49784c0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a2 f136102f = new a2(com.google.android.exoplayer2.text.ttml.d.f49785d0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a2 f136103g = new a2("equal");

    public a2() {
    }

    public a2(String str) {
        g(str);
    }

    public static int h(long j10, long j11) {
        return i(j10, j11, f136100d.M());
    }

    public static int i(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        long jAbs = Math.abs(j13);
        if (jAbs > Math.abs(j12)) {
            return (int) (j13 / jAbs);
        }
        return 0;
    }

    @Override // org.apache.tools.ant.types.w
    public String[] e() {
        return f136099c;
    }

    public boolean j(long j10, long j11) {
        return k(j10, j11, f136100d.M());
    }

    public boolean k(long j10, long j11, long j12) {
        int iB = b();
        if (iB == -1) {
            throw new BuildException("TimeComparison value not set.");
        }
        if (iB == 0) {
            return j10 - j12 < j11;
        }
        if (iB == 1) {
            return j10 + j12 > j11;
        }
        return Math.abs(j10 - j11) <= j12;
    }
}
