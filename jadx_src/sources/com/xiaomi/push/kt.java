package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public abstract class kt {
    public int a() {
        return 0;
    }

    public abstract int a(byte[] bArr, int i10, int i11);

    public void a(int i10) {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo652a(byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: a */
    public byte[] mo653a() {
        return null;
    }

    public int b() {
        return -1;
    }

    public int b(byte[] bArr, int i10, int i11) throws ku {
        int i12 = 0;
        while (i12 < i11) {
            int iA = a(bArr, i10 + i12, i11 - i12);
            if (iA <= 0) {
                throw new ku("Cannot read. Remote side has closed. Tried to read " + i11 + " bytes, but only got " + i12 + " bytes.");
            }
            i12 += iA;
        }
        return i12;
    }
}
