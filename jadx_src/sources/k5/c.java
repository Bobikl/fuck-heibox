package k5;

/* JADX INFO: loaded from: classes6.dex */
public class c {
    public static byte[] a(int i10) {
        byte[] bArr = {(byte) ((i >> 8) % 256), (byte) (i % 256), (byte) (i % 256), (byte) (i10 % 256)};
        int i11 = i10 >> 8;
        int i12 = i11 >> 8;
        return bArr;
    }
}
