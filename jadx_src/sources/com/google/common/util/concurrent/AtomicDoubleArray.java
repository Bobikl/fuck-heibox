package com.google.common.util.concurrent;

import com.google.common.primitives.ImmutableLongArray;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public class AtomicDoubleArray implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient AtomicLongArray f59201b;

    public AtomicDoubleArray(int i10) {
        this.f59201b = new AtomicLongArray(i10);
    }

    public AtomicDoubleArray(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = Double.doubleToRawLongBits(dArr[i10]);
        }
        this.f59201b = new AtomicLongArray(jArr);
    }

    private void h(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        ImmutableLongArray.b bVarE = ImmutableLongArray.e();
        for (int i11 = 0; i11 < i10; i11++) {
            bVarE.a(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.f59201b = new AtomicLongArray(bVarE.f().A());
    }

    private void k(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int iG = g();
        objectOutputStream.writeInt(iG);
        for (int i10 = 0; i10 < iG; i10++) {
            objectOutputStream.writeDouble(c(i10));
        }
    }

    @s9.a
    public double a(int i10, double d10) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f59201b.get(i10);
            dLongBitsToDouble = Double.longBitsToDouble(j10) + d10;
        } while (!this.f59201b.compareAndSet(i10, j10, Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public final boolean b(int i10, double d10, double d11) {
        return this.f59201b.compareAndSet(i10, Double.doubleToRawLongBits(d10), Double.doubleToRawLongBits(d11));
    }

    public final double c(int i10) {
        return Double.longBitsToDouble(this.f59201b.get(i10));
    }

    @s9.a
    public final double d(int i10, double d10) {
        long j10;
        double dLongBitsToDouble;
        do {
            j10 = this.f59201b.get(i10);
            dLongBitsToDouble = Double.longBitsToDouble(j10);
        } while (!this.f59201b.compareAndSet(i10, j10, Double.doubleToRawLongBits(dLongBitsToDouble + d10)));
        return dLongBitsToDouble;
    }

    public final double e(int i10, double d10) {
        return Double.longBitsToDouble(this.f59201b.getAndSet(i10, Double.doubleToRawLongBits(d10)));
    }

    public final void f(int i10, double d10) {
        this.f59201b.lazySet(i10, Double.doubleToRawLongBits(d10));
    }

    public final int g() {
        return this.f59201b.length();
    }

    public final void i(int i10, double d10) {
        this.f59201b.set(i10, Double.doubleToRawLongBits(d10));
    }

    public final boolean j(int i10, double d10, double d11) {
        return this.f59201b.weakCompareAndSet(i10, Double.doubleToRawLongBits(d10), Double.doubleToRawLongBits(d11));
    }

    public String toString() {
        int iG = g() - 1;
        if (iG == -1) {
            return okhttp3.t.f132643o;
        }
        StringBuilder sb2 = new StringBuilder((iG + 1) * 19);
        sb2.append('[');
        int i10 = 0;
        while (true) {
            sb2.append(Double.longBitsToDouble(this.f59201b.get(i10)));
            if (i10 == iG) {
                sb2.append(']');
                return sb2.toString();
            }
            sb2.append(',');
            sb2.append(' ');
            i10++;
        }
    }
}
