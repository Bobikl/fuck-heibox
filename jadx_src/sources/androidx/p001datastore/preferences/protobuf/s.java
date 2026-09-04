package androidx.p001datastore.preferences.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: ByteBufferWriter.java */
/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f22591a = 1024;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22592b = 16384;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f22593c = 0.5f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<SoftReference<byte[]>> f22594d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Class<?> f22595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f22596f;

    static {
        Class<?> clsF = f("java.io.FileOutputStream");
        f22595e = clsF;
        f22596f = c(clsF);
    }

    private s() {
    }

    static void a() {
        f22594d.set(null);
    }

    private static byte[] b() {
        SoftReference<byte[]> softReference = f22594d.get();
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    private static long c(Class<?> cls) {
        if (cls == null) {
            return -1L;
        }
        try {
            if (z3.S()) {
                return z3.W(cls.getDeclaredField("channel"));
            }
            return -1L;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static byte[] d(int i10) {
        int iMax = Math.max(i10, 1024);
        byte[] bArrB = b();
        if (bArrB == null || e(iMax, bArrB.length)) {
            bArrB = new byte[iMax];
            if (iMax <= 16384) {
                g(bArrB);
            }
        }
        return bArrB;
    }

    private static boolean e(int i10, int i11) {
        return i11 < i10 && ((float) i11) < ((float) i10) * 0.5f;
    }

    private static Class<?> f(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static void g(byte[] bArr) {
        f22594d.set(new SoftReference<>(bArr));
    }

    static void h(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int iPosition = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (!i(byteBuffer, outputStream)) {
                byte[] bArrD = d(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int iMin = Math.min(byteBuffer.remaining(), bArrD.length);
                    byteBuffer.get(bArrD, 0, iMin);
                    outputStream.write(bArrD, 0, iMin);
                }
            }
        } finally {
            byteBuffer.position(iPosition);
        }
    }

    private static boolean i(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        long j10 = f22596f;
        if (j10 < 0 || !f22595e.isInstance(outputStream)) {
            return false;
        }
        WritableByteChannel writableByteChannel = null;
        try {
            writableByteChannel = (WritableByteChannel) z3.O(outputStream, j10);
        } catch (ClassCastException unused) {
        }
        if (writableByteChannel == null) {
            return false;
        }
        writableByteChannel.write(byteBuffer);
        return true;
    }
}
