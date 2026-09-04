package com.xiaomi.push;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public abstract int a();

    public abstract e a(b bVar);

    public e a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public e a(byte[] bArr, int i10, int i11) throws d {
        try {
            b bVarA = b.a(bArr, i10, i11);
            a(bVarA);
            bVarA.m163a(0);
            return this;
        } catch (d e10) {
            throw e10;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    public abstract void a(c cVar);

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m273a(byte[] bArr, int i10, int i11) {
        try {
            c cVarA = c.a(bArr, i10, i11);
            a(cVarA);
            cVarA.b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    protected boolean a(b bVar, int i10) {
        return bVar.m165a(i10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public byte[] m274a() {
        int iB = b();
        byte[] bArr = new byte[iB];
        m273a(bArr, 0, iB);
        return bArr;
    }

    public abstract int b();
}
