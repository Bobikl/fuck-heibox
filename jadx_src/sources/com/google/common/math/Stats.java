package com.google.common.math;

import com.google.common.base.q;
import com.google.common.base.s;
import com.google.common.base.w;
import com.google.common.primitives.Doubles;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import javax.annotation.CheckForNull;
import org.apache.tools.ant.types.selectors.o;

/* JADX INFO: loaded from: classes7.dex */
@e
@o9.a
@o9.c
public final class Stats implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f58741g = 40;
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f58742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f58743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f58744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f58745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f58746f;

    Stats(long j10, double d10, double d11, double d12, double d13) {
        this.f58742b = j10;
        this.f58743c = d10;
        this.f58744d = d11;
        this.f58745e = d12;
        this.f58746f = d13;
    }

    public static Stats b(byte[] bArr) {
        w.E(bArr);
        w.m(bArr.length == 40, "Expected Stats.BYTES = %s remaining , got %s", 40, bArr.length);
        return r(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
    }

    public static double e(Iterable<? extends Number> iterable) {
        return f(iterable.iterator());
    }

    public static double f(Iterator<? extends Number> it) {
        w.d(it.hasNext());
        double dDoubleValue = it.next().doubleValue();
        long j10 = 1;
        while (it.hasNext()) {
            double dDoubleValue2 = it.next().doubleValue();
            j10++;
            dDoubleValue = (Doubles.n(dDoubleValue2) && Doubles.n(dDoubleValue)) ? dDoubleValue + ((dDoubleValue2 - dDoubleValue) / j10) : l.i(dDoubleValue, dDoubleValue2);
        }
        return dDoubleValue;
    }

    public static double g(double... dArr) {
        w.d(dArr.length > 0);
        double dI = dArr[0];
        for (int i10 = 1; i10 < dArr.length; i10++) {
            double d10 = dArr[i10];
            dI = (Doubles.n(d10) && Doubles.n(dI)) ? dI + ((d10 - dI) / ((double) (i10 + 1))) : l.i(dI, d10);
        }
        return dI;
    }

    public static double h(int... iArr) {
        w.d(iArr.length > 0);
        double dI = iArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            double d10 = iArr[i10];
            dI = (Doubles.n(d10) && Doubles.n(dI)) ? dI + ((d10 - dI) / ((double) (i10 + 1))) : l.i(dI, d10);
        }
        return dI;
    }

    public static double i(long... jArr) {
        w.d(jArr.length > 0);
        double dI = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            double d10 = jArr[i10];
            dI = (Doubles.n(d10) && Doubles.n(dI)) ? dI + ((d10 - dI) / ((double) (i10 + 1))) : l.i(dI, d10);
        }
        return dI;
    }

    public static Stats k(Iterable<? extends Number> iterable) {
        l lVar = new l();
        lVar.d(iterable);
        return lVar.s();
    }

    public static Stats l(Iterator<? extends Number> it) {
        l lVar = new l();
        lVar.e(it);
        return lVar.s();
    }

    public static Stats m(double... dArr) {
        l lVar = new l();
        lVar.f(dArr);
        return lVar.s();
    }

    public static Stats n(int... iArr) {
        l lVar = new l();
        lVar.g(iArr);
        return lVar.s();
    }

    public static Stats o(long... jArr) {
        l lVar = new l();
        lVar.h(jArr);
        return lVar.s();
    }

    static Stats r(ByteBuffer byteBuffer) {
        w.E(byteBuffer);
        w.m(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        return new Stats(byteBuffer.getLong(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble(), byteBuffer.getDouble());
    }

    public long a() {
        return this.f58742b;
    }

    public double c() {
        w.g0(this.f58742b != 0);
        return this.f58746f;
    }

    public double d() {
        w.g0(this.f58742b != 0);
        return this.f58743c;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        Stats stats = (Stats) obj;
        return this.f58742b == stats.f58742b && Double.doubleToLongBits(this.f58743c) == Double.doubleToLongBits(stats.f58743c) && Double.doubleToLongBits(this.f58744d) == Double.doubleToLongBits(stats.f58744d) && Double.doubleToLongBits(this.f58745e) == Double.doubleToLongBits(stats.f58745e) && Double.doubleToLongBits(this.f58746f) == Double.doubleToLongBits(stats.f58746f);
    }

    public int hashCode() {
        return s.b(Long.valueOf(this.f58742b), Double.valueOf(this.f58743c), Double.valueOf(this.f58744d), Double.valueOf(this.f58745e), Double.valueOf(this.f58746f));
    }

    public double j() {
        w.g0(this.f58742b != 0);
        return this.f58745e;
    }

    public double p() {
        return Math.sqrt(q());
    }

    public double q() {
        w.g0(this.f58742b > 0);
        if (Double.isNaN(this.f58744d)) {
            return Double.NaN;
        }
        if (this.f58742b == 1) {
            return 0.0d;
        }
        return d.b(this.f58744d) / a();
    }

    public double s() {
        return Math.sqrt(t());
    }

    public double t() {
        w.g0(this.f58742b > 1);
        if (Double.isNaN(this.f58744d)) {
            return Double.NaN;
        }
        return d.b(this.f58744d) / (this.f58742b - 1);
    }

    public String toString() {
        return a() > 0 ? q.c(this).e("count", this.f58742b).b("mean", this.f58743c).b("populationStandardDeviation", p()).b(o.f136588l, this.f58745e).b(o.f136589m, this.f58746f).toString() : q.c(this).e("count", this.f58742b).toString();
    }

    public double u() {
        return this.f58743c * this.f58742b;
    }

    double v() {
        return this.f58744d;
    }

    public byte[] w() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(40).order(ByteOrder.LITTLE_ENDIAN);
        x(byteBufferOrder);
        return byteBufferOrder.array();
    }

    void x(ByteBuffer byteBuffer) {
        w.E(byteBuffer);
        w.m(byteBuffer.remaining() >= 40, "Expected at least Stats.BYTES = %s remaining , got %s", 40, byteBuffer.remaining());
        byteBuffer.putLong(this.f58742b).putDouble(this.f58743c).putDouble(this.f58744d).putDouble(this.f58745e).putDouble(this.f58746f);
    }
}
