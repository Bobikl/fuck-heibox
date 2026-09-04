package com.tencent.cos.xml.model.tag.eventstreaming;

import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes4.dex */
public final class Prelude {
    static final int LENGTH = 8;
    static final int LENGTH_WITH_CRC = 12;
    private final long headersLength;
    private final int totalLength;

    private Prelude(int i10, long j10) {
        this.totalLength = i10;
        this.headersLength = j10;
    }

    private static long computePreludeCrc(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[8];
        byteBuffer.duplicate().get(bArr);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, 0, 8);
        return crc32.getValue();
    }

    static Prelude decode(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        long jComputePreludeCrc = computePreludeCrc(byteBufferDuplicate);
        long jIntToUnsignedLong = intToUnsignedLong(byteBufferDuplicate.getInt());
        long jIntToUnsignedLong2 = intToUnsignedLong(byteBufferDuplicate.getInt());
        long jIntToUnsignedLong3 = intToUnsignedLong(byteBufferDuplicate.getInt());
        if (jComputePreludeCrc != jIntToUnsignedLong3) {
            throw new IllegalArgumentException(String.format("Prelude checksum failure: expected 0x%x, computed 0x%x", Long.valueOf(jIntToUnsignedLong3), Long.valueOf(jComputePreludeCrc)));
        }
        if (jIntToUnsignedLong2 < 0 || jIntToUnsignedLong2 > 131072) {
            throw new IllegalArgumentException("Illegal headers_length value: " + jIntToUnsignedLong2);
        }
        long j10 = (jIntToUnsignedLong - jIntToUnsignedLong2) - 16;
        if (j10 >= 0 && j10 <= 16777216) {
            return new Prelude(toIntExact(jIntToUnsignedLong), jIntToUnsignedLong2);
        }
        throw new IllegalArgumentException("Illegal payload size: " + j10);
    }

    private static long intToUnsignedLong(int i10) {
        return ((long) i10) & KeyboardMap.kValueMask;
    }

    private static int toIntExact(long j10) {
        int i10 = (int) j10;
        if (i10 == j10) {
            return i10;
        }
        throw new ArithmeticException("integer overflow");
    }

    long getHeadersLength() {
        return this.headersLength;
    }

    int getTotalLength() {
        return this.totalLength;
    }
}
