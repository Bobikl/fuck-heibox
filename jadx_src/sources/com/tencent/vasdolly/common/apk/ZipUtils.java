package com.tencent.vasdolly.common.apk;

import com.tencent.vasdolly.common.Pair;
import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.x1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ZipUtils {
    private static final int UINT16_MAX_VALUE = 65535;
    private static final int ZIP64_EOCD_LOCATOR_SIG_REVERSE_BYTE_ORDER = 1347094023;
    private static final int ZIP64_EOCD_LOCATOR_SIZE = 20;
    private static final int ZIP_EOCD_CENTRAL_DIR_OFFSET_FIELD_OFFSET = 16;
    private static final int ZIP_EOCD_CENTRAL_DIR_SIZE_FIELD_OFFSET = 12;
    private static final int ZIP_EOCD_COMMENT_LENGTH_FIELD_OFFSET = 20;
    public static final int ZIP_EOCD_REC_MIN_SIZE = 22;
    private static final int ZIP_EOCD_REC_SIG = 101010256;

    private ZipUtils() {
    }

    public static void assertByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    private static int findZipEndOfCentralDirectoryRecord(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        int iCapacity = byteBuffer.capacity();
        if (iCapacity < 22) {
            return -1;
        }
        int i10 = iCapacity - 22;
        int iMin = Math.min(i10, 65535);
        for (int i11 = 0; i11 <= iMin; i11++) {
            int i12 = i10 - i11;
            if (byteBuffer.getInt(i12) == ZIP_EOCD_REC_SIG && getUnsignedInt16(byteBuffer, i12 + 20) == i11) {
                return i12;
            }
        }
        return -1;
    }

    static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair<ByteBuffer, Long> pairFindZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(randomAccessFile, 0);
        return pairFindZipEndOfCentralDirectoryRecord != null ? pairFindZipEndOfCentralDirectoryRecord : findZipEndOfCentralDirectoryRecord(randomAccessFile, 65535);
    }

    private static Pair<ByteBuffer, Long> findZipEndOfCentralDirectoryRecord(RandomAccessFile randomAccessFile, int i10) throws IOException {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("maxCommentSize: " + i10);
        }
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, length - 22)) + 22);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int iFindZipEndOfCentralDirectoryRecord = findZipEndOfCentralDirectoryRecord(byteBufferAllocate);
        if (iFindZipEndOfCentralDirectoryRecord == -1) {
            return null;
        }
        byteBufferAllocate.position(iFindZipEndOfCentralDirectoryRecord);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(byteOrder);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) iFindZipEndOfCentralDirectoryRecord)));
    }

    public static int getUnsignedInt16(ByteBuffer byteBuffer, int i10) {
        return byteBuffer.getShort(i10) & x1.f128661e;
    }

    public static long getUnsignedInt32(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & KeyboardMap.kValueMask;
    }

    public static long getZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        return getUnsignedInt32(byteBuffer, byteBuffer.position() + 16);
    }

    public static long getZipEocdCentralDirectorySizeBytes(ByteBuffer byteBuffer) {
        assertByteOrderLittleEndian(byteBuffer);
        return getUnsignedInt32(byteBuffer, byteBuffer.position() + 12);
    }

    public static final boolean isZip64EndOfCentralDirectoryLocatorPresent(RandomAccessFile randomAccessFile, long j10) throws IOException {
        long j11 = j10 - 20;
        if (j11 < 0) {
            return false;
        }
        randomAccessFile.seek(j11);
        return randomAccessFile.readInt() == ZIP64_EOCD_LOCATOR_SIG_REVERSE_BYTE_ORDER;
    }

    private static void setUnsignedInt32(ByteBuffer byteBuffer, int i10, long j10) {
        if (j10 >= 0 && j10 <= KeyboardMap.kValueMask) {
            byteBuffer.putInt(byteBuffer.position() + i10, (int) j10);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j10);
    }

    public static void setZipEocdCentralDirectoryOffset(ByteBuffer byteBuffer, long j10) {
        assertByteOrderLittleEndian(byteBuffer);
        setUnsignedInt32(byteBuffer, byteBuffer.position() + 16, j10);
    }
}
