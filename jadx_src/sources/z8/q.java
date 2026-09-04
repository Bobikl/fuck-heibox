package z8;

import android.os.ParcelFileDescriptor;
import androidx.annotation.n0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@com.google.android.gms.common.internal.t
@v8.a
@Deprecated
public final class q {
    private q() {
    }

    @v8.a
    public static void a(@Nullable ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @v8.a
    public static void b(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @v8.a
    @Deprecated
    public static long c(@n0 InputStream inputStream, @n0 OutputStream outputStream) throws IOException {
        return d(inputStream, outputStream, false, 1024);
    }

    @v8.a
    @Deprecated
    public static long d(@n0 InputStream inputStream, @n0 OutputStream outputStream, boolean z10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        long j10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr, 0, i10);
                if (i11 == -1) {
                    break;
                }
                j10 += (long) i11;
                outputStream.write(bArr, 0, i11);
            } catch (Throwable th2) {
                if (z10) {
                    b(inputStream);
                    b(outputStream);
                }
                throw th2;
            }
        }
        if (z10) {
            b(inputStream);
            b(outputStream);
        }
        return j10;
    }

    @v8.a
    public static boolean e(@n0 byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @n0
    @v8.a
    @Deprecated
    public static byte[] f(@n0 InputStream inputStream) throws IOException {
        return g(inputStream, true);
    }

    @n0
    @v8.a
    @Deprecated
    public static byte[] g(@n0 InputStream inputStream, boolean z10) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d(inputStream, byteArrayOutputStream, z10, 1024);
        return byteArrayOutputStream.toByteArray();
    }

    @n0
    @v8.a
    @Deprecated
    public static byte[] h(@n0 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        com.google.android.gms.common.internal.p.l(inputStream);
        com.google.android.gms.common.internal.p.l(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
