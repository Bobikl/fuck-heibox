package com.google.common.math;

import com.google.common.base.q;
import com.google.common.base.s;
import com.google.common.base.w;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@e
@o9.a
@o9.c
public final class PairedStats implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f58737e = 88;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Stats f58738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Stats f58739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f58740d;

    PairedStats(Stats stats, Stats stats2, double d10) {
        this.f58738b = stats;
        this.f58739c = stats2;
        this.f58740d = d10;
    }

    private static double b(double d10) {
        if (d10 >= 1.0d) {
            return 1.0d;
        }
        if (d10 <= -1.0d) {
            return -1.0d;
        }
        return d10;
    }

    private static double c(double d10) {
        if (d10 > 0.0d) {
            return d10;
        }
        return Double.MIN_VALUE;
    }

    public static PairedStats d(byte[] bArr) {
        w.E(bArr);
        w.m(bArr.length == 88, "Expected PairedStats.BYTES = %s, got %s", 88, bArr.length);
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        return new PairedStats(Stats.r(byteBufferOrder), Stats.r(byteBufferOrder), byteBufferOrder.getDouble());
    }

    public long a() {
        return this.f58738b.a();
    }

    public g e() {
        w.g0(a() > 1);
        if (Double.isNaN(this.f58740d)) {
            return g.a();
        }
        double dV = this.f58738b.v();
        if (dV > 0.0d) {
            return this.f58739c.v() > 0.0d ? g.f(this.f58738b.d(), this.f58739c.d()).b(this.f58740d / dV) : g.b(this.f58739c.d());
        }
        w.g0(this.f58739c.v() > 0.0d);
        return g.i(this.f58738b.d());
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == null || PairedStats.class != obj.getClass()) {
            return false;
        }
        PairedStats pairedStats = (PairedStats) obj;
        return this.f58738b.equals(pairedStats.f58738b) && this.f58739c.equals(pairedStats.f58739c) && Double.doubleToLongBits(this.f58740d) == Double.doubleToLongBits(pairedStats.f58740d);
    }

    public double f() {
        w.g0(a() > 1);
        if (Double.isNaN(this.f58740d)) {
            return Double.NaN;
        }
        double dV = k().v();
        double dV2 = l().v();
        w.g0(dV > 0.0d);
        w.g0(dV2 > 0.0d);
        return b(this.f58740d / Math.sqrt(c(dV * dV2)));
    }

    public double g() {
        w.g0(a() != 0);
        return this.f58740d / a();
    }

    public double h() {
        w.g0(a() > 1);
        return this.f58740d / (a() - 1);
    }

    public int hashCode() {
        return s.b(this.f58738b, this.f58739c, Double.valueOf(this.f58740d));
    }

    double i() {
        return this.f58740d;
    }

    public byte[] j() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(88).order(ByteOrder.LITTLE_ENDIAN);
        this.f58738b.x(byteBufferOrder);
        this.f58739c.x(byteBufferOrder);
        byteBufferOrder.putDouble(this.f58740d);
        return byteBufferOrder.array();
    }

    public Stats k() {
        return this.f58738b;
    }

    public Stats l() {
        return this.f58739c;
    }

    public String toString() {
        return a() > 0 ? q.c(this).f("xStats", this.f58738b).f("yStats", this.f58739c).b("populationCovariance", g()).toString() : q.c(this).f("xStats", this.f58738b).f("yStats", this.f58739c).toString();
    }
}
