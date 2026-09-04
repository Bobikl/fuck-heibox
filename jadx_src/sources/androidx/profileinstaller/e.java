package androidx.profileinstaller;

import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: Encoding.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(19)
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f26755a = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f26756b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f26757c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f26758d = 4;

    private e() {
    }

    static int a(int i10) {
        return (((i10 + 8) - 1) & (-8)) / 8;
    }

    static byte[] b(@n0 byte[] bArr) throws IOException {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    @n0
    static RuntimeException c(@p0 String str) {
        return new IllegalStateException(str);
    }

    @n0
    static byte[] d(@n0 InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw c("Not enough bytes to read: " + i10);
            }
            i11 += i12;
        }
        return bArr;
    }

    @n0
    static byte[] e(@n0 InputStream inputStream, int i10, int i11) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = inputStream.read(bArr2);
                if (i13 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw c(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    @n0
    static String f(InputStream inputStream, int i10) throws IOException {
        return new String(d(inputStream, i10), StandardCharsets.UTF_8);
    }

    static long g(@n0 InputStream inputStream, int i10) throws IOException {
        byte[] bArrD = d(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrD[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    static int h(@n0 InputStream inputStream) throws IOException {
        return (int) g(inputStream, 2);
    }

    static long i(@n0 InputStream inputStream) throws IOException {
        return g(inputStream, 4);
    }

    static int j(@n0 InputStream inputStream) throws IOException {
        return (int) g(inputStream, 1);
    }

    static int k(@n0 String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    static void l(@n0 InputStream inputStream, @n0 OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    static void m(@n0 OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    static void n(@n0 OutputStream outputStream, @n0 String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    static void o(@n0 OutputStream outputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void p(@n0 OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 2);
    }

    static void q(@n0 OutputStream outputStream, long j10) throws IOException {
        o(outputStream, j10, 4);
    }

    static void r(@n0 OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 1);
    }
}
