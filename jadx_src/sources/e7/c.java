package e7;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f118569a = 3617552046287187010L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f118570b = 2334950737559900225L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f118571c = 32;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f118572d = 1896449818;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f118573e = 1114793335;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f118574f = 4096;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f118575g = "UTF-8";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f118576h = 22;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f118577i = 101010256;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f118578j = 65535;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f118579k = 20;

    private c() {
    }

    public static long a(FileChannel fileChannel) throws IOException {
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
        long j10 = size - 22;
        long jMin = Math.min(j10, WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i10 = 0;
        while (true) {
            long j11 = i10;
            if (j11 > jMin) {
                throw new IOException("ZIP End of Central Directory (EOCD) record not found");
            }
            long j12 = j10 - j11;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            fileChannel.position(j12);
            fileChannel.read(byteBufferAllocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            if (byteBufferAllocate.getInt(0) == f118577i) {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j12 + 20);
                fileChannel.read(byteBufferAllocate2);
                byteBufferAllocate2.order(byteOrder);
                short s10 = byteBufferAllocate2.getShort(0);
                if (s10 == i10) {
                    return s10;
                }
            }
            i10++;
        }
    }

    public static long b(FileChannel fileChannel, long j10) throws IOException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        fileChannel.position((fileChannel.size() - j10) - 6);
        fileChannel.read(byteBufferAllocate);
        return byteBufferAllocate.getInt(0);
    }

    private static ByteBuffer c(ByteBuffer byteBuffer, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("size: " + i10);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer d(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("start: " + i10);
        }
        if (i11 < i10) {
            throw new IllegalArgumentException("end < start: " + i11 + " < " + i10);
        }
        int iCapacity = byteBuffer.capacity();
        if (i11 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i11 + " > " + iCapacity);
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i11);
            byteBuffer.position(i10);
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            return byteBufferSlice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(iLimit);
            byteBuffer.position(iPosition);
        }
    }

    public static Map<Integer, ByteBuffer> e(ByteBuffer byteBuffer) throws com.bytedance.hume.readapk.e {
        h(byteBuffer);
        ByteBuffer byteBufferD = d(byteBuffer, 8, byteBuffer.capacity() - 24);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i10 = 0;
        while (byteBufferD.hasRemaining()) {
            i10++;
            if (byteBufferD.remaining() < 8) {
                throw new com.bytedance.hume.readapk.e("Insufficient data to read size of APK Signing Block entry #" + i10);
            }
            long j10 = byteBufferD.getLong();
            if (j10 < 4 || j10 > 2147483647L) {
                throw new com.bytedance.hume.readapk.e("APK Signing Block entry #" + i10 + " size out of range: " + j10);
            }
            int i11 = (int) j10;
            int iPosition = byteBufferD.position() + i11;
            if (i11 > byteBufferD.remaining()) {
                throw new com.bytedance.hume.readapk.e("APK Signing Block entry #" + i10 + " size out of range: " + i11 + ", available: " + byteBufferD.remaining());
            }
            linkedHashMap.put(Integer.valueOf(byteBufferD.getInt()), c(byteBufferD, i11 - 4));
            byteBufferD.position(iPosition);
        }
        return linkedHashMap;
    }

    public static long f(FileChannel fileChannel) {
        return b(fileChannel, a(fileChannel));
    }

    public static e<ByteBuffer, Long> g(FileChannel fileChannel, long j10) throws com.bytedance.hume.readapk.e, IOException {
        if (j10 < 32) {
            throw new com.bytedance.hume.readapk.e("APK too small for APK Signing Block. ZIP Central Directory offset: " + j10);
        }
        fileChannel.position(j10 - 24);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        fileChannel.read(byteBufferAllocate);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new com.bytedance.hume.readapk.e("No APK Signing Block before ZIP Central Directory");
        }
        long j11 = byteBufferAllocate.getLong(0);
        if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
            throw new com.bytedance.hume.readapk.e("APK Signing Block size out of range: " + j11);
        }
        int i10 = (int) (8 + j11);
        long j12 = j10 - ((long) i10);
        if (j12 < 0) {
            throw new com.bytedance.hume.readapk.e("APK Signing Block offset out of range: " + j12);
        }
        fileChannel.position(j12);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
        fileChannel.read(byteBufferAllocate2);
        byteBufferAllocate2.order(byteOrder);
        long j13 = byteBufferAllocate2.getLong(0);
        if (j13 == j11) {
            return e.a(byteBufferAllocate2, Long.valueOf(j12));
        }
        throw new com.bytedance.hume.readapk.e("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
    }

    private static void h(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static e<ByteBuffer, Long> i(FileChannel fileChannel) {
        return g(fileChannel, f(fileChannel));
    }
}
