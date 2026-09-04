package com.umeng.analytics.pro;

import java.util.BitSet;

/* JADX INFO: compiled from: TTupleProtocol.java */
/* JADX INFO: loaded from: classes4.dex */
public final class by extends bm {

    /* JADX INFO: compiled from: TTupleProtocol.java */
    public static class a implements bu {
        @Override // com.umeng.analytics.pro.bu
        public bs a(cg cgVar) {
            return new by(cgVar);
        }
    }

    public by(cg cgVar) {
        super(cgVar);
    }

    public static BitSet a(byte[] bArr) {
        BitSet bitSet = new BitSet();
        for (int i10 = 0; i10 < bArr.length * 8; i10++) {
            if ((bArr[(bArr.length - (i10 / 8)) - 1] & (1 << (i10 % 8))) > 0) {
                bitSet.set(i10);
            }
        }
        return bitSet;
    }

    public static byte[] b(BitSet bitSet, int i10) {
        int iCeil = (int) Math.ceil(((double) i10) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i11 = 0; i11 < bitSet.length(); i11++) {
            if (bitSet.get(i11)) {
                int i12 = (iCeil - (i11 / 8)) - 1;
                bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
            }
        }
        return bArr;
    }

    @Override // com.umeng.analytics.pro.bs
    public Class<? extends ca> D() {
        return cd.class;
    }

    public void a(BitSet bitSet, int i10) throws az {
        for (byte b10 : b(bitSet, i10)) {
            a(b10);
        }
    }

    public BitSet b(int i10) throws az {
        int iCeil = (int) Math.ceil(((double) i10) / 8.0d);
        byte[] bArr = new byte[iCeil];
        for (int i11 = 0; i11 < iCeil; i11++) {
            bArr[i11] = u();
        }
        return a(bArr);
    }
}
