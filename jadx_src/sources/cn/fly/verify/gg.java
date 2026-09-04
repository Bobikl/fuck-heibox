package cn.fly.verify;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes6.dex */
public class gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36758a;

    public gg(int i10) {
        this.f36758a = i10;
    }

    private byte[] a(byte[] bArr, int i10) throws Throwable {
        if (bArr.length > i10 - 1) {
            throw new Throwable("Message too large");
        }
        byte[] bArr2 = new byte[i10];
        bArr2[0] = 1;
        int length = bArr.length;
        bArr2[1] = (byte) (length >> 24);
        bArr2[2] = (byte) (length >> 16);
        bArr2[3] = (byte) (length >> 8);
        bArr2[4] = (byte) length;
        System.arraycopy(bArr, 0, bArr2, i10 - length, length);
        return bArr2;
    }

    private byte[] a(byte[] bArr, int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, int i12) throws Throwable {
        if (bArr.length != i11 || i10 != 0) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        BigInteger bigInteger3 = new BigInteger(a(bArr, i12));
        if (bigInteger3.compareTo(bigInteger2) <= 0) {
            return bigInteger3.modPow(bigInteger, bigInteger2).toByteArray();
        }
        throw new Throwable("the message must be smaller than the modulue");
    }

    public byte[] a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        int i10 = this.f36758a / 8;
        int i11 = i10 - 11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);
            int i12 = 0;
            while (bArr.length > i12) {
                try {
                    int iMin = Math.min(bArr.length - i12, i11);
                    byte[] bArrA = a(bArr, i12, iMin, bigInteger, bigInteger2, i10);
                    dataOutputStream2.writeInt(bArrA.length);
                    dataOutputStream2.write(bArrA);
                    i12 += iMin;
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    el.a(dataOutputStream, byteArrayOutputStream);
                    throw th;
                }
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            el.a(dataOutputStream2, byteArrayOutputStream);
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
