package com.google.common.util.concurrent;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
@u
public class AtomicDouble extends Number implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AtomicLong f59200b;

    public AtomicDouble() {
        this(0.0d);
    }

    public AtomicDouble(double d10) {
        this.f59200b = new AtomicLong(Double.doubleToRawLongBits(d10));
    }

    private void g(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f59200b = new AtomicLong();
        h(objectInputStream.readDouble());
    }

    private void j(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(c());
    }

    @s9.a
    public final double a(double d10) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f59200b.get();
            dLongBitsToDouble = Double.longBitsToDouble(j10) + d10;
        } while (!this.f59200b.compareAndSet(j10, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean b(double d10, double d11) {
        return this.f59200b.compareAndSet(Double.doubleToRawLongBits(d10), Double.doubleToRawLongBits(d11));
    }

    public final double c() {
        return Double.longBitsToDouble(this.f59200b.get());
    }

    @s9.a
    public final double d(double d10) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f59200b.get();
            dLongBitsToDouble = Double.longBitsToDouble(j10);
        } while (!this.f59200b.compareAndSet(j10, Double.doubleToRawLongBits(dLongBitsToDouble + d10)));
        return dLongBitsToDouble;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return c();
    }

    public final double e(double d10) {
        return Double.longBitsToDouble(this.f59200b.getAndSet(Double.doubleToRawLongBits(d10)));
    }

    public final void f(double d10) {
        this.f59200b.lazySet(Double.doubleToRawLongBits(d10));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) c();
    }

    public final void h(double d10) {
        this.f59200b.set(Double.doubleToRawLongBits(d10));
    }

    public final boolean i(double d10, double d11) {
        return this.f59200b.weakCompareAndSet(Double.doubleToRawLongBits(d10), Double.doubleToRawLongBits(d11));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) c();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) c();
    }

    public String toString() {
        return Double.toString(c());
    }
}
