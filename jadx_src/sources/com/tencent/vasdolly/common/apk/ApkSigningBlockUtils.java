package com.tencent.vasdolly.common.apk;

import com.tencent.vasdolly.common.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public class ApkSigningBlockUtils {
    public static final int ANDROID_COMMON_PAGE_ALIGNMENT_BYTES = 4096;
    public static final long APK_SIG_BLOCK_MAGIC_HI = 3617552046287187010L;
    public static final long APK_SIG_BLOCK_MAGIC_LO = 2334950737559900225L;
    public static final int APK_SIG_BLOCK_MIN_SIZE = 32;
    private static final long CONTENT_DIGESTED_CHUNK_MAX_SIZE_BYTES = 1048576;
    public static final int VERITY_PADDING_BLOCK_ID = 1114793335;

    private ApkSigningBlockUtils() {
    }

    public static void checkByteOrderLittleEndian(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static ByteBuffer findApkSignatureSchemeBlock(ByteBuffer byteBuffer, int i10) throws SignatureNotFoundException {
        checkByteOrderLittleEndian(byteBuffer);
        ByteBuffer byteBufferSliceFromTo = sliceFromTo(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i11 = 0;
        while (byteBufferSliceFromTo.hasRemaining()) {
            i11++;
            if (byteBufferSliceFromTo.remaining() < 8) {
                throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #" + i11);
            }
            long j10 = byteBufferSliceFromTo.getLong();
            if (j10 < 4 || j10 > 2147483647L) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i11 + " size out of range: " + j10);
            }
            int i12 = (int) j10;
            int iPosition = byteBufferSliceFromTo.position() + i12;
            if (i12 > byteBufferSliceFromTo.remaining()) {
                throw new SignatureNotFoundException("APK Signing Block entry #" + i11 + " size out of range: " + i12 + ", available: " + byteBufferSliceFromTo.remaining());
            }
            if (byteBufferSliceFromTo.getInt() == i10) {
                return getByteBuffer(byteBufferSliceFromTo, i12 - 4);
            }
            byteBufferSliceFromTo.position(iPosition);
        }
        throw new SignatureNotFoundException("No block with ID " + i10 + " in APK Signing Block.");
    }

    public static Pair<ByteBuffer, Long> findApkSigningBlock(RandomAccessFile randomAccessFile, long j10) throws SignatureNotFoundException, IOException {
        if (j10 < 32) {
            throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: " + j10);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j10 - ((long) byteBufferAllocate.capacity()));
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
        }
        long j11 = byteBufferAllocate.getLong(0);
        if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
            throw new SignatureNotFoundException("APK Signing Block size out of range: " + j11);
        }
        int i10 = (int) (8 + j11);
        long j12 = j10 - ((long) i10);
        if (j12 < 0) {
            throw new SignatureNotFoundException("APK Signing Block offset out of range: " + j12);
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i10);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j12);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j13 = byteBufferAllocate2.getLong(0);
        if (j13 == j11) {
            return Pair.create(byteBufferAllocate2, Long.valueOf(j12));
        }
        throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
    }

    public static SignatureInfo findSignature(RandomAccessFile randomAccessFile, int i10) throws SignatureNotFoundException, IOException {
        Pair<ByteBuffer, Long> eocd = getEocd(randomAccessFile);
        ByteBuffer first = eocd.getFirst();
        long jLongValue = eocd.getSecond().longValue();
        if (ZipUtils.isZip64EndOfCentralDirectoryLocatorPresent(randomAccessFile, jLongValue)) {
            throw new SignatureNotFoundException("ZIP64 APK not supported");
        }
        long centralDirOffset = getCentralDirOffset(first, jLongValue);
        Pair<ByteBuffer, Long> pairFindApkSigningBlock = findApkSigningBlock(randomAccessFile, centralDirOffset);
        ByteBuffer first2 = pairFindApkSigningBlock.getFirst();
        return new SignatureInfo(findApkSignatureSchemeBlock(first2, i10), pairFindApkSigningBlock.getSecond().longValue(), centralDirOffset, jLongValue, first);
    }

    public static ByteBuffer getByteBuffer(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
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

    public static long getCentralDirOffset(ByteBuffer byteBuffer, long j10) throws SignatureNotFoundException {
        long zipEocdCentralDirectoryOffset = ZipUtils.getZipEocdCentralDirectoryOffset(byteBuffer);
        if (zipEocdCentralDirectoryOffset <= j10) {
            if (ZipUtils.getZipEocdCentralDirectorySizeBytes(byteBuffer) + zipEocdCentralDirectoryOffset == j10) {
                return zipEocdCentralDirectoryOffset;
            }
            throw new SignatureNotFoundException("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        throw new SignatureNotFoundException("ZIP Central Directory offset out of range: " + zipEocdCentralDirectoryOffset + ". ZIP End of Central Directory offset: " + j10);
    }

    public static Pair<ByteBuffer, Long> getEocd(RandomAccessFile randomAccessFile) throws SignatureNotFoundException, IOException {
        Pair<ByteBuffer, Long> pairFindZipEndOfCentralDirectoryRecord = ZipUtils.findZipEndOfCentralDirectoryRecord(randomAccessFile);
        if (pairFindZipEndOfCentralDirectoryRecord != null) {
            return pairFindZipEndOfCentralDirectoryRecord;
        }
        throw new SignatureNotFoundException("Not an APK file: ZIP End of Central Directory record not found");
    }

    public static ByteBuffer sliceFromTo(ByteBuffer byteBuffer, int i10, int i11) {
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
}
