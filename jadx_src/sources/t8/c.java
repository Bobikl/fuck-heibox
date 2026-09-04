package t8;

import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: AesFlushingCipher.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cipher f140678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f140679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f140680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f140681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f140682e;

    public c(int i10, byte[] bArr, long j10, long j11) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.f140678a = cipher;
            int blockSize = cipher.getBlockSize();
            this.f140679b = blockSize;
            this.f140680c = new byte[blockSize];
            this.f140681d = new byte[blockSize];
            long j12 = j11 / ((long) blockSize);
            int i11 = (int) (j11 % ((long) blockSize));
            cipher.init(i10, new SecretKeySpec(bArr, u0.q1(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(b(j10, j12)));
            if (i11 != 0) {
                e(new byte[i11], 0, i11);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public c(int i10, byte[] bArr, @p0 String str, long j10) {
        this(i10, bArr, a(str), j10);
    }

    private static long a(@p0 String str) {
        long j10 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            long jCharAt = j10 ^ ((long) str.charAt(i10));
            j10 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j10;
    }

    private byte[] b(long j10, long j11) {
        return ByteBuffer.allocate(16).putLong(j10).putLong(j11).array();
    }

    private int c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            return this.f140678a.update(bArr, i10, i11, bArr2, i12);
        } catch (ShortBufferException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void d(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i10;
        do {
            int i14 = this.f140682e;
            if (i14 <= 0) {
                int iC = c(bArr, i13, i11, bArr2, i12);
                if (i11 == iC) {
                    return;
                }
                int i15 = i11 - iC;
                int i16 = 0;
                com.google.android.exoplayer2.util.a.i(i15 < this.f140679b);
                int i17 = i12 + iC;
                int i18 = this.f140679b - i15;
                this.f140682e = i18;
                com.google.android.exoplayer2.util.a.i(c(this.f140680c, 0, i18, this.f140681d, 0) == this.f140679b);
                while (i16 < i15) {
                    bArr2[i17] = this.f140681d[i16];
                    i16++;
                    i17++;
                }
                return;
            }
            bArr2[i12] = (byte) (bArr[i13] ^ this.f140681d[this.f140679b - i14]);
            i12++;
            i13++;
            this.f140682e = i14 - 1;
            i11--;
        } while (i11 != 0);
    }

    public void e(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, bArr, i10);
    }
}
