package com.google.common.cache;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
@f
@o9.b(emulated = true)
public final class LongAdder extends Striped64 implements Serializable, j {
    private static final long serialVersionUID = 7249069246863182397L;

    private void j(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f56957d = 0;
        this.f56955b = null;
        this.f56956c = objectInputStream.readLong();
    }

    private void m(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(sum());
    }

    @Override // com.google.common.cache.j
    public void a() {
        add(1L);
    }

    @Override // com.google.common.cache.j
    public void add(long j10) {
        int length;
        Striped64.b bVar;
        Striped64.b[] bVarArr = this.f56955b;
        if (bVarArr == null) {
            long j11 = this.f56956c;
            if (c(j11, j11 + j10)) {
                return;
            }
        }
        int[] iArr = Striped64.f56949e.get();
        boolean zA = true;
        if (iArr != null && bVarArr != null && (length = bVarArr.length) >= 1 && (bVar = bVarArr[(length - 1) & iArr[0]]) != null) {
            long j12 = bVar.f56967h;
            zA = bVar.a(j12, j12 + j10);
            if (zA) {
                return;
            }
        }
        h(j10, iArr, zA);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return sum();
    }

    @Override // com.google.common.cache.Striped64
    final long e(long j10, long j11) {
        return j10 + j11;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return sum();
    }

    public void i() {
        add(-1L);
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) sum();
    }

    public void k() {
        g(0L);
    }

    public long l() {
        long j10 = this.f56956c;
        Striped64.b[] bVarArr = this.f56955b;
        this.f56956c = 0L;
        if (bVarArr != null) {
            for (Striped64.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f56967h;
                    bVar.f56967h = 0L;
                }
            }
        }
        return j10;
    }

    @Override // java.lang.Number
    public long longValue() {
        return sum();
    }

    @Override // com.google.common.cache.j
    public long sum() {
        long j10 = this.f56956c;
        Striped64.b[] bVarArr = this.f56955b;
        if (bVarArr != null) {
            for (Striped64.b bVar : bVarArr) {
                if (bVar != null) {
                    j10 += bVar.f56967h;
                }
            }
        }
        return j10;
    }

    public String toString() {
        return Long.toString(sum());
    }
}
