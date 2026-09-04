package androidx.exifinterface.media;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: ExifInterfaceUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f23471a = "ExifInterfaceUtils";

    /* JADX INFO: compiled from: ExifInterfaceUtils.java */
    @w0(21)
    public static class a {
        private a() {
        }

        @u
        static void a(FileDescriptor fileDescriptor) throws ErrnoException {
            Os.close(fileDescriptor);
        }

        @u
        static FileDescriptor b(FileDescriptor fileDescriptor) throws ErrnoException {
            return Os.dup(fileDescriptor);
        }

        @u
        static long c(FileDescriptor fileDescriptor, long j10, int i10) throws ErrnoException {
            return Os.lseek(fileDescriptor, j10, i10);
        }
    }

    /* JADX INFO: renamed from: androidx.exifinterface.media.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ExifInterfaceUtils.java */
    @w0(23)
    public static class C0169b {
        private C0169b() {
        }

        @u
        static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    private b() {
    }

    static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb2.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    static void b(FileDescriptor fileDescriptor) {
        try {
            a.a(fileDescriptor);
        } catch (Exception unused) {
            Log.e(f23471a, "Error closing fd.");
        }
    }

    static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    static long[] d(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    static int e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int i11 = inputStream.read(bArr);
            if (i11 == -1) {
                return i10;
            }
            i10 += i11;
            outputStream.write(bArr, 0, i11);
        }
    }

    static void f(InputStream inputStream, OutputStream outputStream, int i10) throws IOException {
        byte[] bArr = new byte[8192];
        while (i10 > 0) {
            int iMin = Math.min(i10, 8192);
            int i11 = inputStream.read(bArr, 0, iMin);
            if (i11 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i10 -= i11;
            outputStream.write(bArr, 0, i11);
        }
    }

    static long g(String str) {
        try {
            int iMin = Math.min(str.length(), 3);
            long j10 = Long.parseLong(str.substring(0, iMin));
            while (iMin < 3) {
                j10 *= 10;
                iMin++;
            }
            return j10;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    static boolean h(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
