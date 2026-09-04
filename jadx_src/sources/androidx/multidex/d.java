package androidx.multidex;

import io.flutter.embedding.android.KeyboardMap;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: compiled from: ZipUtil.java */
/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f24700a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f24701b = 101010256;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f24702c = 16384;

    /* JADX INFO: compiled from: ZipUtil.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f24703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f24704b;

        a() {
        }
    }

    d() {
    }

    static long a(RandomAccessFile randomAccessFile, a aVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j10 = aVar.f24704b;
        randomAccessFile.seek(aVar.f24703a);
        byte[] bArr = new byte[16384];
        int i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        while (i10 != -1) {
            crc32.update(bArr, 0, i10);
            j10 -= (long) i10;
            if (j10 == 0) {
                break;
            }
            i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
        }
        return crc32.getValue();
    }

    static a b(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j10 = length - 65536;
        long j11 = j10 >= 0 ? j10 : 0L;
        int iReverseBytes = Integer.reverseBytes(f24701b);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f24704b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & KeyboardMap.kValueMask;
                aVar.f24703a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & KeyboardMap.kValueMask;
                return aVar;
            }
            length--;
        } while (length >= j11);
        throw new ZipException("End Of Central Directory signature not found");
    }

    static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return a(randomAccessFile, b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
